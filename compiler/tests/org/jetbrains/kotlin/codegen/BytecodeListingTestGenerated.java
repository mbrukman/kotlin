/*
 * Copyright 2010-2016 JetBrains s.r.o.
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

package org.jetbrains.kotlin.codegen;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/codegen/bytecodeListing")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class BytecodeListingTestGenerated extends AbstractBytecodeListingTest {
    public void testAllFilesPresentInBytecodeListing() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/bytecodeListing"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("callableNameIntrinsic.kt")
    public void testCallableNameIntrinsic() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/callableNameIntrinsic.kt");
        doTest(fileName);
    }

    @TestMetadata("defaultImpls.kt")
    public void testDefaultImpls() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/defaultImpls.kt");
        doTest(fileName);
    }

    @TestMetadata("emptyMultifileFacade.kt")
    public void testEmptyMultifileFacade() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/emptyMultifileFacade.kt");
        doTest(fileName);
    }

    @TestMetadata("immutableCollection.kt")
    public void testImmutableCollection() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/immutableCollection.kt");
        doTest(fileName);
    }

    @TestMetadata("inlineOnly.kt")
    public void testInlineOnly() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/inlineOnly.kt");
        doTest(fileName);
    }

    @TestMetadata("InlineOnlyMultifile.kt")
    public void testInlineOnlyMultifile() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/InlineOnlyMultifile.kt");
        doTest(fileName);
    }

    @TestMetadata("noCollectionStubMethodsInInterface.kt")
    public void testNoCollectionStubMethodsInInterface() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/noCollectionStubMethodsInInterface.kt");
        doTest(fileName);
    }

    @TestMetadata("samAdapterAndInlinedOne.kt")
    public void testSamAdapterAndInlinedOne() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/samAdapterAndInlinedOne.kt");
        doTest(fileName);
    }

    @TestMetadata("compiler/testData/codegen/bytecodeListing/annotations")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Annotations extends AbstractBytecodeListingTest {
        public void testAllFilesPresentInAnnotations() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/bytecodeListing/annotations"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("defaultTargets.kt")
        public void testDefaultTargets() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/annotations/defaultTargets.kt");
            doTest(fileName);
        }

        @TestMetadata("JvmSynthetic.kt")
        public void testJvmSynthetic() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/annotations/JvmSynthetic.kt");
            doTest(fileName);
        }

        @TestMetadata("kt9320.kt")
        public void testKt9320() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/annotations/kt9320.kt");
            doTest(fileName);
        }

        @TestMetadata("literals.kt")
        public void testLiterals() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/annotations/literals.kt");
            doTest(fileName);
        }

        @TestMetadata("onProperties.kt")
        public void testOnProperties() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/annotations/onProperties.kt");
            doTest(fileName);
        }

        @TestMetadata("onReceiver.kt")
        public void testOnReceiver() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/annotations/onReceiver.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/codegen/bytecodeListing/specialBridges")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class SpecialBridges extends AbstractBytecodeListingTest {
        public void testAllFilesPresentInSpecialBridges() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/bytecodeListing/specialBridges"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("contains.kt")
        public void testContains() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/specialBridges/contains.kt");
            doTest(fileName);
        }

        @TestMetadata("removeAtTwoSpecialBridges.kt")
        public void testRemoveAtTwoSpecialBridges() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/specialBridges/removeAtTwoSpecialBridges.kt");
            doTest(fileName);
        }
    }
}
