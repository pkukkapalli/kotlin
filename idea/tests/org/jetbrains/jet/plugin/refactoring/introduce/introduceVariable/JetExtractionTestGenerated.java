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

package org.jetbrains.jet.plugin.refactoring.introduce.introduceVariable;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import java.util.regex.Pattern;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.plugin.refactoring.introduce.introduceVariable.AbstractJetExtractionTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@InnerTestClasses({JetExtractionTestGenerated.IntroduceVariable.class, JetExtractionTestGenerated.ExtractFunction.class})
public class JetExtractionTestGenerated extends AbstractJetExtractionTest {
    @TestMetadata("idea/testData/refactoring/introduceVariable")
    public static class IntroduceVariable extends AbstractJetExtractionTest {
        public void testAllFilesPresentInIntroduceVariable() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/refactoring/introduceVariable"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("ArrayAccessExpr.kt")
        public void testArrayAccessExpr() throws Exception {
            doIntroduceVariableTest("idea/testData/refactoring/introduceVariable/ArrayAccessExpr.kt");
        }
        
        @TestMetadata("ClassBody.kt")
        public void testClassBody() throws Exception {
            doIntroduceVariableTest("idea/testData/refactoring/introduceVariable/ClassBody.kt");
        }
        
        @TestMetadata("DoWhileAddBlock.kt")
        public void testDoWhileAddBlock() throws Exception {
            doIntroduceVariableTest("idea/testData/refactoring/introduceVariable/DoWhileAddBlock.kt");
        }
        
        @TestMetadata("DoWhileAddBlockInner.kt")
        public void testDoWhileAddBlockInner() throws Exception {
            doIntroduceVariableTest("idea/testData/refactoring/introduceVariable/DoWhileAddBlockInner.kt");
        }
        
        @TestMetadata("FewOccurrences.kt")
        public void testFewOccurrences() throws Exception {
            doIntroduceVariableTest("idea/testData/refactoring/introduceVariable/FewOccurrences.kt");
        }
        
        @TestMetadata("FunctionAddBlock.kt")
        public void testFunctionAddBlock() throws Exception {
            doIntroduceVariableTest("idea/testData/refactoring/introduceVariable/FunctionAddBlock.kt");
        }
        
        @TestMetadata("FunctionAddBlockInner.kt")
        public void testFunctionAddBlockInner() throws Exception {
            doIntroduceVariableTest("idea/testData/refactoring/introduceVariable/FunctionAddBlockInner.kt");
        }
        
        @TestMetadata("FunctionLiteral.kt")
        public void testFunctionLiteral() throws Exception {
            doIntroduceVariableTest("idea/testData/refactoring/introduceVariable/FunctionLiteral.kt");
        }
        
        @TestMetadata("FunctionLiteralFromExpected.kt")
        public void testFunctionLiteralFromExpected() throws Exception {
            doIntroduceVariableTest("idea/testData/refactoring/introduceVariable/FunctionLiteralFromExpected.kt");
        }
        
        @TestMetadata("IfCondition.kt")
        public void testIfCondition() throws Exception {
            doIntroduceVariableTest("idea/testData/refactoring/introduceVariable/IfCondition.kt");
        }
        
        @TestMetadata("IfElseAddBlock.kt")
        public void testIfElseAddBlock() throws Exception {
            doIntroduceVariableTest("idea/testData/refactoring/introduceVariable/IfElseAddBlock.kt");
        }
        
        @TestMetadata("IfElseAddBlockInner.kt")
        public void testIfElseAddBlockInner() throws Exception {
            doIntroduceVariableTest("idea/testData/refactoring/introduceVariable/IfElseAddBlockInner.kt");
        }
        
        @TestMetadata("IfThenAddBlock.kt")
        public void testIfThenAddBlock() throws Exception {
            doIntroduceVariableTest("idea/testData/refactoring/introduceVariable/IfThenAddBlock.kt");
        }
        
        @TestMetadata("IfThenAddBlockInner.kt")
        public void testIfThenAddBlockInner() throws Exception {
            doIntroduceVariableTest("idea/testData/refactoring/introduceVariable/IfThenAddBlockInner.kt");
        }
        
        @TestMetadata("It.kt")
        public void testIt() throws Exception {
            doIntroduceVariableTest("idea/testData/refactoring/introduceVariable/It.kt");
        }
        
