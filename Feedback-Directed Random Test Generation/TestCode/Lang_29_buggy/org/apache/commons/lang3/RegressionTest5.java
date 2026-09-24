package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test02501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02501");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("hi!", "TH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02502");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", ":", "\n", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02503");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("26.6.2", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02504");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "/", "https://github.com/Homebrew/homebrew-core/issues", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02505");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/", "55.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02506");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "Mac OS X", "11.0.32.1+0", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02507");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "11", "TH", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02508");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("TH", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02509");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "55.0", "11", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02510");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "TH", "sun.lwawt.macosx.CPrinterJob", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02511");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "mixed mode", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02512");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "11.0.32.1", "OpenJDK Runtime Environment", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02513");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "\n", "/", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02514");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "mixed mode", "", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02515");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "", "UTF-8", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02516");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.awt.CGraphicsEnvironment", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02517");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("OpenJDK 64-Bit Server VM", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02518");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "Java Virtual Machine Specification", "", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02519");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11.0.32.1+0", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02520");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.lwawt.macosx.CPrinterJob", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02521");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("TH", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02522");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "OpenJDK 64-Bit Server VM", "mixed mode", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02523");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "\n", "\n", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02524");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("11.0.32.1", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02525");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "hi!", ":", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02526");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "11.0.32.1", "", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02527");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("th", "11");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02528");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11.0.32.1", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02529");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Mac OS X", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02530");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "aarch64", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02531");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02532");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("https://github.com/Homebrew/homebrew-core/issues", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02533");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("", "11");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02534");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("mixed mode", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02535");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.lwawt.macosx.LWCToolkit", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02536");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch(":", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02537");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("55.0", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02538");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02539");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "sun.awt.CGraphicsEnvironment", "11.0.32.1", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02540");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("UTF-8", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02541");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "th");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02542");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/Users/piyadaketmala", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02543");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "sun.awt.CGraphicsEnvironment", "sun.lwawt.macosx.LWCToolkit", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02544");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("TH", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02545");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Java Platform API Specification", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02546");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "sun.lwawt.macosx.CPrinterJob", "11.0.32.1+0", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02547");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "55.0", "aarch64", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02548");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "sun.awt.CGraphicsEnvironment", "sun.lwawt.macosx.LWCToolkit", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02549");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02550");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "mixed mode", "26.6.2", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02551");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11.0.32.1", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02552");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "Java Virtual Machine Specification", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02553");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("OpenJDK 64-Bit Server VM", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02554");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "th", "\n", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02555");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02556");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02557");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Java Platform API Specification", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02558");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02559");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "55.0", "55.0", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02560");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("mixed mode", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02561");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Java Virtual Machine Specification", "th");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02562");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Java Virtual Machine Specification", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02563");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.lwawt.macosx.LWCToolkit", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02564");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "UTF-8", "Java Platform API Specification", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02565");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "55.0", "Mac OS X", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02566");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "UTF-8", "/Users/piyadaketmala", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02567");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "th", "/Users/piyadaketmala", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02568");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02569");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Homebrew", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02570");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "/Users/piyadaketmala", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02571");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02572");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "sun.lwawt.macosx.LWCToolkit", "sun.awt.CGraphicsEnvironment", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02573");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("\n", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02574");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "mixed mode", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02575");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/Users/piyadaketmala", "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02576");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", ":", "aarch64", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02577");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.awt.CGraphicsEnvironment", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02578");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02579");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "11.0.32.1", "Mac OS X", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02580");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "sun.lwawt.macosx.LWCToolkit", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02581");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02582");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("piyadaketmala", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02583");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.lwawt.macosx.CPrinterJob", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02584");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", ":", "\n", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02585");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "\n", "", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02586");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "Java Platform API Specification", "TH", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02587");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02588");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "https://github.com/Homebrew/homebrew-core/issues", "https://github.com/Homebrew/homebrew-core/issues", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02589");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "sun.awt.CGraphicsEnvironment", "11.0.32.1", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02590");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("mixed mode", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02591");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02592");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("TH", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02593");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("hi!", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02594");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02595");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02596");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "11.0.32.1+0", "OpenJDK Runtime Environment", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02597");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "", "Oracle Corporation", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02598");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "11.0.32.1+0", "OpenJDK Runtime Environment", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02599");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "piyadaketmala", "Mac OS X", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02600");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.awt.CGraphicsEnvironment", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02601");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("UTF-8", "/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02602");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.lwawt.macosx.LWCToolkit", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02603");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "TH", "Mac OS X", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02604");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02605");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "https://github.com/Homebrew/homebrew-core/issues", "TH", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02606");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "hi!", "OpenJDK 64-Bit Server VM", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02607");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("OpenJDK Runtime Environment", "55.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02608");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Java Platform API Specification", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02609");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "11.0.32.1+0", "UTF-8", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02610");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "11", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02611");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "11.0.32.1+0", "mixed mode", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02612");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "OpenJDK 64-Bit Server VM", "55.0", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02613");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", ":", "\n", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02614");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "OpenJDK Runtime Environment", "https://github.com/Homebrew/homebrew-core/issues", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02615");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "mixed mode", "https://github.com/Homebrew/homebrew-core/issues", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test02616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02616");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("https://github.com/Homebrew/homebrew-core/issues", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02617");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02618");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("26.6.2", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02619");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("OpenJDK 64-Bit Server VM", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02620");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "Java Platform API Specification", "piyadaketmala", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02621");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02622");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("piyadaketmala", ":");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02623");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "55.0", "Java Platform API Specification", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02624");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.lwawt.macosx.LWCToolkit", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02625");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "sun.lwawt.macosx.LWCToolkit", "piyadaketmala", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02626");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02627");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Mac OS X", ":");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02628");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Java Platform API Specification", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02629");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02630");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "\n", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02631");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("mixed mode", ":");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02632");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "11.0.32.1+0", "OpenJDK Runtime Environment", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02633");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("hi!", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02634");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("piyadaketmala", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02635");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "sun.lwawt.macosx.LWCToolkit", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02636");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02637");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11.0.32.1", ":");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02638");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "sun.lwawt.macosx.LWCToolkit", "sun.lwawt.macosx.LWCToolkit", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02639");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("\n", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02640");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "hi!", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02641");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "th", "11.0.32.1", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02642");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.lwawt.macosx.CPrinterJob", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02643");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("\n", "TH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02644");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "Oracle Corporation", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02645");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "26.6.2", "/Users/piyadaketmala", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02646");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "https://github.com/Homebrew/homebrew-core/issues", ":", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02647");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "sun.awt.CGraphicsEnvironment", "OpenJDK 64-Bit Server VM", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02648");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("https://github.com/Homebrew/homebrew-core/issues", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02649");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch(":", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02650");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("aarch64", "11");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02651");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.lwawt.macosx.LWCToolkit", "th");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02652");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "11.0.32.1", "mixed mode", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02653");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", ":", "https://github.com/Homebrew/homebrew-core/issues", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02654");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02655");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Java Virtual Machine Specification", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02656");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/", "th");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02657");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "Homebrew", "OpenJDK 64-Bit Server VM", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02658");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "11", "TH", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02659");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Java Platform API Specification", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02660");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("11", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02661");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02662");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("\n", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02663");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("piyadaketmala", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02664");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "th", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02665");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", ":", "Java Virtual Machine Specification", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02666");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "11.0.32.1", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02667");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("26.6.2", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02668");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "sun.lwawt.macosx.LWCToolkit", "TH", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02669");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "sun.lwawt.macosx.CPrinterJob", "Oracle Corporation", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02670");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "11.0.32.1", "Java Virtual Machine Specification", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02671");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("OpenJDK Runtime Environment", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02672");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("hi!", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02673");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "Java Platform API Specification", "Java Virtual Machine Specification", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02674");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "26.6.2", "https://github.com/Homebrew/homebrew-core/issues", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02675");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("https://github.com/Homebrew/homebrew-core/issues", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02676");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("piyadaketmala", ":");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02677");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("th", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02678");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("th", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02679");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "OpenJDK 64-Bit Server VM", "https://github.com/Homebrew/homebrew-core/issues", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02680");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02681");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "mixed mode", "https://github.com/Homebrew/homebrew-core/issues", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02682");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("55.0", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02683");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "Java Virtual Machine Specification", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02684");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("\n", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02685");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("UTF-8", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02686");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("\n", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02687");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "https://github.com/Homebrew/homebrew-core/issues", "Java Virtual Machine Specification", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02688");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "sun.lwawt.macosx.LWCToolkit", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02689");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "aarch64", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02690");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "hi!", "26.6.2", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02691");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("piyadaketmala", "th");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02692");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "OpenJDK Runtime Environment", "sun.lwawt.macosx.LWCToolkit", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02693");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "Java Platform API Specification", "Homebrew", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02694");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "26.6.2", "TH", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02695");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "", "", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02696");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "sun.lwawt.macosx.LWCToolkit", "OpenJDK Runtime Environment", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02697");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "55.0", "11", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02698");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "OpenJDK Runtime Environment", "aarch64", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02699");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "hi!", "sun.awt.CGraphicsEnvironment", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02700");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Oracle Corporation", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02701");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "11.0.32.1+0", "th", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02702");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Oracle Corporation", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02703");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "/", "sun.awt.CGraphicsEnvironment", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02704");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "55.0", "Oracle Corporation", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02705");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "aarch64", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02706");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02707");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "th", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02708");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("hi!", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02709");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "piyadaketmala", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02710");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "Homebrew", "", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02711");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("11", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02712");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "aarch64", "Java Virtual Machine Specification", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02713");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "Java Virtual Machine Specification", "Mac OS X", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02714");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "Mac OS X", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02715");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "Homebrew", "", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02716");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "", "sun.awt.CGraphicsEnvironment", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02717");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "/Users/piyadaketmala", "11", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02718");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("OpenJDK Runtime Environment", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02719");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Homebrew", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02720");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02721");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "/Users/piyadaketmala", "https://github.com/Homebrew/homebrew-core/issues", "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02722");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Oracle Corporation", "55.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02723");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("piyadaketmala", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02724");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "/Users/piyadaketmala", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02725");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "sun.lwawt.macosx.LWCToolkit", "/", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02726");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "TH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02727");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "Mac OS X", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02728");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "OpenJDK Runtime Environment", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02729");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "sun.lwawt.macosx.CPrinterJob", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02730");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("aarch64", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02731");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("mixed mode", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02732");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "sun.awt.CGraphicsEnvironment", "55.0", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02733");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("TH", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02734");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02735");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "", "mixed mode", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02736");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "UTF-8", "55.0", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02737");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02738");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "", "https://github.com/Homebrew/homebrew-core/issues", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02739");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "sun.lwawt.macosx.LWCToolkit", "Java Platform API Specification", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02740");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "UTF-8", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02741");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("th", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02742");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "TH", "/", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02743");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "26.6.2", "https://github.com/Homebrew/homebrew-core/issues", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02744");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "", "mixed mode", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02745");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "TH", "Homebrew", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02746");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "hi!", "OpenJDK Runtime Environment", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02747");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "https://github.com/Homebrew/homebrew-core/issues", "26.6.2", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02748");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "11.0.32.1", "", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02749");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("\n", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02750");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("th", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02751");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "11.0.32.1", ":", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02752");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("26.6.2", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02753");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "aarch64", "Homebrew", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02754");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Java Platform API Specification", "TH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02755");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "TH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02756");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("hi!", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02757");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "sun.lwawt.macosx.LWCToolkit", "Java Virtual Machine Specification", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02758");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", ":", "mixed mode", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02759");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "OpenJDK Runtime Environment", "Mac OS X", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02760");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "aarch64", "55.0", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02761");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/Users/piyadaketmala", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02762");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("OpenJDK Runtime Environment", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02763");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", ":", "UTF-8", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02764");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02765");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "Java Virtual Machine Specification", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02766");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("UTF-8", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02767");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "55.0", ":", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02768");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02769");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("OpenJDK Runtime Environment", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02770");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/Users/piyadaketmala", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02771");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "Mac OS X", "mixed mode", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02772");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "piyadaketmala", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02773");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "Mac OS X", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02774");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "sun.lwawt.macosx.LWCToolkit", "UTF-8", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02775");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02776");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Java Virtual Machine Specification", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02777");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "", "th", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02778");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "sun.lwawt.macosx.CPrinterJob", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02779");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "OpenJDK 64-Bit Server VM", "11.0.32.1+0", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02780");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("https://github.com/Homebrew/homebrew-core/issues", "55.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02781");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("11.0.32.1+0", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02782");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "hi!", "Java Platform API Specification", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02783");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "sun.lwawt.macosx.CPrinterJob", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02784");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "Java Platform API Specification", "Oracle Corporation", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02785");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "OpenJDK 64-Bit Server VM", "Java Virtual Machine Specification", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02786");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "TH", "TH", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02787");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("\n", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02788");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "aarch64", "hi!", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02789");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "26.6.2", "11", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02790");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", ":", "Java Platform API Specification", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02791");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "55.0", "OpenJDK Runtime Environment", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02792");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "sun.lwawt.macosx.LWCToolkit", "Homebrew", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02793");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "\n", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02794");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch(":", "55.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02795");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "55.0", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02796");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Homebrew", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02797");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("\n", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02798");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02799");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "Java Platform API Specification", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02800");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "Mac OS X", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02801");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("26.6.2", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02802");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11.0.32.1+0", "th");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02803");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("th", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02804");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "sun.lwawt.macosx.LWCToolkit", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02805");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "/", "/", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02806");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("th", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02807");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("UTF-8", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02808");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "", "sun.lwawt.macosx.CPrinterJob", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02809");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("\n", "/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02810");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02811");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("26.6.2", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02812");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "Oracle Corporation", "11.0.32.1", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02813");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "11.0.32.1", "Java Virtual Machine Specification", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02814");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "OpenJDK Runtime Environment", "Mac OS X", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02815");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/Users/piyadaketmala", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02816");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "OpenJDK 64-Bit Server VM", "Java Platform API Specification", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02817");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.lwawt.macosx.CPrinterJob", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02818");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "11.0.32.1", "\n", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02819");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02820");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.awt.CGraphicsEnvironment", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02821");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "th", "Java Platform API Specification", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02822");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "", "mixed mode", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02823");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("hi!", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02824");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "Java Virtual Machine Specification", "hi!", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02825");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "Oracle Corporation", "11", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02826");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("hi!", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02827");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "Mac OS X", "OpenJDK Runtime Environment", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02828");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "11", "mixed mode", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02829");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "sun.lwawt.macosx.LWCToolkit", "Homebrew", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02830");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "sun.awt.CGraphicsEnvironment", "mixed mode", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02831");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("hi!", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02832");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("OpenJDK Runtime Environment", ":");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02833");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02834");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "55.0", "th", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02835");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "", "th", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02836");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02837");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "OpenJDK Runtime Environment", "hi!", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02838");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "sun.lwawt.macosx.LWCToolkit", "Oracle Corporation", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02839");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "th", "sun.awt.CGraphicsEnvironment", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02840");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "11.0.32.1+0", "", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02841");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "Oracle Corporation", "sun.lwawt.macosx.LWCToolkit", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02842");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "th", "", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02843");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "", "55.0", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02844");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "", "OpenJDK 64-Bit Server VM", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02845");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("11.0.32.1", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02846");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("th", "55.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02847");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("aarch64", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02848");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("piyadaketmala", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02849");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "sun.lwawt.macosx.CPrinterJob", "", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02850");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "mixed mode", "55.0", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02851");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "11.0.32.1+0", "Oracle Corporation", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02852");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "sun.lwawt.macosx.CPrinterJob", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02853");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02854");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "", "UTF-8", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02855");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "Oracle Corporation", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02856");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "Java Platform API Specification", "OpenJDK Runtime Environment", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02857");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.lwawt.macosx.LWCToolkit", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02858");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "55.0", "", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02859");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "55.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02860");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "OpenJDK 64-Bit Server VM", "hi!", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02861");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "sun.lwawt.macosx.LWCToolkit", ":", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02862");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "/", "sun.lwawt.macosx.CPrinterJob", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02863");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "Homebrew", "/", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02864");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "piyadaketmala", "OpenJDK Runtime Environment", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02865");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "OpenJDK Runtime Environment", "", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02866");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "Java Virtual Machine Specification", "Mac OS X", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02867");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "https://github.com/Homebrew/homebrew-core/issues", "11", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02868");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "Java Virtual Machine Specification", "sun.lwawt.macosx.LWCToolkit", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02869");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02870");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "th", "/Users/piyadaketmala", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02871");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "", "11.0.32.1", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02872");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("piyadaketmala", "11");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02873");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.awt.CGraphicsEnvironment", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02874");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", ":", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02875");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "26.6.2", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02876");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "Homebrew", "sun.lwawt.macosx.CPrinterJob", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02877");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "TH", "Homebrew", "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02878");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "11", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02879");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Mac OS X", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02880");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "11", "Mac OS X", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02881");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02882");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "26.6.2", "OpenJDK Runtime Environment", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02883");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "55.0", "", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test02884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02884");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "TH", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02885");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "hi!", "aarch64", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02886");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "sun.lwawt.macosx.CPrinterJob", "11.0.32.1+0", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02887");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("11.0.32.1", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02888");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "TH", "hi!", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02889");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("https://github.com/Homebrew/homebrew-core/issues", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02890");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "Java Virtual Machine Specification", "OpenJDK Runtime Environment", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02891");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "piyadaketmala", "", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02892");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "th", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02893");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "https://github.com/Homebrew/homebrew-core/issues", "11.0.32.1+0", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02894");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "11.0.32.1+0", "aarch64", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02895");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "26.6.2", "Oracle Corporation", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02896");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("11", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02897");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "OpenJDK Runtime Environment", "sun.lwawt.macosx.LWCToolkit", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02898");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "/", "Oracle Corporation", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02899");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "aarch64", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02900");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "Java Virtual Machine Specification", "sun.lwawt.macosx.LWCToolkit", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02901");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "Mac OS X", "UTF-8", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02902");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "TH", "", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02903");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "aarch64", "OpenJDK 64-Bit Server VM", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02904");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "th", "11", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02905");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "", "piyadaketmala", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02906");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("\n", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02907");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02908");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02909");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("OpenJDK Runtime Environment", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02910");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "sun.lwawt.macosx.LWCToolkit", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02911");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "26.6.2", "\n", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02912");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("UTF-8", "55.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02913");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "OpenJDK 64-Bit Server VM", "piyadaketmala", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02914");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "piyadaketmala", "Homebrew", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02915");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "Homebrew", "26.6.2", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02916");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "mixed mode", "Oracle Corporation", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02917");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("mixed mode", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02918");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "", "11", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02919");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Mac OS X", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02920");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02921");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "sun.awt.CGraphicsEnvironment", "OpenJDK Runtime Environment", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02922");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "Java Platform API Specification", "Oracle Corporation", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02923");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.lwawt.macosx.CPrinterJob", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02924");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "/", "/", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02925");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "/", "OpenJDK 64-Bit Server VM", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02926");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "TH", "Java Platform API Specification", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02927");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "sun.lwawt.macosx.CPrinterJob", "sun.lwawt.macosx.LWCToolkit", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02928");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "UTF-8", "th", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02929");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02930");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("aarch64", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02931");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "UTF-8", "https://github.com/Homebrew/homebrew-core/issues", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02932");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "mixed mode", "https://github.com/Homebrew/homebrew-core/issues", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02933");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "mixed mode", "11.0.32.1", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02934");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Oracle Corporation", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02935");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "hi!", "UTF-8", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02936");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.awt.CGraphicsEnvironment", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02937");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "", "th", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02938");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02939");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "sun.awt.CGraphicsEnvironment", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02940");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "UTF-8", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02941");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "/", "UTF-8", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02942");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("\n", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02943");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Java Platform API Specification", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02944");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("OpenJDK Runtime Environment", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02945");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("55.0", "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02946");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "55.0", "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02947");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("OpenJDK 64-Bit Server VM", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02948");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "th", "", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02949");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("aarch64", "55.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02950");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "OpenJDK 64-Bit Server VM", "26.6.2", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02951");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "", "\n", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02952");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "Mac OS X", "piyadaketmala", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02953");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "Java Platform API Specification", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02954");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "Mac OS X", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02955");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11.0.32.1", "TH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02956");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("UTF-8", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02957");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("https://github.com/Homebrew/homebrew-core/issues", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02958");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "sun.awt.CGraphicsEnvironment", "", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02959");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "piyadaketmala", "https://github.com/Homebrew/homebrew-core/issues", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02960");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "sun.awt.CGraphicsEnvironment", "Java Virtual Machine Specification", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02961");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("TH", "th");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02962");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "\n", "55.0", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02963");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.lwawt.macosx.CPrinterJob", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02964");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("OpenJDK 64-Bit Server VM", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02965");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "sun.lwawt.macosx.LWCToolkit", "11.0.32.1+0", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02966");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "Mac OS X", "11.0.32.1+0", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02967");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "OpenJDK 64-Bit Server VM", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02968");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "aarch64", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02969");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "th", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02970");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("mixed mode", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02971");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "11.0.32.1", "55.0", "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02972");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "piyadaketmala", "TH", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02973");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("UTF-8", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02974");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("th", "TH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02975");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02976");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "UTF-8", "mixed mode", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02977");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Oracle Corporation", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02978");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "", "", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02979");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "26.6.2", "11.0.32.1", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02980");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "Mac OS X", "/", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02981");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "\n", "UTF-8", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02982");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "26.6.2", "Mac OS X", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02983");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "UTF-8", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02984");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("th", "55.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02985");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "mixed mode", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02986");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "TH", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02987");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "", "OpenJDK Runtime Environment", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02988");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "Mac OS X", "mixed mode", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02989");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "Oracle Corporation", "11.0.32.1", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02990");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "Oracle Corporation", "th", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02991");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "TH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02992");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "Java Virtual Machine Specification", "sun.lwawt.macosx.CPrinterJob", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02993");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02994");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("\n", "/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02995");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "Java Virtual Machine Specification", "sun.awt.CGraphicsEnvironment", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02996");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "Oracle Corporation", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02997");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "Oracle Corporation", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02998");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("26.6.2", "/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02999");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "UTF-8", ":", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test03000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test03000");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "26.6.2", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }
}

