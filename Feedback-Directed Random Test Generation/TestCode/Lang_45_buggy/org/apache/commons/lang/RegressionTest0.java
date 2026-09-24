package org.apache.commons.lang;

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hi!", (int) (short) -1, (int) 'a', "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hi!", (int) (short) 100, 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) (byte) 0, (int) 'a', "Hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) (short) -1, "", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hi!", (int) '4', (int) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 52, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hi!", (int) (byte) 0, "", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!" + "'", str2, "Hi!");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hi!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!" + "'", str2, "Hi!");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) '4', (int) '#', "Hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        char[] charArray2 = new char[] {};
        java.lang.String str3 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray2);
        java.lang.String str4 = org.apache.commons.lang.WordUtils.initials("", charArray2);
        java.lang.Class<?> wildcardClass5 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hi!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hi!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!" + "'", str2, "Hi!");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hi!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) (short) 0, 0, "Hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hi!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hi!", 10, (int) (short) 10, "Hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 10, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray3);
        java.lang.String str5 = org.apache.commons.lang.WordUtils.initials("", charArray3);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) (short) 0, (int) (short) 0, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hi!", 0, (int) '#', "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hi!", (int) (short) 1, "", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hi!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!" + "'", str2, "Hi!");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) (short) 1, "", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hi!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (-1), "Hi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!" + "'", str1, "HI!");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HI!", (int) (byte) 1, 1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        char[] charArray3 = new char[] { '4', '4' };
        java.lang.String str4 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray3);
        java.lang.Class<?> wildcardClass5 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!" + "'", str4, "Hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("H", (int) (short) 100, "HI!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HI!", (-1), (int) '#', "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!" + "'", str4, "HI!");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray3);
        java.lang.String str5 = org.apache.commons.lang.WordUtils.initials("", charArray3);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi!" + "'", str6, "Hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!" + "'", str1, "HI!");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HI!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!" + "'", str2, "HI!");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("H", (int) ' ', 10, "Hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 32, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hi!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!" + "'", str2, "Hi!");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.commons.lang.WordUtils wordUtils0 = new org.apache.commons.lang.WordUtils();
        java.lang.Class<?> wildcardClass1 = wordUtils0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("H", (int) (byte) -1, (int) (byte) 1, "HI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) (short) 10, "HI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hi!", (int) ' ', "hi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hi!", (int) ' ', "h", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!" + "'", str4, "Hi!");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("h", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hi!", 10, "HI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("H", (int) (byte) 1, 0, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hi!", (int) (short) 100, (int) (short) 100, "Hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) (byte) 10, (int) (short) 0, "H");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("H", (int) ' ', (int) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 32, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HI!", (-1), (int) (short) 10, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!" + "'", str4, "HI!");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        char[] charArray5 = new char[] { '#', ' ', '4' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray5);
        java.lang.Class<?> wildcardClass8 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', ' ', '4' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi!" + "'", str6, "Hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("H", (int) 'a', "", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hi!", (int) (short) 100, "hi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hi!", 100, "Hi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!" + "'", str4, "Hi!");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("hi!", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("h", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hi!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hi!", 10, (-1), "Hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 10, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("H", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HI!", (int) (short) 1, (int) (byte) 1, "H");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HH" + "'", str4, "HH");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        char[] charArray5 = new char[] { '#', '4', '4', '4' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray5);
        java.lang.Class<?> wildcardClass7 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi!" + "'", str6, "Hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HI!", (int) (short) -1, (int) (short) 0, "H");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("h", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hH" + "'", str1, "hH");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HH", (int) (byte) 10, "h", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HH" + "'", str4, "HH");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hH", (-1), "", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hH" + "'", str4, "hH");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hH" + "'", str1, "hH");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("H", (int) ' ', "hi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hi!", (int) (byte) 100, "H", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        char[] charArray7 = new char[] { '#', '4', '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("", charArray7);
        java.lang.Class<?> wildcardClass11 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hi!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        char[] charArray6 = new char[] { '#', ' ', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.Class<?> wildcardClass10 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#', ' ', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HI!", (int) 'a', (int) (byte) 10, "hH");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 97, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HH" + "'", str1, "HH");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) (byte) 1, 0, "HH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("H", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HI!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!" + "'", str2, "HI!");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("h", (int) (byte) 100, (int) (byte) -1, "Hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("hH", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hH", (int) (short) -1, (int) (short) 10, "HI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hH" + "'", str4, "hH");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hi!", (int) (short) 1, "", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!" + "'", str4, "Hi!");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("h", 10, (int) 'a', "h");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 10, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("H", (int) (byte) 100, (-1), "HI!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) (short) 10, (int) (short) 100, "HH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!" + "'", str1, "hI!");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("H", (int) (short) 1, "hi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hh" + "'", str1, "hh");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hh" + "'", str1, "Hh");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HI!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!" + "'", str2, "HI!");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hh", 10, (int) (byte) 1, "hh");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 10, length 2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hh" + "'", str1, "Hh");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hh" + "'", str1, "Hh");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hh" + "'", str1, "Hh");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("H", (-1), (int) (byte) 100, "Hh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) '4', (int) (byte) 10, "hI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray3);
        java.lang.String str5 = org.apache.commons.lang.WordUtils.initials("", charArray3);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hH", 1, 0, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hh" + "'", str1, "hh");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hI!", (int) (byte) -1, "", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hI!" + "'", str4, "hI!");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hH", (int) ' ', "hI!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hH" + "'", str4, "hH");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hh", (-1), (int) (byte) 100, "H");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hh" + "'", str4, "Hh");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hH", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hH" + "'", str2, "hH");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hi!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!" + "'", str2, "Hi!");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hh", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hh" + "'", str14, "hh");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) 'a', "HI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hI!", (int) '#', 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 35, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!" + "'", str1, "hI!");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("H", (int) '4', "", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HH", (int) '#', "", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HH" + "'", str4, "HH");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hH", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hH" + "'", str15, "hH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!" + "'", str2, "Hi!");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hh", 1, (int) (byte) 0, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hh" + "'", str1, "hh");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HH" + "'", str12, "HH");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", 0, "HH", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HH", 10, (int) (short) -1, "h");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 10, length 2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hI!", (int) (byte) 0, (int) ' ', "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hI!" + "'", str4, "hI!");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) (short) -1, "HH", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hh", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hh" + "'", str2, "hh");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hI!", (int) ' ', "H", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hI!" + "'", str4, "hI!");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hh", (int) (short) 0, (int) ' ', "HI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hh" + "'", str4, "Hh");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hH" + "'", str1, "hH");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hH", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hI!" + "'", str10, "hI!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hh", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hh" + "'", str12, "hh");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hi!", 0, 1, "hI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhI!" + "'", str4, "hhI!");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("H", (int) ' ', (int) (byte) 10, "hh");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 32, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hh", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hh" + "'", str8, "hh");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hh", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hh" + "'", str2, "Hh");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!" + "'", str2, "hI!");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HH", (int) '#', "hH", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HH" + "'", str4, "HH");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hh", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hh" + "'", str14, "Hh");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("H", 0, "HI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HH", (int) (byte) 100, 10, "HI!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("H", 100, "HI!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("H", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HH", (int) (short) 0, (-1), "h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HH" + "'", str4, "HH");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) (short) 0, (int) (byte) 0, "hI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HH" + "'", str1, "HH");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hh" + "'", str1, "Hh");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("H", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hH", (int) (short) 10, "", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hH" + "'", str4, "hH");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hI!", (int) (byte) -1, "hhI!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhI!IhhI!!" + "'", str4, "hhhI!IhhI!!");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (-1), 0, "hI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!" + "'", str1, "hHI!");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!" + "'", str1, "Hhi!");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhI!IhhI!!", (int) 'a', (int) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 97, length 11");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!", (int) (byte) 10, (int) (short) 0, "hH");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 10, length 4");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!" + "'", str1, "hI!");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) '#', "Hh", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhI!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhI!" + "'", str2, "hhI!");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hh", (int) '4', (int) (short) 100, "hH");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 52, length 2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!" + "'", str1, "Hhi!");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hh", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hh" + "'", str2, "hh");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!" + "'", str2, "Hhi!");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhI!", 10, (int) 'a', "hHI!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 10, length 4");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhI!IhhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hh", 10, "Hhi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hh" + "'", str4, "Hh");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("hh", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hh" + "'", str2, "Hh");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("H", 0, (int) '4', "HH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhi!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!" + "'", str2, "hhi!");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHI!", (int) ' ', 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 32, length 4");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhI!IhhI!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhI!IhhI!!" + "'", str2, "hhhI!IhhI!!");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhI!IhhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHi!iHHi!!" + "'", str1, "HHHi!iHHi!!");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!" + "'", str1, "hhi!");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("H", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hi!", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hh", charArray9);
        java.lang.Class<?> wildcardClass19 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hh" + "'", str18, "hh");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        char[] charArray2 = new char[] { ' ' };
        java.lang.String str3 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { ' ' });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("h", (int) (short) 1, "Hi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hh" + "'", str12, "Hh");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhi!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!" + "'", str2, "hhi!");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray3);
        java.lang.String str5 = org.apache.commons.lang.WordUtils.initials("", charArray3);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("Hh", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hh" + "'", str6, "Hh");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhi!", (int) '4', (int) (short) 1, "HHHi!iHHi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 52, length 4");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!" + "'", str1, "hHI!");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hH", (int) (short) 10, "hh", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hH" + "'", str4, "hH");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HH" + "'", str1, "HH");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHi!iHHi!!" + "'", str1, "HHHi!iHHi!!");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!" + "'", str1, "HHI!");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hh", (-1), "Hi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hh" + "'", str4, "Hh");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HI!", (int) (short) 0, "hHHi!iHHi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!" + "'", str4, "HI!");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        char[] charArray3 = new char[] { ' ' };
        java.lang.String str4 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray3);
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!", charArray3);
        java.lang.Class<?> wildcardClass6 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { ' ' });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Hhi!" + "'", str5, "Hhi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhI!IhhI!!", (int) (byte) 10, "HI!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhI!IhhI!HI!!" + "'", str4, "hhhI!IhhI!HI!!");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("h", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!!" + "'", str1, "Hhhi!ihhi!!");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHi!" + "'", str1, "HHi!");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("H", (int) 'a', "Hh", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhi!", (int) '#', "Hi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!" + "'", str4, "hhi!");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!", 0, "HHI!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!hHHI!iHHI!!" + "'", str4, "HHHI!hHHI!iHHI!!");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HI!", (int) (short) 0, (int) (byte) 1, "Hhi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhi!" + "'", str4, "HHhi!");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHi!iHHi!!" + "'", str1, "hHHi!iHHi!!");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!" + "'", str1, "hhi!");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("H", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hH", (int) (byte) 1, (int) (byte) 10, "HHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hH" + "'", str4, "hH");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHi!iHHi!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHi!iHHi!!" + "'", str2, "hHHi!iHHi!!");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHI!" + "'", str1, "hhHI!");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (-1), "hhI!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hi!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhI!" + "'", str1, "hhI!");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!!" + "'", str1, "Hhhi!ihhi!!");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hh", (int) (short) 0, "hhhI!IhhI!HI!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhhhI!IhhI!HI!!h" + "'", str4, "HhhhI!IhhI!HI!!h");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHi!iHHi!!" + "'", str1, "HHHi!iHHi!!");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!IhhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhI!IhhI!!" + "'", str1, "hhhI!IhhI!!");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHi!iHHi!!", (int) (short) 10, "HHHi!iHHi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHi!iHHi!!" + "'", str4, "HHHi!iHHi!!");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HH", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HH" + "'", str2, "HH");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHI!", (int) ' ', (int) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 32, length 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhi!", (int) (byte) 10, "hH", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhi!" + "'", str4, "HHhi!");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHi!iHHi!hi!!H" + "'", str1, "hHHHi!iHHi!hi!!H");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHI!hHHI!iHHI!!", (int) '4', (int) (byte) 10, "HHHi!iHHi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 52, length 16");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", 0, "Hhi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHi!iHHi!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHi!iHHi!!" + "'", str2, "hHHi!iHHi!!");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhi!", (int) (byte) 0, "Hi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!" + "'", str4, "hhi!");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhi!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhi!" + "'", str2, "HHhi!");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!Hhhi!Ihhi!!" + "'", str1, "hhhi!Hhhi!Ihhi!!");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!hHHI!iHHI!!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!hHHI!iHHI!!" + "'", str2, "HHHI!hHHI!iHHI!!");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HH", 1, (int) (byte) 100, "HHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HH" + "'", str4, "HH");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!" + "'", str1, "Hhi!");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!", (int) (byte) 10, "HhhhI!IhhI!HI!!h", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!" + "'", str4, "Hhi!");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhhhI!IhhI!HI!!h", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhhhI!IhhI!HI!!h" + "'", str2, "HhhhI!IhhI!HI!!h");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhI!IhhI!HI!!" + "'", str1, "hhhI!IhhI!HI!!");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!Hhhi!Ihhi!!" + "'", str1, "Hhhi!Hhhi!Ihhi!!");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHI!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHI!" + "'", str2, "hhHI!");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hi!!" + "'", str1, "Hhhi!ihhi!hi!!");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHHi!iHHi!hi!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hI!" + "'", str14, "hI!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihhi!!", (int) (byte) -1, "hhHI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihhi!!" + "'", str4, "Hhhi!ihhi!!");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hI!", 0, (int) (byte) -1, "hhI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hI!" + "'", str4, "hI!");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!" + "'", str1, "Hhi!");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hH", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hH" + "'", str2, "hH");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHI!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!" + "'", str2, "HHI!");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!Hhhi!Ihhi!!" + "'", str1, "hhhi!Hhhi!Ihhi!!");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHI!", (int) (short) -1, "hH", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHI!" + "'", str4, "hhHI!");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("h", (int) (byte) 100, (int) (short) 1, "Hhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhI!IhhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhhI!IhhI!!" + "'", str1, "HhhI!IhhI!!");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHI!", (-1), (int) (short) 100, "hI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!" + "'", str4, "HHI!");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhhI!IhhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHi!iHHi!!" + "'", str1, "hHHi!iHHi!!");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhhhI!IhhI!HI!!h", (int) (byte) 1, "", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhhhI!IhhI!HI!!h" + "'", str4, "HhhhI!IhhI!HI!!h");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhI!IhhI!HI!!", (int) (short) 100, (int) (byte) 100, "hHI!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 14");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hi!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHI!", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hh" + "'", str13, "Hh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHI!" + "'", str16, "hHI!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hi!!" + "'", str1, "Hhhi!ihhi!hi!!");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhI!IhhI!!" + "'", str1, "hhhI!IhhI!!");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhhi!ihhi!!" + "'", str1, "Hhhi!hhhi!ihhi!!");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhhi!ihhi!!", (int) '#', "HH", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhhi!ihhi!!" + "'", str4, "Hhhi!hhhi!ihhi!!");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        char[] charArray5 = new char[] { 'a', '4', 'a' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray5);
        java.lang.Class<?> wildcardClass8 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { 'a', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HI!" + "'", str7, "HI!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("H", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hH", (int) (byte) -1, 0, "Hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!" + "'", str4, "Hi!");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!" + "'", str1, "HHI!");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhi!", 0, "hH", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhi!" + "'", str4, "HHhi!");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        char[] charArray2 = new char[] {};
        java.lang.String str3 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray2);
        java.lang.String str4 = org.apache.commons.lang.WordUtils.initials("h", charArray2);
        java.lang.Class<?> wildcardClass5 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!" + "'", str1, "Hhi!");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!hHHI!iHHI!!" + "'", str1, "HHHI!hHHI!iHHI!!");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HH", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HH" + "'", str2, "HH");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hI!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!" + "'", str2, "hI!");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!hHHI!iHHI!!" + "'", str1, "hHHI!hHHI!iHHI!!");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hH", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hH" + "'", str2, "hH");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!IhhI!HI!!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hh" + "'", str13, "Hh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhI!IhhI!HI!!" + "'", str14, "hhhI!IhhI!HI!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hi!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHi!iHHi!!", (int) (byte) 100, "", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHi!iHHi!!" + "'", str4, "hHHi!iHHi!!");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihhi!hi!!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihhi!hi!!" + "'", str2, "Hhhi!ihhi!hi!!");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HH", (int) (byte) 100, "", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HH" + "'", str4, "HH");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhI!IhhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!!" + "'", str1, "Hhhi!ihhi!!");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!Hhhi!Ihhi!!", 10, (int) 'a', "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!Hhhi!Ihhi!!" + "'", str4, "Hhhi!Hhhi!Ihhi!!");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!" + "'", str2, "Hi!");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hH", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHI!" + "'", str1, "hhHI!");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHHI!IHHI!!" + "'", str1, "hHHI!HHHI!IHHI!!");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!Hhhi!Ihhi!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!Hhhi!Ihhi!!" + "'", str2, "Hhhi!Hhhi!Ihhi!!");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHI!", (-1), (int) (byte) -1, "Hhi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHI!" + "'", str4, "hhHI!");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!" + "'", str1, "Hhi!");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("Hh", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hh" + "'", str8, "Hh");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HH", (int) (byte) 0, "hHHI!HHHI!IHHI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HH" + "'", str4, "HH");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhI!IhhI!HI!!", (int) (short) 10, (int) (byte) 1, "hHHHi!iHHi!hi!!H");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhI!IhhI!hHHHi!iHHi!hi!!H" + "'", str4, "hhhI!IhhI!hHHHi!iHHi!hi!!H");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hh", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hh" + "'", str2, "Hh");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhhhI!IhhI!HI!!h", (int) (byte) 0, (int) ' ', "HH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhhhI!IhhI!HI!!h" + "'", str4, "HhhhI!IhhI!HI!!h");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHi!iHHi!hi!!H", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHi!iHHi!hi!!H" + "'", str2, "hHHHi!iHHi!hi!!H");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhI!IhhI!hHHHi!iHHi!hi!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhhI!IhhI!hHHHi!iHHi!hi!!H" + "'", str1, "HhhI!IhhI!hHHHi!iHHi!hi!!H");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hi!!" + "'", str1, "Hhhi!ihhi!hi!!");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hH", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hI!" + "'", str15, "hI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHI!hHHI!iHHI!!", (int) (short) -1, (int) '4', "Hhhi!ihhi!hi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!hHHI!iHHI!!" + "'", str4, "HHHI!hHHI!iHHI!!");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhhhI!IhhI!HI!!h", (int) (short) 100, "", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhhhI!IhhI!HI!!h" + "'", str4, "HhhhI!IhhI!HI!!h");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!" + "'", str1, "Hhhi!");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hi!", 1, "Hhhhi!ihhi!hi!!h", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!" + "'", str4, "Hi!");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihhi!hi!!h", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhI!IhhI!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHi!iHHi!hi!!" + "'", str1, "HHHi!iHHi!hi!!");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!hHHI!iHHI!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhhi!ihhi!!" + "'", str2, "Hhhi!hhhi!ihhi!!");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihhi!!" + "'", str1, "hhhi!ihhi!!");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhI!IhhI!HI!!h" + "'", str1, "hhhhI!IhhI!HI!!h");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hh", (int) (byte) 10, 100, "Hhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 10, length 2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhhi!ihhi!!" + "'", str1, "Hhhi!hhhi!ihhi!!");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        char[] charArray7 = new char[] { '#', '4', '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("HhhhI!IhhI!HI!!h", charArray7);
        java.lang.Class<?> wildcardClass11 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HhhhI!IhhI!HI!!h" + "'", str10, "HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhhI!IhhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhhI!IhhI!!" + "'", str1, "HhhI!IhhI!!");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!" + "'", str1, "Hhi!");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("hi!", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!HHHI!IHHI!!" + "'", str1, "HHHI!HHHI!IHHI!!");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHI!HHHI!IHHI!!", (int) '#', "hhhI!IhhI!hHHHi!iHHi!hi!!H", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!HHHI!IHHI!!" + "'", str4, "HHHI!HHHI!IHHI!!");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhi!" + "'", str1, "HHhi!");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!", (int) (byte) 10, (int) ' ', "Hhhi!hhhi!ihhi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 10, length 4");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhhi!ihhi!!" + "'", str1, "Hhhi!hhhi!ihhi!!");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHi!iHHi!!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHi!iHHi!!" + "'", str2, "HHHi!iHHi!!");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhI!IhhI!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihhi!!" + "'", str2, "Hhhi!ihhi!!");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        char[] charArray9 = new char[] { '#', '4', '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hh", charArray9);
        java.lang.Class<?> wildcardClass15 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hh" + "'", str14, "Hh");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("H", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hh", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray9);
        java.lang.Class<?> wildcardClass19 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hh" + "'", str17, "hh");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray3);
        java.lang.String str5 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray3);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("h", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hI!" + "'", str5, "hI!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhI!IhhI!HI!!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhI!IhhI!HI!!" + "'", str2, "hhhI!IhhI!HI!!");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhI!IhhI!hHHHi!iHHi!hi!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhI!IhhI!hHHHi!iHHi!hi!!H", (int) '4', "", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhI!IhhI!hHHHi!iHHi!hi!!H" + "'", str4, "hhhI!IhhI!hHHHi!iHHi!hi!!H");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhhI!IhhI!!" + "'", str1, "HhhI!IhhI!!");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhhi!ihhi!!" + "'", str1, "hhhi!hhhi!ihhi!!");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hi!", (-1), "HI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!" + "'", str1, "Hhi!");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhhI!IhhI!hHHHi!iHHi!hi!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhI!IhhI!hHHHi!iHHi!hi!!H" + "'", str1, "hhhI!IhhI!hHHHi!iHHi!hi!!H");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHI!hHHI!iHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhI!IhhI!hHHHi!iHHi!hi!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHi!iHHi!HhhhI!IhhI!HI!!h" + "'", str1, "HHHi!iHHi!HhhhI!IhhI!HI!!h");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hh" + "'", str1, "Hh");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hi!", (int) (short) 10, "HhhI!IhhI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hi!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!" + "'", str2, "Hi!");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHI!", 100, "Hhhi!ihhi!hi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!" + "'", str4, "hHI!");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hh", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hh" + "'", str2, "hh");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!hi!!h" + "'", str1, "Hhhhi!ihhi!hi!!h");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("H", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hh", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!hHHI!iHHI!!", charArray10);
        java.lang.Class<?> wildcardClass21 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hh" + "'", str18, "hh");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHHI!hHHI!iHHI!!" + "'", str20, "hHHI!hHHI!iHHI!!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhhi!ihhi!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhhi!ihhi!!" + "'", str2, "Hhhi!hhhi!ihhi!!");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hh" + "'", str1, "Hh");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HI!", (int) (byte) 10, "hI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!" + "'", str4, "HI!");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!HHHI!IHHI!!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!HHHI!IHHI!!" + "'", str2, "HHHI!HHHI!IHHI!!");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!" + "'", str2, "Hhi!");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!HHHI!IHHI!!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!HHHI!IHHI!!" + "'", str2, "HHHI!HHHI!IHHI!!");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhI!IhhI!HI!!", 10, "hhhi!ihhi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhI!IhhI!hhhi!ihhi!!HI!!" + "'", str4, "hhhI!IhhI!hhhi!ihhi!!HI!!");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("H", 1, "hHHI!hHHI!iHHI!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("h", (int) (byte) 10, (int) (byte) -1, "hhhhI!IhhI!HI!!h");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 10, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hH", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hh" + "'", str7, "Hh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhhhI!IhhI!HI!!h" + "'", str1, "HhhhI!IhhI!HI!!h");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhi!", 0, 0, "hhhI!IhhI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhI!IhhI!!" + "'", str4, "hhhI!IhhI!!");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("h", (int) (short) 10, "hhhi!ihhi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!hi!!h" + "'", str1, "Hhhhi!ihhi!hi!!h");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!Hhhi!Ihhi!!", (int) (short) 1, "hh", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str4, "Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!hhhi!ihhi!!", (int) (short) 1, (int) (short) 0, "Hh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHh" + "'", str4, "hHh");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHi!iHHi!!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHi!iHHi!!" + "'", str2, "hHHi!iHHi!!");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHi!iHHi!hi!!", 0, (int) (short) 1, "HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHi!iHHi!hi!!" + "'", str4, "HHHHi!iHHi!hi!!");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhI!IhhI!!", 0, (int) (byte) 1, "hhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!hhhi!ihhi!!" + "'", str4, "hhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hh", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HHHi!iHHi!!", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("H", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HhhI!IhhI!hHHHi!iHHi!hi!!H", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hh" + "'", str13, "Hh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hi!", (int) (short) 100, "hhhI!IhhI!hhhi!ihhi!!HI!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!" + "'", str4, "Hi!");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!", (int) (byte) 100, "hH", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!" + "'", str4, "Hhi!");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("H", (int) (short) 10, "hhHI!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhhI!IhhI!hHHHi!iHHi!hi!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hi!", 0, "hH", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhI!IhhI!hHHHi!iHHi!hi!!H", (int) (short) 100, 10, "hhhi!hhhi!ihhi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 26");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhi!hhhi!ihhi!!", 1, (int) (short) 1, "HHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!HHHI!IHHI!!" + "'", str4, "hHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        char[] charArray7 = new char[] { '#', '4', '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("HHHi!iHHi!!", charArray7);
        java.lang.Class<?> wildcardClass11 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hH", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihhi!hi!!", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hH" + "'", str11, "hH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhi!ihhi!hi!!" + "'", str12, "Hhhi!ihhi!hi!!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!IhhI!hHHHi!iHHi!hi!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhI!IhhI!hHHHi!iHHi!hi!!H" + "'", str1, "hhhI!IhhI!hHHHi!iHHi!hi!!H");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHi!iHHi!!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHi!iHHi!!" + "'", str2, "HHHi!iHHi!!");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        char[] charArray5 = new char[] { ' ' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("Hhi!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hhhI!IhhI!HI!!", charArray5);
        java.lang.Class<?> wildcardClass10 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hhi!" + "'", str7, "Hhi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!HHHI!IHHI!!" + "'", str1, "HHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihhi!hi!!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihhi!hi!!" + "'", str2, "Hhhi!ihhi!hi!!");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("h", (int) 'a', 1, "hh");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 97, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!HHHI!IHHI!!" + "'", str1, "HHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("", charArray6);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHi!iHHi!hi!!H", (int) ' ', "HhhhI!IhhI!HI!!h", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHi!iHHi!hi!!H" + "'", str4, "hHHHi!iHHi!hi!!H");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHi!iHHi!!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHi!iHHi!!" + "'", str2, "HHHi!iHHi!!");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        char[] charArray10 = new char[] { '#', '4', '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!", charArray10);
        java.lang.Class<?> wildcardClass17 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '4', '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhi!" + "'", str16, "hhi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhI!IhhI!hhhi!ihhi!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str1, "Hhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!" + "'", str2, "Hhhi!");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHHI!IHHI!!" + "'", str1, "hHHI!HHHI!IHHI!!");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!IHHI!HI!!H" + "'", str1, "hHHHI!IHHI!HI!!H");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHi!iHHi!hi!!", (int) (byte) 100, (int) '#', "HHHHI!HHHI!IHHI!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 14");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHI!HHHI!IHHI!!", (-1), (int) (byte) 10, "HHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHI!HHHIHHHI!HHHI!IHHI!!" + "'", str4, "HHHHI!HHHIHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHI!hHHI!iHHI!!", (int) (short) -1, (int) (short) 0, "h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hi!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hI!" + "'", str14, "hI!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!ihhi!hi!!h" + "'", str1, "hhhhi!ihhi!hi!!h");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hhI!", charArray7);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hH", charArray7);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHHi!iHHi!!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHI!HHHIHHHI!HHHI!IHHI!!", (int) (byte) 1, 0, "HH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHH" + "'", str4, "HHH");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihhi!hi!!", (int) (byte) 10, "HHH", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihhi!hi!!" + "'", str4, "Hhhi!ihhi!hi!!");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("H", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHi!iHHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihhi!!" + "'", str1, "Hhhi!ihhi!!");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihhi!!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihhi!!" + "'", str2, "Hhhi!ihhi!!");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHi!" + "'", str1, "HHi!");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhhi!ihhi!!" + "'", str1, "Hhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihhi!!" + "'", str1, "hhhi!ihhi!!");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hi!", (int) (byte) 100, (int) (byte) 0, "HHHi!iHHi!HhhhI!IhhI!HI!!h");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray5);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!HHHI!IHHI!!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!HHHI!IHHI!!" + "'", str2, "HHHI!HHHI!IHHI!!");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhH" + "'", str1, "HhH");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) (short) 1, "hHI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!Hhhi!Ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!Hhhi!Ihhi!!" + "'", str1, "hhhi!Hhhi!Ihhi!!");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        char[] charArray4 = new char[] { '4', '4' };
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihhi!hi!!", charArray4);
        java.lang.Class<?> wildcardClass7 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Hi!" + "'", str5, "Hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hhhi!ihhi!hi!!" + "'", str6, "Hhhi!ihhi!hi!!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihhi!hhhi!ihhi!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hh", 100, "HHH", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hh" + "'", str4, "hh");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHi!iHHi!HhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHi!iHHi!HhhhI!IhhI!HI!!h" + "'", str1, "HHHi!iHHi!HhhhI!IhhI!HI!!h");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", (-1), "HhH", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str4, "Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihhi!hi!!h" + "'", str1, "Hhhhi!ihhi!hi!!h");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str1, "Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        char[] charArray11 = new char[] {};
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("H", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hh", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray11);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hi!", charArray11);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hhi!", charArray11);
        java.lang.Class<?> wildcardClass23 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hh" + "'", str19, "hh");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhi!" + "'", str22, "hhi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("H", charArray9);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hH", charArray9);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray9);
        java.lang.Class<?> wildcardClass19 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hH" + "'", str17, "hH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HH" + "'", str18, "HH");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!" + "'", str1, "hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("Hhhi!Hhhi!Ihhi!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHi!" + "'", str1, "hHi!");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("h", (-1), "hhhhi!hhhi!ihhi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhi!" + "'", str1, "HHhi!");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hh", (int) '#', "hh", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hh" + "'", str4, "hh");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhi!", (int) (byte) -1, (int) (byte) 10, "hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhi!" + "'", str4, "HHhi!");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("h", charArray4);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("HI!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hI!" + "'", str6, "hI!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHi!" + "'", str1, "hHi!");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!", (int) (byte) 10, (int) (byte) 100, "HHHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!" + "'", str4, "Hhhhhhhhhihh!hhHhhhhhhhhihh!hhIhhhhhhhhihh!hh!");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!" + "'", str1, "HhI!");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHI!HHHI!IHHI!!", (int) (byte) 100, "hhi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!HHHI!IHHI!!" + "'", str4, "hHHI!HHHI!IHHI!!");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHI!hHHI!iHHI!!", (int) (short) 1, (int) (byte) 0, "hhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhi!hhhi!ihhi!!" + "'", str4, "Hhhhhi!hhhi!ihhi!!");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!hHHI!iHHI!!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!hHHI!iHHI!!" + "'", str2, "HHHI!hHHI!iHHI!!");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!Hhhi!Ihhi!!", 0, (int) (short) 0, "hhhI!IhhI!hhhi!ihhi!!HI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhI!IhhI!hhhi!ihhi!!HI!!" + "'", str4, "hhhI!IhhI!hhhi!ihhi!!HI!!");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHI!" + "'", str1, "HhHI!");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHi!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHi!" + "'", str2, "hHi!");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("H", (int) (short) 100, (int) 'a', "Hhhi!Hhhi!Ihhi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray8);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("H", charArray8);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhI!IhhI!HI!!", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhI!IhhI!HI!!" + "'", str16, "hhhI!IhhI!HI!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhi!hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!HHHI!IHHI!!" + "'", str1, "hHHHI!HHHI!IHHI!!");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhI!IhhI!hHHHi!iHHi!hi!!H", (int) (byte) -1, (int) (byte) 0, "hhhi!ihhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!ihhi!!" + "'", str4, "hhhi!ihhi!!");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhi!hhhi!ihhi!!", 0, "Hhhi!hhhi!ihhi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!hhhi!ihhi!!" + "'", str4, "hhhi!hhhi!ihhi!!");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhI!IhhI!hhhi!ihhi!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhhI!IhhI!hhhi!ihhi!!HI!!" + "'", str1, "HhhI!IhhI!hhhi!ihhi!!HI!!");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHHIHHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHI!", (int) (byte) 0, 10, "hhI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!" + "'", str4, "hHI!");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHi!iHHi!!", (int) (byte) 10, (int) (short) 10, "hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!" + "'", str4, "hHHi!iHHi!hHHHHHHHHIHH!HHhHHHHHHHHIHH!HHiHHHHHHHHIHH!HH!");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!HHHI!IHHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhhi!ihhi!!" + "'", str1, "Hhhi!hhhi!ihhi!!");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHHI!IHHI!HI!!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhI!IhhI!hhhi!ihhi!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhi!hhhi!ihhi!!", (int) '4', (int) '#', "hhhi!Hhhi!Ihhi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 52, length 18");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHh", (int) (byte) 1, 10, "hhhhI!IhhI!HI!!h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHh" + "'", str4, "hHh");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!ihhi!hi!!h", (int) ' ', "hHHHI!HHHI!IHHI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!ihhi!hi!!h" + "'", str4, "Hhhhi!ihhi!hi!!h");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihhi!hhhi!ihhi!!hi!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihhi!hhhi!ihhi!!hi!!" + "'", str2, "Hhhi!ihhi!hhhi!ihhi!!hi!!");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hh", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hh" + "'", str2, "hh");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHi!iHHi!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHi!iHHi!HhhhI!IhhI!HI!!h", (int) (short) 1, 1, "Hhhhi!ihhi!hi!!h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhhi!ihhi!hi!!h" + "'", str4, "HHhhhi!ihhi!hi!!h");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhhI!IhhI!hhhi!ihhi!!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str1, "hHHi!iHHi!HHHI!IHHI!!hi!!");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHi!iHHi!!", (int) (byte) 1, 0, "hHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHi!iHHi!HHHI!IHHI!!hi!!" + "'", str4, "hhHHi!iHHi!HHHI!IHHI!!hi!!");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHi!iHHi!HHHI!IHHI!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhhI!IhhI!hhhi!ihhi!!HI!!" + "'", str1, "HhhI!IhhI!hhhi!ihhi!!HI!!");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("H", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hH", charArray10);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HH", charArray10);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("H", charArray10);
        java.lang.Class<?> wildcardClass21 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hH" + "'", str18, "hH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HH" + "'", str19, "HH");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!Hhhi!Ihhi!!", (int) (byte) 10, 0, "hhHI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!Hhhi!hhHI!" + "'", str4, "Hhhi!Hhhi!hhHI!");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHHi!iHHi!HHHI!IHHI!!hi!!", (int) '4', 0, "hHHHI!HHHI!IHHI!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 52, length 26");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHh", (int) (short) 0, (int) (short) 0, "HH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HH" + "'", str4, "HH");
    }
}