        @TestMetadata("LoopRange.kt")
        public void testLoopRange() throws Exception {
            doIntroduceVariableTest("idea/testData/refactoring/introduceVariable/LoopRange.kt");
        }
        
        @TestMetadata("ManyInnerOccurences.kt")
        public void testManyInnerOccurences() throws Exception {
            doIntroduceVariableTest("idea/testData/refactoring/introduceVariable/ManyInnerOccurences.kt");
        }
        
        @TestMetadata("ManyOccurrences.kt")
        public void testManyOccurrences() throws Exception {
            doIntroduceVariableTest("idea/testData/refactoring/introduceVariable/ManyOccurrences.kt");
        }
        
        @TestMetadata("nonEquivalentReceivers.kt")
        public void testNonEquivalentReceivers() throws Exception {
            doIntroduceVariableTest("idea/testData/refactoring/introduceVariable/nonEquivalentReceivers.kt");
        }
        
        @TestMetadata("ReplaceOccurence.kt")
        public void testReplaceOccurence() throws Exception {
            doIntroduceVariableTest("idea/testData/refactoring/introduceVariable/ReplaceOccurence.kt");
        }
        
        @TestMetadata("Simple.kt")
        public void testSimple() throws Exception {
            doIntroduceVariableTest("idea/testData/refactoring/introduceVariable/Simple.kt");
        }
        
        @TestMetadata("SimpleCreateValue.kt")
        public void testSimpleCreateValue() throws Exception {
            doIntroduceVariableTest("idea/testData/refactoring/introduceVariable/SimpleCreateValue.kt");
        }
        
        @TestMetadata("StringInjection.kt")
        public void testStringInjection() throws Exception {
            doIntroduceVariableTest("idea/testData/refactoring/introduceVariable/StringInjection.kt");
        }
        
        @TestMetadata("WhenAddBlock.kt")
        public void testWhenAddBlock() throws Exception {
            doIntroduceVariableTest("idea/testData/refactoring/introduceVariable/WhenAddBlock.kt");
        }
        
        @TestMetadata("WhenAddBlockInner.kt")
        public void testWhenAddBlockInner() throws Exception {
            doIntroduceVariableTest("idea/testData/refactoring/introduceVariable/WhenAddBlockInner.kt");
        }
        
        @TestMetadata("WhenParts.kt")
        public void testWhenParts() throws Exception {
            doIntroduceVariableTest("idea/testData/refactoring/introduceVariable/WhenParts.kt");
        }
        
        @TestMetadata("WhileAddBlock.kt")
        public void testWhileAddBlock() throws Exception {
            doIntroduceVariableTest("idea/testData/refactoring/introduceVariable/WhileAddBlock.kt");
        }
        
        @TestMetadata("WhileAddBlockInner.kt")
        public void testWhileAddBlockInner() throws Exception {
            doIntroduceVariableTest("idea/testData/refactoring/introduceVariable/WhileAddBlockInner.kt");
        }
        
        @TestMetadata("WhileCondition.kt")
        public void testWhileCondition() throws Exception {
            doIntroduceVariableTest("idea/testData/refactoring/introduceVariable/WhileCondition.kt");
        }
        
    }
    
    @TestMetadata("idea/testData/refactoring/extractFunction")
    @InnerTestClasses({ExtractFunction.Basic.class, ExtractFunction.ControlFlow.class, ExtractFunction.Parameters.class})
    public static class ExtractFunction extends AbstractJetExtractionTest {
        public void testAllFilesPresentInExtractFunction() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/refactoring/extractFunction"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("idea/testData/refactoring/extractFunction/basic")
        public static class Basic extends AbstractJetExtractionTest {
            public void testAllFilesPresentInBasic() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/refactoring/extractFunction/basic"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("localClassFunctionRef.kt")
            public void testLocalClassFunctionRef() throws Exception {
                doExtractFunctionTest("idea/testData/refactoring/extractFunction/basic/localClassFunctionRef.kt");
            }
            
            @TestMetadata("localClassPropertyRef.kt")
            public void testLocalClassPropertyRef() throws Exception {
                doExtractFunctionTest("idea/testData/refactoring/extractFunction/basic/localClassPropertyRef.kt");
            }
            
