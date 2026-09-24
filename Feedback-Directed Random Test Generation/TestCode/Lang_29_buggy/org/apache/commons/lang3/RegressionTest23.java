package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest23 {

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
    public void test11501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11501");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "Mac OS X", "UTF-8", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11502");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "", "UTF-8", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11503");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "55.0", "/", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11504");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "26.6.2", "sun.awt.CGraphicsEnvironment", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11505");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "aarch64", "UTF-8", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11506");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "/Users/piyadaketmala", "", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11507");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "55.0", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11508");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "TH", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11509");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "sun.awt.CGraphicsEnvironment", "Homebrew", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11510");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "\n", "Java Virtual Machine Specification", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11511");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "OpenJDK Runtime Environment", "Oracle Corporation", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11512");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "11.0.32.1", "TH", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11513");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "TH", ":", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11514");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "11.0.32.1+0", "/", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11515");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", ":", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11516");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "11.0.32.1", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11517");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "mixed mode", "/", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11518");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "11.0.32.1+0", "hi!", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11519");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "", "Mac OS X", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11520");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11521");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "", "Mac OS X", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11522");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "26.6.2", "OpenJDK Runtime Environment", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11523");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "Mac OS X", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11524");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "sun.lwawt.macosx.LWCToolkit", "55.0", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11525");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "Oracle Corporation", "26.6.2", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11526");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "Mac OS X", "\n", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11527");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "TH", "11", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11528");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "55.0", "11.0.32.1+0", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11529");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "hi!", "11.0.32.1+0", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11530");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "piyadaketmala", "26.6.2", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11531");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "/", "OpenJDK 64-Bit Server VM", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11532");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "Java Virtual Machine Specification", "Oracle Corporation", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11533");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "TH", ":", "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11534");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "Oracle Corporation", "aarch64", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11535");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "Oracle Corporation", "11", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11536");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "26.6.2", "hi!", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11537");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "sun.awt.CGraphicsEnvironment", "https://github.com/Homebrew/homebrew-core/issues", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11538");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "mixed mode", "sun.lwawt.macosx.CPrinterJob", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11539");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "/", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11540");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "TH", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11541");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "", "sun.lwawt.macosx.CPrinterJob", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11542");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "/", "mixed mode", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11543");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", ":", "https://github.com/Homebrew/homebrew-core/issues", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11544");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "OpenJDK Runtime Environment", "UTF-8", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11545");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "Oracle Corporation", "hi!", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11546");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "OpenJDK 64-Bit Server VM", "26.6.2", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11547");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "TH", "26.6.2", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11548");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "sun.lwawt.macosx.CPrinterJob", "piyadaketmala", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11549");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "TH", "26.6.2", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11550");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "Java Virtual Machine Specification", ":", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11551");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "OpenJDK Runtime Environment", "Oracle Corporation", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11552");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "", "sun.lwawt.macosx.LWCToolkit", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11553");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "Homebrew", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11554");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "https://github.com/Homebrew/homebrew-core/issues", "mixed mode", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11555");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "26.6.2", "/", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11556");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "", "TH", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11557");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11558");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test11559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11559");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "Java Platform API Specification", "", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test11560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11560");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "/", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11561");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "11.0.32.1+0", "", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11562");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "sun.lwawt.macosx.LWCToolkit", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11563");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "55.0", "sun.lwawt.macosx.LWCToolkit", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11564");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "aarch64", "hi!", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11565");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "OpenJDK 64-Bit Server VM", "", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11566");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "aarch64", "aarch64", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11567");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "hi!", "sun.awt.CGraphicsEnvironment", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11568");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "11.0.32.1+0", "TH", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11569");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "11.0.32.1+0", "th", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11570");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "11.0.32.1+0", "11.0.32.1+0", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11571");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "sun.lwawt.macosx.LWCToolkit", "Homebrew", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11572");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "Homebrew", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11573");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "Java Platform API Specification", "\n", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11574");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "Oracle Corporation", "hi!", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11575");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "sun.lwawt.macosx.CPrinterJob", "OpenJDK Runtime Environment", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11576");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "TH", "mixed mode", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11577");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11578");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "aarch64", "Java Virtual Machine Specification", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11579");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "aarch64", "\n", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11580");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "piyadaketmala", "26.6.2", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11581");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "th", "hi!", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11582");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "/", "UTF-8", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11583");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "Homebrew", "", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11584");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "\n", "OpenJDK 64-Bit Server VM", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11585");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "/Users/piyadaketmala", "Oracle Corporation", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11586");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "\n", "11.0.32.1+0", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11587");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "https://github.com/Homebrew/homebrew-core/issues", "Homebrew", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11588");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "/Users/piyadaketmala", "11.0.32.1", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11589");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "55.0", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11590");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "11.0.32.1", "UTF-8", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11591");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11592");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "th", "55.0", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11593");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "th", "", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test11594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11594");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "", ":", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11595");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "https://github.com/Homebrew/homebrew-core/issues", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11596");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "aarch64", "sun.lwawt.macosx.CPrinterJob", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11597");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "11.0.32.1", "OpenJDK Runtime Environment", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11598");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "55.0", "Homebrew", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11599");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "piyadaketmala", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11600");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", ":", "11", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11601");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "Java Virtual Machine Specification", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11602");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "11.0.32.1+0", "11", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11603");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "26.6.2", "/Users/piyadaketmala", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11604");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "Oracle Corporation", "", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11605");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "th", "/Users/piyadaketmala", "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11606");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "piyadaketmala", "TH", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11607");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "/Users/piyadaketmala", "https://github.com/Homebrew/homebrew-core/issues", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11608");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "OpenJDK 64-Bit Server VM", "OpenJDK 64-Bit Server VM", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11609");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "11", "piyadaketmala", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11610");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "OpenJDK 64-Bit Server VM", "OpenJDK Runtime Environment", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11611");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "11", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11612");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "th", "OpenJDK 64-Bit Server VM", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11613");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "11.0.32.1", "11", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11614");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "\n", ":", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11615");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11616");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "th", "aarch64", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11617");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "Homebrew", "TH", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11618");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "sun.lwawt.macosx.CPrinterJob", "", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11619");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "hi!", "Java Platform API Specification", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11620");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "aarch64", "Mac OS X", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11621");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "OpenJDK Runtime Environment", "Java Virtual Machine Specification", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11622");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "UTF-8", "/", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11623");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11624");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "26.6.2", "sun.awt.CGraphicsEnvironment", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11625");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "sun.lwawt.macosx.LWCToolkit", "/", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11626");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "UTF-8", "UTF-8", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11627");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "", "hi!", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11628");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "sun.lwawt.macosx.CPrinterJob", "/Users/piyadaketmala", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11629");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "\n", "sun.awt.CGraphicsEnvironment", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11630");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "11", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11631");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "11", "", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test11632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11632");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "11.0.32.1", "/", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11633");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "OpenJDK 64-Bit Server VM", "mixed mode", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11634");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "55.0", "Oracle Corporation", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11635");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "", "piyadaketmala", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11636");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "11", "sun.awt.CGraphicsEnvironment", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11637");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11638");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "UTF-8", "Java Platform API Specification", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11639");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "Oracle Corporation", "aarch64", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11640");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "piyadaketmala", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11641");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "Oracle Corporation", "Java Platform API Specification", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11642");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "hi!", "aarch64", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11643");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "11.0.32.1", "th", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11644");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "sun.lwawt.macosx.LWCToolkit", "", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11645");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "Homebrew", "55.0", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11646");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "OpenJDK 64-Bit Server VM", "Java Virtual Machine Specification", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11647");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "", "Java Virtual Machine Specification", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11648");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "Java Virtual Machine Specification", "sun.awt.CGraphicsEnvironment", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11649");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "55.0", "OpenJDK Runtime Environment", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11650");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "", "/Users/piyadaketmala", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11651");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "aarch64", "\n", "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11652");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "", "\n", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11653");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "OpenJDK Runtime Environment", "sun.lwawt.macosx.CPrinterJob", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11654");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "", "piyadaketmala", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11655");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "Java Platform API Specification", ":", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11656");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "11", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11657");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "", "11.0.32.1+0", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11658");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "th", "", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11659");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "https://github.com/Homebrew/homebrew-core/issues", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11660");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "https://github.com/Homebrew/homebrew-core/issues", "piyadaketmala", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11661");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "11.0.32.1+0", "TH", "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11662");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "UTF-8", "OpenJDK 64-Bit Server VM", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11663");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "26.6.2", "sun.lwawt.macosx.LWCToolkit", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11664");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "55.0", "", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11665");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "TH", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11666");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "hi!", "aarch64", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11667");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "Java Platform API Specification", "/", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11668");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "/", "sun.lwawt.macosx.CPrinterJob", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11669");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "/", "\n", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11670");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "sun.lwawt.macosx.LWCToolkit", "hi!", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11671");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "th", "mixed mode", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11672");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "11", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11673");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "Oracle Corporation", "55.0", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11674");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "mixed mode", "sun.lwawt.macosx.CPrinterJob", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11675");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "piyadaketmala", "26.6.2", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11676");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "\n", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11677");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "hi!", "aarch64", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11678");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", ":", "", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11679");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "\n", "hi!", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11680");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "Java Platform API Specification", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11681");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "mixed mode", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11682");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "th", "piyadaketmala", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11683");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "", ":", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11684");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "Java Platform API Specification", "11.0.32.1+0", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11685");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "UTF-8", "", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11686");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "UTF-8", "sun.lwawt.macosx.CPrinterJob", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11687");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "aarch64", "hi!", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11688");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "sun.awt.CGraphicsEnvironment", "11.0.32.1+0", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11689");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "", "Homebrew", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11690");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "11.0.32.1+0", "\n", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11691");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "piyadaketmala", "/", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11692");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "11.0.32.1", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11693");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "11", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11694");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "sun.awt.CGraphicsEnvironment", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11695");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "Oracle Corporation", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11696");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "OpenJDK Runtime Environment", "sun.lwawt.macosx.LWCToolkit", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11697");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "", "UTF-8", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11698");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "/Users/piyadaketmala", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11699");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "sun.awt.CGraphicsEnvironment", "Mac OS X", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11700");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "TH", "th", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11701");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "/", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11702");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "55.0", "sun.lwawt.macosx.CPrinterJob", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11703");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "", "piyadaketmala", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11704");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", ":", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11705");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "TH", "piyadaketmala", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11706");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "UTF-8", ":", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11707");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", ":", "UTF-8", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11708");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "Java Virtual Machine Specification", "26.6.2", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11709");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "Java Platform API Specification", "sun.lwawt.macosx.CPrinterJob", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11710");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "sun.lwawt.macosx.LWCToolkit", "th", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11711");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "11.0.32.1+0", "", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11712");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "Homebrew", "11", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11713");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "aarch64", "UTF-8", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11714");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "Mac OS X", "", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11715");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "https://github.com/Homebrew/homebrew-core/issues", "Java Virtual Machine Specification", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11716");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "TH", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11717");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "mixed mode", "piyadaketmala", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11718");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "mixed mode", "th", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11719");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "TH", "UTF-8", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11720");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "sun.awt.CGraphicsEnvironment", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11721");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "TH", "55.0", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11722");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "th", "OpenJDK Runtime Environment", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11723");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "mixed mode", "OpenJDK 64-Bit Server VM", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11724");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "aarch64", "sun.awt.CGraphicsEnvironment", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11725");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "Oracle Corporation", "55.0", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11726");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "mixed mode", "hi!", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11727");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "TH", "OpenJDK 64-Bit Server VM", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11728");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "Homebrew", "sun.awt.CGraphicsEnvironment", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11729");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "Oracle Corporation", "Homebrew", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11730");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "11.0.32.1+0", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11731");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "11.0.32.1+0", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11732");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "th", "55.0", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11733");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "Homebrew", "https://github.com/Homebrew/homebrew-core/issues", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11734");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "sun.lwawt.macosx.LWCToolkit", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11735");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "sun.awt.CGraphicsEnvironment", "piyadaketmala", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11736");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "sun.awt.CGraphicsEnvironment", "11.0.32.1+0", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11737");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "sun.lwawt.macosx.LWCToolkit", "hi!", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11738");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "Java Platform API Specification", "Homebrew", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11739");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "Oracle Corporation", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test11740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11740");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "11.0.32.1+0", "Oracle Corporation", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11741");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "OpenJDK Runtime Environment", "OpenJDK Runtime Environment", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11742");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "hi!", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11743");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "", "piyadaketmala", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11744");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "Oracle Corporation", "11.0.32.1", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11745");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "11.0.32.1", "aarch64", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11746");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "aarch64", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11747");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "", "11.0.32.1", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11748");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", ":", "55.0", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11749");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "UTF-8", "Java Virtual Machine Specification", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11750");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "OpenJDK 64-Bit Server VM", "TH", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11751");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "piyadaketmala", "26.6.2", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11752");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "11.0.32.1+0", "11", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11753");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "sun.lwawt.macosx.CPrinterJob", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11754");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "55.0", "", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11755");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "", "Oracle Corporation", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11756");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "\n", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11757");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "aarch64", ":", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11758");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "OpenJDK 64-Bit Server VM", "UTF-8", "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11759");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "Homebrew", "", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11760");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "Homebrew", "55.0", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11761");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "hi!", "TH", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11762");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "OpenJDK 64-Bit Server VM", "11.0.32.1", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11763");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "sun.lwawt.macosx.CPrinterJob", "/Users/piyadaketmala", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11764");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "55.0", "11", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11765");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11766");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "aarch64", "UTF-8", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11767");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "OpenJDK 64-Bit Server VM", "OpenJDK 64-Bit Server VM", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11768");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "TH", "11.0.32.1+0", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11769");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", ":", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11770");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "55.0", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11771");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "sun.lwawt.macosx.LWCToolkit", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11772");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "UTF-8", "", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test11773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11773");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "mixed mode", "", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test11774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11774");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "UTF-8", "Homebrew", "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11775");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "Mac OS X", "Oracle Corporation", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11776");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "\n", "/Users/piyadaketmala", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11777");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "Homebrew", "sun.lwawt.macosx.LWCToolkit", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11778");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "sun.lwawt.macosx.LWCToolkit", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11779");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "aarch64", "aarch64", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11780");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "Java Virtual Machine Specification", "https://github.com/Homebrew/homebrew-core/issues", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11781");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "UTF-8", "/Users/piyadaketmala", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11782");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "Mac OS X", "OpenJDK Runtime Environment", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11783");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "UTF-8", "", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test11784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11784");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "Java Platform API Specification", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11785");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "th", "OpenJDK 64-Bit Server VM", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11786");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11787");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "", "sun.awt.CGraphicsEnvironment", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11788");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", ":", "hi!", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11789");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "11.0.32.1", "Homebrew", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11790");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "Java Virtual Machine Specification", "Homebrew", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11791");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "/", "OpenJDK 64-Bit Server VM", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11792");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "Java Virtual Machine Specification", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11793");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "OpenJDK Runtime Environment", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11794");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "/Users/piyadaketmala", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11795");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "OpenJDK Runtime Environment", "OpenJDK Runtime Environment", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11796");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "https://github.com/Homebrew/homebrew-core/issues", "/Users/piyadaketmala", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11797");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11798");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "sun.awt.CGraphicsEnvironment", "Homebrew", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11799");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "\n", "sun.lwawt.macosx.CPrinterJob", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11800");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "11", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11801");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11802");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "Java Platform API Specification", "th", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11803");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "UTF-8", "\n", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11804");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "TH", ":", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11805");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "55.0", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11806");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "sun.lwawt.macosx.LWCToolkit", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11807");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "mixed mode", "Java Platform API Specification", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11808");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "sun.lwawt.macosx.CPrinterJob", "", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11809");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "", "sun.awt.CGraphicsEnvironment", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11810");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "/Users/piyadaketmala", "Oracle Corporation", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11811");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "11.0.32.1", "hi!", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11812");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "Homebrew", "Java Platform API Specification", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11813");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "\n", "sun.lwawt.macosx.CPrinterJob", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11814");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "th", "TH", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11815");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "Java Virtual Machine Specification", "https://github.com/Homebrew/homebrew-core/issues", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11816");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11817");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "", "/", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11818");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "https://github.com/Homebrew/homebrew-core/issues", "", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11819");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "https://github.com/Homebrew/homebrew-core/issues", "th", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11820");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "", "", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11821");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "Mac OS X", "OpenJDK 64-Bit Server VM", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11822");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "", "Java Virtual Machine Specification", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11823");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", ":", "11", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11824");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", ":", "OpenJDK Runtime Environment", "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11825");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "UTF-8", "Homebrew", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11826");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "Java Platform API Specification", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11827");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "sun.lwawt.macosx.CPrinterJob", "TH", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11828");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "Homebrew", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11829");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "OpenJDK 64-Bit Server VM", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11830");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "11.0.32.1+0", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11831");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "11", "11", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11832");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "\n", "sun.lwawt.macosx.LWCToolkit", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11833");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "", "TH", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11834");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "hi!", "", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11835");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "OpenJDK Runtime Environment", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11836");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "Oracle Corporation", "OpenJDK 64-Bit Server VM", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11837");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "OpenJDK Runtime Environment", "hi!", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11838");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "piyadaketmala", "", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11839");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "26.6.2", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11840");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "hi!", "aarch64", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11841");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "aarch64", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11842");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11843");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "\n", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11844");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "hi!", "Java Platform API Specification", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11845");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "TH", ":", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11846");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "", "sun.lwawt.macosx.LWCToolkit", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11847");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "sun.lwawt.macosx.CPrinterJob", "OpenJDK Runtime Environment", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11848");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "TH", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11849");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "aarch64", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11850");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "Homebrew", "11.0.32.1", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11851");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "/", "sun.lwawt.macosx.CPrinterJob", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11852");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", ":", "11.0.32.1+0", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11853");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "OpenJDK 64-Bit Server VM", "aarch64", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11854");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "Oracle Corporation", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11855");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "", "sun.awt.CGraphicsEnvironment", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11856");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11857");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "sun.awt.CGraphicsEnvironment", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11858");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11859");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "th", "/", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11860");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "", "sun.lwawt.macosx.LWCToolkit", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11861");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "/Users/piyadaketmala", "", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11862");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "https://github.com/Homebrew/homebrew-core/issues", "Homebrew", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11863");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "Java Virtual Machine Specification", "mixed mode", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11864");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "Oracle Corporation", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11865");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "Java Platform API Specification", "/", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11866");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "11", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11867");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "sun.lwawt.macosx.LWCToolkit", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11868");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "sun.awt.CGraphicsEnvironment", "\n", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11869");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "", "55.0", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11870");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "/", "Oracle Corporation", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11871");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "hi!", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11872");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "", "sun.awt.CGraphicsEnvironment", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11873");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "th", "aarch64", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11874");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "", "", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11875");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "sun.lwawt.macosx.CPrinterJob", "OpenJDK 64-Bit Server VM", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11876");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "Java Virtual Machine Specification", "/Users/piyadaketmala", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11877");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11878");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "OpenJDK Runtime Environment", "sun.lwawt.macosx.CPrinterJob", "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11879");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "55.0", "OpenJDK 64-Bit Server VM", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11880");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "", "11", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11881");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "hi!", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11882");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "Java Platform API Specification", "Java Virtual Machine Specification", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11883");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "piyadaketmala", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11884");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "OpenJDK Runtime Environment", "Java Virtual Machine Specification", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11885");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "/Users/piyadaketmala", "11.0.32.1", "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11886");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "TH", "TH", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11887");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "11.0.32.1+0", "/", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11888");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "\n", "Homebrew", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11889");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "piyadaketmala", "TH", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11890");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "OpenJDK 64-Bit Server VM", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11891");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "11.0.32.1+0", "", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11892");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "26.6.2", "https://github.com/Homebrew/homebrew-core/issues", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11893");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "mixed mode", "11", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11894");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "11", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11895");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "Oracle Corporation", "55.0", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11896");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "55.0", "", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11897");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "TH", "/Users/piyadaketmala", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11898");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "Mac OS X", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11899");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "11", "OpenJDK 64-Bit Server VM", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11900");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "OpenJDK 64-Bit Server VM", "/Users/piyadaketmala", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11901");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "UTF-8", "11", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11902");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "mixed mode", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11903");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "/", "11", "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test11904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11904");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "/Users/piyadaketmala", "Mac OS X", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11905");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "https://github.com/Homebrew/homebrew-core/issues", "sun.awt.CGraphicsEnvironment", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11906");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "Oracle Corporation", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11907");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "/Users/piyadaketmala", "11.0.32.1+0", "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11908");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "\n", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11909");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "\n", "aarch64", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11910");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "UTF-8", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11911");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "hi!", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11912");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "Homebrew", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11913");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "\n", "\n", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11914");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "piyadaketmala", "/", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11915");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "11", "26.6.2", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11916");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "mixed mode", "/Users/piyadaketmala", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11917");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "Java Virtual Machine Specification", "26.6.2", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11918");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "UTF-8", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11919");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "OpenJDK 64-Bit Server VM", "11.0.32.1+0", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11920");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "11", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11921");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "\n", "OpenJDK 64-Bit Server VM", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11922");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "sun.lwawt.macosx.CPrinterJob", "sun.lwawt.macosx.CPrinterJob", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11923");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "hi!", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11924");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "UTF-8", "OpenJDK 64-Bit Server VM", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11925");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "11.0.32.1+0", "Homebrew", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11926");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "hi!", "26.6.2", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11927");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "/", "https://github.com/Homebrew/homebrew-core/issues", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11928");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "\n", "sun.lwawt.macosx.CPrinterJob", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11929");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "26.6.2", "", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11930");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "/", "piyadaketmala", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11931");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "Java Platform API Specification", "mixed mode", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11932");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "sun.lwawt.macosx.LWCToolkit", "sun.awt.CGraphicsEnvironment", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11933");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "Java Virtual Machine Specification", "https://github.com/Homebrew/homebrew-core/issues", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11934");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "", "OpenJDK 64-Bit Server VM", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11935");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "Homebrew", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11936");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "hi!", "26.6.2", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11937");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "mixed mode", "Oracle Corporation", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11938");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "piyadaketmala", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11939");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "Java Platform API Specification", ":", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11940");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "Oracle Corporation", "", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11941");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "/Users/piyadaketmala", "11.0.32.1+0", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11942");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "mixed mode", "sun.awt.CGraphicsEnvironment", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11943");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "26.6.2", "26.6.2", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11944");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "UTF-8", "aarch64", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11945");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "Oracle Corporation", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11946");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "Homebrew", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11947");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "sun.lwawt.macosx.CPrinterJob", "", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11948");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "mixed mode", "Java Virtual Machine Specification", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11949");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11950");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "55.0", "OpenJDK Runtime Environment", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11951");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11952");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "55.0", "Mac OS X", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11953");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "Oracle Corporation", "mixed mode", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11954");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "sun.awt.CGraphicsEnvironment", "", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test11955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11955");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "OpenJDK Runtime Environment", "sun.lwawt.macosx.LWCToolkit", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11956");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "/Users/piyadaketmala", "Homebrew", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11957");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "piyadaketmala", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11958");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "TH", "sun.awt.CGraphicsEnvironment", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11959");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "sun.lwawt.macosx.LWCToolkit", "", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11960");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "/Users/piyadaketmala", "/Users/piyadaketmala", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11961");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "OpenJDK Runtime Environment", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11962");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "hi!", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11963");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "th", "TH", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11964");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "Oracle Corporation", "OpenJDK Runtime Environment", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11965");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "Homebrew", "55.0", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11966");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "piyadaketmala", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11967");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "sun.lwawt.macosx.LWCToolkit", "hi!", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11968");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "55.0", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11969");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "piyadaketmala", "th", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11970");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11971");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "11.0.32.1", "th", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11972");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11973");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "TH", "th", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11974");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "Homebrew", "Oracle Corporation", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11975");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "Java Virtual Machine Specification", "Mac OS X", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11976");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "", "11", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11977");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "11", "", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11978");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "sun.awt.CGraphicsEnvironment", "/Users/piyadaketmala", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11979");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "Java Platform API Specification", "26.6.2", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11980");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11981");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "/", "aarch64", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11982");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "aarch64", "", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test11983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11983");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "sun.awt.CGraphicsEnvironment", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11984");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "Mac OS X", "th", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11985");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "", "UTF-8", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11986");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "sun.lwawt.macosx.CPrinterJob", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11987");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "sun.lwawt.macosx.CPrinterJob", "mixed mode", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11988");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "mixed mode", "Homebrew", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11989");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "aarch64", "11.0.32.1", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11990");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "OpenJDK Runtime Environment", "26.6.2", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11991");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "\n", "Mac OS X", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11992");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "OpenJDK 64-Bit Server VM", "th", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11993");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "/", "OpenJDK 64-Bit Server VM", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11994");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "hi!", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11995");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "sun.lwawt.macosx.CPrinterJob", "/", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11996");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "sun.lwawt.macosx.LWCToolkit", "11.0.32.1+0", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11997");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "OpenJDK Runtime Environment", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11998");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "", "Java Platform API Specification", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11999");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "sun.lwawt.macosx.LWCToolkit", ":", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test12000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test12000");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "/", "OpenJDK 64-Bit Server VM", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }
}

