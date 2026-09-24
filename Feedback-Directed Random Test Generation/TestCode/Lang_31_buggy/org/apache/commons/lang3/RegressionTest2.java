package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test01001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01001");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!" + "'", str1, "hi!hi!hi!");
    }

    @Test
    public void test01002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01002");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", 67);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                   " + "'", str2, "                                                                   ");
    }

    @Test
    public void test01003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01003");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!                                                                                                   ", '#', 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01004");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("!!!", "!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!" + "'", str2, "!!!");
    }

    @Test
    public void test01005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01005");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!", "hiihiihiihiihihiihiihiihiihii", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01006");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("44444444444444444444444444444444444444444444444444444444444444444444                           ", "", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test01007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01007");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                ", 95, 32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                             " + "'", str3, "...                             ");
    }

    @Test
    public void test01008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01008");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                !!h!h!h!h!hh!h!h!h!h!                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01009");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("!         ");
        java.lang.String[] strArray6 = new java.lang.String[] { "                              !                                                                 ", "Hi!" };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("!ih!!ih", strArray3, strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                 H                                                 ", strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!", "         " });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "                              !                                                                 ", "Hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                              !                                                                 ih                              !                                                                                               !                                                                 ih" + "'", str7, "                              !                                                                 ih                              !                                                                                               !                                                                 ih");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test01010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01010");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH", "                                                           hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH" + "'", str2, "!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH");
    }

    @Test
    public void test01011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01011");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("Hi!hi!hi!h                                                                                                    ", "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!h                                                                                                    " + "'", str2, "Hi!hi!hi!h                                                                                                    ");
    }

    @Test
    public void test01012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01012");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HHH", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01013");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01014");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", "Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        " + "'", str2, "hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ");
    }

    @Test
    public void test01015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01015");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("HHH", "          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHH" + "'", str2, "HHH");
    }

    @Test
    public void test01016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01016");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("                             hi", strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "!", "" };
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray12, "hi!");
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray12, "!");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16, "                                  ");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                 Hi                                                 ", strArray8, strArray16);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "!", "" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                  " + "'", str18, "                                  ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                                 Hi                                                 " + "'", str19, "                                                 Hi                                                 ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test01017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01017");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hihihihih                                  !ihihihih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHIHIHIH                                  !IHIHIHIH" + "'", str1, "HIHIHIHIH                                  !IHIHIHIH");
    }

    @Test
    public void test01018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01018");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH" + "'", str1, "!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH");
    }

    @Test
    public void test01019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01019");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "...                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01020");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!!hi!", 0, "hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!!hi!" + "'", str3, "hi!!hi!");
    }

    @Test
    public void test01021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01021");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01022");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01023");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01024");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi" + "'", str1, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test01025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01025");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 ", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01026");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "!                                                                                                   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test01027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01027");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01028");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!!", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!" + "'", str2, "!!");
    }

    @Test
    public void test01029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01029");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI", "!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIhi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!!" + "'", str3, "HIhi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!!");
    }

    @Test
    public void test01030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01030");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "H                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01031");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih", 9, 95);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!ih!ihih!i!!h!ih!ih!ih" + "'", str3, "!ih!ih!ihih!i!!h!ih!ih!ih");
    }

    @Test
    public void test01032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01032");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hi", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01033");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                !", "                                                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test01034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01034");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", "!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01035");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01036");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("HI!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01037");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", (int) (short) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                    " + "'", str3, "                                                                                                    ");
    }

    @Test
    public void test01038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01038");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("HI!                                                                                                 ", "Hi!hi!hi!h                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!                                                                                                 " + "'", str2, "HI!                                                                                                 ");
    }

    @Test
    public void test01039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01039");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", "", 0);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "!");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test01040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01040");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        " + "'", str2, "hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ");
    }

    @Test
    public void test01041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01041");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                 ", "!                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01042");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("h!ih!ih!ih", ' ', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01043");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                              !                                                                 ", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              !                                                                 " + "'", str2, "                              !                                                                 ");
    }

    @Test
    public void test01044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01044");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hihihihih                                  !ihihihih", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01045");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                 H                                                 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 99 + "'", int1 == 99);
    }

    @Test
    public void test01046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01046");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!                                                                                                   ", "hihihihih                                  !ihihihih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01047");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", "!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       " + "'", str2, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ");
    }

    @Test
    public void test01048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01048");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "!ih!!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01049");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01050");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 131 + "'", int1 == 131);
    }

    @Test
    public void test01051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01051");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h" });
    }

    @Test
    public void test01052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01052");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hih                                                                                             ", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test01053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01053");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                                                                                ", "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01054");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                 Hi                                                 ", "h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
    }

    @Test
    public void test01055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01055");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                  !", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                  !" });
    }

    @Test
    public void test01056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01056");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                             h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01057");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h", 33, 95);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test01058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01058");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str1, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test01059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01059");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hihihihi!                                  hihihihih", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01060");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi", (int) (short) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
    }

    @Test
    public void test01061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01061");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                ", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01062");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("!", "                                                           hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!" + "'", str3, "!");
    }

    @Test
    public void test01063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01063");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!         ", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01064");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce(" ", "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", "hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hihi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test01065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01065");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "HHH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01066");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, "                              !                                                                 ih                              !                                                                                               !                                                                 ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01067");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                             ", "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", "                                                              !                                  ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test01068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01068");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hihihi!                                  hihihihih", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihihi!                      ..." + "'", str2, "hihihi!                      ...");
    }

    @Test
    public void test01069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01069");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01070");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                                                          ", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 " + "'", str2, "                                                                                                 ");
    }

    @Test
    public void test01071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01071");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01072");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!", "!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I", "hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hihi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                                                                                     ", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str4, "!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test01073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01073");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hiihiihiihiihihiihiihiihiihii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01074");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!", "h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 88 + "'", int2 == 88);
    }

    @Test
    public void test01075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01075");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "HI!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01076");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!", "!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01077");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01078");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                 ", "                             hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                 " });
    }

    @Test
    public void test01079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01079");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                  !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!" + "'", str1, "!");
    }

    @Test
    public void test01080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01080");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                   ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01081");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!h", (int) (short) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!h" + "'", str3, "!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!h");
    }

    @Test
    public void test01082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01082");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                             hi", 'a', (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01083");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hi!hi!hi!hi!hihi!hi!hi!hi!hi!", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01084");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("!                                      hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!hi!hi!", "                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01085");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("i", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i" + "'", str2, "i");
    }

    @Test
    public void test01086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01086");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!" + "'", str2, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test01087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01087");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                              !                                                                HI!h                              !                                                                                               !                                                                 ih", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              !                                                                HI!h                              !                                                                                               !                                                                 ih" + "'", str2, "                              !                                                                HI!h                              !                                                                                               !                                                                 ih");
    }

    @Test
    public void test01088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01088");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hihihi!                      ...", '4', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01089");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                !!h!h!h!h!hh!h!h!h!h!                                ", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                !!h!h!h!h!hh!h!h!h!h!                                " + "'", str2, "                                !!h!h!h!h!hh!h!h!h!h!                                ");
    }

    @Test
    public void test01090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01090");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", "!ih!ih!ihih!i!!h!ih!ih!ih", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01091");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", (int) (byte) 1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 3, (int) (byte) 1);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test01092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01092");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!", "HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01093");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                ", "hihihi!                      ...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test01094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01094");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01095");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str2, "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test01096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01096");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01097");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01098");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", '#', (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01099");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!hi!hi!" + "'", str1, "Hi!hi!hi!");
    }

    @Test
    public void test01100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01100");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01101");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                !", 33, "Hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                !" + "'", str3, "                                                                                                !");
    }

    @Test
    public void test01102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01102");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("HH", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01103");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("...                             ", "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01104");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hihihi!                      ...", "                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01105");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("!         ", 30, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test01106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01106");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("!ih                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih" + "'", str1, "!ih");
    }

    @Test
    public void test01107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01107");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                           ", 100, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test01108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01108");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("!                                ", "!                                ", 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!                                !                                !                                !                                !                                " + "'", str3, "!                                !                                !                                !                                !                                ");
    }

    @Test
    public void test01109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01109");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                              !                                                                 ih                              !                                                                                               !                                                                 ih", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                              !                                                                 ih                              !                                                                                               !                                                                 ih" });
    }

    @Test
    public void test01110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01110");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "!ih                             ", (java.lang.CharSequence) "HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01111");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "hihihi!                      ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01112");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween(" ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "hi");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test01113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01113");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("!                                !                                !                                !                                !                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!                                !                                !                                !                                !" + "'", str1, "!                                !                                !                                !                                !");
    }

    @Test
    public void test01114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01114");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                ", "                                !!h!h!h!h!hh!h!h!h!h!                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01115");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01116");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", "hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01117");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("!                                                                                                   ", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  " + "'", str2, "                                                                                                  ");
    }

    @Test
    public void test01118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01118");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", "                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01119");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                 Hi                                                 ", "h!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01120");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                ", (int) (short) 1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                " + "'", str3, "                                !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                ");
    }

    @Test
    public void test01121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01121");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!                                      hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!hi!hi!", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!                                      hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!hi!hi!" + "'", str2, "!                                      hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!hi!hi!");
    }

    @Test
    public void test01122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01122");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01123");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("         !", "hi!hi!hi!", 34);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "         !" });
    }

    @Test
    public void test01124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01124");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!                                !                                !                                !                                !                                ", "!ih!!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01125");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                             h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01126");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h", "!                                      hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!hi!hi!", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01127");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!", "44444444444444444444444444444444444444444444444444444444444444444444                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01128");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01129");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("!ih                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih" + "'", str1, "!ih");
    }

    @Test
    public void test01130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01130");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                              !                                  ", "!                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                              !                                  " + "'", str2, "                                                              !                                  ");
    }

    @Test
    public void test01131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01131");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                             hi");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                             ", "hi" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                             hi" + "'", str2, "                             hi");
    }

    @Test
    public void test01132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01132");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "!                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01133");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                ", ' ', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test01134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01134");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!" + "'", str1, "!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!");
    }

    @Test
    public void test01135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01135");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01136");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h" + "'", str2, "hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test01137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01137");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(charSequence0, (java.lang.CharSequence) "                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01138");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01139");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!ih", "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01140");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                              ! ", 49, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "             !" + "'", str3, "             !");
    }

    @Test
    public void test01141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01141");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                              !                                                                 ", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                              !                                                                 " });
    }

    @Test
    public void test01142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01142");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HHH", "                              !                                                                HI!h                              !                                                                                               !                                                                 ih", 88);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HHH" });
    }

    @Test
    public void test01143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01143");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                              !                                                                HI!h                              !                                                                                               !                                                                 ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01144");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01145");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "HI!                                                                                                 ", (java.lang.CharSequence) "                                                              !                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01146");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                 ", 0, "hi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                 " + "'", str3, "                                 ");
    }

    @Test
    public void test01147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01147");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01148");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "HI!Hi!                                                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!Hi!                                                                                       " + "'", str1, "hI!Hi!                                                                                       ");
    }

    @Test
    public void test01149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01149");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                                 Hi                                                 ", "HH", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01150");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                             hi", "Hi!", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01151");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01152");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!!!", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01153");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                  ", "                                  !", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01154");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "Hi!hi!hi!h                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01155");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("H", 97, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################################H################################################" + "'", str3, "################################################H################################################");
    }

    @Test
    public void test01156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01156");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                              !                                                                HI!h                              !                                                                                               !                                                                 ih", '#', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01157");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                ", (java.lang.CharSequence) "!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test01158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01158");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                   ", "HI!", "!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                   " + "'", str3, "                                                                                                                                   ");
    }

    @Test
    public void test01159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01159");
        java.lang.CharSequence[] charSequenceArray0 = null;
        int int1 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequenceArray0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test01160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01160");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi" + "'", str1, "hi");
    }

    @Test
    public void test01161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01161");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("HI", "!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI" + "'", str2, "HI");
    }

    @Test
    public void test01162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01162");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                  !");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                  ", "!" });
    }

    @Test
    public void test01163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01163");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", (-1), '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        " + "'", str3, "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ");
    }

    @Test
    public void test01164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01164");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase(" ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01165");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("             !", "                              !                                                                 ih                              !                                                                                               !                                                                 ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01166");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test01167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01167");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("!!", (int) 'a', 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test01168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01168");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01169");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                    ", "HH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test01170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01170");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!", "                                                 Hi                                                 ", "                                                                                                  ", 67);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str4, "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test01171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01171");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", (int) (byte) 1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', 29, 88);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 29 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test01172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01172");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih" + "'", str1, "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih");
    }

    @Test
    public void test01173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01173");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01174");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Hi", 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaHi" + "'", str3, "aaaaaaaaHi");
    }

    @Test
    public void test01175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01175");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                              !                                                                HI!h                              !                                                                                               !                                                                 ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!                                                                HI!h                              !                                                                                               !                                                                 ih" + "'", str1, "!                                                                HI!h                              !                                                                                               !                                                                 ih");
    }

    @Test
    public void test01176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01176");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("HI!                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!" + "'", str1, "HI!");
    }

    @Test
    public void test01177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01177");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                             hi", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01178");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", "hI!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01179");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("hi!                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test01180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01180");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                  ", "Hi!", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01181");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("Hi", "!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01182");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str1, "                                  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test01183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01183");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01184");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!h", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01185");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!", "44444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01186");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH" + "'", str1, "!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH");
    }

    @Test
    public void test01187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01187");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("H                               ", "                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01188");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("44444444444444444444444444444444444444444444444444444444444444444444                           ", "                                                                                                !");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01189");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("!                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!                               " + "'", str1, "!                               ");
    }

    @Test
    public void test01190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01190");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("Hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01191");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI!Hi!                                                                                       ", (int) '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!Hi!                                                                                       " + "'", str3, "HI!Hi!                                                                                       ");
    }

    @Test
    public void test01192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01192");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", (int) (byte) 1, "                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test01193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01193");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", "                             hi!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "h");
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test01194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01194");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("             !", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01195");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi" + "'", str2, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test01196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01196");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("                                !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                ", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01197");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("!ih", "H                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih" + "'", str2, "!ih");
    }

    @Test
    public void test01198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01198");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", (int) (byte) 10, " ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       " + "'", str3, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ");
    }

    @Test
    public void test01199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01199");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01200");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01201");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!" + "'", str1, "!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!");
    }

    @Test
    public void test01202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01202");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("HH", "hI!                                                                                                 ", "HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HH" + "'", str3, "HH");
    }

    @Test
    public void test01203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01203");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                           hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!", "                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                           hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!" + "'", str2, "                                                           hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test01204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01204");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                              !                                                                 ih                              !                                                                                               !                                                                 ih", "          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 280 + "'", int2 == 280);
    }

    @Test
    public void test01205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01205");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444                             hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01206");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "!ih!ih!ihih!i!!h!ih!ih!ih", (java.lang.CharSequence) "hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hihi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "!ih!ih!ihih!i!!h!ih!ih!ih" + "'", charSequence2, "!ih!ih!ihih!i!!h!ih!ih!ih");
    }

    @Test
    public void test01207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01207");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("!ih!!ihaaa", "hihihihi!                                  hihihihih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01208");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", (int) '#', "h!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i" + "'", str3, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i");
    }

    @Test
    public void test01209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01209");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", "!!!                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01210");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "!                                !                                !                                !                                !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!                                !                                !                                !                                !" + "'", str1, "!                                !                                !                                !                                !");
    }

    @Test
    public void test01211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01211");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("HIHIHIHIH                                  !IHIHIHIH", "!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01212");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hiihiihiihiihihiihiihiihiihii", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hiihiihiihiihihiihiihiihiihii" + "'", str3, "hiihiihiihiihihiihiihiihiihii");
    }

    @Test
    public void test01213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01213");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("hi!!hi!", "!                                                                HI!h                              !                                                                                               !                                                                 ih", "!ih                             ", 9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!!hi!" + "'", str4, "hi!!hi!");
    }

    @Test
    public void test01214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01214");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("H                               ", 969, "!                                !                                !                                !                                !                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !      " + "'", str3, "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !      ");
    }

    @Test
    public void test01215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01215");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01216");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("HIhi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!!", "!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIhi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!!" + "'", str2, "HIhi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!!");
    }

    @Test
    public void test01217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01217");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("!ih!!ihaaa", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!!ihaaa" + "'", str2, "!ih!!ihaaa");
    }

    @Test
    public void test01218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01218");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01219");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!" + "'", str1, "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
    }

    @Test
    public void test01220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01220");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "!                                                                HI!h                              !                                                                                               !                                                                 ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!                                                                HI!h                              !                                                                                               !                                                                 ih" + "'", str1, "!                                                                HI!h                              !                                                                                               !                                                                 ih");
    }

    @Test
    public void test01221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01221");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "HH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HH" + "'", str1, "HH");
    }

    @Test
    public void test01222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01222");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01223");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", (java.lang.CharSequence) "HIhi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01224");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                    " + "'", str1, "                                                                                                    ");
    }

    @Test
    public void test01225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01225");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!h" + "'", str1, "!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!h");
    }

    @Test
    public void test01226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01226");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "Hi!hi!hi!", (java.lang.CharSequence) "!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01227");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(" ", (int) (short) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " #########" + "'", str3, " #########");
    }

    @Test
    public void test01228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01228");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01229");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih" + "'", str1, "!ih");
    }

    @Test
    public void test01230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01230");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("H", 88, "HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHH" + "'", str3, "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHH");
    }

    @Test
    public void test01231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01231");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("IH", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH" + "'", str2, "IH");
    }

    @Test
    public void test01232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01232");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01233");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!ih", 10, "hihihihih                                  !ihihihih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihihih!ih" + "'", str3, "hihihih!ih");
    }

    @Test
    public void test01234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01234");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hihihihih                                  !ihihihih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01235");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                 ", '4', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01236");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!", "                             ", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01237");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("44444444444444444444444444444444444444444444444444444444444444444444                           ", "HI", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01238");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                             hi!", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01239");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Hi", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01240");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!                                      hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!hi!hi!", '4', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01241");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                           ", "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", "hi!                                                                                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                           " + "'", str3, "                                                           ");
    }

    @Test
    public void test01242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01242");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi", (java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444                             hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01243");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01244");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                ", '#', 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01245");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01246");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                 ", "hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                 " + "'", str3, "                                 ");
    }

    @Test
    public void test01247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01247");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hihihihih                                  !ihihihih", (java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444                             hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 75 + "'", int2 == 75);
    }

    @Test
    public void test01248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01248");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("!                               ", "H                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01249");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01250");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01251");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "!ih!!ihaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01252");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "HIhi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hIhi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!!" + "'", str1, "hIhi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!!");
    }

    @Test
    public void test01253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01253");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01254");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(" #########", "aaaaaaaaHi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01255");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("h", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01256");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                ", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01257");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                ", 100, 67);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                " + "'", str3, "                                ");
    }

    @Test
    public void test01258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01258");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str1, "!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test01259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01259");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("         !", "                                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01260");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HIhi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!!", "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01261");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Hi!", 75, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test01262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01262");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hihihi!                      ...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hihihi", "!", "                      ", "..." });
    }

    @Test
    public void test01263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01263");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!", "44444444444444444444444444444444444444444444444444444444444444444444                           ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test01264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01264");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", "                                  !");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01265");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", '#', (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01266");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str1, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test01267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01267");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("hihihihi!                                  hihihihih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHIHIHI!                                  HIHIHIHIH" + "'", str1, "HIHIHIHI!                                  HIHIHIHIH");
    }

    @Test
    public void test01268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01268");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01269");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                  ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01270");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aaaaaaaaHi", "hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hihi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaH" + "'", str2, "aaaaaaaaH");
    }

    @Test
    public void test01271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01271");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01272");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", '#', 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01273");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                 !Ih", "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", 35);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                                           hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                 ", "h" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h" + "'", str5, "                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test01274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01274");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01275");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01276");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "", 0);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "!                                  ");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test01277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01277");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", "", 0);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, ' ');
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", strArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test01278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01278");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01279");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("             !", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                !                   " + "'", str2, "                                !                   ");
    }

    @Test
    public void test01280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01280");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01281");
        char[] charArray8 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                  ", charArray8);
        java.lang.Class<?> wildcardClass12 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01282");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", "HHH", 66);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!" + "'", str3, "h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
    }

    @Test
    public void test01283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01283");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", "hihihi!                                  hihihihih", "HIhi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test01284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01284");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I", "!                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I" + "'", str2, "IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I");
    }

    @Test
    public void test01285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01285");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                   ", "44444444444444444444444444444444444444444444444444444444444444444444                             hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01286");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hihihihih                                  !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihihihih!" + "'", str1, "hihihihih!");
    }

    @Test
    public void test01287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01287");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "!ih!!ihaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01288");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!hi!hi!hi!hihi!hi!hi!hi!hi!", "                             ", 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01289");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("!                                !                                !                                !                                !", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01290");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("          ", "hihihihih                                  !ihihihih", "                                                 Hi                                                 ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test01291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01291");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("!                                !                                !                                !                                !                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!                                !                                !                                !                                !                                " + "'", str1, "!                                !                                !                                !                                !                                ");
    }

    @Test
    public void test01292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01292");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hi!", 99);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test01293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01293");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!" + "'", str1, "h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
    }

    @Test
    public void test01294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01294");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", "                                  !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01295");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hihihihihihihihihihihi", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihihihihihihihihihihi" + "'", str2, "hihihihihihihihihihihi");
    }

    @Test
    public void test01296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01296");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01297");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!", (java.lang.CharSequence) "h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!" + "'", charSequence2, "!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!");
    }

    @Test
    public void test01298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01298");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("Hi!hi!hi!", 280);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                       Hi!hi!hi!                                                                                                                                        " + "'", str2, "                                                                                                                                       Hi!hi!hi!                                                                                                                                        ");
    }

    @Test
    public void test01299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01299");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("HI!                                                                                                 ", "hihihihi!                                  hihihihih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!                                                                                                 " + "'", str2, "HI!                                                                                                 ");
    }

    @Test
    public void test01300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01300");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("44444444444444444444444444444444444444444444444444444444444444444444                             hi!", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444                             hi!" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444                             hi!");
    }

    @Test
    public void test01301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01301");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                             h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01302");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01303");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I", "!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I" + "'", str2, "!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I");
    }

    @Test
    public void test01304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01304");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "hihihi!                                  hihihihih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01305");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01306");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h", '4', 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01307");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("!                                                                HI!h                              !                                                                                               !                                                                 ih", "!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I", "H                               ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test01308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01308");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                ", "hihihihihihihihihihihi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
    }

    @Test
    public void test01309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01309");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                             hi!", 66);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01310");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                              !                                                                 ", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                 ", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hI!Hi!                                                                                       ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01311");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("!                               ", (int) (byte) 100, 97);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!                               " + "'", str3, "!                               ");
    }

    @Test
    public void test01312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01312");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...                             ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01313");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", "                                                              !                                  ", "!ih!ih!ihih!i!!h!ih!ih!ih");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test01314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01314");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase(" ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01315");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01316");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                  !", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       ..." + "'", str2, "       ...");
    }

    @Test
    public void test01317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01317");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", "HIHIHIHIH                                  !IHIHIHIH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01318");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test01319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01319");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01320");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", 'a', 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01321");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!                                !                                !                                !                                !                                ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!" + "'", str2, "!!!!!");
    }

    @Test
    public void test01322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01322");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01323");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("!                                                                HI!h                              !                                                                                               !                                                                 ih", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!                                                                HI!h                              !                                                                                               !                                                                 ih" + "'", str2, "!                                                                HI!h                              !                                                                                               !                                                                 ih");
    }

    @Test
    public void test01324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01324");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 66 + "'", int1 == 66);
    }

    @Test
    public void test01325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01325");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi", "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01326");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween(" ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "                              !                                                                HI!h                              !                                                                                               !                                                                 ih");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test01327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01327");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", " #########", 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test01328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01328");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HIHIHIHIH                                  !IHIHIHIH", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01329");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("!!!!!", "!ih                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01330");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01331");
        char[] charArray3 = new char[] { ' ' };
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", charArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hihi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                                                                                     ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test01332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01332");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hihihih!ih", "!ih                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01333");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", "                             hi!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "h");
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                  ", strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 95 + "'", int7 == 95);
    }

    @Test
    public void test01334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01334");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01335");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "!         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01336");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01337");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "hihihihih                                  !ihihihih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01338");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("...                             ", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..                             " + "'", str2, "..                             ");
    }

    @Test
    public void test01339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01339");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "!4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01340");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", " ");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("Hi!", strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test01341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01341");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          ", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!         ", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hihihi!                      ...", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01342");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str1, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test01343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01343");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!                                                                                             ", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!                                                                                             " });
    }

    @Test
    public void test01344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01344");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                             hi", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#############################hi" + "'", str3, "#############################hi");
    }

    @Test
    public void test01345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01345");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                              !                                                                HI!h                              !                                                                                               !                                                                 ih", "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01346");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hihihi!                      ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01347");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI" + "'", str1, "HI");
    }

    @Test
    public void test01348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01348");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("!4", "", "!4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test01349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01349");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaHi", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaHi" });
    }

    @Test
    public void test01350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01350");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hi!hi!hi!", "         !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!" + "'", str2, "hi!hi!hi!");
    }

    @Test
    public void test01351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01351");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                           ", "hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01352");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                             h", "                                                                                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01353");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                              ! ", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!", 3);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                              ", " " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                               " + "'", str4, "                                                               ");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test01354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01354");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  ", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!h" + "'", str2, "hi!hi!hi!h");
    }

    @Test
    public void test01355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01355");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("!ih", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01356");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hihihi!                                  hihihihih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01357");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str1, "!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test01358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01358");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                                                                                                                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01359");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                               ", (-1), '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                               " + "'", str3, "                                                               ");
    }

    @Test
    public void test01360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01360");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test01361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01361");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01362");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01363");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "Hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01364");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hI!Hi!                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01365");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                  ", "                              !                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                  " + "'", str2, "                                  ");
    }

    @Test
    public void test01366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01366");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01367");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                              !                                                                HI!h                              !                                                                                               !                                                                 ih", "h!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              !                                                                HI!h                              !                                                                                               !                                                                 ih" + "'", str2, "                              !                                                                HI!h                              !                                                                                               !                                                                 ih");
    }

    @Test
    public void test01368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01368");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!                                !                                !                                !                                !", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01369");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("IH", "HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01370");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!HI!HI!H" + "'", str2, "!!HI!HI!H");
    }

    @Test
    public void test01371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01371");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                               ", "HI!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01372");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", 131);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" });
    }

    @Test
    public void test01373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01373");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("!ih                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH                             " + "'", str1, "!IH                             ");
    }

    @Test
    public void test01374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01374");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("HI!                                                                                                 ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!                                                                                                 " + "'", str2, "HI!                                                                                                 ");
    }

    @Test
    public void test01375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01375");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("!", 66);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                !                                 " + "'", str2, "                                !                                 ");
    }

    @Test
    public void test01376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01376");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("################################################H################################################");
        java.lang.String[] strArray5 = new java.lang.String[] { "!", "" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "hi!");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "!");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("!                                !                                !                                !                                !                                ", strArray2, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "################################################H################################################" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "!", "" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test01377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01377");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                   ", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                   " + "'", str2, "                                                                   ");
    }

    @Test
    public void test01378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01378");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                                                                       Hi!hi!hi!                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01379");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("44444444444444444444444444444444444444444444444444444444444444444444                             hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444                             HI!" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444                             HI!");
    }

    @Test
    public void test01380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01380");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01381");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01382");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "..                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01383");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  ", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01384");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                 " + "'", str1, "                                                                                                 ");
    }

    @Test
    public void test01385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01385");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01386");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!         ", (int) (byte) 100, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h!         hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h" + "'", str3, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h!         hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h");
    }

    @Test
    public void test01387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01387");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                                                                                       Hi!hi!hi!                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01388");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                  !", (java.lang.CharSequence) "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test01389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01389");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01390");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("!ih                             ", "!ih                             ", 8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             " + "'", str3, "!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             ");
    }

    @Test
    public void test01391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01391");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                              !                                                                 ", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                                                          ", (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                              !                                                                 " + "'", str3, "                              !                                                                 ");
    }

    @Test
    public void test01392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01392");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("!                               ", 280);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!                               " + "'", str2, "!                               ");
    }

    @Test
    public void test01393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01393");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01394");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                                 !Ih", "                                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                      " + "'", str2, "                                      ");
    }

    @Test
    public void test01395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01395");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("!                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                               !" + "'", str1, "                               !");
    }

    @Test
    public void test01396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01396");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "HI!", (java.lang.CharSequence) "!ih!ih!ihih!i!!h!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test01397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01397");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("!!!!!", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!" + "'", str2, "!!!!!");
    }

    @Test
    public void test01398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01398");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                                   ", "hiihiihiihiihihiihiihiihiihii");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01399");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01400");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test01401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01401");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                               H     !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !" + "'", str1, "      !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                               H     !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !");
    }

    @Test
    public void test01402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01402");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!" + "'", str2, "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
    }

    @Test
    public void test01403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01403");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHH", "H", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 87 + "'", int3 == 87);
    }

    @Test
    public void test01404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01404");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", "         !", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test01405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01405");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi!!hi!", "                                                              !                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01406");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "################################################H################################################", (java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01407");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hihihihihihihihihihihi", "!                                !                                !                                !                                !                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihihihihihihihihihihi" + "'", str2, "hihihihihihihihihihihi");
    }

    @Test
    public void test01408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01408");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", "                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01409");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", "", 0);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "!");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi", "hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("hihihihihihihihihihihi", strArray4, strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "", "" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hihihihihihihihihihihi" + "'", str10, "hihihihihihihihihihihi");
    }

    @Test
    public void test01410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01410");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hihihihih!", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01411");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01412");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "Hi", (java.lang.CharSequence) "                                !!h!h!h!h!hh!h!h!h!h!                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01413");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                 H                                                 ", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 H                                                 " + "'", str2, "                                                 H                                                 ");
    }

    @Test
    public void test01414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01414");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!         ", 34, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########################!         " + "'", str3, "########################!         ");
    }

    @Test
    public void test01415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01415");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "!         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01416");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01417");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("44444444444444444444444444444444444444444444444444444444444444444444", "!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01418");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hi!hi!hi!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01419");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("             !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!" + "'", str1, "!");
    }

    @Test
    public void test01420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01420");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!", "             !", "!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihihihihihihihihihi" + "'", str3, "hihihihihihihihihihi");
    }

    @Test
    public void test01421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01421");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                 ", 95, 24);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test01422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01422");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", (int) (short) 100, 30);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test01423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01423");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                              !                                                                 ", 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              !                                                                 " + "'", str2, "                              !                                                                 ");
    }

    @Test
    public void test01424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01424");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("H", "!ih                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test01425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01425");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HIhi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!!", ' ', 280);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01426");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("Hi!", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!" + "'", str2, "Hi!");
    }

    @Test
    public void test01427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01427");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HI!                                                                                                 ", 33, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!                                                                                                 " + "'", str3, "HI!                                                                                                 ");
    }

    @Test
    public void test01428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01428");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("#############################hi", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01429");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                               !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!" + "'", str1, "!");
    }

    @Test
    public void test01430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01430");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "################################################H################################################", (java.lang.CharSequence) "Hi!hi!hi!h                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01431");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01432");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01433");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hihihi!                      ...", "                              !                                                                 ih                              !                                                                                               !                                                                 ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihihi!                      ..." + "'", str2, "hihihi!                      ...");
    }

    @Test
    public void test01434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01434");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHH", "Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHH" + "'", str2, "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHH");
    }

    @Test
    public void test01435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01435");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", (java.lang.CharSequence) "hiihiihiihiihihiihiihiihiihii");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!" + "'", charSequence2, "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
    }

    @Test
    public void test01436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01436");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                !                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!" + "'", str1, "!");
    }

    @Test
    public void test01437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01437");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("!                                      hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih!!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                                      !" + "'", str1, "!ih!ih!!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                                      !");
    }

    @Test
    public void test01438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01438");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                 H                                                 ", 31, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                 H                                                 " + "'", str3, "                                                 H                                                 ");
    }

    @Test
    public void test01439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01439");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                             hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01440");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test01441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01441");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                ", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01442");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01443");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01444");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", "                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01445");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HHH", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01446");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("h", (int) (byte) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
    }

    @Test
    public void test01447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01447");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("HIhi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!!", "44444444444444444444444444444444444444444444444444444444444444444444                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01448");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("Hi", strArray3, strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, 'a', 0, 969);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi" + "'", str7, "Hi");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
    }

    @Test
    public void test01449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01449");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!" + "'", str2, "44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!");
    }

    @Test
    public void test01450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01450");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                           hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!", "hihihih!ih", 35, 31);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                               hihihih!ih                        hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!" + "'", str4, "                               hihihih!ih                        hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test01451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01451");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("HI", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI" + "'", str2, "HI");
    }

    @Test
    public void test01452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01452");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                             ", "!!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01453");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01454");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("      !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                               H     !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !", "                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01455");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i" + "'", str2, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i");
    }

    @Test
    public void test01456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01456");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                             hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01457");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                              ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01458");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hihihihihihihihihihihi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01459");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                               hihihih!ih                        hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!", "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01460");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("44444444444444444444444444444444444444444444444444444444444444444444                             HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444                             HI!" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444                             HI!");
    }

    @Test
    public void test01461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01461");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str2, "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test01462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01462");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h!         hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h", "hihihihi!                                  hihihihih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01463");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                              !                                                                HI!h                              !                                                                                               !                                                                 ih", 99, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                              !                                                                HI!h                              !                                                                                               !                                                                 ih" + "'", str3, "                              !                                                                HI!h                              !                                                                                               !                                                                 ih");
    }

    @Test
    public void test01464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01464");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                  ", " #########", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                  " + "'", str3, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                  ");
    }

    @Test
    public void test01465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01465");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                           ", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                           " + "'", str2, "                                                           ");
    }

    @Test
    public void test01466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01466");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!!!", "                                      ", 280);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01467");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                   ", "                                                 H                                                 ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test01468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01468");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!h", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!h" + "'", str2, "!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!h");
    }

    @Test
    public void test01469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01469");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("################################################H################################################", "hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01470");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("!ih                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih                            " + "'", str1, "!ih                            ");
    }

    @Test
    public void test01471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01471");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01472");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(" ", ' ', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test01473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01473");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("44444444444444444444444444444444444444444444444444444444444444444444                             hi!", "!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 68 + "'", int2 == 68);
    }

    @Test
    public void test01474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01474");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 ", "!ih                             ", (int) (short) 10, 280);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          !ih                             " + "'", str4, "          !ih                             ");
    }

    @Test
    public void test01475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01475");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                                                    ", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "                                !                                 ", 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                    " + "'", str4, "                                                                                                    ");
    }

    @Test
    public void test01476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01476");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hi!hi!hi!h", 66, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01477");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", "H                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01478");
        char[] charArray8 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                 !Ih", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01479");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(charSequence0, (java.lang.CharSequence) "Hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "Hi!hi!hi!" + "'", charSequence2, "Hi!hi!hi!");
    }

    @Test
    public void test01480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01480");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("HIHIHIHI!                                  HIHIHIHIH", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIHIHIHI!                                  HIHIHIHIH" + "'", str2, "HIHIHIHI!                                  HIHIHIHIH");
    }

    @Test
    public void test01481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01481");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi" + "'", str1, "hi");
    }

    @Test
    public void test01482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01482");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("!ih!!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!!ih" + "'", str1, "!ih!!ih");
    }

    @Test
    public void test01483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01483");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                              ! ", 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01484");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("!ih", "                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih" + "'", str2, "!ih");
    }

    @Test
    public void test01485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01485");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) " #########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01486");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                ", "hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hihi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                                                                                     ", "HHH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                " + "'", str3, "                                ");
    }

    @Test
    public void test01487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01487");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "             !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01488");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                  !", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                !" + "'", str2, "                                !");
    }

    @Test
    public void test01489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01489");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi", "             !");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01490");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                             hi!", "hihihihih                                  !ihihihih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01491");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "         !", "IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test01492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01492");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01493");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                !", "                                !!h!h!h!h!hh!h!h!h!h!                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                !" + "'", str2, "                                                                                                !");
    }

    @Test
    public void test01494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01494");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!" + "'", str2, "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
    }

    @Test
    public void test01495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01495");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "         !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01496");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                  ", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h!         hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01497");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("hi", "                             hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01498");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                  ", 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           ..." + "'", str2, "                           ...");
    }

    @Test
    public void test01499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01499");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi!", "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i!" });
    }

    @Test
    public void test01500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01500");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                                  ", (java.lang.CharSequence) "Hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }
}