            @TestMetadata("localFunctionRef.kt")
            public void testLocalFunctionRef() throws Exception {
                doExtractFunctionTest("idea/testData/refactoring/extractFunction/basic/localFunctionRef.kt");
            }
            
            @TestMetadata("malformedExpression.kt")
            public void testMalformedExpression() throws Exception {
                doExtractFunctionTest("idea/testData/refactoring/extractFunction/basic/malformedExpression.kt");
            }
            
            @TestMetadata("malformedStatements.kt")
            public void testMalformedStatements() throws Exception {
                doExtractFunctionTest("idea/testData/refactoring/extractFunction/basic/malformedStatements.kt");
            }
            
            @TestMetadata("misdirectedRef.kt")
            public void testMisdirectedRef() throws Exception {
                doExtractFunctionTest("idea/testData/refactoring/extractFunction/basic/misdirectedRef.kt");
            }
            
            @TestMetadata("privateMemberRef.kt")
            public void testPrivateMemberRef() throws Exception {
                doExtractFunctionTest("idea/testData/refactoring/extractFunction/basic/privateMemberRef.kt");
            }
            
            @TestMetadata("refInReturn.kt")
            public void testRefInReturn() throws Exception {
                doExtractFunctionTest("idea/testData/refactoring/extractFunction/basic/refInReturn.kt");
            }
            
        }
        
        @TestMetadata("idea/testData/refactoring/extractFunction/controlFlow")
        @InnerTestClasses({ControlFlow.ConditionalJumps.class, ControlFlow.Default.class, ControlFlow.DefiniteReturns.class, ControlFlow.EvaluateExpression.class, ControlFlow.OutputValues.class, ControlFlow.Unextractable.class})
        public static class ControlFlow extends AbstractJetExtractionTest {
            public void testAllFilesPresentInControlFlow() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/refactoring/extractFunction/controlFlow"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("idea/testData/refactoring/extractFunction/controlFlow/conditionalJumps")
            public static class ConditionalJumps extends AbstractJetExtractionTest {
                public void testAllFilesPresentInConditionalJumps() throws Exception {
                    JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/refactoring/extractFunction/controlFlow/conditionalJumps"), Pattern.compile("^(.+)\\.kt$"), true);
                }
                
                @TestMetadata("conditionalBreakWithIf.kt")
                public void testConditionalBreakWithIf() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/controlFlow/conditionalJumps/conditionalBreakWithIf.kt");
                }
                
                @TestMetadata("conditionalBreakWithIfElse.kt")
                public void testConditionalBreakWithIfElse() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/controlFlow/conditionalJumps/conditionalBreakWithIfElse.kt");
                }
                
                @TestMetadata("conditionalBreakWithWhen.kt")
                public void testConditionalBreakWithWhen() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/controlFlow/conditionalJumps/conditionalBreakWithWhen.kt");
                }
                
