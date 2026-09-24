package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test01501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01501");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "Oracle Corporation", "11.0.32.1+0", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01502");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01503");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "Oracle Corporation", "/", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01504");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.lwawt.macosx.LWCToolkit", "th");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01505");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("TH", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01506");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "11.0.32.1", "OpenJDK 64-Bit Server VM", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01507");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "piyadaketmala", "26.6.2", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01508");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "Java Platform API Specification", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01509");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "UTF-8", "piyadaketmala", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01510");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.awt.CGraphicsEnvironment", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01511");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01512");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "55.0", "th", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01513");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "hi!", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01514");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "UTF-8", "", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01515");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11.0.32.1+0", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01516");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "th", "sun.lwawt.macosx.CPrinterJob", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01517");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "piyadaketmala", "hi!", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01518");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "sun.lwawt.macosx.LWCToolkit", "sun.lwawt.macosx.LWCToolkit", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01519");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", ":");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01520");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.awt.CGraphicsEnvironment", "/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01521");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", ":", "55.0", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01522");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("UTF-8", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01523");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("https://github.com/Homebrew/homebrew-core/issues", "/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01524");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("th", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01525");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "UTF-8", "Mac OS X", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01526");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "\n", "", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01527");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "11", "11.0.32.1+0", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01528");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "11.0.32.1", "", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01529");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("hi!", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01530");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "Homebrew", "UTF-8", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01531");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Homebrew", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01532");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "", "Mac OS X", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01533");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "UTF-8", "OpenJDK 64-Bit Server VM", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01534");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "/Users/piyadaketmala", "sun.lwawt.macosx.LWCToolkit", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01535");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01536");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "", "mixed mode", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01537");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Java Virtual Machine Specification", "TH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01538");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("aarch64", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01539");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "TH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01540");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Java Virtual Machine Specification", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01541");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Oracle Corporation", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01542");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "sun.awt.CGraphicsEnvironment", "Homebrew", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01543");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "aarch64", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01544");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "sun.awt.CGraphicsEnvironment", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01545");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11.0.32.1+0", ":");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01546");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", ":", "hi!", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01547");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("https://github.com/Homebrew/homebrew-core/issues", "55.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01548");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "26.6.2", "11", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01549");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.lwawt.macosx.LWCToolkit", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01550");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01551");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("26.6.2", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01552");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("piyadaketmala", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01553");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "Homebrew", "OpenJDK Runtime Environment", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01554");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", ":", "11.0.32.1+0", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01555");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", ":", "OpenJDK 64-Bit Server VM", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01556");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Oracle Corporation", ":");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01557");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "th", "11.0.32.1", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01558");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01559");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("hi!", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01560");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "Java Virtual Machine Specification", "https://github.com/Homebrew/homebrew-core/issues", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01561");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch(":", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01562");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01563");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "th", "26.6.2", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01564");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "UTF-8", ":", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01565");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "Homebrew", ":", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01566");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "11", "/Users/piyadaketmala", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01567");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.lwawt.macosx.LWCToolkit", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01568");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "aarch64", "Java Platform API Specification", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01569");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "mixed mode", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01570");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("55.0", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01571");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("TH", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01572");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("\n", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01573");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("55.0", ":");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01574");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.lwawt.macosx.LWCToolkit", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01575");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "piyadaketmala", "Mac OS X", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01576");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("hi!", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01577");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01578");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("mixed mode", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01579");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("55.0", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01580");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "11.0.32.1", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01581");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "OpenJDK Runtime Environment", "https://github.com/Homebrew/homebrew-core/issues", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01582");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("\n", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01583");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("11.0.32.1", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01584");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("https://github.com/Homebrew/homebrew-core/issues", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01585");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01586");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01587");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01588");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "", "OpenJDK Runtime Environment", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01589");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "OpenJDK Runtime Environment", "Homebrew", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01590");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("aarch64", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01591");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("mixed mode", "55.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01592");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("hi!", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01593");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.awt.CGraphicsEnvironment", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01594");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("hi!", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01595");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", ":", "11", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01596");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Java Virtual Machine Specification", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01597");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("UTF-8", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01598");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("UTF-8", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01599");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("TH", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01600");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "11.0.32.1", "", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01601");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("OpenJDK 64-Bit Server VM", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01602");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Java Platform API Specification", "11");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01603");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("mixed mode", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01604");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("aarch64", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01605");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("55.0", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01606");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.lwawt.macosx.LWCToolkit", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01607");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11.0.32.1+0", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01608");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01609");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("piyadaketmala", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01610");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("OpenJDK Runtime Environment", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01611");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "11.0.32.1+0", "/Users/piyadaketmala", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01612");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11.0.32.1+0", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01613");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "piyadaketmala", "piyadaketmala", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01614");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "OpenJDK Runtime Environment", "Mac OS X", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01615");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("OpenJDK 64-Bit Server VM", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01616");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Oracle Corporation", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01617");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("OpenJDK Runtime Environment", "/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01618");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.awt.CGraphicsEnvironment", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01619");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01620");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "sun.awt.CGraphicsEnvironment", "", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01621");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "Java Platform API Specification", "sun.lwawt.macosx.CPrinterJob", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01622");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01623");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "\n", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01624");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("aarch64", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01625");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "55.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01626");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "Mac OS X", "11", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01627");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("mixed mode", "55.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01628");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "th", "11.0.32.1+0", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01629");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "/Users/piyadaketmala", "TH", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01630");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("aarch64", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01631");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "TH", "OpenJDK 64-Bit Server VM", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01632");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "OpenJDK 64-Bit Server VM", "UTF-8", "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01633");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01634");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/Users/piyadaketmala", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01635");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("TH", "11");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01636");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "OpenJDK Runtime Environment", "hi!", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01637");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "/", "11.0.32.1+0", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01638");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Java Virtual Machine Specification", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01639");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("26.6.2", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01640");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "mixed mode", "11.0.32.1+0", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01641");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "UTF-8", "11", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01642");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "Oracle Corporation", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01643");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("11.0.32.1", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01644");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "/", "mixed mode", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01645");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("aarch64", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01646");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01647");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("26.6.2", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01648");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.lwawt.macosx.LWCToolkit", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01649");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("55.0", "55.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01650");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "piyadaketmala", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01651");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Java Virtual Machine Specification", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01652");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "aarch64", "", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01653");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.lwawt.macosx.CPrinterJob", "11");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01654");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "\n", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01655");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "https://github.com/Homebrew/homebrew-core/issues", "OpenJDK Runtime Environment", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01656");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "", "hi!", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01657");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("11.0.32.1", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01658");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("55.0", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01659");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("aarch64", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01660");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "sun.lwawt.macosx.CPrinterJob", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01661");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Oracle Corporation", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01662");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("26.6.2", "TH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01663");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("\n", "th");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01664");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "th", "th", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01665");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "sun.lwawt.macosx.CPrinterJob", "/Users/piyadaketmala", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01666");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "Java Platform API Specification", "Mac OS X", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01667");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "https://github.com/Homebrew/homebrew-core/issues", "piyadaketmala", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01668");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Oracle Corporation", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01669");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "Homebrew", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01670");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.awt.CGraphicsEnvironment", "11");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01671");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", ":", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01672");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01673");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("aarch64", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01674");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("piyadaketmala", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01675");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "55.0", "UTF-8", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01676");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("https://github.com/Homebrew/homebrew-core/issues", "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01677");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01678");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01679");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Homebrew", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01680");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Mac OS X", "11");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01681");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("OpenJDK 64-Bit Server VM", "11");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01682");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01683");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01684");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "11", "\n", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01685");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("11", "TH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01686");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "sun.lwawt.macosx.LWCToolkit", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01687");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "hi!", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01688");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Homebrew", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01689");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "OpenJDK Runtime Environment", "UTF-8", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01690");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "OpenJDK 64-Bit Server VM", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01691");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "mixed mode", "", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01692");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "/", "https://github.com/Homebrew/homebrew-core/issues", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01693");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01694");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "hi!", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01695");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.awt.CGraphicsEnvironment", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01696");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("mixed mode", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01697");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.lwawt.macosx.LWCToolkit", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01698");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Java Platform API Specification", "11");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01699");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "hi!", "sun.awt.CGraphicsEnvironment", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01700");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "mixed mode", "TH", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01701");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "", "https://github.com/Homebrew/homebrew-core/issues", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01702");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "https://github.com/Homebrew/homebrew-core/issues", "OpenJDK 64-Bit Server VM", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01703");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "piyadaketmala", "OpenJDK Runtime Environment", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01704");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "Homebrew", "11.0.32.1", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01705");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.awt.CGraphicsEnvironment", "th");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01706");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "https://github.com/Homebrew/homebrew-core/issues", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01707");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.lwawt.macosx.LWCToolkit", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01708");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01709");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("TH", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01710");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "11", "Mac OS X", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01711");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "piyadaketmala", "Mac OS X", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01712");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01713");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "26.6.2", "Mac OS X", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01714");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "https://github.com/Homebrew/homebrew-core/issues", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01715");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("hi!", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01716");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Java Virtual Machine Specification", "/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01717");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("https://github.com/Homebrew/homebrew-core/issues", "th");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01718");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01719");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01720");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch(":", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01721");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "/Users/piyadaketmala", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01722");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01723");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "11.0.32.1+0", "UTF-8", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01724");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01725");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Mac OS X", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01726");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("mixed mode", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01727");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Java Virtual Machine Specification", "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01728");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Homebrew", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01729");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch(":", ":");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01730");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01731");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("https://github.com/Homebrew/homebrew-core/issues", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01732");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("11.0.32.1+0", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01733");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Java Platform API Specification", "th");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01734");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "Java Virtual Machine Specification", "11.0.32.1", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01735");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "11.0.32.1", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01736");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "Mac OS X", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01737");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "mixed mode", "", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01738");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "TH", "mixed mode", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01739");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "26.6.2", "11.0.32.1", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01740");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.lwawt.macosx.CPrinterJob", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01741");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "/Users/piyadaketmala", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01742");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "55.0", "TH", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01743");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01744");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("mixed mode", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01745");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01746");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.lwawt.macosx.LWCToolkit", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01747");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01748");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("https://github.com/Homebrew/homebrew-core/issues", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01749");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "sun.awt.CGraphicsEnvironment", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01750");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "\n", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01751");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("11.0.32.1+0", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01752");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "UTF-8", "", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test01753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01753");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01754");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("aarch64", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01755");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "Mac OS X", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01756");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Homebrew", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01757");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("55.0", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01758");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "sun.lwawt.macosx.CPrinterJob", "/", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01759");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("https://github.com/Homebrew/homebrew-core/issues", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01760");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("TH", "55.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01761");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("OpenJDK 64-Bit Server VM", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01762");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("11.0.32.1+0", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01763");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch(":", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01764");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("piyadaketmala", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01765");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "th", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01766");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "sun.awt.CGraphicsEnvironment", "OpenJDK 64-Bit Server VM", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01767");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Oracle Corporation", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01768");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "OpenJDK Runtime Environment", "Java Platform API Specification", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01769");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Homebrew", "11");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01770");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "mixed mode", "UTF-8", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01771");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Homebrew", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01772");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "11", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01773");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "mixed mode", "Oracle Corporation", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01774");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "sun.awt.CGraphicsEnvironment", "UTF-8", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01775");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Mac OS X", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01776");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("aarch64", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01777");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Oracle Corporation", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01778");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.awt.CGraphicsEnvironment", ":");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01779");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "th", "aarch64", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01780");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "sun.awt.CGraphicsEnvironment", "11.0.32.1+0", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01781");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01782");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch(":", "th");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01783");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "/", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01784");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "https://github.com/Homebrew/homebrew-core/issues", "", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01785");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "piyadaketmala", "Java Virtual Machine Specification", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01786");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "55.0", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01787");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("11.0.32.1+0", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01788");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Oracle Corporation", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01789");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "OpenJDK Runtime Environment", "hi!", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01790");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "\n", "Oracle Corporation", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01791");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("\n", ":");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01792");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01793");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("OpenJDK 64-Bit Server VM", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01794");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "aarch64", "26.6.2", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01795");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("55.0", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01796");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "11", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01797");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "Java Virtual Machine Specification", "/", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01798");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "Java Platform API Specification", "mixed mode", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01799");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "hi!", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01800");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "mixed mode", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01801");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.lwawt.macosx.LWCToolkit", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01802");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "/Users/piyadaketmala", "26.6.2", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01803");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "OpenJDK Runtime Environment", "55.0", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01804");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01805");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "https://github.com/Homebrew/homebrew-core/issues", "/Users/piyadaketmala", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01806");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "Homebrew", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01807");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Mac OS X", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01808");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "sun.lwawt.macosx.LWCToolkit", "26.6.2", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01809");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11.0.32.1+0", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01810");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.lwawt.macosx.CPrinterJob", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01811");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.lwawt.macosx.CPrinterJob", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01812");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Homebrew", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01813");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "55.0", "th", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01814");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.lwawt.macosx.CPrinterJob", "55.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01815");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "/Users/piyadaketmala", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01816");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Mac OS X", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01817");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Java Virtual Machine Specification", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01818");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("\n", ":");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01819");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("55.0", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01820");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "11.0.32.1+0", "\n", "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01821");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "UTF-8", "", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01822");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01823");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "", "55.0", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01824");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch(":", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01825");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("11", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01826");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("", "TH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01827");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "55.0", "26.6.2", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01828");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Homebrew", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01829");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "/Users/piyadaketmala", "Java Virtual Machine Specification", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01830");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01831");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.lwawt.macosx.LWCToolkit", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01832");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("55.0", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01833");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "th", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01834");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "", "11", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01835");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "https://github.com/Homebrew/homebrew-core/issues", "26.6.2", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01836");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Java Platform API Specification", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01837");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("https://github.com/Homebrew/homebrew-core/issues", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01838");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Oracle Corporation", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01839");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("", "th");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01840");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("piyadaketmala", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01841");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "11.0.32.1", "OpenJDK 64-Bit Server VM", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01842");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "26.6.2", "11", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test01843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01843");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "hi!", "Java Platform API Specification", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01844");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "/Users/piyadaketmala", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01845");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Homebrew", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01846");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "https://github.com/Homebrew/homebrew-core/issues", "UTF-8", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01847");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "", "th", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01848");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "hi!", "", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01849");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("55.0", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01850");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("hi!", ":");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01851");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11.0.32.1+0", "11");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01852");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Oracle Corporation", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01853");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("\n", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01854");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11.0.32.1+0", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01855");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("piyadaketmala", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01856");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("TH", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01857");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("th", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01858");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "11", "OpenJDK 64-Bit Server VM", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01859");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "Oracle Corporation", "mixed mode", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01860");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Mac OS X", "55.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01861");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01862");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Oracle Corporation", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01863");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.lwawt.macosx.LWCToolkit", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01864");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("https://github.com/Homebrew/homebrew-core/issues", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01865");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01866");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "26.6.2", "th", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01867");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "Oracle Corporation", "11.0.32.1", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01868");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("UTF-8", ":");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01869");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "https://github.com/Homebrew/homebrew-core/issues", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01870");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("UTF-8", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01871");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01872");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "Java Virtual Machine Specification", "OpenJDK 64-Bit Server VM", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01873");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "Java Platform API Specification", "piyadaketmala", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01874");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "Java Platform API Specification", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01875");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "11.0.32.1", "Oracle Corporation", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01876");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "hi!", "11.0.32.1", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01877");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("11", ":");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01878");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "11.0.32.1+0", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01879");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("mixed mode", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01880");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01881");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("26.6.2", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01882");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11.0.32.1+0", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01883");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "sun.lwawt.macosx.LWCToolkit", "/Users/piyadaketmala", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01884");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "sun.lwawt.macosx.LWCToolkit", "th", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01885");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "11.0.32.1", "Mac OS X", "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01886");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "", "TH", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01887");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Homebrew", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01888");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch(":", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01889");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("mixed mode", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01890");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01891");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "/Users/piyadaketmala", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01892");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "\n", "sun.awt.CGraphicsEnvironment", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01893");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Mac OS X", "11");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01894");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "hi!", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01895");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "55.0", "Homebrew", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01896");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01897");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("26.6.2", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01898");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.awt.CGraphicsEnvironment", "TH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01899");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "OpenJDK Runtime Environment", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01900");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "26.6.2", "11", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01901");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("piyadaketmala", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01902");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", ":", "piyadaketmala", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01903");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "", "Java Virtual Machine Specification", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01904");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "aarch64", "11.0.32.1", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01905");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "aarch64", "mixed mode", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01906");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "sun.lwawt.macosx.CPrinterJob", "/", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01907");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "OpenJDK Runtime Environment", "TH", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01908");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "26.6.2", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01909");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "Java Virtual Machine Specification", "hi!", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01910");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "26.6.2", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01911");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "OpenJDK 64-Bit Server VM", "Homebrew", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01912");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Mac OS X", "55.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01913");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Mac OS X", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01914");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01915");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "TH", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01916");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("aarch64", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01917");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "sun.lwawt.macosx.CPrinterJob", "\n", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01918");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "sun.awt.CGraphicsEnvironment", "sun.awt.CGraphicsEnvironment", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01919");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01920");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "Oracle Corporation", "aarch64", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01921");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "", "sun.lwawt.macosx.LWCToolkit", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01922");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "aarch64", "sun.awt.CGraphicsEnvironment", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01923");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("\n", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01924");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01925");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "sun.awt.CGraphicsEnvironment", "11.0.32.1+0", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01926");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.lwawt.macosx.CPrinterJob", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01927");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.lwawt.macosx.CPrinterJob", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01928");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "aarch64", "Java Platform API Specification", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01929");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "sun.lwawt.macosx.LWCToolkit", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01930");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Oracle Corporation", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01931");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11.0.32.1", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01932");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("55.0", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01933");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "\n", "Oracle Corporation", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01934");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.lwawt.macosx.LWCToolkit", "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01935");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "26.6.2", "/Users/piyadaketmala", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01936");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "55.0", "OpenJDK 64-Bit Server VM", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01937");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", ":", "TH", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01938");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala", "55.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01939");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "26.6.2", "OpenJDK 64-Bit Server VM", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01940");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "\n", "th", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01941");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.lwawt.macosx.CPrinterJob", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01942");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "11", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01943");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "11", "/Users/piyadaketmala", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01944");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "UTF-8", "mixed mode", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01945");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "Java Platform API Specification", "piyadaketmala", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01946");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01947");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "/", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01948");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01949");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "TH", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01950");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Homebrew", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01951");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "\n", "hi!", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01952");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "55.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01953");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("TH", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01954");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("piyadaketmala", "55.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01955");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "11.0.32.1+0", "", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01956");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("OpenJDK 64-Bit Server VM", ":");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01957");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("hi!", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01958");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("TH", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01959");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "UTF-8", "sun.lwawt.macosx.LWCToolkit", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01960");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "Homebrew", "", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test01961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01961");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("https://github.com/Homebrew/homebrew-core/issues", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01962");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("th", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01963");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "Oracle Corporation", "11", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01964");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "/", "/", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01965");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "hi!", "Java Platform API Specification", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01966");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("OpenJDK 64-Bit Server VM", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01967");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "TH", "sun.lwawt.macosx.LWCToolkit", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01968");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "11.0.32.1", "https://github.com/Homebrew/homebrew-core/issues", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01969");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("hi!", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01970");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "https://github.com/Homebrew/homebrew-core/issues", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01971");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "11.0.32.1", "th", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01972");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01973");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch(":", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01974");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "sun.lwawt.macosx.CPrinterJob", "11", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01975");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Java Virtual Machine Specification", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01976");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "/", "th", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01977");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch(":", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01978");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "OpenJDK 64-Bit Server VM", "Mac OS X", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01979");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "Java Virtual Machine Specification", "sun.lwawt.macosx.CPrinterJob", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01980");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "TH", "55.0", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01981");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "aarch64", "aarch64", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01982");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("hi!", "55.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01983");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.lwawt.macosx.CPrinterJob", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01984");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("mixed mode", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01985");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", ":", "\n", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01986");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "hi!", "Java Virtual Machine Specification", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01987");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("11.0.32.1+0", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01988");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "UTF-8", "11.0.32.1", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01989");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("55.0", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01990");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "TH", "sun.lwawt.macosx.LWCToolkit", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01991");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01992");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "55.0", ":", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01993");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "mixed mode", "", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01994");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("mixed mode", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01995");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("aarch64", "/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01996");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("\n", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01997");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("UTF-8", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01998");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "Homebrew", "11", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01999");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("OpenJDK Runtime Environment", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test02000");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("OpenJDK 64-Bit Server VM", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}

