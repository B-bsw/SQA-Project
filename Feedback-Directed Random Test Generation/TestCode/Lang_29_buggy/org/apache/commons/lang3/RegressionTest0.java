package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_AIX;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_JAVA_1_2;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VM_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "OpenJDK 64-Bit Server VM" + "'", str0, "OpenJDK 64-Bit Server VM");
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_95;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_UTIL_PREFS_PREFERENCES_FACTORY;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_AWT_PRINTERJOB;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "sun.lwawt.macosx.CPrinterJob" + "'", str0, "sun.lwawt.macosx.CPrinterJob");
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_VISTA;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_ENDORSED_DIRS;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.USER_COUNTRY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "TH" + "'", str0, "TH");
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_SOLARIS;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.OS_VERSION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "26.6.2" + "'", str0, "26.6.2");
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_JAVA_1_5;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VERSION_TRIMMED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "11.0.32.1" + "'", str0, "11.0.32.1");
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_HOME;
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_7;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_AWT_GRAPHICSENV;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "sun.awt.CGraphicsEnvironment" + "'", str0, "sun.awt.CGraphicsEnvironment");
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.OS_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Mac OS X" + "'", str0, "Mac OS X");
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VENDOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Homebrew" + "'", str0, "Homebrew");
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionInt("");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((float) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.LINE_SEPARATOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "\n" + "'", str0, "\n");
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.PATH_SEPARATOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + ":" + "'", str0, ":");
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_2000;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_RUNTIME_VERSION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "11.0.32.1+0" + "'", str0, "11.0.32.1+0");
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_JAVA_1_6;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_LIBRARY_PATH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:." + "'", str0, "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_SPECIFICATION_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Java Platform API Specification" + "'", str0, "Java Platform API Specification");
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_NT;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_LINUX;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_JAVA_1_7;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VM_VERSION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "11.0.32.1+0" + "'", str0, "11.0.32.1+0");
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_IO_TMPDIR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/" + "'", str0, "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VM_SPECIFICATION_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Java Virtual Machine Specification" + "'", str0, "Java Virtual Machine Specification");
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_CLASS_VERSION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "55.0" + "'", str0, "55.0");
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "Java Virtual Machine Specification", "TH", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.USER_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "piyadaketmala" + "'", str0, "piyadaketmala");
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_AWT_FONTS;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.USER_HOME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/Users/piyadaketmala" + "'", str0, "/Users/piyadaketmala");
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_XP;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_COMPILER;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.OS_ARCH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "aarch64" + "'", str0, "aarch64");
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_AWT_HEADLESS;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_JAVA_1_1;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionFloat("sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.USER_DIR;
// flaky "1) test00047(org.apache.commons.lang3.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out" + "'", str0, "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.USER_LANGUAGE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "th" + "'", str0, "th");
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.FILE_SEPARATOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/" + "'", str0, "/");
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VM_SPECIFICATION_VENDOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Oracle Corporation" + "'", str0, "Oracle Corporation");
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_SPECIFICATION_VENDOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Oracle Corporation" + "'", str0, "Oracle Corporation");
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_MAC_OSX;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_RUNTIME_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "OpenJDK Runtime Environment" + "'", str0, "OpenJDK Runtime Environment");
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionFloat(":");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        int int0 = org.apache.commons.lang3.SystemUtils.JAVA_VERSION_INT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1132 + "'", int0 == 1132);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "OpenJDK Runtime Environment", "Mac OS X", "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.FILE_ENCODING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "UTF-8" + "'", str0, "UTF-8");
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_98;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_JAVA_1_4;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VERSION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "11.0.32.1" + "'", str0, "11.0.32.1");
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.AWT_TOOLKIT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "sun.lwawt.macosx.LWCToolkit" + "'", str0, "sun.lwawt.macosx.LWCToolkit");
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.isJavaAwtHeadless();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_HP_UX;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Mac OS X", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VENDOR_URL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "https://github.com/Homebrew/homebrew-core/issues" + "'", str0, "https://github.com/Homebrew/homebrew-core/issues");
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_IRIX;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_OS2;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_SPECIFICATION_VERSION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "11" + "'", str0, "11");
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VM_VENDOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Homebrew" + "'", str0, "Homebrew");
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionFloat("OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 64.0f + "'", float1 == 64.0f);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((float) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "26.6.2", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.USER_TIMEZONE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        java.io.File file0 = org.apache.commons.lang3.SystemUtils.getUserHome();
        java.lang.Class<?> wildcardClass1 = file0.getClass();
        org.junit.Assert.assertNotNull(file0);
        org.junit.Assert.assertEquals(file0.getParent(), "/Users");
        org.junit.Assert.assertEquals(file0.toString(), "/Users/piyadaketmala");
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_EXT_DIRS;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        int[] intArray1 = org.apache.commons.lang3.SystemUtils.toJavaVersionIntArray("");
        java.lang.Class<?> wildcardClass2 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 0 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "/", "Java Virtual Machine Specification", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_JAVA_1_3;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VM_SPECIFICATION_VERSION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "11" + "'", str0, "11");
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_MAC;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS_ME;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", ":", "/Users/piyadaketmala", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("OpenJDK 64-Bit Server VM", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "aarch64", "th", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_CLASS_PATH;
// flaky "2) test00086(org.apache.commons.lang3.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes" + "'", str0, "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "/Users/piyadaketmala", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        java.lang.String str0 = org.apache.commons.lang3.SystemUtils.JAVA_VM_INFO;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mixed mode" + "'", str0, "mixed mode");
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_UNIX;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionInt("11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1132.0f + "'", float1 == 1132.0f);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionFloat("26.6.2");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 26.62f + "'", float1 == 26.62f);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        boolean boolean0 = org.apache.commons.lang3.SystemUtils.IS_OS_SUN_OS;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((-1.0f));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "", "", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("mixed mode", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Oracle Corporation", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.awt.CGraphicsEnvironment", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionInt("26.6.2");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2662.0f + "'", float1 == 2662.0f);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        int[] intArray1 = org.apache.commons.lang3.SystemUtils.toJavaVersionIntArray("hi!");
        java.lang.Class<?> wildcardClass2 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(100.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("11.0.32.1", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        float float0 = org.apache.commons.lang3.SystemUtils.JAVA_VERSION_FLOAT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 11.032f + "'", float0 == 11.032f);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11.0.32.1", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(1132);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "OpenJDK 64-Bit Server VM", "/", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "/Users/piyadaketmala", "sun.awt.CGraphicsEnvironment", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        java.io.File file0 = org.apache.commons.lang3.SystemUtils.getUserDir();
        java.lang.Class<?> wildcardClass1 = file0.getClass();
        org.junit.Assert.assertNotNull(file0);
// flaky "3) test00110(org.apache.commons.lang3.RegressionTest0)":         org.junit.Assert.assertEquals(file0.getParent(), "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu");
// flaky "1) test00110(org.apache.commons.lang3.RegressionTest0)":         org.junit.Assert.assertEquals(file0.toString(), "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionInt("Homebrew");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionFloat("hi!");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionFloat("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((float) (-1L));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionInt("Mac OS X");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11.0.32.1", "th");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((float) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11.0.32.1", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionFloat("");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "11.0.32.1", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("th", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((float) 1132);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "OpenJDK Runtime Environment", "Java Virtual Machine Specification", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionInt("mixed mode");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("11.0.32.1", "th");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionFloat("Mac OS X");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "11.0.32.1+0", ":", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(2662.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch(":", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((float) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "Oracle Corporation", "Homebrew", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionInt("aarch64");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6400.0f + "'", float1 == 6400.0f);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("th", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionInt("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10587.0f + "'", float1 == 10587.0f);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.lwawt.macosx.LWCToolkit", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Oracle Corporation", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch(":", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("", "11");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Java Virtual Machine Specification", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11.0.32.1+0", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("OpenJDK Runtime Environment", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionFloat("mixed mode");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(0.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "11", "Java Virtual Machine Specification", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionFloat("11");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 11.0f + "'", float1 == 11.0f);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "UTF-8", "", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        int[] intArray1 = org.apache.commons.lang3.SystemUtils.toJavaVersionIntArray("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        java.lang.Class<?> wildcardClass2 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((float) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((float) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "/Users/piyadaketmala", "aarch64", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        int[] intArray1 = org.apache.commons.lang3.SystemUtils.toJavaVersionIntArray("11");
        java.lang.Class<?> wildcardClass2 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 11 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        java.io.File file0 = org.apache.commons.lang3.SystemUtils.getJavaHome();
        java.lang.Class<?> wildcardClass1 = file0.getClass();
        org.junit.Assert.assertNotNull(file0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "aarch64", "th", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        int[] intArray1 = org.apache.commons.lang3.SystemUtils.toJavaVersionIntArray("https://github.com/Homebrew/homebrew-core/issues");
        java.lang.Class<?> wildcardClass2 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.lwawt.macosx.CPrinterJob", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionFloat("th");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionFloat("/");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((float) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("TH", "TH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("piyadaketmala", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "OpenJDK 64-Bit Server VM", "/", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.awt.CGraphicsEnvironment", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionInt("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 339.0f + "'", float1 == 339.0f);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionFloat("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.129f + "'", float1 == 3.129f);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionFloat("https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "/Users/piyadaketmala", "26.6.2", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("11.0.32.1+0", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.apache.commons.lang3.SystemUtils systemUtils0 = new org.apache.commons.lang3.SystemUtils();
        java.lang.Class<?> wildcardClass1 = systemUtils0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "mixed mode", "piyadaketmala", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch(":", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(10.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Mac OS X", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("hi!", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionFloat("55.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 55.0f + "'", float1 == 55.0f);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionFloat("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.129f + "'", float1 == 3.129f);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionInt("55.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5500.0f + "'", float1 == 5500.0f);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionInt("OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "", ":", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("hi!", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionFloat("/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("OpenJDK 64-Bit Server VM", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("th", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionFloat("OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionInt("/");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11.0.32.1+0", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(11.032f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Java Virtual Machine Specification", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        int[] intArray1 = org.apache.commons.lang3.SystemUtils.toJavaVersionIntArray("OpenJDK Runtime Environment");
        java.lang.Class<?> wildcardClass2 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Java Virtual Machine Specification", "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        int[] intArray1 = org.apache.commons.lang3.SystemUtils.toJavaVersionIntArray("Homebrew");
        java.lang.Class<?> wildcardClass2 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionFloat("piyadaketmala");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Java Platform API Specification", "55.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "26.6.2", "\n", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "piyadaketmala", "hi!", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "https://github.com/Homebrew/homebrew-core/issues", "Homebrew", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        int[] intArray1 = org.apache.commons.lang3.SystemUtils.toJavaVersionIntArray("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        java.lang.Class<?> wildcardClass2 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionInt("https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("OpenJDK Runtime Environment", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("11", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("piyadaketmala", "/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Java Virtual Machine Specification", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        int[] intArray1 = org.apache.commons.lang3.SystemUtils.toJavaVersionIntArray(":");
        java.lang.Class<?> wildcardClass2 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("11.0.32.1+0", ":");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "https://github.com/Homebrew/homebrew-core/issues", "", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "TH", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.awt.CGraphicsEnvironment", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("th", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "Homebrew", "55.0", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "sun.lwawt.macosx.CPrinterJob", "aarch64", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11.0.32.1", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "sun.lwawt.macosx.LWCToolkit", "Java Platform API Specification", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.lwawt.macosx.LWCToolkit", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionInt("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 339.0f + "'", float1 == 339.0f);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "piyadaketmala", "Homebrew", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "OpenJDK Runtime Environment", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "th", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(10587.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionInt("UTF-8");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 800.0f + "'", float1 == 800.0f);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionInt("sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "11", "Java Platform API Specification", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "/Users/piyadaketmala", "", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionInt("TH");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((float) 10L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        int[] intArray1 = org.apache.commons.lang3.SystemUtils.toJavaVersionIntArray("piyadaketmala");
        java.lang.Class<?> wildcardClass2 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Java Virtual Machine Specification", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "TH", "Oracle Corporation", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "Mac OS X", "th", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((float) (-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "UTF-8", "aarch64", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "", "hi!", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionFloat("Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionFloat("11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 11.032f + "'", float1 == 11.032f);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "OpenJDK 64-Bit Server VM", "", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("OpenJDK Runtime Environment", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        int[] intArray1 = org.apache.commons.lang3.SystemUtils.toJavaVersionIntArray("26.6.2");
        java.lang.Class<?> wildcardClass2 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 26, 6, 2 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionInt("11.0.32.1");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1132.0f + "'", float1 == 1132.0f);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((float) 1L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        int[] intArray1 = org.apache.commons.lang3.SystemUtils.toJavaVersionIntArray("sun.lwawt.macosx.CPrinterJob");
        java.lang.Class<?> wildcardClass2 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionFloat("Homebrew");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionInt("Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "sun.lwawt.macosx.LWCToolkit", "55.0", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((float) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.lwawt.macosx.CPrinterJob", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "sun.lwawt.macosx.LWCToolkit", "hi!", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "", "mixed mode", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "Java Platform API Specification", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionInt("sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        java.io.File file0 = org.apache.commons.lang3.SystemUtils.getJavaIoTmpDir();
        java.lang.Class<?> wildcardClass1 = file0.getClass();
        org.junit.Assert.assertNotNull(file0);
        org.junit.Assert.assertEquals(file0.getParent(), "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn");
        org.junit.Assert.assertEquals(file0.toString(), "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T");
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionInt("th");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "/", "55.0", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionInt("sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.lwawt.macosx.LWCToolkit", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch(":", "TH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("UTF-8", "th");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("26.6.2", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Oracle Corporation", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "piyadaketmala", "sun.lwawt.macosx.LWCToolkit", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionFloat("Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((float) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(800.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("\n", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "/", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("hi!", "11");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionInt("11");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1100.0f + "'", float1 == 1100.0f);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "\n", "/Users/piyadaketmala", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11.0.32.1+0", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "https://github.com/Homebrew/homebrew-core/issues", "", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "OpenJDK Runtime Environment", "", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        int[] intArray1 = org.apache.commons.lang3.SystemUtils.toJavaVersionIntArray("TH");
        java.lang.Class<?> wildcardClass2 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("OpenJDK Runtime Environment", "11");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionFloat("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.969127f + "'", float1 == 5.969127f);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("OpenJDK Runtime Environment", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((float) 100L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("55.0", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionInt("hi!");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionFloat("aarch64");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 64.0f + "'", float1 == 64.0f);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionInt("OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6400.0f + "'", float1 == 6400.0f);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(339.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(26.62f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionFloat("11.0.32.1");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 11.032f + "'", float1 == 11.032f);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "Java Platform API Specification", "/", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("OpenJDK Runtime Environment", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("55.0", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "piyadaketmala", "sun.awt.CGraphicsEnvironment", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "Homebrew", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "TH", "Java Virtual Machine Specification", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("https://github.com/Homebrew/homebrew-core/issues", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "OpenJDK Runtime Environment", "th", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((float) 0L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        int[] intArray1 = org.apache.commons.lang3.SystemUtils.toJavaVersionIntArray("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        java.lang.Class<?> wildcardClass2 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/Users/piyadaketmala", ":");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("UTF-8", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Java Virtual Machine Specification", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(1.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("piyadaketmala", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "Java Platform API Specification", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionInt("/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "\n", "UTF-8", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Mac OS X", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((float) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "\n", "hi!", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionFloat("\n");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "piyadaketmala", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "", "Mac OS X", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionInt("Oracle Corporation");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Oracle Corporation", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "TH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.lwawt.macosx.CPrinterJob", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("https://github.com/Homebrew/homebrew-core/issues", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(55.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionInt(":");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "https://github.com/Homebrew/homebrew-core/issues", "UTF-8", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "55.0", "Homebrew", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("mixed mode", "th");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((int) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("26.6.2", "/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.awt.CGraphicsEnvironment", "/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        int[] intArray1 = org.apache.commons.lang3.SystemUtils.toJavaVersionIntArray("55.0");
        java.lang.Class<?> wildcardClass2 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 55, 0 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11.0.32.1+0", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        int[] intArray1 = org.apache.commons.lang3.SystemUtils.toJavaVersionIntArray("Java Virtual Machine Specification");
        java.lang.Class<?> wildcardClass2 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.lwawt.macosx.CPrinterJob", "TH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        int[] intArray1 = org.apache.commons.lang3.SystemUtils.toJavaVersionIntArray("UTF-8");
        java.lang.Class<?> wildcardClass2 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 8, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "OpenJDK Runtime Environment", "Homebrew", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "11.0.32.1+0", "https://github.com/Homebrew/homebrew-core/issues", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionInt("\n");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.awt.CGraphicsEnvironment", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((float) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("hi!", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11.0.32.1", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch(":", "/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("aarch64", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        int[] intArray1 = org.apache.commons.lang3.SystemUtils.toJavaVersionIntArray("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        java.lang.Class<?> wildcardClass2 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("UTF-8", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionFloat("UTF-8");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 8.0f + "'", float1 == 8.0f);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.awt.CGraphicsEnvironment", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("UTF-8", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "UTF-8", "11.0.32.1", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("OpenJDK Runtime Environment", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(1132.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "https://github.com/Homebrew/homebrew-core/issues", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("UTF-8", "11");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("th", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        int[] intArray1 = org.apache.commons.lang3.SystemUtils.toJavaVersionIntArray("sun.lwawt.macosx.LWCToolkit");
        java.lang.Class<?> wildcardClass2 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11.0.32.1+0", "TH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        int[] intArray1 = org.apache.commons.lang3.SystemUtils.toJavaVersionIntArray("Java Platform API Specification");
        java.lang.Class<?> wildcardClass2 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "Mac OS X", "26.6.2", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.awt.CGraphicsEnvironment", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.lwawt.macosx.LWCToolkit", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("26.6.2", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "", "hi!", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(1100.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("OpenJDK 64-Bit Server VM", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("55.0", "TH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.lwawt.macosx.CPrinterJob", ":");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "55.0", "OpenJDK Runtime Environment", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionFloat("Oracle Corporation");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("piyadaketmala", "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("mixed mode", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("55.0", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "26.6.2", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch(":", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        int[] intArray1 = org.apache.commons.lang3.SystemUtils.toJavaVersionIntArray("OpenJDK 64-Bit Server VM");
        java.lang.Class<?> wildcardClass2 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 64, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("TH", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "/Users/piyadaketmala", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("mixed mode", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "Java Virtual Machine Specification", "/Users/piyadaketmala", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.lwawt.macosx.LWCToolkit", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("TH", "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        int[] intArray1 = org.apache.commons.lang3.SystemUtils.toJavaVersionIntArray("\n");
        java.lang.Class<?> wildcardClass2 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "th", "sun.lwawt.macosx.LWCToolkit", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("hi!", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.lwawt.macosx.LWCToolkit", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala", "/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("mixed mode", "th");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((float) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("TH", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("OpenJDK 64-Bit Server VM", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        int[] intArray1 = org.apache.commons.lang3.SystemUtils.toJavaVersionIntArray("11.0.32.1");
        java.lang.Class<?> wildcardClass2 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 11, 0, 32, 1 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.awt.CGraphicsEnvironment", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Oracle Corporation", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("piyadaketmala", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Homebrew", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("UTF-8", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/Users/piyadaketmala", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("th", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Oracle Corporation", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionInt("Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("11", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "Java Platform API Specification", "TH", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        int[] intArray1 = org.apache.commons.lang3.SystemUtils.toJavaVersionIntArray("Mac OS X");
        java.lang.Class<?> wildcardClass2 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        int[] intArray1 = org.apache.commons.lang3.SystemUtils.toJavaVersionIntArray("mixed mode");
        java.lang.Class<?> wildcardClass2 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        int[] intArray1 = org.apache.commons.lang3.SystemUtils.toJavaVersionIntArray("/");
        java.lang.Class<?> wildcardClass2 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "Oracle Corporation", "aarch64", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("OpenJDK 64-Bit Server VM", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "OpenJDK 64-Bit Server VM", "/Users/piyadaketmala", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("11.0.32.1", "/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "/Users/piyadaketmala", "sun.lwawt.macosx.LWCToolkit", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11.0.32.1", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        int[] intArray1 = org.apache.commons.lang3.SystemUtils.toJavaVersionIntArray("Oracle Corporation");
        java.lang.Class<?> wildcardClass2 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "11.0.32.1", "Java Platform API Specification", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "11.0.32.1", "th", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("TH", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "\n", "th", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("th", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "/Users/piyadaketmala", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Homebrew", "11");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("mixed mode", "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("sun.awt.CGraphicsEnvironment", "th");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(5500.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionInt("piyadaketmala");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "Mac OS X", "11.0.32.1+0", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("11.0.32.1", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("th", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("26.6.2", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(3.129f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "", "piyadaketmala", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("UTF-8", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((float) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "55.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "UTF-8", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "11", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "sun.lwawt.macosx.LWCToolkit", "55.0", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("11.0.32.1+0", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.awt.CGraphicsEnvironment", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "11.0.32.1", "sun.awt.CGraphicsEnvironment", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        int[] intArray1 = org.apache.commons.lang3.SystemUtils.toJavaVersionIntArray("aarch64");
        java.lang.Class<?> wildcardClass2 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 64, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "th", "\n", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("piyadaketmala", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("UTF-8", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", "11.0.32.1", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "\n", "11", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11.0.32.1", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("\n", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("TH", "/");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        float float1 = org.apache.commons.lang3.SystemUtils.toJavaVersionInt("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/out", ":", "th", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        boolean boolean1 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("26.6.2", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "/", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-29k_g1cu/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("OpenJDK Runtime Environment", "55.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("OpenJDK Runtime Environment", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("piyadaketmala", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("\n", "th");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Java Virtual Machine Specification", "11");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}
