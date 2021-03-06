/*
 * Copyright 2010-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.codegen;

import com.intellij.openapi.util.text.StringUtil;
import groovyjarjarasm.asm.Opcodes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.asm4.*;
import org.jetbrains.asm4.tree.MethodNode;
import org.jetbrains.jet.OutputFile;
import org.jetbrains.jet.lang.resolve.java.JvmAbi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InlineTestUtil {

    public static final String INLINE_ANNOTATION_CLASS = "kotlin/inline";

    public static void checkNoCallsToInline(List<OutputFile> files) {
        //final HashMap<Type> inlineMethods = new HashMap();
        Set<MethodInfo> inlinedMethods = collectInlineMethods(files);
        assert !inlinedMethods.isEmpty() : "There is no any inline method";

        List<NotInlinedCall> notInlinedCalls = checkInlineNotInvoked(files, inlinedMethods);
        assert notInlinedCalls.isEmpty() : "All inline methods should be inlined but " + StringUtil.join(notInlinedCalls, "\n");
    }

    private static Set<MethodInfo> collectInlineMethods(List<OutputFile> files) {
        final Set<MethodInfo> inlineMethods = new HashSet<MethodInfo>();

        for (OutputFile file : files) {
            ClassReader cr = new ClassReader(file.asByteArray());
            final String[] className = {null};

            cr.accept(new ClassVisitor(Opcodes.ASM4) {

                @Override
                public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
                    className[0] = name;
                    super.visit(version, access, name, signature, superName, interfaces);
                }

                @Override
                public MethodVisitor visitMethod(
                        int access, String name, String desc, String signature, String[] exceptions
                ) {
                    return new MethodNode(Opcodes.ASM4, access, name, desc, signature, exceptions) {
                        @Override
                        public AnnotationVisitor visitAnnotation(String desc, boolean visible) {
                            Type type = Type.getType(desc);
                            String annotationClass = type.getInternalName();
                            if (INLINE_ANNOTATION_CLASS.equals(annotationClass)) {
                                inlineMethods.add(new MethodInfo(className[0], name, this.desc));
                            }
                            return super.visitAnnotation(desc, visible);
                        }
                    };
                }
            }, 0);

        }
        return inlineMethods;
    }

    private static List<NotInlinedCall> checkInlineNotInvoked(List<OutputFile> files, final Set<MethodInfo> inlinedMethods) {
        final List<NotInlinedCall> notInlined = new ArrayList<NotInlinedCall>();
        for (OutputFile file : files) {
            ClassReader cr = new ClassReader(file.asByteArray());

            final String[] className = {null};
            cr.accept(new ClassVisitor(Opcodes.ASM4) {

                @Override
                public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
                    className[0] = name;
                    super.visit(version, access, name, signature, superName, interfaces);
                }

                @Override
                public MethodVisitor visitMethod(
                        int access, String name, String desc, String signature, String[] exceptions
                ) {
                    return new MethodNode(Opcodes.ASM4, access, name, desc, signature, exceptions) {

                        @Override
                        public void visitMethodInsn(int opcode, String owner, String name, String desc) {
                            MethodInfo methodCall = new MethodInfo(owner, name, desc);
                            if (inlinedMethods.contains(methodCall)) {
                                MethodInfo fromCall = new MethodInfo(className[0], this.name, this.desc);
                                //skip facades
                                if (methodCall.owner.startsWith(fromCall.owner + "-")) {
                                    return;
                                }

                                //skip delegation to trait impl from child class
                                if (methodCall.owner.endsWith(JvmAbi.TRAIT_IMPL_SUFFIX) && !fromCall.owner.equals(methodCall.owner)) {
                                    return;
                                }
                                notInlined.add(new NotInlinedCall(fromCall, methodCall));
                            }
                        }
                    };
                }
            }, 0);

        }
        return notInlined;
    }

    public static class NotInlinedCall {

        public final MethodInfo fromCall;
        public final MethodInfo inlineMethod;

        public NotInlinedCall(MethodInfo call, MethodInfo method) {
            fromCall = call;
            inlineMethod = method;
        }

        @Override
        public String toString() {
            return "NotInlinedCall{" +
                   "fromCall=" + fromCall +
                   ", inlineMethod=" + inlineMethod +
                   '}';
        }
    }

    public static class MethodInfo {

        private final String owner;
        private final String name;
        private final String desc;

        public MethodInfo(@NotNull String owner, @NotNull String name, @NotNull String desc) {
            this.owner = owner;
            this.name = name;
            this.desc = desc;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MethodInfo method = (MethodInfo) o;

            if (!desc.equals(method.desc)) return false;
            if (!name.equals(method.name)) return false;
            if (!owner.equals(method.owner)) return false;

            return true;
        }

        @Override
        public int hashCode() {
            int result = owner.hashCode();
            result = 31 * result + name.hashCode();
            result = 31 * result + desc.hashCode();
            return result;
        }

        @Override
        public String toString() {
            return "MethodInfo{" +
                   "owner='" + owner + '\'' +
                   ", name='" + name + '\'' +
                   ", desc='" + desc + '\'' +
                   '}';
        }
    }
}
