package org.jsoup.parser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str4 = characterReader1.consumeTo("");
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        int int7 = characterReader1.pos();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        characterReader9.rewindToMark();
        boolean boolean12 = characterReader9.matches("");
        java.lang.String str13 = characterReader9.consumeHexSequence();
        characterReader9.advance();
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        char[] charArray21 = new char[] { '#', 'a', '\uffff', 'a' };
        boolean boolean22 = characterReader16.matchesAny(charArray21);
        boolean boolean23 = characterReader9.matchesAny(charArray21);
        java.lang.String str24 = characterReader1.consumeToAny(charArray21);
        boolean boolean26 = characterReader1.matchesIgnoreCase("i");
        java.lang.String str27 = characterReader1.consumeDigitSequence();
        boolean boolean29 = characterReader1.matchesIgnoreCase("i!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        characterReader1.rewindToMark();
        boolean boolean9 = characterReader1.matchConsume("hi");
        boolean boolean10 = characterReader1.matchesLetter();
        boolean boolean12 = characterReader1.matchConsume("h");
        java.lang.String str13 = characterReader1.toString();
        boolean boolean14 = characterReader1.matchesLetter();
        characterReader1.unconsume();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str11 = characterReader10.consumeLetterSequence();
        characterReader10.rewindToMark();
        char[] charArray15 = new char[] { '\uffff', 'a' };
        java.lang.String str16 = characterReader10.consumeToAny(charArray15);
        boolean boolean17 = characterReader8.matchesAny(charArray15);
        java.lang.String str18 = characterReader1.consumeToAny(charArray15);
        boolean boolean20 = characterReader1.matchConsume("hi!");
        boolean boolean21 = characterReader1.matchesDigit();
        char char22 = characterReader1.current();
        boolean boolean23 = characterReader1.matchesDigit();
        boolean boolean25 = characterReader1.matches("");
        java.lang.String str26 = characterReader1.consumeHexSequence();
        characterReader1.rewindToMark();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\uffff' + "'", char22 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("!");
        int int2 = characterReader1.pos();
        boolean boolean4 = characterReader1.matches("i");
        java.lang.String str5 = characterReader1.consumeToEnd();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        boolean boolean5 = characterReader1.matchConsumeIgnoreCase("");
        characterReader1.advance();
        characterReader1.rewindToMark();
        boolean boolean9 = characterReader1.matchConsumeIgnoreCase("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        boolean boolean3 = characterReader1.matchesLetter();
        characterReader1.advance();
        boolean boolean6 = characterReader1.matches('\uffff');
        boolean boolean7 = characterReader1.matchesDigit();
        char char8 = characterReader1.current();
        int int9 = characterReader1.pos();
        java.lang.Class<?> wildcardClass10 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        java.lang.String str4 = characterReader1.consumeLetterSequence();
        boolean boolean6 = characterReader1.matchConsumeIgnoreCase("hi!");
        characterReader1.mark();
        characterReader1.advance();
        boolean boolean10 = characterReader1.matches('i');
        char char11 = characterReader1.current();
        boolean boolean13 = characterReader1.matchConsumeIgnoreCase("i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\uffff' + "'", char11 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean3 = characterReader1.matchConsume("");
        characterReader1.advance();
        java.lang.String str5 = characterReader1.toString();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str9 = characterReader8.consumeLetterSequence();
        char char10 = characterReader8.consume();
        characterReader8.unconsume();
        boolean boolean13 = characterReader8.matchesIgnoreCase("");
        char char14 = characterReader8.current();
        java.lang.String str15 = characterReader8.consumeAsString();
        boolean boolean16 = characterReader8.isEmpty();
        boolean boolean17 = characterReader8.isEmpty();
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("");
        characterReader19.rewindToMark();
        boolean boolean22 = characterReader19.matches("");
        java.lang.String str23 = characterReader19.consumeHexSequence();
        characterReader19.advance();
        org.jsoup.parser.CharacterReader characterReader26 = new org.jsoup.parser.CharacterReader("");
        char[] charArray31 = new char[] { '#', 'a', '\uffff', 'a' };
        boolean boolean32 = characterReader26.matchesAny(charArray31);
        boolean boolean33 = characterReader19.matchesAny(charArray31);
        java.lang.String str34 = characterReader8.consumeToAny(charArray31);
        boolean boolean36 = characterReader8.containsIgnoreCase("!");
        org.jsoup.parser.CharacterReader characterReader38 = new org.jsoup.parser.CharacterReader("");
        characterReader38.rewindToMark();
        boolean boolean41 = characterReader38.matches("");
        java.lang.String str42 = characterReader38.consumeHexSequence();
        characterReader38.advance();
        org.jsoup.parser.CharacterReader characterReader45 = new org.jsoup.parser.CharacterReader("");
        char[] charArray50 = new char[] { '#', 'a', '\uffff', 'a' };
        boolean boolean51 = characterReader45.matchesAny(charArray50);
        boolean boolean52 = characterReader38.matchesAny(charArray50);
        java.lang.String str53 = characterReader8.consumeToAny(charArray50);
        java.lang.String str54 = characterReader1.consumeToAny(charArray50);
        boolean boolean56 = characterReader1.matches('\uffff');
        characterReader1.advance();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "i!" + "'", str5, "i!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\uffff' + "'", char10 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\uffff' + "'", char14 == '\uffff');
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "i!" + "'", str54, "i!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        org.jsoup.parser.CharacterReader characterReader5 = new org.jsoup.parser.CharacterReader("");
        characterReader5.rewindToMark();
        boolean boolean8 = characterReader5.matches("");
        java.lang.String str9 = characterReader5.consumeHexSequence();
        java.lang.String str10 = characterReader5.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader14 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str15 = characterReader14.consumeLetterSequence();
        characterReader14.rewindToMark();
        char[] charArray19 = new char[] { '\uffff', 'a' };
        java.lang.String str20 = characterReader14.consumeToAny(charArray19);
        boolean boolean21 = characterReader12.matchesAny(charArray19);
        java.lang.String str22 = characterReader5.consumeToAny(charArray19);
        java.lang.String str23 = characterReader1.consumeToAny(charArray19);
        characterReader1.mark();
        java.lang.String str25 = characterReader1.toString();
        boolean boolean27 = characterReader1.matchConsume("");
        org.jsoup.parser.CharacterReader characterReader29 = new org.jsoup.parser.CharacterReader("");
        characterReader29.rewindToMark();
        boolean boolean32 = characterReader29.matches("");
        java.lang.String str33 = characterReader29.consumeHexSequence();
        java.lang.String str34 = characterReader29.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader36 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader38 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str39 = characterReader38.consumeLetterSequence();
        characterReader38.rewindToMark();
        char[] charArray43 = new char[] { '\uffff', 'a' };
        java.lang.String str44 = characterReader38.consumeToAny(charArray43);
        boolean boolean45 = characterReader36.matchesAny(charArray43);
        java.lang.String str46 = characterReader29.consumeToAny(charArray43);
        java.lang.String str47 = characterReader29.consumeDigitSequence();
        java.lang.String str48 = characterReader29.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader50 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str51 = characterReader50.consumeLetterSequence();
        char char52 = characterReader50.consume();
        characterReader50.unconsume();
        boolean boolean55 = characterReader50.matchesIgnoreCase("");
        char char56 = characterReader50.current();
        org.jsoup.parser.CharacterReader characterReader58 = new org.jsoup.parser.CharacterReader("");
        characterReader58.rewindToMark();
        characterReader58.mark();
        org.jsoup.parser.CharacterReader characterReader62 = new org.jsoup.parser.CharacterReader("");
        char[] charArray67 = new char[] { '#', 'a', '\uffff', 'a' };
        boolean boolean68 = characterReader62.matchesAny(charArray67);
        boolean boolean69 = characterReader58.matchesAny(charArray67);
        boolean boolean70 = characterReader50.matchesAny(charArray67);
        java.lang.String str71 = characterReader50.toString();
        org.jsoup.parser.CharacterReader characterReader73 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str74 = characterReader73.consumeLetterSequence();
        java.lang.String str75 = characterReader73.toString();
        boolean boolean77 = characterReader73.matchConsume("");
        java.lang.String str78 = characterReader73.consumeHexSequence();
        org.jsoup.parser.CharacterReader characterReader80 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str81 = characterReader80.consumeLetterSequence();
        characterReader80.rewindToMark();
        char[] charArray85 = new char[] { '\uffff', 'a' };
        java.lang.String str86 = characterReader80.consumeToAny(charArray85);
        boolean boolean87 = characterReader73.matchesAny(charArray85);
        java.lang.String str88 = characterReader50.consumeToAny(charArray85);
        java.lang.String str89 = characterReader29.consumeToAny(charArray85);
        boolean boolean90 = characterReader1.matchesAny(charArray85);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + char52 + "' != '" + '\uffff' + "'", char52 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + char56 + "' != '" + '\uffff' + "'", char56 == '\uffff');
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertArrayEquals(charArray67, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(charArray85);
        org.junit.Assert.assertArrayEquals(charArray85, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.rewindToMark();
        characterReader1.unconsume();
        characterReader1.advance();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean10 = characterReader8.matchConsume("");
        characterReader8.advance();
        char char12 = characterReader8.consume();
        boolean boolean14 = characterReader8.matchConsume("i!");
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        characterReader16.rewindToMark();
        boolean boolean19 = characterReader16.matches("");
        java.lang.String str20 = characterReader16.consumeHexSequence();
        java.lang.String str21 = characterReader16.consumeDigitSequence();
        boolean boolean23 = characterReader16.matchConsumeIgnoreCase("hi!");
        java.lang.String str24 = characterReader16.consumeDigitSequence();
        characterReader16.mark();
        boolean boolean27 = characterReader16.matchesIgnoreCase("hi");
        java.lang.String str28 = characterReader16.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str31 = characterReader30.consumeLetterSequence();
        java.lang.String str32 = characterReader30.toString();
        boolean boolean34 = characterReader30.matchConsume("");
        java.lang.String str35 = characterReader30.consumeHexSequence();
        characterReader30.mark();
        org.jsoup.parser.CharacterReader characterReader38 = new org.jsoup.parser.CharacterReader("");
        characterReader38.rewindToMark();
        characterReader38.mark();
        org.jsoup.parser.CharacterReader characterReader42 = new org.jsoup.parser.CharacterReader("");
        char[] charArray47 = new char[] { '#', 'a', '\uffff', 'a' };
        boolean boolean48 = characterReader42.matchesAny(charArray47);
        boolean boolean49 = characterReader38.matchesAny(charArray47);
        boolean boolean50 = characterReader30.matchesAny(charArray47);
        java.lang.String str51 = characterReader16.consumeToAny(charArray47);
        boolean boolean52 = characterReader8.matchesAny(charArray47);
        boolean boolean53 = characterReader1.matchesAny(charArray47);
        boolean boolean55 = characterReader1.matches('i');
        char char56 = characterReader1.consume();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + 'i' + "'", char12 == 'i');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + char56 + "' != '" + 'i' + "'", char56 == 'i');
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        char[] charArray6 = new char[] { '\uffff', 'a' };
        java.lang.String str7 = characterReader1.consumeToAny(charArray6);
        boolean boolean9 = characterReader1.matchConsume("hi!");
        int int10 = characterReader1.pos();
        boolean boolean12 = characterReader1.matchConsumeIgnoreCase("");
        int int13 = characterReader1.pos();
        boolean boolean15 = characterReader1.containsIgnoreCase("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray6 = new char[] { '#', 'a', '\uffff', 'a' };
        boolean boolean7 = characterReader1.matchesAny(charArray6);
        characterReader1.rewindToMark();
        boolean boolean10 = characterReader1.matches('#');
        char char11 = characterReader1.current();
        characterReader1.mark();
        boolean boolean14 = characterReader1.containsIgnoreCase("h");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\uffff' + "'", char11 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str11 = characterReader10.consumeLetterSequence();
        characterReader10.rewindToMark();
        char[] charArray15 = new char[] { '\uffff', 'a' };
        java.lang.String str16 = characterReader10.consumeToAny(charArray15);
        boolean boolean17 = characterReader8.matchesAny(charArray15);
        java.lang.String str18 = characterReader1.consumeToAny(charArray15);
        boolean boolean20 = characterReader1.matchConsume("hi!");
        boolean boolean21 = characterReader1.matchesDigit();
        boolean boolean23 = characterReader1.matches('4');
        char char24 = characterReader1.consume();
        boolean boolean26 = characterReader1.matchConsumeIgnoreCase("i!");
        char char27 = characterReader1.current();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\uffff' + "'", char24 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '\uffff' + "'", char27 == '\uffff');
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        java.lang.String str4 = characterReader1.toString();
        boolean boolean6 = characterReader1.matches("hi");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        char[] charArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.consumeToAny(charArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!" + "'", str4, "!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        characterReader1.rewindToMark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        boolean boolean7 = characterReader1.matchesIgnoreCase("");
        char char8 = characterReader1.current();
        characterReader1.rewindToMark();
        boolean boolean11 = characterReader1.containsIgnoreCase("h");
        java.lang.String str12 = characterReader1.consumeDigitSequence();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str9 = characterReader1.toString();
        boolean boolean11 = characterReader1.matches('#');
        boolean boolean13 = characterReader1.containsIgnoreCase("!");
        boolean boolean15 = characterReader1.matches('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = characterReader1.consumeTo('h');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.unconsume();
        java.lang.String str9 = characterReader1.consumeHexSequence();
        boolean boolean11 = characterReader1.matches("");
        boolean boolean12 = characterReader1.matchesDigit();
        boolean boolean14 = characterReader1.matchConsume("");
        char char15 = characterReader1.consume();
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("");
        characterReader17.rewindToMark();
        boolean boolean20 = characterReader17.matches("");
        java.lang.String str21 = characterReader17.consumeHexSequence();
        java.lang.String str22 = characterReader17.consumeDigitSequence();
        boolean boolean24 = characterReader17.matchConsumeIgnoreCase("hi!");
        java.lang.String str25 = characterReader17.consumeDigitSequence();
        characterReader17.mark();
        boolean boolean28 = characterReader17.matches('4');
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str31 = characterReader30.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader33 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str34 = characterReader33.consumeLetterSequence();
        java.lang.String str35 = characterReader33.consumeDigitSequence();
        characterReader33.rewindToMark();
        java.lang.String str37 = characterReader33.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader39 = new org.jsoup.parser.CharacterReader("");
        char[] charArray40 = new char[] {};
        boolean boolean41 = characterReader39.matchesAny(charArray40);
        java.lang.String str42 = characterReader33.consumeToAny(charArray40);
        java.lang.String str43 = characterReader30.consumeToAny(charArray40);
        boolean boolean44 = characterReader17.matchesAny(charArray40);
        java.lang.String str45 = characterReader1.consumeToAny(charArray40);
        boolean boolean47 = characterReader1.containsIgnoreCase("");
        boolean boolean49 = characterReader1.matchConsume("i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\uffff' + "'", char15 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("h");
        boolean boolean2 = characterReader1.matchesDigit();
        int int3 = characterReader1.pos();
        java.lang.String str4 = characterReader1.consumeToEnd();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        int int2 = characterReader1.pos();
        boolean boolean4 = characterReader1.matches('a');
        org.jsoup.parser.CharacterReader characterReader6 = new org.jsoup.parser.CharacterReader("");
        char[] charArray11 = new char[] { '#', 'a', '\uffff', 'a' };
        boolean boolean12 = characterReader6.matchesAny(charArray11);
        boolean boolean13 = characterReader1.matchesAny(charArray11);
        boolean boolean14 = characterReader1.isEmpty();
        boolean boolean16 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str18 = characterReader1.consumeTo("h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        characterReader1.rewindToMark();
        char char5 = characterReader1.consume();
        boolean boolean7 = characterReader1.matchConsume("");
        char char8 = characterReader1.current();
        characterReader1.unconsume();
        boolean boolean11 = characterReader1.matchConsumeIgnoreCase("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\uffff' + "'", char5 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        characterReader1.rewindToMark();
        boolean boolean6 = characterReader1.matchConsumeIgnoreCase("hi");
        boolean boolean8 = characterReader1.matchesIgnoreCase("h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        characterReader1.advance();
        char char6 = characterReader1.consume();
        int int7 = characterReader1.pos();
        characterReader1.rewindToMark();
        characterReader1.advance();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'i' + "'", char6 == 'i');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str9 = characterReader1.toString();
        boolean boolean11 = characterReader1.containsIgnoreCase("i!");
        java.lang.String str12 = characterReader1.consumeHexSequence();
        int int13 = characterReader1.pos();
        java.lang.String str14 = characterReader1.toString();
        characterReader1.unconsume();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray2 = new char[] {};
        boolean boolean3 = characterReader1.matchesAny(charArray2);
        java.lang.String str4 = characterReader1.consumeLetterSequence();
        characterReader1.advance();
        characterReader1.unconsume();
        char char7 = characterReader1.current();
        boolean boolean9 = characterReader1.containsIgnoreCase("!");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        characterReader1.advance();
        char char6 = characterReader1.consume();
        int int7 = characterReader1.pos();
        boolean boolean9 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean11 = characterReader1.matchConsume("hi!");
        boolean boolean13 = characterReader1.containsIgnoreCase("");
        char char14 = characterReader1.consume();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'i' + "'", char6 == 'i');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '!' + "'", char14 == '!');
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        int int4 = characterReader1.pos();
        boolean boolean6 = characterReader1.matchesIgnoreCase("");
        characterReader1.rewindToMark();
        boolean boolean8 = characterReader1.isEmpty();
        characterReader1.rewindToMark();
        boolean boolean10 = characterReader1.matchesDigit();
        characterReader1.rewindToMark();
        boolean boolean12 = characterReader1.isEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str4 = characterReader1.consumeTo("");
        characterReader1.mark();
        java.lang.String str6 = characterReader1.toString();
        boolean boolean8 = characterReader1.containsIgnoreCase("");
        characterReader1.advance();
        boolean boolean11 = characterReader1.matchesIgnoreCase("!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        java.lang.String str4 = characterReader1.consumeLetterSequence();
        boolean boolean6 = characterReader1.matchConsumeIgnoreCase("hi!");
        characterReader1.advance();
        boolean boolean9 = characterReader1.matchesIgnoreCase("hi");
        int int10 = characterReader1.pos();
        char char11 = characterReader1.consume();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\uffff' + "'", char11 == '\uffff');
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        org.jsoup.parser.CharacterReader characterReader5 = new org.jsoup.parser.CharacterReader("");
        characterReader5.rewindToMark();
        boolean boolean8 = characterReader5.matches("");
        java.lang.String str9 = characterReader5.consumeHexSequence();
        java.lang.String str10 = characterReader5.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader14 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str15 = characterReader14.consumeLetterSequence();
        characterReader14.rewindToMark();
        char[] charArray19 = new char[] { '\uffff', 'a' };
        java.lang.String str20 = characterReader14.consumeToAny(charArray19);
        boolean boolean21 = characterReader12.matchesAny(charArray19);
        java.lang.String str22 = characterReader5.consumeToAny(charArray19);
        java.lang.String str23 = characterReader1.consumeToAny(charArray19);
        boolean boolean25 = characterReader1.matches('4');
        boolean boolean26 = characterReader1.matchesDigit();
        java.lang.String str27 = characterReader1.consumeLetterSequence();
        java.lang.String str28 = characterReader1.consumeLetterSequence();
        int int29 = characterReader1.pos();
        org.jsoup.parser.CharacterReader characterReader31 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str32 = characterReader31.consumeLetterSequence();
        char char33 = characterReader31.consume();
        characterReader31.unconsume();
        boolean boolean36 = characterReader31.matchesIgnoreCase("");
        char char37 = characterReader31.current();
        org.jsoup.parser.CharacterReader characterReader39 = new org.jsoup.parser.CharacterReader("");
        characterReader39.rewindToMark();
        characterReader39.mark();
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("");
        char[] charArray48 = new char[] { '#', 'a', '\uffff', 'a' };
        boolean boolean49 = characterReader43.matchesAny(charArray48);
        boolean boolean50 = characterReader39.matchesAny(charArray48);
        boolean boolean51 = characterReader31.matchesAny(charArray48);
        java.lang.String str52 = characterReader31.toString();
        boolean boolean54 = characterReader31.containsIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader56 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str57 = characterReader56.consumeLetterSequence();
        characterReader56.rewindToMark();
        characterReader56.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader61 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader63 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str64 = characterReader63.consumeLetterSequence();
        characterReader63.rewindToMark();
        char[] charArray68 = new char[] { '\uffff', 'a' };
        java.lang.String str69 = characterReader63.consumeToAny(charArray68);
        boolean boolean70 = characterReader61.matchesAny(charArray68);
        boolean boolean71 = characterReader56.matchesAny(charArray68);
        java.lang.String str72 = characterReader31.consumeToAny(charArray68);
        java.lang.String str73 = characterReader1.consumeToAny(charArray68);
        java.lang.String str74 = characterReader1.consumeHexSequence();
        java.lang.String str75 = characterReader1.consumeLetterSequence();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '\uffff' + "'", char33 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + char37 + "' != '" + '\uffff' + "'", char37 == '\uffff');
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        org.jsoup.parser.CharacterReader characterReader5 = new org.jsoup.parser.CharacterReader("");
        characterReader5.rewindToMark();
        boolean boolean8 = characterReader5.matches("");
        java.lang.String str9 = characterReader5.consumeHexSequence();
        java.lang.String str10 = characterReader5.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader14 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str15 = characterReader14.consumeLetterSequence();
        characterReader14.rewindToMark();
        char[] charArray19 = new char[] { '\uffff', 'a' };
        java.lang.String str20 = characterReader14.consumeToAny(charArray19);
        boolean boolean21 = characterReader12.matchesAny(charArray19);
        java.lang.String str22 = characterReader5.consumeToAny(charArray19);
        java.lang.String str23 = characterReader1.consumeToAny(charArray19);
        boolean boolean25 = characterReader1.matches('4');
        boolean boolean26 = characterReader1.matchesDigit();
        characterReader1.advance();
        char char28 = characterReader1.consume();
        boolean boolean30 = characterReader1.matchesIgnoreCase("h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\uffff' + "'", char28 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        characterReader1.rewindToMark();
        java.lang.String str4 = characterReader1.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader6 = new org.jsoup.parser.CharacterReader("");
        characterReader6.rewindToMark();
        boolean boolean9 = characterReader6.matches("");
        java.lang.String str10 = characterReader6.consumeHexSequence();
        characterReader6.advance();
        characterReader6.rewindToMark();
        java.lang.String str13 = characterReader6.consumeLetterSequence();
        char char14 = characterReader6.current();
        java.lang.String str15 = characterReader6.consumeLetterSequence();
        boolean boolean16 = characterReader6.isEmpty();
        org.jsoup.parser.CharacterReader characterReader18 = new org.jsoup.parser.CharacterReader("");
        char[] charArray19 = new char[] {};
        boolean boolean20 = characterReader18.matchesAny(charArray19);
        boolean boolean21 = characterReader18.isEmpty();
        java.lang.String str22 = characterReader18.toString();
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str25 = characterReader24.consumeLetterSequence();
        java.lang.String str26 = characterReader24.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str29 = characterReader28.consumeLetterSequence();
        java.lang.String str30 = characterReader28.toString();
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("");
        characterReader32.rewindToMark();
        boolean boolean35 = characterReader32.matches("");
        java.lang.String str36 = characterReader32.consumeHexSequence();
        java.lang.String str37 = characterReader32.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader39 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader41 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str42 = characterReader41.consumeLetterSequence();
        characterReader41.rewindToMark();
        char[] charArray46 = new char[] { '\uffff', 'a' };
        java.lang.String str47 = characterReader41.consumeToAny(charArray46);
        boolean boolean48 = characterReader39.matchesAny(charArray46);
        java.lang.String str49 = characterReader32.consumeToAny(charArray46);
        java.lang.String str50 = characterReader28.consumeToAny(charArray46);
        boolean boolean52 = characterReader28.matches('4');
        java.lang.String str53 = characterReader28.consumeAsString();
        boolean boolean54 = characterReader28.isEmpty();
        boolean boolean56 = characterReader28.matches("hi");
        org.jsoup.parser.CharacterReader characterReader58 = new org.jsoup.parser.CharacterReader("");
        char[] charArray59 = new char[] {};
        boolean boolean60 = characterReader58.matchesAny(charArray59);
        boolean boolean61 = characterReader28.matchesAny(charArray59);
        boolean boolean62 = characterReader24.matchesAny(charArray59);
        boolean boolean63 = characterReader18.matchesAny(charArray59);
        boolean boolean64 = characterReader6.matchesAny(charArray59);
        boolean boolean65 = characterReader1.matchesAny(charArray59);
        boolean boolean67 = characterReader1.matches("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\uffff' + "'", char14 == '\uffff');
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        characterReader1.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader6 = new org.jsoup.parser.CharacterReader("");
        characterReader6.rewindToMark();
        boolean boolean9 = characterReader6.matches("");
        java.lang.String str10 = characterReader6.consumeHexSequence();
        characterReader6.advance();
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        char[] charArray18 = new char[] { '#', 'a', '\uffff', 'a' };
        boolean boolean19 = characterReader13.matchesAny(charArray18);
        boolean boolean20 = characterReader6.matchesAny(charArray18);
        java.lang.String str21 = characterReader1.consumeToAny(charArray18);
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str24 = characterReader23.consumeLetterSequence();
        java.lang.String str25 = characterReader23.consumeDigitSequence();
        characterReader23.rewindToMark();
        java.lang.String str27 = characterReader23.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader29 = new org.jsoup.parser.CharacterReader("");
        char[] charArray30 = new char[] {};
        boolean boolean31 = characterReader29.matchesAny(charArray30);
        java.lang.String str32 = characterReader23.consumeToAny(charArray30);
        boolean boolean33 = characterReader1.matchesAny(charArray30);
        boolean boolean34 = characterReader1.isEmpty();
        boolean boolean36 = characterReader1.matches('i');
        java.lang.String str37 = characterReader1.consumeDigitSequence();
        java.lang.String str38 = characterReader1.consumeDigitSequence();
        characterReader1.unconsume();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        characterReader1.rewindToMark();
        boolean boolean9 = characterReader1.matchConsume("hi");
        boolean boolean10 = characterReader1.matchesLetter();
        characterReader1.mark();
        java.lang.String str12 = characterReader1.consumeDigitSequence();
        boolean boolean14 = characterReader1.matchesIgnoreCase("h");
        char char15 = characterReader1.consume();
        boolean boolean17 = characterReader1.matchesIgnoreCase("i!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = characterReader1.consumeLetterSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\uffff' + "'", char15 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str11 = characterReader10.consumeLetterSequence();
        characterReader10.rewindToMark();
        char[] charArray15 = new char[] { '\uffff', 'a' };
        java.lang.String str16 = characterReader10.consumeToAny(charArray15);
        boolean boolean17 = characterReader8.matchesAny(charArray15);
        java.lang.String str18 = characterReader1.consumeToAny(charArray15);
        boolean boolean20 = characterReader1.matchConsume("hi!");
        boolean boolean21 = characterReader1.matchesDigit();
        char char22 = characterReader1.current();
        boolean boolean23 = characterReader1.matchesDigit();
        boolean boolean24 = characterReader1.isEmpty();
        char char25 = characterReader1.current();
        boolean boolean27 = characterReader1.matches("!");
        characterReader1.rewindToMark();
        java.lang.String str29 = characterReader1.consumeHexSequence();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\uffff' + "'", char22 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\uffff' + "'", char25 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        int int4 = characterReader1.pos();
        java.lang.String str5 = characterReader1.consumeDigitSequence();
        java.lang.String str6 = characterReader1.consumeAsString();
        characterReader1.mark();
        characterReader1.advance();
        boolean boolean9 = characterReader1.isEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        characterReader1.unconsume();
        boolean boolean6 = characterReader1.matchesIgnoreCase("");
        char char7 = characterReader1.current();
        java.lang.String str8 = characterReader1.consumeAsString();
        boolean boolean9 = characterReader1.isEmpty();
        boolean boolean10 = characterReader1.isEmpty();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        characterReader12.rewindToMark();
        boolean boolean15 = characterReader12.matches("");
        java.lang.String str16 = characterReader12.consumeHexSequence();
        characterReader12.advance();
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("");
        char[] charArray24 = new char[] { '#', 'a', '\uffff', 'a' };
        boolean boolean25 = characterReader19.matchesAny(charArray24);
        boolean boolean26 = characterReader12.matchesAny(charArray24);
        java.lang.String str27 = characterReader1.consumeToAny(charArray24);
        boolean boolean29 = characterReader1.containsIgnoreCase("!");
        org.jsoup.parser.CharacterReader characterReader31 = new org.jsoup.parser.CharacterReader("");
        characterReader31.rewindToMark();
        boolean boolean34 = characterReader31.matches("");
        java.lang.String str35 = characterReader31.consumeHexSequence();
        characterReader31.advance();
        org.jsoup.parser.CharacterReader characterReader38 = new org.jsoup.parser.CharacterReader("");
        char[] charArray43 = new char[] { '#', 'a', '\uffff', 'a' };
        boolean boolean44 = characterReader38.matchesAny(charArray43);
        boolean boolean45 = characterReader31.matchesAny(charArray43);
        java.lang.String str46 = characterReader1.consumeToAny(charArray43);
        boolean boolean47 = characterReader1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = characterReader1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        boolean boolean5 = characterReader1.matchConsume("hi!");
        char char6 = characterReader1.current();
        characterReader1.mark();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        characterReader9.rewindToMark();
        boolean boolean12 = characterReader9.matches("");
        java.lang.String str13 = characterReader9.consumeHexSequence();
        java.lang.String str14 = characterReader9.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader18 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str19 = characterReader18.consumeLetterSequence();
        characterReader18.rewindToMark();
        char[] charArray23 = new char[] { '\uffff', 'a' };
        java.lang.String str24 = characterReader18.consumeToAny(charArray23);
        boolean boolean25 = characterReader16.matchesAny(charArray23);
        java.lang.String str26 = characterReader9.consumeToAny(charArray23);
        java.lang.String str27 = characterReader1.consumeToAny(charArray23);
        int int28 = characterReader1.pos();
        boolean boolean30 = characterReader1.containsIgnoreCase("!");
        characterReader1.unconsume();
        char char32 = characterReader1.consume();
        boolean boolean33 = characterReader1.matchesDigit();
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = characterReader1.consumeTo("h");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 2, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\uffff' + "'", char6 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\uffff' + "'", char32 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        org.jsoup.parser.CharacterReader characterReader6 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str7 = characterReader6.consumeLetterSequence();
        java.lang.String str8 = characterReader6.consumeDigitSequence();
        characterReader6.rewindToMark();
        java.lang.String str10 = characterReader6.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        char[] charArray13 = new char[] {};
        boolean boolean14 = characterReader12.matchesAny(charArray13);
        java.lang.String str15 = characterReader6.consumeToAny(charArray13);
        boolean boolean16 = characterReader1.matchesAny(charArray13);
        boolean boolean17 = characterReader1.matchesLetter();
        int int18 = characterReader1.pos();
        char char19 = characterReader1.consume();
        boolean boolean21 = characterReader1.matchConsumeIgnoreCase("");
        characterReader1.mark();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\uffff' + "'", char19 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        boolean boolean4 = characterReader1.matchesLetter();
        int int5 = characterReader1.pos();
        characterReader1.unconsume();
        java.lang.String str7 = characterReader1.consumeAsString();
        characterReader1.advance();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        characterReader1.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader6 = new org.jsoup.parser.CharacterReader("");
        characterReader6.rewindToMark();
        boolean boolean9 = characterReader6.matches("");
        java.lang.String str10 = characterReader6.consumeHexSequence();
        characterReader6.advance();
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        char[] charArray18 = new char[] { '#', 'a', '\uffff', 'a' };
        boolean boolean19 = characterReader13.matchesAny(charArray18);
        boolean boolean20 = characterReader6.matchesAny(charArray18);
        java.lang.String str21 = characterReader1.consumeToAny(charArray18);
        boolean boolean22 = characterReader1.matchesDigit();
        boolean boolean23 = characterReader1.isEmpty();
        boolean boolean25 = characterReader1.matches("!");
        boolean boolean27 = characterReader1.matches("h");
        boolean boolean29 = characterReader1.matchConsume("i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        characterReader1.rewindToMark();
        boolean boolean5 = characterReader1.isEmpty();
        boolean boolean6 = characterReader1.matchesLetter();
        characterReader1.advance();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        int int4 = characterReader1.pos();
        java.lang.String str5 = characterReader1.consumeLetterSequence();
        java.lang.String str6 = characterReader1.consumeHexSequence();
        characterReader1.unconsume();
        char char8 = characterReader1.current();
        java.lang.String str9 = characterReader1.consumeToEnd();
        boolean boolean10 = characterReader1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = characterReader1.consumeTo('!');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 3, end 2, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'i' + "'", char8 == 'i');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "i" + "'", str9, "i");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str9 = characterReader1.consumeDigitSequence();
        characterReader1.mark();
        int int11 = characterReader1.pos();
        java.lang.String str12 = characterReader1.toString();
        org.jsoup.parser.CharacterReader characterReader14 = new org.jsoup.parser.CharacterReader("");
        characterReader14.rewindToMark();
        boolean boolean17 = characterReader14.matches("");
        java.lang.String str18 = characterReader14.consumeHexSequence();
        java.lang.String str19 = characterReader14.consumeDigitSequence();
        boolean boolean21 = characterReader14.matchConsumeIgnoreCase("hi!");
        java.lang.String str22 = characterReader14.consumeDigitSequence();
        characterReader14.mark();
        boolean boolean25 = characterReader14.matches('4');
        org.jsoup.parser.CharacterReader characterReader27 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str28 = characterReader27.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str31 = characterReader30.consumeLetterSequence();
        java.lang.String str32 = characterReader30.consumeDigitSequence();
        characterReader30.rewindToMark();
        java.lang.String str34 = characterReader30.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader36 = new org.jsoup.parser.CharacterReader("");
        char[] charArray37 = new char[] {};
        boolean boolean38 = characterReader36.matchesAny(charArray37);
        java.lang.String str39 = characterReader30.consumeToAny(charArray37);
        java.lang.String str40 = characterReader27.consumeToAny(charArray37);
        boolean boolean41 = characterReader14.matchesAny(charArray37);
        java.lang.String str42 = characterReader1.consumeToAny(charArray37);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        int int4 = characterReader1.pos();
        java.lang.String str5 = characterReader1.consumeDigitSequence();
        boolean boolean6 = characterReader1.matchesLetter();
        boolean boolean8 = characterReader1.matchConsume("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        characterReader1.advance();
        boolean boolean6 = characterReader1.containsIgnoreCase("");
        characterReader1.unconsume();
        boolean boolean8 = characterReader1.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        characterReader10.rewindToMark();
        boolean boolean13 = characterReader10.matches("");
        java.lang.String str14 = characterReader10.consumeHexSequence();
        java.lang.String str15 = characterReader10.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str20 = characterReader19.consumeLetterSequence();
        characterReader19.rewindToMark();
        char[] charArray24 = new char[] { '\uffff', 'a' };
        java.lang.String str25 = characterReader19.consumeToAny(charArray24);
        boolean boolean26 = characterReader17.matchesAny(charArray24);
        java.lang.String str27 = characterReader10.consumeToAny(charArray24);
        java.lang.String str28 = characterReader10.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str31 = characterReader30.consumeLetterSequence();
        java.lang.String str32 = characterReader30.consumeDigitSequence();
        characterReader30.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader35 = new org.jsoup.parser.CharacterReader("");
        characterReader35.rewindToMark();
        boolean boolean38 = characterReader35.matches("");
        java.lang.String str39 = characterReader35.consumeHexSequence();
        characterReader35.advance();
        org.jsoup.parser.CharacterReader characterReader42 = new org.jsoup.parser.CharacterReader("");
        char[] charArray47 = new char[] { '#', 'a', '\uffff', 'a' };
        boolean boolean48 = characterReader42.matchesAny(charArray47);
        boolean boolean49 = characterReader35.matchesAny(charArray47);
        java.lang.String str50 = characterReader30.consumeToAny(charArray47);
        org.jsoup.parser.CharacterReader characterReader52 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str53 = characterReader52.consumeLetterSequence();
        java.lang.String str54 = characterReader52.consumeDigitSequence();
        characterReader52.rewindToMark();
        java.lang.String str56 = characterReader52.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader58 = new org.jsoup.parser.CharacterReader("");
        char[] charArray59 = new char[] {};
        boolean boolean60 = characterReader58.matchesAny(charArray59);
        java.lang.String str61 = characterReader52.consumeToAny(charArray59);
        boolean boolean62 = characterReader30.matchesAny(charArray59);
        boolean boolean63 = characterReader30.isEmpty();
        boolean boolean65 = characterReader30.matches('i');
        org.jsoup.parser.CharacterReader characterReader67 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str68 = characterReader67.consumeLetterSequence();
        java.lang.String str69 = characterReader67.consumeDigitSequence();
        characterReader67.rewindToMark();
        java.lang.String str71 = characterReader67.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader73 = new org.jsoup.parser.CharacterReader("");
        char[] charArray74 = new char[] {};
        boolean boolean75 = characterReader73.matchesAny(charArray74);
        java.lang.String str76 = characterReader67.consumeToAny(charArray74);
        boolean boolean77 = characterReader30.matchesAny(charArray74);
        java.lang.String str78 = characterReader10.consumeToAny(charArray74);
        boolean boolean79 = characterReader1.matchesAny(charArray74);
        char[] charArray80 = null;
        java.lang.String str81 = characterReader1.consumeToAny(charArray80);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(charArray74);
        org.junit.Assert.assertArrayEquals(charArray74, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
    }
}

