package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

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
    public void test04001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04001");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(charSequence0, (java.lang.CharSequence) "!IHAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04002");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "                                                     ##############################################################A                                                                                       ", (java.lang.CharSequence) "ahi#ahi#ahi#ahi#aahi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04003");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "aahi", (java.lang.CharSequence) "aAHI#####");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04004");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                     aa                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aa" + "'", str1, "aa");
    }

    @Test
    public void test04005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04005");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          " + "'", str2, "          ");
    }

    @Test
    public void test04006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04006");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaa", "       ", "A", "                                  ", "aaaaaaaaaaaaaaaaaaaaaaaa", "      ", "aaaaaaaaaaaaaaaaaaaaaaaa", "       ", "A", "                                  ", "aaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test04007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04007");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("a hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a hi!" + "'", str1, "a hi!");
    }

    @Test
    public void test04008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04008");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                     AAHI!                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI!" + "'", str1, "AAHI!");
    }

    @Test
    public void test04009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04009");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aAHI", (java.lang.CharSequence) "444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04010");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04011");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                     ##########                                                                             ##########                                           ", (java.lang.CharSequence) "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04012");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "AHi       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04013");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "aaaaahiaaaaaaaaaaaaaaaaa", (int) (byte) 1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test04014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04014");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;", '4');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', 90, (int) '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test04015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04015");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi", '4');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ", "aahi4");
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray8 = new java.lang.reflect.AnnotatedElement[] { wildcardClass3, wildcardClass7 };
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("hi", '4');
        java.lang.Class<?> wildcardClass12 = strArray11.getClass();
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.split("aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ", "aahi4");
        java.lang.Class<?> wildcardClass16 = strArray15.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray17 = new java.lang.reflect.AnnotatedElement[] { wildcardClass12, wildcardClass16 };
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.split("hi", '4');
        java.lang.Class<?> wildcardClass21 = strArray20.getClass();
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.split("aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ", "aahi4");
        java.lang.Class<?> wildcardClass25 = strArray24.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray26 = new java.lang.reflect.AnnotatedElement[] { wildcardClass21, wildcardClass25 };
        java.lang.String[] strArray29 = org.apache.commons.lang3.StringUtils.split("hi", '4');
        java.lang.Class<?> wildcardClass30 = strArray29.getClass();
        java.lang.String[] strArray33 = org.apache.commons.lang3.StringUtils.split("aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ", "aahi4");
        java.lang.Class<?> wildcardClass34 = strArray33.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray35 = new java.lang.reflect.AnnotatedElement[] { wildcardClass30, wildcardClass34 };
        java.lang.String[] strArray38 = org.apache.commons.lang3.StringUtils.split("hi", '4');
        java.lang.Class<?> wildcardClass39 = strArray38.getClass();
        java.lang.String[] strArray42 = org.apache.commons.lang3.StringUtils.split("aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ", "aahi4");
        java.lang.Class<?> wildcardClass43 = strArray42.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray44 = new java.lang.reflect.AnnotatedElement[] { wildcardClass39, wildcardClass43 };
        java.lang.String[] strArray47 = org.apache.commons.lang3.StringUtils.split("hi", '4');
        java.lang.Class<?> wildcardClass48 = strArray47.getClass();
        java.lang.String[] strArray51 = org.apache.commons.lang3.StringUtils.split("aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ", "aahi4");
        java.lang.Class<?> wildcardClass52 = strArray51.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray53 = new java.lang.reflect.AnnotatedElement[] { wildcardClass48, wildcardClass52 };
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray54 = new java.lang.reflect.AnnotatedElement[][] { annotatedElementArray8, annotatedElementArray17, annotatedElementArray26, annotatedElementArray35, annotatedElementArray44, annotatedElementArray53 };
        java.lang.String str55 = org.apache.commons.lang3.StringUtils.join(annotatedElementArray54);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi" });
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!  " });
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(annotatedElementArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi" });
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!  " });
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(annotatedElementArray17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi" });
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!  " });
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(annotatedElementArray26);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi" });
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!  " });
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(annotatedElementArray35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "hi" });
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!  " });
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(annotatedElementArray44);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "hi" });
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!  " });
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(annotatedElementArray53);
        org.junit.Assert.assertNotNull(annotatedElementArray54);
    }

    @Test
    public void test04016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04016");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("class[Ljava.lang.String;class[Cclass[Ljava.lang.String;class[Ljava.lang.String;", 968);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         class[Ljava.lang.String;class[Cclass[Ljava.lang.String;class[Ljava.lang.String;" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         class[Ljava.lang.String;class[Cclass[Ljava.lang.String;class[Ljava.lang.String;");
    }

    @Test
    public void test04017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04017");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########");
    }

    @Test
    public void test04018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04018");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "...               4.STRING;C...", (java.lang.CharSequence) "CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04019");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                     AAHI!                                                     ", "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!I", 0, 31);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!I                      AAHI!                                                     " + "'", str4, "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!I                      AAHI!                                                     ");
    }

    @Test
    public void test04020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04020");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("AAHI!ih", "##########                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04021");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04022");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "#A#", "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04023");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "aahi4444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "a##########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04024");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "              Hi!               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04025");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                                                                                                                                    ", "##########################################A##########################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04026");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("a hi!     ", "ahi##########");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "a hi!     " });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "a hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a hi!     " + "'", str4, "a hi!     ");
    }

    @Test
    public void test04027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04027");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("#######...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#######..." + "'", str1, "#######...");
    }

    @Test
    public void test04028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04028");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "AAAAAAAAAAAAAAaahiAAAAAAAAAAAAA", (java.lang.CharSequence) "!ihaa                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04029");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahi!", "ih A");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test04030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04030");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                       hI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                       hI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str3, "                       hI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test04031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04031");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "#######################################################################################################################################################################################################..", (java.lang.CharSequence) "                                                        ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04032");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                                                                                                      aaaaaaaaaaaaaa", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                  aaaaaaaaaaaaaa" + "'", str2, "                                                                                                                  aaaaaaaaaaaaaa");
    }

    @Test
    public void test04033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04033");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) -1, 104);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04034");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("               #######...A#######...                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#######...A#######..." + "'", str1, "#######...A#######...");
    }

    @Test
    public void test04035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04035");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "###aaaaaaaaaaaaaaAAHIaaaaa...", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04036");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "               #######...A#######...                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04037");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("               hi!                ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               hi!                " + "'", str2, "               hi!                ");
    }

    @Test
    public void test04038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04038");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aahi######ahi##########ahi##########ahi##########ahi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aahi######ahi##########ahi##########ahi##########ahi" + "'", str1, "aahi######ahi##########ahi##########ahi##########ahi");
    }

    @Test
    public void test04039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04039");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("               a hi!        ...    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a hi!        ..." + "'", str1, "a hi!        ...");
    }

    @Test
    public void test04040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04040");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4" + "'", str1, "4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4");
    }

    @Test
    public void test04041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04041");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "...", (java.lang.CharSequence) "aAHI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04042");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('4', 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test04043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04043");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse(" A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A " + "'", str1, "               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A ");
    }

    @Test
    public void test04044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04044");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa####################", 24, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04045");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("##########################################A                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "", (java.lang.CharSequence[]) strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##########################################", "A", "                                  ", "##########################################", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "##########################################", "A", "", "##########################################", "" });
    }

    @Test
    public void test04046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04046");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test04047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04047");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ", "aaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaa", (int) (byte) 100);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Comparable<java.lang.String>[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                                    " + "'", str5, "                                                                                                    ");
    }

    @Test
    public void test04048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04048");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString(" #..                                                 a  aahi4 #..                                                 a  aahi4", "aahiaahia");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " #..                                                 a  aahi4 #..                                                 a  aahi4" + "'", str2, " #..                                                 a  aahi4 #..                                                 a  aahi4");
    }

    @Test
    public void test04049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04049");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########", 9, 180);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########");
    }

    @Test
    public void test04050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04050");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04051");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                     aa                                                     ", (java.lang.CharSequence) "AHi############", 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04052");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("aHi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aHi" + "'", str1, "aHi");
    }

    @Test
    public void test04053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04053");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                                                                                                A HI                                                                                                                                                                                             a hi!               ", 55, 968);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                A HI                                                                                                                                                                                             a hi!               " + "'", str3, "                                                                                                                                                                                                A HI                                                                                                                                                                                             a hi!               ");
    }

    @Test
    public void test04054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04054");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                !ih                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih" + "'", str1, "!ih");
    }

    @Test
    public void test04055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04055");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("A hi!!ih                                                                                                 ", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               " + "'", str2, "                               ");
    }

    @Test
    public void test04056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04056");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", "...####aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...####aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaa..." + "'", str2, "...####aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaa...");
    }

    @Test
    public void test04057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04057");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "aahi######!ih                                                                 ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04058");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('4', 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444" + "'", str2, "44444444444444444444444444444");
    }

    @Test
    public void test04059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04059");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("AAHI!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI!i" + "'", str1, "AAHI!i");
    }

    @Test
    public void test04060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04060");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("##hi#aaaaaaaaa", 24, 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04061");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi", "444444444444444444444444444444444444444444", 31);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', 44, 104);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 44 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "Hi" });
    }

    @Test
    public void test04062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04062");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04063");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("a                                                  ", "##########                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a                                                  " + "'", str2, "a                                                  ");
    }

    @Test
    public void test04064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04064");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaa...", "                                                 a  aahi4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04065");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                 4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG  AAHI4   LASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04066");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                a                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
    }

    @Test
    public void test04067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04067");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("44444444444444444444444444444444444", (int) (short) 100, "##########                        ##########      a4hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########                      44444444444444444444444444444444444##########                       " + "'", str3, "##########                      44444444444444444444444444444444444##########                       ");
    }

    @Test
    public void test04068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04068");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "                                                 a                                                  ", (java.lang.CharSequence) " aHi", 78);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04069");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  " + "'", str1, "aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ");
    }

    @Test
    public void test04070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04070");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "                                            ", (java.lang.CharSequence) " A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04071");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "ahi!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04072");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("##hi#aaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##hi#aaaaaaaaa" + "'", str1, "##hi#aaaaaaaaa");
    }

    @Test
    public void test04073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04073");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str1, "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test04074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04074");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                         aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04075");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("44444444444444444444444444444444444444444444444444444444", ".");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test04076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04076");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aHi       ", "AHi       ", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH  ... ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04077");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "          Hi!           ", (java.lang.CharSequence) "##hi#aaaaaaaaaa                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test04078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04078");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "  ", (java.lang.CharSequence) "A hi!!ih                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04079");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "AAHI4", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04080");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a#hi!!ih################################################################################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "a#hi!!ih################################################################################################" });
    }

    @Test
    public void test04081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04081");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih", 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih" + "'", str2, "                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih");
    }

    @Test
    public void test04082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04082");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("class [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;" + "'", str1, "class [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;");
    }

    @Test
    public void test04083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04083");
        org.apache.commons.lang3.StringUtils[] stringUtilsArray0 = null;
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.join(stringUtilsArray0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test04084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04084");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi!", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!" });
    }

    @Test
    public void test04085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04085");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "                                                                                                                                                                                                A HI                                                                                                                                                                                             a hi!               ", (java.lang.CharSequence) "class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04086");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4" + "'", str1, "4");
    }

    @Test
    public void test04087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04087");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "##########", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                            ", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence2, charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "a  aahi4", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "      ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test04088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04088");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "...##########################...", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                 4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04089");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aahia##########");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aahia##########" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aahia##########" + "'", str3, "aahia##########");
    }

    @Test
    public void test04090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04090");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  " + "'", str2, "aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ");
    }

    @Test
    public void test04091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04091");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("AAHI!ih                                                                                                 ", "                                                                                          aHi       ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04092");
        char[] charArray3 = new char[] { '4' };
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AHi       ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test04093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04093");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "               #######...A#######...                ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                 a  aahi4");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4IHAA", strArray3, strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "                                                 ", "a", "  ", "aahi", "4" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4IHAA" + "'", str6, "4IHAA");
    }

    @Test
    public void test04094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04094");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("               A                ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "aahi4!");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "AAAAAAAAAAAAAAAAAAAAAAAA ########## ##########");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "               ", "A", "                " });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "               ", "A", "                " });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "               AAAAAAAAAAAAAAAAAAAAAAAA ########## ##########AAAAAAAAAAAAAAAAAAAAAAAAA ########## ##########                " + "'", str5, "               AAAAAAAAAAAAAAAAAAAAAAAA ########## ##########AAAAAAAAAAAAAAAAAAAAAAAAA ########## ##########                ");
    }

    @Test
    public void test04095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04095");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  hi ##########", (java.lang.CharSequence) "###");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04096");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("#...", "########## ########## aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#..." + "'", str2, "#...");
    }

    @Test
    public void test04097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04097");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(charSequence0, (java.lang.CharSequence) "hhhhhh4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04098");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                 hi          !", "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 hi          !" + "'", str2, "                 hi          !");
    }

    @Test
    public void test04099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04099");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                      ##########", "hi!        ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                      ##########" + "'", str2, "                      ##########");
    }

    @Test
    public void test04100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04100");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray5 = new char[] {};
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "##########", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "       hi!", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                            ", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny(charSequence1, charArray5);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAHIaaaaaaaaaaaaa######################################################################", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test04101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04101");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                                                                                ", (java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04102");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.countMatches(charSequence0, (java.lang.CharSequence) "               #######...A#######...                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04103");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 969);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4" });
    }

    @Test
    public void test04104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04104");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                        ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04105");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "A               ", "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04106");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########", "              hi!              ", 18);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########" });
    }

    @Test
    public void test04107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04107");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd(" ########## aaaaaaaaaaaaaaaaaaaaaaaa", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " ########## aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, " ########## aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04108");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny(charSequence2, charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahi##########", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "#########", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test04109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04109");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                ", "i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04110");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("     h!                ", 1, 180);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     h!                " + "'", str3, "     h!                ");
    }

    @Test
    public void test04111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04111");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!IHAA", 32, "                                                                                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!IHAA                         " + "'", str3, "hi!IHAA                         ");
    }

    @Test
    public void test04112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04112");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("aahi4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aahi" + "'", str1, "aahi");
    }

    @Test
    public void test04113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04113");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", '#');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;", '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("a4hi!", strArray3, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, " aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a4CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;" + "'", str7, "a4CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;");
    }

    @Test
    public void test04114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04114");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04115");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) -1, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH  ... ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04116");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aih");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test04117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04117");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aaaaaa...", (java.lang.CharSequence) "                !ih                ", 104);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test04118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04118");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH", "Aahi#####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH" + "'", str2, "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH");
    }

    @Test
    public void test04119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04119");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...    ...", "                !IH                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...    ..." + "'", str2, "...    ...");
    }

    @Test
    public void test04120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04120");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                     ##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                     ##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "                                                     ##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04121");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test04122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04122");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04123");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04124");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "... [LJAVA.L...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04125");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "ih", 55);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04126");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('#', 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################################################################################" + "'", str2, "################################################################################################");
    }

    @Test
    public void test04127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04127");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                               ", (java.lang.CharSequence) "4A4A4A4A4A4A4A4A4A4A4A4A4A4A4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04128");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf(charSequence0, (java.lang.CharSequence) "i", 792);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04129");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "...#######A...#######", (java.lang.CharSequence) "AAHIAAAAAAAAAAAAA######################################################################", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04130");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("...                             ##########", "                                                                                                                                                                                                                                                                                                                                                                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                             ##########" + "'", str2, "...                             ##########");
    }

    @Test
    public void test04131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04131");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                    hi!                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                    hi!                " + "'", str1, "                                    hi!                ");
    }

    @Test
    public void test04132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04132");
        java.lang.String[] strArray3 = new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ", "aaaaaaaaaaaaaa    aaaaaaaaaaaaaa" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a4hi!", "                                           ##########                                            ###", 32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("                !ih                ", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ", "aaaaaaaaaaaaaa    aaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "a4hi!" });
    }

    @Test
    public void test04133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04133");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########", "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########");
    }

    @Test
    public void test04134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04134");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "##", (java.lang.CharSequence) "     h!                ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "##" + "'", charSequence2, "##");
    }

    @Test
    public void test04135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04135");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                              ", "aahi4!", 767);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                              " });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                              " + "'", str5, "                                                                                              ");
    }

    @Test
    public void test04136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04136");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("            class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class              ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...class              #...class [Ljava.lang.String;#...class [C#            class [Ljava.lang.String;" + "'", str2, "...class              #...class [Ljava.lang.String;#...class [C#            class [Ljava.lang.String;");
    }

    @Test
    public void test04137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04137");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                               AHi############                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04138");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hi", 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04139");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaa    aaaaaaaaaaaaaa", 99, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                   aaaaaaaaaaaaaa    aaaaaaaaaaaaaa" + "'", str3, "                                                                   aaaaaaaaaaaaaa    aaaaaaaaaaaaaa");
    }

    @Test
    public void test04140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04140");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hI!##########                                            444444444444444444444444", 319, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04141");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("!IHAA", 18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04142");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!IHAA");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi", "!", "IHAA" });
    }

    @Test
    public void test04143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04143");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "#...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04144");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "          Hi!           ", (java.lang.CharSequence) "AIH                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04145");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("", "                              ", "HICLASS...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04146");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("AHi       AHi      #a#AHi       AHi       ", (int) '#', "aaaaaa    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AHi       AHi      #a#AHi       AHi       " + "'", str3, "AHi       AHi      #a#AHi       AHi       ");
    }

    @Test
    public void test04147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04147");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(charSequence0, 99, 792);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04148");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('#', 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###" + "'", str2, "###");
    }

    @Test
    public void test04149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04149");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("...    ...", "########## ########## aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04150");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04151");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "...#######A...#######");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04152");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 638);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "hia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test04153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04153");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("Ih A", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04154");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "Hi!", 767);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04155");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                    A              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04156");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("               ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
    }

    @Test
    public void test04157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04157");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                 4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG  AAHI4   LASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04158");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AA              #######################################################################################################################################################################################################..", "hI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AA              #######################################################################################################################################################################################################.." + "'", str2, "AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AA              #######################################################################################################################################################################################################..");
    }

    @Test
    public void test04159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04159");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                    aaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04160");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("##########################################A##########################################", "Ahi##########HI!Ahi##########HI!Ahi##########HI!Ahi##########HI!Ahi##########HI!Ahi##########HI!A#A#", "aaaaaaaaaaaaaaaaaaaaaaaa       A");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########################################A##########################################" + "'", str3, "##########################################A##########################################");
    }

    @Test
    public void test04161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04161");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "       ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04162");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi!                                                                                              ", "###aaaaaaaaaaaaaaAAHIaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04163");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("##########aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "##########aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04164");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi", "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa4hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04165");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                !IH                                                                              ", "aaaaahiaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                !IH                                                                              " + "'", str2, "                !IH                                                                              ");
    }

    @Test
    public void test04166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04166");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "    ", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04167");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hi4", "A                                  ", "##hi#aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi4" + "'", str3, "hi4");
    }

    @Test
    public void test04168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04168");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "hi!IHAA                         ", (java.lang.CharSequence) "                                                     AAHI!                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04169");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "ih A", (java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04170");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ", "                                                 a                                                  ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEach("4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray1, strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       " });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str5, "4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04171");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a hi!", "AAAAAHIAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "a hi!" });
    }

    @Test
    public void test04172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04172");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("                                                                                                .");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                ." + "'", str1, "                                                                                                .");
    }

    @Test
    public void test04173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04173");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test04174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04174");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                            a  aahi4", "      ", "...aaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa                                                                                      a  aahi4" + "'", str3, "...aaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa                                                                                      a  aahi4");
    }

    @Test
    public void test04175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04175");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAA######################################################################                                                                                                                                                                                                                          ", (java.lang.CharSequence) "hi!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04176");
        char[] charArray4 = new char[] {};
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "##########", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "       hi!", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "       hi!", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test04177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04177");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04178");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("ahi       ");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "ahi", "       " });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test04179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04179");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04180");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("ahi", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahi" + "'", str2, "ahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahi");
    }

    @Test
    public void test04181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04181");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                            a  aahi", "                                                                                               #... ", "     ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                            a  aahi" + "'", str3, "                                                                                            a  aahi");
    }

    @Test
    public void test04182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04182");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "#############################################################", (java.lang.CharSequence) "            class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04183");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                   a hi", "               A                ", 44);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test04184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04184");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("A hi!!ih", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "A hi!!ih" });
    }

    @Test
    public void test04185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04185");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("A", "                                                 a                                                  ", (int) 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', 6, 68);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "A" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A" + "'", str4, "A");
    }

    @Test
    public void test04186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04186");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "a hi!!ih                                                                                                                   AAHI!                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04187");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ", "aaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaa", (int) (byte) 100);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "##########################################A                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "#######################################################################################################################", 9, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test04188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04188");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                      aaaaaaaaaaaaaaaaaaaaaaa                                       " + "'", str2, "                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ");
    }

    @Test
    public void test04189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04189");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aahi!", "a", 0);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "!ih", (java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "4");
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "hi4   a  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence[]) strArray8);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test04190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04190");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) " #..                                                 a  aahi4", "##########################################A                                  ##########################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04191");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaa", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaa" + "'", str2, "aaaaaa");
    }

    @Test
    public void test04192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04192");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("AHI       ", "aaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AHI       " + "'", str2, "AHI       ");
    }

    @Test
    public void test04193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04193");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "#####################################################ahi###############################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04194");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("s ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s " + "'", str2, "s ");
    }

    @Test
    public void test04195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04195");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "##", "Hi!" });
    }

    @Test
    public void test04196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04196");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;", '4');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "###aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa", (java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;" + "'", str6, "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;");
    }

    @Test
    public void test04197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04197");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04198");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    ", "a hi!");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa", (java.lang.CharSequence[]) strArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test04199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04199");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaahi!", 18, 42);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaahi!" + "'", str3, "aaaaaaaahi!");
    }

    @Test
    public void test04200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04200");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "...aaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa                                                                                      a  aahi4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04201");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("######################################################################", (int) (byte) 10, 969);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "######################################################################" + "'", str3, "######################################################################");
    }

    @Test
    public void test04202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04202");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "a hi!!ih                                                                                                 ", "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!I                      AAHI!                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04203");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat(" aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", " A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               ", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04204");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "#..", (java.lang.CharSequence) "                                                                                                                                                             Hi!                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04205");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("            class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class              ", (int) (short) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "            class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class              " + "'", str3, "            class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class              ");
    }

    @Test
    public void test04206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04206");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("  hi ##########", "                      ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi ##########" + "'", str2, "  hi ##########");
    }

    @Test
    public void test04207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04207");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "AHI       #######################################################################################", (java.lang.CharSequence) "#######################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04208");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                               #...", "a hi!!ih                                                                                                                   AAHI!                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               #..." + "'", str2, "                                                                                               #...");
    }

    @Test
    public void test04209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04209");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("               A                ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "aahi4!");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "               A               ", 15, 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "               ", "A", "                " });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "               ", "A", "                " });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "               aAa                " + "'", str9, "               aAa                ");
    }

    @Test
    public void test04210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04210");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("a hi!!ih                                                                                                 ", 68);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a hi!!ih                                                         ..." + "'", str2, "a hi!!ih                                                         ...");
    }

    @Test
    public void test04211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04211");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "               A                ", (java.lang.CharSequence) "CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04212");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("Ahi##########HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Ahi##########HI" + "'", str1, "Ahi##########HI");
    }

    @Test
    public void test04213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04213");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hi4   a  ", (java.lang.CharSequence) "hI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04214");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaa                                                                                                 hi!IHAA", (java.lang.CharSequence) "#######################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04215");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aahi4!", 78);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi4!" + "'", str2, "aahi4!");
    }

    @Test
    public void test04216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04216");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test04217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04217");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Aahi!", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", 94);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "A", "hi!" });
    }

    @Test
    public void test04218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04218");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########" + "'", str1, "aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########");
    }

    @Test
    public void test04219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04219");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaa44444               A               444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaa44444               A               444444" + "'", str1, "aaaaaaaaaaaaa44444               A               444444");
    }

    @Test
    public void test04220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04220");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04221");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "aahi######", "##########################################A                                  ##########################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04222");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########", "aAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########" + "'", str2, "##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########");
    }

    @Test
    public void test04223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04223");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "a#hi!!ih#################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04224");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa A aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaa A aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04225");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...#######A...#######");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04226");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("               a               ", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               a               " + "'", str2, "               a               ");
    }

    @Test
    public void test04227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04227");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test04228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04228");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hi");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi" });
    }

    @Test
    public void test04229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04229");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                   A hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04230");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAA", (java.lang.CharSequence) "44444444444444444444444444444444444    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04231");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04232");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "Ih A", 56);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04233");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04234");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("################################################################################################", 18, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################################################################################" + "'", str3, "################################################################################################");
    }

    @Test
    public void test04235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04235");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "                                                   A hi", (java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!       A                                  !!!!!!!!!!!!!!!!!!!!!!!!      !!!!!!!!!!!!!!!!!!!!!!!!       A                                  !!!!!!!!!!!!!!!!!!!!!!!!      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04236");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi" + "'", str1, "hi");
    }

    @Test
    public void test04237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04237");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("hia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str1, "hia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test04238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04238");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa  4                                                                                              ", (java.lang.CharSequence) "#...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04239");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                      ##########", "AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AA              #######################################################################################################################################################################################################..");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test04240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04240");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aa", "                                                                                                .", "AAAAAHIAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aa" + "'", str3, "aa");
    }

    @Test
    public void test04241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04241");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaa", "                                                                                                                  aaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04242");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "############################################               a               ############################################                                                     !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                            ", 9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04243");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test04244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04244");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04245");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 15, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444" + "'", str3, "444444444444444");
    }

    @Test
    public void test04246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04246");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "... [LJAVA.L...", (java.lang.CharSequence) "  AAHI4   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04247");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('4', 78);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test04248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04248");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("A               ", "hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A               " + "'", str2, "A               ");
    }

    @Test
    public void test04249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04249");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("####aahia##########aahia##########aahia#####", 104);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              ####aahia##########aahia##########aahia#####                              " + "'", str2, "                              ####aahia##########aahia##########aahia#####                              ");
    }

    @Test
    public void test04250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04250");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "############################################               a               ############################################", (java.lang.CharSequence) "a4hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04251");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf(charSequence0, (java.lang.CharSequence) "HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04252");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04253");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("###########################A                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04254");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ", "                !IH                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04255");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                                                                                                                                                                                                                                                 4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", "hia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                 4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI" + "'", str2, "                                                                                                                                                                                                                                                                                                                 4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
    }

    @Test
    public void test04256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04256");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "hia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########", (java.lang.CharSequence) "aahi4!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04257");
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "##########", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "       hi!", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "               a                ", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "               a                ", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAA", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test04258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04258");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "!IH                                                                                                 ", 15, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04259");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("...#######a...#######", "                                                        4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...#######a...#######" + "'", str2, "...#######a...#######");
    }

    @Test
    public void test04260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04260");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aahi!", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi!" + "'", str2, "aahi!");
    }

    @Test
    public void test04261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04261");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;", (java.lang.CharSequence) "AAAAAAAAAAAAAAaahiAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test04262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04262");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04263");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("AAAAAAAAAAAAAAAAAAAAAAAA ########## ##########", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04264");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih", (java.lang.CharSequence) "!ihaa                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04265");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "!ihaa                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04266");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                     ##########                                                                             ##########                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04267");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "##########################################A##########################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04268");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                              ", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   " + "'", str2, "                                   ");
    }

    @Test
    public void test04269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04269");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("4              hI!               44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4              hI!               44" + "'", str1, "4              hI!               44");
    }

    @Test
    public void test04270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04270");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ", "                                         ######################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "hia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test04271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04271");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4A4A4A4A4A4A4A4A4A4A4A4A4A4A4", "                                                 a                                                  ", 0);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4A4A4A4A4A4A4A4A4A4A4A4A4A4A4" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test04272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04272");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class ", "Aahi#####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class " + "'", str2, "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class ");
    }

    @Test
    public void test04273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04273");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...aaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa                                                                                      a  aahi4", " aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "A");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi4" + "'", str3, "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi4");
    }

    @Test
    public void test04274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04274");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip(" ##        Hi!               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##        Hi!" + "'", str1, "##        Hi!");
    }

    @Test
    public void test04275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04275");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("          Hi!           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "          Hi!          " + "'", str1, "          Hi!          ");
    }

    @Test
    public void test04276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04276");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "                                  A", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04277");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aahi######!ih                                                                 ", "               A                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi######!ih                                                                 " + "'", str2, "aahi######!ih                                                                 ");
    }

    @Test
    public void test04278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04278");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "                               aaaaaaaaaaaaaaaaaaaaaaaa     ", (java.lang.CharSequence) "aahi!                                                                                              ", 56);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04279");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("Ahi!!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Ahi!!ih" + "'", str1, "Ahi!!ih");
    }

    @Test
    public void test04280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04280");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("aaaaaaaaaaaaaa", "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaa");
    }

    @Test
    public void test04281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04281");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("A HI!     ", "aaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A HI!     " + "'", str2, "A HI!     ");
    }

    @Test
    public void test04282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04282");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aaaaaaaaaaaaa#######################################################################aaaaaaaaaa#a#", "aaaaaaaaaaaaaaaaaaaaaaaa                                            ##########                                                                             ##########                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaa#######################################################################aaaaaaaaaa#a#" + "'", str2, "aaaaaaaaaaaaa#######################################################################aaaaaaaaaa#a#");
    }

    @Test
    public void test04283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04283");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################" + "'", str1, "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################");
    }

    @Test
    public void test04284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04284");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                 hi          !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04285");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("ahi!aaahi!a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ahi!aaahi!a" + "'", str1, "ahi!aaahi!a");
    }

    @Test
    public void test04286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04286");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hI!##########                                            444444444444444444444444", "[LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "h", "!##########", "444444444444444444444444" });
    }

    @Test
    public void test04287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04287");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("##hi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ", "aahi######ahi##########ahi##########ahi##########ahi", "#######################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##hi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  " + "'", str3, "##hi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ");
    }

    @Test
    public void test04288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04288");
        java.lang.String[] strArray7 = new java.lang.String[] { "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                             A HI                                                                                                                                                              ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "##########", "           #########            ", "a4hi!" };
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByCharacterType("               A                ");
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A", (java.lang.CharSequence[]) strArray11);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "                                          ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        int int15 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "hi", (java.lang.CharSequence[]) strArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("aahi######ahi##########ahi##########ahi##########ahi", strArray7, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 6 vs 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                             A HI                                                                                                                                                              ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "##########", "           #########            ", "a4hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "               ", "A", "                " });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "A", "" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test04289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04289");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("!ih", "", 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih" + "'", str3, "!ih");
    }

    @Test
    public void test04290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04290");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("A             ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A             " + "'", str2, "A             ");
    }

    @Test
    public void test04291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04291");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!IHAA", "a hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04292");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         class[Ljava.lang.String;class[Cclass[Ljava.lang.String;class[Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04293");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("##########    ##########    AAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########    ##########    AAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "##########    ##########    AAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test04294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04294");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04295");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                !ih           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih" + "'", str1, "!ih");
    }

    @Test
    public void test04296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04296");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("       hi!", "  ", (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test04297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04297");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast(".", "hi!IHAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
    }

    @Test
    public void test04298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04298");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaaaaa##hi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ", "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;", "##########                      44444444444444444444444444444444444##########                       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaa##hi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  " + "'", str3, "aaaaaa##hi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ");
    }

    @Test
    public void test04299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04299");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "AAHI4", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04300");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase(" A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               ", "aaaaaaaaaaaaaaaaaaaaaaaa                                  A       aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa                                  A       aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               " + "'", str2, " A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               ");
    }

    @Test
    public void test04301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04301");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("            class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class              ", 8, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "            class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class              " + "'", str3, "            class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class              ");
    }

    @Test
    public void test04302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04302");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("444444444444444444444444AAHI444444444444444444444444", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444AAHI444444444444444444444444" + "'", str2, "444444444444444444444444AAHI444444444444444444444444");
    }

    @Test
    public void test04303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04303");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "               a                ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 104);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04304");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("A             ", "               aAa                ", " aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04305");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aahi4");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "               a                ", (java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "#a#");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("###aaaaaaaaaaaaaaAAHIaaaaa...", "!IHAA", 968);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 ", strArray3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aahi", "4" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi", "4" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "###aaaaaaaaaaaaaaAAHIaaaaa..." });
    }

    @Test
    public void test04306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04306");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#" + "'", str1, "#");
    }

    @Test
    public void test04307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04307");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "aih                                                                                                 ", (java.lang.CharSequence) "##########                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04308");
        char[] charArray4 = new char[] {};
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi!", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi4!", charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                 a                                                  ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test04309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04309");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "...               4.STRING;C...", (java.lang.CharSequence) "##############################################################A                                  ", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04310");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hI");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hI" });
    }

    @Test
    public void test04311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04311");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("##########aaaaaaaaaaaaaaaaaaaaaaaa", "Ahi##########HI!Ahi##########HI!Ahi##########HI!Ahi##########HI!Ahi##########HI!Ahi##########HI!A#A#", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "##########aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04312");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("44444444444444444444444444444444444444444444444444444444", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444" + "'", str2, "44444444");
    }

    @Test
    public void test04313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04313");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "...               4.STRING;C...", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04314");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ', (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaa", "       ", "A", "                                  ", "aaaaaaaaaaaaaaaaaaaaaaaa", "       " });
    }

    @Test
    public void test04315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04315");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04316");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "a#hi!!ih################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04317");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         class[Ljava.lang.String;class[Cclass[Ljava.lang.String;class[Ljava.lang.String;", (java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04318");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444", 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04319");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                       hI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04320");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "AAHIaaaaaaaaaaaaa######################################################################", 18, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04321");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test04322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04322");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("hi!IHAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!IHAA" + "'", str1, "Hi!IHAA");
    }

    @Test
    public void test04323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04323");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("s ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "s" + "'", str1, "s");
    }

    @Test
    public void test04324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04324");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "               a hi!               ", (java.lang.CharSequence) "         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04325");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aHi");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("                                                     aa                                                     ", 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "##############################################################A                                  ");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aahi", strArray2, strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "a", "Hi" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "                                                     ", "                                                     " });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                     ##############################################################A                                                                                       " + "'", str7, "                                                     ##############################################################A                                                                                       ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                          hi" + "'", str8, "                                                                                                          hi");
    }

    @Test
    public void test04326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04326");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ", "aahi##########");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "AHi       ");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                !ih                                                                              ");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "               A                ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                                                                                      aaaaaaaaaaaaaa", strArray3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                                    " + "'", str5, "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "                ", "!", "ih", "                                                                              " });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "!", "ih", "" });
    }

    @Test
    public void test04327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04327");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAHI!ih                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test04328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04328");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("...aaa#######################################################################aaaaaaaaaaaaa", 78);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#################################################################aaaaaaaaaaaaa" + "'", str2, "#################################################################aaaaaaaaaaaaa");
    }

    @Test
    public void test04329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04329");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("##hi#aaaaaaaaaa", "a hi!        ...", "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##hi#aaaaaaaaaa" + "'", str3, "##hi#aaaaaaaaaa");
    }

    @Test
    public void test04330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04330");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString(" #..                                                 a  aahi4", "4              hI!               44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " #..                                                 a  aahi4" + "'", str2, " #..                                                 a  aahi4");
    }

    @Test
    public void test04331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04331");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("##########################################A                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########################################a                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str1, "##########################################a                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test04332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04332");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04333");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa4hi!", 111, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa4hi!" + "'", str3, "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa4hi!");
    }

    @Test
    public void test04334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04334");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "AAHI", (java.lang.CharSequence) "         4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04335");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aahi######", "                                                                                                 hi!IHAA", 35);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "hi4   a  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "aahi######" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test04336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04336");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "##############################################################A                                  ", (int) (byte) -1, 319);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04337");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "##########################################a                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04338");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("ahi       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ahi" + "'", str1, "ahi");
    }

    @Test
    public void test04339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04339");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04340");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "############################################               a               ############################################", (java.lang.CharSequence) "aahi######!ih                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04341");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(" A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4", 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4" + "'", str3, " A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4");
    }

    @Test
    public void test04342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04342");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "aih                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04343");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aaaaaaaaaaaaaa    aaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04344");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("44444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "44444444444444444444444444444" });
    }

    @Test
    public void test04345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04345");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) " #..                                                 a  aahi4", (java.lang.CharSequence) "#########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04346");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("...                             ##########", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                      ##########" + "'", str2, "                      ##########");
    }

    @Test
    public void test04347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04347");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "  ahia a##########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04348");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04349");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test04350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04350");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "                                                     ##########                                                                             ##########                                            ", (java.lang.CharSequence) "                                  A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04351");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "AA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04352");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "...aaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04353");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########");
    }

    @Test
    public void test04354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04354");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "                               ", 638);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 111 + "'", int3 == 111);
    }

    @Test
    public void test04355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04355");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa       A", (java.lang.CharSequence) "    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 27 + "'", int2 == 27);
    }

    @Test
    public void test04356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04356");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "#a#", (java.lang.CharSequence) "aaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04357");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa", (java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH  ... ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04358");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                !ih           ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test04359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04359");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("Hi!IHAA", "aAHI#####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!IHAA" + "'", str2, "Hi!IHAA");
    }

    @Test
    public void test04360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04360");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "aahi!", 34);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "          ");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aahi4!", strArray4, strArray7);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" ", "##########################################A##########################################", 90);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "i", (java.lang.CharSequence[]) strArray14);
        java.lang.Class<?> wildcardClass16 = strArray14.getClass();
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aahi!", "");
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.stripAll(strArray19, "    ");
        java.lang.Class<?> wildcardClass22 = strArray19.getClass();
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aahi!");
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(strArray24);
        java.lang.Class<?> wildcardClass26 = strArray24.getClass();
        java.lang.String[] strArray29 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "a hi!!ih                                                                                                 ");
        java.lang.Class<?> wildcardClass30 = strArray29.getClass();
        java.lang.String[] strArray35 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "aahi!", 34);
        java.lang.String[] strArray38 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "          ");
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aahi4!", strArray35, strArray38);
        java.lang.Class<?> wildcardClass40 = strArray38.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray41 = new java.lang.reflect.GenericDeclaration[] { wildcardClass9, wildcardClass16, wildcardClass22, wildcardClass26, wildcardClass30, wildcardClass40 };
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.join(genericDeclarationArray41);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "aahi4!" + "'", str8, "aahi4!");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { " " });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "aahi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "aahi!" });
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "aahi", "!" });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "aahi!" + "'", str25, "aahi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "aahi4!" + "'", str39, "aahi4!");
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(genericDeclarationArray41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str42, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test04361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04361");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
    }

    @Test
    public void test04362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04362");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "a##########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04363");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                a           ", "               hi!                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                a           " + "'", str2, "                a           ");
    }

    @Test
    public void test04364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04364");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAA" + "'", str1, "###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAA");
    }

    @Test
    public void test04365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04365");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                       hI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       hI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str2, "                       hI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test04366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04366");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                                                              hi!                ", (java.lang.CharSequence) "hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04367");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    ", '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, '#');
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "A", (java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "                a                  ");
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", '4');
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray16);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16, '4');
        boolean boolean20 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "##########################################A##########################################", (java.lang.CharSequence[]) strArray16);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray16);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEach("a#hi!!ih#################################################################################################", strArray12, strArray16);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("#..", strArray5, strArray16);
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aahi##########");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("...               4.STRING;C...", strArray5, strArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "    " });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "    " + "'", str7, "    ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "a" });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "a" });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "a" + "'", str19, "a");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "a" + "'", str21, "a");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "a#hi!!ih#################################################################################################" + "'", str22, "a#hi!!ih#################################################################################################");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#.." + "'", str23, "#..");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "aahi", "##########" });
    }

    @Test
    public void test04368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04368");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04369");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", 111, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04370");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("       hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       hi!" + "'", str1, "       hi!");
    }

    @Test
    public void test04371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04371");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aHi", 3, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aHi" + "'", str3, "aHi");
    }

    @Test
    public void test04372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04372");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                      ##########", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         ##########" + "'", str2, "                         ##########");
    }

    @Test
    public void test04373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04373");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################", (java.lang.CharSequence) "AIH                                                                                                 ", 55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04374");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!ih");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("    ", "!ih", (-1));
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("##########                        ", strArray2, strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!ih" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "    " });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "##########                        " + "'", str7, "##########                        ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!ih" + "'", str8, "!ih");
    }

    @Test
    public void test04375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04375");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("##", "...#######A...#######", "Ahi##########HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##" + "'", str3, "##");
    }

    @Test
    public void test04376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04376");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aih", (java.lang.CharSequence) "CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;", 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04377");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(charSequence0, (java.lang.CharSequence) "a hi!!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04378");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "aaaaaa", (java.lang.CharSequence) " hi!        ...    a               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04379");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI######!IHAAHI######!IHAAHI######!IHAAHI######!IH" + "'", str1, "AAHI######!IHAAHI######!IHAAHI######!IHAAHI######!IH");
    }

    @Test
    public void test04380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04380");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("AAHI######!IHAAHI######!IHAAHI######!IHAAHI######!IH", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAHI######!IHAAHI######!IHAAHI######!IHAAHI######!IH" + "'", str2, "AAHI######!IHAAHI######!IHAAHI######!IHAAHI######!IH");
    }

    @Test
    public void test04381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04381");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 29, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04382");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04383");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str1, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test04384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04384");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("aaaaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaa..." + "'", str1, "aaaaaa...");
    }

    @Test
    public void test04385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04385");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "ahi!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!", (int) 'a', 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test04386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04386");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                hi!        ...", "444444444444444444444444                                            ##########                                                                             ##########                                                     ", 90);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                hi!        ..." });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test04387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04387");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "Ahi##########HI!Ahi##########HI!Ahi##########HI!Ahi##########HI!Ahi##########HI!Ahi##########HI!A#A#", (java.lang.CharSequence) "               a               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04388");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("               A                ", "4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4", "###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "               A                " + "'", str3, "               A                ");
    }

    @Test
    public void test04389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04389");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("##########                        ##########      a4hi!", "                                                                                             4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########                        ##########      a4hi!" + "'", str2, "##########                        ##########      a4hi!");
    }

    @Test
    public void test04390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04390");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "aahi!                                                                                              ", (java.lang.CharSequence) "44444444444444444444444444444444444    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04391");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("AAHIAAAAAAAAAAAAA######################################################################", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAHIAAAAAAAAAAAAA######################################################################" + "'", str2, "AAHIAAAAAAAAAAAAA######################################################################");
    }

    @Test
    public void test04392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04392");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                     ##########                                                                             ##########                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########                                                                             ##########" + "'", str1, "##########                                                                             ##########");
    }

    @Test
    public void test04393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04393");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                     !ihaa                                                     ", "                                                                                                 hi!IHAA", 2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "!IH                                                                                                 ", (int) 'a', 33);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "                                                    !ihaa                                                     " });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test04394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04394");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                             4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", "                                  A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04395");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "##hi#aaaaaaaaaa                   ", "ahi!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04396");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "##########################################A                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", (java.lang.CharSequence) "Hi!IHAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04397");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "HI4", (java.lang.CharSequence) " #... ", 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04398");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                         aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04399");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaa" + "'", str2, "aaaaaaaaaa");
    }

    @Test
    public void test04400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04400");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...##########################...", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...##########################..." });
    }

    @Test
    public void test04401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04401");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                !IH                                                                              ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                !IH                                                                              " + "'", str2, "                !IH                                                                              ");
    }

    @Test
    public void test04402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04402");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("               a                ", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###############a################" + "'", str3, "###############a################");
    }

    @Test
    public void test04403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04403");
        char[] charArray7 = new char[] {};
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi4!", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aahi4", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                              ", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "a4CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test04404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04404");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("a4CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;4a" + "'", str2, "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;4a");
    }

    @Test
    public void test04405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04405");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("", "##hi#aaaaaaaaaa                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##hi#aaaaaaaaaa                   " + "'", str2, "##hi#aaaaaaaaaa                   ");
    }

    @Test
    public void test04406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04406");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih                                                                                                ", 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 638, 10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!ih                                                                                                " });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test04407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04407");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aaaaaa##hi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaa##hi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!" + "'", str1, "aaaaaa##hi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!");
    }

    @Test
    public void test04408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04408");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("               AAAAAAAAAAAAAAAAAAAAAAAA ########## ##########AAAAAAAAAAAAAAAAAAAAAAAAA ########## ##########                ", "                                  A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   A" + "'", str2, "                   A");
    }

    @Test
    public void test04409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04409");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04410");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "###########################A                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 969 + "'", int2 == 969);
    }

    @Test
    public void test04411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04411");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04412");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "aaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04413");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("!IH                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH                                                                                                 " + "'", str1, "!IH                                                                                                 ");
    }

    @Test
    public void test04414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04414");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04415");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "...               4.STRING;C...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04416");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("          ", 20, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaa          aaaaa" + "'", str3, "aaaaa          aaaaa");
    }

    @Test
    public void test04417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04417");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                   " + "'", str1, "                                                                   ");
    }

    @Test
    public void test04418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04418");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI4                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", "##############################################################A                                  ", "                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI4" + "'", str3, "HI4");
    }

    @Test
    public void test04419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04419");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aih", (java.lang.CharSequence) "CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04420");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("           44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#            ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04421");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("a", "                                                                              ", "##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########", 5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
    }

    @Test
    public void test04422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04422");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hI!##########                                            444444444444444444444444", "a hi!!ih                                                                                                                   AAHI!", "a hi!!ih                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!##########                                            444444444444444444444444" + "'", str3, "hI!##########                                            444444444444444444444444");
    }

    @Test
    public void test04423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04423");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("...                             ##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                             ##########" + "'", str1, "...                             ##########");
    }

    @Test
    public void test04424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04424");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                a           ", "ih A");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04425");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "hi4   a  ", (java.lang.CharSequence) "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04426");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;", "              hI!               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04427");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                                                                                                                                                                                                                                                                                                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04428");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                                              ", "hi!IHAA", 111);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                              " + "'", str3, "                                                                                              ");
    }

    @Test
    public void test04429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04429");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "ahi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04430");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 969 + "'", int1 == 969);
    }

    @Test
    public void test04431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04431");
        java.lang.CharSequence[] charSequenceArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "                    A              ", charSequenceArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04432");
        java.lang.String[] strArray2 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ", 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("a#hi!!ih#################################################################################################", strArray2, strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aahi!", "");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray10, "    ");
        int int13 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence[]) strArray10);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("               #######...A#######...                ", strArray2, strArray10);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "       A                                  ", "       " });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a#hi!!ih#################################################################################################" + "'", str6, "a#hi!!ih#################################################################################################");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "aahi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "aahi!" });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "               #######...A#######...                " + "'", str14, "               #######...A#######...                ");
    }

    @Test
    public void test04433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04433");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                           ##########                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04434");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "                                                                                                ", (java.lang.CharSequence) " #... ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04435");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aahi4", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04436");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aahiaahia", "                a               ", (int) '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aahiaahia" });
    }

    @Test
    public void test04437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04437");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("a hi!!ih                                                         ...", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hi!!ih                                                         ..." + "'", str2, " hi!!ih                                                         ...");
    }

    @Test
    public void test04438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04438");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aAHI#####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04439");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444", 3, 119);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04440");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("                                !ih", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                !ih                                !ih" + "'", str2, "                                !ih                                !ih");
    }

    @Test
    public void test04441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04441");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "#################################################################aaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04442");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("a#hi!!ih################################################################################################", "aAHI#####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a#hi!!ih################################################################################################" + "'", str2, "a#hi!!ih################################################################################################");
    }

    @Test
    public void test04443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04443");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa4hi!", "##########                        ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa4hi!" });
    }

    @Test
    public void test04444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04444");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("               a                ", "!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aih");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "I", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "               a                " });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test04445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04445");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("class#[Ljava.lang.String;#######...class#[C#######...class#[Ljava.lang.String;#######...class#[Ljava.lang.String;", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class#[Ljava.lang.String;#######...class#[C#######...class#[Ljava.lang.String;#######...class#[Ljava.lang.String;" + "'", str2, "class#[Ljava.lang.String;#######...class#[C#######...class#[Ljava.lang.String;#######...class#[Ljava.lang.String;");
    }

    @Test
    public void test04446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04446");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "AHI                                                                                                   4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", (java.lang.CharSequence) "                !IH                                                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04447");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                         AAAAAAAAAAAAAAAAAAAAAAAA", 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                         AAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "                                                                                                                         AAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test04448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04448");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test04449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04449");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("44444444444444444444444444444444444    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04450");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04451");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "            class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class              ", 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04452");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "aahi########## #..                                                 a  aahi4", (java.lang.CharSequence) "aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04453");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                   a hi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04454");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "AAHI!i", (java.lang.CharSequence) "                                         ######################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04455");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "aahi######", (java.lang.CharSequence) "444444444444444444444444                                            ##########                                                                             ##########                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04456");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!IH", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!IH" });
    }

    @Test
    public void test04457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04457");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "AA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04458");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04459");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                         ##########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04460");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "           #########            ", (java.lang.CharSequence) "###AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04461");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "hI!##########                                            444444444444444444444444", 180);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04462");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("aahi######!ih                                                                 ", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi######!ih                                                                 " + "'", str2, "aahi######!ih                                                                 ");
    }

    @Test
    public void test04463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04463");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aahi!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(strArray2);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                            a  aahi4", "    AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("a hi!!ih", strArray2, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aahi", "!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aahi!" + "'", str3, "aahi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "                                                                                            a  aahi4" });
    }

    @Test
    public void test04464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04464");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hI!##########                                            444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!##########                                            444444444444444444444444" + "'", str1, "hi!##########                                            444444444444444444444444");
    }

    @Test
    public void test04465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04465");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "i");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "     h!                ", 18, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 18 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test04466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04466");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;" + "'", str1, "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;");
    }

    @Test
    public void test04467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04467");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                 hi          !", "A             ", 968, 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                 hi          !A             " + "'", str4, "                 hi          !A             ");
    }

    @Test
    public void test04468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04468");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!       A                                  !!!!!!!!!!!!!!!!!!!!!!!!      !!!!!!!!!!!!!!!!!!!!!!!!       A                                  !!!!!!!!!!!!!!!!!!!!!!!!      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04469");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                              hi!                ", "                                                     ##########                                                                             ##########                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                              hi!" + "'", str2, "                                                                              hi!");
    }

    @Test
    public void test04470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04470");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AHi       AHi      #a#AHi       AHi       ", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AHi#######AHi#######a#AHi#######AHi#######" + "'", str3, "AHi#######AHi#######a#AHi#######AHi#######");
    }

    @Test
    public void test04471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04471");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("A hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hi", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hi" + "'", str3, "A#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hi");
    }

    @Test
    public void test04472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04472");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04473");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                        4444444444444444444444444444444444444444444", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                        " + "'", str2, "                                                        ");
    }

    @Test
    public void test04474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04474");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "HICLASS...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04475");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Aahi#####", ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aahi#####" + "'", str3, "Aahi#####");
    }

    @Test
    public void test04476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04476");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                     !ihaa                                                     ", "                                                                                                 hi!IHAA", 2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "....................................................................................#######...");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "                                                    !ihaa                                                     " });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "                                                    !ihaa                                                     " });
    }

    @Test
    public void test04477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04477");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "############################################               a               ############################################                                                     !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                            ", (java.lang.CharSequence) "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "############################################               a               ############################################                                                     !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                            " + "'", charSequence2, "############################################               a               ############################################                                                     !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                            ");
    }

    @Test
    public void test04478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04478");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aAHI", 33, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04479");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('a', 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04480");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("aahi###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aahi###" + "'", str1, "aahi###");
    }

    @Test
    public void test04481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04481");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", "AAHI");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAHIaaaaaaaaaaaaa######################################################################", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test04482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04482");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                               ", 111, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                               ################################################################################" + "'", str3, "                               ################################################################################");
    }

    @Test
    public void test04483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04483");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("... [LJAVA.L...", 68);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... [LJAVA.L..." + "'", str2, "... [LJAVA.L...");
    }

    @Test
    public void test04484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04484");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "", 119);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test04485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04485");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("               hi!                ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "hia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "  aahi4   ", (int) (byte) 0, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test04486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04486");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test04487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04487");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;" + "'", charSequence2, "CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;");
    }

    @Test
    public void test04488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04488");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 970, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04489");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("", "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;", "!ihaa                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04490");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("##########                        ##########      a4hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########                        ##########      a4hi!" + "'", str1, "##########                        ##########      a4hi!");
    }

    @Test
    public void test04491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04491");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AA              ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AA", "", "", "", "", "", "", "", "", "", "", "", "", "", "" });
    }

    @Test
    public void test04492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04492");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("aaaaaaaaaaaaaa                                                                                                 hi!IHAA", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaa" + "'", str2, "aaaaaaaaa");
    }

    @Test
    public void test04493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04493");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "a4!", (java.lang.CharSequence) "                a                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04494");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "...aaa#######################################################################aaaaaaaaaaaaa", (java.lang.CharSequence) "Aahi#####", 180);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04495");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "...", (java.lang.CharSequence) "               a hi!        ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test04496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04496");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa", (java.lang.CharSequence) "##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04497");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("AHi       AHi      #a#AHi       AHi       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       iHA       iHA#a#      iHA       iHA" + "'", str1, "       iHA       iHA#a#      iHA       iHA");
    }

    @Test
    public void test04498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04498");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("Aahi####", " aHi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04499");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hhhhhh", "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhh" + "'", str2, "hhhhhh");
    }

    @Test
    public void test04500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04500");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "                                                                              ", (java.lang.CharSequence) "ahi#ahi#ahi#ahi#aahi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}

