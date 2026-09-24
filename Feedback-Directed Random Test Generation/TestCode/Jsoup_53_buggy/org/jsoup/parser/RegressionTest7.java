package org.jsoup.parser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str11 = tokenQueue1.chompTo("");
        java.lang.String str12 = tokenQueue1.consumeTagName();
        java.lang.String str14 = tokenQueue1.chompTo("");
        tokenQueue1.addFirst((java.lang.Character) '#');
        java.lang.String str19 = tokenQueue1.chompBalanced(' ', '#');
        boolean boolean20 = tokenQueue1.consumeWhitespace();
        boolean boolean21 = tokenQueue1.isEmpty();
        java.lang.String str23 = tokenQueue1.consumeToIgnoreCase(" ");
        java.lang.String str26 = tokenQueue1.chompBalanced('#', 'h');
        tokenQueue1.advance();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        boolean boolean4 = tokenQueue1.matchesStartTag();
        boolean boolean6 = tokenQueue1.matchChomp("hi!");
        char char7 = tokenQueue1.peek();
        boolean boolean8 = tokenQueue1.matchesWhitespace();
        boolean boolean9 = tokenQueue1.matchesWord();
        tokenQueue1.addFirst("");
        java.lang.String str12 = tokenQueue1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str10 = tokenQueue1.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        boolean boolean16 = tokenQueue12.matchesAny(strArray15);
        boolean boolean17 = tokenQueue1.matchesAny(strArray15);
        boolean boolean18 = tokenQueue1.matchesWhitespace();
        tokenQueue1.addFirst("4");
        boolean boolean21 = tokenQueue1.isEmpty();
        java.lang.String str22 = tokenQueue1.remainder();
        boolean boolean23 = tokenQueue1.isEmpty();
        boolean boolean25 = tokenQueue1.matches("\000");
        java.lang.String str26 = tokenQueue1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4" + "'", str22, "4");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        java.lang.String str6 = tokenQueue1.remainder();
        boolean boolean7 = tokenQueue1.consumeWhitespace();
        char char8 = tokenQueue1.peek();
        tokenQueue1.addFirst("");
        java.lang.String str11 = tokenQueue1.consumeElementSelector();
        java.lang.String str12 = tokenQueue1.consumeCssIdentifier();
        java.lang.String str13 = tokenQueue1.consumeTagName();
        java.lang.String str14 = tokenQueue1.consumeWord();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        boolean boolean4 = tokenQueue1.matchesStartTag();
        boolean boolean6 = tokenQueue1.matches("");
        java.lang.String str7 = tokenQueue1.consumeCssIdentifier();
        tokenQueue1.addFirst("hi");
        boolean boolean11 = tokenQueue1.matchesCS("");
        boolean boolean12 = tokenQueue1.isEmpty();
        java.lang.String str13 = tokenQueue1.consumeAttributeKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi" + "'", str13, "hi");
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        java.lang.String str6 = tokenQueue1.remainder();
        boolean boolean7 = tokenQueue1.consumeWhitespace();
        tokenQueue1.advance();
        java.lang.String str9 = tokenQueue1.toString();
        java.lang.String str12 = tokenQueue1.chompBalanced(' ', 'a');
        java.lang.String str13 = tokenQueue1.consumeTagName();
        org.jsoup.parser.TokenQueue tokenQueue15 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        boolean boolean19 = tokenQueue15.matchesAny(strArray18);
        java.lang.String str20 = tokenQueue15.consumeTagName();
        org.jsoup.parser.TokenQueue tokenQueue22 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str24 = tokenQueue22.chompTo("");
        boolean boolean25 = tokenQueue22.matchesStartTag();
        boolean boolean27 = tokenQueue22.matches("");
        java.lang.String str28 = tokenQueue22.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue30 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str32 = tokenQueue30.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue34 = new org.jsoup.parser.TokenQueue("");
        char[] charArray41 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean42 = tokenQueue34.matchesAny(charArray41);
        boolean boolean43 = tokenQueue30.matchesAny(charArray41);
        org.jsoup.parser.TokenQueue tokenQueue45 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray48 = new java.lang.String[] { "", "" };
        boolean boolean49 = tokenQueue45.matchesAny(strArray48);
        boolean boolean50 = tokenQueue30.matchesAny(strArray48);
        boolean boolean51 = tokenQueue22.matchesAny(strArray48);
        boolean boolean52 = tokenQueue22.isEmpty();
        java.lang.String str53 = tokenQueue22.remainder();
        char char54 = tokenQueue22.peek();
        org.jsoup.parser.TokenQueue tokenQueue56 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray59 = new java.lang.String[] { "", "" };
        boolean boolean60 = tokenQueue56.matchesAny(strArray59);
        java.lang.String str61 = tokenQueue56.remainder();
        boolean boolean62 = tokenQueue56.consumeWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue64 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray67 = new java.lang.String[] { "", "" };
        boolean boolean68 = tokenQueue64.matchesAny(strArray67);
        java.lang.String str69 = tokenQueue64.consumeTagName();
        org.jsoup.parser.TokenQueue tokenQueue71 = new org.jsoup.parser.TokenQueue("");
        char[] charArray78 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean79 = tokenQueue71.matchesAny(charArray78);
        boolean boolean80 = tokenQueue64.matchesAny(charArray78);
        boolean boolean81 = tokenQueue56.matchesAny(charArray78);
        boolean boolean82 = tokenQueue22.matchesAny(charArray78);
        boolean boolean83 = tokenQueue15.matchesAny(charArray78);
        org.jsoup.parser.TokenQueue tokenQueue85 = new org.jsoup.parser.TokenQueue("hi!");
        java.lang.String str86 = tokenQueue85.remainder();
        java.lang.String[] strArray91 = new java.lang.String[] { "4", "hi!", "hi!", "hi" };
        boolean boolean92 = tokenQueue85.matchesAny(strArray91);
        boolean boolean93 = tokenQueue15.matchesAny(strArray91);
        java.lang.String str94 = tokenQueue1.consumeToAny(strArray91);
        boolean boolean96 = tokenQueue1.matchesCS("i!");
        // The following exception was thrown during execution in test generation
        try {
            char char97 = tokenQueue1.consume();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + char54 + "' != '" + '\000' + "'", char54 == '\000');
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertArrayEquals(charArray78, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertArrayEquals(strArray91, new java.lang.String[] { "4", "hi!", "hi!", "hi" });
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        boolean boolean4 = tokenQueue1.matchesStartTag();
        tokenQueue1.addFirst("");
        org.jsoup.parser.TokenQueue tokenQueue8 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str10 = tokenQueue8.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("");
        char[] charArray19 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean20 = tokenQueue12.matchesAny(charArray19);
        boolean boolean21 = tokenQueue8.matchesAny(charArray19);
        org.jsoup.parser.TokenQueue tokenQueue23 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray26 = new java.lang.String[] { "", "" };
        boolean boolean27 = tokenQueue23.matchesAny(strArray26);
        boolean boolean28 = tokenQueue8.matchesAny(strArray26);
        boolean boolean29 = tokenQueue1.matchesAny(strArray26);
        boolean boolean30 = tokenQueue1.isEmpty();
        tokenQueue1.advance();
        java.lang.String str33 = tokenQueue1.chompToIgnoreCase("i");
        boolean boolean34 = tokenQueue1.matchesWhitespace();
        boolean boolean36 = tokenQueue1.matchChomp("a");
        java.lang.String str37 = tokenQueue1.toString();
        java.lang.String str39 = tokenQueue1.consumeTo("hi!");
        java.lang.Class<?> wildcardClass40 = tokenQueue1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        boolean boolean4 = tokenQueue1.matchesStartTag();
        boolean boolean6 = tokenQueue1.matches("");
        boolean boolean8 = tokenQueue1.matchChomp("");
        java.lang.String str9 = tokenQueue1.remainder();
        org.jsoup.parser.TokenQueue tokenQueue11 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str13 = tokenQueue11.chompTo("");
        java.lang.String str14 = tokenQueue11.consumeElementSelector();
        java.lang.String str17 = tokenQueue11.chompBalanced('a', '4');
        org.jsoup.parser.TokenQueue tokenQueue19 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str21 = tokenQueue19.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue23 = new org.jsoup.parser.TokenQueue("");
        char[] charArray30 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean31 = tokenQueue23.matchesAny(charArray30);
        boolean boolean32 = tokenQueue19.matchesAny(charArray30);
        boolean boolean33 = tokenQueue11.matchesAny(charArray30);
        tokenQueue11.addFirst((java.lang.Character) '#');
        java.lang.String str36 = tokenQueue11.remainder();
        java.lang.String str37 = tokenQueue11.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue39 = new org.jsoup.parser.TokenQueue("");
        char[] charArray46 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean47 = tokenQueue39.matchesAny(charArray46);
        org.jsoup.parser.TokenQueue tokenQueue49 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str51 = tokenQueue49.chompTo("");
        boolean boolean52 = tokenQueue49.matchesStartTag();
        boolean boolean54 = tokenQueue49.matches("hi!");
        tokenQueue49.consume("");
        org.jsoup.parser.TokenQueue tokenQueue58 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str60 = tokenQueue58.chompTo("");
        tokenQueue58.advance();
        boolean boolean62 = tokenQueue58.matchesWhitespace();
        boolean boolean64 = tokenQueue58.matchChomp("hi!");
        org.jsoup.parser.TokenQueue tokenQueue66 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray69 = new java.lang.String[] { "", "" };
        boolean boolean70 = tokenQueue66.matchesAny(strArray69);
        java.lang.String str71 = tokenQueue66.remainder();
        org.jsoup.parser.TokenQueue tokenQueue73 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str75 = tokenQueue73.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue77 = new org.jsoup.parser.TokenQueue("");
        char[] charArray84 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean85 = tokenQueue77.matchesAny(charArray84);
        boolean boolean86 = tokenQueue73.matchesAny(charArray84);
        boolean boolean87 = tokenQueue66.matchesAny(charArray84);
        boolean boolean88 = tokenQueue58.matchesAny(charArray84);
        boolean boolean89 = tokenQueue49.matchesAny(charArray84);
        boolean boolean90 = tokenQueue39.matchesAny(charArray84);
        boolean boolean91 = tokenQueue11.matchesAny(charArray84);
        boolean boolean92 = tokenQueue1.matchesAny(charArray84);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#" + "'", str36, "#");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(charArray84);
        org.junit.Assert.assertArrayEquals(charArray84, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        boolean boolean2 = tokenQueue1.matchesWord();
        java.lang.String str3 = tokenQueue1.consumeTagName();
        org.jsoup.parser.TokenQueue tokenQueue5 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str7 = tokenQueue5.chompTo("");
        boolean boolean8 = tokenQueue5.matchesStartTag();
        tokenQueue5.addFirst("");
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str14 = tokenQueue12.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue16 = new org.jsoup.parser.TokenQueue("");
        char[] charArray23 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean24 = tokenQueue16.matchesAny(charArray23);
        boolean boolean25 = tokenQueue12.matchesAny(charArray23);
        org.jsoup.parser.TokenQueue tokenQueue27 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        boolean boolean31 = tokenQueue27.matchesAny(strArray30);
        boolean boolean32 = tokenQueue12.matchesAny(strArray30);
        boolean boolean33 = tokenQueue5.matchesAny(strArray30);
        java.lang.String str34 = tokenQueue1.consumeToAny(strArray30);
        boolean boolean36 = tokenQueue1.matchesCS("hi!");
        boolean boolean38 = tokenQueue1.matchesCS("");
        boolean boolean40 = tokenQueue1.matchesCS("");
        boolean boolean42 = tokenQueue1.matches("#\000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        boolean boolean2 = tokenQueue1.matchesWord();
        char[] charArray4 = new char[] { ' ' };
        boolean boolean5 = tokenQueue1.matchesAny(charArray4);
        boolean boolean6 = tokenQueue1.matchesStartTag();
        java.lang.String str8 = tokenQueue1.chompTo("hi!");
        char char9 = tokenQueue1.peek();
        boolean boolean10 = tokenQueue1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        char[] charArray8 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean9 = tokenQueue1.matchesAny(charArray8);
        boolean boolean10 = tokenQueue1.matchesWord();
        java.lang.String str12 = tokenQueue1.consumeToIgnoreCase("hi!");
        tokenQueue1.addFirst("");
        java.lang.String str15 = tokenQueue1.toString();
        boolean boolean17 = tokenQueue1.matchesCS(" ");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        char[] charArray8 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean9 = tokenQueue1.matchesAny(charArray8);
        boolean boolean10 = tokenQueue1.matchesWord();
        java.lang.String str12 = tokenQueue1.consumeToIgnoreCase("hi!");
        tokenQueue1.addFirst("");
        tokenQueue1.consume("");
        java.lang.String str17 = tokenQueue1.consumeWord();
        java.lang.String str18 = tokenQueue1.consumeWord();
        java.lang.String str21 = tokenQueue1.chompBalanced('a', '4');
        org.jsoup.parser.TokenQueue tokenQueue23 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str25 = tokenQueue23.chompTo("");
        java.lang.String str26 = tokenQueue23.consumeElementSelector();
        java.lang.String str29 = tokenQueue23.chompBalanced('a', '4');
        boolean boolean31 = tokenQueue23.matchesCS("");
        java.lang.String str32 = tokenQueue23.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue34 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray37 = new java.lang.String[] { "", "" };
        boolean boolean38 = tokenQueue34.matchesAny(strArray37);
        boolean boolean39 = tokenQueue23.matchesAny(strArray37);
        java.lang.String str41 = tokenQueue23.chompTo("hi!");
        java.lang.String str42 = tokenQueue23.consumeWord();
        java.lang.String str43 = tokenQueue23.consumeCssIdentifier();
        org.jsoup.parser.TokenQueue tokenQueue45 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str47 = tokenQueue45.chompTo("");
        java.lang.String str48 = tokenQueue45.consumeElementSelector();
        java.lang.String str51 = tokenQueue45.chompBalanced('a', '4');
        boolean boolean53 = tokenQueue45.matchesCS("");
        java.lang.String str54 = tokenQueue45.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue56 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray59 = new java.lang.String[] { "", "" };
        boolean boolean60 = tokenQueue56.matchesAny(strArray59);
        boolean boolean61 = tokenQueue45.matchesAny(strArray59);
        java.lang.String str62 = tokenQueue23.consumeToAny(strArray59);
        java.lang.String str63 = tokenQueue1.consumeToAny(strArray59);
        java.lang.String str64 = tokenQueue1.remainder();
        tokenQueue1.advance();
        tokenQueue1.consume("");
        java.lang.String str68 = tokenQueue1.remainder();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        char[] charArray8 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean9 = tokenQueue1.matchesAny(charArray8);
        boolean boolean10 = tokenQueue1.matchesWord();
        java.lang.String str12 = tokenQueue1.consumeToIgnoreCase("hi!");
        tokenQueue1.addFirst("");
        boolean boolean15 = tokenQueue1.matchesStartTag();
        boolean boolean16 = tokenQueue1.matchesWhitespace();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        boolean boolean4 = tokenQueue1.matchesWord();
        java.lang.String str5 = tokenQueue1.consumeWord();
        boolean boolean6 = tokenQueue1.matchesWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue8 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str10 = tokenQueue8.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("");
        char[] charArray19 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean20 = tokenQueue12.matchesAny(charArray19);
        boolean boolean21 = tokenQueue8.matchesAny(charArray19);
        boolean boolean22 = tokenQueue8.matchesWord();
        java.lang.String str23 = tokenQueue8.consumeWord();
        java.lang.String str26 = tokenQueue8.chompBalanced(' ', '#');
        char char27 = tokenQueue8.peek();
        boolean boolean29 = tokenQueue8.matchChomp("");
        org.jsoup.parser.TokenQueue tokenQueue31 = new org.jsoup.parser.TokenQueue("");
        boolean boolean32 = tokenQueue31.matchesWord();
        char[] charArray34 = new char[] { ' ' };
        boolean boolean35 = tokenQueue31.matchesAny(charArray34);
        boolean boolean36 = tokenQueue31.matchesStartTag();
        org.jsoup.parser.TokenQueue tokenQueue38 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str40 = tokenQueue38.chompTo("");
        java.lang.String str41 = tokenQueue38.consumeElementSelector();
        java.lang.String str44 = tokenQueue38.chompBalanced('a', '4');
        boolean boolean46 = tokenQueue38.matchesCS("");
        java.lang.String str48 = tokenQueue38.chompTo("");
        java.lang.String str49 = tokenQueue38.consumeTagName();
        boolean boolean50 = tokenQueue38.matchesWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue52 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str54 = tokenQueue52.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue56 = new org.jsoup.parser.TokenQueue("");
        char[] charArray63 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean64 = tokenQueue56.matchesAny(charArray63);
        boolean boolean65 = tokenQueue52.matchesAny(charArray63);
        org.jsoup.parser.TokenQueue tokenQueue67 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray70 = new java.lang.String[] { "", "" };
        boolean boolean71 = tokenQueue67.matchesAny(strArray70);
        boolean boolean72 = tokenQueue52.matchesAny(strArray70);
        boolean boolean73 = tokenQueue38.matchesAny(strArray70);
        boolean boolean74 = tokenQueue31.matchesAny(strArray70);
        boolean boolean75 = tokenQueue8.matchesAny(strArray70);
        boolean boolean76 = tokenQueue1.matchesAny(strArray70);
        boolean boolean78 = tokenQueue1.matchChomp("44");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '\000' + "'", char27 == '\000');
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertArrayEquals(charArray63, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str10 = tokenQueue1.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        boolean boolean16 = tokenQueue12.matchesAny(strArray15);
        boolean boolean17 = tokenQueue1.matchesAny(strArray15);
        boolean boolean18 = tokenQueue1.matchesWhitespace();
        java.lang.String str20 = tokenQueue1.consumeTo("");
        org.jsoup.parser.TokenQueue tokenQueue22 = new org.jsoup.parser.TokenQueue("");
        boolean boolean23 = tokenQueue22.matchesWord();
        tokenQueue22.consume("");
        java.lang.String str26 = tokenQueue22.consumeAttributeKey();
        org.jsoup.parser.TokenQueue tokenQueue28 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str30 = tokenQueue28.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue32 = new org.jsoup.parser.TokenQueue("");
        char[] charArray39 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean40 = tokenQueue32.matchesAny(charArray39);
        boolean boolean41 = tokenQueue28.matchesAny(charArray39);
        org.jsoup.parser.TokenQueue tokenQueue43 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray46 = new java.lang.String[] { "", "" };
        boolean boolean47 = tokenQueue43.matchesAny(strArray46);
        boolean boolean48 = tokenQueue28.matchesAny(strArray46);
        java.lang.String str49 = tokenQueue22.consumeToAny(strArray46);
        java.lang.String str50 = tokenQueue1.consumeToAny(strArray46);
        boolean boolean51 = tokenQueue1.matchesStartTag();
        org.jsoup.parser.TokenQueue tokenQueue53 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str56 = tokenQueue53.chompBalanced(' ', 'a');
        java.lang.String str57 = tokenQueue53.remainder();
        java.lang.String str58 = tokenQueue53.remainder();
        java.lang.String str60 = tokenQueue53.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue62 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray65 = new java.lang.String[] { "", "" };
        boolean boolean66 = tokenQueue62.matchesAny(strArray65);
        java.lang.String str67 = tokenQueue62.consumeTagName();
        org.jsoup.parser.TokenQueue tokenQueue69 = new org.jsoup.parser.TokenQueue("");
        char[] charArray76 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean77 = tokenQueue69.matchesAny(charArray76);
        boolean boolean78 = tokenQueue62.matchesAny(charArray76);
        boolean boolean79 = tokenQueue53.matchesAny(charArray76);
        boolean boolean80 = tokenQueue1.matchesAny(charArray76);
        boolean boolean82 = tokenQueue1.matchChomp("4a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(charArray76);
        org.junit.Assert.assertArrayEquals(charArray76, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        java.lang.String str6 = tokenQueue1.remainder();
        boolean boolean7 = tokenQueue1.consumeWhitespace();
        boolean boolean8 = tokenQueue1.matchesWhitespace();
        boolean boolean9 = tokenQueue1.isEmpty();
        boolean boolean11 = tokenQueue1.matches("a");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompToIgnoreCase("hi!");
        boolean boolean4 = tokenQueue1.isEmpty();
        boolean boolean6 = tokenQueue1.matchesCS("hi!");
        boolean boolean8 = tokenQueue1.matchChomp("");
        java.lang.String str9 = tokenQueue1.toString();
        boolean boolean11 = tokenQueue1.matches("i!");
        boolean boolean12 = tokenQueue1.matchesWhitespace();
        tokenQueue1.addFirst((java.lang.Character) '\000');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str11 = tokenQueue1.chompTo("");
        java.lang.String str12 = tokenQueue1.consumeTagName();
        boolean boolean14 = tokenQueue1.matchesCS("");
        tokenQueue1.addFirst((java.lang.Character) '\000');
        boolean boolean17 = tokenQueue1.consumeWhitespace();
        java.lang.String str18 = tokenQueue1.consumeTagName();
        tokenQueue1.addFirst("#");
        boolean boolean22 = tokenQueue1.matchChomp("");
        char char23 = tokenQueue1.consume();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '#' + "'", char23 == '#');
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        java.lang.String str6 = tokenQueue1.remainder();
        boolean boolean7 = tokenQueue1.consumeWhitespace();
        tokenQueue1.advance();
        java.lang.String str9 = tokenQueue1.toString();
        boolean boolean10 = tokenQueue1.matchesWord();
        boolean boolean12 = tokenQueue1.matchChomp(" ");
        java.lang.String str14 = tokenQueue1.chompToIgnoreCase("44");
        boolean boolean15 = tokenQueue1.isEmpty();
        java.lang.String str18 = tokenQueue1.chompBalanced('!', '4');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        boolean boolean4 = tokenQueue1.matchesStartTag();
        boolean boolean6 = tokenQueue1.matches("");
        java.lang.String str7 = tokenQueue1.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue9 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str11 = tokenQueue9.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        char[] charArray20 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean21 = tokenQueue13.matchesAny(charArray20);
        boolean boolean22 = tokenQueue9.matchesAny(charArray20);
        org.jsoup.parser.TokenQueue tokenQueue24 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        boolean boolean28 = tokenQueue24.matchesAny(strArray27);
        boolean boolean29 = tokenQueue9.matchesAny(strArray27);
        boolean boolean30 = tokenQueue1.matchesAny(strArray27);
        boolean boolean31 = tokenQueue1.consumeWhitespace();
        boolean boolean33 = tokenQueue1.matchesCS("");
        java.lang.String str36 = tokenQueue1.chompBalanced(' ', '#');
        org.jsoup.parser.TokenQueue tokenQueue38 = new org.jsoup.parser.TokenQueue("");
        char[] charArray45 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean46 = tokenQueue38.matchesAny(charArray45);
        boolean boolean47 = tokenQueue1.matchesAny(charArray45);
        java.lang.String str48 = tokenQueue1.consumeWord();
        java.lang.String str49 = tokenQueue1.consumeWord();
        java.lang.String str51 = tokenQueue1.consumeToIgnoreCase("i!");
        boolean boolean52 = tokenQueue1.isEmpty();
        java.lang.String str53 = tokenQueue1.consumeTagName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str4 = tokenQueue1.chompBalanced(' ', 'a');
        java.lang.String str7 = tokenQueue1.chompBalanced('\000', '4');
        java.lang.String str8 = tokenQueue1.remainder();
        java.lang.String str9 = tokenQueue1.consumeTagName();
        tokenQueue1.addFirst((java.lang.Character) 'a');
        boolean boolean12 = tokenQueue1.isEmpty();
        boolean boolean13 = tokenQueue1.consumeWhitespace();
        tokenQueue1.addFirst("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str5 = tokenQueue1.consumeTagName();
        java.lang.String str6 = tokenQueue1.consumeElementSelector();
        boolean boolean7 = tokenQueue1.matchesStartTag();
        java.lang.String str8 = tokenQueue1.consumeElementSelector();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        char[] charArray8 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean9 = tokenQueue1.matchesAny(charArray8);
        java.lang.String str10 = tokenQueue1.remainder();
        java.lang.String str11 = tokenQueue1.toString();
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str15 = tokenQueue13.chompTo("");
        boolean boolean16 = tokenQueue13.matchesStartTag();
        boolean boolean18 = tokenQueue13.matches("");
        java.lang.String str19 = tokenQueue13.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue21 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str23 = tokenQueue21.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue25 = new org.jsoup.parser.TokenQueue("");
        char[] charArray32 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean33 = tokenQueue25.matchesAny(charArray32);
        boolean boolean34 = tokenQueue21.matchesAny(charArray32);
        org.jsoup.parser.TokenQueue tokenQueue36 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray39 = new java.lang.String[] { "", "" };
        boolean boolean40 = tokenQueue36.matchesAny(strArray39);
        boolean boolean41 = tokenQueue21.matchesAny(strArray39);
        boolean boolean42 = tokenQueue13.matchesAny(strArray39);
        boolean boolean43 = tokenQueue1.matchesAny(strArray39);
        java.lang.String str45 = tokenQueue1.consumeTo("hi!");
        java.lang.String str46 = tokenQueue1.toString();
        boolean boolean48 = tokenQueue1.matches("");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str11 = tokenQueue1.chompTo("");
        java.lang.String str12 = tokenQueue1.consumeTagName();
        boolean boolean14 = tokenQueue1.matchesCS("");
        tokenQueue1.addFirst((java.lang.Character) '\000');
        java.lang.String str19 = tokenQueue1.chompBalanced('4', 'h');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        boolean boolean4 = tokenQueue1.matchesWord();
        tokenQueue1.addFirst(" ");
        java.lang.String str7 = tokenQueue1.consumeElementSelector();
        java.lang.String str9 = tokenQueue1.chompTo("a");
        java.lang.String str11 = tokenQueue1.chompToIgnoreCase("4");
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        boolean boolean14 = tokenQueue13.matchesWord();
        char[] charArray16 = new char[] { ' ' };
        boolean boolean17 = tokenQueue13.matchesAny(charArray16);
        boolean boolean18 = tokenQueue13.matchesStartTag();
        org.jsoup.parser.TokenQueue tokenQueue20 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str22 = tokenQueue20.chompTo("");
        java.lang.String str23 = tokenQueue20.consumeElementSelector();
        java.lang.String str26 = tokenQueue20.chompBalanced('a', '4');
        boolean boolean28 = tokenQueue20.matchesCS("");
        java.lang.String str30 = tokenQueue20.chompTo("");
        java.lang.String str31 = tokenQueue20.consumeTagName();
        boolean boolean32 = tokenQueue20.matchesWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue34 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str36 = tokenQueue34.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue38 = new org.jsoup.parser.TokenQueue("");
        char[] charArray45 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean46 = tokenQueue38.matchesAny(charArray45);
        boolean boolean47 = tokenQueue34.matchesAny(charArray45);
        org.jsoup.parser.TokenQueue tokenQueue49 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray52 = new java.lang.String[] { "", "" };
        boolean boolean53 = tokenQueue49.matchesAny(strArray52);
        boolean boolean54 = tokenQueue34.matchesAny(strArray52);
        boolean boolean55 = tokenQueue20.matchesAny(strArray52);
        boolean boolean56 = tokenQueue13.matchesAny(strArray52);
        org.jsoup.parser.TokenQueue tokenQueue58 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str60 = tokenQueue58.chompToIgnoreCase("hi!");
        boolean boolean61 = tokenQueue58.isEmpty();
        boolean boolean63 = tokenQueue58.matchesCS("hi!");
        org.jsoup.parser.TokenQueue tokenQueue65 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str67 = tokenQueue65.chompTo("");
        boolean boolean68 = tokenQueue65.matchesStartTag();
        tokenQueue65.addFirst("");
        org.jsoup.parser.TokenQueue tokenQueue72 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str74 = tokenQueue72.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue76 = new org.jsoup.parser.TokenQueue("");
        char[] charArray83 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean84 = tokenQueue76.matchesAny(charArray83);
        boolean boolean85 = tokenQueue72.matchesAny(charArray83);
        org.jsoup.parser.TokenQueue tokenQueue87 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray90 = new java.lang.String[] { "", "" };
        boolean boolean91 = tokenQueue87.matchesAny(strArray90);
        boolean boolean92 = tokenQueue72.matchesAny(strArray90);
        boolean boolean93 = tokenQueue65.matchesAny(strArray90);
        java.lang.String str94 = tokenQueue58.consumeToAny(strArray90);
        java.lang.String str95 = tokenQueue13.consumeToAny(strArray90);
        boolean boolean96 = tokenQueue1.matchesAny(strArray90);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(charArray83);
        org.junit.Assert.assertArrayEquals(charArray83, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertArrayEquals(strArray90, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        java.lang.String str6 = tokenQueue1.consumeTagName();
        org.jsoup.parser.TokenQueue tokenQueue8 = new org.jsoup.parser.TokenQueue("");
        char[] charArray15 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean16 = tokenQueue8.matchesAny(charArray15);
        boolean boolean17 = tokenQueue1.matchesAny(charArray15);
        java.lang.String str18 = tokenQueue1.consumeCssIdentifier();
        java.lang.String str19 = tokenQueue1.consumeWord();
        boolean boolean20 = tokenQueue1.matchesWhitespace();
        java.lang.String str21 = tokenQueue1.consumeElementSelector();
        java.lang.String str22 = tokenQueue1.consumeTagName();
        java.lang.String str23 = tokenQueue1.consumeElementSelector();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        char[] charArray8 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean9 = tokenQueue1.matchesAny(charArray8);
        boolean boolean10 = tokenQueue1.matchesWord();
        java.lang.String str12 = tokenQueue1.consumeToIgnoreCase("hi!");
        boolean boolean14 = tokenQueue1.matchChomp("4");
        org.jsoup.parser.TokenQueue tokenQueue16 = new org.jsoup.parser.TokenQueue("");
        char[] charArray23 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean24 = tokenQueue16.matchesAny(charArray23);
        org.jsoup.parser.TokenQueue tokenQueue26 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str28 = tokenQueue26.chompTo("");
        boolean boolean29 = tokenQueue26.matchesStartTag();
        boolean boolean31 = tokenQueue26.matches("hi!");
        tokenQueue26.consume("");
        org.jsoup.parser.TokenQueue tokenQueue35 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str37 = tokenQueue35.chompTo("");
        tokenQueue35.advance();
        boolean boolean39 = tokenQueue35.matchesWhitespace();
        boolean boolean41 = tokenQueue35.matchChomp("hi!");
        org.jsoup.parser.TokenQueue tokenQueue43 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray46 = new java.lang.String[] { "", "" };
        boolean boolean47 = tokenQueue43.matchesAny(strArray46);
        java.lang.String str48 = tokenQueue43.remainder();
        org.jsoup.parser.TokenQueue tokenQueue50 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str52 = tokenQueue50.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue54 = new org.jsoup.parser.TokenQueue("");
        char[] charArray61 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean62 = tokenQueue54.matchesAny(charArray61);
        boolean boolean63 = tokenQueue50.matchesAny(charArray61);
        boolean boolean64 = tokenQueue43.matchesAny(charArray61);
        boolean boolean65 = tokenQueue35.matchesAny(charArray61);
        boolean boolean66 = tokenQueue26.matchesAny(charArray61);
        boolean boolean67 = tokenQueue16.matchesAny(charArray61);
        boolean boolean68 = tokenQueue1.matchesAny(charArray61);
        char char69 = tokenQueue1.peek();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertArrayEquals(charArray61, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + char69 + "' != '" + '\000' + "'", char69 == '\000');
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        boolean boolean2 = tokenQueue1.matchesWord();
        tokenQueue1.consume("");
        java.lang.String str5 = tokenQueue1.consumeAttributeKey();
        org.jsoup.parser.TokenQueue tokenQueue7 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str9 = tokenQueue7.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue11 = new org.jsoup.parser.TokenQueue("");
        char[] charArray18 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean19 = tokenQueue11.matchesAny(charArray18);
        boolean boolean20 = tokenQueue7.matchesAny(charArray18);
        org.jsoup.parser.TokenQueue tokenQueue22 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        boolean boolean26 = tokenQueue22.matchesAny(strArray25);
        boolean boolean27 = tokenQueue7.matchesAny(strArray25);
        java.lang.String str28 = tokenQueue1.consumeToAny(strArray25);
        java.lang.String str29 = tokenQueue1.consumeTagName();
        boolean boolean31 = tokenQueue1.matches("hi");
        java.lang.String str33 = tokenQueue1.consumeToIgnoreCase("!");
        boolean boolean34 = tokenQueue1.matchesStartTag();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str10 = tokenQueue1.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        boolean boolean16 = tokenQueue12.matchesAny(strArray15);
        boolean boolean17 = tokenQueue1.matchesAny(strArray15);
        boolean boolean18 = tokenQueue1.matchesWhitespace();
        java.lang.String str19 = tokenQueue1.consumeElementSelector();
        boolean boolean21 = tokenQueue1.matchChomp("hi!");
        boolean boolean22 = tokenQueue1.isEmpty();
        boolean boolean23 = tokenQueue1.consumeWhitespace();
        java.lang.String str24 = tokenQueue1.consumeTagName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        boolean boolean4 = tokenQueue1.matchesStartTag();
        boolean boolean6 = tokenQueue1.matches("hi!");
        java.lang.String str8 = tokenQueue1.chompTo("#");
        java.lang.String str9 = tokenQueue1.consumeAttributeKey();
        java.lang.String str10 = tokenQueue1.consumeWord();
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str14 = tokenQueue12.chompTo("");
        tokenQueue12.advance();
        tokenQueue12.addFirst((java.lang.Character) '#');
        org.jsoup.parser.TokenQueue tokenQueue19 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str21 = tokenQueue19.chompTo("");
        java.lang.String str22 = tokenQueue19.consumeElementSelector();
        java.lang.String str25 = tokenQueue19.chompBalanced('a', '4');
        boolean boolean27 = tokenQueue19.matchesCS("");
        java.lang.String str29 = tokenQueue19.chompTo("");
        java.lang.String str30 = tokenQueue19.consumeTagName();
        java.lang.String str32 = tokenQueue19.chompTo("");
        org.jsoup.parser.TokenQueue tokenQueue34 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str36 = tokenQueue34.chompTo("");
        java.lang.String str37 = tokenQueue34.consumeElementSelector();
        java.lang.String str40 = tokenQueue34.chompBalanced('a', '4');
        boolean boolean42 = tokenQueue34.matchesCS("");
        java.lang.String str44 = tokenQueue34.chompTo("");
        java.lang.String str45 = tokenQueue34.consumeTagName();
        boolean boolean46 = tokenQueue34.matchesWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue48 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str50 = tokenQueue48.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue52 = new org.jsoup.parser.TokenQueue("");
        char[] charArray59 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean60 = tokenQueue52.matchesAny(charArray59);
        boolean boolean61 = tokenQueue48.matchesAny(charArray59);
        org.jsoup.parser.TokenQueue tokenQueue63 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray66 = new java.lang.String[] { "", "" };
        boolean boolean67 = tokenQueue63.matchesAny(strArray66);
        boolean boolean68 = tokenQueue48.matchesAny(strArray66);
        boolean boolean69 = tokenQueue34.matchesAny(strArray66);
        boolean boolean70 = tokenQueue19.matchesAny(strArray66);
        boolean boolean71 = tokenQueue12.matchesAny(strArray66);
        boolean boolean72 = tokenQueue1.matchesAny(strArray66);
        java.lang.String str73 = tokenQueue1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        boolean boolean4 = tokenQueue1.matchesStartTag();
        boolean boolean6 = tokenQueue1.matches("");
        java.lang.String str7 = tokenQueue1.consumeCssIdentifier();
        java.lang.String str9 = tokenQueue1.chompToIgnoreCase("hi!");
        java.lang.String str11 = tokenQueue1.chompToIgnoreCase("hi!");
        java.lang.String str12 = tokenQueue1.consumeTagName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        java.lang.String str6 = tokenQueue1.consumeTagName();
        org.jsoup.parser.TokenQueue tokenQueue8 = new org.jsoup.parser.TokenQueue("");
        char[] charArray15 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean16 = tokenQueue8.matchesAny(charArray15);
        boolean boolean17 = tokenQueue1.matchesAny(charArray15);
        java.lang.String str18 = tokenQueue1.consumeCssIdentifier();
        java.lang.String str19 = tokenQueue1.consumeTagName();
        java.lang.String str20 = tokenQueue1.consumeAttributeKey();
        java.lang.String str21 = tokenQueue1.consumeTagName();
        boolean boolean22 = tokenQueue1.matchesWord();
        char char23 = tokenQueue1.peek();
        boolean boolean24 = tokenQueue1.consumeWhitespace();
        boolean boolean26 = tokenQueue1.matchesCS("hi");
        java.lang.String str27 = tokenQueue1.consumeTagName();
        java.lang.String str28 = tokenQueue1.consumeAttributeKey();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue5 = new org.jsoup.parser.TokenQueue("");
        char[] charArray12 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean13 = tokenQueue5.matchesAny(charArray12);
        boolean boolean14 = tokenQueue1.matchesAny(charArray12);
        boolean boolean15 = tokenQueue1.matchesWord();
        org.jsoup.parser.TokenQueue tokenQueue17 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str19 = tokenQueue17.chompToIgnoreCase("hi!");
        boolean boolean20 = tokenQueue17.isEmpty();
        boolean boolean22 = tokenQueue17.matchesCS("hi!");
        org.jsoup.parser.TokenQueue tokenQueue24 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str26 = tokenQueue24.chompTo("");
        boolean boolean27 = tokenQueue24.matchesStartTag();
        tokenQueue24.addFirst("");
        org.jsoup.parser.TokenQueue tokenQueue31 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str33 = tokenQueue31.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue35 = new org.jsoup.parser.TokenQueue("");
        char[] charArray42 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean43 = tokenQueue35.matchesAny(charArray42);
        boolean boolean44 = tokenQueue31.matchesAny(charArray42);
        org.jsoup.parser.TokenQueue tokenQueue46 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray49 = new java.lang.String[] { "", "" };
        boolean boolean50 = tokenQueue46.matchesAny(strArray49);
        boolean boolean51 = tokenQueue31.matchesAny(strArray49);
        boolean boolean52 = tokenQueue24.matchesAny(strArray49);
        java.lang.String str53 = tokenQueue17.consumeToAny(strArray49);
        boolean boolean54 = tokenQueue1.matchesAny(strArray49);
        java.lang.String str55 = tokenQueue1.consumeTagName();
        java.lang.String str56 = tokenQueue1.consumeAttributeKey();
        java.lang.String str58 = tokenQueue1.chompTo("a\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        char[] charArray8 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean9 = tokenQueue1.matchesAny(charArray8);
        java.lang.String str10 = tokenQueue1.remainder();
        java.lang.String str11 = tokenQueue1.toString();
        boolean boolean13 = tokenQueue1.matches("");
        java.lang.String str15 = tokenQueue1.chompToIgnoreCase(" ");
        boolean boolean16 = tokenQueue1.matchesWord();
        boolean boolean18 = tokenQueue1.matches("44!");
        java.lang.String str19 = tokenQueue1.consumeAttributeKey();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        boolean boolean4 = tokenQueue1.matchesStartTag();
        boolean boolean6 = tokenQueue1.matches("hi!");
        java.lang.String str8 = tokenQueue1.chompTo("#");
        java.lang.String str9 = tokenQueue1.consumeAttributeKey();
        java.lang.String str11 = tokenQueue1.consumeTo("44");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = tokenQueue1.chompToIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        boolean boolean6 = tokenQueue1.consumeWhitespace();
        java.lang.String str8 = tokenQueue1.consumeTo("4");
        boolean boolean9 = tokenQueue1.matchesWord();
        tokenQueue1.advance();
        tokenQueue1.addFirst((java.lang.Character) '#');
        java.lang.String str13 = tokenQueue1.consumeAttributeKey();
        tokenQueue1.addFirst("44");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        boolean boolean4 = tokenQueue1.matchesStartTag();
        boolean boolean6 = tokenQueue1.matches("");
        java.lang.String str7 = tokenQueue1.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue9 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str11 = tokenQueue9.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        char[] charArray20 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean21 = tokenQueue13.matchesAny(charArray20);
        boolean boolean22 = tokenQueue9.matchesAny(charArray20);
        org.jsoup.parser.TokenQueue tokenQueue24 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        boolean boolean28 = tokenQueue24.matchesAny(strArray27);
        boolean boolean29 = tokenQueue9.matchesAny(strArray27);
        boolean boolean30 = tokenQueue1.matchesAny(strArray27);
        boolean boolean31 = tokenQueue1.isEmpty();
        java.lang.String str32 = tokenQueue1.remainder();
        char char33 = tokenQueue1.peek();
        org.jsoup.parser.TokenQueue tokenQueue35 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray38 = new java.lang.String[] { "", "" };
        boolean boolean39 = tokenQueue35.matchesAny(strArray38);
        java.lang.String str40 = tokenQueue35.remainder();
        boolean boolean41 = tokenQueue35.consumeWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue43 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray46 = new java.lang.String[] { "", "" };
        boolean boolean47 = tokenQueue43.matchesAny(strArray46);
        java.lang.String str48 = tokenQueue43.consumeTagName();
        org.jsoup.parser.TokenQueue tokenQueue50 = new org.jsoup.parser.TokenQueue("");
        char[] charArray57 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean58 = tokenQueue50.matchesAny(charArray57);
        boolean boolean59 = tokenQueue43.matchesAny(charArray57);
        boolean boolean60 = tokenQueue35.matchesAny(charArray57);
        boolean boolean61 = tokenQueue1.matchesAny(charArray57);
        java.lang.String str62 = tokenQueue1.consumeAttributeKey();
        boolean boolean64 = tokenQueue1.matchChomp("a");
        java.lang.Class<?> wildcardClass65 = tokenQueue1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '\000' + "'", char33 == '\000');
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertArrayEquals(charArray57, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str10 = tokenQueue1.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        boolean boolean16 = tokenQueue12.matchesAny(strArray15);
        boolean boolean17 = tokenQueue1.matchesAny(strArray15);
        boolean boolean18 = tokenQueue1.matchesWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue20 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str22 = tokenQueue20.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue24 = new org.jsoup.parser.TokenQueue("");
        char[] charArray31 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean32 = tokenQueue24.matchesAny(charArray31);
        boolean boolean33 = tokenQueue20.matchesAny(charArray31);
        boolean boolean34 = tokenQueue1.matchesAny(charArray31);
        boolean boolean35 = tokenQueue1.matchesWord();
        org.jsoup.parser.TokenQueue tokenQueue37 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str39 = tokenQueue37.chompTo("");
        boolean boolean40 = tokenQueue37.matchesStartTag();
        tokenQueue37.addFirst("");
        org.jsoup.parser.TokenQueue tokenQueue44 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str46 = tokenQueue44.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue48 = new org.jsoup.parser.TokenQueue("");
        char[] charArray55 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean56 = tokenQueue48.matchesAny(charArray55);
        boolean boolean57 = tokenQueue44.matchesAny(charArray55);
        org.jsoup.parser.TokenQueue tokenQueue59 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray62 = new java.lang.String[] { "", "" };
        boolean boolean63 = tokenQueue59.matchesAny(strArray62);
        boolean boolean64 = tokenQueue44.matchesAny(strArray62);
        boolean boolean65 = tokenQueue37.matchesAny(strArray62);
        org.jsoup.parser.TokenQueue tokenQueue67 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str69 = tokenQueue67.chompTo("");
        java.lang.String str70 = tokenQueue67.consumeElementSelector();
        java.lang.String str73 = tokenQueue67.chompBalanced('a', '4');
        boolean boolean74 = tokenQueue67.matchesWhitespace();
        java.lang.String[] strArray81 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        java.lang.String str82 = tokenQueue67.consumeToAny(strArray81);
        java.lang.String str83 = tokenQueue37.consumeToAny(strArray81);
        java.lang.String str84 = tokenQueue1.consumeToAny(strArray81);
        boolean boolean86 = tokenQueue1.matchesCS("hi");
        boolean boolean87 = tokenQueue1.matchesWhitespace();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "hi!", "", "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        tokenQueue1.advance();
        boolean boolean5 = tokenQueue1.matchesWhitespace();
        boolean boolean7 = tokenQueue1.matches("4");
        java.lang.String str8 = tokenQueue1.consumeCssIdentifier();
        java.lang.String str9 = tokenQueue1.consumeWord();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        boolean boolean5 = tokenQueue1.matchesWord();
        java.lang.String str8 = tokenQueue1.chompBalanced('\000', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue5 = new org.jsoup.parser.TokenQueue("");
        char[] charArray12 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean13 = tokenQueue5.matchesAny(charArray12);
        boolean boolean14 = tokenQueue1.matchesAny(charArray12);
        boolean boolean15 = tokenQueue1.matchesWord();
        java.lang.String str16 = tokenQueue1.consumeWord();
        java.lang.String str19 = tokenQueue1.chompBalanced(' ', '#');
        boolean boolean21 = tokenQueue1.matches("4");
        char char22 = tokenQueue1.peek();
        java.lang.String str24 = tokenQueue1.chompTo("hi!");
        boolean boolean26 = tokenQueue1.matchesCS("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        boolean boolean6 = tokenQueue1.matchesCS("hi!");
        java.lang.String str7 = tokenQueue1.consumeWord();
        org.jsoup.parser.TokenQueue tokenQueue9 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str11 = tokenQueue9.chompTo("");
        tokenQueue9.advance();
        boolean boolean13 = tokenQueue9.matchesWhitespace();
        boolean boolean15 = tokenQueue9.matchChomp("4");
        org.jsoup.parser.TokenQueue tokenQueue17 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str19 = tokenQueue17.chompTo("");
        java.lang.String str20 = tokenQueue17.consumeElementSelector();
        java.lang.String str23 = tokenQueue17.chompBalanced('a', '4');
        boolean boolean25 = tokenQueue17.matchesCS("");
        java.lang.String str26 = tokenQueue17.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue28 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray31 = new java.lang.String[] { "", "" };
        boolean boolean32 = tokenQueue28.matchesAny(strArray31);
        boolean boolean33 = tokenQueue17.matchesAny(strArray31);
        boolean boolean34 = tokenQueue17.matchesWhitespace();
        java.lang.String str36 = tokenQueue17.consumeTo("");
        org.jsoup.parser.TokenQueue tokenQueue38 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str40 = tokenQueue38.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue42 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str44 = tokenQueue42.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue46 = new org.jsoup.parser.TokenQueue("");
        char[] charArray53 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean54 = tokenQueue46.matchesAny(charArray53);
        boolean boolean55 = tokenQueue42.matchesAny(charArray53);
        org.jsoup.parser.TokenQueue tokenQueue57 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray60 = new java.lang.String[] { "", "" };
        boolean boolean61 = tokenQueue57.matchesAny(strArray60);
        boolean boolean62 = tokenQueue42.matchesAny(strArray60);
        java.lang.String str63 = tokenQueue38.consumeToAny(strArray60);
        boolean boolean64 = tokenQueue17.matchesAny(strArray60);
        java.lang.String str65 = tokenQueue9.consumeToAny(strArray60);
        boolean boolean66 = tokenQueue1.matchesAny(strArray60);
        char char67 = tokenQueue1.peek();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + char67 + "' != '" + '\000' + "'", char67 == '\000');
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompToIgnoreCase("hi!");
        boolean boolean4 = tokenQueue1.isEmpty();
        boolean boolean6 = tokenQueue1.matchesCS("hi!");
        org.jsoup.parser.TokenQueue tokenQueue8 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str10 = tokenQueue8.chompTo("");
        boolean boolean11 = tokenQueue8.matchesStartTag();
        tokenQueue8.addFirst("");
        org.jsoup.parser.TokenQueue tokenQueue15 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str17 = tokenQueue15.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue19 = new org.jsoup.parser.TokenQueue("");
        char[] charArray26 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean27 = tokenQueue19.matchesAny(charArray26);
        boolean boolean28 = tokenQueue15.matchesAny(charArray26);
        org.jsoup.parser.TokenQueue tokenQueue30 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray33 = new java.lang.String[] { "", "" };
        boolean boolean34 = tokenQueue30.matchesAny(strArray33);
        boolean boolean35 = tokenQueue15.matchesAny(strArray33);
        boolean boolean36 = tokenQueue8.matchesAny(strArray33);
        java.lang.String str37 = tokenQueue1.consumeToAny(strArray33);
        boolean boolean39 = tokenQueue1.matchChomp("hi!");
        java.lang.String str40 = tokenQueue1.consumeElementSelector();
        boolean boolean41 = tokenQueue1.consumeWhitespace();
        boolean boolean43 = tokenQueue1.matches("4");
        java.lang.String str45 = tokenQueue1.chompToIgnoreCase("#\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        org.jsoup.parser.TokenQueue tokenQueue7 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str9 = tokenQueue7.chompTo("");
        boolean boolean10 = tokenQueue7.matchesStartTag();
        tokenQueue7.addFirst("");
        org.jsoup.parser.TokenQueue tokenQueue14 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str16 = tokenQueue14.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue18 = new org.jsoup.parser.TokenQueue("");
        char[] charArray25 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean26 = tokenQueue18.matchesAny(charArray25);
        boolean boolean27 = tokenQueue14.matchesAny(charArray25);
        org.jsoup.parser.TokenQueue tokenQueue29 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray32 = new java.lang.String[] { "", "" };
        boolean boolean33 = tokenQueue29.matchesAny(strArray32);
        boolean boolean34 = tokenQueue14.matchesAny(strArray32);
        boolean boolean35 = tokenQueue7.matchesAny(strArray32);
        java.lang.String str36 = tokenQueue1.consumeToAny(strArray32);
        boolean boolean37 = tokenQueue1.matchesWhitespace();
        boolean boolean39 = tokenQueue1.matchesCS("");
        java.lang.String str40 = tokenQueue1.toString();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str11 = tokenQueue1.consumeTo("");
        java.lang.String str12 = tokenQueue1.consumeCssIdentifier();
        boolean boolean14 = tokenQueue1.matches("\000");
        boolean boolean16 = tokenQueue1.matchesCS("hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        char[] charArray8 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean9 = tokenQueue1.matchesAny(charArray8);
        boolean boolean10 = tokenQueue1.matchesWord();
        java.lang.String str12 = tokenQueue1.consumeToIgnoreCase("hi!");
        tokenQueue1.addFirst("");
        tokenQueue1.consume("");
        java.lang.String str17 = tokenQueue1.consumeWord();
        java.lang.String str18 = tokenQueue1.consumeWord();
        java.lang.String str21 = tokenQueue1.chompBalanced('a', '4');
        org.jsoup.parser.TokenQueue tokenQueue23 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str25 = tokenQueue23.chompTo("");
        java.lang.String str26 = tokenQueue23.consumeElementSelector();
        java.lang.String str29 = tokenQueue23.chompBalanced('a', '4');
        boolean boolean31 = tokenQueue23.matchesCS("");
        java.lang.String str32 = tokenQueue23.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue34 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray37 = new java.lang.String[] { "", "" };
        boolean boolean38 = tokenQueue34.matchesAny(strArray37);
        boolean boolean39 = tokenQueue23.matchesAny(strArray37);
        java.lang.String str41 = tokenQueue23.chompTo("hi!");
        java.lang.String str42 = tokenQueue23.consumeWord();
        java.lang.String str43 = tokenQueue23.consumeCssIdentifier();
        org.jsoup.parser.TokenQueue tokenQueue45 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str47 = tokenQueue45.chompTo("");
        java.lang.String str48 = tokenQueue45.consumeElementSelector();
        java.lang.String str51 = tokenQueue45.chompBalanced('a', '4');
        boolean boolean53 = tokenQueue45.matchesCS("");
        java.lang.String str54 = tokenQueue45.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue56 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray59 = new java.lang.String[] { "", "" };
        boolean boolean60 = tokenQueue56.matchesAny(strArray59);
        boolean boolean61 = tokenQueue45.matchesAny(strArray59);
        java.lang.String str62 = tokenQueue23.consumeToAny(strArray59);
        java.lang.String str63 = tokenQueue1.consumeToAny(strArray59);
        java.lang.String str64 = tokenQueue1.toString();
        boolean boolean66 = tokenQueue1.matches("hi");
        java.lang.String str67 = tokenQueue1.consumeElementSelector();
        boolean boolean69 = tokenQueue1.matches(" !");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        char[] charArray8 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean9 = tokenQueue1.matchesAny(charArray8);
        boolean boolean10 = tokenQueue1.matchesWord();
        java.lang.String str12 = tokenQueue1.consumeToIgnoreCase("hi!");
        tokenQueue1.addFirst("");
        tokenQueue1.advance();
        tokenQueue1.addFirst((java.lang.Character) '!');
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        boolean boolean10 = tokenQueue1.consumeWhitespace();
        java.lang.String str11 = tokenQueue1.consumeAttributeKey();
        java.lang.String str12 = tokenQueue1.toString();
        java.lang.String str13 = tokenQueue1.remainder();
        java.lang.String str14 = tokenQueue1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str10 = tokenQueue1.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        boolean boolean16 = tokenQueue12.matchesAny(strArray15);
        boolean boolean17 = tokenQueue1.matchesAny(strArray15);
        java.lang.String str19 = tokenQueue1.chompTo("hi!");
        java.lang.String str20 = tokenQueue1.consumeWord();
        java.lang.String str21 = tokenQueue1.consumeCssIdentifier();
        java.lang.String str22 = tokenQueue1.consumeCssIdentifier();
        boolean boolean23 = tokenQueue1.matchesStartTag();
        java.lang.String str25 = tokenQueue1.consumeTo("hi");
        java.lang.String str26 = tokenQueue1.remainder();
        java.lang.Class<?> wildcardClass27 = tokenQueue1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        boolean boolean4 = tokenQueue1.matchesStartTag();
        tokenQueue1.addFirst("");
        java.lang.String str7 = tokenQueue1.consumeWord();
        tokenQueue1.addFirst((java.lang.Character) '#');
        java.lang.String str11 = tokenQueue1.chompTo("");
        boolean boolean12 = tokenQueue1.matchesWord();
        char char13 = tokenQueue1.consume();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '#' + "'", char13 == '#');
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str11 = tokenQueue1.chompTo("");
        java.lang.String str12 = tokenQueue1.consumeTagName();
        boolean boolean14 = tokenQueue1.matchesCS("");
        tokenQueue1.addFirst((java.lang.Character) '\000');
        boolean boolean17 = tokenQueue1.consumeWhitespace();
        boolean boolean19 = tokenQueue1.matchesCS("");
        boolean boolean21 = tokenQueue1.matches("i");
        java.lang.String str22 = tokenQueue1.consumeWord();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        boolean boolean4 = tokenQueue1.matchesStartTag();
        boolean boolean6 = tokenQueue1.matches("hi!");
        tokenQueue1.consume("");
        tokenQueue1.addFirst((java.lang.Character) '4');
        boolean boolean11 = tokenQueue1.isEmpty();
        java.lang.String str13 = tokenQueue1.consumeToIgnoreCase("4");
        tokenQueue1.addFirst((java.lang.Character) 'i');
        boolean boolean16 = tokenQueue1.matchesStartTag();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str10 = tokenQueue1.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        boolean boolean16 = tokenQueue12.matchesAny(strArray15);
        boolean boolean17 = tokenQueue1.matchesAny(strArray15);
        boolean boolean18 = tokenQueue1.matchesWhitespace();
        java.lang.String str19 = tokenQueue1.consumeElementSelector();
        boolean boolean21 = tokenQueue1.matchesCS("4");
        java.lang.String str22 = tokenQueue1.toString();
        java.lang.Class<?> wildcardClass23 = tokenQueue1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        java.lang.String str6 = tokenQueue1.remainder();
        boolean boolean7 = tokenQueue1.consumeWhitespace();
        java.lang.String str9 = tokenQueue1.chompToIgnoreCase("4");
        boolean boolean10 = tokenQueue1.matchesWhitespace();
        boolean boolean12 = tokenQueue1.matches("#");
        boolean boolean13 = tokenQueue1.matchesWhitespace();
        java.lang.String str14 = tokenQueue1.toString();
        java.lang.String str15 = tokenQueue1.consumeCssIdentifier();
        boolean boolean16 = tokenQueue1.consumeWhitespace();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        boolean boolean2 = tokenQueue1.matchesWord();
        tokenQueue1.consume("");
        java.lang.String str5 = tokenQueue1.consumeAttributeKey();
        org.jsoup.parser.TokenQueue tokenQueue7 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str9 = tokenQueue7.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue11 = new org.jsoup.parser.TokenQueue("");
        char[] charArray18 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean19 = tokenQueue11.matchesAny(charArray18);
        boolean boolean20 = tokenQueue7.matchesAny(charArray18);
        org.jsoup.parser.TokenQueue tokenQueue22 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        boolean boolean26 = tokenQueue22.matchesAny(strArray25);
        boolean boolean27 = tokenQueue7.matchesAny(strArray25);
        java.lang.String str28 = tokenQueue1.consumeToAny(strArray25);
        boolean boolean29 = tokenQueue1.consumeWhitespace();
        java.lang.String str30 = tokenQueue1.consumeWord();
        tokenQueue1.addFirst((java.lang.Character) ' ');
        char char33 = tokenQueue1.peek();
        java.lang.String str35 = tokenQueue1.chompTo("hih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + ' ' + "'", char33 == ' ');
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + " " + "'", str35, " ");
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str10 = tokenQueue1.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        boolean boolean16 = tokenQueue12.matchesAny(strArray15);
        boolean boolean17 = tokenQueue1.matchesAny(strArray15);
        boolean boolean18 = tokenQueue1.matchesWhitespace();
        java.lang.String str20 = tokenQueue1.consumeTo("");
        org.jsoup.parser.TokenQueue tokenQueue22 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str24 = tokenQueue22.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue26 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str28 = tokenQueue26.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue30 = new org.jsoup.parser.TokenQueue("");
        char[] charArray37 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean38 = tokenQueue30.matchesAny(charArray37);
        boolean boolean39 = tokenQueue26.matchesAny(charArray37);
        org.jsoup.parser.TokenQueue tokenQueue41 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray44 = new java.lang.String[] { "", "" };
        boolean boolean45 = tokenQueue41.matchesAny(strArray44);
        boolean boolean46 = tokenQueue26.matchesAny(strArray44);
        java.lang.String str47 = tokenQueue22.consumeToAny(strArray44);
        boolean boolean48 = tokenQueue1.matchesAny(strArray44);
        java.lang.String str50 = tokenQueue1.consumeTo("hi!");
        java.lang.String str51 = tokenQueue1.consumeTagName();
        tokenQueue1.addFirst((java.lang.Character) 'h');
        boolean boolean55 = tokenQueue1.matches("i!");
        java.lang.String str56 = tokenQueue1.consumeAttributeKey();
        boolean boolean58 = tokenQueue1.matchesCS("hih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "h" + "'", str56, "h");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        boolean boolean6 = tokenQueue1.matches("");
        boolean boolean7 = tokenQueue1.isEmpty();
        tokenQueue1.addFirst("hi!");
        java.lang.String str11 = tokenQueue1.consumeTo(" !");
        java.lang.String str13 = tokenQueue1.chompTo("4a");
        // The following exception was thrown during execution in test generation
        try {
            tokenQueue1.consume(" ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Queue did not match expected sequence");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str11 = tokenQueue1.chompTo("");
        java.lang.String str12 = tokenQueue1.consumeTagName();
        boolean boolean13 = tokenQueue1.matchesWhitespace();
        boolean boolean15 = tokenQueue1.matchChomp("4");
        java.lang.String str16 = tokenQueue1.consumeCssIdentifier();
        java.lang.String str18 = tokenQueue1.chompToIgnoreCase("a");
        java.lang.String str19 = tokenQueue1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue5 = new org.jsoup.parser.TokenQueue("");
        char[] charArray12 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean13 = tokenQueue5.matchesAny(charArray12);
        boolean boolean14 = tokenQueue1.matchesAny(charArray12);
        boolean boolean15 = tokenQueue1.matchesWord();
        java.lang.String str16 = tokenQueue1.consumeWord();
        java.lang.String str19 = tokenQueue1.chompBalanced(' ', '#');
        char char20 = tokenQueue1.peek();
        boolean boolean22 = tokenQueue1.matchChomp("");
        java.lang.String str23 = tokenQueue1.consumeTagName();
        boolean boolean24 = tokenQueue1.consumeWhitespace();
        boolean boolean26 = tokenQueue1.matchesCS("hih");
        java.lang.String str28 = tokenQueue1.chompTo("4a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        java.lang.String str8 = tokenQueue1.remainder();
        boolean boolean10 = tokenQueue1.matchChomp("");
        java.lang.String str12 = tokenQueue1.chompToIgnoreCase("4");
        boolean boolean13 = tokenQueue1.consumeWhitespace();
        boolean boolean14 = tokenQueue1.matchesWord();
        java.lang.String str15 = tokenQueue1.consumeCssIdentifier();
        boolean boolean16 = tokenQueue1.isEmpty();
        java.lang.Class<?> wildcardClass17 = tokenQueue1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        java.lang.String str6 = tokenQueue1.consumeTagName();
        org.jsoup.parser.TokenQueue tokenQueue8 = new org.jsoup.parser.TokenQueue("");
        char[] charArray15 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean16 = tokenQueue8.matchesAny(charArray15);
        boolean boolean17 = tokenQueue1.matchesAny(charArray15);
        java.lang.String str18 = tokenQueue1.consumeCssIdentifier();
        java.lang.String str19 = tokenQueue1.consumeWord();
        boolean boolean20 = tokenQueue1.matchesWhitespace();
        java.lang.String str21 = tokenQueue1.consumeElementSelector();
        // The following exception was thrown during execution in test generation
        try {
            tokenQueue1.consume(" ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Queue did not match expected sequence");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompToIgnoreCase("hi!");
        boolean boolean4 = tokenQueue1.matchesWord();
        tokenQueue1.advance();
        java.lang.String str6 = tokenQueue1.consumeTagName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        boolean boolean6 = tokenQueue1.matchesWhitespace();
        java.lang.String str7 = tokenQueue1.consumeCssIdentifier();
        org.jsoup.parser.TokenQueue tokenQueue9 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str11 = tokenQueue9.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        char[] charArray20 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean21 = tokenQueue13.matchesAny(charArray20);
        boolean boolean22 = tokenQueue9.matchesAny(charArray20);
        boolean boolean23 = tokenQueue1.matchesAny(charArray20);
        boolean boolean24 = tokenQueue1.matchesWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue26 = new org.jsoup.parser.TokenQueue("");
        boolean boolean27 = tokenQueue26.matchesWord();
        char[] charArray29 = new char[] { ' ' };
        boolean boolean30 = tokenQueue26.matchesAny(charArray29);
        boolean boolean31 = tokenQueue26.matchesStartTag();
        org.jsoup.parser.TokenQueue tokenQueue33 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str35 = tokenQueue33.chompTo("");
        java.lang.String str36 = tokenQueue33.consumeElementSelector();
        java.lang.String str39 = tokenQueue33.chompBalanced('a', '4');
        boolean boolean41 = tokenQueue33.matchesCS("");
        java.lang.String str43 = tokenQueue33.chompTo("");
        java.lang.String str44 = tokenQueue33.consumeTagName();
        boolean boolean45 = tokenQueue33.matchesWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue47 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str49 = tokenQueue47.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue51 = new org.jsoup.parser.TokenQueue("");
        char[] charArray58 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean59 = tokenQueue51.matchesAny(charArray58);
        boolean boolean60 = tokenQueue47.matchesAny(charArray58);
        org.jsoup.parser.TokenQueue tokenQueue62 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray65 = new java.lang.String[] { "", "" };
        boolean boolean66 = tokenQueue62.matchesAny(strArray65);
        boolean boolean67 = tokenQueue47.matchesAny(strArray65);
        boolean boolean68 = tokenQueue33.matchesAny(strArray65);
        boolean boolean69 = tokenQueue26.matchesAny(strArray65);
        boolean boolean70 = tokenQueue1.matchesAny(strArray65);
        boolean boolean72 = tokenQueue1.matchesCS(" !");
        boolean boolean74 = tokenQueue1.matchChomp("hi");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertArrayEquals(charArray58, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        boolean boolean4 = tokenQueue1.matchesStartTag();
        boolean boolean6 = tokenQueue1.matches("");
        boolean boolean8 = tokenQueue1.matchChomp("");
        java.lang.String str9 = tokenQueue1.consumeElementSelector();
        java.lang.String str10 = tokenQueue1.consumeTagName();
        java.lang.String str13 = tokenQueue1.chompBalanced(' ', '\000');
        boolean boolean15 = tokenQueue1.matchChomp("4");
        java.lang.String str17 = tokenQueue1.chompToIgnoreCase("\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str10 = tokenQueue1.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        boolean boolean16 = tokenQueue12.matchesAny(strArray15);
        boolean boolean17 = tokenQueue1.matchesAny(strArray15);
        boolean boolean18 = tokenQueue1.matchesWhitespace();
        java.lang.String str20 = tokenQueue1.consumeTo("");
        org.jsoup.parser.TokenQueue tokenQueue22 = new org.jsoup.parser.TokenQueue("");
        boolean boolean23 = tokenQueue22.matchesWord();
        tokenQueue22.consume("");
        java.lang.String str26 = tokenQueue22.consumeAttributeKey();
        org.jsoup.parser.TokenQueue tokenQueue28 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str30 = tokenQueue28.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue32 = new org.jsoup.parser.TokenQueue("");
        char[] charArray39 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean40 = tokenQueue32.matchesAny(charArray39);
        boolean boolean41 = tokenQueue28.matchesAny(charArray39);
        org.jsoup.parser.TokenQueue tokenQueue43 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray46 = new java.lang.String[] { "", "" };
        boolean boolean47 = tokenQueue43.matchesAny(strArray46);
        boolean boolean48 = tokenQueue28.matchesAny(strArray46);
        java.lang.String str49 = tokenQueue22.consumeToAny(strArray46);
        java.lang.String str50 = tokenQueue1.consumeToAny(strArray46);
        boolean boolean51 = tokenQueue1.consumeWhitespace();
        boolean boolean53 = tokenQueue1.matchChomp("#\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompToIgnoreCase("hi!");
        boolean boolean4 = tokenQueue1.isEmpty();
        boolean boolean6 = tokenQueue1.matchesCS("hi!");
        org.jsoup.parser.TokenQueue tokenQueue8 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str10 = tokenQueue8.chompTo("");
        boolean boolean11 = tokenQueue8.matchesStartTag();
        tokenQueue8.addFirst("");
        org.jsoup.parser.TokenQueue tokenQueue15 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str17 = tokenQueue15.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue19 = new org.jsoup.parser.TokenQueue("");
        char[] charArray26 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean27 = tokenQueue19.matchesAny(charArray26);
        boolean boolean28 = tokenQueue15.matchesAny(charArray26);
        org.jsoup.parser.TokenQueue tokenQueue30 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray33 = new java.lang.String[] { "", "" };
        boolean boolean34 = tokenQueue30.matchesAny(strArray33);
        boolean boolean35 = tokenQueue15.matchesAny(strArray33);
        boolean boolean36 = tokenQueue8.matchesAny(strArray33);
        java.lang.String str37 = tokenQueue1.consumeToAny(strArray33);
        boolean boolean39 = tokenQueue1.matchChomp("hi!");
        org.jsoup.parser.TokenQueue tokenQueue41 = new org.jsoup.parser.TokenQueue("");
        org.jsoup.parser.TokenQueue tokenQueue43 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str45 = tokenQueue43.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue47 = new org.jsoup.parser.TokenQueue("");
        char[] charArray54 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean55 = tokenQueue47.matchesAny(charArray54);
        boolean boolean56 = tokenQueue43.matchesAny(charArray54);
        boolean boolean57 = tokenQueue41.matchesAny(charArray54);
        boolean boolean58 = tokenQueue1.matchesAny(charArray54);
        java.lang.String str59 = tokenQueue1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str10 = tokenQueue1.consumeElementSelector();
        tokenQueue1.advance();
        java.lang.String str13 = tokenQueue1.consumeTo("");
        org.jsoup.parser.TokenQueue tokenQueue15 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str17 = tokenQueue15.chompTo("");
        java.lang.String str18 = tokenQueue15.consumeElementSelector();
        java.lang.String str21 = tokenQueue15.chompBalanced('a', '4');
        boolean boolean23 = tokenQueue15.matchesCS("");
        java.lang.String str25 = tokenQueue15.chompTo("");
        java.lang.String str26 = tokenQueue15.consumeTagName();
        java.lang.String str28 = tokenQueue15.chompTo("");
        boolean boolean29 = tokenQueue15.matchesWhitespace();
        java.lang.String str31 = tokenQueue15.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue33 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str35 = tokenQueue33.chompTo("");
        boolean boolean36 = tokenQueue33.matchesStartTag();
        boolean boolean38 = tokenQueue33.matches("");
        java.lang.String str39 = tokenQueue33.consumeElementSelector();
        java.lang.String str40 = tokenQueue33.toString();
        org.jsoup.parser.TokenQueue tokenQueue42 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str44 = tokenQueue42.chompTo("");
        boolean boolean45 = tokenQueue42.matchesStartTag();
        tokenQueue42.addFirst("");
        org.jsoup.parser.TokenQueue tokenQueue49 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str51 = tokenQueue49.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue53 = new org.jsoup.parser.TokenQueue("");
        char[] charArray60 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean61 = tokenQueue53.matchesAny(charArray60);
        boolean boolean62 = tokenQueue49.matchesAny(charArray60);
        org.jsoup.parser.TokenQueue tokenQueue64 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray67 = new java.lang.String[] { "", "" };
        boolean boolean68 = tokenQueue64.matchesAny(strArray67);
        boolean boolean69 = tokenQueue49.matchesAny(strArray67);
        boolean boolean70 = tokenQueue42.matchesAny(strArray67);
        org.jsoup.parser.TokenQueue tokenQueue72 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str74 = tokenQueue72.chompTo("");
        java.lang.String str75 = tokenQueue72.consumeElementSelector();
        java.lang.String str78 = tokenQueue72.chompBalanced('a', '4');
        boolean boolean79 = tokenQueue72.matchesWhitespace();
        java.lang.String[] strArray86 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        java.lang.String str87 = tokenQueue72.consumeToAny(strArray86);
        java.lang.String str88 = tokenQueue42.consumeToAny(strArray86);
        java.lang.String str89 = tokenQueue33.consumeToAny(strArray86);
        boolean boolean90 = tokenQueue15.matchesAny(strArray86);
        boolean boolean91 = tokenQueue1.matchesAny(strArray86);
        boolean boolean92 = tokenQueue1.matchesWhitespace();
        tokenQueue1.addFirst("a\000");
        java.lang.String str95 = tokenQueue1.remainder();
        tokenQueue1.addFirst(" !");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertArrayEquals(charArray60, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "hi!", "", "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "a\000" + "'", str95, "a\000");
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str10 = tokenQueue1.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        boolean boolean16 = tokenQueue12.matchesAny(strArray15);
        boolean boolean17 = tokenQueue1.matchesAny(strArray15);
        boolean boolean18 = tokenQueue1.matchesWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue20 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str22 = tokenQueue20.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue24 = new org.jsoup.parser.TokenQueue("");
        char[] charArray31 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean32 = tokenQueue24.matchesAny(charArray31);
        boolean boolean33 = tokenQueue20.matchesAny(charArray31);
        boolean boolean34 = tokenQueue1.matchesAny(charArray31);
        boolean boolean35 = tokenQueue1.matchesWord();
        java.lang.String str36 = tokenQueue1.consumeWord();
        tokenQueue1.addFirst((java.lang.Character) '4');
        tokenQueue1.addFirst(" !");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        boolean boolean2 = tokenQueue1.matchesWord();
        char[] charArray4 = new char[] { ' ' };
        boolean boolean5 = tokenQueue1.matchesAny(charArray4);
        java.lang.String str6 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.consumeAttributeKey();
        boolean boolean8 = tokenQueue1.consumeWhitespace();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        char[] charArray8 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean9 = tokenQueue1.matchesAny(charArray8);
        boolean boolean10 = tokenQueue1.matchesWord();
        java.lang.String str11 = tokenQueue1.consumeElementSelector();
        tokenQueue1.advance();
        org.jsoup.parser.TokenQueue tokenQueue14 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str16 = tokenQueue14.chompTo("");
        java.lang.String str18 = tokenQueue14.consumeToIgnoreCase("hi");
        java.lang.String str20 = tokenQueue14.chompTo("a");
        org.jsoup.parser.TokenQueue tokenQueue22 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str24 = tokenQueue22.chompTo("");
        java.lang.String str25 = tokenQueue22.consumeElementSelector();
        java.lang.String str28 = tokenQueue22.chompBalanced('a', '4');
        boolean boolean30 = tokenQueue22.matchesCS("");
        java.lang.String str31 = tokenQueue22.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue33 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray36 = new java.lang.String[] { "", "" };
        boolean boolean37 = tokenQueue33.matchesAny(strArray36);
        boolean boolean38 = tokenQueue22.matchesAny(strArray36);
        boolean boolean39 = tokenQueue22.matchesWhitespace();
        java.lang.String str40 = tokenQueue22.consumeElementSelector();
        boolean boolean42 = tokenQueue22.matchChomp("hi!");
        org.jsoup.parser.TokenQueue tokenQueue44 = new org.jsoup.parser.TokenQueue("");
        boolean boolean45 = tokenQueue44.matchesWord();
        char[] charArray47 = new char[] { ' ' };
        boolean boolean48 = tokenQueue44.matchesAny(charArray47);
        java.lang.String str49 = tokenQueue44.consumeElementSelector();
        java.lang.String str52 = tokenQueue44.chompBalanced(' ', '#');
        tokenQueue44.consume("");
        org.jsoup.parser.TokenQueue tokenQueue56 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray59 = new java.lang.String[] { "", "" };
        boolean boolean60 = tokenQueue56.matchesAny(strArray59);
        java.lang.String str61 = tokenQueue56.consumeTagName();
        org.jsoup.parser.TokenQueue tokenQueue63 = new org.jsoup.parser.TokenQueue("");
        char[] charArray70 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean71 = tokenQueue63.matchesAny(charArray70);
        boolean boolean72 = tokenQueue56.matchesAny(charArray70);
        boolean boolean73 = tokenQueue44.matchesAny(charArray70);
        boolean boolean74 = tokenQueue22.matchesAny(charArray70);
        boolean boolean75 = tokenQueue14.matchesAny(charArray70);
        boolean boolean76 = tokenQueue1.matchesAny(charArray70);
        boolean boolean77 = tokenQueue1.matchesWhitespace();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertArrayEquals(charArray70, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompToIgnoreCase("hi!");
        boolean boolean4 = tokenQueue1.isEmpty();
        boolean boolean5 = tokenQueue1.matchesWhitespace();
        boolean boolean6 = tokenQueue1.matchesWhitespace();
        boolean boolean7 = tokenQueue1.matchesStartTag();
        boolean boolean8 = tokenQueue1.matchesStartTag();
        java.lang.String str10 = tokenQueue1.chompToIgnoreCase("hi");
        tokenQueue1.addFirst("!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        char[] charArray8 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean9 = tokenQueue1.matchesAny(charArray8);
        java.lang.String str10 = tokenQueue1.consumeCssIdentifier();
        java.lang.String str11 = tokenQueue1.consumeAttributeKey();
        java.lang.String str12 = tokenQueue1.consumeCssIdentifier();
        boolean boolean14 = tokenQueue1.matches("4");
        java.lang.String str15 = tokenQueue1.toString();
        tokenQueue1.advance();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.consumeTo("hi!");
        boolean boolean5 = tokenQueue1.matchesCS("");
        java.lang.String str6 = tokenQueue1.remainder();
        char char7 = tokenQueue1.peek();
        java.lang.String str8 = tokenQueue1.consumeCssIdentifier();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue5 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str7 = tokenQueue5.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue9 = new org.jsoup.parser.TokenQueue("");
        char[] charArray16 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean17 = tokenQueue9.matchesAny(charArray16);
        boolean boolean18 = tokenQueue5.matchesAny(charArray16);
        org.jsoup.parser.TokenQueue tokenQueue20 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray23 = new java.lang.String[] { "", "" };
        boolean boolean24 = tokenQueue20.matchesAny(strArray23);
        boolean boolean25 = tokenQueue5.matchesAny(strArray23);
        java.lang.String str26 = tokenQueue1.consumeToAny(strArray23);
        java.lang.String str29 = tokenQueue1.chompBalanced('a', '4');
        org.jsoup.parser.TokenQueue tokenQueue31 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str33 = tokenQueue31.chompTo("");
        java.lang.String str34 = tokenQueue31.consumeElementSelector();
        java.lang.String str37 = tokenQueue31.chompBalanced('a', '4');
        boolean boolean39 = tokenQueue31.matchesCS("");
        java.lang.String str40 = tokenQueue31.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue42 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray45 = new java.lang.String[] { "", "" };
        boolean boolean46 = tokenQueue42.matchesAny(strArray45);
        boolean boolean47 = tokenQueue31.matchesAny(strArray45);
        boolean boolean48 = tokenQueue31.matchesWhitespace();
        java.lang.String str50 = tokenQueue31.consumeTo("");
        org.jsoup.parser.TokenQueue tokenQueue52 = new org.jsoup.parser.TokenQueue("");
        boolean boolean53 = tokenQueue52.matchesWord();
        tokenQueue52.consume("");
        java.lang.String str56 = tokenQueue52.consumeAttributeKey();
        org.jsoup.parser.TokenQueue tokenQueue58 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str60 = tokenQueue58.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue62 = new org.jsoup.parser.TokenQueue("");
        char[] charArray69 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean70 = tokenQueue62.matchesAny(charArray69);
        boolean boolean71 = tokenQueue58.matchesAny(charArray69);
        org.jsoup.parser.TokenQueue tokenQueue73 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray76 = new java.lang.String[] { "", "" };
        boolean boolean77 = tokenQueue73.matchesAny(strArray76);
        boolean boolean78 = tokenQueue58.matchesAny(strArray76);
        java.lang.String str79 = tokenQueue52.consumeToAny(strArray76);
        java.lang.String str80 = tokenQueue31.consumeToAny(strArray76);
        boolean boolean81 = tokenQueue1.matchesAny(strArray76);
        java.lang.String str82 = tokenQueue1.consumeAttributeKey();
        boolean boolean83 = tokenQueue1.consumeWhitespace();
        boolean boolean84 = tokenQueue1.consumeWhitespace();
        java.lang.String str85 = tokenQueue1.consumeWord();
        java.lang.String str86 = tokenQueue1.consumeAttributeKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertArrayEquals(charArray69, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue5 = new org.jsoup.parser.TokenQueue("");
        char[] charArray12 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean13 = tokenQueue5.matchesAny(charArray12);
        boolean boolean14 = tokenQueue1.matchesAny(charArray12);
        boolean boolean15 = tokenQueue1.matchesWord();
        org.jsoup.parser.TokenQueue tokenQueue17 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str19 = tokenQueue17.chompToIgnoreCase("hi!");
        boolean boolean20 = tokenQueue17.isEmpty();
        boolean boolean22 = tokenQueue17.matchesCS("hi!");
        org.jsoup.parser.TokenQueue tokenQueue24 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str26 = tokenQueue24.chompTo("");
        boolean boolean27 = tokenQueue24.matchesStartTag();
        tokenQueue24.addFirst("");
        org.jsoup.parser.TokenQueue tokenQueue31 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str33 = tokenQueue31.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue35 = new org.jsoup.parser.TokenQueue("");
        char[] charArray42 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean43 = tokenQueue35.matchesAny(charArray42);
        boolean boolean44 = tokenQueue31.matchesAny(charArray42);
        org.jsoup.parser.TokenQueue tokenQueue46 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray49 = new java.lang.String[] { "", "" };
        boolean boolean50 = tokenQueue46.matchesAny(strArray49);
        boolean boolean51 = tokenQueue31.matchesAny(strArray49);
        boolean boolean52 = tokenQueue24.matchesAny(strArray49);
        java.lang.String str53 = tokenQueue17.consumeToAny(strArray49);
        boolean boolean54 = tokenQueue1.matchesAny(strArray49);
        boolean boolean56 = tokenQueue1.matches("hi!");
        boolean boolean58 = tokenQueue1.matchesCS("4");
        java.lang.String str59 = tokenQueue1.consumeTagName();
        boolean boolean61 = tokenQueue1.matchesCS("i");
        boolean boolean62 = tokenQueue1.matchesWhitespace();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str4 = tokenQueue1.chompBalanced(' ', 'a');
        java.lang.String str5 = tokenQueue1.remainder();
        java.lang.String str6 = tokenQueue1.remainder();
        java.lang.String str8 = tokenQueue1.consumeTo("hi!");
        java.lang.String str9 = tokenQueue1.consumeCssIdentifier();
        org.jsoup.parser.TokenQueue tokenQueue11 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str13 = tokenQueue11.chompTo("");
        java.lang.String str14 = tokenQueue11.consumeElementSelector();
        java.lang.String str17 = tokenQueue11.chompBalanced('a', '4');
        boolean boolean19 = tokenQueue11.matchesCS("");
        java.lang.String str20 = tokenQueue11.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue22 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        boolean boolean26 = tokenQueue22.matchesAny(strArray25);
        boolean boolean27 = tokenQueue11.matchesAny(strArray25);
        boolean boolean28 = tokenQueue11.matchesWhitespace();
        java.lang.String str30 = tokenQueue11.consumeTo("");
        java.lang.String str31 = tokenQueue11.consumeTagName();
        org.jsoup.parser.TokenQueue tokenQueue33 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str35 = tokenQueue33.chompTo("");
        boolean boolean36 = tokenQueue33.matchesStartTag();
        boolean boolean38 = tokenQueue33.matchChomp("hi!");
        char char39 = tokenQueue33.peek();
        boolean boolean40 = tokenQueue33.matchesWhitespace();
        boolean boolean41 = tokenQueue33.matchesWord();
        org.jsoup.parser.TokenQueue tokenQueue43 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray46 = new java.lang.String[] { "", "" };
        boolean boolean47 = tokenQueue43.matchesAny(strArray46);
        java.lang.String str48 = tokenQueue33.consumeToAny(strArray46);
        boolean boolean49 = tokenQueue11.matchesAny(strArray46);
        boolean boolean50 = tokenQueue1.matchesAny(strArray46);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + char39 + "' != '" + '\000' + "'", char39 == '\000');
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        boolean boolean4 = tokenQueue1.matchesStartTag();
        boolean boolean6 = tokenQueue1.matches("");
        java.lang.String str7 = tokenQueue1.consumeElementSelector();
        java.lang.String str8 = tokenQueue1.toString();
        char char9 = tokenQueue1.peek();
        java.lang.String str10 = tokenQueue1.consumeCssIdentifier();
        boolean boolean12 = tokenQueue1.matches("hi!");
        boolean boolean13 = tokenQueue1.consumeWhitespace();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        char[] charArray8 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean9 = tokenQueue1.matchesAny(charArray8);
        org.jsoup.parser.TokenQueue tokenQueue11 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str13 = tokenQueue11.chompTo("");
        boolean boolean14 = tokenQueue11.matchesStartTag();
        boolean boolean16 = tokenQueue11.matches("hi!");
        tokenQueue11.consume("");
        org.jsoup.parser.TokenQueue tokenQueue20 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str22 = tokenQueue20.chompTo("");
        tokenQueue20.advance();
        boolean boolean24 = tokenQueue20.matchesWhitespace();
        boolean boolean26 = tokenQueue20.matchChomp("hi!");
        org.jsoup.parser.TokenQueue tokenQueue28 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray31 = new java.lang.String[] { "", "" };
        boolean boolean32 = tokenQueue28.matchesAny(strArray31);
        java.lang.String str33 = tokenQueue28.remainder();
        org.jsoup.parser.TokenQueue tokenQueue35 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str37 = tokenQueue35.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue39 = new org.jsoup.parser.TokenQueue("");
        char[] charArray46 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean47 = tokenQueue39.matchesAny(charArray46);
        boolean boolean48 = tokenQueue35.matchesAny(charArray46);
        boolean boolean49 = tokenQueue28.matchesAny(charArray46);
        boolean boolean50 = tokenQueue20.matchesAny(charArray46);
        boolean boolean51 = tokenQueue11.matchesAny(charArray46);
        boolean boolean52 = tokenQueue1.matchesAny(charArray46);
        boolean boolean54 = tokenQueue1.matches("i!");
        java.lang.String str56 = tokenQueue1.chompTo("a");
        java.lang.String str57 = tokenQueue1.toString();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str10 = tokenQueue1.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        boolean boolean16 = tokenQueue12.matchesAny(strArray15);
        boolean boolean17 = tokenQueue1.matchesAny(strArray15);
        boolean boolean18 = tokenQueue1.matchesWhitespace();
        java.lang.String str20 = tokenQueue1.consumeTo("");
        java.lang.String str22 = tokenQueue1.chompToIgnoreCase("\000");
        java.lang.String str23 = tokenQueue1.remainder();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        java.lang.String str6 = tokenQueue1.remainder();
        boolean boolean7 = tokenQueue1.consumeWhitespace();
        boolean boolean8 = tokenQueue1.matchesWhitespace();
        boolean boolean9 = tokenQueue1.isEmpty();
        tokenQueue1.addFirst((java.lang.Character) '4');
        java.lang.String str12 = tokenQueue1.consumeCssIdentifier();
        boolean boolean14 = tokenQueue1.matchChomp("");
        org.jsoup.parser.TokenQueue tokenQueue16 = new org.jsoup.parser.TokenQueue("");
        boolean boolean17 = tokenQueue16.matchesWord();
        char char18 = tokenQueue16.peek();
        java.lang.String str19 = tokenQueue16.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue21 = new org.jsoup.parser.TokenQueue("");
        boolean boolean22 = tokenQueue21.matchesWord();
        tokenQueue21.consume("");
        java.lang.String str25 = tokenQueue21.consumeAttributeKey();
        org.jsoup.parser.TokenQueue tokenQueue27 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str29 = tokenQueue27.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue31 = new org.jsoup.parser.TokenQueue("");
        char[] charArray38 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean39 = tokenQueue31.matchesAny(charArray38);
        boolean boolean40 = tokenQueue27.matchesAny(charArray38);
        org.jsoup.parser.TokenQueue tokenQueue42 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray45 = new java.lang.String[] { "", "" };
        boolean boolean46 = tokenQueue42.matchesAny(strArray45);
        boolean boolean47 = tokenQueue27.matchesAny(strArray45);
        java.lang.String str48 = tokenQueue21.consumeToAny(strArray45);
        java.lang.String str49 = tokenQueue16.consumeToAny(strArray45);
        boolean boolean50 = tokenQueue1.matchesAny(strArray45);
        boolean boolean52 = tokenQueue1.matchChomp("a");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4" + "'", str12, "4");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str11 = tokenQueue1.chompTo("");
        java.lang.String str12 = tokenQueue1.consumeTagName();
        boolean boolean14 = tokenQueue1.matchesCS("");
        tokenQueue1.addFirst((java.lang.Character) '\000');
        boolean boolean17 = tokenQueue1.isEmpty();
        tokenQueue1.consume("");
        java.lang.String str20 = tokenQueue1.consumeCssIdentifier();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str10 = tokenQueue1.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        boolean boolean16 = tokenQueue12.matchesAny(strArray15);
        boolean boolean17 = tokenQueue1.matchesAny(strArray15);
        boolean boolean18 = tokenQueue1.matchesWhitespace();
        java.lang.String str20 = tokenQueue1.consumeTo("");
        org.jsoup.parser.TokenQueue tokenQueue22 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str24 = tokenQueue22.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue26 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str28 = tokenQueue26.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue30 = new org.jsoup.parser.TokenQueue("");
        char[] charArray37 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean38 = tokenQueue30.matchesAny(charArray37);
        boolean boolean39 = tokenQueue26.matchesAny(charArray37);
        org.jsoup.parser.TokenQueue tokenQueue41 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray44 = new java.lang.String[] { "", "" };
        boolean boolean45 = tokenQueue41.matchesAny(strArray44);
        boolean boolean46 = tokenQueue26.matchesAny(strArray44);
        java.lang.String str47 = tokenQueue22.consumeToAny(strArray44);
        boolean boolean48 = tokenQueue1.matchesAny(strArray44);
        java.lang.String str49 = tokenQueue1.consumeCssIdentifier();
        boolean boolean51 = tokenQueue1.matchChomp("a\000");
        boolean boolean52 = tokenQueue1.matchesStartTag();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        boolean boolean4 = tokenQueue1.matchesStartTag();
        boolean boolean6 = tokenQueue1.matches("");
        boolean boolean8 = tokenQueue1.matchChomp("");
        java.lang.String str9 = tokenQueue1.consumeElementSelector();
        java.lang.String str10 = tokenQueue1.consumeTagName();
        java.lang.String str13 = tokenQueue1.chompBalanced(' ', '\000');
        boolean boolean15 = tokenQueue1.matchChomp("4");
        boolean boolean16 = tokenQueue1.matchesWhitespace();
        java.lang.String str17 = tokenQueue1.consumeTagName();
        org.jsoup.parser.TokenQueue tokenQueue19 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str21 = tokenQueue19.chompTo("");
        java.lang.String str22 = tokenQueue19.consumeElementSelector();
        java.lang.String str25 = tokenQueue19.chompBalanced('a', '4');
        boolean boolean26 = tokenQueue19.matchesWhitespace();
        tokenQueue19.advance();
        org.jsoup.parser.TokenQueue tokenQueue29 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str31 = tokenQueue29.chompTo("");
        java.lang.String str32 = tokenQueue29.consumeElementSelector();
        java.lang.String str35 = tokenQueue29.chompBalanced('a', '4');
        boolean boolean36 = tokenQueue29.matchesWhitespace();
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        java.lang.String str44 = tokenQueue29.consumeToAny(strArray43);
        boolean boolean45 = tokenQueue19.matchesAny(strArray43);
        boolean boolean46 = tokenQueue1.matchesAny(strArray43);
        java.lang.String str48 = tokenQueue1.consumeToIgnoreCase("i!");
        boolean boolean50 = tokenQueue1.matchChomp("#\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "hi!", "", "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        boolean boolean2 = tokenQueue1.matchesWord();
        tokenQueue1.consume("");
        java.lang.String str5 = tokenQueue1.consumeAttributeKey();
        org.jsoup.parser.TokenQueue tokenQueue7 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str9 = tokenQueue7.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue11 = new org.jsoup.parser.TokenQueue("");
        char[] charArray18 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean19 = tokenQueue11.matchesAny(charArray18);
        boolean boolean20 = tokenQueue7.matchesAny(charArray18);
        org.jsoup.parser.TokenQueue tokenQueue22 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        boolean boolean26 = tokenQueue22.matchesAny(strArray25);
        boolean boolean27 = tokenQueue7.matchesAny(strArray25);
        java.lang.String str28 = tokenQueue1.consumeToAny(strArray25);
        java.lang.String str29 = tokenQueue1.consumeTagName();
        boolean boolean31 = tokenQueue1.matchesCS("");
        boolean boolean32 = tokenQueue1.matchesWord();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        java.lang.String str6 = tokenQueue1.consumeTagName();
        org.jsoup.parser.TokenQueue tokenQueue8 = new org.jsoup.parser.TokenQueue("");
        char[] charArray15 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean16 = tokenQueue8.matchesAny(charArray15);
        boolean boolean17 = tokenQueue1.matchesAny(charArray15);
        java.lang.String str18 = tokenQueue1.consumeCssIdentifier();
        tokenQueue1.addFirst((java.lang.Character) 'a');
        boolean boolean22 = tokenQueue1.matches("");
        java.lang.String str24 = tokenQueue1.chompToIgnoreCase("4");
        boolean boolean26 = tokenQueue1.matches("!");
        java.lang.String str27 = tokenQueue1.toString();
        java.lang.String str28 = tokenQueue1.consumeElementSelector();
        boolean boolean29 = tokenQueue1.consumeWhitespace();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "a" + "'", str24, "a");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.consumeTo("hi!");
        java.lang.String str4 = tokenQueue1.consumeWord();
        boolean boolean5 = tokenQueue1.isEmpty();
        boolean boolean6 = tokenQueue1.isEmpty();
        tokenQueue1.advance();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        char[] charArray8 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean9 = tokenQueue1.matchesAny(charArray8);
        boolean boolean10 = tokenQueue1.matchesWord();
        java.lang.String str12 = tokenQueue1.consumeToIgnoreCase("hi!");
        tokenQueue1.addFirst("");
        boolean boolean15 = tokenQueue1.matchesStartTag();
        char char16 = tokenQueue1.peek();
        java.lang.String str17 = tokenQueue1.consumeWord();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str10 = tokenQueue1.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        boolean boolean16 = tokenQueue12.matchesAny(strArray15);
        boolean boolean17 = tokenQueue1.matchesAny(strArray15);
        boolean boolean18 = tokenQueue1.matchesWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue20 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str22 = tokenQueue20.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue24 = new org.jsoup.parser.TokenQueue("");
        char[] charArray31 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean32 = tokenQueue24.matchesAny(charArray31);
        boolean boolean33 = tokenQueue20.matchesAny(charArray31);
        boolean boolean34 = tokenQueue1.matchesAny(charArray31);
        tokenQueue1.addFirst("hi!");
        boolean boolean37 = tokenQueue1.matchesWhitespace();
        java.lang.String str38 = tokenQueue1.consumeAttributeKey();
        boolean boolean39 = tokenQueue1.matchesWord();
        java.lang.String str40 = tokenQueue1.remainder();
        java.lang.String str41 = tokenQueue1.toString();
        tokenQueue1.addFirst((java.lang.Character) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi" + "'", str38, "hi");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "!" + "'", str40, "!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        boolean boolean4 = tokenQueue1.matchesStartTag();
        boolean boolean6 = tokenQueue1.matches("");
        java.lang.String str7 = tokenQueue1.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue9 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str11 = tokenQueue9.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        char[] charArray20 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean21 = tokenQueue13.matchesAny(charArray20);
        boolean boolean22 = tokenQueue9.matchesAny(charArray20);
        org.jsoup.parser.TokenQueue tokenQueue24 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        boolean boolean28 = tokenQueue24.matchesAny(strArray27);
        boolean boolean29 = tokenQueue9.matchesAny(strArray27);
        boolean boolean30 = tokenQueue1.matchesAny(strArray27);
        boolean boolean31 = tokenQueue1.isEmpty();
        java.lang.String str32 = tokenQueue1.remainder();
        char char33 = tokenQueue1.peek();
        org.jsoup.parser.TokenQueue tokenQueue35 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray38 = new java.lang.String[] { "", "" };
        boolean boolean39 = tokenQueue35.matchesAny(strArray38);
        java.lang.String str40 = tokenQueue35.remainder();
        boolean boolean41 = tokenQueue35.consumeWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue43 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray46 = new java.lang.String[] { "", "" };
        boolean boolean47 = tokenQueue43.matchesAny(strArray46);
        java.lang.String str48 = tokenQueue43.consumeTagName();
        org.jsoup.parser.TokenQueue tokenQueue50 = new org.jsoup.parser.TokenQueue("");
        char[] charArray57 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean58 = tokenQueue50.matchesAny(charArray57);
        boolean boolean59 = tokenQueue43.matchesAny(charArray57);
        boolean boolean60 = tokenQueue35.matchesAny(charArray57);
        boolean boolean61 = tokenQueue1.matchesAny(charArray57);
        java.lang.String str63 = tokenQueue1.chompTo("hi!");
        boolean boolean64 = tokenQueue1.consumeWhitespace();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '\000' + "'", char33 == '\000');
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertArrayEquals(charArray57, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        char[] charArray8 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean9 = tokenQueue1.matchesAny(charArray8);
        java.lang.String str11 = tokenQueue1.chompToIgnoreCase("hi!");
        java.lang.String str12 = tokenQueue1.consumeWord();
        java.lang.String str13 = tokenQueue1.consumeAttributeKey();
        java.lang.String str14 = tokenQueue1.consumeElementSelector();
        java.lang.String str16 = tokenQueue1.consumeToIgnoreCase("a\000");
        java.lang.String str17 = tokenQueue1.consumeElementSelector();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        char[] charArray8 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean9 = tokenQueue1.matchesAny(charArray8);
        java.lang.String str10 = tokenQueue1.remainder();
        java.lang.String str11 = tokenQueue1.toString();
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str15 = tokenQueue13.chompTo("");
        boolean boolean16 = tokenQueue13.matchesStartTag();
        boolean boolean18 = tokenQueue13.matches("");
        java.lang.String str19 = tokenQueue13.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue21 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str23 = tokenQueue21.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue25 = new org.jsoup.parser.TokenQueue("");
        char[] charArray32 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean33 = tokenQueue25.matchesAny(charArray32);
        boolean boolean34 = tokenQueue21.matchesAny(charArray32);
        org.jsoup.parser.TokenQueue tokenQueue36 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray39 = new java.lang.String[] { "", "" };
        boolean boolean40 = tokenQueue36.matchesAny(strArray39);
        boolean boolean41 = tokenQueue21.matchesAny(strArray39);
        boolean boolean42 = tokenQueue13.matchesAny(strArray39);
        boolean boolean43 = tokenQueue1.matchesAny(strArray39);
        boolean boolean44 = tokenQueue1.matchesWhitespace();
        java.lang.String str46 = tokenQueue1.chompTo("44!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        boolean boolean4 = tokenQueue1.matchesStartTag();
        boolean boolean6 = tokenQueue1.matches("");
        char char7 = tokenQueue1.peek();
        java.lang.String str8 = tokenQueue1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        char[] charArray8 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean9 = tokenQueue1.matchesAny(charArray8);
        java.lang.String str10 = tokenQueue1.consumeCssIdentifier();
        java.lang.String str11 = tokenQueue1.remainder();
        java.lang.String str13 = tokenQueue1.consumeToIgnoreCase("4");
        tokenQueue1.addFirst((java.lang.Character) ' ');
        java.lang.Class<?> wildcardClass16 = tokenQueue1.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean8 = tokenQueue1.matchesWhitespace();
        java.lang.String str11 = tokenQueue1.chompBalanced('a', ' ');
        boolean boolean12 = tokenQueue1.matchesWord();
        boolean boolean14 = tokenQueue1.matchesCS("");
        java.lang.String str15 = tokenQueue1.remainder();
        tokenQueue1.advance();
        java.lang.String str17 = tokenQueue1.consumeAttributeKey();
        boolean boolean18 = tokenQueue1.matchesWhitespace();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompToIgnoreCase("hi!");
        boolean boolean4 = tokenQueue1.isEmpty();
        boolean boolean6 = tokenQueue1.matchesCS("hi!");
        org.jsoup.parser.TokenQueue tokenQueue8 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str10 = tokenQueue8.chompTo("");
        boolean boolean11 = tokenQueue8.matchesStartTag();
        tokenQueue8.addFirst("");
        org.jsoup.parser.TokenQueue tokenQueue15 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str17 = tokenQueue15.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue19 = new org.jsoup.parser.TokenQueue("");
        char[] charArray26 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean27 = tokenQueue19.matchesAny(charArray26);
        boolean boolean28 = tokenQueue15.matchesAny(charArray26);
        org.jsoup.parser.TokenQueue tokenQueue30 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray33 = new java.lang.String[] { "", "" };
        boolean boolean34 = tokenQueue30.matchesAny(strArray33);
        boolean boolean35 = tokenQueue15.matchesAny(strArray33);
        boolean boolean36 = tokenQueue8.matchesAny(strArray33);
        java.lang.String str37 = tokenQueue1.consumeToAny(strArray33);
        tokenQueue1.advance();
        char char39 = tokenQueue1.peek();
        java.lang.String[] strArray40 = null;
        java.lang.String str41 = tokenQueue1.consumeToAny(strArray40);
        java.lang.String str42 = tokenQueue1.toString();
        // The following exception was thrown during execution in test generation
        try {
            char char43 = tokenQueue1.consume();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + char39 + "' != '" + '\000' + "'", char39 == '\000');
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        boolean boolean4 = tokenQueue1.matchesStartTag();
        boolean boolean6 = tokenQueue1.matches("");
        java.lang.String str7 = tokenQueue1.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue9 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str11 = tokenQueue9.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        char[] charArray20 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean21 = tokenQueue13.matchesAny(charArray20);
        boolean boolean22 = tokenQueue9.matchesAny(charArray20);
        org.jsoup.parser.TokenQueue tokenQueue24 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        boolean boolean28 = tokenQueue24.matchesAny(strArray27);
        boolean boolean29 = tokenQueue9.matchesAny(strArray27);
        boolean boolean30 = tokenQueue1.matchesAny(strArray27);
        boolean boolean31 = tokenQueue1.consumeWhitespace();
        boolean boolean33 = tokenQueue1.matches("");
        tokenQueue1.addFirst((java.lang.Character) 'a');
        java.lang.String str36 = tokenQueue1.toString();
        tokenQueue1.addFirst("4");
        java.lang.String str40 = tokenQueue1.consumeToIgnoreCase("44");
        boolean boolean42 = tokenQueue1.matches(" ");
        boolean boolean43 = tokenQueue1.matchesWord();
        java.lang.String str44 = tokenQueue1.consumeCssIdentifier();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "a" + "'", str36, "a");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "4a" + "'", str40, "4a");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        org.jsoup.parser.TokenQueue tokenQueue9 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str11 = tokenQueue9.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        char[] charArray20 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean21 = tokenQueue13.matchesAny(charArray20);
        boolean boolean22 = tokenQueue9.matchesAny(charArray20);
        boolean boolean23 = tokenQueue1.matchesAny(charArray20);
        boolean boolean25 = tokenQueue1.matches("");
        java.lang.String str27 = tokenQueue1.consumeTo("");
        java.lang.String str28 = tokenQueue1.consumeCssIdentifier();
        java.lang.String str29 = tokenQueue1.consumeElementSelector();
        boolean boolean30 = tokenQueue1.consumeWhitespace();
        tokenQueue1.addFirst("4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        boolean boolean2 = tokenQueue1.consumeWhitespace();
        boolean boolean3 = tokenQueue1.consumeWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue5 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str7 = tokenQueue5.chompTo("");
        boolean boolean8 = tokenQueue5.matchesStartTag();
        boolean boolean10 = tokenQueue5.matches("");
        java.lang.String str11 = tokenQueue5.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str15 = tokenQueue13.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue17 = new org.jsoup.parser.TokenQueue("");
        char[] charArray24 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean25 = tokenQueue17.matchesAny(charArray24);
        boolean boolean26 = tokenQueue13.matchesAny(charArray24);
        org.jsoup.parser.TokenQueue tokenQueue28 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray31 = new java.lang.String[] { "", "" };
        boolean boolean32 = tokenQueue28.matchesAny(strArray31);
        boolean boolean33 = tokenQueue13.matchesAny(strArray31);
        boolean boolean34 = tokenQueue5.matchesAny(strArray31);
        boolean boolean35 = tokenQueue1.matchesAny(strArray31);
        org.jsoup.parser.TokenQueue tokenQueue37 = new org.jsoup.parser.TokenQueue("");
        char[] charArray44 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean45 = tokenQueue37.matchesAny(charArray44);
        java.lang.String str46 = tokenQueue37.remainder();
        tokenQueue37.addFirst("hi!");
        java.lang.String str51 = tokenQueue37.chompBalanced(' ', '#');
        boolean boolean52 = tokenQueue37.matchesWord();
        org.jsoup.parser.TokenQueue tokenQueue54 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str56 = tokenQueue54.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue58 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str60 = tokenQueue58.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue62 = new org.jsoup.parser.TokenQueue("");
        char[] charArray69 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean70 = tokenQueue62.matchesAny(charArray69);
        boolean boolean71 = tokenQueue58.matchesAny(charArray69);
        org.jsoup.parser.TokenQueue tokenQueue73 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray76 = new java.lang.String[] { "", "" };
        boolean boolean77 = tokenQueue73.matchesAny(strArray76);
        boolean boolean78 = tokenQueue58.matchesAny(strArray76);
        java.lang.String str79 = tokenQueue54.consumeToAny(strArray76);
        java.lang.String str80 = tokenQueue37.consumeToAny(strArray76);
        java.lang.String str81 = tokenQueue1.consumeToAny(strArray76);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertArrayEquals(charArray69, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        boolean boolean6 = tokenQueue1.consumeWhitespace();
        java.lang.String str8 = tokenQueue1.consumeTo("4");
        java.lang.String str9 = tokenQueue1.consumeElementSelector();
        java.lang.String str10 = tokenQueue1.remainder();
        tokenQueue1.advance();
        boolean boolean12 = tokenQueue1.consumeWhitespace();
        boolean boolean13 = tokenQueue1.isEmpty();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        char[] charArray8 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean9 = tokenQueue1.matchesAny(charArray8);
        java.lang.String str10 = tokenQueue1.remainder();
        java.lang.String str11 = tokenQueue1.toString();
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str15 = tokenQueue13.chompTo("");
        boolean boolean16 = tokenQueue13.matchesStartTag();
        boolean boolean18 = tokenQueue13.matches("");
        java.lang.String str19 = tokenQueue13.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue21 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str23 = tokenQueue21.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue25 = new org.jsoup.parser.TokenQueue("");
        char[] charArray32 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean33 = tokenQueue25.matchesAny(charArray32);
        boolean boolean34 = tokenQueue21.matchesAny(charArray32);
        org.jsoup.parser.TokenQueue tokenQueue36 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray39 = new java.lang.String[] { "", "" };
        boolean boolean40 = tokenQueue36.matchesAny(strArray39);
        boolean boolean41 = tokenQueue21.matchesAny(strArray39);
        boolean boolean42 = tokenQueue13.matchesAny(strArray39);
        boolean boolean43 = tokenQueue1.matchesAny(strArray39);
        java.lang.String str44 = tokenQueue1.consumeWord();
        java.lang.String str46 = tokenQueue1.consumeToIgnoreCase("i");
        boolean boolean48 = tokenQueue1.matchChomp("!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str10 = tokenQueue1.consumeElementSelector();
        tokenQueue1.advance();
        tokenQueue1.addFirst((java.lang.Character) '#');
        org.jsoup.parser.TokenQueue tokenQueue15 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str17 = tokenQueue15.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue19 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str21 = tokenQueue19.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue23 = new org.jsoup.parser.TokenQueue("");
        char[] charArray30 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean31 = tokenQueue23.matchesAny(charArray30);
        boolean boolean32 = tokenQueue19.matchesAny(charArray30);
        org.jsoup.parser.TokenQueue tokenQueue34 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray37 = new java.lang.String[] { "", "" };
        boolean boolean38 = tokenQueue34.matchesAny(strArray37);
        boolean boolean39 = tokenQueue19.matchesAny(strArray37);
        java.lang.String str40 = tokenQueue15.consumeToAny(strArray37);
        java.lang.String str41 = tokenQueue1.consumeToAny(strArray37);
        tokenQueue1.addFirst((java.lang.Character) 'h');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        org.jsoup.parser.TokenQueue tokenQueue9 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str11 = tokenQueue9.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        char[] charArray20 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean21 = tokenQueue13.matchesAny(charArray20);
        boolean boolean22 = tokenQueue9.matchesAny(charArray20);
        boolean boolean23 = tokenQueue1.matchesAny(charArray20);
        boolean boolean25 = tokenQueue1.matches("");
        boolean boolean27 = tokenQueue1.matchChomp("");
        java.lang.String str28 = tokenQueue1.remainder();
        boolean boolean29 = tokenQueue1.matchesWhitespace();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("a");
        java.lang.String str2 = tokenQueue1.consumeTagName();
        tokenQueue1.addFirst((java.lang.Character) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompToIgnoreCase("hi!");
        boolean boolean4 = tokenQueue1.isEmpty();
        boolean boolean6 = tokenQueue1.matchesCS("hi!");
        boolean boolean7 = tokenQueue1.consumeWhitespace();
        java.lang.String str9 = tokenQueue1.consumeToIgnoreCase("a\000");
        java.lang.String str10 = tokenQueue1.consumeAttributeKey();
        // The following exception was thrown during execution in test generation
        try {
            tokenQueue1.consume("a\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Queue did not match expected sequence");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("hi");
        java.lang.String str3 = tokenQueue1.chompTo("#");
        java.lang.String str4 = tokenQueue1.consumeWord();
        boolean boolean6 = tokenQueue1.matchesCS("\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str11 = tokenQueue1.chompTo("");
        java.lang.String str12 = tokenQueue1.consumeTagName();
        boolean boolean14 = tokenQueue1.matchesCS("");
        tokenQueue1.addFirst((java.lang.Character) '\000');
        org.jsoup.parser.TokenQueue tokenQueue18 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str20 = tokenQueue18.chompTo("");
        java.lang.String str21 = tokenQueue18.consumeElementSelector();
        java.lang.String str24 = tokenQueue18.chompBalanced('a', '4');
        boolean boolean25 = tokenQueue18.matchesWhitespace();
        tokenQueue18.advance();
        org.jsoup.parser.TokenQueue tokenQueue28 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str30 = tokenQueue28.chompTo("");
        java.lang.String str31 = tokenQueue28.consumeElementSelector();
        java.lang.String str34 = tokenQueue28.chompBalanced('a', '4');
        boolean boolean35 = tokenQueue28.matchesWhitespace();
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        java.lang.String str43 = tokenQueue28.consumeToAny(strArray42);
        boolean boolean44 = tokenQueue18.matchesAny(strArray42);
        java.lang.String str45 = tokenQueue1.consumeToAny(strArray42);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "hi!", "", "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        boolean boolean4 = tokenQueue1.matchesStartTag();
        boolean boolean6 = tokenQueue1.matches("");
        java.lang.String str7 = tokenQueue1.consumeElementSelector();
        java.lang.String str8 = tokenQueue1.toString();
        char char9 = tokenQueue1.peek();
        char char10 = tokenQueue1.peek();
        boolean boolean12 = tokenQueue1.matches("");
        java.lang.String str13 = tokenQueue1.consumeCssIdentifier();
        char char14 = tokenQueue1.peek();
        java.lang.String str16 = tokenQueue1.chompToIgnoreCase(" ");
        boolean boolean18 = tokenQueue1.matchesCS("#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        tokenQueue1.advance();
        boolean boolean5 = tokenQueue1.matchesWhitespace();
        boolean boolean6 = tokenQueue1.matchesWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue8 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str10 = tokenQueue8.chompTo("");
        boolean boolean11 = tokenQueue8.matchesStartTag();
        boolean boolean13 = tokenQueue8.matches("");
        java.lang.String str14 = tokenQueue8.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue16 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str18 = tokenQueue16.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue20 = new org.jsoup.parser.TokenQueue("");
        char[] charArray27 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean28 = tokenQueue20.matchesAny(charArray27);
        boolean boolean29 = tokenQueue16.matchesAny(charArray27);
        org.jsoup.parser.TokenQueue tokenQueue31 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray34 = new java.lang.String[] { "", "" };
        boolean boolean35 = tokenQueue31.matchesAny(strArray34);
        boolean boolean36 = tokenQueue16.matchesAny(strArray34);
        boolean boolean37 = tokenQueue8.matchesAny(strArray34);
        boolean boolean38 = tokenQueue8.consumeWhitespace();
        boolean boolean40 = tokenQueue8.matchesCS("");
        java.lang.String str43 = tokenQueue8.chompBalanced(' ', '#');
        org.jsoup.parser.TokenQueue tokenQueue45 = new org.jsoup.parser.TokenQueue("");
        char[] charArray52 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean53 = tokenQueue45.matchesAny(charArray52);
        boolean boolean54 = tokenQueue8.matchesAny(charArray52);
        boolean boolean55 = tokenQueue1.matchesAny(charArray52);
        java.lang.String str56 = tokenQueue1.consumeTagName();
        org.jsoup.parser.TokenQueue tokenQueue58 = new org.jsoup.parser.TokenQueue("");
        boolean boolean59 = tokenQueue58.matchesWord();
        char[] charArray61 = new char[] { ' ' };
        boolean boolean62 = tokenQueue58.matchesAny(charArray61);
        boolean boolean63 = tokenQueue58.matchesStartTag();
        org.jsoup.parser.TokenQueue tokenQueue65 = new org.jsoup.parser.TokenQueue("");
        char[] charArray72 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean73 = tokenQueue65.matchesAny(charArray72);
        boolean boolean74 = tokenQueue58.matchesAny(charArray72);
        boolean boolean75 = tokenQueue1.matchesAny(charArray72);
        boolean boolean76 = tokenQueue1.matchesWhitespace();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertArrayEquals(charArray61, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertArrayEquals(charArray72, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        boolean boolean6 = tokenQueue1.matchesWhitespace();
        java.lang.String str7 = tokenQueue1.consumeCssIdentifier();
        org.jsoup.parser.TokenQueue tokenQueue9 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str11 = tokenQueue9.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        char[] charArray20 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean21 = tokenQueue13.matchesAny(charArray20);
        boolean boolean22 = tokenQueue9.matchesAny(charArray20);
        boolean boolean23 = tokenQueue1.matchesAny(charArray20);
        java.lang.String str24 = tokenQueue1.consumeAttributeKey();
        java.lang.String str27 = tokenQueue1.chompBalanced('i', '#');
        boolean boolean28 = tokenQueue1.matchesWord();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        org.jsoup.parser.TokenQueue tokenQueue9 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str11 = tokenQueue9.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        char[] charArray20 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean21 = tokenQueue13.matchesAny(charArray20);
        boolean boolean22 = tokenQueue9.matchesAny(charArray20);
        boolean boolean23 = tokenQueue1.matchesAny(charArray20);
        org.jsoup.parser.TokenQueue tokenQueue25 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str27 = tokenQueue25.chompTo("");
        java.lang.String str28 = tokenQueue25.consumeElementSelector();
        java.lang.String str31 = tokenQueue25.chompBalanced('a', '4');
        boolean boolean33 = tokenQueue25.matchesCS("");
        java.lang.String str34 = tokenQueue25.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue36 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray39 = new java.lang.String[] { "", "" };
        boolean boolean40 = tokenQueue36.matchesAny(strArray39);
        boolean boolean41 = tokenQueue25.matchesAny(strArray39);
        boolean boolean42 = tokenQueue25.matchesWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue44 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str46 = tokenQueue44.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue48 = new org.jsoup.parser.TokenQueue("");
        char[] charArray55 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean56 = tokenQueue48.matchesAny(charArray55);
        boolean boolean57 = tokenQueue44.matchesAny(charArray55);
        boolean boolean58 = tokenQueue25.matchesAny(charArray55);
        boolean boolean59 = tokenQueue1.matchesAny(charArray55);
        java.lang.String str60 = tokenQueue1.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue62 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str64 = tokenQueue62.chompTo("");
        boolean boolean65 = tokenQueue62.matchesStartTag();
        boolean boolean67 = tokenQueue62.matches("");
        java.lang.String str68 = tokenQueue62.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue70 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str72 = tokenQueue70.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue74 = new org.jsoup.parser.TokenQueue("");
        char[] charArray81 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean82 = tokenQueue74.matchesAny(charArray81);
        boolean boolean83 = tokenQueue70.matchesAny(charArray81);
        org.jsoup.parser.TokenQueue tokenQueue85 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray88 = new java.lang.String[] { "", "" };
        boolean boolean89 = tokenQueue85.matchesAny(strArray88);
        boolean boolean90 = tokenQueue70.matchesAny(strArray88);
        boolean boolean91 = tokenQueue62.matchesAny(strArray88);
        java.lang.String str92 = tokenQueue1.consumeToAny(strArray88);
        java.lang.String str93 = tokenQueue1.consumeCssIdentifier();
        boolean boolean94 = tokenQueue1.matchesStartTag();
        tokenQueue1.addFirst((java.lang.Character) '\000');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertArrayEquals(charArray81, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertArrayEquals(strArray88, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        boolean boolean2 = tokenQueue1.matchesWord();
        java.lang.String str4 = tokenQueue1.chompToIgnoreCase("hi!");
        java.lang.String str5 = tokenQueue1.consumeAttributeKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        java.lang.String str8 = tokenQueue1.remainder();
        boolean boolean10 = tokenQueue1.matchChomp("");
        java.lang.String str12 = tokenQueue1.chompToIgnoreCase("4");
        boolean boolean14 = tokenQueue1.matches("hi");
        org.jsoup.parser.TokenQueue tokenQueue16 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str18 = tokenQueue16.chompTo("");
        boolean boolean19 = tokenQueue16.matchesStartTag();
        boolean boolean21 = tokenQueue16.matches("");
        boolean boolean23 = tokenQueue16.matchChomp("");
        org.jsoup.parser.TokenQueue tokenQueue25 = new org.jsoup.parser.TokenQueue("hi");
        org.jsoup.parser.TokenQueue tokenQueue27 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str29 = tokenQueue27.chompToIgnoreCase("hi!");
        boolean boolean30 = tokenQueue27.isEmpty();
        boolean boolean32 = tokenQueue27.matchesCS("hi!");
        org.jsoup.parser.TokenQueue tokenQueue34 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str36 = tokenQueue34.chompTo("");
        boolean boolean37 = tokenQueue34.matchesStartTag();
        tokenQueue34.addFirst("");
        org.jsoup.parser.TokenQueue tokenQueue41 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str43 = tokenQueue41.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue45 = new org.jsoup.parser.TokenQueue("");
        char[] charArray52 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean53 = tokenQueue45.matchesAny(charArray52);
        boolean boolean54 = tokenQueue41.matchesAny(charArray52);
        org.jsoup.parser.TokenQueue tokenQueue56 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray59 = new java.lang.String[] { "", "" };
        boolean boolean60 = tokenQueue56.matchesAny(strArray59);
        boolean boolean61 = tokenQueue41.matchesAny(strArray59);
        boolean boolean62 = tokenQueue34.matchesAny(strArray59);
        java.lang.String str63 = tokenQueue27.consumeToAny(strArray59);
        boolean boolean65 = tokenQueue27.matchChomp("hi!");
        org.jsoup.parser.TokenQueue tokenQueue67 = new org.jsoup.parser.TokenQueue("");
        org.jsoup.parser.TokenQueue tokenQueue69 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str71 = tokenQueue69.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue73 = new org.jsoup.parser.TokenQueue("");
        char[] charArray80 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean81 = tokenQueue73.matchesAny(charArray80);
        boolean boolean82 = tokenQueue69.matchesAny(charArray80);
        boolean boolean83 = tokenQueue67.matchesAny(charArray80);
        boolean boolean84 = tokenQueue27.matchesAny(charArray80);
        boolean boolean85 = tokenQueue25.matchesAny(charArray80);
        boolean boolean86 = tokenQueue16.matchesAny(charArray80);
        boolean boolean87 = tokenQueue1.matchesAny(charArray80);
        java.lang.String str89 = tokenQueue1.consumeToIgnoreCase("i");
        java.lang.String str91 = tokenQueue1.consumeToIgnoreCase("4");
        java.lang.String str92 = tokenQueue1.consumeElementSelector();
        java.lang.String str93 = tokenQueue1.consumeCssIdentifier();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertArrayEquals(charArray80, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        char[] charArray8 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean9 = tokenQueue1.matchesAny(charArray8);
        java.lang.String str10 = tokenQueue1.consumeCssIdentifier();
        java.lang.String str11 = tokenQueue1.remainder();
        java.lang.String str12 = tokenQueue1.consumeElementSelector();
        java.lang.String str14 = tokenQueue1.consumeTo("hi!");
        boolean boolean15 = tokenQueue1.matchesWord();
        boolean boolean16 = tokenQueue1.consumeWhitespace();
        java.lang.String str17 = tokenQueue1.consumeAttributeKey();
        boolean boolean19 = tokenQueue1.matchesCS("44!");
        tokenQueue1.advance();
        java.lang.String str21 = tokenQueue1.consumeElementSelector();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        boolean boolean6 = tokenQueue1.matchesWhitespace();
        java.lang.String str7 = tokenQueue1.consumeCssIdentifier();
        org.jsoup.parser.TokenQueue tokenQueue9 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str11 = tokenQueue9.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        char[] charArray20 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean21 = tokenQueue13.matchesAny(charArray20);
        boolean boolean22 = tokenQueue9.matchesAny(charArray20);
        boolean boolean23 = tokenQueue1.matchesAny(charArray20);
        tokenQueue1.advance();
        java.lang.String str25 = tokenQueue1.toString();
        java.lang.String str26 = tokenQueue1.remainder();
        boolean boolean27 = tokenQueue1.matchesWhitespace();
        java.lang.String str28 = tokenQueue1.consumeAttributeKey();
        boolean boolean29 = tokenQueue1.isEmpty();
        java.lang.String str30 = tokenQueue1.consumeElementSelector();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        boolean boolean2 = tokenQueue1.matchesWord();
        char[] charArray4 = new char[] { ' ' };
        boolean boolean5 = tokenQueue1.matchesAny(charArray4);
        java.lang.String str6 = tokenQueue1.consumeElementSelector();
        java.lang.String str9 = tokenQueue1.chompBalanced('!', '#');
        tokenQueue1.addFirst(" ");
        boolean boolean13 = tokenQueue1.matches("i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str10 = tokenQueue1.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        boolean boolean16 = tokenQueue12.matchesAny(strArray15);
        boolean boolean17 = tokenQueue1.matchesAny(strArray15);
        boolean boolean18 = tokenQueue1.matchesWhitespace();
        java.lang.String str20 = tokenQueue1.consumeTo("");
        java.lang.String str21 = tokenQueue1.consumeTagName();
        org.jsoup.parser.TokenQueue tokenQueue23 = new org.jsoup.parser.TokenQueue("");
        char[] charArray30 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean31 = tokenQueue23.matchesAny(charArray30);
        boolean boolean32 = tokenQueue23.matchesWord();
        java.lang.String str34 = tokenQueue23.consumeToIgnoreCase("hi!");
        boolean boolean36 = tokenQueue23.matchChomp("4");
        org.jsoup.parser.TokenQueue tokenQueue38 = new org.jsoup.parser.TokenQueue("");
        char[] charArray45 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean46 = tokenQueue38.matchesAny(charArray45);
        org.jsoup.parser.TokenQueue tokenQueue48 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str50 = tokenQueue48.chompTo("");
        boolean boolean51 = tokenQueue48.matchesStartTag();
        boolean boolean53 = tokenQueue48.matches("hi!");
        tokenQueue48.consume("");
        org.jsoup.parser.TokenQueue tokenQueue57 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str59 = tokenQueue57.chompTo("");
        tokenQueue57.advance();
        boolean boolean61 = tokenQueue57.matchesWhitespace();
        boolean boolean63 = tokenQueue57.matchChomp("hi!");
        org.jsoup.parser.TokenQueue tokenQueue65 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray68 = new java.lang.String[] { "", "" };
        boolean boolean69 = tokenQueue65.matchesAny(strArray68);
        java.lang.String str70 = tokenQueue65.remainder();
        org.jsoup.parser.TokenQueue tokenQueue72 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str74 = tokenQueue72.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue76 = new org.jsoup.parser.TokenQueue("");
        char[] charArray83 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean84 = tokenQueue76.matchesAny(charArray83);
        boolean boolean85 = tokenQueue72.matchesAny(charArray83);
        boolean boolean86 = tokenQueue65.matchesAny(charArray83);
        boolean boolean87 = tokenQueue57.matchesAny(charArray83);
        boolean boolean88 = tokenQueue48.matchesAny(charArray83);
        boolean boolean89 = tokenQueue38.matchesAny(charArray83);
        boolean boolean90 = tokenQueue23.matchesAny(charArray83);
        boolean boolean91 = tokenQueue1.matchesAny(charArray83);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(charArray83);
        org.junit.Assert.assertArrayEquals(charArray83, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        boolean boolean2 = tokenQueue1.matchesWord();
        tokenQueue1.consume("");
        java.lang.String str5 = tokenQueue1.consumeAttributeKey();
        boolean boolean6 = tokenQueue1.matchesWord();
        boolean boolean7 = tokenQueue1.matchesWhitespace();
        java.lang.String str9 = tokenQueue1.consumeToIgnoreCase("hi");
        tokenQueue1.addFirst((java.lang.Character) '!');
        java.lang.String str13 = tokenQueue1.chompToIgnoreCase("i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "!" + "'", str13, "!");
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue5 = new org.jsoup.parser.TokenQueue("");
        char[] charArray12 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean13 = tokenQueue5.matchesAny(charArray12);
        boolean boolean14 = tokenQueue1.matchesAny(charArray12);
        org.jsoup.parser.TokenQueue tokenQueue16 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray19 = new java.lang.String[] { "", "" };
        boolean boolean20 = tokenQueue16.matchesAny(strArray19);
        boolean boolean21 = tokenQueue1.matchesAny(strArray19);
        boolean boolean22 = tokenQueue1.matchesStartTag();
        boolean boolean23 = tokenQueue1.matchesStartTag();
        java.lang.String str24 = tokenQueue1.consumeAttributeKey();
        java.lang.String str27 = tokenQueue1.chompBalanced('\000', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue5 = new org.jsoup.parser.TokenQueue("");
        char[] charArray12 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean13 = tokenQueue5.matchesAny(charArray12);
        boolean boolean14 = tokenQueue1.matchesAny(charArray12);
        java.lang.String str15 = tokenQueue1.consumeCssIdentifier();
        boolean boolean17 = tokenQueue1.matchesCS("a");
        tokenQueue1.addFirst("a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        boolean boolean2 = tokenQueue1.matchesWord();
        java.lang.String str3 = tokenQueue1.consumeTagName();
        org.jsoup.parser.TokenQueue tokenQueue5 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str7 = tokenQueue5.chompTo("");
        boolean boolean8 = tokenQueue5.matchesStartTag();
        tokenQueue5.addFirst("");
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str14 = tokenQueue12.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue16 = new org.jsoup.parser.TokenQueue("");
        char[] charArray23 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean24 = tokenQueue16.matchesAny(charArray23);
        boolean boolean25 = tokenQueue12.matchesAny(charArray23);
        org.jsoup.parser.TokenQueue tokenQueue27 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        boolean boolean31 = tokenQueue27.matchesAny(strArray30);
        boolean boolean32 = tokenQueue12.matchesAny(strArray30);
        boolean boolean33 = tokenQueue5.matchesAny(strArray30);
        java.lang.String str34 = tokenQueue1.consumeToAny(strArray30);
        org.jsoup.parser.TokenQueue tokenQueue36 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str38 = tokenQueue36.chompTo("");
        java.lang.String str39 = tokenQueue36.consumeElementSelector();
        java.lang.String str42 = tokenQueue36.chompBalanced('a', '4');
        boolean boolean43 = tokenQueue36.matchesWhitespace();
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        java.lang.String str51 = tokenQueue36.consumeToAny(strArray50);
        boolean boolean52 = tokenQueue1.matchesAny(strArray50);
        tokenQueue1.addFirst((java.lang.Character) ' ');
        char char55 = tokenQueue1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "hi!", "", "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + char55 + "' != '" + ' ' + "'", char55 == ' ');
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        boolean boolean2 = tokenQueue1.matchesWord();
        tokenQueue1.consume("");
        java.lang.String str5 = tokenQueue1.consumeAttributeKey();
        boolean boolean6 = tokenQueue1.matchesWord();
        boolean boolean7 = tokenQueue1.matchesWhitespace();
        boolean boolean8 = tokenQueue1.matchesWord();
        char char9 = tokenQueue1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        boolean boolean4 = tokenQueue1.matchesStartTag();
        boolean boolean6 = tokenQueue1.matches("");
        java.lang.String str7 = tokenQueue1.consumeCssIdentifier();
        java.lang.String str9 = tokenQueue1.chompToIgnoreCase("hi!");
        org.jsoup.parser.TokenQueue tokenQueue11 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str13 = tokenQueue11.chompTo("");
        tokenQueue11.advance();
        boolean boolean15 = tokenQueue11.matchesWhitespace();
        boolean boolean17 = tokenQueue11.matchChomp("4");
        org.jsoup.parser.TokenQueue tokenQueue19 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str21 = tokenQueue19.chompTo("");
        java.lang.String str22 = tokenQueue19.consumeElementSelector();
        java.lang.String str25 = tokenQueue19.chompBalanced('a', '4');
        boolean boolean27 = tokenQueue19.matchesCS("");
        java.lang.String str28 = tokenQueue19.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue30 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray33 = new java.lang.String[] { "", "" };
        boolean boolean34 = tokenQueue30.matchesAny(strArray33);
        boolean boolean35 = tokenQueue19.matchesAny(strArray33);
        boolean boolean36 = tokenQueue19.matchesWhitespace();
        java.lang.String str38 = tokenQueue19.consumeTo("");
        org.jsoup.parser.TokenQueue tokenQueue40 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str42 = tokenQueue40.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue44 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str46 = tokenQueue44.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue48 = new org.jsoup.parser.TokenQueue("");
        char[] charArray55 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean56 = tokenQueue48.matchesAny(charArray55);
        boolean boolean57 = tokenQueue44.matchesAny(charArray55);
        org.jsoup.parser.TokenQueue tokenQueue59 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray62 = new java.lang.String[] { "", "" };
        boolean boolean63 = tokenQueue59.matchesAny(strArray62);
        boolean boolean64 = tokenQueue44.matchesAny(strArray62);
        java.lang.String str65 = tokenQueue40.consumeToAny(strArray62);
        boolean boolean66 = tokenQueue19.matchesAny(strArray62);
        java.lang.String str67 = tokenQueue11.consumeToAny(strArray62);
        java.lang.String str68 = tokenQueue1.consumeToAny(strArray62);
        // The following exception was thrown during execution in test generation
        try {
            tokenQueue1.consume("44");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Queue did not match expected sequence");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        org.jsoup.parser.TokenQueue tokenQueue7 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str9 = tokenQueue7.chompTo("");
        boolean boolean10 = tokenQueue7.matchesStartTag();
        tokenQueue7.addFirst("");
        org.jsoup.parser.TokenQueue tokenQueue14 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str16 = tokenQueue14.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue18 = new org.jsoup.parser.TokenQueue("");
        char[] charArray25 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean26 = tokenQueue18.matchesAny(charArray25);
        boolean boolean27 = tokenQueue14.matchesAny(charArray25);
        org.jsoup.parser.TokenQueue tokenQueue29 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray32 = new java.lang.String[] { "", "" };
        boolean boolean33 = tokenQueue29.matchesAny(strArray32);
        boolean boolean34 = tokenQueue14.matchesAny(strArray32);
        boolean boolean35 = tokenQueue7.matchesAny(strArray32);
        java.lang.String str36 = tokenQueue1.consumeToAny(strArray32);
        boolean boolean37 = tokenQueue1.matchesWhitespace();
        boolean boolean39 = tokenQueue1.matchesCS("");
        java.lang.String str41 = tokenQueue1.chompTo("h");
        java.lang.String str43 = tokenQueue1.chompTo("4");
        boolean boolean44 = tokenQueue1.matchesWhitespace();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str10 = tokenQueue1.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        boolean boolean16 = tokenQueue12.matchesAny(strArray15);
        boolean boolean17 = tokenQueue1.matchesAny(strArray15);
        java.lang.String str19 = tokenQueue1.chompTo("hi!");
        java.lang.String str21 = tokenQueue1.chompToIgnoreCase("hi!");
        java.lang.String str22 = tokenQueue1.remainder();
        char char23 = tokenQueue1.peek();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        boolean boolean6 = tokenQueue1.matchesCS("hi!");
        java.lang.String str7 = tokenQueue1.consumeWord();
        char char8 = tokenQueue1.peek();
        boolean boolean9 = tokenQueue1.matchesWhitespace();
        java.lang.String str12 = tokenQueue1.chompBalanced('4', 'a');
        boolean boolean14 = tokenQueue1.matchChomp("hih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str4 = tokenQueue1.chompBalanced(' ', 'a');
        java.lang.String str7 = tokenQueue1.chompBalanced('\000', '4');
        java.lang.String str8 = tokenQueue1.remainder();
        char char9 = tokenQueue1.peek();
        java.lang.String str11 = tokenQueue1.chompToIgnoreCase("4");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        boolean boolean4 = tokenQueue1.matchesStartTag();
        boolean boolean6 = tokenQueue1.matches("");
        java.lang.String str7 = tokenQueue1.consumeCssIdentifier();
        tokenQueue1.addFirst("hi");
        char char10 = tokenQueue1.peek();
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str14 = tokenQueue12.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue16 = new org.jsoup.parser.TokenQueue("");
        char[] charArray23 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean24 = tokenQueue16.matchesAny(charArray23);
        boolean boolean25 = tokenQueue12.matchesAny(charArray23);
        org.jsoup.parser.TokenQueue tokenQueue27 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        boolean boolean31 = tokenQueue27.matchesAny(strArray30);
        boolean boolean32 = tokenQueue12.matchesAny(strArray30);
        org.jsoup.parser.TokenQueue tokenQueue34 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str36 = tokenQueue34.chompTo("");
        java.lang.String str37 = tokenQueue34.consumeElementSelector();
        java.lang.String str40 = tokenQueue34.chompBalanced('a', '4');
        boolean boolean42 = tokenQueue34.matchesCS("");
        java.lang.String str43 = tokenQueue34.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue45 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray48 = new java.lang.String[] { "", "" };
        boolean boolean49 = tokenQueue45.matchesAny(strArray48);
        boolean boolean50 = tokenQueue34.matchesAny(strArray48);
        boolean boolean51 = tokenQueue34.matchesWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue53 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray56 = new java.lang.String[] { "", "" };
        boolean boolean57 = tokenQueue53.matchesAny(strArray56);
        java.lang.String str58 = tokenQueue34.consumeToAny(strArray56);
        java.lang.String str59 = tokenQueue12.consumeToAny(strArray56);
        java.lang.String str60 = tokenQueue1.consumeToAny(strArray56);
        java.lang.String str63 = tokenQueue1.chompBalanced('a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + 'h' + "'", char10 == 'h');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str4 = tokenQueue1.chompBalanced(' ', 'a');
        java.lang.String str5 = tokenQueue1.consumeTagName();
        java.lang.String str6 = tokenQueue1.consumeElementSelector();
        java.lang.String str8 = tokenQueue1.chompTo("4");
        java.lang.String str9 = tokenQueue1.consumeWord();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str10 = tokenQueue1.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        boolean boolean16 = tokenQueue12.matchesAny(strArray15);
        boolean boolean17 = tokenQueue1.matchesAny(strArray15);
        java.lang.String str19 = tokenQueue1.chompTo("hi!");
        java.lang.String str20 = tokenQueue1.consumeElementSelector();
        boolean boolean21 = tokenQueue1.isEmpty();
        boolean boolean23 = tokenQueue1.matchChomp("4");
        boolean boolean25 = tokenQueue1.matches("\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean8 = tokenQueue1.matchesWhitespace();
        java.lang.String str11 = tokenQueue1.chompBalanced('a', ' ');
        boolean boolean12 = tokenQueue1.matchesWord();
        boolean boolean14 = tokenQueue1.matchesCS("");
        boolean boolean15 = tokenQueue1.isEmpty();
        org.jsoup.parser.TokenQueue tokenQueue17 = new org.jsoup.parser.TokenQueue("");
        char[] charArray24 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean25 = tokenQueue17.matchesAny(charArray24);
        boolean boolean26 = tokenQueue17.matchesWord();
        java.lang.String str28 = tokenQueue17.consumeToIgnoreCase("hi!");
        tokenQueue17.addFirst("");
        tokenQueue17.consume("");
        java.lang.String str33 = tokenQueue17.consumeWord();
        boolean boolean34 = tokenQueue17.matchesStartTag();
        java.lang.String str35 = tokenQueue17.toString();
        org.jsoup.parser.TokenQueue tokenQueue37 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray40 = new java.lang.String[] { "", "" };
        boolean boolean41 = tokenQueue37.matchesAny(strArray40);
        java.lang.String str42 = tokenQueue37.consumeTagName();
        org.jsoup.parser.TokenQueue tokenQueue44 = new org.jsoup.parser.TokenQueue("");
        char[] charArray51 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean52 = tokenQueue44.matchesAny(charArray51);
        boolean boolean53 = tokenQueue37.matchesAny(charArray51);
        boolean boolean54 = tokenQueue17.matchesAny(charArray51);
        boolean boolean55 = tokenQueue1.matchesAny(charArray51);
        boolean boolean56 = tokenQueue1.matchesWhitespace();
        java.lang.String str57 = tokenQueue1.consumeAttributeKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        org.jsoup.parser.TokenQueue tokenQueue9 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str11 = tokenQueue9.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        char[] charArray20 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean21 = tokenQueue13.matchesAny(charArray20);
        boolean boolean22 = tokenQueue9.matchesAny(charArray20);
        boolean boolean23 = tokenQueue1.matchesAny(charArray20);
        boolean boolean25 = tokenQueue1.matches("");
        java.lang.String str27 = tokenQueue1.consumeTo("");
        java.lang.String str28 = tokenQueue1.consumeCssIdentifier();
        java.lang.String str29 = tokenQueue1.consumeElementSelector();
        tokenQueue1.addFirst((java.lang.Character) '\000');
        java.lang.String str32 = tokenQueue1.consumeWord();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        char[] charArray8 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean9 = tokenQueue1.matchesAny(charArray8);
        java.lang.String str10 = tokenQueue1.consumeCssIdentifier();
        java.lang.String str11 = tokenQueue1.remainder();
        java.lang.String str13 = tokenQueue1.consumeToIgnoreCase("4");
        tokenQueue1.addFirst((java.lang.Character) ' ');
        java.lang.String str16 = tokenQueue1.remainder();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompToIgnoreCase("hi!");
        boolean boolean4 = tokenQueue1.isEmpty();
        boolean boolean6 = tokenQueue1.matchesCS("hi!");
        org.jsoup.parser.TokenQueue tokenQueue8 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str10 = tokenQueue8.chompTo("");
        boolean boolean11 = tokenQueue8.matchesStartTag();
        boolean boolean13 = tokenQueue8.matches("");
        java.lang.String str14 = tokenQueue8.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue16 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str18 = tokenQueue16.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue20 = new org.jsoup.parser.TokenQueue("");
        char[] charArray27 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean28 = tokenQueue20.matchesAny(charArray27);
        boolean boolean29 = tokenQueue16.matchesAny(charArray27);
        org.jsoup.parser.TokenQueue tokenQueue31 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray34 = new java.lang.String[] { "", "" };
        boolean boolean35 = tokenQueue31.matchesAny(strArray34);
        boolean boolean36 = tokenQueue16.matchesAny(strArray34);
        boolean boolean37 = tokenQueue8.matchesAny(strArray34);
        java.lang.String str38 = tokenQueue1.consumeToAny(strArray34);
        boolean boolean40 = tokenQueue1.matchesCS("4");
        java.lang.String str42 = tokenQueue1.chompTo("");
        boolean boolean44 = tokenQueue1.matches("hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        tokenQueue1.advance();
        boolean boolean5 = tokenQueue1.matchesWhitespace();
        java.lang.String str7 = tokenQueue1.consumeTo("4");
        java.lang.String str8 = tokenQueue1.consumeWord();
        java.lang.String str9 = tokenQueue1.consumeElementSelector();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue5 = new org.jsoup.parser.TokenQueue("");
        char[] charArray12 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean13 = tokenQueue5.matchesAny(charArray12);
        boolean boolean14 = tokenQueue1.matchesAny(charArray12);
        boolean boolean15 = tokenQueue1.matchesWord();
        java.lang.String str16 = tokenQueue1.consumeWord();
        java.lang.String str19 = tokenQueue1.chompBalanced(' ', '#');
        java.lang.String str20 = tokenQueue1.toString();
        boolean boolean22 = tokenQueue1.matchesCS("4");
        java.lang.String str23 = tokenQueue1.remainder();
        org.jsoup.parser.TokenQueue tokenQueue25 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str27 = tokenQueue25.chompTo("");
        java.lang.String str28 = tokenQueue25.consumeElementSelector();
        java.lang.String str31 = tokenQueue25.chompBalanced('a', '4');
        boolean boolean32 = tokenQueue25.matchesWhitespace();
        java.lang.String str35 = tokenQueue25.chompBalanced('a', ' ');
        java.lang.String str36 = tokenQueue25.consumeAttributeKey();
        java.lang.String str38 = tokenQueue25.chompTo("4");
        boolean boolean40 = tokenQueue25.matchChomp("4");
        tokenQueue25.advance();
        org.jsoup.parser.TokenQueue tokenQueue43 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str45 = tokenQueue43.chompTo("");
        java.lang.String str46 = tokenQueue43.consumeElementSelector();
        java.lang.String str49 = tokenQueue43.chompBalanced('a', '4');
        boolean boolean50 = tokenQueue43.matchesWhitespace();
        boolean boolean52 = tokenQueue43.matches("");
        char char53 = tokenQueue43.peek();
        org.jsoup.parser.TokenQueue tokenQueue55 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str57 = tokenQueue55.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue59 = new org.jsoup.parser.TokenQueue("");
        char[] charArray66 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean67 = tokenQueue59.matchesAny(charArray66);
        boolean boolean68 = tokenQueue55.matchesAny(charArray66);
        org.jsoup.parser.TokenQueue tokenQueue70 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray73 = new java.lang.String[] { "", "" };
        boolean boolean74 = tokenQueue70.matchesAny(strArray73);
        boolean boolean75 = tokenQueue55.matchesAny(strArray73);
        boolean boolean76 = tokenQueue43.matchesAny(strArray73);
        java.lang.String str77 = tokenQueue25.consumeToAny(strArray73);
        java.lang.String str78 = tokenQueue1.consumeToAny(strArray73);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + char53 + "' != '" + '\000' + "'", char53 == '\000');
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertArrayEquals(charArray66, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str11 = tokenQueue1.chompTo("");
        java.lang.String str12 = tokenQueue1.consumeTagName();
        java.lang.String str14 = tokenQueue1.chompTo("");
        tokenQueue1.addFirst((java.lang.Character) '#');
        java.lang.String str19 = tokenQueue1.chompBalanced(' ', '#');
        boolean boolean20 = tokenQueue1.consumeWhitespace();
        boolean boolean21 = tokenQueue1.isEmpty();
        boolean boolean23 = tokenQueue1.matchChomp("h");
        java.lang.String str25 = tokenQueue1.chompToIgnoreCase("a");
        tokenQueue1.addFirst("a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        boolean boolean4 = tokenQueue1.matchesStartTag();
        tokenQueue1.addFirst("");
        org.jsoup.parser.TokenQueue tokenQueue8 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str10 = tokenQueue8.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("");
        char[] charArray19 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean20 = tokenQueue12.matchesAny(charArray19);
        boolean boolean21 = tokenQueue8.matchesAny(charArray19);
        org.jsoup.parser.TokenQueue tokenQueue23 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray26 = new java.lang.String[] { "", "" };
        boolean boolean27 = tokenQueue23.matchesAny(strArray26);
        boolean boolean28 = tokenQueue8.matchesAny(strArray26);
        boolean boolean29 = tokenQueue1.matchesAny(strArray26);
        boolean boolean30 = tokenQueue1.isEmpty();
        java.lang.String str31 = tokenQueue1.consumeCssIdentifier();
        boolean boolean32 = tokenQueue1.isEmpty();
        boolean boolean33 = tokenQueue1.consumeWhitespace();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        boolean boolean4 = tokenQueue1.matchesStartTag();
        boolean boolean6 = tokenQueue1.matches("");
        boolean boolean8 = tokenQueue1.matchChomp("");
        java.lang.String str9 = tokenQueue1.consumeElementSelector();
        boolean boolean11 = tokenQueue1.matches("");
        java.lang.String str12 = tokenQueue1.consumeCssIdentifier();
        java.lang.String str13 = tokenQueue1.consumeWord();
        java.lang.String str14 = tokenQueue1.remainder();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        boolean boolean6 = tokenQueue1.matches("");
        boolean boolean7 = tokenQueue1.isEmpty();
        java.lang.String str8 = tokenQueue1.consumeElementSelector();
        // The following exception was thrown during execution in test generation
        try {
            tokenQueue1.consume("a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Queue did not match expected sequence");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        tokenQueue1.advance();
        boolean boolean5 = tokenQueue1.matchesWhitespace();
        boolean boolean7 = tokenQueue1.matchChomp("hi!");
        org.jsoup.parser.TokenQueue tokenQueue9 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        boolean boolean13 = tokenQueue9.matchesAny(strArray12);
        java.lang.String str14 = tokenQueue9.remainder();
        org.jsoup.parser.TokenQueue tokenQueue16 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str18 = tokenQueue16.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue20 = new org.jsoup.parser.TokenQueue("");
        char[] charArray27 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean28 = tokenQueue20.matchesAny(charArray27);
        boolean boolean29 = tokenQueue16.matchesAny(charArray27);
        boolean boolean30 = tokenQueue9.matchesAny(charArray27);
        boolean boolean31 = tokenQueue1.matchesAny(charArray27);
        boolean boolean33 = tokenQueue1.matchesCS("i");
        java.lang.String str34 = tokenQueue1.consumeWord();
        java.lang.String str36 = tokenQueue1.chompToIgnoreCase("a");
        boolean boolean37 = tokenQueue1.consumeWhitespace();
        java.lang.String str40 = tokenQueue1.chompBalanced('#', '!');
        java.lang.String str42 = tokenQueue1.consumeTo("4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.consumeTo("hi!");
        java.lang.String str4 = tokenQueue1.consumeWord();
        java.lang.String str7 = tokenQueue1.chompBalanced(' ', ' ');
        java.lang.String str8 = tokenQueue1.remainder();
        java.lang.String str9 = tokenQueue1.toString();
        java.lang.String str10 = tokenQueue1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        boolean boolean6 = tokenQueue1.consumeWhitespace();
        java.lang.String str8 = tokenQueue1.consumeTo("4");
        tokenQueue1.addFirst((java.lang.Character) ' ');
        char char11 = tokenQueue1.peek();
        java.lang.String str13 = tokenQueue1.chompTo("hi");
        char char14 = tokenQueue1.peek();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + ' ' + "'", char11 == ' ');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " " + "'", str13, " ");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str11 = tokenQueue1.chompTo("");
        java.lang.String str12 = tokenQueue1.consumeTagName();
        java.lang.String str14 = tokenQueue1.chompTo("");
        boolean boolean15 = tokenQueue1.matchesWhitespace();
        boolean boolean17 = tokenQueue1.matchesCS("4");
        tokenQueue1.consume("");
        java.lang.String[] strArray20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = tokenQueue1.matchesAny(strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str11 = tokenQueue1.chompTo("");
        java.lang.String str12 = tokenQueue1.consumeTagName();
        java.lang.String str14 = tokenQueue1.chompTo("");
        boolean boolean15 = tokenQueue1.matchesWhitespace();
        java.lang.String str16 = tokenQueue1.toString();
        boolean boolean17 = tokenQueue1.consumeWhitespace();
        java.lang.String str19 = tokenQueue1.chompToIgnoreCase("44!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str4 = tokenQueue1.chompBalanced(' ', 'a');
        java.lang.String str5 = tokenQueue1.remainder();
        boolean boolean7 = tokenQueue1.matchChomp("a");
        java.lang.String str8 = tokenQueue1.consumeElementSelector();
        boolean boolean10 = tokenQueue1.matchChomp("44");
        java.lang.String str11 = tokenQueue1.consumeAttributeKey();
        boolean boolean12 = tokenQueue1.matchesWord();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str5 = tokenQueue1.consumeToIgnoreCase("hi");
        java.lang.String str7 = tokenQueue1.consumeToIgnoreCase("#");
        java.lang.String[] strArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = tokenQueue1.matchesAny(strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompToIgnoreCase("hi!");
        boolean boolean4 = tokenQueue1.isEmpty();
        boolean boolean6 = tokenQueue1.matchesCS("hi!");
        org.jsoup.parser.TokenQueue tokenQueue8 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str10 = tokenQueue8.chompTo("");
        boolean boolean11 = tokenQueue8.matchesStartTag();
        tokenQueue8.addFirst("");
        org.jsoup.parser.TokenQueue tokenQueue15 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str17 = tokenQueue15.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue19 = new org.jsoup.parser.TokenQueue("");
        char[] charArray26 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean27 = tokenQueue19.matchesAny(charArray26);
        boolean boolean28 = tokenQueue15.matchesAny(charArray26);
        org.jsoup.parser.TokenQueue tokenQueue30 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray33 = new java.lang.String[] { "", "" };
        boolean boolean34 = tokenQueue30.matchesAny(strArray33);
        boolean boolean35 = tokenQueue15.matchesAny(strArray33);
        boolean boolean36 = tokenQueue8.matchesAny(strArray33);
        java.lang.String str37 = tokenQueue1.consumeToAny(strArray33);
        tokenQueue1.advance();
        java.lang.String str39 = tokenQueue1.consumeWord();
        java.lang.String str41 = tokenQueue1.consumeTo(" ");
        java.lang.String str42 = tokenQueue1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        char[] charArray8 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean9 = tokenQueue1.matchesAny(charArray8);
        java.lang.String str10 = tokenQueue1.remainder();
        java.lang.String str11 = tokenQueue1.toString();
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str15 = tokenQueue13.chompTo("");
        boolean boolean16 = tokenQueue13.matchesStartTag();
        boolean boolean18 = tokenQueue13.matches("");
        java.lang.String str19 = tokenQueue13.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue21 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str23 = tokenQueue21.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue25 = new org.jsoup.parser.TokenQueue("");
        char[] charArray32 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean33 = tokenQueue25.matchesAny(charArray32);
        boolean boolean34 = tokenQueue21.matchesAny(charArray32);
        org.jsoup.parser.TokenQueue tokenQueue36 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray39 = new java.lang.String[] { "", "" };
        boolean boolean40 = tokenQueue36.matchesAny(strArray39);
        boolean boolean41 = tokenQueue21.matchesAny(strArray39);
        boolean boolean42 = tokenQueue13.matchesAny(strArray39);
        boolean boolean43 = tokenQueue1.matchesAny(strArray39);
        boolean boolean44 = tokenQueue1.matchesWhitespace();
        java.lang.String str46 = tokenQueue1.chompTo("4a");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        java.lang.String str7 = tokenQueue1.consumeToIgnoreCase("a");
        boolean boolean8 = tokenQueue1.matchesWord();
        tokenQueue1.addFirst((java.lang.Character) '4');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str11 = tokenQueue1.chompTo("");
        java.lang.String str12 = tokenQueue1.consumeTagName();
        java.lang.String str14 = tokenQueue1.chompTo("");
        boolean boolean15 = tokenQueue1.consumeWhitespace();
        java.lang.String str16 = tokenQueue1.consumeCssIdentifier();
        java.lang.String str17 = tokenQueue1.consumeAttributeKey();
        boolean boolean18 = tokenQueue1.matchesWord();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        char[] charArray8 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean9 = tokenQueue1.matchesAny(charArray8);
        boolean boolean10 = tokenQueue1.matchesWord();
        java.lang.String str12 = tokenQueue1.consumeToIgnoreCase("hi!");
        tokenQueue1.addFirst("");
        tokenQueue1.consume("");
        boolean boolean17 = tokenQueue1.isEmpty();
        boolean boolean19 = tokenQueue1.matches("hi!");
        boolean boolean21 = tokenQueue1.matches("hi!");
        java.lang.String str23 = tokenQueue1.consumeTo("a");
        boolean boolean25 = tokenQueue1.matchesCS("!");
        boolean boolean27 = tokenQueue1.matchChomp("!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        boolean boolean4 = tokenQueue1.matchesStartTag();
        boolean boolean6 = tokenQueue1.matches("");
        java.lang.String str7 = tokenQueue1.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue9 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str11 = tokenQueue9.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        char[] charArray20 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean21 = tokenQueue13.matchesAny(charArray20);
        boolean boolean22 = tokenQueue9.matchesAny(charArray20);
        org.jsoup.parser.TokenQueue tokenQueue24 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        boolean boolean28 = tokenQueue24.matchesAny(strArray27);
        boolean boolean29 = tokenQueue9.matchesAny(strArray27);
        boolean boolean30 = tokenQueue1.matchesAny(strArray27);
        boolean boolean31 = tokenQueue1.isEmpty();
        java.lang.String str32 = tokenQueue1.remainder();
        java.lang.String str33 = tokenQueue1.toString();
        char char34 = tokenQueue1.peek();
        boolean boolean35 = tokenQueue1.consumeWhitespace();
        java.lang.String str37 = tokenQueue1.chompToIgnoreCase("a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + char34 + "' != '" + '\000' + "'", char34 == '\000');
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        java.lang.String str6 = tokenQueue1.consumeTagName();
        char char7 = tokenQueue1.peek();
        org.jsoup.parser.TokenQueue tokenQueue9 = new org.jsoup.parser.TokenQueue("");
        boolean boolean10 = tokenQueue9.matchesWord();
        char[] charArray12 = new char[] { ' ' };
        boolean boolean13 = tokenQueue9.matchesAny(charArray12);
        boolean boolean14 = tokenQueue9.matchesStartTag();
        org.jsoup.parser.TokenQueue tokenQueue16 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str18 = tokenQueue16.chompTo("");
        java.lang.String str19 = tokenQueue16.consumeElementSelector();
        java.lang.String str22 = tokenQueue16.chompBalanced('a', '4');
        boolean boolean24 = tokenQueue16.matchesCS("");
        java.lang.String str26 = tokenQueue16.chompTo("");
        java.lang.String str27 = tokenQueue16.consumeTagName();
        boolean boolean28 = tokenQueue16.matchesWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue30 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str32 = tokenQueue30.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue34 = new org.jsoup.parser.TokenQueue("");
        char[] charArray41 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean42 = tokenQueue34.matchesAny(charArray41);
        boolean boolean43 = tokenQueue30.matchesAny(charArray41);
        org.jsoup.parser.TokenQueue tokenQueue45 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray48 = new java.lang.String[] { "", "" };
        boolean boolean49 = tokenQueue45.matchesAny(strArray48);
        boolean boolean50 = tokenQueue30.matchesAny(strArray48);
        boolean boolean51 = tokenQueue16.matchesAny(strArray48);
        boolean boolean52 = tokenQueue9.matchesAny(strArray48);
        java.lang.String str53 = tokenQueue1.consumeToAny(strArray48);
        tokenQueue1.addFirst((java.lang.Character) '4');
        java.lang.String str57 = tokenQueue1.chompToIgnoreCase("44!");
        tokenQueue1.advance();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "4" + "'", str57, "4");
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        java.lang.String str6 = tokenQueue1.remainder();
        boolean boolean7 = tokenQueue1.consumeWhitespace();
        tokenQueue1.consume("");
        tokenQueue1.consume("");
        java.lang.String str12 = tokenQueue1.consumeTagName();
        boolean boolean13 = tokenQueue1.isEmpty();
        tokenQueue1.addFirst("hi!");
        tokenQueue1.advance();
        boolean boolean18 = tokenQueue1.matchChomp("hi!");
        boolean boolean20 = tokenQueue1.matchChomp("hi");
        org.jsoup.parser.TokenQueue tokenQueue22 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        boolean boolean26 = tokenQueue22.matchesAny(strArray25);
        java.lang.String str27 = tokenQueue22.consumeTagName();
        org.jsoup.parser.TokenQueue tokenQueue29 = new org.jsoup.parser.TokenQueue("");
        char[] charArray36 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean37 = tokenQueue29.matchesAny(charArray36);
        boolean boolean38 = tokenQueue22.matchesAny(charArray36);
        boolean boolean39 = tokenQueue1.matchesAny(charArray36);
        tokenQueue1.addFirst("hi!");
        java.lang.String str44 = tokenQueue1.chompBalanced('4', '\000');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        boolean boolean6 = tokenQueue1.consumeWhitespace();
        java.lang.String str8 = tokenQueue1.consumeTo("4");
        tokenQueue1.addFirst("4");
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        boolean boolean16 = tokenQueue12.matchesAny(strArray15);
        boolean boolean17 = tokenQueue12.matchesWhitespace();
        java.lang.String str18 = tokenQueue12.consumeCssIdentifier();
        char char19 = tokenQueue12.peek();
        java.lang.String str20 = tokenQueue12.consumeAttributeKey();
        org.jsoup.parser.TokenQueue tokenQueue22 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str24 = tokenQueue22.chompTo("");
        java.lang.String str25 = tokenQueue22.consumeElementSelector();
        java.lang.String str28 = tokenQueue22.chompBalanced('a', '4');
        boolean boolean30 = tokenQueue22.matchesCS("");
        java.lang.String str31 = tokenQueue22.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue33 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray36 = new java.lang.String[] { "", "" };
        boolean boolean37 = tokenQueue33.matchesAny(strArray36);
        boolean boolean38 = tokenQueue22.matchesAny(strArray36);
        boolean boolean39 = tokenQueue12.matchesAny(strArray36);
        java.lang.String str40 = tokenQueue1.consumeToAny(strArray36);
        boolean boolean41 = tokenQueue1.matchesWhitespace();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        char[] charArray8 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean9 = tokenQueue1.matchesAny(charArray8);
        java.lang.String str10 = tokenQueue1.remainder();
        java.lang.String str11 = tokenQueue1.toString();
        boolean boolean12 = tokenQueue1.consumeWhitespace();
        boolean boolean14 = tokenQueue1.matchChomp("4");
        java.lang.String str15 = tokenQueue1.toString();
        tokenQueue1.advance();
        boolean boolean18 = tokenQueue1.matchesCS("hih");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        java.lang.String str6 = tokenQueue1.remainder();
        boolean boolean7 = tokenQueue1.consumeWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue9 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        boolean boolean13 = tokenQueue9.matchesAny(strArray12);
        java.lang.String str14 = tokenQueue9.consumeTagName();
        org.jsoup.parser.TokenQueue tokenQueue16 = new org.jsoup.parser.TokenQueue("");
        char[] charArray23 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean24 = tokenQueue16.matchesAny(charArray23);
        boolean boolean25 = tokenQueue9.matchesAny(charArray23);
        boolean boolean26 = tokenQueue1.matchesAny(charArray23);
        java.lang.String str27 = tokenQueue1.consumeWord();
        java.lang.String str29 = tokenQueue1.consumeToIgnoreCase("hi!");
        tokenQueue1.addFirst((java.lang.Character) 'a');
        boolean boolean33 = tokenQueue1.matches(" ");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        boolean boolean6 = tokenQueue1.matches("");
        boolean boolean7 = tokenQueue1.isEmpty();
        boolean boolean8 = tokenQueue1.isEmpty();
        char char9 = tokenQueue1.peek();
        java.lang.String str10 = tokenQueue1.consumeWord();
        boolean boolean11 = tokenQueue1.matchesWhitespace();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.consumeTo("hi!");
        java.lang.String str4 = tokenQueue1.consumeWord();
        boolean boolean5 = tokenQueue1.matchesWord();
        char char6 = tokenQueue1.peek();
        java.lang.String str7 = tokenQueue1.consumeElementSelector();
        boolean boolean8 = tokenQueue1.matchesWhitespace();
        java.lang.String str10 = tokenQueue1.consumeTo("i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean8 = tokenQueue1.matchesWhitespace();
        tokenQueue1.advance();
        java.lang.String str10 = tokenQueue1.remainder();
        tokenQueue1.addFirst("hi!");
        boolean boolean13 = tokenQueue1.isEmpty();
        java.lang.String str14 = tokenQueue1.consumeCssIdentifier();
        java.lang.String str15 = tokenQueue1.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue17 = new org.jsoup.parser.TokenQueue("");
        boolean boolean18 = tokenQueue17.matchesWord();
        tokenQueue17.consume("");
        java.lang.String str21 = tokenQueue17.consumeAttributeKey();
        org.jsoup.parser.TokenQueue tokenQueue23 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str25 = tokenQueue23.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue27 = new org.jsoup.parser.TokenQueue("");
        char[] charArray34 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean35 = tokenQueue27.matchesAny(charArray34);
        boolean boolean36 = tokenQueue23.matchesAny(charArray34);
        org.jsoup.parser.TokenQueue tokenQueue38 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray41 = new java.lang.String[] { "", "" };
        boolean boolean42 = tokenQueue38.matchesAny(strArray41);
        boolean boolean43 = tokenQueue23.matchesAny(strArray41);
        java.lang.String str44 = tokenQueue17.consumeToAny(strArray41);
        java.lang.String str46 = tokenQueue17.consumeTo("hi!");
        java.lang.String str47 = tokenQueue17.consumeTagName();
        org.jsoup.parser.TokenQueue tokenQueue49 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray52 = new java.lang.String[] { "", "" };
        boolean boolean53 = tokenQueue49.matchesAny(strArray52);
        java.lang.String str54 = tokenQueue49.remainder();
        boolean boolean55 = tokenQueue49.consumeWhitespace();
        char char56 = tokenQueue49.peek();
        org.jsoup.parser.TokenQueue tokenQueue58 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray61 = new java.lang.String[] { "", "" };
        boolean boolean62 = tokenQueue58.matchesAny(strArray61);
        java.lang.String str63 = tokenQueue49.consumeToAny(strArray61);
        java.lang.String str64 = tokenQueue17.consumeToAny(strArray61);
        java.lang.String str65 = tokenQueue1.consumeToAny(strArray61);
        java.lang.String str66 = tokenQueue1.consumeCssIdentifier();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi" + "'", str14, "hi");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + char56 + "' != '" + '\000' + "'", char56 == '\000');
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        org.jsoup.parser.TokenQueue tokenQueue9 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str11 = tokenQueue9.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        char[] charArray20 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean21 = tokenQueue13.matchesAny(charArray20);
        boolean boolean22 = tokenQueue9.matchesAny(charArray20);
        boolean boolean23 = tokenQueue1.matchesAny(charArray20);
        java.lang.String str26 = tokenQueue1.chompBalanced('\000', 'a');
        boolean boolean27 = tokenQueue1.matchesWord();
        boolean boolean28 = tokenQueue1.consumeWhitespace();
        boolean boolean29 = tokenQueue1.isEmpty();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        boolean boolean6 = tokenQueue1.matchesWhitespace();
        java.lang.String str7 = tokenQueue1.consumeCssIdentifier();
        org.jsoup.parser.TokenQueue tokenQueue9 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str11 = tokenQueue9.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        char[] charArray20 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean21 = tokenQueue13.matchesAny(charArray20);
        boolean boolean22 = tokenQueue9.matchesAny(charArray20);
        boolean boolean23 = tokenQueue1.matchesAny(charArray20);
        tokenQueue1.advance();
        java.lang.String str25 = tokenQueue1.toString();
        char char26 = tokenQueue1.peek();
        java.lang.String str27 = tokenQueue1.consumeAttributeKey();
        java.lang.String str30 = tokenQueue1.chompBalanced('h', 'i');
        boolean boolean32 = tokenQueue1.matchChomp("44");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\000' + "'", char26 == '\000');
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompToIgnoreCase("hi!");
        boolean boolean4 = tokenQueue1.isEmpty();
        boolean boolean6 = tokenQueue1.matchesCS("hi!");
        org.jsoup.parser.TokenQueue tokenQueue8 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str10 = tokenQueue8.chompTo("");
        boolean boolean11 = tokenQueue8.matchesStartTag();
        tokenQueue8.addFirst("");
        org.jsoup.parser.TokenQueue tokenQueue15 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str17 = tokenQueue15.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue19 = new org.jsoup.parser.TokenQueue("");
        char[] charArray26 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean27 = tokenQueue19.matchesAny(charArray26);
        boolean boolean28 = tokenQueue15.matchesAny(charArray26);
        org.jsoup.parser.TokenQueue tokenQueue30 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray33 = new java.lang.String[] { "", "" };
        boolean boolean34 = tokenQueue30.matchesAny(strArray33);
        boolean boolean35 = tokenQueue15.matchesAny(strArray33);
        boolean boolean36 = tokenQueue8.matchesAny(strArray33);
        java.lang.String str37 = tokenQueue1.consumeToAny(strArray33);
        java.lang.String str38 = tokenQueue1.consumeCssIdentifier();
        java.lang.String str40 = tokenQueue1.chompToIgnoreCase(" !");
        java.lang.String str41 = tokenQueue1.consumeCssIdentifier();
        tokenQueue1.addFirst((java.lang.Character) 'i');
        boolean boolean45 = tokenQueue1.matchesCS("hih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue5 = new org.jsoup.parser.TokenQueue("");
        char[] charArray12 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean13 = tokenQueue5.matchesAny(charArray12);
        boolean boolean14 = tokenQueue1.matchesAny(charArray12);
        boolean boolean15 = tokenQueue1.matchesWord();
        org.jsoup.parser.TokenQueue tokenQueue17 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str19 = tokenQueue17.chompToIgnoreCase("hi!");
        boolean boolean20 = tokenQueue17.isEmpty();
        boolean boolean22 = tokenQueue17.matchesCS("hi!");
        org.jsoup.parser.TokenQueue tokenQueue24 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str26 = tokenQueue24.chompTo("");
        boolean boolean27 = tokenQueue24.matchesStartTag();
        tokenQueue24.addFirst("");
        org.jsoup.parser.TokenQueue tokenQueue31 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str33 = tokenQueue31.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue35 = new org.jsoup.parser.TokenQueue("");
        char[] charArray42 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean43 = tokenQueue35.matchesAny(charArray42);
        boolean boolean44 = tokenQueue31.matchesAny(charArray42);
        org.jsoup.parser.TokenQueue tokenQueue46 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray49 = new java.lang.String[] { "", "" };
        boolean boolean50 = tokenQueue46.matchesAny(strArray49);
        boolean boolean51 = tokenQueue31.matchesAny(strArray49);
        boolean boolean52 = tokenQueue24.matchesAny(strArray49);
        java.lang.String str53 = tokenQueue17.consumeToAny(strArray49);
        boolean boolean54 = tokenQueue1.matchesAny(strArray49);
        java.lang.String str55 = tokenQueue1.consumeTagName();
        java.lang.String str56 = tokenQueue1.consumeAttributeKey();
        java.lang.String str58 = tokenQueue1.consumeToIgnoreCase("44");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        org.jsoup.parser.TokenQueue tokenQueue9 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str11 = tokenQueue9.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        char[] charArray20 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean21 = tokenQueue13.matchesAny(charArray20);
        boolean boolean22 = tokenQueue9.matchesAny(charArray20);
        boolean boolean23 = tokenQueue1.matchesAny(charArray20);
        boolean boolean25 = tokenQueue1.matches("");
        java.lang.String str26 = tokenQueue1.consumeCssIdentifier();
        tokenQueue1.advance();
        org.jsoup.parser.TokenQueue tokenQueue29 = new org.jsoup.parser.TokenQueue("");
        boolean boolean30 = tokenQueue29.matchesWord();
        char[] charArray32 = new char[] { ' ' };
        boolean boolean33 = tokenQueue29.matchesAny(charArray32);
        boolean boolean34 = tokenQueue1.matchesAny(charArray32);
        java.lang.String str36 = tokenQueue1.consumeToIgnoreCase("hi!");
        boolean boolean37 = tokenQueue1.consumeWhitespace();
        java.lang.String str38 = tokenQueue1.consumeWord();
        java.lang.String str40 = tokenQueue1.consumeTo("#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str4 = tokenQueue1.chompBalanced(' ', 'a');
        java.lang.String str7 = tokenQueue1.chompBalanced('\000', '4');
        java.lang.String str8 = tokenQueue1.remainder();
        char char9 = tokenQueue1.peek();
        java.lang.String str10 = tokenQueue1.consumeElementSelector();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        boolean boolean6 = tokenQueue1.matchesCS("hi!");
        java.lang.String str7 = tokenQueue1.consumeWord();
        org.jsoup.parser.TokenQueue tokenQueue9 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str11 = tokenQueue9.chompTo("");
        tokenQueue9.advance();
        boolean boolean13 = tokenQueue9.matchesWhitespace();
        boolean boolean15 = tokenQueue9.matchChomp("4");
        org.jsoup.parser.TokenQueue tokenQueue17 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str19 = tokenQueue17.chompTo("");
        java.lang.String str20 = tokenQueue17.consumeElementSelector();
        java.lang.String str23 = tokenQueue17.chompBalanced('a', '4');
        boolean boolean25 = tokenQueue17.matchesCS("");
        java.lang.String str26 = tokenQueue17.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue28 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray31 = new java.lang.String[] { "", "" };
        boolean boolean32 = tokenQueue28.matchesAny(strArray31);
        boolean boolean33 = tokenQueue17.matchesAny(strArray31);
        boolean boolean34 = tokenQueue17.matchesWhitespace();
        java.lang.String str36 = tokenQueue17.consumeTo("");
        org.jsoup.parser.TokenQueue tokenQueue38 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str40 = tokenQueue38.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue42 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str44 = tokenQueue42.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue46 = new org.jsoup.parser.TokenQueue("");
        char[] charArray53 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean54 = tokenQueue46.matchesAny(charArray53);
        boolean boolean55 = tokenQueue42.matchesAny(charArray53);
        org.jsoup.parser.TokenQueue tokenQueue57 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray60 = new java.lang.String[] { "", "" };
        boolean boolean61 = tokenQueue57.matchesAny(strArray60);
        boolean boolean62 = tokenQueue42.matchesAny(strArray60);
        java.lang.String str63 = tokenQueue38.consumeToAny(strArray60);
        boolean boolean64 = tokenQueue17.matchesAny(strArray60);
        java.lang.String str65 = tokenQueue9.consumeToAny(strArray60);
        boolean boolean66 = tokenQueue1.matchesAny(strArray60);
        java.lang.String str68 = tokenQueue1.consumeToIgnoreCase("!");
        tokenQueue1.addFirst("44");
        boolean boolean71 = tokenQueue1.consumeWhitespace();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue5 = new org.jsoup.parser.TokenQueue("");
        char[] charArray12 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean13 = tokenQueue5.matchesAny(charArray12);
        boolean boolean14 = tokenQueue1.matchesAny(charArray12);
        java.lang.String str15 = tokenQueue1.consumeCssIdentifier();
        boolean boolean17 = tokenQueue1.matches("4");
        java.lang.String str18 = tokenQueue1.consumeElementSelector();
        tokenQueue1.addFirst("");
        char char21 = tokenQueue1.peek();
        java.lang.String str23 = tokenQueue1.chompTo("44");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean8 = tokenQueue1.matchesWhitespace();
        tokenQueue1.advance();
        java.lang.String str10 = tokenQueue1.remainder();
        tokenQueue1.addFirst("hi!");
        boolean boolean13 = tokenQueue1.isEmpty();
        java.lang.String str14 = tokenQueue1.consumeCssIdentifier();
        java.lang.String str15 = tokenQueue1.consumeElementSelector();
        java.lang.String str16 = tokenQueue1.toString();
        tokenQueue1.advance();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi" + "'", str14, "hi");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "!" + "'", str16, "!");
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        boolean boolean2 = tokenQueue1.matchesWord();
        java.lang.String str3 = tokenQueue1.consumeTagName();
        org.jsoup.parser.TokenQueue tokenQueue5 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str7 = tokenQueue5.chompTo("");
        boolean boolean8 = tokenQueue5.matchesStartTag();
        tokenQueue5.addFirst("");
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str14 = tokenQueue12.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue16 = new org.jsoup.parser.TokenQueue("");
        char[] charArray23 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean24 = tokenQueue16.matchesAny(charArray23);
        boolean boolean25 = tokenQueue12.matchesAny(charArray23);
        org.jsoup.parser.TokenQueue tokenQueue27 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        boolean boolean31 = tokenQueue27.matchesAny(strArray30);
        boolean boolean32 = tokenQueue12.matchesAny(strArray30);
        boolean boolean33 = tokenQueue5.matchesAny(strArray30);
        java.lang.String str34 = tokenQueue1.consumeToAny(strArray30);
        boolean boolean36 = tokenQueue1.matchesCS("hi!");
        boolean boolean38 = tokenQueue1.matchesCS("a ");
        boolean boolean40 = tokenQueue1.matchChomp("");
        java.lang.String str41 = tokenQueue1.consumeCssIdentifier();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str10 = tokenQueue1.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        boolean boolean16 = tokenQueue12.matchesAny(strArray15);
        boolean boolean17 = tokenQueue1.matchesAny(strArray15);
        boolean boolean18 = tokenQueue1.matchesWhitespace();
        tokenQueue1.addFirst("4");
        java.lang.String str21 = tokenQueue1.consumeAttributeKey();
        java.lang.String str23 = tokenQueue1.chompTo("44");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4" + "'", str21, "4");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str10 = tokenQueue1.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        boolean boolean16 = tokenQueue12.matchesAny(strArray15);
        boolean boolean17 = tokenQueue1.matchesAny(strArray15);
        boolean boolean18 = tokenQueue1.matchesWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue20 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str22 = tokenQueue20.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue24 = new org.jsoup.parser.TokenQueue("");
        char[] charArray31 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean32 = tokenQueue24.matchesAny(charArray31);
        boolean boolean33 = tokenQueue20.matchesAny(charArray31);
        boolean boolean34 = tokenQueue1.matchesAny(charArray31);
        tokenQueue1.addFirst("hi!");
        boolean boolean37 = tokenQueue1.matchesWhitespace();
        java.lang.String str38 = tokenQueue1.consumeAttributeKey();
        char char39 = tokenQueue1.peek();
        tokenQueue1.addFirst("44");
        java.lang.String str43 = tokenQueue1.consumeTo("i!");
        // The following exception was thrown during execution in test generation
        try {
            tokenQueue1.consume("4a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Queue did not match expected sequence");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi" + "'", str38, "hi");
        org.junit.Assert.assertTrue("'" + char39 + "' != '" + '!' + "'", char39 == '!');
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "44!" + "'", str43, "44!");
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.consumeTo("hi!");
        java.lang.String str4 = tokenQueue1.consumeWord();
        boolean boolean5 = tokenQueue1.isEmpty();
        java.lang.String str6 = tokenQueue1.consumeWord();
        boolean boolean7 = tokenQueue1.matchesWord();
        java.lang.String str9 = tokenQueue1.consumeTo("hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        java.lang.String str6 = tokenQueue1.remainder();
        boolean boolean7 = tokenQueue1.consumeWhitespace();
        boolean boolean8 = tokenQueue1.matchesWhitespace();
        boolean boolean9 = tokenQueue1.isEmpty();
        tokenQueue1.addFirst((java.lang.Character) '4');
        java.lang.String str12 = tokenQueue1.consumeCssIdentifier();
        java.lang.String str13 = tokenQueue1.remainder();
        org.jsoup.parser.TokenQueue tokenQueue15 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str17 = tokenQueue15.chompTo("");
        java.lang.String str18 = tokenQueue15.consumeElementSelector();
        java.lang.String str21 = tokenQueue15.chompBalanced('a', '4');
        boolean boolean23 = tokenQueue15.matchesCS("");
        java.lang.String str24 = tokenQueue15.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue26 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray29 = new java.lang.String[] { "", "" };
        boolean boolean30 = tokenQueue26.matchesAny(strArray29);
        boolean boolean31 = tokenQueue15.matchesAny(strArray29);
        java.lang.String str33 = tokenQueue15.chompTo("hi!");
        java.lang.String str34 = tokenQueue15.consumeWord();
        java.lang.String str35 = tokenQueue15.consumeCssIdentifier();
        org.jsoup.parser.TokenQueue tokenQueue37 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str39 = tokenQueue37.chompTo("");
        java.lang.String str40 = tokenQueue37.consumeElementSelector();
        java.lang.String str43 = tokenQueue37.chompBalanced('a', '4');
        boolean boolean45 = tokenQueue37.matchesCS("");
        java.lang.String str46 = tokenQueue37.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue48 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray51 = new java.lang.String[] { "", "" };
        boolean boolean52 = tokenQueue48.matchesAny(strArray51);
        boolean boolean53 = tokenQueue37.matchesAny(strArray51);
        java.lang.String str54 = tokenQueue15.consumeToAny(strArray51);
        boolean boolean55 = tokenQueue1.matchesAny(strArray51);
        boolean boolean57 = tokenQueue1.matches("a");
        java.lang.String str58 = tokenQueue1.consumeAttributeKey();
        boolean boolean60 = tokenQueue1.matchChomp("hi");
        boolean boolean61 = tokenQueue1.matchesStartTag();
        boolean boolean63 = tokenQueue1.matches("4a");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4" + "'", str12, "4");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str11 = tokenQueue1.chompTo("");
        java.lang.String str12 = tokenQueue1.consumeTagName();
        java.lang.String str14 = tokenQueue1.chompTo("");
        boolean boolean15 = tokenQueue1.matchesWhitespace();
        java.lang.String str17 = tokenQueue1.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue19 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str21 = tokenQueue19.chompTo("");
        boolean boolean22 = tokenQueue19.matchesStartTag();
        boolean boolean24 = tokenQueue19.matches("");
        java.lang.String str25 = tokenQueue19.consumeElementSelector();
        java.lang.String str26 = tokenQueue19.toString();
        org.jsoup.parser.TokenQueue tokenQueue28 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str30 = tokenQueue28.chompTo("");
        boolean boolean31 = tokenQueue28.matchesStartTag();
        tokenQueue28.addFirst("");
        org.jsoup.parser.TokenQueue tokenQueue35 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str37 = tokenQueue35.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue39 = new org.jsoup.parser.TokenQueue("");
        char[] charArray46 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean47 = tokenQueue39.matchesAny(charArray46);
        boolean boolean48 = tokenQueue35.matchesAny(charArray46);
        org.jsoup.parser.TokenQueue tokenQueue50 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray53 = new java.lang.String[] { "", "" };
        boolean boolean54 = tokenQueue50.matchesAny(strArray53);
        boolean boolean55 = tokenQueue35.matchesAny(strArray53);
        boolean boolean56 = tokenQueue28.matchesAny(strArray53);
        org.jsoup.parser.TokenQueue tokenQueue58 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str60 = tokenQueue58.chompTo("");
        java.lang.String str61 = tokenQueue58.consumeElementSelector();
        java.lang.String str64 = tokenQueue58.chompBalanced('a', '4');
        boolean boolean65 = tokenQueue58.matchesWhitespace();
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        java.lang.String str73 = tokenQueue58.consumeToAny(strArray72);
        java.lang.String str74 = tokenQueue28.consumeToAny(strArray72);
        java.lang.String str75 = tokenQueue19.consumeToAny(strArray72);
        boolean boolean76 = tokenQueue1.matchesAny(strArray72);
        java.lang.String str77 = tokenQueue1.consumeElementSelector();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "hi!", "", "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean8 = tokenQueue1.matchesWhitespace();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        java.lang.String str16 = tokenQueue1.consumeToAny(strArray15);
        java.lang.String str17 = tokenQueue1.consumeCssIdentifier();
        char char18 = tokenQueue1.peek();
        java.lang.String str19 = tokenQueue1.remainder();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        java.lang.String str6 = tokenQueue1.consumeTagName();
        org.jsoup.parser.TokenQueue tokenQueue8 = new org.jsoup.parser.TokenQueue("");
        char[] charArray15 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean16 = tokenQueue8.matchesAny(charArray15);
        boolean boolean17 = tokenQueue1.matchesAny(charArray15);
        java.lang.String str18 = tokenQueue1.consumeCssIdentifier();
        java.lang.String str19 = tokenQueue1.consumeTagName();
        java.lang.String str20 = tokenQueue1.consumeAttributeKey();
        java.lang.String str21 = tokenQueue1.consumeTagName();
        boolean boolean22 = tokenQueue1.matchesWord();
        char char23 = tokenQueue1.peek();
        boolean boolean24 = tokenQueue1.matchesWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue26 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str28 = tokenQueue26.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue30 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str32 = tokenQueue30.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue34 = new org.jsoup.parser.TokenQueue("");
        char[] charArray41 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean42 = tokenQueue34.matchesAny(charArray41);
        boolean boolean43 = tokenQueue30.matchesAny(charArray41);
        org.jsoup.parser.TokenQueue tokenQueue45 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray48 = new java.lang.String[] { "", "" };
        boolean boolean49 = tokenQueue45.matchesAny(strArray48);
        boolean boolean50 = tokenQueue30.matchesAny(strArray48);
        java.lang.String str51 = tokenQueue26.consumeToAny(strArray48);
        java.lang.String str54 = tokenQueue26.chompBalanced('a', '4');
        org.jsoup.parser.TokenQueue tokenQueue56 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str58 = tokenQueue56.chompToIgnoreCase("hi!");
        boolean boolean59 = tokenQueue56.isEmpty();
        boolean boolean61 = tokenQueue56.matchesCS("hi!");
        org.jsoup.parser.TokenQueue tokenQueue63 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str65 = tokenQueue63.chompTo("");
        boolean boolean66 = tokenQueue63.matchesStartTag();
        boolean boolean68 = tokenQueue63.matches("");
        java.lang.String str69 = tokenQueue63.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue71 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str73 = tokenQueue71.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue75 = new org.jsoup.parser.TokenQueue("");
        char[] charArray82 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean83 = tokenQueue75.matchesAny(charArray82);
        boolean boolean84 = tokenQueue71.matchesAny(charArray82);
        org.jsoup.parser.TokenQueue tokenQueue86 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray89 = new java.lang.String[] { "", "" };
        boolean boolean90 = tokenQueue86.matchesAny(strArray89);
        boolean boolean91 = tokenQueue71.matchesAny(strArray89);
        boolean boolean92 = tokenQueue63.matchesAny(strArray89);
        java.lang.String str93 = tokenQueue56.consumeToAny(strArray89);
        boolean boolean94 = tokenQueue26.matchesAny(strArray89);
        boolean boolean95 = tokenQueue1.matchesAny(strArray89);
        boolean boolean97 = tokenQueue1.matchesCS("4");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(charArray82);
        org.junit.Assert.assertArrayEquals(charArray82, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertArrayEquals(strArray89, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str10 = tokenQueue1.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        boolean boolean16 = tokenQueue12.matchesAny(strArray15);
        boolean boolean17 = tokenQueue1.matchesAny(strArray15);
        boolean boolean18 = tokenQueue1.matchesWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue20 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str22 = tokenQueue20.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue24 = new org.jsoup.parser.TokenQueue("");
        char[] charArray31 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean32 = tokenQueue24.matchesAny(charArray31);
        boolean boolean33 = tokenQueue20.matchesAny(charArray31);
        boolean boolean34 = tokenQueue1.matchesAny(charArray31);
        tokenQueue1.addFirst("hi!");
        boolean boolean37 = tokenQueue1.matchesWhitespace();
        java.lang.String str38 = tokenQueue1.consumeAttributeKey();
        boolean boolean39 = tokenQueue1.matchesWord();
        boolean boolean40 = tokenQueue1.isEmpty();
        tokenQueue1.addFirst((java.lang.Character) 'h');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi" + "'", str38, "hi");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        boolean boolean4 = tokenQueue1.matchesStartTag();
        boolean boolean6 = tokenQueue1.matches("");
        java.lang.String str7 = tokenQueue1.consumeElementSelector();
        java.lang.String str8 = tokenQueue1.toString();
        char char9 = tokenQueue1.peek();
        java.lang.String str10 = tokenQueue1.consumeCssIdentifier();
        boolean boolean12 = tokenQueue1.matches("hi!");
        java.lang.String str14 = tokenQueue1.consumeToIgnoreCase("hih");
        tokenQueue1.advance();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        boolean boolean6 = tokenQueue1.matchesCS("hi!");
        java.lang.String str7 = tokenQueue1.consumeWord();
        char char8 = tokenQueue1.peek();
        boolean boolean9 = tokenQueue1.matchesWhitespace();
        java.lang.String str11 = tokenQueue1.chompTo("44");
        java.lang.String str12 = tokenQueue1.consumeWord();
        boolean boolean14 = tokenQueue1.matches("!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        char[] charArray8 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean9 = tokenQueue1.matchesAny(charArray8);
        java.lang.String str11 = tokenQueue1.chompToIgnoreCase("hi!");
        java.lang.String str12 = tokenQueue1.consumeWord();
        char char13 = tokenQueue1.peek();
        java.lang.String str15 = tokenQueue1.chompTo("#");
        // The following exception was thrown during execution in test generation
        try {
            char char16 = tokenQueue1.consume();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str11 = tokenQueue1.chompTo("");
        java.lang.String str12 = tokenQueue1.consumeTagName();
        boolean boolean13 = tokenQueue1.matchesWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue15 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str17 = tokenQueue15.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue19 = new org.jsoup.parser.TokenQueue("");
        char[] charArray26 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean27 = tokenQueue19.matchesAny(charArray26);
        boolean boolean28 = tokenQueue15.matchesAny(charArray26);
        org.jsoup.parser.TokenQueue tokenQueue30 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray33 = new java.lang.String[] { "", "" };
        boolean boolean34 = tokenQueue30.matchesAny(strArray33);
        boolean boolean35 = tokenQueue15.matchesAny(strArray33);
        boolean boolean36 = tokenQueue1.matchesAny(strArray33);
        char char37 = tokenQueue1.peek();
        java.lang.Class<?> wildcardClass38 = tokenQueue1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + char37 + "' != '" + '\000' + "'", char37 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        char[] charArray8 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean9 = tokenQueue1.matchesAny(charArray8);
        java.lang.String str10 = tokenQueue1.consumeCssIdentifier();
        java.lang.String str11 = tokenQueue1.consumeAttributeKey();
        java.lang.String str13 = tokenQueue1.chompTo("4");
        boolean boolean14 = tokenQueue1.matchesStartTag();
        boolean boolean15 = tokenQueue1.matchesWhitespace();
        java.lang.String str18 = tokenQueue1.chompBalanced('!', '4');
        java.lang.String str20 = tokenQueue1.consumeToIgnoreCase(" ");
        java.lang.String str23 = tokenQueue1.chompBalanced('a', '!');
        boolean boolean24 = tokenQueue1.consumeWhitespace();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("4");
        java.lang.String str2 = tokenQueue1.consumeWord();
        java.lang.String str3 = tokenQueue1.consumeWord();
        boolean boolean4 = tokenQueue1.matchesStartTag();
        java.lang.String str6 = tokenQueue1.chompToIgnoreCase("i");
        boolean boolean7 = tokenQueue1.matchesStartTag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        char[] charArray8 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean9 = tokenQueue1.matchesAny(charArray8);
        java.lang.String str10 = tokenQueue1.remainder();
        java.lang.String str11 = tokenQueue1.toString();
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str15 = tokenQueue13.chompTo("");
        boolean boolean16 = tokenQueue13.matchesStartTag();
        boolean boolean18 = tokenQueue13.matches("");
        java.lang.String str19 = tokenQueue13.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue21 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str23 = tokenQueue21.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue25 = new org.jsoup.parser.TokenQueue("");
        char[] charArray32 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean33 = tokenQueue25.matchesAny(charArray32);
        boolean boolean34 = tokenQueue21.matchesAny(charArray32);
        org.jsoup.parser.TokenQueue tokenQueue36 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray39 = new java.lang.String[] { "", "" };
        boolean boolean40 = tokenQueue36.matchesAny(strArray39);
        boolean boolean41 = tokenQueue21.matchesAny(strArray39);
        boolean boolean42 = tokenQueue13.matchesAny(strArray39);
        boolean boolean43 = tokenQueue1.matchesAny(strArray39);
        java.lang.String str44 = tokenQueue1.consumeWord();
        tokenQueue1.addFirst("");
        java.lang.String str47 = tokenQueue1.consumeAttributeKey();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        org.jsoup.parser.TokenQueue tokenQueue9 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str11 = tokenQueue9.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        char[] charArray20 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean21 = tokenQueue13.matchesAny(charArray20);
        boolean boolean22 = tokenQueue9.matchesAny(charArray20);
        boolean boolean23 = tokenQueue1.matchesAny(charArray20);
        boolean boolean25 = tokenQueue1.matches("");
        java.lang.String str26 = tokenQueue1.consumeCssIdentifier();
        org.jsoup.parser.TokenQueue tokenQueue28 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str30 = tokenQueue28.chompTo("");
        boolean boolean31 = tokenQueue28.matchesStartTag();
        tokenQueue28.addFirst("");
        org.jsoup.parser.TokenQueue tokenQueue35 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str37 = tokenQueue35.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue39 = new org.jsoup.parser.TokenQueue("");
        char[] charArray46 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean47 = tokenQueue39.matchesAny(charArray46);
        boolean boolean48 = tokenQueue35.matchesAny(charArray46);
        org.jsoup.parser.TokenQueue tokenQueue50 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray53 = new java.lang.String[] { "", "" };
        boolean boolean54 = tokenQueue50.matchesAny(strArray53);
        boolean boolean55 = tokenQueue35.matchesAny(strArray53);
        boolean boolean56 = tokenQueue28.matchesAny(strArray53);
        boolean boolean57 = tokenQueue1.matchesAny(strArray53);
        java.lang.String str58 = tokenQueue1.consumeWord();
        tokenQueue1.addFirst((java.lang.Character) ' ');
        java.lang.String str63 = tokenQueue1.chompBalanced('4', '!');
        char char64 = tokenQueue1.peek();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + char64 + "' != '" + '\000' + "'", char64 == '\000');
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue5 = new org.jsoup.parser.TokenQueue("");
        char[] charArray12 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean13 = tokenQueue5.matchesAny(charArray12);
        boolean boolean14 = tokenQueue1.matchesAny(charArray12);
        org.jsoup.parser.TokenQueue tokenQueue16 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray19 = new java.lang.String[] { "", "" };
        boolean boolean20 = tokenQueue16.matchesAny(strArray19);
        boolean boolean21 = tokenQueue1.matchesAny(strArray19);
        tokenQueue1.consume("");
        boolean boolean24 = tokenQueue1.matchesStartTag();
        boolean boolean25 = tokenQueue1.isEmpty();
        java.lang.String str27 = tokenQueue1.chompToIgnoreCase("hi!");
        java.lang.String str29 = tokenQueue1.consumeToIgnoreCase("i!");
        char char30 = tokenQueue1.peek();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '\000' + "'", char30 == '\000');
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        boolean boolean6 = tokenQueue1.matches("");
        boolean boolean7 = tokenQueue1.isEmpty();
        java.lang.String str9 = tokenQueue1.chompTo("!");
        org.jsoup.parser.TokenQueue tokenQueue11 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str13 = tokenQueue11.chompTo("");
        boolean boolean14 = tokenQueue11.matchesStartTag();
        boolean boolean16 = tokenQueue11.matchChomp("hi!");
        char char17 = tokenQueue11.peek();
        boolean boolean18 = tokenQueue11.matchesWhitespace();
        boolean boolean19 = tokenQueue11.matchesWord();
        tokenQueue11.addFirst("");
        java.lang.String str23 = tokenQueue11.chompTo("i!");
        org.jsoup.parser.TokenQueue tokenQueue25 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str27 = tokenQueue25.chompTo("");
        java.lang.String str28 = tokenQueue25.consumeElementSelector();
        java.lang.String str31 = tokenQueue25.chompBalanced('a', '4');
        boolean boolean33 = tokenQueue25.matchesCS("");
        java.lang.String str34 = tokenQueue25.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue36 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str38 = tokenQueue36.chompToIgnoreCase("hi!");
        boolean boolean39 = tokenQueue36.isEmpty();
        boolean boolean41 = tokenQueue36.matchesCS("hi!");
        org.jsoup.parser.TokenQueue tokenQueue43 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str45 = tokenQueue43.chompTo("");
        boolean boolean46 = tokenQueue43.matchesStartTag();
        tokenQueue43.addFirst("");
        org.jsoup.parser.TokenQueue tokenQueue50 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str52 = tokenQueue50.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue54 = new org.jsoup.parser.TokenQueue("");
        char[] charArray61 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean62 = tokenQueue54.matchesAny(charArray61);
        boolean boolean63 = tokenQueue50.matchesAny(charArray61);
        org.jsoup.parser.TokenQueue tokenQueue65 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray68 = new java.lang.String[] { "", "" };
        boolean boolean69 = tokenQueue65.matchesAny(strArray68);
        boolean boolean70 = tokenQueue50.matchesAny(strArray68);
        boolean boolean71 = tokenQueue43.matchesAny(strArray68);
        java.lang.String str72 = tokenQueue36.consumeToAny(strArray68);
        boolean boolean74 = tokenQueue36.matchChomp("hi!");
        org.jsoup.parser.TokenQueue tokenQueue76 = new org.jsoup.parser.TokenQueue("");
        org.jsoup.parser.TokenQueue tokenQueue78 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str80 = tokenQueue78.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue82 = new org.jsoup.parser.TokenQueue("");
        char[] charArray89 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean90 = tokenQueue82.matchesAny(charArray89);
        boolean boolean91 = tokenQueue78.matchesAny(charArray89);
        boolean boolean92 = tokenQueue76.matchesAny(charArray89);
        boolean boolean93 = tokenQueue36.matchesAny(charArray89);
        boolean boolean94 = tokenQueue25.matchesAny(charArray89);
        boolean boolean95 = tokenQueue11.matchesAny(charArray89);
        boolean boolean96 = tokenQueue1.matchesAny(charArray89);
        boolean boolean98 = tokenQueue1.matchesCS("44");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertArrayEquals(charArray61, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(charArray89);
        org.junit.Assert.assertArrayEquals(charArray89, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        char[] charArray8 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean9 = tokenQueue1.matchesAny(charArray8);
        java.lang.String str11 = tokenQueue1.chompToIgnoreCase("hi!");
        tokenQueue1.advance();
        boolean boolean13 = tokenQueue1.isEmpty();
        boolean boolean14 = tokenQueue1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            tokenQueue1.consume("4");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Queue did not match expected sequence");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("hi!");
        java.lang.String str2 = tokenQueue1.remainder();
        boolean boolean3 = tokenQueue1.matchesStartTag();
        boolean boolean5 = tokenQueue1.matches("i");
        java.lang.String str7 = tokenQueue1.consumeToIgnoreCase(" !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.consumeTo("hi!");
        java.lang.String str4 = tokenQueue1.consumeWord();
        boolean boolean5 = tokenQueue1.isEmpty();
        org.jsoup.parser.TokenQueue tokenQueue7 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        boolean boolean11 = tokenQueue7.matchesAny(strArray10);
        java.lang.String str12 = tokenQueue7.remainder();
        boolean boolean13 = tokenQueue7.consumeWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue15 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        boolean boolean19 = tokenQueue15.matchesAny(strArray18);
        java.lang.String str20 = tokenQueue15.consumeTagName();
        org.jsoup.parser.TokenQueue tokenQueue22 = new org.jsoup.parser.TokenQueue("");
        char[] charArray29 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean30 = tokenQueue22.matchesAny(charArray29);
        boolean boolean31 = tokenQueue15.matchesAny(charArray29);
        boolean boolean32 = tokenQueue7.matchesAny(charArray29);
        boolean boolean33 = tokenQueue1.matchesAny(charArray29);
        boolean boolean34 = tokenQueue1.isEmpty();
        tokenQueue1.advance();
        java.lang.String str37 = tokenQueue1.consumeTo("hi");
        java.lang.String str40 = tokenQueue1.chompBalanced('#', '\000');
        char[] charArray41 = null;
        boolean boolean42 = tokenQueue1.matchesAny(charArray41);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        org.jsoup.parser.TokenQueue tokenQueue9 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str11 = tokenQueue9.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        char[] charArray20 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean21 = tokenQueue13.matchesAny(charArray20);
        boolean boolean22 = tokenQueue9.matchesAny(charArray20);
        boolean boolean23 = tokenQueue1.matchesAny(charArray20);
        boolean boolean25 = tokenQueue1.matches("");
        java.lang.String str26 = tokenQueue1.consumeCssIdentifier();
        org.jsoup.parser.TokenQueue tokenQueue28 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str30 = tokenQueue28.chompTo("");
        boolean boolean31 = tokenQueue28.matchesStartTag();
        tokenQueue28.addFirst("");
        org.jsoup.parser.TokenQueue tokenQueue35 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str37 = tokenQueue35.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue39 = new org.jsoup.parser.TokenQueue("");
        char[] charArray46 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean47 = tokenQueue39.matchesAny(charArray46);
        boolean boolean48 = tokenQueue35.matchesAny(charArray46);
        org.jsoup.parser.TokenQueue tokenQueue50 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray53 = new java.lang.String[] { "", "" };
        boolean boolean54 = tokenQueue50.matchesAny(strArray53);
        boolean boolean55 = tokenQueue35.matchesAny(strArray53);
        boolean boolean56 = tokenQueue28.matchesAny(strArray53);
        boolean boolean57 = tokenQueue1.matchesAny(strArray53);
        java.lang.String str58 = tokenQueue1.consumeWord();
        boolean boolean59 = tokenQueue1.consumeWhitespace();
        boolean boolean60 = tokenQueue1.matchesStartTag();
        java.lang.String str62 = tokenQueue1.chompToIgnoreCase("44");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompToIgnoreCase("hi!");
        boolean boolean4 = tokenQueue1.isEmpty();
        boolean boolean6 = tokenQueue1.matchesCS("hi!");
        org.jsoup.parser.TokenQueue tokenQueue8 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str10 = tokenQueue8.chompTo("");
        boolean boolean11 = tokenQueue8.matchesStartTag();
        tokenQueue8.addFirst("");
        org.jsoup.parser.TokenQueue tokenQueue15 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str17 = tokenQueue15.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue19 = new org.jsoup.parser.TokenQueue("");
        char[] charArray26 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean27 = tokenQueue19.matchesAny(charArray26);
        boolean boolean28 = tokenQueue15.matchesAny(charArray26);
        org.jsoup.parser.TokenQueue tokenQueue30 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray33 = new java.lang.String[] { "", "" };
        boolean boolean34 = tokenQueue30.matchesAny(strArray33);
        boolean boolean35 = tokenQueue15.matchesAny(strArray33);
        boolean boolean36 = tokenQueue8.matchesAny(strArray33);
        java.lang.String str37 = tokenQueue1.consumeToAny(strArray33);
        boolean boolean39 = tokenQueue1.matchChomp("hi!");
        boolean boolean40 = tokenQueue1.matchesWord();
        org.jsoup.parser.TokenQueue tokenQueue42 = new org.jsoup.parser.TokenQueue("");
        boolean boolean43 = tokenQueue42.matchesWord();
        char[] charArray45 = new char[] { ' ' };
        boolean boolean46 = tokenQueue42.matchesAny(charArray45);
        boolean boolean47 = tokenQueue42.matchesStartTag();
        org.jsoup.parser.TokenQueue tokenQueue49 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str51 = tokenQueue49.chompTo("");
        java.lang.String str52 = tokenQueue49.consumeElementSelector();
        java.lang.String str55 = tokenQueue49.chompBalanced('a', '4');
        boolean boolean57 = tokenQueue49.matchesCS("");
        java.lang.String str59 = tokenQueue49.chompTo("");
        java.lang.String str60 = tokenQueue49.consumeTagName();
        boolean boolean61 = tokenQueue49.matchesWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue63 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str65 = tokenQueue63.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue67 = new org.jsoup.parser.TokenQueue("");
        char[] charArray74 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean75 = tokenQueue67.matchesAny(charArray74);
        boolean boolean76 = tokenQueue63.matchesAny(charArray74);
        org.jsoup.parser.TokenQueue tokenQueue78 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray81 = new java.lang.String[] { "", "" };
        boolean boolean82 = tokenQueue78.matchesAny(strArray81);
        boolean boolean83 = tokenQueue63.matchesAny(strArray81);
        boolean boolean84 = tokenQueue49.matchesAny(strArray81);
        boolean boolean85 = tokenQueue42.matchesAny(strArray81);
        boolean boolean86 = tokenQueue1.matchesAny(strArray81);
        java.lang.String str88 = tokenQueue1.chompTo("hi");
        java.lang.String str89 = tokenQueue1.consumeCssIdentifier();
        boolean boolean90 = tokenQueue1.matchesWhitespace();
        java.lang.String str91 = tokenQueue1.consumeElementSelector();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(charArray74);
        org.junit.Assert.assertArrayEquals(charArray74, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.consumeTo("hi!");
        java.lang.String str4 = tokenQueue1.consumeWord();
        boolean boolean5 = tokenQueue1.isEmpty();
        org.jsoup.parser.TokenQueue tokenQueue7 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        boolean boolean11 = tokenQueue7.matchesAny(strArray10);
        java.lang.String str12 = tokenQueue7.remainder();
        boolean boolean13 = tokenQueue7.consumeWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue15 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        boolean boolean19 = tokenQueue15.matchesAny(strArray18);
        java.lang.String str20 = tokenQueue15.consumeTagName();
        org.jsoup.parser.TokenQueue tokenQueue22 = new org.jsoup.parser.TokenQueue("");
        char[] charArray29 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean30 = tokenQueue22.matchesAny(charArray29);
        boolean boolean31 = tokenQueue15.matchesAny(charArray29);
        boolean boolean32 = tokenQueue7.matchesAny(charArray29);
        boolean boolean33 = tokenQueue1.matchesAny(charArray29);
        boolean boolean34 = tokenQueue1.isEmpty();
        tokenQueue1.advance();
        java.lang.String str36 = tokenQueue1.consumeAttributeKey();
        java.lang.String str37 = tokenQueue1.consumeWord();
        tokenQueue1.addFirst((java.lang.Character) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        boolean boolean2 = tokenQueue1.matchesWord();
        tokenQueue1.consume("");
        java.lang.String str5 = tokenQueue1.consumeAttributeKey();
        boolean boolean6 = tokenQueue1.matchesWord();
        boolean boolean7 = tokenQueue1.matchesWhitespace();
        java.lang.String str9 = tokenQueue1.consumeToIgnoreCase("hi");
        tokenQueue1.addFirst((java.lang.Character) '!');
        java.lang.String str13 = tokenQueue1.chompTo("#");
        tokenQueue1.addFirst((java.lang.Character) '\000');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "!" + "'", str13, "!");
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.consumeTo("hi!");
        java.lang.String str4 = tokenQueue1.consumeWord();
        boolean boolean5 = tokenQueue1.isEmpty();
        org.jsoup.parser.TokenQueue tokenQueue7 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        boolean boolean11 = tokenQueue7.matchesAny(strArray10);
        java.lang.String str12 = tokenQueue7.remainder();
        boolean boolean13 = tokenQueue7.consumeWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue15 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        boolean boolean19 = tokenQueue15.matchesAny(strArray18);
        java.lang.String str20 = tokenQueue15.consumeTagName();
        org.jsoup.parser.TokenQueue tokenQueue22 = new org.jsoup.parser.TokenQueue("");
        char[] charArray29 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean30 = tokenQueue22.matchesAny(charArray29);
        boolean boolean31 = tokenQueue15.matchesAny(charArray29);
        boolean boolean32 = tokenQueue7.matchesAny(charArray29);
        boolean boolean33 = tokenQueue1.matchesAny(charArray29);
        boolean boolean34 = tokenQueue1.isEmpty();
        tokenQueue1.advance();
        java.lang.String str36 = tokenQueue1.consumeAttributeKey();
        java.lang.String str37 = tokenQueue1.consumeAttributeKey();
        java.lang.String str38 = tokenQueue1.consumeTagName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompToIgnoreCase("hi!");
        boolean boolean4 = tokenQueue1.isEmpty();
        boolean boolean6 = tokenQueue1.matchesCS("hi!");
        org.jsoup.parser.TokenQueue tokenQueue8 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str10 = tokenQueue8.chompTo("");
        boolean boolean11 = tokenQueue8.matchesStartTag();
        tokenQueue8.addFirst("");
        org.jsoup.parser.TokenQueue tokenQueue15 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str17 = tokenQueue15.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue19 = new org.jsoup.parser.TokenQueue("");
        char[] charArray26 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean27 = tokenQueue19.matchesAny(charArray26);
        boolean boolean28 = tokenQueue15.matchesAny(charArray26);
        org.jsoup.parser.TokenQueue tokenQueue30 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray33 = new java.lang.String[] { "", "" };
        boolean boolean34 = tokenQueue30.matchesAny(strArray33);
        boolean boolean35 = tokenQueue15.matchesAny(strArray33);
        boolean boolean36 = tokenQueue8.matchesAny(strArray33);
        java.lang.String str37 = tokenQueue1.consumeToAny(strArray33);
        boolean boolean39 = tokenQueue1.matchChomp("hi!");
        boolean boolean40 = tokenQueue1.matchesWord();
        org.jsoup.parser.TokenQueue tokenQueue42 = new org.jsoup.parser.TokenQueue("");
        boolean boolean43 = tokenQueue42.matchesWord();
        char[] charArray45 = new char[] { ' ' };
        boolean boolean46 = tokenQueue42.matchesAny(charArray45);
        boolean boolean47 = tokenQueue42.matchesStartTag();
        org.jsoup.parser.TokenQueue tokenQueue49 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str51 = tokenQueue49.chompTo("");
        java.lang.String str52 = tokenQueue49.consumeElementSelector();
        java.lang.String str55 = tokenQueue49.chompBalanced('a', '4');
        boolean boolean57 = tokenQueue49.matchesCS("");
        java.lang.String str59 = tokenQueue49.chompTo("");
        java.lang.String str60 = tokenQueue49.consumeTagName();
        boolean boolean61 = tokenQueue49.matchesWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue63 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str65 = tokenQueue63.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue67 = new org.jsoup.parser.TokenQueue("");
        char[] charArray74 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean75 = tokenQueue67.matchesAny(charArray74);
        boolean boolean76 = tokenQueue63.matchesAny(charArray74);
        org.jsoup.parser.TokenQueue tokenQueue78 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray81 = new java.lang.String[] { "", "" };
        boolean boolean82 = tokenQueue78.matchesAny(strArray81);
        boolean boolean83 = tokenQueue63.matchesAny(strArray81);
        boolean boolean84 = tokenQueue49.matchesAny(strArray81);
        boolean boolean85 = tokenQueue42.matchesAny(strArray81);
        boolean boolean86 = tokenQueue1.matchesAny(strArray81);
        boolean boolean87 = tokenQueue1.matchesWord();
        java.lang.String str88 = tokenQueue1.consumeWord();
        tokenQueue1.addFirst("44");
        java.lang.String str91 = tokenQueue1.consumeElementSelector();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(charArray74);
        org.junit.Assert.assertArrayEquals(charArray74, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "44" + "'", str91, "44");
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean8 = tokenQueue1.matchesWhitespace();
        boolean boolean10 = tokenQueue1.matches("");
        boolean boolean12 = tokenQueue1.matchesCS("");
        java.lang.String str13 = tokenQueue1.consumeTagName();
        java.lang.String str14 = tokenQueue1.consumeElementSelector();
        char char15 = tokenQueue1.peek();
        org.jsoup.parser.TokenQueue tokenQueue17 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str20 = tokenQueue17.chompBalanced(' ', 'a');
        java.lang.String str21 = tokenQueue17.consumeCssIdentifier();
        boolean boolean22 = tokenQueue17.matchesWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue24 = new org.jsoup.parser.TokenQueue("");
        char[] charArray31 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean32 = tokenQueue24.matchesAny(charArray31);
        boolean boolean33 = tokenQueue24.matchesWord();
        java.lang.String str35 = tokenQueue24.consumeToIgnoreCase("hi!");
        tokenQueue24.addFirst("");
        tokenQueue24.consume("");
        java.lang.String str40 = tokenQueue24.consumeWord();
        org.jsoup.parser.TokenQueue tokenQueue42 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str44 = tokenQueue42.chompToIgnoreCase("hi!");
        boolean boolean45 = tokenQueue42.isEmpty();
        boolean boolean47 = tokenQueue42.matchesCS("hi!");
        org.jsoup.parser.TokenQueue tokenQueue49 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str51 = tokenQueue49.chompTo("");
        boolean boolean52 = tokenQueue49.matchesStartTag();
        tokenQueue49.addFirst("");
        org.jsoup.parser.TokenQueue tokenQueue56 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str58 = tokenQueue56.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue60 = new org.jsoup.parser.TokenQueue("");
        char[] charArray67 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean68 = tokenQueue60.matchesAny(charArray67);
        boolean boolean69 = tokenQueue56.matchesAny(charArray67);
        org.jsoup.parser.TokenQueue tokenQueue71 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray74 = new java.lang.String[] { "", "" };
        boolean boolean75 = tokenQueue71.matchesAny(strArray74);
        boolean boolean76 = tokenQueue56.matchesAny(strArray74);
        boolean boolean77 = tokenQueue49.matchesAny(strArray74);
        java.lang.String str78 = tokenQueue42.consumeToAny(strArray74);
        boolean boolean79 = tokenQueue24.matchesAny(strArray74);
        java.lang.String str80 = tokenQueue17.consumeToAny(strArray74);
        boolean boolean81 = tokenQueue1.matchesAny(strArray74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertArrayEquals(charArray67, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        java.lang.String str6 = tokenQueue1.remainder();
        boolean boolean7 = tokenQueue1.consumeWhitespace();
        boolean boolean8 = tokenQueue1.matchesWhitespace();
        java.lang.String str9 = tokenQueue1.toString();
        boolean boolean11 = tokenQueue1.matchesCS(" ");
        java.lang.String str12 = tokenQueue1.consumeTagName();
        boolean boolean13 = tokenQueue1.isEmpty();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        boolean boolean4 = tokenQueue1.matchesStartTag();
        boolean boolean6 = tokenQueue1.matchChomp("hi!");
        char char7 = tokenQueue1.peek();
        boolean boolean8 = tokenQueue1.matchesWhitespace();
        boolean boolean9 = tokenQueue1.matchesWord();
        tokenQueue1.addFirst("");
        boolean boolean12 = tokenQueue1.matchesStartTag();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str10 = tokenQueue1.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        boolean boolean16 = tokenQueue12.matchesAny(strArray15);
        boolean boolean17 = tokenQueue1.matchesAny(strArray15);
        boolean boolean18 = tokenQueue1.matchesWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue20 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str22 = tokenQueue20.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue24 = new org.jsoup.parser.TokenQueue("");
        char[] charArray31 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean32 = tokenQueue24.matchesAny(charArray31);
        boolean boolean33 = tokenQueue20.matchesAny(charArray31);
        boolean boolean34 = tokenQueue1.matchesAny(charArray31);
        java.lang.String str36 = tokenQueue1.chompTo("");
        java.lang.String str37 = tokenQueue1.consumeWord();
        boolean boolean38 = tokenQueue1.matchesStartTag();
        java.lang.String str40 = tokenQueue1.chompTo("i");
        tokenQueue1.addFirst((java.lang.Character) 'a');
        java.lang.String str44 = tokenQueue1.chompTo("#");
        // The following exception was thrown during execution in test generation
        try {
            tokenQueue1.consume("a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Queue did not match expected sequence");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "a" + "'", str44, "a");
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        boolean boolean4 = tokenQueue1.matchesStartTag();
        boolean boolean6 = tokenQueue1.matches("");
        java.lang.String str7 = tokenQueue1.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue9 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str11 = tokenQueue9.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        char[] charArray20 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean21 = tokenQueue13.matchesAny(charArray20);
        boolean boolean22 = tokenQueue9.matchesAny(charArray20);
        org.jsoup.parser.TokenQueue tokenQueue24 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        boolean boolean28 = tokenQueue24.matchesAny(strArray27);
        boolean boolean29 = tokenQueue9.matchesAny(strArray27);
        boolean boolean30 = tokenQueue1.matchesAny(strArray27);
        java.lang.String str31 = tokenQueue1.consumeAttributeKey();
        java.lang.String str33 = tokenQueue1.consumeTo(" !");
        java.lang.String str34 = tokenQueue1.consumeWord();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        boolean boolean4 = tokenQueue1.matchesStartTag();
        tokenQueue1.advance();
        boolean boolean6 = tokenQueue1.isEmpty();
        tokenQueue1.addFirst((java.lang.Character) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.consumeTo("hi!");
        boolean boolean5 = tokenQueue1.matchesCS("");
        java.lang.String str6 = tokenQueue1.remainder();
        boolean boolean7 = tokenQueue1.matchesWhitespace();
        java.lang.String str8 = tokenQueue1.consumeElementSelector();
        java.lang.Class<?> wildcardClass9 = tokenQueue1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompToIgnoreCase("hi!");
        boolean boolean4 = tokenQueue1.isEmpty();
        boolean boolean6 = tokenQueue1.matchesCS("hi!");
        org.jsoup.parser.TokenQueue tokenQueue8 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str10 = tokenQueue8.chompTo("");
        boolean boolean11 = tokenQueue8.matchesStartTag();
        tokenQueue8.addFirst("");
        org.jsoup.parser.TokenQueue tokenQueue15 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str17 = tokenQueue15.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue19 = new org.jsoup.parser.TokenQueue("");
        char[] charArray26 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean27 = tokenQueue19.matchesAny(charArray26);
        boolean boolean28 = tokenQueue15.matchesAny(charArray26);
        org.jsoup.parser.TokenQueue tokenQueue30 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray33 = new java.lang.String[] { "", "" };
        boolean boolean34 = tokenQueue30.matchesAny(strArray33);
        boolean boolean35 = tokenQueue15.matchesAny(strArray33);
        boolean boolean36 = tokenQueue8.matchesAny(strArray33);
        java.lang.String str37 = tokenQueue1.consumeToAny(strArray33);
        boolean boolean39 = tokenQueue1.matchesCS("4");
        java.lang.String str41 = tokenQueue1.chompTo("");
        boolean boolean43 = tokenQueue1.matchesCS("hih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        boolean boolean4 = tokenQueue1.matchesStartTag();
        boolean boolean6 = tokenQueue1.matches("");
        java.lang.String str7 = tokenQueue1.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue9 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str11 = tokenQueue9.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        char[] charArray20 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean21 = tokenQueue13.matchesAny(charArray20);
        boolean boolean22 = tokenQueue9.matchesAny(charArray20);
        org.jsoup.parser.TokenQueue tokenQueue24 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        boolean boolean28 = tokenQueue24.matchesAny(strArray27);
        boolean boolean29 = tokenQueue9.matchesAny(strArray27);
        boolean boolean30 = tokenQueue1.matchesAny(strArray27);
        boolean boolean31 = tokenQueue1.consumeWhitespace();
        boolean boolean33 = tokenQueue1.matchesCS("");
        boolean boolean35 = tokenQueue1.matchChomp("#");
        tokenQueue1.addFirst((java.lang.Character) '4');
        org.jsoup.parser.TokenQueue tokenQueue39 = new org.jsoup.parser.TokenQueue("");
        char[] charArray46 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean47 = tokenQueue39.matchesAny(charArray46);
        java.lang.String str48 = tokenQueue39.remainder();
        org.jsoup.parser.TokenQueue tokenQueue50 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray53 = new java.lang.String[] { "", "" };
        boolean boolean54 = tokenQueue50.matchesAny(strArray53);
        java.lang.String str55 = tokenQueue39.consumeToAny(strArray53);
        java.lang.String str56 = tokenQueue1.consumeToAny(strArray53);
        tokenQueue1.addFirst("44");
        java.lang.String str60 = tokenQueue1.chompTo("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        java.lang.String str6 = tokenQueue1.remainder();
        boolean boolean7 = tokenQueue1.consumeWhitespace();
        tokenQueue1.advance();
        java.lang.String str9 = tokenQueue1.consumeElementSelector();
        tokenQueue1.addFirst(" !");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue5 = new org.jsoup.parser.TokenQueue("");
        char[] charArray12 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean13 = tokenQueue5.matchesAny(charArray12);
        boolean boolean14 = tokenQueue1.matchesAny(charArray12);
        boolean boolean15 = tokenQueue1.matchesWord();
        java.lang.String str16 = tokenQueue1.consumeWord();
        java.lang.String str19 = tokenQueue1.chompBalanced(' ', '#');
        boolean boolean21 = tokenQueue1.matches("4");
        java.lang.String str22 = tokenQueue1.toString();
        org.jsoup.parser.TokenQueue tokenQueue24 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str26 = tokenQueue24.chompTo("");
        java.lang.String str27 = tokenQueue24.consumeElementSelector();
        java.lang.String str30 = tokenQueue24.chompBalanced('a', '4');
        boolean boolean31 = tokenQueue24.matchesWhitespace();
        java.lang.String str32 = tokenQueue24.toString();
        boolean boolean34 = tokenQueue24.matchChomp("hi!");
        org.jsoup.parser.TokenQueue tokenQueue36 = new org.jsoup.parser.TokenQueue("");
        char[] charArray43 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean44 = tokenQueue36.matchesAny(charArray43);
        java.lang.String str46 = tokenQueue36.chompToIgnoreCase("hi!");
        tokenQueue36.advance();
        boolean boolean48 = tokenQueue36.isEmpty();
        org.jsoup.parser.TokenQueue tokenQueue50 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str52 = tokenQueue50.chompTo("");
        java.lang.String str53 = tokenQueue50.consumeElementSelector();
        java.lang.String str56 = tokenQueue50.chompBalanced('a', '4');
        boolean boolean58 = tokenQueue50.matchesCS("");
        java.lang.String str60 = tokenQueue50.chompTo("");
        java.lang.String str61 = tokenQueue50.consumeTagName();
        boolean boolean62 = tokenQueue50.matchesWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue64 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str66 = tokenQueue64.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue68 = new org.jsoup.parser.TokenQueue("");
        char[] charArray75 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean76 = tokenQueue68.matchesAny(charArray75);
        boolean boolean77 = tokenQueue64.matchesAny(charArray75);
        org.jsoup.parser.TokenQueue tokenQueue79 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray82 = new java.lang.String[] { "", "" };
        boolean boolean83 = tokenQueue79.matchesAny(strArray82);
        boolean boolean84 = tokenQueue64.matchesAny(strArray82);
        boolean boolean85 = tokenQueue50.matchesAny(strArray82);
        boolean boolean86 = tokenQueue36.matchesAny(strArray82);
        java.lang.String str87 = tokenQueue24.consumeToAny(strArray82);
        java.lang.String str88 = tokenQueue1.consumeToAny(strArray82);
        boolean boolean89 = tokenQueue1.matchesWord();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertArrayEquals(charArray75, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue5 = new org.jsoup.parser.TokenQueue("");
        char[] charArray12 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean13 = tokenQueue5.matchesAny(charArray12);
        boolean boolean14 = tokenQueue1.matchesAny(charArray12);
        boolean boolean15 = tokenQueue1.matchesWord();
        java.lang.String str16 = tokenQueue1.consumeWord();
        boolean boolean17 = tokenQueue1.consumeWhitespace();
        java.lang.String str18 = tokenQueue1.toString();
        boolean boolean19 = tokenQueue1.matchesWhitespace();
        java.lang.String str21 = tokenQueue1.consumeTo("i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        char[] charArray8 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean9 = tokenQueue1.matchesAny(charArray8);
        boolean boolean10 = tokenQueue1.matchesWord();
        java.lang.String str12 = tokenQueue1.consumeToIgnoreCase("hi!");
        tokenQueue1.addFirst("");
        tokenQueue1.consume("");
        boolean boolean17 = tokenQueue1.isEmpty();
        boolean boolean19 = tokenQueue1.matches("hi!");
        java.lang.String str21 = tokenQueue1.consumeTo("4a");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        java.lang.String str8 = tokenQueue1.remainder();
        boolean boolean10 = tokenQueue1.matchChomp("");
        java.lang.String str12 = tokenQueue1.chompToIgnoreCase("4");
        boolean boolean13 = tokenQueue1.consumeWhitespace();
        boolean boolean14 = tokenQueue1.matchesWord();
        boolean boolean15 = tokenQueue1.matchesWord();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        boolean boolean2 = tokenQueue1.matchesWord();
        tokenQueue1.consume("");
        java.lang.String str5 = tokenQueue1.consumeAttributeKey();
        org.jsoup.parser.TokenQueue tokenQueue7 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str9 = tokenQueue7.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue11 = new org.jsoup.parser.TokenQueue("");
        char[] charArray18 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean19 = tokenQueue11.matchesAny(charArray18);
        boolean boolean20 = tokenQueue7.matchesAny(charArray18);
        org.jsoup.parser.TokenQueue tokenQueue22 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        boolean boolean26 = tokenQueue22.matchesAny(strArray25);
        boolean boolean27 = tokenQueue7.matchesAny(strArray25);
        java.lang.String str28 = tokenQueue1.consumeToAny(strArray25);
        boolean boolean29 = tokenQueue1.isEmpty();
        char char30 = tokenQueue1.peek();
        boolean boolean31 = tokenQueue1.consumeWhitespace();
        java.lang.String str33 = tokenQueue1.consumeToIgnoreCase(" ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '\000' + "'", char30 == '\000');
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        java.lang.String str6 = tokenQueue1.remainder();
        boolean boolean7 = tokenQueue1.consumeWhitespace();
        boolean boolean8 = tokenQueue1.matchesWhitespace();
        boolean boolean9 = tokenQueue1.isEmpty();
        tokenQueue1.addFirst((java.lang.Character) '4');
        java.lang.String str12 = tokenQueue1.consumeCssIdentifier();
        java.lang.String str13 = tokenQueue1.remainder();
        org.jsoup.parser.TokenQueue tokenQueue15 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str17 = tokenQueue15.chompTo("");
        java.lang.String str18 = tokenQueue15.consumeElementSelector();
        java.lang.String str21 = tokenQueue15.chompBalanced('a', '4');
        org.jsoup.parser.TokenQueue tokenQueue23 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str25 = tokenQueue23.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue27 = new org.jsoup.parser.TokenQueue("");
        char[] charArray34 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean35 = tokenQueue27.matchesAny(charArray34);
        boolean boolean36 = tokenQueue23.matchesAny(charArray34);
        boolean boolean37 = tokenQueue15.matchesAny(charArray34);
        org.jsoup.parser.TokenQueue tokenQueue39 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str41 = tokenQueue39.chompTo("");
        java.lang.String str42 = tokenQueue39.consumeElementSelector();
        java.lang.String str45 = tokenQueue39.chompBalanced('a', '4');
        boolean boolean47 = tokenQueue39.matchesCS("");
        java.lang.String str48 = tokenQueue39.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue50 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray53 = new java.lang.String[] { "", "" };
        boolean boolean54 = tokenQueue50.matchesAny(strArray53);
        boolean boolean55 = tokenQueue39.matchesAny(strArray53);
        boolean boolean56 = tokenQueue39.matchesWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue58 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str60 = tokenQueue58.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue62 = new org.jsoup.parser.TokenQueue("");
        char[] charArray69 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean70 = tokenQueue62.matchesAny(charArray69);
        boolean boolean71 = tokenQueue58.matchesAny(charArray69);
        boolean boolean72 = tokenQueue39.matchesAny(charArray69);
        boolean boolean73 = tokenQueue15.matchesAny(charArray69);
        boolean boolean74 = tokenQueue1.matchesAny(charArray69);
        java.lang.String str75 = tokenQueue1.toString();
        tokenQueue1.addFirst("");
        java.lang.String str78 = tokenQueue1.consumeElementSelector();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4" + "'", str12, "4");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertArrayEquals(charArray69, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        org.jsoup.parser.TokenQueue tokenQueue9 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str11 = tokenQueue9.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        char[] charArray20 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean21 = tokenQueue13.matchesAny(charArray20);
        boolean boolean22 = tokenQueue9.matchesAny(charArray20);
        boolean boolean23 = tokenQueue1.matchesAny(charArray20);
        tokenQueue1.addFirst((java.lang.Character) '#');
        java.lang.String str26 = tokenQueue1.remainder();
        java.lang.String str27 = tokenQueue1.remainder();
        java.lang.String str29 = tokenQueue1.consumeTo("#");
        tokenQueue1.addFirst("4");
        java.lang.String str32 = tokenQueue1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#" + "'", str26, "#");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "4" + "'", str32, "4");
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str10 = tokenQueue1.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        boolean boolean16 = tokenQueue12.matchesAny(strArray15);
        boolean boolean17 = tokenQueue1.matchesAny(strArray15);
        boolean boolean18 = tokenQueue1.matchesWhitespace();
        java.lang.String str20 = tokenQueue1.consumeTo("");
        org.jsoup.parser.TokenQueue tokenQueue22 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str24 = tokenQueue22.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue26 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str28 = tokenQueue26.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue30 = new org.jsoup.parser.TokenQueue("");
        char[] charArray37 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean38 = tokenQueue30.matchesAny(charArray37);
        boolean boolean39 = tokenQueue26.matchesAny(charArray37);
        org.jsoup.parser.TokenQueue tokenQueue41 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray44 = new java.lang.String[] { "", "" };
        boolean boolean45 = tokenQueue41.matchesAny(strArray44);
        boolean boolean46 = tokenQueue26.matchesAny(strArray44);
        java.lang.String str47 = tokenQueue22.consumeToAny(strArray44);
        boolean boolean48 = tokenQueue1.matchesAny(strArray44);
        java.lang.String str49 = tokenQueue1.consumeCssIdentifier();
        java.lang.String str51 = tokenQueue1.consumeTo("i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str2 = tokenQueue1.consumeCssIdentifier();
        java.lang.String str3 = tokenQueue1.remainder();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        char[] charArray8 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean9 = tokenQueue1.matchesAny(charArray8);
        java.lang.String str10 = tokenQueue1.remainder();
        java.lang.String str13 = tokenQueue1.chompBalanced(' ', 'a');
        boolean boolean14 = tokenQueue1.matchesStartTag();
        java.lang.String str16 = tokenQueue1.chompTo("");
        boolean boolean17 = tokenQueue1.matchesWord();
        boolean boolean18 = tokenQueue1.consumeWhitespace();
        java.lang.String str19 = tokenQueue1.consumeTagName();
        java.lang.String str22 = tokenQueue1.chompBalanced('h', ' ');
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str10 = tokenQueue1.consumeElementSelector();
        boolean boolean11 = tokenQueue1.matchesWord();
        java.lang.String str12 = tokenQueue1.consumeTagName();
        char char13 = tokenQueue1.peek();
        boolean boolean15 = tokenQueue1.matches("");
        java.lang.Class<?> wildcardClass16 = tokenQueue1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        char[] charArray8 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean9 = tokenQueue1.matchesAny(charArray8);
        java.lang.String str10 = tokenQueue1.remainder();
        java.lang.String str11 = tokenQueue1.toString();
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str15 = tokenQueue13.chompTo("");
        boolean boolean16 = tokenQueue13.matchesStartTag();
        boolean boolean18 = tokenQueue13.matches("");
        java.lang.String str19 = tokenQueue13.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue21 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str23 = tokenQueue21.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue25 = new org.jsoup.parser.TokenQueue("");
        char[] charArray32 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean33 = tokenQueue25.matchesAny(charArray32);
        boolean boolean34 = tokenQueue21.matchesAny(charArray32);
        org.jsoup.parser.TokenQueue tokenQueue36 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray39 = new java.lang.String[] { "", "" };
        boolean boolean40 = tokenQueue36.matchesAny(strArray39);
        boolean boolean41 = tokenQueue21.matchesAny(strArray39);
        boolean boolean42 = tokenQueue13.matchesAny(strArray39);
        boolean boolean43 = tokenQueue1.matchesAny(strArray39);
        java.lang.String str45 = tokenQueue1.consumeTo("hi!");
        boolean boolean46 = tokenQueue1.consumeWhitespace();
        java.lang.String str47 = tokenQueue1.consumeElementSelector();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        boolean boolean4 = tokenQueue1.matchesWord();
        boolean boolean5 = tokenQueue1.matchesWhitespace();
        boolean boolean7 = tokenQueue1.matchesCS("h");
        java.lang.String str9 = tokenQueue1.consumeTo(" !");
        tokenQueue1.addFirst((java.lang.Character) 'h');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.consumeTo("hi!");
        java.lang.String str4 = tokenQueue1.consumeWord();
        boolean boolean5 = tokenQueue1.matchesWord();
        java.lang.String str8 = tokenQueue1.chompBalanced(' ', ' ');
        org.jsoup.parser.TokenQueue tokenQueue10 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str12 = tokenQueue10.chompTo("");
        java.lang.String str13 = tokenQueue10.consumeElementSelector();
        java.lang.String str16 = tokenQueue10.chompBalanced('a', '4');
        boolean boolean17 = tokenQueue10.matchesWhitespace();
        java.lang.String str20 = tokenQueue10.chompBalanced('a', ' ');
        boolean boolean21 = tokenQueue10.matchesWord();
        boolean boolean23 = tokenQueue10.matchesCS("");
        boolean boolean24 = tokenQueue10.isEmpty();
        org.jsoup.parser.TokenQueue tokenQueue26 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str28 = tokenQueue26.chompTo("");
        java.lang.String str29 = tokenQueue26.consumeElementSelector();
        java.lang.String str32 = tokenQueue26.chompBalanced('a', '4');
        boolean boolean34 = tokenQueue26.matchesCS("");
        java.lang.String str36 = tokenQueue26.chompTo("");
        java.lang.String str37 = tokenQueue26.consumeTagName();
        boolean boolean38 = tokenQueue26.matchesWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue40 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str42 = tokenQueue40.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue44 = new org.jsoup.parser.TokenQueue("");
        char[] charArray51 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean52 = tokenQueue44.matchesAny(charArray51);
        boolean boolean53 = tokenQueue40.matchesAny(charArray51);
        org.jsoup.parser.TokenQueue tokenQueue55 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray58 = new java.lang.String[] { "", "" };
        boolean boolean59 = tokenQueue55.matchesAny(strArray58);
        boolean boolean60 = tokenQueue40.matchesAny(strArray58);
        boolean boolean61 = tokenQueue26.matchesAny(strArray58);
        java.lang.String str62 = tokenQueue10.consumeToAny(strArray58);
        java.lang.String str63 = tokenQueue1.consumeToAny(strArray58);
        java.lang.String str65 = tokenQueue1.chompTo("");
        char char66 = tokenQueue1.peek();
        java.lang.String str69 = tokenQueue1.chompBalanced(' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + char66 + "' != '" + '\000' + "'", char66 == '\000');
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        java.lang.String str6 = tokenQueue1.remainder();
        boolean boolean7 = tokenQueue1.consumeWhitespace();
        tokenQueue1.advance();
        java.lang.String str9 = tokenQueue1.toString();
        boolean boolean10 = tokenQueue1.matchesWord();
        boolean boolean12 = tokenQueue1.matchChomp(" ");
        java.lang.String str13 = tokenQueue1.consumeCssIdentifier();
        java.lang.String str14 = tokenQueue1.consumeWord();
        char char15 = tokenQueue1.peek();
        tokenQueue1.addFirst("");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue5 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str7 = tokenQueue5.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue9 = new org.jsoup.parser.TokenQueue("");
        char[] charArray16 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean17 = tokenQueue9.matchesAny(charArray16);
        boolean boolean18 = tokenQueue5.matchesAny(charArray16);
        org.jsoup.parser.TokenQueue tokenQueue20 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray23 = new java.lang.String[] { "", "" };
        boolean boolean24 = tokenQueue20.matchesAny(strArray23);
        boolean boolean25 = tokenQueue5.matchesAny(strArray23);
        java.lang.String str26 = tokenQueue1.consumeToAny(strArray23);
        java.lang.String str29 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean31 = tokenQueue1.matchesCS("");
        java.lang.String str32 = tokenQueue1.remainder();
        java.lang.String str33 = tokenQueue1.remainder();
        tokenQueue1.addFirst((java.lang.Character) '#');
        java.lang.String str36 = tokenQueue1.consumeWord();
        java.lang.String str37 = tokenQueue1.consumeWord();
        java.lang.String str38 = tokenQueue1.remainder();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#" + "'", str38, "#");
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue5 = new org.jsoup.parser.TokenQueue("");
        char[] charArray12 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean13 = tokenQueue5.matchesAny(charArray12);
        boolean boolean14 = tokenQueue1.matchesAny(charArray12);
        boolean boolean15 = tokenQueue1.matchesWord();
        java.lang.String str16 = tokenQueue1.consumeElementSelector();
        java.lang.String str19 = tokenQueue1.chompBalanced('\000', '!');
        java.lang.String str20 = tokenQueue1.consumeAttributeKey();
        java.lang.String str21 = tokenQueue1.consumeWord();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        java.lang.String str6 = tokenQueue1.remainder();
        boolean boolean7 = tokenQueue1.consumeWhitespace();
        tokenQueue1.consume("");
        tokenQueue1.consume("");
        java.lang.String str12 = tokenQueue1.consumeTagName();
        boolean boolean13 = tokenQueue1.isEmpty();
        tokenQueue1.addFirst("hi!");
        tokenQueue1.advance();
        boolean boolean18 = tokenQueue1.matchChomp("hi!");
        boolean boolean20 = tokenQueue1.matchChomp("hi");
        org.jsoup.parser.TokenQueue tokenQueue22 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        boolean boolean26 = tokenQueue22.matchesAny(strArray25);
        java.lang.String str27 = tokenQueue22.consumeTagName();
        org.jsoup.parser.TokenQueue tokenQueue29 = new org.jsoup.parser.TokenQueue("");
        char[] charArray36 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean37 = tokenQueue29.matchesAny(charArray36);
        boolean boolean38 = tokenQueue22.matchesAny(charArray36);
        boolean boolean39 = tokenQueue1.matchesAny(charArray36);
        char char40 = tokenQueue1.peek();
        java.lang.String str41 = tokenQueue1.toString();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + char40 + "' != '" + 'i' + "'", char40 == 'i');
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "i!" + "'", str41, "i!");
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        char[] charArray8 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean9 = tokenQueue1.matchesAny(charArray8);
        org.jsoup.parser.TokenQueue tokenQueue11 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str13 = tokenQueue11.chompTo("");
        boolean boolean14 = tokenQueue11.matchesStartTag();
        boolean boolean16 = tokenQueue11.matches("hi!");
        tokenQueue11.consume("");
        org.jsoup.parser.TokenQueue tokenQueue20 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str22 = tokenQueue20.chompTo("");
        tokenQueue20.advance();
        boolean boolean24 = tokenQueue20.matchesWhitespace();
        boolean boolean26 = tokenQueue20.matchChomp("hi!");
        org.jsoup.parser.TokenQueue tokenQueue28 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray31 = new java.lang.String[] { "", "" };
        boolean boolean32 = tokenQueue28.matchesAny(strArray31);
        java.lang.String str33 = tokenQueue28.remainder();
        org.jsoup.parser.TokenQueue tokenQueue35 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str37 = tokenQueue35.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue39 = new org.jsoup.parser.TokenQueue("");
        char[] charArray46 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean47 = tokenQueue39.matchesAny(charArray46);
        boolean boolean48 = tokenQueue35.matchesAny(charArray46);
        boolean boolean49 = tokenQueue28.matchesAny(charArray46);
        boolean boolean50 = tokenQueue20.matchesAny(charArray46);
        boolean boolean51 = tokenQueue11.matchesAny(charArray46);
        boolean boolean52 = tokenQueue1.matchesAny(charArray46);
        boolean boolean54 = tokenQueue1.matches("i!");
        java.lang.String str56 = tokenQueue1.chompTo("a");
        boolean boolean58 = tokenQueue1.matches("hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        boolean boolean6 = tokenQueue1.matches("");
        boolean boolean7 = tokenQueue1.isEmpty();
        java.lang.String str8 = tokenQueue1.toString();
        java.lang.String str9 = tokenQueue1.consumeTagName();
        tokenQueue1.advance();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        java.lang.String str6 = tokenQueue1.remainder();
        boolean boolean7 = tokenQueue1.consumeWhitespace();
        boolean boolean8 = tokenQueue1.matchesWhitespace();
        boolean boolean9 = tokenQueue1.isEmpty();
        java.lang.String str10 = tokenQueue1.consumeElementSelector();
        java.lang.String str12 = tokenQueue1.chompTo("hi");
        boolean boolean13 = tokenQueue1.consumeWhitespace();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.consumeTo("hi!");
        java.lang.String str4 = tokenQueue1.consumeWord();
        java.lang.String str7 = tokenQueue1.chompBalanced(' ', ' ');
        java.lang.String str8 = tokenQueue1.toString();
        boolean boolean9 = tokenQueue1.consumeWhitespace();
        tokenQueue1.addFirst((java.lang.Character) 'i');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        char[] charArray8 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean9 = tokenQueue1.matchesAny(charArray8);
        boolean boolean10 = tokenQueue1.matchesWord();
        java.lang.String str12 = tokenQueue1.consumeToIgnoreCase("hi!");
        boolean boolean14 = tokenQueue1.matchChomp("4");
        char char15 = tokenQueue1.peek();
        boolean boolean16 = tokenQueue1.consumeWhitespace();
        java.lang.String str17 = tokenQueue1.consumeTagName();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        boolean boolean4 = tokenQueue1.matchesStartTag();
        boolean boolean6 = tokenQueue1.matches("");
        java.lang.String str7 = tokenQueue1.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue9 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str11 = tokenQueue9.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        char[] charArray20 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean21 = tokenQueue13.matchesAny(charArray20);
        boolean boolean22 = tokenQueue9.matchesAny(charArray20);
        org.jsoup.parser.TokenQueue tokenQueue24 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        boolean boolean28 = tokenQueue24.matchesAny(strArray27);
        boolean boolean29 = tokenQueue9.matchesAny(strArray27);
        boolean boolean30 = tokenQueue1.matchesAny(strArray27);
        boolean boolean31 = tokenQueue1.consumeWhitespace();
        boolean boolean33 = tokenQueue1.matchesCS("");
        java.lang.String str36 = tokenQueue1.chompBalanced(' ', '#');
        boolean boolean37 = tokenQueue1.isEmpty();
        boolean boolean38 = tokenQueue1.matchesWhitespace();
        java.lang.String str39 = tokenQueue1.consumeCssIdentifier();
        java.lang.String str40 = tokenQueue1.consumeTagName();
        boolean boolean41 = tokenQueue1.matchesWhitespace();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str10 = tokenQueue1.consumeElementSelector();
        boolean boolean11 = tokenQueue1.matchesWord();
        java.lang.String str12 = tokenQueue1.toString();
        tokenQueue1.addFirst("a");
        tokenQueue1.advance();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        boolean boolean4 = tokenQueue1.matchesStartTag();
        boolean boolean6 = tokenQueue1.matches("");
        java.lang.String str7 = tokenQueue1.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue9 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str11 = tokenQueue9.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        char[] charArray20 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean21 = tokenQueue13.matchesAny(charArray20);
        boolean boolean22 = tokenQueue9.matchesAny(charArray20);
        org.jsoup.parser.TokenQueue tokenQueue24 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        boolean boolean28 = tokenQueue24.matchesAny(strArray27);
        boolean boolean29 = tokenQueue9.matchesAny(strArray27);
        boolean boolean30 = tokenQueue1.matchesAny(strArray27);
        boolean boolean31 = tokenQueue1.consumeWhitespace();
        boolean boolean33 = tokenQueue1.matches("");
        tokenQueue1.addFirst((java.lang.Character) 'a');
        java.lang.String str36 = tokenQueue1.toString();
        java.lang.String str38 = tokenQueue1.chompToIgnoreCase("i!");
        tokenQueue1.advance();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "a" + "'", str36, "a");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "a" + "'", str38, "a");
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        boolean boolean2 = tokenQueue1.consumeWhitespace();
        tokenQueue1.addFirst("hi!");
        boolean boolean6 = tokenQueue1.matchChomp("");
        boolean boolean7 = tokenQueue1.matchesStartTag();
        java.lang.String str8 = tokenQueue1.remainder();
        org.jsoup.parser.TokenQueue tokenQueue10 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str12 = tokenQueue10.chompTo("");
        java.lang.String str13 = tokenQueue10.consumeElementSelector();
        java.lang.String str16 = tokenQueue10.chompBalanced('a', '4');
        boolean boolean18 = tokenQueue10.matchesCS("");
        java.lang.String str19 = tokenQueue10.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue21 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray24 = new java.lang.String[] { "", "" };
        boolean boolean25 = tokenQueue21.matchesAny(strArray24);
        boolean boolean26 = tokenQueue10.matchesAny(strArray24);
        java.lang.String str28 = tokenQueue10.chompTo("hi!");
        java.lang.String str29 = tokenQueue10.consumeWord();
        java.lang.String str30 = tokenQueue10.consumeCssIdentifier();
        org.jsoup.parser.TokenQueue tokenQueue32 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str34 = tokenQueue32.chompTo("");
        java.lang.String str35 = tokenQueue32.consumeElementSelector();
        java.lang.String str38 = tokenQueue32.chompBalanced('a', '4');
        boolean boolean40 = tokenQueue32.matchesCS("");
        java.lang.String str41 = tokenQueue32.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue43 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray46 = new java.lang.String[] { "", "" };
        boolean boolean47 = tokenQueue43.matchesAny(strArray46);
        boolean boolean48 = tokenQueue32.matchesAny(strArray46);
        java.lang.String str49 = tokenQueue10.consumeToAny(strArray46);
        java.lang.String str50 = tokenQueue1.consumeToAny(strArray46);
        char[] charArray54 = new char[] { 'i', 'i', '\000' };
        boolean boolean55 = tokenQueue1.matchesAny(charArray54);
        java.lang.String str57 = tokenQueue1.consumeToIgnoreCase(" ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] { 'i', 'i', '\000' });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        org.jsoup.parser.TokenQueue tokenQueue9 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str11 = tokenQueue9.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        char[] charArray20 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean21 = tokenQueue13.matchesAny(charArray20);
        boolean boolean22 = tokenQueue9.matchesAny(charArray20);
        boolean boolean23 = tokenQueue1.matchesAny(charArray20);
        org.jsoup.parser.TokenQueue tokenQueue25 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str27 = tokenQueue25.chompTo("");
        java.lang.String str28 = tokenQueue25.consumeElementSelector();
        java.lang.String str31 = tokenQueue25.chompBalanced('a', '4');
        boolean boolean33 = tokenQueue25.matchesCS("");
        java.lang.String str34 = tokenQueue25.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue36 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray39 = new java.lang.String[] { "", "" };
        boolean boolean40 = tokenQueue36.matchesAny(strArray39);
        boolean boolean41 = tokenQueue25.matchesAny(strArray39);
        boolean boolean42 = tokenQueue25.matchesWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue44 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str46 = tokenQueue44.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue48 = new org.jsoup.parser.TokenQueue("");
        char[] charArray55 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean56 = tokenQueue48.matchesAny(charArray55);
        boolean boolean57 = tokenQueue44.matchesAny(charArray55);
        boolean boolean58 = tokenQueue25.matchesAny(charArray55);
        boolean boolean59 = tokenQueue1.matchesAny(charArray55);
        java.lang.String str60 = tokenQueue1.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue62 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str64 = tokenQueue62.chompTo("");
        boolean boolean65 = tokenQueue62.matchesStartTag();
        boolean boolean67 = tokenQueue62.matches("");
        java.lang.String str68 = tokenQueue62.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue70 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str72 = tokenQueue70.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue74 = new org.jsoup.parser.TokenQueue("");
        char[] charArray81 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean82 = tokenQueue74.matchesAny(charArray81);
        boolean boolean83 = tokenQueue70.matchesAny(charArray81);
        org.jsoup.parser.TokenQueue tokenQueue85 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray88 = new java.lang.String[] { "", "" };
        boolean boolean89 = tokenQueue85.matchesAny(strArray88);
        boolean boolean90 = tokenQueue70.matchesAny(strArray88);
        boolean boolean91 = tokenQueue62.matchesAny(strArray88);
        java.lang.String str92 = tokenQueue1.consumeToAny(strArray88);
        tokenQueue1.advance();
        boolean boolean94 = tokenQueue1.consumeWhitespace();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertArrayEquals(charArray81, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertArrayEquals(strArray88, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        boolean boolean4 = tokenQueue1.matchesStartTag();
        tokenQueue1.addFirst("");
        org.jsoup.parser.TokenQueue tokenQueue8 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str10 = tokenQueue8.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("");
        char[] charArray19 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean20 = tokenQueue12.matchesAny(charArray19);
        boolean boolean21 = tokenQueue8.matchesAny(charArray19);
        org.jsoup.parser.TokenQueue tokenQueue23 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray26 = new java.lang.String[] { "", "" };
        boolean boolean27 = tokenQueue23.matchesAny(strArray26);
        boolean boolean28 = tokenQueue8.matchesAny(strArray26);
        boolean boolean29 = tokenQueue1.matchesAny(strArray26);
        java.lang.String str31 = tokenQueue1.consumeTo("");
        java.lang.String str33 = tokenQueue1.chompTo("hi!");
        tokenQueue1.advance();
        boolean boolean35 = tokenQueue1.matchesStartTag();
        java.lang.String str36 = tokenQueue1.remainder();
        java.lang.String str38 = tokenQueue1.consumeTo("!");
        java.lang.String str39 = tokenQueue1.remainder();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("4");
        java.lang.String str3 = tokenQueue1.consumeTo("4");
        tokenQueue1.addFirst("4");
        java.lang.String str6 = tokenQueue1.consumeWord();
        java.lang.String str7 = tokenQueue1.consumeCssIdentifier();
        java.lang.String str10 = tokenQueue1.chompBalanced('!', '#');
        java.lang.String str13 = tokenQueue1.chompBalanced('4', 'h');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "44" + "'", str6, "44");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str11 = tokenQueue1.chompTo("");
        java.lang.String str12 = tokenQueue1.consumeTagName();
        java.lang.String str14 = tokenQueue1.chompTo("");
        boolean boolean15 = tokenQueue1.matchesWhitespace();
        java.lang.String str17 = tokenQueue1.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue19 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str21 = tokenQueue19.chompTo("");
        boolean boolean22 = tokenQueue19.matchesStartTag();
        boolean boolean24 = tokenQueue19.matches("");
        java.lang.String str25 = tokenQueue19.consumeElementSelector();
        java.lang.String str26 = tokenQueue19.toString();
        org.jsoup.parser.TokenQueue tokenQueue28 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str30 = tokenQueue28.chompTo("");
        boolean boolean31 = tokenQueue28.matchesStartTag();
        tokenQueue28.addFirst("");
        org.jsoup.parser.TokenQueue tokenQueue35 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str37 = tokenQueue35.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue39 = new org.jsoup.parser.TokenQueue("");
        char[] charArray46 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean47 = tokenQueue39.matchesAny(charArray46);
        boolean boolean48 = tokenQueue35.matchesAny(charArray46);
        org.jsoup.parser.TokenQueue tokenQueue50 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray53 = new java.lang.String[] { "", "" };
        boolean boolean54 = tokenQueue50.matchesAny(strArray53);
        boolean boolean55 = tokenQueue35.matchesAny(strArray53);
        boolean boolean56 = tokenQueue28.matchesAny(strArray53);
        org.jsoup.parser.TokenQueue tokenQueue58 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str60 = tokenQueue58.chompTo("");
        java.lang.String str61 = tokenQueue58.consumeElementSelector();
        java.lang.String str64 = tokenQueue58.chompBalanced('a', '4');
        boolean boolean65 = tokenQueue58.matchesWhitespace();
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        java.lang.String str73 = tokenQueue58.consumeToAny(strArray72);
        java.lang.String str74 = tokenQueue28.consumeToAny(strArray72);
        java.lang.String str75 = tokenQueue19.consumeToAny(strArray72);
        boolean boolean76 = tokenQueue1.matchesAny(strArray72);
        tokenQueue1.addFirst(" ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "hi!", "", "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        org.jsoup.parser.TokenQueue tokenQueue7 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str9 = tokenQueue7.chompTo("");
        boolean boolean10 = tokenQueue7.matchesStartTag();
        tokenQueue7.addFirst("");
        org.jsoup.parser.TokenQueue tokenQueue14 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str16 = tokenQueue14.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue18 = new org.jsoup.parser.TokenQueue("");
        char[] charArray25 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean26 = tokenQueue18.matchesAny(charArray25);
        boolean boolean27 = tokenQueue14.matchesAny(charArray25);
        org.jsoup.parser.TokenQueue tokenQueue29 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray32 = new java.lang.String[] { "", "" };
        boolean boolean33 = tokenQueue29.matchesAny(strArray32);
        boolean boolean34 = tokenQueue14.matchesAny(strArray32);
        boolean boolean35 = tokenQueue7.matchesAny(strArray32);
        java.lang.String str36 = tokenQueue1.consumeToAny(strArray32);
        java.lang.String str38 = tokenQueue1.consumeTo("a");
        java.lang.String str39 = tokenQueue1.consumeCssIdentifier();
        java.lang.String str42 = tokenQueue1.chompBalanced('i', '4');
        boolean boolean43 = tokenQueue1.matchesStartTag();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        java.lang.String str6 = tokenQueue1.remainder();
        boolean boolean7 = tokenQueue1.consumeWhitespace();
        boolean boolean8 = tokenQueue1.matchesWhitespace();
        boolean boolean9 = tokenQueue1.isEmpty();
        boolean boolean10 = tokenQueue1.matchesWhitespace();
        java.lang.String str12 = tokenQueue1.chompToIgnoreCase("hi");
        boolean boolean13 = tokenQueue1.isEmpty();
        java.lang.String str14 = tokenQueue1.consumeElementSelector();
        java.lang.String str15 = tokenQueue1.consumeAttributeKey();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        char[] charArray8 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean9 = tokenQueue1.matchesAny(charArray8);
        boolean boolean10 = tokenQueue1.matchesWord();
        java.lang.String str12 = tokenQueue1.consumeToIgnoreCase("hi!");
        tokenQueue1.addFirst("");
        java.lang.String str16 = tokenQueue1.chompToIgnoreCase("hi");
        java.lang.String str18 = tokenQueue1.consumeToIgnoreCase("hi");
        char char19 = tokenQueue1.peek();
        java.lang.String str21 = tokenQueue1.consumeTo("a");
        java.lang.String str23 = tokenQueue1.consumeTo("i");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        tokenQueue1.advance();
        boolean boolean5 = tokenQueue1.matchesWhitespace();
        boolean boolean6 = tokenQueue1.matchesWhitespace();
        boolean boolean8 = tokenQueue1.matches("");
        java.lang.String str9 = tokenQueue1.toString();
        java.lang.String str10 = tokenQueue1.consumeWord();
        java.lang.String str12 = tokenQueue1.consumeTo("44");
        boolean boolean13 = tokenQueue1.consumeWhitespace();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        boolean boolean4 = tokenQueue1.matchesStartTag();
        boolean boolean6 = tokenQueue1.matches("");
        java.lang.String str7 = tokenQueue1.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue9 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str11 = tokenQueue9.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        char[] charArray20 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean21 = tokenQueue13.matchesAny(charArray20);
        boolean boolean22 = tokenQueue9.matchesAny(charArray20);
        org.jsoup.parser.TokenQueue tokenQueue24 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        boolean boolean28 = tokenQueue24.matchesAny(strArray27);
        boolean boolean29 = tokenQueue9.matchesAny(strArray27);
        boolean boolean30 = tokenQueue1.matchesAny(strArray27);
        boolean boolean31 = tokenQueue1.consumeWhitespace();
        boolean boolean33 = tokenQueue1.matchesCS("");
        java.lang.String str36 = tokenQueue1.chompBalanced(' ', '#');
        org.jsoup.parser.TokenQueue tokenQueue38 = new org.jsoup.parser.TokenQueue("");
        char[] charArray45 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean46 = tokenQueue38.matchesAny(charArray45);
        boolean boolean47 = tokenQueue1.matchesAny(charArray45);
        tokenQueue1.addFirst("hi");
        boolean boolean51 = tokenQueue1.matchesCS("");
        boolean boolean52 = tokenQueue1.matchesWhitespace();
        java.lang.String str53 = tokenQueue1.consumeElementSelector();
        // The following exception was thrown during execution in test generation
        try {
            tokenQueue1.consume("a ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Queue did not match expected sequence");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi" + "'", str53, "hi");
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        char[] charArray8 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean9 = tokenQueue1.matchesAny(charArray8);
        java.lang.String str10 = tokenQueue1.remainder();
        java.lang.String str11 = tokenQueue1.toString();
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str15 = tokenQueue13.chompTo("");
        java.lang.String str16 = tokenQueue13.consumeElementSelector();
        java.lang.String str19 = tokenQueue13.chompBalanced('a', '4');
        boolean boolean21 = tokenQueue13.matchesCS("");
        java.lang.String str22 = tokenQueue13.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue24 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        boolean boolean28 = tokenQueue24.matchesAny(strArray27);
        boolean boolean29 = tokenQueue13.matchesAny(strArray27);
        boolean boolean30 = tokenQueue13.matchesWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue32 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str34 = tokenQueue32.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue36 = new org.jsoup.parser.TokenQueue("");
        char[] charArray43 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean44 = tokenQueue36.matchesAny(charArray43);
        boolean boolean45 = tokenQueue32.matchesAny(charArray43);
        boolean boolean46 = tokenQueue13.matchesAny(charArray43);
        boolean boolean47 = tokenQueue1.matchesAny(charArray43);
        java.lang.String str48 = tokenQueue1.consumeTagName();
        boolean boolean49 = tokenQueue1.consumeWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue51 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray54 = new java.lang.String[] { "", "" };
        boolean boolean55 = tokenQueue51.matchesAny(strArray54);
        java.lang.String str56 = tokenQueue51.remainder();
        org.jsoup.parser.TokenQueue tokenQueue58 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str60 = tokenQueue58.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue62 = new org.jsoup.parser.TokenQueue("");
        char[] charArray69 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean70 = tokenQueue62.matchesAny(charArray69);
        boolean boolean71 = tokenQueue58.matchesAny(charArray69);
        boolean boolean72 = tokenQueue51.matchesAny(charArray69);
        boolean boolean73 = tokenQueue1.matchesAny(charArray69);
        tokenQueue1.addFirst((java.lang.Character) ' ');
        tokenQueue1.addFirst((java.lang.Character) 'a');
        java.lang.String str79 = tokenQueue1.consumeTo(" !");
        java.lang.String str80 = tokenQueue1.consumeAttributeKey();
        java.lang.String str82 = tokenQueue1.consumeToIgnoreCase("hih");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertArrayEquals(charArray69, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "a " + "'", str79, "a ");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue5 = new org.jsoup.parser.TokenQueue("");
        char[] charArray12 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean13 = tokenQueue5.matchesAny(charArray12);
        boolean boolean14 = tokenQueue1.matchesAny(charArray12);
        org.jsoup.parser.TokenQueue tokenQueue16 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray19 = new java.lang.String[] { "", "" };
        boolean boolean20 = tokenQueue16.matchesAny(strArray19);
        boolean boolean21 = tokenQueue1.matchesAny(strArray19);
        tokenQueue1.consume("");
        boolean boolean24 = tokenQueue1.matchesStartTag();
        boolean boolean25 = tokenQueue1.isEmpty();
        tokenQueue1.addFirst("4");
        tokenQueue1.advance();
        java.lang.String str30 = tokenQueue1.chompToIgnoreCase(" !");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str10 = tokenQueue1.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        boolean boolean16 = tokenQueue12.matchesAny(strArray15);
        boolean boolean17 = tokenQueue1.matchesAny(strArray15);
        java.lang.String str19 = tokenQueue1.chompTo("hi!");
        java.lang.String str20 = tokenQueue1.consumeWord();
        boolean boolean21 = tokenQueue1.matchesWord();
        // The following exception was thrown during execution in test generation
        try {
            char char22 = tokenQueue1.consume();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        char[] charArray8 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean9 = tokenQueue1.matchesAny(charArray8);
        boolean boolean10 = tokenQueue1.matchesWord();
        java.lang.String str11 = tokenQueue1.consumeElementSelector();
        tokenQueue1.advance();
        java.lang.String str14 = tokenQueue1.chompToIgnoreCase("h");
        java.lang.String str15 = tokenQueue1.remainder();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str10 = tokenQueue1.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        boolean boolean16 = tokenQueue12.matchesAny(strArray15);
        boolean boolean17 = tokenQueue1.matchesAny(strArray15);
        java.lang.String str19 = tokenQueue1.chompTo("hi!");
        java.lang.String str20 = tokenQueue1.consumeWord();
        java.lang.String str21 = tokenQueue1.consumeCssIdentifier();
        java.lang.String str22 = tokenQueue1.consumeCssIdentifier();
        boolean boolean23 = tokenQueue1.matchesStartTag();
        java.lang.String str25 = tokenQueue1.consumeTo("hi");
        java.lang.String str27 = tokenQueue1.consumeToIgnoreCase("4");
        java.lang.String str29 = tokenQueue1.consumeTo("4");
        java.lang.String str30 = tokenQueue1.consumeAttributeKey();
        tokenQueue1.advance();
        java.lang.String str32 = tokenQueue1.remainder();
        boolean boolean34 = tokenQueue1.matches("hih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        java.lang.String str8 = tokenQueue1.remainder();
        boolean boolean10 = tokenQueue1.matchChomp("");
        java.lang.String str12 = tokenQueue1.chompToIgnoreCase("4");
        boolean boolean13 = tokenQueue1.consumeWhitespace();
        boolean boolean14 = tokenQueue1.matchesWord();
        java.lang.String str15 = tokenQueue1.consumeCssIdentifier();
        boolean boolean16 = tokenQueue1.consumeWhitespace();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        char[] charArray8 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean9 = tokenQueue1.matchesAny(charArray8);
        java.lang.String str10 = tokenQueue1.remainder();
        java.lang.String str13 = tokenQueue1.chompBalanced(' ', 'a');
        boolean boolean14 = tokenQueue1.matchesStartTag();
        java.lang.String str16 = tokenQueue1.chompTo("");
        boolean boolean17 = tokenQueue1.matchesWord();
        boolean boolean19 = tokenQueue1.matchesCS("hi");
        tokenQueue1.addFirst((java.lang.Character) '\000');
        boolean boolean23 = tokenQueue1.matchChomp("");
        java.lang.String str26 = tokenQueue1.chompBalanced('4', '\000');
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        char[] charArray8 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean9 = tokenQueue1.matchesAny(charArray8);
        boolean boolean10 = tokenQueue1.matchesWord();
        java.lang.String str12 = tokenQueue1.consumeToIgnoreCase("hi!");
        tokenQueue1.addFirst("");
        tokenQueue1.consume("");
        java.lang.String str17 = tokenQueue1.consumeWord();
        java.lang.String str18 = tokenQueue1.consumeWord();
        java.lang.String str21 = tokenQueue1.chompBalanced('a', '4');
        org.jsoup.parser.TokenQueue tokenQueue23 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str25 = tokenQueue23.chompTo("");
        java.lang.String str26 = tokenQueue23.consumeElementSelector();
        java.lang.String str29 = tokenQueue23.chompBalanced('a', '4');
        boolean boolean31 = tokenQueue23.matchesCS("");
        java.lang.String str32 = tokenQueue23.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue34 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray37 = new java.lang.String[] { "", "" };
        boolean boolean38 = tokenQueue34.matchesAny(strArray37);
        boolean boolean39 = tokenQueue23.matchesAny(strArray37);
        java.lang.String str41 = tokenQueue23.chompTo("hi!");
        java.lang.String str42 = tokenQueue23.consumeWord();
        java.lang.String str43 = tokenQueue23.consumeCssIdentifier();
        org.jsoup.parser.TokenQueue tokenQueue45 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str47 = tokenQueue45.chompTo("");
        java.lang.String str48 = tokenQueue45.consumeElementSelector();
        java.lang.String str51 = tokenQueue45.chompBalanced('a', '4');
        boolean boolean53 = tokenQueue45.matchesCS("");
        java.lang.String str54 = tokenQueue45.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue56 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray59 = new java.lang.String[] { "", "" };
        boolean boolean60 = tokenQueue56.matchesAny(strArray59);
        boolean boolean61 = tokenQueue45.matchesAny(strArray59);
        java.lang.String str62 = tokenQueue23.consumeToAny(strArray59);
        java.lang.String str63 = tokenQueue1.consumeToAny(strArray59);
        java.lang.String str64 = tokenQueue1.toString();
        java.lang.String str65 = tokenQueue1.consumeElementSelector();
        // The following exception was thrown during execution in test generation
        try {
            char char66 = tokenQueue1.consume();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        org.jsoup.parser.TokenQueue tokenQueue9 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str11 = tokenQueue9.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        char[] charArray20 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean21 = tokenQueue13.matchesAny(charArray20);
        boolean boolean22 = tokenQueue9.matchesAny(charArray20);
        boolean boolean23 = tokenQueue1.matchesAny(charArray20);
        tokenQueue1.addFirst((java.lang.Character) '#');
        java.lang.String str26 = tokenQueue1.remainder();
        java.lang.String str27 = tokenQueue1.remainder();
        java.lang.String str28 = tokenQueue1.consumeWord();
        boolean boolean30 = tokenQueue1.matchesCS("i");
        org.jsoup.parser.TokenQueue tokenQueue32 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str34 = tokenQueue32.chompTo("");
        tokenQueue32.advance();
        tokenQueue32.addFirst((java.lang.Character) '#');
        org.jsoup.parser.TokenQueue tokenQueue39 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str41 = tokenQueue39.chompTo("");
        java.lang.String str42 = tokenQueue39.consumeElementSelector();
        java.lang.String str45 = tokenQueue39.chompBalanced('a', '4');
        boolean boolean47 = tokenQueue39.matchesCS("");
        java.lang.String str48 = tokenQueue39.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue50 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray53 = new java.lang.String[] { "", "" };
        boolean boolean54 = tokenQueue50.matchesAny(strArray53);
        boolean boolean55 = tokenQueue39.matchesAny(strArray53);
        boolean boolean56 = tokenQueue39.matchesWhitespace();
        java.lang.String str58 = tokenQueue39.consumeTo("");
        org.jsoup.parser.TokenQueue tokenQueue60 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str62 = tokenQueue60.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue64 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str66 = tokenQueue64.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue68 = new org.jsoup.parser.TokenQueue("");
        char[] charArray75 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean76 = tokenQueue68.matchesAny(charArray75);
        boolean boolean77 = tokenQueue64.matchesAny(charArray75);
        org.jsoup.parser.TokenQueue tokenQueue79 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray82 = new java.lang.String[] { "", "" };
        boolean boolean83 = tokenQueue79.matchesAny(strArray82);
        boolean boolean84 = tokenQueue64.matchesAny(strArray82);
        java.lang.String str85 = tokenQueue60.consumeToAny(strArray82);
        boolean boolean86 = tokenQueue39.matchesAny(strArray82);
        java.lang.String str87 = tokenQueue32.consumeToAny(strArray82);
        boolean boolean88 = tokenQueue1.matchesAny(strArray82);
        boolean boolean89 = tokenQueue1.isEmpty();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#" + "'", str26, "#");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertArrayEquals(charArray75, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompToIgnoreCase("hi!");
        boolean boolean4 = tokenQueue1.isEmpty();
        boolean boolean6 = tokenQueue1.matchesCS("hi!");
        org.jsoup.parser.TokenQueue tokenQueue8 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str10 = tokenQueue8.chompTo("");
        boolean boolean11 = tokenQueue8.matchesStartTag();
        tokenQueue8.addFirst("");
        org.jsoup.parser.TokenQueue tokenQueue15 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str17 = tokenQueue15.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue19 = new org.jsoup.parser.TokenQueue("");
        char[] charArray26 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean27 = tokenQueue19.matchesAny(charArray26);
        boolean boolean28 = tokenQueue15.matchesAny(charArray26);
        org.jsoup.parser.TokenQueue tokenQueue30 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray33 = new java.lang.String[] { "", "" };
        boolean boolean34 = tokenQueue30.matchesAny(strArray33);
        boolean boolean35 = tokenQueue15.matchesAny(strArray33);
        boolean boolean36 = tokenQueue8.matchesAny(strArray33);
        java.lang.String str37 = tokenQueue1.consumeToAny(strArray33);
        boolean boolean39 = tokenQueue1.matchChomp("hi!");
        java.lang.String str40 = tokenQueue1.consumeTagName();
        java.lang.String str41 = tokenQueue1.toString();
        java.lang.String str42 = tokenQueue1.consumeAttributeKey();
        java.lang.String str44 = tokenQueue1.chompToIgnoreCase(" ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        java.lang.String str6 = tokenQueue1.remainder();
        boolean boolean7 = tokenQueue1.consumeWhitespace();
        boolean boolean8 = tokenQueue1.matchesWhitespace();
        boolean boolean9 = tokenQueue1.isEmpty();
        tokenQueue1.addFirst((java.lang.Character) '4');
        java.lang.String str12 = tokenQueue1.consumeTagName();
        tokenQueue1.addFirst("4");
        boolean boolean16 = tokenQueue1.matchesCS(" ");
        java.lang.String str18 = tokenQueue1.chompTo("44!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4" + "'", str12, "4");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4" + "'", str18, "4");
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.chompTo("");
        java.lang.String str4 = tokenQueue1.consumeElementSelector();
        java.lang.String str7 = tokenQueue1.chompBalanced('a', '4');
        boolean boolean9 = tokenQueue1.matchesCS("");
        java.lang.String str11 = tokenQueue1.chompTo("");
        java.lang.String str12 = tokenQueue1.consumeTagName();
        java.lang.String str14 = tokenQueue1.chompTo("");
        boolean boolean15 = tokenQueue1.matchesWhitespace();
        boolean boolean17 = tokenQueue1.matchesCS("4");
        org.jsoup.parser.TokenQueue tokenQueue19 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str21 = tokenQueue19.chompTo("");
        boolean boolean22 = tokenQueue19.matchesStartTag();
        boolean boolean24 = tokenQueue19.matches("");
        java.lang.String str25 = tokenQueue19.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue27 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str29 = tokenQueue27.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue31 = new org.jsoup.parser.TokenQueue("");
        char[] charArray38 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean39 = tokenQueue31.matchesAny(charArray38);
        boolean boolean40 = tokenQueue27.matchesAny(charArray38);
        org.jsoup.parser.TokenQueue tokenQueue42 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray45 = new java.lang.String[] { "", "" };
        boolean boolean46 = tokenQueue42.matchesAny(strArray45);
        boolean boolean47 = tokenQueue27.matchesAny(strArray45);
        boolean boolean48 = tokenQueue19.matchesAny(strArray45);
        boolean boolean49 = tokenQueue19.isEmpty();
        java.lang.String str50 = tokenQueue19.remainder();
        tokenQueue19.addFirst((java.lang.Character) '4');
        java.lang.String str54 = tokenQueue19.chompTo("hi!");
        java.lang.String str55 = tokenQueue19.consumeTagName();
        java.lang.String str56 = tokenQueue19.remainder();
        org.jsoup.parser.TokenQueue tokenQueue58 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str60 = tokenQueue58.chompTo("");
        java.lang.String str61 = tokenQueue58.consumeElementSelector();
        java.lang.String str64 = tokenQueue58.chompBalanced('a', '4');
        boolean boolean66 = tokenQueue58.matchesCS("");
        java.lang.String str67 = tokenQueue58.consumeElementSelector();
        org.jsoup.parser.TokenQueue tokenQueue69 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray72 = new java.lang.String[] { "", "" };
        boolean boolean73 = tokenQueue69.matchesAny(strArray72);
        boolean boolean74 = tokenQueue58.matchesAny(strArray72);
        boolean boolean75 = tokenQueue58.matchesWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue77 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray80 = new java.lang.String[] { "", "" };
        boolean boolean81 = tokenQueue77.matchesAny(strArray80);
        java.lang.String str82 = tokenQueue58.consumeToAny(strArray80);
        boolean boolean83 = tokenQueue19.matchesAny(strArray80);
        boolean boolean84 = tokenQueue1.matchesAny(strArray80);
        char char85 = tokenQueue1.peek();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "4" + "'", str54, "4");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + char85 + "' != '" + '\000' + "'", char85 == '\000');
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        boolean boolean6 = tokenQueue1.matchesWhitespace();
        java.lang.String str7 = tokenQueue1.consumeCssIdentifier();
        org.jsoup.parser.TokenQueue tokenQueue9 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str11 = tokenQueue9.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        char[] charArray20 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean21 = tokenQueue13.matchesAny(charArray20);
        boolean boolean22 = tokenQueue9.matchesAny(charArray20);
        boolean boolean23 = tokenQueue1.matchesAny(charArray20);
        tokenQueue1.advance();
        java.lang.String str25 = tokenQueue1.toString();
        tokenQueue1.addFirst("hi!");
        java.lang.String str28 = tokenQueue1.consumeAttributeKey();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi" + "'", str28, "hi");
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str3 = tokenQueue1.consumeTo("hi!");
        java.lang.String str4 = tokenQueue1.consumeWord();
        boolean boolean5 = tokenQueue1.isEmpty();
        java.lang.String str7 = tokenQueue1.chompToIgnoreCase("4");
        char char8 = tokenQueue1.peek();
        java.lang.String str9 = tokenQueue1.consumeWord();
        java.lang.Class<?> wildcardClass10 = tokenQueue1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        boolean boolean5 = tokenQueue1.matchesAny(strArray4);
        boolean boolean6 = tokenQueue1.matchesWhitespace();
        java.lang.String str7 = tokenQueue1.consumeCssIdentifier();
        org.jsoup.parser.TokenQueue tokenQueue9 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str11 = tokenQueue9.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("");
        char[] charArray20 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean21 = tokenQueue13.matchesAny(charArray20);
        boolean boolean22 = tokenQueue9.matchesAny(charArray20);
        boolean boolean23 = tokenQueue1.matchesAny(charArray20);
        tokenQueue1.advance();
        java.lang.String str25 = tokenQueue1.toString();
        tokenQueue1.addFirst("hi!");
        org.jsoup.parser.TokenQueue tokenQueue29 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str31 = tokenQueue29.chompTo("");
        java.lang.String str32 = tokenQueue29.consumeElementSelector();
        java.lang.String str35 = tokenQueue29.chompBalanced('a', '4');
        org.jsoup.parser.TokenQueue tokenQueue37 = new org.jsoup.parser.TokenQueue("");
        java.lang.String str39 = tokenQueue37.consumeTo("hi!");
        org.jsoup.parser.TokenQueue tokenQueue41 = new org.jsoup.parser.TokenQueue("");
        char[] charArray48 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        boolean boolean49 = tokenQueue41.matchesAny(charArray48);
        boolean boolean50 = tokenQueue37.matchesAny(charArray48);
        boolean boolean51 = tokenQueue29.matchesAny(charArray48);
        boolean boolean52 = tokenQueue1.matchesAny(charArray48);
        boolean boolean53 = tokenQueue1.isEmpty();
        tokenQueue1.consume("hi");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] { '4', '#', '#', 'a', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }
}