                @TestMetadata("conditionalReturnWithIf.kt")
                public void testConditionalReturnWithIf() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/controlFlow/conditionalJumps/conditionalReturnWithIf.kt");
                }
                
                @TestMetadata("conditionalReturnWithIfElse.kt")
                public void testConditionalReturnWithIfElse() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/controlFlow/conditionalJumps/conditionalReturnWithIfElse.kt");
                }
                
                @TestMetadata("conditionalReturnWithWhen.kt")
                public void testConditionalReturnWithWhen() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/controlFlow/conditionalJumps/conditionalReturnWithWhen.kt");
                }
                
                @TestMetadata("unconditionalBreakWithIf.kt")
                public void testUnconditionalBreakWithIf() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/controlFlow/conditionalJumps/unconditionalBreakWithIf.kt");
                }
                
                @TestMetadata("unconditionalBreakWithIfElse.kt")
                public void testUnconditionalBreakWithIfElse() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/controlFlow/conditionalJumps/unconditionalBreakWithIfElse.kt");
                }
                
                @TestMetadata("unconditionalBreakWithWhen.kt")
                public void testUnconditionalBreakWithWhen() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/controlFlow/conditionalJumps/unconditionalBreakWithWhen.kt");
                }
                
            }
            
            @TestMetadata("idea/testData/refactoring/extractFunction/controlFlow/default")
            public static class Default extends AbstractJetExtractionTest {
                public void testAllFilesPresentInDefault() throws Exception {
                    JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/refactoring/extractFunction/controlFlow/default"), Pattern.compile("^(.+)\\.kt$"), true);
                }
                
                @TestMetadata("defaultCF.kt")
                public void testDefaultCF() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/controlFlow/default/defaultCF.kt");
                }
                
                @TestMetadata("defaultCFWithJumps.kt")
                public void testDefaultCFWithJumps() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/controlFlow/default/defaultCFWithJumps.kt");
                }
                
            }
            
            @TestMetadata("idea/testData/refactoring/extractFunction/controlFlow/definiteReturns")
            public static class DefiniteReturns extends AbstractJetExtractionTest {
                public void testAllFilesPresentInDefiniteReturns() throws Exception {
                    JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/refactoring/extractFunction/controlFlow/definiteReturns"), Pattern.compile("^(.+)\\.kt$"), true);
                }
                
                @TestMetadata("definiteReturnWithIf.kt")
                public void testDefiniteReturnWithIf() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/controlFlow/definiteReturns/definiteReturnWithIf.kt");
                }
                
                @TestMetadata("definiteReturnWithWhen.kt")
                public void testDefiniteReturnWithWhen() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/controlFlow/definiteReturns/definiteReturnWithWhen.kt");
                }
                
                @TestMetadata("singleDefiniteReturn.kt")
                public void testSingleDefiniteReturn() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/controlFlow/definiteReturns/singleDefiniteReturn.kt");
                }
                
            }
            
            @TestMetadata("idea/testData/refactoring/extractFunction/controlFlow/evaluateExpression")
            public static class EvaluateExpression extends AbstractJetExtractionTest {
                public void testAllFilesPresentInEvaluateExpression() throws Exception {
                    JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/refactoring/extractFunction/controlFlow/evaluateExpression"), Pattern.compile("^(.+)\\.kt$"), true);
                }
                
                @TestMetadata("evalExprInIf.kt")
                public void testEvalExprInIf() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/controlFlow/evaluateExpression/evalExprInIf.kt");
                }
                
                @TestMetadata("evalExprInWhen.kt")
                public void testEvalExprInWhen() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/controlFlow/evaluateExpression/evalExprInWhen.kt");
                }
                
                @TestMetadata("simpleEvalExpr.kt")
                public void testSimpleEvalExpr() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/controlFlow/evaluateExpression/simpleEvalExpr.kt");
                }
                
            }
            
            @TestMetadata("idea/testData/refactoring/extractFunction/controlFlow/outputValues")
            public static class OutputValues extends AbstractJetExtractionTest {
                public void testAllFilesPresentInOutputValues() throws Exception {
                    JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/refactoring/extractFunction/controlFlow/outputValues"), Pattern.compile("^(.+)\\.kt$"), true);
                }
                
                @TestMetadata("multipleOutputValues.kt")
                public void testMultipleOutputValues() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/controlFlow/outputValues/multipleOutputValues.kt");
                }
                
                @TestMetadata("multipleOutputValuesWithIf.kt")
                public void testMultipleOutputValuesWithIf() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/controlFlow/outputValues/multipleOutputValuesWithIf.kt");
                }
                
                @TestMetadata("multipleOutputValuesWithWhen.kt")
                public void testMultipleOutputValuesWithWhen() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/controlFlow/outputValues/multipleOutputValuesWithWhen.kt");
                }
                
                @TestMetadata("singleOutputValue.kt")
                public void testSingleOutputValue() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/controlFlow/outputValues/singleOutputValue.kt");
                }
                
                @TestMetadata("singleOutputValueWithIf.kt")
                public void testSingleOutputValueWithIf() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/controlFlow/outputValues/singleOutputValueWithIf.kt");
                }
                
                @TestMetadata("singleOutputValueWithIfElse.kt")
                public void testSingleOutputValueWithIfElse() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/controlFlow/outputValues/singleOutputValueWithIfElse.kt");
                }
                
                @TestMetadata("singleOutputValueWithWhen.kt")
                public void testSingleOutputValueWithWhen() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/controlFlow/outputValues/singleOutputValueWithWhen.kt");
                }
                
                @TestMetadata("singleOutputValueWithWhenElse.kt")
                public void testSingleOutputValueWithWhenElse() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/controlFlow/outputValues/singleOutputValueWithWhenElse.kt");
                }
                
            }
            
            @TestMetadata("idea/testData/refactoring/extractFunction/controlFlow/unextractable")
            public static class Unextractable extends AbstractJetExtractionTest {
                public void testAllFilesPresentInUnextractable() throws Exception {
                    JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/refactoring/extractFunction/controlFlow/unextractable"), Pattern.compile("^(.+)\\.kt$"), true);
                }
                
                @TestMetadata("anonymousObject.kt")
                public void testAnonymousObject() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/controlFlow/unextractable/anonymousObject.kt");
                }
                
                @TestMetadata("evalExpressionWithReturn.kt")
                public void testEvalExpressionWithReturn() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/controlFlow/unextractable/evalExpressionWithReturn.kt");
                }
                
                @TestMetadata("evalExpressionWithThrow.kt")
                public void testEvalExpressionWithThrow() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/controlFlow/unextractable/evalExpressionWithThrow.kt");
                }
                
                @TestMetadata("jumpsAndReturns.kt")
                public void testJumpsAndReturns() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/controlFlow/unextractable/jumpsAndReturns.kt");
                }
                
                @TestMetadata("multipleJumps.kt")
                public void testMultipleJumps() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/controlFlow/unextractable/multipleJumps.kt");
                }
                
                @TestMetadata("multipleReturnsWithDefault.kt")
                public void testMultipleReturnsWithDefault() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/controlFlow/unextractable/multipleReturnsWithDefault.kt");
                }
                
                @TestMetadata("outputValueWithExpression.kt")
                public void testOutputValueWithExpression() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/controlFlow/unextractable/outputValueWithExpression.kt");
                }
                
                @TestMetadata("outputValueWithReturn.kt")
                public void testOutputValueWithReturn() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/controlFlow/unextractable/outputValueWithReturn.kt");
                }
                
                @TestMetadata("outputValueWithThrow.kt")
                public void testOutputValueWithThrow() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/controlFlow/unextractable/outputValueWithThrow.kt");
                }
                
                @TestMetadata("variablesOutOfScope.kt")
                public void testVariablesOutOfScope() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/controlFlow/unextractable/variablesOutOfScope.kt");
                }
                
            }
            
            public static Test innerSuite() {
                TestSuite suite = new TestSuite("ControlFlow");
                suite.addTestSuite(ControlFlow.class);
                suite.addTestSuite(ConditionalJumps.class);
                suite.addTestSuite(Default.class);
                suite.addTestSuite(DefiniteReturns.class);
                suite.addTestSuite(EvaluateExpression.class);
                suite.addTestSuite(OutputValues.class);
                suite.addTestSuite(Unextractable.class);
                return suite;
            }
        }
        
        @TestMetadata("idea/testData/refactoring/extractFunction/parameters")
        @InnerTestClasses({Parameters.ExtractSuper.class, Parameters.ExtractThis.class, Parameters.Misc.class, Parameters.NonDenotableTypes.class})
        public static class Parameters extends AbstractJetExtractionTest {
            public void testAllFilesPresentInParameters() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/refactoring/extractFunction/parameters"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("idea/testData/refactoring/extractFunction/parameters/extractSuper")
            public static class ExtractSuper extends AbstractJetExtractionTest {
                public void testAllFilesPresentInExtractSuper() throws Exception {
                    JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/refactoring/extractFunction/parameters/extractSuper"), Pattern.compile("^(.+)\\.kt$"), true);
                }
                
                @TestMetadata("labeledSuperPropertyCall.kt")
                public void testLabeledSuperPropertyCall() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/parameters/extractSuper/labeledSuperPropertyCall.kt");
                }
                
                @TestMetadata("superFunctionCall.kt")
                public void testSuperFunctionCall() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/parameters/extractSuper/superFunctionCall.kt");
                }
                
                @TestMetadata("superLabeledFunctionCall.kt")
                public void testSuperLabeledFunctionCall() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/parameters/extractSuper/superLabeledFunctionCall.kt");
                }
                
                @TestMetadata("superPropertyCall.kt")
                public void testSuperPropertyCall() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/parameters/extractSuper/superPropertyCall.kt");
                }
                
            }
            
            @TestMetadata("idea/testData/refactoring/extractFunction/parameters/extractThis")
            public static class ExtractThis extends AbstractJetExtractionTest {
                public void testAllFilesPresentInExtractThis() throws Exception {
                    JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/refactoring/extractFunction/parameters/extractThis"), Pattern.compile("^(.+)\\.kt$"), true);
                }
                
                @TestMetadata("explicitLabeledThisInMember.kt")
                public void testExplicitLabeledThisInMember() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/parameters/extractThis/explicitLabeledThisInMember.kt");
                }
                
                @TestMetadata("explicitThisInExtension.kt")
                public void testExplicitThisInExtension() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/parameters/extractThis/explicitThisInExtension.kt");
                }
                
                @TestMetadata("explicitThisInMember.kt")
                public void testExplicitThisInMember() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/parameters/extractThis/explicitThisInMember.kt");
                }
                
                @TestMetadata("implicitAndExplicitLabeledThisInMember.kt")
                public void testImplicitAndExplicitLabeledThisInMember() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/parameters/extractThis/implicitAndExplicitLabeledThisInMember.kt");
                }
                
                @TestMetadata("implicitAndExplicitThisInExtension.kt")
                public void testImplicitAndExplicitThisInExtension() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/parameters/extractThis/implicitAndExplicitThisInExtension.kt");
                }
                
                @TestMetadata("implicitThisInExtension.kt")
                public void testImplicitThisInExtension() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/parameters/extractThis/implicitThisInExtension.kt");
                }
                
                @TestMetadata("implicitThisInMember.kt")
                public void testImplicitThisInMember() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/parameters/extractThis/implicitThisInMember.kt");
                }
                
            }
            
            @TestMetadata("idea/testData/refactoring/extractFunction/parameters/misc")
            public static class Misc extends AbstractJetExtractionTest {
                public void testAllFilesPresentInMisc() throws Exception {
                    JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/refactoring/extractFunction/parameters/misc"), Pattern.compile("^(.+)\\.kt$"), true);
                }
                
                @TestMetadata("classObject.kt")
                public void testClassObject() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/parameters/misc/classObject.kt");
                }
                
                @TestMetadata("innerClassObject.kt")
                public void testInnerClassObject() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/parameters/misc/innerClassObject.kt");
                }
                
                @TestMetadata("multipleOccurrences.kt")
                public void testMultipleOccurrences() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/parameters/misc/multipleOccurrences.kt");
                }
                
                @TestMetadata("usagesInCallArgs.kt")
                public void testUsagesInCallArgs() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/parameters/misc/usagesInCallArgs.kt");
                }
                
            }
            
            @TestMetadata("idea/testData/refactoring/extractFunction/parameters/nonDenotableTypes")
            public static class NonDenotableTypes extends AbstractJetExtractionTest {
                public void testAllFilesPresentInNonDenotableTypes() throws Exception {
                    JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/refactoring/extractFunction/parameters/nonDenotableTypes"), Pattern.compile("^(.+)\\.kt$"), true);
                }
                
                @TestMetadata("anonymousObject.kt")
                public void testAnonymousObject() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/parameters/nonDenotableTypes/anonymousObject.kt");
                }
                
                @TestMetadata("localClass.kt")
                public void testLocalClass() throws Exception {
                    doExtractFunctionTest("idea/testData/refactoring/extractFunction/parameters/nonDenotableTypes/localClass.kt");
                }
                
            }
            
            public static Test innerSuite() {
                TestSuite suite = new TestSuite("Parameters");
                suite.addTestSuite(Parameters.class);
                suite.addTestSuite(ExtractSuper.class);
                suite.addTestSuite(ExtractThis.class);
                suite.addTestSuite(Misc.class);
                suite.addTestSuite(NonDenotableTypes.class);
                return suite;
            }
        }
        
        public static Test innerSuite() {
            TestSuite suite = new TestSuite("ExtractFunction");
            suite.addTestSuite(ExtractFunction.class);
            suite.addTestSuite(Basic.class);
            suite.addTest(ControlFlow.innerSuite());
            suite.addTest(Parameters.innerSuite());
            return suite;
        }
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("JetExtractionTestGenerated");
        suite.addTestSuite(IntroduceVariable.class);
        suite.addTest(ExtractFunction.innerSuite());
        return suite;
    }
}
