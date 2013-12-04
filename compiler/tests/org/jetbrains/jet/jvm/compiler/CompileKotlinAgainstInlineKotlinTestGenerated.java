/*
 * Copyright 2010-2013 JetBrains s.r.o.
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

package org.jetbrains.jet.jvm.compiler;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import java.util.regex.Pattern;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.jvm.compiler.AbstractCompileKotlinAgainstKotlinTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.GenerateTests}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/codegen/boxInline")
public class CompileKotlinAgainstInlineKotlinTestGenerated extends AbstractCompileKotlinAgainstKotlinTest {
    public void testAllFilesPresentInBoxInline() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/codegen/boxInline"), Pattern.compile("^(.+)$"), false);
    }
    
    @TestMetadata("captureInlinable")
    public void testCaptureInlinable() throws Exception {
        doBoxTest("compiler/testData/codegen/boxInline/captureInlinable");
    }
    
    @TestMetadata("captureThisAndReceiver")
    public void testCaptureThisAndReceiver() throws Exception {
        doBoxTest("compiler/testData/codegen/boxInline/captureThisAndReceiver");
    }
    
    @TestMetadata("closureChain")
    public void testClosureChain() throws Exception {
        doBoxTest("compiler/testData/codegen/boxInline/closureChain");
    }
    
    @TestMetadata("cycles")
    public void testCycles() throws Exception {
        doBoxTest("compiler/testData/codegen/boxInline/cycles");
    }
    
    @TestMetadata("differentObjects")
    public void testDifferentObjects() throws Exception {
        doBoxTest("compiler/testData/codegen/boxInline/differentObjects");
    }
    
    @TestMetadata("extension")
    public void testExtension() throws Exception {
        doBoxTest("compiler/testData/codegen/boxInline/extension");
    }
    
    @TestMetadata("inlineChain")
    public void testInlineChain() throws Exception {
        doBoxTest("compiler/testData/codegen/boxInline/inlineChain");
    }
    
    @TestMetadata("namespace")
    public void testNamespace() throws Exception {
        doBoxTest("compiler/testData/codegen/boxInline/namespace");
    }
    
    @TestMetadata("noInline")
    public void testNoInline() throws Exception {
        doBoxTest("compiler/testData/codegen/boxInline/noInline");
    }
    
    @TestMetadata("params")
    public void testParams() throws Exception {
        doBoxTest("compiler/testData/codegen/boxInline/params");
    }
    
    @TestMetadata("severalClosures")
    public void testSeveralClosures() throws Exception {
        doBoxTest("compiler/testData/codegen/boxInline/severalClosures");
    }
    
    @TestMetadata("severalUsage")
    public void testSeveralUsage() throws Exception {
        doBoxTest("compiler/testData/codegen/boxInline/severalUsage");
    }
    
    @TestMetadata("simpleDouble")
    public void testSimpleDouble() throws Exception {
        doBoxTest("compiler/testData/codegen/boxInline/simpleDouble");
    }
    
    @TestMetadata("simpleInt")
    public void testSimpleInt() throws Exception {
        doBoxTest("compiler/testData/codegen/boxInline/simpleInt");
    }
    
    @TestMetadata("simpleObject")
    public void testSimpleObject() throws Exception {
        doBoxTest("compiler/testData/codegen/boxInline/simpleObject");
    }
    
    @TestMetadata("tryCatchFinally")
    public void testTryCatchFinally() throws Exception {
        doBoxTest("compiler/testData/codegen/boxInline/tryCatchFinally");
    }
    
    @TestMetadata("withoutInline")
    public void testWithoutInline() throws Exception {
        doBoxTest("compiler/testData/codegen/boxInline/withoutInline");
    }
    
}
