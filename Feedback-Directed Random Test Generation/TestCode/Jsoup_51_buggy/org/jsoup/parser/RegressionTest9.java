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
        char[] charArray6 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        java.lang.String str8 = characterReader1.consumeHexSequence();
        boolean boolean10 = characterReader1.matches('\uffff');
        java.lang.String str11 = characterReader1.consumeToEnd();
        java.lang.String str12 = characterReader1.consumeDigitSequence();
        boolean boolean13 = characterReader1.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader15 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str16 = characterReader15.consumeLetterThenDigitSequence();
        boolean boolean18 = characterReader15.matches(' ');
        boolean boolean20 = characterReader15.matchesIgnoreCase("hi!");
        int int22 = characterReader15.nextIndexOf((java.lang.CharSequence) "hi!");
        characterReader15.rewindToMark();
        java.lang.String str24 = characterReader15.consumeData();
        java.lang.String str25 = characterReader15.consumeLetterThenDigitSequence();
        java.lang.String str26 = characterReader15.consumeTagName();
        java.lang.String str27 = characterReader15.consumeHexSequence();
        org.jsoup.parser.CharacterReader characterReader29 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str30 = characterReader29.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("");
        char[] charArray37 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str38 = characterReader32.consumeToAnySorted(charArray37);
        boolean boolean39 = characterReader29.matchesAnySorted(charArray37);
        java.lang.String str40 = characterReader29.consumeLetterThenDigitSequence();
        int int41 = characterReader29.pos();
        boolean boolean43 = characterReader29.matchConsumeIgnoreCase("i!");
        org.jsoup.parser.CharacterReader characterReader45 = new org.jsoup.parser.CharacterReader("");
        int int47 = characterReader45.nextIndexOf(' ');
        char[] charArray49 = new char[] { '4' };
        java.lang.String str50 = characterReader45.consumeToAny(charArray49);
        boolean boolean51 = characterReader29.matchesAny(charArray49);
        org.jsoup.parser.CharacterReader characterReader53 = new org.jsoup.parser.CharacterReader("");
        char[] charArray58 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str59 = characterReader53.consumeToAnySorted(charArray58);
        java.lang.String str60 = characterReader29.consumeToAny(charArray58);
        boolean boolean61 = characterReader15.matchesAnySorted(charArray58);
        java.lang.String str62 = characterReader1.consumeToAny(charArray58);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertArrayEquals(charArray58, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        int int8 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        java.lang.String str9 = characterReader1.toString();
        java.lang.String str10 = characterReader1.consumeHexSequence();
        boolean boolean12 = characterReader1.matchConsumeIgnoreCase("i!");
        org.jsoup.parser.CharacterReader characterReader14 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str15 = characterReader14.consumeLetterThenDigitSequence();
        boolean boolean17 = characterReader14.matches(' ');
        java.lang.String str18 = characterReader14.toString();
        char char19 = characterReader14.current();
        boolean boolean21 = characterReader14.matchConsumeIgnoreCase("");
        java.lang.String str22 = characterReader14.toString();
        boolean boolean24 = characterReader14.containsIgnoreCase("h");
        org.jsoup.parser.CharacterReader characterReader26 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str27 = characterReader26.consumeLetterThenDigitSequence();
        boolean boolean29 = characterReader26.matches(' ');
        char char30 = characterReader26.current();
        char[] charArray32 = new char[] { '4' };
        boolean boolean33 = characterReader26.matchesAny(charArray32);
        boolean boolean34 = characterReader14.matchesAny(charArray32);
        boolean boolean35 = characterReader1.matchesAnySorted(charArray32);
        java.lang.Class<?> wildcardClass36 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\uffff' + "'", char19 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '\uffff' + "'", char30 == '\uffff');
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        char char3 = characterReader1.current();
        int int5 = characterReader1.nextIndexOf(' ');
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        int int8 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        char char9 = characterReader1.current();
        java.lang.String str10 = characterReader1.toString();
        java.lang.String str12 = characterReader1.consumeTo('h');
        boolean boolean16 = characterReader1.rangeEquals((int) (byte) 100, (int) ' ', "hi");
        boolean boolean18 = characterReader1.matchesIgnoreCase("hi");
        char char19 = characterReader1.current();
        java.lang.String str20 = characterReader1.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader22.unconsume();
        characterReader22.rewindToMark();
        boolean boolean25 = characterReader22.matchesDigit();
        java.lang.String str26 = characterReader22.consumeAsString();
        boolean boolean27 = characterReader22.matchesLetter();
        java.lang.String str28 = characterReader22.consumeHexSequence();
        char char29 = characterReader22.consume();
        int int30 = characterReader22.pos();
        boolean boolean32 = characterReader22.matches('!');
        boolean boolean33 = characterReader22.isEmpty();
        org.jsoup.parser.CharacterReader characterReader35 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str36 = characterReader35.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader38 = new org.jsoup.parser.CharacterReader("");
        char[] charArray43 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str44 = characterReader38.consumeToAnySorted(charArray43);
        boolean boolean45 = characterReader35.matchesAnySorted(charArray43);
        char[] charArray49 = new char[] { '\uffff', '4', '\uffff' };
        boolean boolean50 = characterReader35.matchesAnySorted(charArray49);
        boolean boolean54 = characterReader35.rangeEquals((-1), (int) ' ', "hi!");
        boolean boolean55 = characterReader35.matchesDigit();
        characterReader35.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader58 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str60 = characterReader58.consumeTo('#');
        characterReader58.mark();
        org.jsoup.parser.CharacterReader characterReader63 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str64 = characterReader63.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader66 = new org.jsoup.parser.CharacterReader("");
        char[] charArray71 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str72 = characterReader66.consumeToAnySorted(charArray71);
        boolean boolean73 = characterReader63.matchesAny(charArray71);
        boolean boolean74 = characterReader58.matchesAny(charArray71);
        java.lang.String str75 = characterReader35.consumeToAny(charArray71);
        java.lang.String str76 = characterReader22.consumeToAny(charArray71);
        boolean boolean77 = characterReader1.matchesAnySorted(charArray71);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\uffff' + "'", char19 == '\uffff');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "h" + "'", str26, "h");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + 'i' + "'", char29 == 'i');
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] { '\uffff', '4', '\uffff' });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertArrayEquals(charArray71, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "!" + "'", str76, "!");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray6 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        java.lang.String str8 = characterReader1.consumeHexSequence();
        java.lang.String str10 = characterReader1.consumeTo('#');
        int int11 = characterReader1.pos();
        characterReader1.mark();
        boolean boolean14 = characterReader1.matches("hi");
        boolean boolean15 = characterReader1.matchesLetter();
        boolean boolean17 = characterReader1.matchConsume("i!");
        characterReader1.advance();
        boolean boolean20 = characterReader1.matchesIgnoreCase("hi");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        char char3 = characterReader1.current();
        int int5 = characterReader1.nextIndexOf(' ');
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        int int8 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        char char9 = characterReader1.current();
        java.lang.String str10 = characterReader1.toString();
        java.lang.String str12 = characterReader1.consumeTo('h');
        java.lang.String str13 = characterReader1.consumeTagName();
        char char14 = characterReader1.consume();
        characterReader1.mark();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\uffff' + "'", char14 == '\uffff');
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray6 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        java.lang.String str8 = characterReader1.consumeHexSequence();
        boolean boolean10 = characterReader1.matches('\uffff');
        java.lang.String str11 = characterReader1.consumeToEnd();
        java.lang.String str12 = characterReader1.consumeDigitSequence();
        boolean boolean13 = characterReader1.matchesDigit();
        int int14 = characterReader1.pos();
        char char15 = characterReader1.current();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\uffff' + "'", char15 == '\uffff');
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean2 = characterReader1.matchesDigit();
        int int3 = characterReader1.pos();
        boolean boolean4 = characterReader1.isEmpty();
        java.lang.String str5 = characterReader1.consumeDigitSequence();
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.consumeDigitSequence();
        java.lang.String str9 = characterReader1.consumeData();
        int int11 = characterReader1.nextIndexOf('h');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi" + "'", str6, "hi");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "!" + "'", str9, "!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('#');
        boolean boolean5 = characterReader1.matches("");
        boolean boolean9 = characterReader1.rangeEquals((int) '4', (int) '4', "");
        int int11 = characterReader1.nextIndexOf('4');
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str14 = characterReader13.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        char[] charArray21 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str22 = characterReader16.consumeToAnySorted(charArray21);
        boolean boolean23 = characterReader13.matchesAnySorted(charArray21);
        java.lang.String str24 = characterReader1.consumeToAny(charArray21);
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = characterReader1.matchConsumeIgnoreCase("!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matchesDigit();
        java.lang.String str5 = characterReader1.consumeAsString();
        boolean boolean6 = characterReader1.matchesLetter();
        java.lang.String str7 = characterReader1.consumeHexSequence();
        char char8 = characterReader1.consume();
        java.lang.String str9 = characterReader1.consumeData();
        org.jsoup.parser.CharacterReader characterReader11 = new org.jsoup.parser.CharacterReader("");
        int int13 = characterReader11.nextIndexOf(' ');
        char[] charArray15 = new char[] { '4' };
        java.lang.String str16 = characterReader11.consumeToAny(charArray15);
        boolean boolean17 = characterReader1.matchesAnySorted(charArray15);
        java.lang.String str18 = characterReader1.consumeDigitSequence();
        boolean boolean19 = characterReader1.matchesLetter();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'i' + "'", char8 == 'i');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "!" + "'", str9, "!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("!");
        char char2 = characterReader1.consume();
        boolean boolean4 = characterReader1.containsIgnoreCase("h");
        int int5 = characterReader1.pos();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '!' + "'", char2 == '!');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        int int8 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        java.lang.String str9 = characterReader1.toString();
        org.jsoup.parser.CharacterReader characterReader11 = new org.jsoup.parser.CharacterReader("");
        char[] charArray16 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str17 = characterReader11.consumeToAnySorted(charArray16);
        java.lang.String str18 = characterReader1.consumeToAny(charArray16);
        characterReader1.advance();
        int int21 = characterReader1.nextIndexOf('h');
        int int22 = characterReader1.pos();
        boolean boolean24 = characterReader1.matches('h');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        char char3 = characterReader1.current();
        int int5 = characterReader1.nextIndexOf(' ');
        boolean boolean6 = characterReader1.matchesLetter();
        boolean boolean10 = characterReader1.rangeEquals(3, (int) ' ', "hi!");
        boolean boolean14 = characterReader1.rangeEquals(3, (int) '4', "i!");
        java.lang.String str15 = characterReader1.consumeToEnd();
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str18 = characterReader17.consumeLetterThenDigitSequence();
        char char19 = characterReader17.current();
        int int21 = characterReader17.nextIndexOf(' ');
        java.lang.String str22 = characterReader17.consumeLetterSequence();
        int int24 = characterReader17.nextIndexOf((java.lang.CharSequence) "hi!");
        char char25 = characterReader17.current();
        java.lang.String str26 = characterReader17.consumeDigitSequence();
        boolean boolean27 = characterReader17.isEmpty();
        char[] charArray28 = new char[] {};
        java.lang.String str29 = characterReader17.consumeToAny(charArray28);
        characterReader17.advance();
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str34 = characterReader32.consumeTo('#');
        boolean boolean36 = characterReader32.matches("");
        boolean boolean40 = characterReader32.rangeEquals((int) '4', (int) '4', "");
        boolean boolean42 = characterReader32.matches('h');
        org.jsoup.parser.CharacterReader characterReader44 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader44.unconsume();
        characterReader44.rewindToMark();
        boolean boolean48 = characterReader44.matches("");
        boolean boolean49 = characterReader44.matchesDigit();
        char char50 = characterReader44.consume();
        org.jsoup.parser.CharacterReader characterReader52 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str53 = characterReader52.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader55 = new org.jsoup.parser.CharacterReader("");
        char[] charArray60 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str61 = characterReader55.consumeToAnySorted(charArray60);
        boolean boolean62 = characterReader52.matchesAnySorted(charArray60);
        java.lang.String str63 = characterReader44.consumeToAnySorted(charArray60);
        boolean boolean64 = characterReader32.matchesAny(charArray60);
        org.jsoup.parser.CharacterReader characterReader66 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader66.unconsume();
        characterReader66.rewindToMark();
        boolean boolean69 = characterReader66.matchesDigit();
        java.lang.String str70 = characterReader66.consumeAsString();
        boolean boolean72 = characterReader66.matchConsumeIgnoreCase("");
        java.lang.String str73 = characterReader66.toString();
        boolean boolean75 = characterReader66.matches('a');
        boolean boolean77 = characterReader66.matchConsume("hi");
        boolean boolean79 = characterReader66.matchConsumeIgnoreCase("h");
        org.jsoup.parser.CharacterReader characterReader81 = new org.jsoup.parser.CharacterReader("");
        int int83 = characterReader81.nextIndexOf(' ');
        char[] charArray85 = new char[] { '4' };
        java.lang.String str86 = characterReader81.consumeToAny(charArray85);
        java.lang.String str87 = characterReader66.consumeToAnySorted(charArray85);
        boolean boolean88 = characterReader32.matchesAny(charArray85);
        java.lang.String str89 = characterReader17.consumeToAny(charArray85);
        java.lang.String str90 = characterReader1.consumeToAny(charArray85);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\uffff' + "'", char19 == '\uffff');
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\uffff' + "'", char25 == '\uffff');
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + char50 + "' != '" + 'h' + "'", char50 == 'h');
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertArrayEquals(charArray60, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "i!" + "'", str63, "i!");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "h" + "'", str70, "h");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "i!" + "'", str73, "i!");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(charArray85);
        org.junit.Assert.assertArrayEquals(charArray85, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "i!" + "'", str87, "i!");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader4 = new org.jsoup.parser.CharacterReader("");
        char[] charArray9 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str10 = characterReader4.consumeToAnySorted(charArray9);
        boolean boolean11 = characterReader1.matchesAnySorted(charArray9);
        java.lang.String str12 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean14 = characterReader1.matches('a');
        char char15 = characterReader1.current();
        boolean boolean17 = characterReader1.containsIgnoreCase("h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\uffff' + "'", char15 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        int int3 = characterReader1.nextIndexOf(' ');
        java.lang.String str4 = characterReader1.toString();
        boolean boolean6 = characterReader1.matchConsumeIgnoreCase("!");
        java.lang.String str7 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str9 = characterReader1.consumeTo('\uffff');
        boolean boolean11 = characterReader1.matches('a');
        characterReader1.advance();
        boolean boolean14 = characterReader1.matches("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('#');
        char[] charArray7 = new char[] { '#', '#', 'a' };
        boolean boolean8 = characterReader1.matchesAny(charArray7);
        java.lang.String str9 = characterReader1.consumeTagName();
        java.lang.String str10 = characterReader1.consumeHexSequence();
        java.lang.String str12 = characterReader1.consumeTo('h');
        java.lang.String str13 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean15 = characterReader1.containsIgnoreCase("i");
        boolean boolean17 = characterReader1.matchConsume("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean8 = characterReader1.matches('a');
        boolean boolean9 = characterReader1.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader11 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str13 = characterReader11.consumeTo('#');
        characterReader11.mark();
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str17 = characterReader16.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("");
        char[] charArray24 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str25 = characterReader19.consumeToAnySorted(charArray24);
        boolean boolean26 = characterReader16.matchesAny(charArray24);
        boolean boolean27 = characterReader11.matchesAny(charArray24);
        java.lang.String str28 = characterReader1.consumeToAny(charArray24);
        characterReader1.mark();
        char char30 = characterReader1.current();
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader32.unconsume();
        characterReader32.rewindToMark();
        boolean boolean35 = characterReader32.matchesDigit();
        java.lang.String str36 = characterReader32.consumeAsString();
        boolean boolean38 = characterReader32.matchConsumeIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader40 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str41 = characterReader40.consumeLetterThenDigitSequence();
        boolean boolean43 = characterReader40.matches(' ');
        boolean boolean45 = characterReader40.matchesIgnoreCase("hi!");
        boolean boolean47 = characterReader40.matches('a');
        boolean boolean48 = characterReader40.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader50 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str52 = characterReader50.consumeTo('#');
        characterReader50.mark();
        org.jsoup.parser.CharacterReader characterReader55 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str56 = characterReader55.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader58 = new org.jsoup.parser.CharacterReader("");
        char[] charArray63 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str64 = characterReader58.consumeToAnySorted(charArray63);
        boolean boolean65 = characterReader55.matchesAny(charArray63);
        boolean boolean66 = characterReader50.matchesAny(charArray63);
        java.lang.String str67 = characterReader40.consumeToAny(charArray63);
        java.lang.String str68 = characterReader32.consumeToAny(charArray63);
        boolean boolean69 = characterReader1.matchesAny(charArray63);
        java.lang.String str70 = characterReader1.consumeData();
        char char71 = characterReader1.current();
        java.lang.String str72 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean73 = characterReader1.isEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '\uffff' + "'", char30 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "h" + "'", str36, "h");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertArrayEquals(charArray63, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "i!" + "'", str68, "i!");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + char71 + "' != '" + '\uffff' + "'", char71 == '\uffff');
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader4 = new org.jsoup.parser.CharacterReader("");
        char[] charArray9 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str10 = characterReader4.consumeToAnySorted(charArray9);
        boolean boolean11 = characterReader1.matchesAnySorted(charArray9);
        char[] charArray15 = new char[] { '\uffff', '4', '\uffff' };
        boolean boolean16 = characterReader1.matchesAnySorted(charArray15);
        boolean boolean20 = characterReader1.rangeEquals((-1), (int) ' ', "hi!");
        java.lang.String str21 = characterReader1.consumeToEnd();
        characterReader1.advance();
        java.lang.String str23 = characterReader1.consumeLetterSequence();
        java.lang.Class<?> wildcardClass24 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', '4', '\uffff' });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('#');
        boolean boolean5 = characterReader1.matches("");
        boolean boolean9 = characterReader1.rangeEquals((int) '4', (int) '4', "");
        boolean boolean11 = characterReader1.matches('h');
        boolean boolean13 = characterReader1.containsIgnoreCase("i!");
        boolean boolean15 = characterReader1.matches("hi");
        java.lang.String str16 = characterReader1.consumeData();
        boolean boolean17 = characterReader1.matchesDigit();
        boolean boolean21 = characterReader1.rangeEquals(100, (int) (byte) 10, "!");
        java.lang.String str22 = characterReader1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        java.lang.String str5 = characterReader1.toString();
        char char6 = characterReader1.current();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str9 = characterReader1.toString();
        java.lang.String str10 = characterReader1.consumeData();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str13 = characterReader12.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader15 = new org.jsoup.parser.CharacterReader("");
        char[] charArray20 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str21 = characterReader15.consumeToAnySorted(charArray20);
        boolean boolean22 = characterReader12.matchesAnySorted(charArray20);
        characterReader12.rewindToMark();
        characterReader12.mark();
        java.lang.String str25 = characterReader12.toString();
        org.jsoup.parser.CharacterReader characterReader27 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str29 = characterReader27.consumeTo('#');
        char[] charArray33 = new char[] { '#', '#', 'a' };
        boolean boolean34 = characterReader27.matchesAny(charArray33);
        boolean boolean35 = characterReader12.matchesAnySorted(charArray33);
        boolean boolean36 = characterReader1.matchesAnySorted(charArray33);
        boolean boolean38 = characterReader1.matchConsume("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\uffff' + "'", char6 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('#');
        boolean boolean5 = characterReader1.matches("");
        boolean boolean9 = characterReader1.rangeEquals((int) '4', (int) '4', "");
        boolean boolean11 = characterReader1.matches('h');
        boolean boolean13 = characterReader1.containsIgnoreCase("i!");
        boolean boolean15 = characterReader1.matches('i');
        java.lang.String str16 = characterReader1.consumeLetterSequence();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 0, count 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        char char5 = characterReader1.current();
        boolean boolean7 = characterReader1.matches('\uffff');
        characterReader1.advance();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\uffff' + "'", char5 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean2 = characterReader1.matchesLetter();
        java.lang.String str3 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str4 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str5 = characterReader1.consumeAsString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!" + "'", str5, "!");
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        char char3 = characterReader1.current();
        int int5 = characterReader1.nextIndexOf(' ');
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        int int7 = characterReader1.pos();
        boolean boolean9 = characterReader1.matches("h");
        boolean boolean11 = characterReader1.matchConsume("!");
        characterReader1.mark();
        java.lang.String str13 = characterReader1.consumeHexSequence();
        int int15 = characterReader1.nextIndexOf((java.lang.CharSequence) "i");
        int int17 = characterReader1.nextIndexOf('4');
        char char18 = characterReader1.current();
        java.lang.String str19 = characterReader1.toString();
        boolean boolean20 = characterReader1.isEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\uffff' + "'", char18 == '\uffff');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        char char5 = characterReader1.current();
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = characterReader1.matchesAny(charArray7);
        boolean boolean10 = characterReader1.matches("i");
        char char11 = characterReader1.consume();
        characterReader1.unconsume();
        java.lang.String str13 = characterReader1.toString();
        java.lang.String str14 = characterReader1.consumeLetterSequence();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\uffff' + "'", char5 == '\uffff');
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\uffff' + "'", char11 == '\uffff');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        char char5 = characterReader1.current();
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = characterReader1.matchesAny(charArray7);
        java.lang.String str10 = characterReader1.consumeTo('\uffff');
        java.lang.String str12 = characterReader1.consumeTo('a');
        int int14 = characterReader1.nextIndexOf(' ');
        boolean boolean15 = characterReader1.matchesDigit();
        java.lang.String str16 = characterReader1.consumeData();
        int int18 = characterReader1.nextIndexOf('h');
        boolean boolean20 = characterReader1.matchConsume("i!");
        java.lang.String str21 = characterReader1.consumeHexSequence();
        boolean boolean23 = characterReader1.containsIgnoreCase("!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\uffff' + "'", char5 == '\uffff');
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        int int8 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        java.lang.String str9 = characterReader1.toString();
        characterReader1.mark();
        java.lang.String str12 = characterReader1.consumeTo("!");
        org.jsoup.parser.CharacterReader characterReader14 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str15 = characterReader14.consumeLetterThenDigitSequence();
        char char16 = characterReader14.current();
        int int18 = characterReader14.nextIndexOf(' ');
        java.lang.String str19 = characterReader14.consumeLetterSequence();
        int int20 = characterReader14.pos();
        boolean boolean22 = characterReader14.matchConsumeIgnoreCase("hi!");
        characterReader14.mark();
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean26 = characterReader25.matchesLetter();
        int int27 = characterReader25.pos();
        java.lang.String str28 = characterReader25.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str31 = characterReader30.consumeLetterThenDigitSequence();
        boolean boolean33 = characterReader30.matches(' ');
        boolean boolean35 = characterReader30.matchesIgnoreCase("hi!");
        boolean boolean37 = characterReader30.matches('a');
        boolean boolean38 = characterReader30.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader40 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str42 = characterReader40.consumeTo('#');
        characterReader40.mark();
        org.jsoup.parser.CharacterReader characterReader45 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str46 = characterReader45.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader48 = new org.jsoup.parser.CharacterReader("");
        char[] charArray53 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str54 = characterReader48.consumeToAnySorted(charArray53);
        boolean boolean55 = characterReader45.matchesAny(charArray53);
        boolean boolean56 = characterReader40.matchesAny(charArray53);
        java.lang.String str57 = characterReader30.consumeToAny(charArray53);
        org.jsoup.parser.CharacterReader characterReader59 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str60 = characterReader59.consumeLetterThenDigitSequence();
        boolean boolean62 = characterReader59.matches(' ');
        boolean boolean64 = characterReader59.matchesIgnoreCase("hi!");
        boolean boolean66 = characterReader59.matches('a');
        boolean boolean67 = characterReader59.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader69 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str71 = characterReader69.consumeTo('#');
        characterReader69.mark();
        org.jsoup.parser.CharacterReader characterReader74 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str75 = characterReader74.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader77 = new org.jsoup.parser.CharacterReader("");
        char[] charArray82 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str83 = characterReader77.consumeToAnySorted(charArray82);
        boolean boolean84 = characterReader74.matchesAny(charArray82);
        boolean boolean85 = characterReader69.matchesAny(charArray82);
        java.lang.String str86 = characterReader59.consumeToAny(charArray82);
        boolean boolean87 = characterReader30.matchesAnySorted(charArray82);
        java.lang.String str88 = characterReader25.consumeToAny(charArray82);
        java.lang.String str89 = characterReader14.consumeToAny(charArray82);
        java.lang.String str90 = characterReader1.consumeToAny(charArray82);
        java.lang.Class<?> wildcardClass91 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\uffff' + "'", char16 == '\uffff');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h" + "'", str28, "h");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(charArray82);
        org.junit.Assert.assertArrayEquals(charArray82, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "i!" + "'", str88, "i!");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matchesDigit();
        java.lang.String str5 = characterReader1.consumeAsString();
        java.lang.String str7 = characterReader1.consumeTo('a');
        int int9 = characterReader1.nextIndexOf('h');
        boolean boolean11 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str12 = characterReader1.consumeToEnd();
        boolean boolean16 = characterReader1.rangeEquals((int) (short) 0, (-1), "!");
        characterReader1.unconsume();
        java.lang.String str18 = characterReader1.consumeToEnd();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "i!" + "'", str7, "i!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "!" + "'", str18, "!");
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader4 = new org.jsoup.parser.CharacterReader("");
        char[] charArray9 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str10 = characterReader4.consumeToAnySorted(charArray9);
        boolean boolean11 = characterReader1.matchesAny(charArray9);
        java.lang.String str12 = characterReader1.consumeHexSequence();
        java.lang.String str13 = characterReader1.consumeData();
        org.jsoup.parser.CharacterReader characterReader15 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str17 = characterReader15.consumeTo('#');
        characterReader15.mark();
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str21 = characterReader20.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        char[] charArray28 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str29 = characterReader23.consumeToAnySorted(charArray28);
        boolean boolean30 = characterReader20.matchesAny(charArray28);
        boolean boolean31 = characterReader15.matchesAny(charArray28);
        java.lang.String str32 = characterReader1.consumeToAny(charArray28);
        org.jsoup.parser.CharacterReader characterReader34 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str35 = characterReader34.consumeLetterThenDigitSequence();
        boolean boolean37 = characterReader34.matches(' ');
        boolean boolean39 = characterReader34.matchesIgnoreCase("hi!");
        int int41 = characterReader34.nextIndexOf((java.lang.CharSequence) "hi!");
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader45 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str46 = characterReader45.consumeLetterThenDigitSequence();
        boolean boolean48 = characterReader45.matches(' ');
        boolean boolean50 = characterReader45.matchesIgnoreCase("hi!");
        org.jsoup.parser.CharacterReader characterReader52 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str53 = characterReader52.consumeLetterThenDigitSequence();
        boolean boolean55 = characterReader52.matches(' ');
        char char56 = characterReader52.current();
        char[] charArray58 = new char[] { '4' };
        boolean boolean59 = characterReader52.matchesAny(charArray58);
        boolean boolean60 = characterReader45.matchesAnySorted(charArray58);
        java.lang.String str61 = characterReader43.consumeToAnySorted(charArray58);
        boolean boolean62 = characterReader34.matchesAny(charArray58);
        java.lang.String str63 = characterReader1.consumeToAny(charArray58);
        char char64 = characterReader1.current();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + char56 + "' != '" + '\uffff' + "'", char56 == '\uffff');
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertArrayEquals(charArray58, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + char64 + "' != '" + '\uffff' + "'", char64 == '\uffff');
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean8 = characterReader1.matches('a');
        characterReader1.advance();
        boolean boolean13 = characterReader1.rangeEquals((int) (byte) 10, (int) (short) 10, "i!");
        boolean boolean14 = characterReader1.matchesLetter();
        boolean boolean16 = characterReader1.matches("h");
        java.lang.String str17 = characterReader1.consumeTagName();
        java.lang.String str18 = characterReader1.consumeLetterSequence();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader4 = new org.jsoup.parser.CharacterReader("");
        char[] charArray9 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str10 = characterReader4.consumeToAnySorted(charArray9);
        boolean boolean11 = characterReader1.matchesAnySorted(charArray9);
        char char12 = characterReader1.consume();
        boolean boolean14 = characterReader1.matchesIgnoreCase("");
        int int16 = characterReader1.nextIndexOf('\uffff');
        boolean boolean18 = characterReader1.matchConsume("i!");
        boolean boolean20 = characterReader1.matches('!');
        int int21 = characterReader1.pos();
        java.lang.String str22 = characterReader1.consumeData();
        char char23 = characterReader1.current();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\uffff' + "'", char12 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\uffff' + "'", char23 == '\uffff');
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader4 = new org.jsoup.parser.CharacterReader("");
        char[] charArray9 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str10 = characterReader4.consumeToAnySorted(charArray9);
        boolean boolean11 = characterReader1.matchesAnySorted(charArray9);
        boolean boolean13 = characterReader1.matchConsume("hi!");
        org.jsoup.parser.CharacterReader characterReader15 = new org.jsoup.parser.CharacterReader("");
        int int17 = characterReader15.nextIndexOf(' ');
        char[] charArray19 = new char[] { '4' };
        java.lang.String str20 = characterReader15.consumeToAny(charArray19);
        java.lang.String str21 = characterReader1.consumeToAny(charArray19);
        boolean boolean22 = characterReader1.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("");
        char[] charArray29 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str30 = characterReader24.consumeToAnySorted(charArray29);
        java.lang.String str31 = characterReader24.consumeHexSequence();
        boolean boolean33 = characterReader24.matches('\uffff');
        java.lang.String str34 = characterReader24.consumeToEnd();
        java.lang.String str35 = characterReader24.consumeLetterThenDigitSequence();
        int int36 = characterReader24.pos();
        org.jsoup.parser.CharacterReader characterReader38 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str39 = characterReader38.consumeLetterThenDigitSequence();
        char char40 = characterReader38.current();
        int int42 = characterReader38.nextIndexOf(' ');
        java.lang.String str43 = characterReader38.consumeLetterSequence();
        int int44 = characterReader38.pos();
        boolean boolean46 = characterReader38.matches("h");
        org.jsoup.parser.CharacterReader characterReader48 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str49 = characterReader48.consumeLetterThenDigitSequence();
        char char50 = characterReader48.current();
        boolean boolean54 = characterReader48.rangeEquals(0, (int) (short) 1, "");
        org.jsoup.parser.CharacterReader characterReader56 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str57 = characterReader56.consumeLetterThenDigitSequence();
        boolean boolean59 = characterReader56.matches(' ');
        boolean boolean61 = characterReader56.matchesIgnoreCase("hi!");
        boolean boolean63 = characterReader56.matches('a');
        boolean boolean64 = characterReader56.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader66 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str68 = characterReader66.consumeTo('#');
        characterReader66.mark();
        org.jsoup.parser.CharacterReader characterReader71 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str72 = characterReader71.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader74 = new org.jsoup.parser.CharacterReader("");
        char[] charArray79 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str80 = characterReader74.consumeToAnySorted(charArray79);
        boolean boolean81 = characterReader71.matchesAny(charArray79);
        boolean boolean82 = characterReader66.matchesAny(charArray79);
        java.lang.String str83 = characterReader56.consumeToAny(charArray79);
        java.lang.String str84 = characterReader48.consumeToAny(charArray79);
        boolean boolean85 = characterReader38.matchesAnySorted(charArray79);
        boolean boolean86 = characterReader24.matchesAnySorted(charArray79);
        java.lang.String str87 = characterReader1.consumeToAnySorted(charArray79);
        int int89 = characterReader1.nextIndexOf('#');
        java.lang.String str90 = characterReader1.consumeData();
        boolean boolean91 = characterReader1.matchesLetter();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + char40 + "' != '" + '\uffff' + "'", char40 == '\uffff');
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + char50 + "' != '" + '\uffff' + "'", char50 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertArrayEquals(charArray79, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matchesDigit();
        java.lang.String str5 = characterReader1.consumeAsString();
        characterReader1.unconsume();
        java.lang.String str7 = characterReader1.consumeTagName();
        boolean boolean9 = characterReader1.containsIgnoreCase("h");
        boolean boolean11 = characterReader1.containsIgnoreCase("i");
        int int13 = characterReader1.nextIndexOf('!');
        org.jsoup.parser.CharacterReader characterReader15 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader15.unconsume();
        characterReader15.rewindToMark();
        boolean boolean19 = characterReader15.matches("");
        boolean boolean20 = characterReader15.matchesDigit();
        char char21 = characterReader15.consume();
        characterReader15.rewindToMark();
        java.lang.String str23 = characterReader15.consumeToEnd();
        boolean boolean25 = characterReader15.matchConsume("hi!");
        org.jsoup.parser.CharacterReader characterReader27 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str28 = characterReader27.consumeLetterThenDigitSequence();
        boolean boolean30 = characterReader27.matches(' ');
        char char31 = characterReader27.current();
        boolean boolean35 = characterReader27.rangeEquals((int) '#', (int) (short) 100, "h");
        java.lang.String str36 = characterReader27.consumeTagName();
        org.jsoup.parser.CharacterReader characterReader38 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean39 = characterReader38.matchesDigit();
        char char40 = characterReader38.current();
        boolean boolean42 = characterReader38.matchConsume("i");
        java.lang.String str43 = characterReader38.consumeData();
        org.jsoup.parser.CharacterReader characterReader45 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str46 = characterReader45.consumeLetterThenDigitSequence();
        char char47 = characterReader45.current();
        int int49 = characterReader45.nextIndexOf(' ');
        java.lang.String str50 = characterReader45.consumeLetterSequence();
        int int52 = characterReader45.nextIndexOf((java.lang.CharSequence) "hi!");
        characterReader45.mark();
        java.lang.String str54 = characterReader45.consumeHexSequence();
        char[] charArray57 = new char[] { '#', 'a' };
        java.lang.String str58 = characterReader45.consumeToAny(charArray57);
        java.lang.String str59 = characterReader38.consumeToAny(charArray57);
        boolean boolean60 = characterReader27.matchesAny(charArray57);
        java.lang.String str61 = characterReader15.consumeToAny(charArray57);
        boolean boolean62 = characterReader1.matchesAny(charArray57);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + 'h' + "'", char21 == 'h');
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + char31 + "' != '" + '\uffff' + "'", char31 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + char40 + "' != '" + 'h' + "'", char40 == 'h');
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + char47 + "' != '" + '\uffff' + "'", char47 == '\uffff');
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertArrayEquals(charArray57, new char[] { '#', 'a' });
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean2 = characterReader1.matchesDigit();
        int int4 = characterReader1.nextIndexOf('#');
        characterReader1.advance();
        characterReader1.advance();
        boolean boolean7 = characterReader1.isEmpty();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader9.unconsume();
        characterReader9.rewindToMark();
        boolean boolean13 = characterReader9.matches("");
        boolean boolean14 = characterReader9.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader16.unconsume();
        characterReader16.rewindToMark();
        boolean boolean19 = characterReader16.matchesDigit();
        java.lang.String str20 = characterReader16.consumeAsString();
        boolean boolean22 = characterReader16.matchConsumeIgnoreCase("");
        java.lang.String str23 = characterReader16.toString();
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str27 = characterReader25.consumeTo('#');
        char[] charArray31 = new char[] { '#', '#', 'a' };
        boolean boolean32 = characterReader25.matchesAny(charArray31);
        java.lang.String str33 = characterReader16.consumeToAnySorted(charArray31);
        boolean boolean34 = characterReader9.matchesAnySorted(charArray31);
        int int36 = characterReader9.nextIndexOf('a');
        boolean boolean37 = characterReader9.isEmpty();
        boolean boolean39 = characterReader9.matchConsumeIgnoreCase("hi");
        int int41 = characterReader9.nextIndexOf((java.lang.CharSequence) "hi");
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str44 = characterReader43.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader46 = new org.jsoup.parser.CharacterReader("");
        char[] charArray51 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str52 = characterReader46.consumeToAnySorted(charArray51);
        boolean boolean53 = characterReader43.matchesAnySorted(charArray51);
        org.jsoup.parser.CharacterReader characterReader55 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader55.unconsume();
        characterReader55.rewindToMark();
        boolean boolean59 = characterReader55.matches("");
        boolean boolean60 = characterReader55.matchesDigit();
        char char61 = characterReader55.consume();
        org.jsoup.parser.CharacterReader characterReader63 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str64 = characterReader63.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader66 = new org.jsoup.parser.CharacterReader("");
        char[] charArray71 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str72 = characterReader66.consumeToAnySorted(charArray71);
        boolean boolean73 = characterReader63.matchesAnySorted(charArray71);
        java.lang.String str74 = characterReader55.consumeToAnySorted(charArray71);
        boolean boolean75 = characterReader43.matchesAnySorted(charArray71);
        boolean boolean76 = characterReader9.matchesAnySorted(charArray71);
        boolean boolean77 = characterReader1.matchesAnySorted(charArray71);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h" + "'", str20, "h");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "i!" + "'", str23, "i!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "i!" + "'", str33, "i!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + char61 + "' != '" + 'h' + "'", char61 == 'h');
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertArrayEquals(charArray71, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "i!" + "'", str74, "i!");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean8 = characterReader1.matches('a');
        characterReader1.advance();
        boolean boolean13 = characterReader1.rangeEquals((int) (byte) 10, (int) (short) 10, "i!");
        boolean boolean14 = characterReader1.matchesLetter();
        java.lang.String str15 = characterReader1.consumeLetterThenDigitSequence();
        characterReader1.advance();
        boolean boolean17 = characterReader1.isEmpty();
        boolean boolean18 = characterReader1.isEmpty();
        boolean boolean20 = characterReader1.matchConsumeIgnoreCase("!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('#');
        boolean boolean5 = characterReader1.matches("");
        boolean boolean9 = characterReader1.rangeEquals((int) '4', (int) '4', "");
        int int11 = characterReader1.nextIndexOf('4');
        boolean boolean12 = characterReader1.isEmpty();
        java.lang.String str13 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean15 = characterReader1.matches('\uffff');
        int int17 = characterReader1.nextIndexOf((java.lang.CharSequence) "i!");
        java.lang.String str18 = characterReader1.consumeHexSequence();
        java.lang.String str19 = characterReader1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matchesDigit();
        java.lang.String str5 = characterReader1.consumeAsString();
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str8 = characterReader1.toString();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str12 = characterReader10.consumeTo('#');
        char[] charArray16 = new char[] { '#', '#', 'a' };
        boolean boolean17 = characterReader10.matchesAny(charArray16);
        java.lang.String str18 = characterReader1.consumeToAnySorted(charArray16);
        characterReader1.advance();
        boolean boolean20 = characterReader1.matchesDigit();
        boolean boolean22 = characterReader1.matchConsumeIgnoreCase("hi!");
        boolean boolean26 = characterReader1.rangeEquals((int) (short) 100, (-1), "");
        characterReader1.rewindToMark();
        java.lang.String str28 = characterReader1.consumeTagName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i!" + "'", str8, "i!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "i!" + "'", str18, "i!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('#');
        boolean boolean5 = characterReader1.matches("");
        boolean boolean9 = characterReader1.rangeEquals((int) '4', (int) '4', "");
        int int11 = characterReader1.nextIndexOf('4');
        java.lang.String str13 = characterReader1.consumeTo('h');
        boolean boolean17 = characterReader1.rangeEquals((int) (short) 10, (int) '#', "hi");
        boolean boolean21 = characterReader1.rangeEquals((int) (short) 10, (int) 'a', "hi");
        characterReader1.rewindToMark();
        java.lang.String str23 = characterReader1.consumeLetterSequence();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean5 = characterReader1.matches("");
        boolean boolean6 = characterReader1.matchesDigit();
        char char7 = characterReader1.consume();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str10 = characterReader9.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        char[] charArray17 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str18 = characterReader12.consumeToAnySorted(charArray17);
        boolean boolean19 = characterReader9.matchesAnySorted(charArray17);
        java.lang.String str20 = characterReader1.consumeToAnySorted(charArray17);
        characterReader1.advance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'h' + "'", char7 == 'h');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "i!" + "'", str20, "i!");
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matchesDigit();
        java.lang.String str5 = characterReader1.consumeAsString();
        boolean boolean6 = characterReader1.matchesLetter();
        java.lang.String str7 = characterReader1.consumeHexSequence();
        char char8 = characterReader1.consume();
        int int9 = characterReader1.pos();
        characterReader1.rewindToMark();
        characterReader1.unconsume();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'i' + "'", char8 == 'i');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray6 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        java.lang.String str8 = characterReader1.consumeHexSequence();
        java.lang.String str10 = characterReader1.consumeTo('#');
        int int11 = characterReader1.pos();
        java.lang.String str12 = characterReader1.consumeTagName();
        boolean boolean16 = characterReader1.rangeEquals(0, (int) '\uffff', "i!");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader4 = new org.jsoup.parser.CharacterReader("");
        char[] charArray9 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str10 = characterReader4.consumeToAnySorted(charArray9);
        boolean boolean11 = characterReader1.matchesAnySorted(charArray9);
        boolean boolean13 = characterReader1.matchConsume("hi!");
        char[] charArray14 = null;
        boolean boolean15 = characterReader1.matchesAnySorted(charArray14);
        characterReader1.advance();
        java.lang.String str17 = characterReader1.consumeTagName();
        java.lang.String str18 = characterReader1.consumeData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean8 = characterReader1.matches('a');
        boolean boolean9 = characterReader1.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader11 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str13 = characterReader11.consumeTo('#');
        characterReader11.mark();
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str17 = characterReader16.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("");
        char[] charArray24 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str25 = characterReader19.consumeToAnySorted(charArray24);
        boolean boolean26 = characterReader16.matchesAny(charArray24);
        boolean boolean27 = characterReader11.matchesAny(charArray24);
        java.lang.String str28 = characterReader1.consumeToAny(charArray24);
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str31 = characterReader30.consumeLetterThenDigitSequence();
        boolean boolean33 = characterReader30.matches(' ');
        boolean boolean35 = characterReader30.matchesIgnoreCase("hi!");
        boolean boolean37 = characterReader30.matches('a');
        boolean boolean38 = characterReader30.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader40 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str42 = characterReader40.consumeTo('#');
        characterReader40.mark();
        org.jsoup.parser.CharacterReader characterReader45 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str46 = characterReader45.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader48 = new org.jsoup.parser.CharacterReader("");
        char[] charArray53 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str54 = characterReader48.consumeToAnySorted(charArray53);
        boolean boolean55 = characterReader45.matchesAny(charArray53);
        boolean boolean56 = characterReader40.matchesAny(charArray53);
        java.lang.String str57 = characterReader30.consumeToAny(charArray53);
        boolean boolean58 = characterReader1.matchesAnySorted(charArray53);
        java.lang.String str60 = characterReader1.consumeTo("hi");
        java.lang.String str61 = characterReader1.consumeTagName();
        boolean boolean63 = characterReader1.matchesIgnoreCase("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader4 = new org.jsoup.parser.CharacterReader("");
        char[] charArray9 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str10 = characterReader4.consumeToAnySorted(charArray9);
        boolean boolean11 = characterReader1.matchesAnySorted(charArray9);
        characterReader1.rewindToMark();
        characterReader1.mark();
        java.lang.String str14 = characterReader1.toString();
        java.lang.String str15 = characterReader1.consumeData();
        java.lang.String str16 = characterReader1.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader18 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str19 = characterReader18.consumeLetterThenDigitSequence();
        boolean boolean21 = characterReader18.matches(' ');
        boolean boolean23 = characterReader18.matchesIgnoreCase("hi!");
        int int25 = characterReader18.nextIndexOf((java.lang.CharSequence) "hi!");
        java.lang.String str26 = characterReader18.toString();
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader("");
        char[] charArray33 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str34 = characterReader28.consumeToAnySorted(charArray33);
        java.lang.String str35 = characterReader18.consumeToAny(charArray33);
        java.lang.String str36 = characterReader1.consumeToAny(charArray33);
        boolean boolean38 = characterReader1.containsIgnoreCase("i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray6 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        java.lang.String str8 = characterReader1.consumeHexSequence();
        java.lang.String str9 = characterReader1.consumeToEnd();
        java.lang.String str10 = characterReader1.consumeData();
        int int12 = characterReader1.nextIndexOf((java.lang.CharSequence) "i");
        java.lang.String str14 = characterReader1.consumeTo("hi!");
        java.lang.String str15 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str16 = characterReader1.consumeData();
        boolean boolean17 = characterReader1.matchesLetter();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matchesDigit();
        java.lang.String str5 = characterReader1.consumeAsString();
        characterReader1.unconsume();
        java.lang.String str7 = characterReader1.consumeTagName();
        boolean boolean9 = characterReader1.matchConsume("!");
        boolean boolean10 = characterReader1.isEmpty();
        int int12 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        char char13 = characterReader1.current();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\uffff' + "'", char13 == '\uffff');
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        char char5 = characterReader1.current();
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = characterReader1.matchesAny(charArray7);
        java.lang.String str10 = characterReader1.consumeTo('\uffff');
        java.lang.String str12 = characterReader1.consumeTo('a');
        java.lang.String str14 = characterReader1.consumeTo("h");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 0, count 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\uffff' + "'", char5 == '\uffff');
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean2 = characterReader1.matchesDigit();
        int int4 = characterReader1.nextIndexOf('#');
        java.lang.String str5 = characterReader1.consumeLetterSequence();
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        java.lang.String str8 = characterReader1.consumeToEnd();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi" + "'", str5, "hi");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        java.lang.String str5 = characterReader1.toString();
        char char6 = characterReader1.current();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str9 = characterReader1.toString();
        java.lang.String str10 = characterReader1.consumeData();
        java.lang.String str11 = characterReader1.consumeLetterThenDigitSequence();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = characterReader1.containsIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\uffff' + "'", char6 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean2 = characterReader1.matchesDigit();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean4 = characterReader1.matchesLetter();
        java.lang.String str5 = characterReader1.consumeTagName();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str8 = characterReader7.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        char[] charArray15 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str16 = characterReader10.consumeToAnySorted(charArray15);
        boolean boolean17 = characterReader7.matchesAnySorted(charArray15);
        boolean boolean19 = characterReader7.matchConsume("hi!");
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("");
        int int23 = characterReader21.nextIndexOf(' ');
        char[] charArray25 = new char[] { '4' };
        java.lang.String str26 = characterReader21.consumeToAny(charArray25);
        java.lang.String str27 = characterReader7.consumeToAny(charArray25);
        org.jsoup.parser.CharacterReader characterReader29 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str30 = characterReader29.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("");
        char[] charArray37 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str38 = characterReader32.consumeToAnySorted(charArray37);
        boolean boolean39 = characterReader29.matchesAnySorted(charArray37);
        char[] charArray43 = new char[] { '\uffff', '4', '\uffff' };
        boolean boolean44 = characterReader29.matchesAnySorted(charArray43);
        boolean boolean45 = characterReader7.matchesAnySorted(charArray43);
        java.lang.String str46 = characterReader1.consumeToAnySorted(charArray43);
        java.lang.String str47 = characterReader1.consumeToEnd();
        org.jsoup.parser.CharacterReader characterReader49 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean50 = characterReader49.matchesLetter();
        java.lang.String str51 = characterReader49.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader53 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str54 = characterReader53.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader56 = new org.jsoup.parser.CharacterReader("");
        char[] charArray61 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str62 = characterReader56.consumeToAnySorted(charArray61);
        boolean boolean63 = characterReader53.matchesAnySorted(charArray61);
        org.jsoup.parser.CharacterReader characterReader65 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader65.unconsume();
        characterReader65.rewindToMark();
        boolean boolean69 = characterReader65.matches("");
        boolean boolean70 = characterReader65.matchesDigit();
        char char71 = characterReader65.consume();
        org.jsoup.parser.CharacterReader characterReader73 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str74 = characterReader73.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader76 = new org.jsoup.parser.CharacterReader("");
        char[] charArray81 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str82 = characterReader76.consumeToAnySorted(charArray81);
        boolean boolean83 = characterReader73.matchesAnySorted(charArray81);
        java.lang.String str84 = characterReader65.consumeToAnySorted(charArray81);
        boolean boolean85 = characterReader53.matchesAnySorted(charArray81);
        java.lang.String str86 = characterReader49.consumeToAnySorted(charArray81);
        boolean boolean87 = characterReader1.matchesAnySorted(charArray81);
        boolean boolean91 = characterReader1.rangeEquals((int) (byte) 0, 0, "");
        boolean boolean93 = characterReader1.matches('!');
        java.lang.String str94 = characterReader1.consumeHexSequence();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { '\uffff', '4', '\uffff' });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi" + "'", str51, "hi");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertArrayEquals(charArray61, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + char71 + "' != '" + 'h' + "'", char71 == 'h');
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertArrayEquals(charArray81, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "i!" + "'", str84, "i!");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "!" + "'", str86, "!");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray6 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        java.lang.String str8 = characterReader1.consumeHexSequence();
        boolean boolean10 = characterReader1.matches('\uffff');
        java.lang.String str11 = characterReader1.consumeToEnd();
        java.lang.String str12 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean13 = characterReader1.matchesLetter();
        java.lang.String str14 = characterReader1.toString();
        char char15 = characterReader1.current();
        characterReader1.mark();
        characterReader1.rewindToMark();
        boolean boolean19 = characterReader1.matches("hi!");
        characterReader1.unconsume();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\uffff' + "'", char15 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi");
        int int2 = characterReader1.pos();
        java.lang.String str3 = characterReader1.consumeToEnd();
        boolean boolean5 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str6 = characterReader1.consumeTagName();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str9 = characterReader8.consumeLetterThenDigitSequence();
        java.lang.String str11 = characterReader8.consumeTo(' ');
        java.lang.String str12 = characterReader8.consumeLetterSequence();
        boolean boolean13 = characterReader8.isEmpty();
        org.jsoup.parser.CharacterReader characterReader15 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str16 = characterReader15.consumeLetterThenDigitSequence();
        boolean boolean18 = characterReader15.matches(' ');
        char char19 = characterReader15.current();
        boolean boolean21 = characterReader15.matchConsume("i!");
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str25 = characterReader23.consumeTo('#');
        boolean boolean27 = characterReader23.matches("");
        boolean boolean31 = characterReader23.rangeEquals((int) '4', (int) '4', "");
        int int33 = characterReader23.nextIndexOf('4');
        boolean boolean34 = characterReader23.isEmpty();
        java.lang.String str35 = characterReader23.consumeLetterThenDigitSequence();
        java.lang.String str36 = characterReader23.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader38 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str39 = characterReader38.consumeLetterThenDigitSequence();
        boolean boolean41 = characterReader38.matches(' ');
        boolean boolean43 = characterReader38.matchesIgnoreCase("hi!");
        boolean boolean45 = characterReader38.matches('a');
        boolean boolean46 = characterReader38.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader48 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str50 = characterReader48.consumeTo('#');
        characterReader48.mark();
        org.jsoup.parser.CharacterReader characterReader53 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str54 = characterReader53.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader56 = new org.jsoup.parser.CharacterReader("");
        char[] charArray61 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str62 = characterReader56.consumeToAnySorted(charArray61);
        boolean boolean63 = characterReader53.matchesAny(charArray61);
        boolean boolean64 = characterReader48.matchesAny(charArray61);
        java.lang.String str65 = characterReader38.consumeToAny(charArray61);
        org.jsoup.parser.CharacterReader characterReader67 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str68 = characterReader67.consumeLetterThenDigitSequence();
        boolean boolean70 = characterReader67.matches(' ');
        boolean boolean72 = characterReader67.matchesIgnoreCase("hi!");
        boolean boolean74 = characterReader67.matches('a');
        boolean boolean75 = characterReader67.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader77 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str79 = characterReader77.consumeTo('#');
        characterReader77.mark();
        org.jsoup.parser.CharacterReader characterReader82 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str83 = characterReader82.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader85 = new org.jsoup.parser.CharacterReader("");
        char[] charArray90 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str91 = characterReader85.consumeToAnySorted(charArray90);
        boolean boolean92 = characterReader82.matchesAny(charArray90);
        boolean boolean93 = characterReader77.matchesAny(charArray90);
        java.lang.String str94 = characterReader67.consumeToAny(charArray90);
        boolean boolean95 = characterReader38.matchesAnySorted(charArray90);
        boolean boolean96 = characterReader23.matchesAnySorted(charArray90);
        boolean boolean97 = characterReader15.matchesAny(charArray90);
        java.lang.String str98 = characterReader8.consumeToAny(charArray90);
        java.lang.String str99 = characterReader1.consumeToAnySorted(charArray90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\uffff' + "'", char19 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertArrayEquals(charArray61, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(charArray90);
        org.junit.Assert.assertArrayEquals(charArray90, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "" + "'", str98, "");
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "" + "'", str99, "");
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean5 = characterReader1.matches("");
        boolean boolean6 = characterReader1.isEmpty();
        boolean boolean7 = characterReader1.matchesLetter();
        java.lang.String str8 = characterReader1.consumeDigitSequence();
        boolean boolean10 = characterReader1.matches("h");
        characterReader1.rewindToMark();
        java.lang.String str13 = characterReader1.consumeTo("!");
        org.jsoup.parser.CharacterReader characterReader15 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str17 = characterReader15.consumeTo('#');
        characterReader15.mark();
        java.lang.String str19 = characterReader15.consumeToEnd();
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str23 = characterReader21.consumeTo('#');
        boolean boolean25 = characterReader21.matches("");
        boolean boolean29 = characterReader21.rangeEquals((int) '4', (int) '4', "");
        boolean boolean31 = characterReader21.matches('h');
        org.jsoup.parser.CharacterReader characterReader33 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader33.unconsume();
        characterReader33.rewindToMark();
        boolean boolean37 = characterReader33.matches("");
        boolean boolean38 = characterReader33.matchesDigit();
        char char39 = characterReader33.consume();
        org.jsoup.parser.CharacterReader characterReader41 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str42 = characterReader41.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader44 = new org.jsoup.parser.CharacterReader("");
        char[] charArray49 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str50 = characterReader44.consumeToAnySorted(charArray49);
        boolean boolean51 = characterReader41.matchesAnySorted(charArray49);
        java.lang.String str52 = characterReader33.consumeToAnySorted(charArray49);
        boolean boolean53 = characterReader21.matchesAny(charArray49);
        boolean boolean54 = characterReader15.matchesAny(charArray49);
        boolean boolean55 = characterReader1.matchesAny(charArray49);
        org.jsoup.parser.CharacterReader characterReader57 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str59 = characterReader57.consumeTo('#');
        char[] charArray63 = new char[] { '#', '#', 'a' };
        boolean boolean64 = characterReader57.matchesAny(charArray63);
        java.lang.String str65 = characterReader1.consumeToAny(charArray63);
        int int67 = characterReader1.nextIndexOf('#');
        java.lang.String str68 = characterReader1.consumeLetterThenDigitSequence();
        int int69 = characterReader1.pos();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi" + "'", str13, "hi");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + char39 + "' != '" + 'h' + "'", char39 == 'h');
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "i!" + "'", str52, "i!");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertArrayEquals(charArray63, new char[] { '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "!" + "'", str65, "!");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 3 + "'", int69 == 3);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean2 = characterReader1.matchesLetter();
        int int3 = characterReader1.pos();
        java.lang.String str4 = characterReader1.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader6 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str7 = characterReader6.consumeLetterThenDigitSequence();
        boolean boolean9 = characterReader6.matches(' ');
        boolean boolean11 = characterReader6.matchesIgnoreCase("hi!");
        boolean boolean13 = characterReader6.matches('a');
        boolean boolean14 = characterReader6.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str18 = characterReader16.consumeTo('#');
        characterReader16.mark();
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str22 = characterReader21.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("");
        char[] charArray29 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str30 = characterReader24.consumeToAnySorted(charArray29);
        boolean boolean31 = characterReader21.matchesAny(charArray29);
        boolean boolean32 = characterReader16.matchesAny(charArray29);
        java.lang.String str33 = characterReader6.consumeToAny(charArray29);
        org.jsoup.parser.CharacterReader characterReader35 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str36 = characterReader35.consumeLetterThenDigitSequence();
        boolean boolean38 = characterReader35.matches(' ');
        boolean boolean40 = characterReader35.matchesIgnoreCase("hi!");
        boolean boolean42 = characterReader35.matches('a');
        boolean boolean43 = characterReader35.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader45 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str47 = characterReader45.consumeTo('#');
        characterReader45.mark();
        org.jsoup.parser.CharacterReader characterReader50 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str51 = characterReader50.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader53 = new org.jsoup.parser.CharacterReader("");
        char[] charArray58 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str59 = characterReader53.consumeToAnySorted(charArray58);
        boolean boolean60 = characterReader50.matchesAny(charArray58);
        boolean boolean61 = characterReader45.matchesAny(charArray58);
        java.lang.String str62 = characterReader35.consumeToAny(charArray58);
        boolean boolean63 = characterReader6.matchesAnySorted(charArray58);
        java.lang.String str64 = characterReader1.consumeToAny(charArray58);
        characterReader1.unconsume();
        characterReader1.mark();
        boolean boolean68 = characterReader1.matchesIgnoreCase("h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertArrayEquals(charArray58, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "i!" + "'", str64, "i!");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray6 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        java.lang.String str8 = characterReader1.consumeHexSequence();
        boolean boolean10 = characterReader1.matches('\uffff');
        boolean boolean11 = characterReader1.isEmpty();
        int int13 = characterReader1.nextIndexOf('a');
        java.lang.String str14 = characterReader1.consumeTagName();
        java.lang.String str15 = characterReader1.consumeData();
        boolean boolean19 = characterReader1.rangeEquals((int) ' ', 3, "h");
        boolean boolean21 = characterReader1.matchesIgnoreCase("!");
        int int22 = characterReader1.pos();
        char char23 = characterReader1.current();
        java.lang.String str25 = characterReader1.consumeTo("hi!");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\uffff' + "'", char23 == '\uffff');
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean2 = characterReader1.matchesLetter();
        boolean boolean6 = characterReader1.rangeEquals((int) (short) -1, (int) '#', "hi");
        java.lang.String str7 = characterReader1.consumeLetterSequence();
        boolean boolean8 = characterReader1.isEmpty();
        boolean boolean10 = characterReader1.matchConsumeIgnoreCase("i!");
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean13 = characterReader12.matchesLetter();
        boolean boolean17 = characterReader12.rangeEquals((int) (short) -1, (int) '#', "hi");
        java.lang.String str18 = characterReader12.consumeLetterSequence();
        java.lang.String str19 = characterReader12.consumeHexSequence();
        java.lang.String str20 = characterReader12.consumeData();
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean23 = characterReader22.matchesDigit();
        int int24 = characterReader22.pos();
        java.lang.String str25 = characterReader22.consumeTagName();
        java.lang.String str26 = characterReader22.consumeHexSequence();
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader28.unconsume();
        characterReader28.rewindToMark();
        boolean boolean32 = characterReader28.matches("");
        boolean boolean33 = characterReader28.isEmpty();
        org.jsoup.parser.CharacterReader characterReader35 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str36 = characterReader35.consumeLetterThenDigitSequence();
        char char37 = characterReader35.current();
        int int39 = characterReader35.nextIndexOf(' ');
        java.lang.String str40 = characterReader35.consumeLetterSequence();
        int int42 = characterReader35.nextIndexOf((java.lang.CharSequence) "hi!");
        org.jsoup.parser.CharacterReader characterReader44 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str45 = characterReader44.consumeLetterThenDigitSequence();
        char char46 = characterReader44.current();
        boolean boolean50 = characterReader44.rangeEquals(0, (int) (short) 1, "");
        org.jsoup.parser.CharacterReader characterReader52 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str53 = characterReader52.consumeLetterThenDigitSequence();
        boolean boolean55 = characterReader52.matches(' ');
        boolean boolean57 = characterReader52.matchesIgnoreCase("hi!");
        boolean boolean59 = characterReader52.matches('a');
        boolean boolean60 = characterReader52.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader62 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str64 = characterReader62.consumeTo('#');
        characterReader62.mark();
        org.jsoup.parser.CharacterReader characterReader67 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str68 = characterReader67.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader70 = new org.jsoup.parser.CharacterReader("");
        char[] charArray75 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str76 = characterReader70.consumeToAnySorted(charArray75);
        boolean boolean77 = characterReader67.matchesAny(charArray75);
        boolean boolean78 = characterReader62.matchesAny(charArray75);
        java.lang.String str79 = characterReader52.consumeToAny(charArray75);
        java.lang.String str80 = characterReader44.consumeToAny(charArray75);
        java.lang.String str81 = characterReader35.consumeToAnySorted(charArray75);
        boolean boolean82 = characterReader28.matchesAny(charArray75);
        java.lang.String str83 = characterReader22.consumeToAny(charArray75);
        boolean boolean84 = characterReader12.matchesAnySorted(charArray75);
        java.lang.String str85 = characterReader1.consumeToAny(charArray75);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi" + "'", str7, "hi");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi" + "'", str18, "hi");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "!" + "'", str20, "!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + char37 + "' != '" + '\uffff' + "'", char37 == '\uffff');
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + char46 + "' != '" + '\uffff' + "'", char46 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertArrayEquals(charArray75, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "!" + "'", str85, "!");
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        int int8 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        java.lang.String str9 = characterReader1.toString();
        java.lang.String str10 = characterReader1.consumeHexSequence();
        boolean boolean12 = characterReader1.containsIgnoreCase("h");
        java.lang.String str13 = characterReader1.consumeHexSequence();
        java.lang.String str14 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str15 = characterReader1.consumeTagName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('#');
        boolean boolean5 = characterReader1.matches("");
        boolean boolean9 = characterReader1.rangeEquals((int) '4', (int) '4', "");
        int int11 = characterReader1.nextIndexOf('4');
        java.lang.String str13 = characterReader1.consumeTo('h');
        boolean boolean17 = characterReader1.rangeEquals((int) (short) 10, (int) '#', "hi");
        boolean boolean21 = characterReader1.rangeEquals((int) (short) 10, (int) 'a', "hi");
        characterReader1.rewindToMark();
        java.lang.String str23 = characterReader1.consumeDigitSequence();
        characterReader1.advance();
        char char25 = characterReader1.consume();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\uffff' + "'", char25 == '\uffff');
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        java.lang.String str5 = characterReader1.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader7.unconsume();
        characterReader7.rewindToMark();
        boolean boolean11 = characterReader7.matches("");
        boolean boolean12 = characterReader7.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader14 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader14.unconsume();
        characterReader14.rewindToMark();
        boolean boolean17 = characterReader14.matchesDigit();
        java.lang.String str18 = characterReader14.consumeAsString();
        boolean boolean20 = characterReader14.matchConsumeIgnoreCase("");
        java.lang.String str21 = characterReader14.toString();
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str25 = characterReader23.consumeTo('#');
        char[] charArray29 = new char[] { '#', '#', 'a' };
        boolean boolean30 = characterReader23.matchesAny(charArray29);
        java.lang.String str31 = characterReader14.consumeToAnySorted(charArray29);
        boolean boolean32 = characterReader7.matchesAnySorted(charArray29);
        boolean boolean33 = characterReader1.matchesAny(charArray29);
        boolean boolean34 = characterReader1.matchesLetter();
        java.lang.String str36 = characterReader1.consumeTo("!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "i!" + "'", str21, "i!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "i!" + "'", str31, "i!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('#');
        boolean boolean5 = characterReader1.matches("");
        boolean boolean9 = characterReader1.rangeEquals((int) '4', (int) '4', "");
        int int11 = characterReader1.nextIndexOf('4');
        boolean boolean12 = characterReader1.isEmpty();
        java.lang.String str13 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean15 = characterReader1.matches('\uffff');
        boolean boolean17 = characterReader1.matches("i!");
        boolean boolean18 = characterReader1.matchesLetter();
        java.lang.String str19 = characterReader1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matchesDigit();
        java.lang.String str5 = characterReader1.consumeAsString();
        characterReader1.unconsume();
        java.lang.String str7 = characterReader1.consumeTagName();
        boolean boolean9 = characterReader1.containsIgnoreCase("h");
        boolean boolean10 = characterReader1.isEmpty();
        java.lang.String str11 = characterReader1.consumeDigitSequence();
        java.lang.String str13 = characterReader1.consumeTo("h");
        characterReader1.advance();
        characterReader1.rewindToMark();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean2 = characterReader1.matchesLetter();
        int int3 = characterReader1.pos();
        java.lang.String str4 = characterReader1.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader6 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str7 = characterReader6.consumeLetterThenDigitSequence();
        boolean boolean9 = characterReader6.matches(' ');
        boolean boolean11 = characterReader6.matchesIgnoreCase("hi!");
        boolean boolean13 = characterReader6.matches('a');
        boolean boolean14 = characterReader6.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str18 = characterReader16.consumeTo('#');
        characterReader16.mark();
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str22 = characterReader21.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("");
        char[] charArray29 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str30 = characterReader24.consumeToAnySorted(charArray29);
        boolean boolean31 = characterReader21.matchesAny(charArray29);
        boolean boolean32 = characterReader16.matchesAny(charArray29);
        java.lang.String str33 = characterReader6.consumeToAny(charArray29);
        org.jsoup.parser.CharacterReader characterReader35 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str36 = characterReader35.consumeLetterThenDigitSequence();
        boolean boolean38 = characterReader35.matches(' ');
        boolean boolean40 = characterReader35.matchesIgnoreCase("hi!");
        boolean boolean42 = characterReader35.matches('a');
        boolean boolean43 = characterReader35.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader45 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str47 = characterReader45.consumeTo('#');
        characterReader45.mark();
        org.jsoup.parser.CharacterReader characterReader50 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str51 = characterReader50.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader53 = new org.jsoup.parser.CharacterReader("");
        char[] charArray58 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str59 = characterReader53.consumeToAnySorted(charArray58);
        boolean boolean60 = characterReader50.matchesAny(charArray58);
        boolean boolean61 = characterReader45.matchesAny(charArray58);
        java.lang.String str62 = characterReader35.consumeToAny(charArray58);
        boolean boolean63 = characterReader6.matchesAnySorted(charArray58);
        java.lang.String str64 = characterReader1.consumeToAny(charArray58);
        characterReader1.rewindToMark();
        java.lang.String str66 = characterReader1.consumeData();
        characterReader1.mark();
        char char68 = characterReader1.consume();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertArrayEquals(charArray58, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "i!" + "'", str64, "i!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertTrue("'" + char68 + "' != '" + '\uffff' + "'", char68 == '\uffff');
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("i");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matchConsumeIgnoreCase("!");
        characterReader1.advance();
        boolean boolean7 = characterReader1.matches('h');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        char char3 = characterReader1.current();
        boolean boolean4 = characterReader1.isEmpty();
        boolean boolean8 = characterReader1.rangeEquals((int) (byte) -1, (int) (short) 100, "hi!");
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        char[] charArray15 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str16 = characterReader10.consumeToAnySorted(charArray15);
        java.lang.String str17 = characterReader10.consumeLetterSequence();
        java.lang.String str18 = characterReader10.consumeTagName();
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean21 = characterReader20.matchesDigit();
        char char22 = characterReader20.current();
        characterReader20.advance();
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str26 = characterReader25.consumeLetterThenDigitSequence();
        boolean boolean28 = characterReader25.matches(' ');
        char char29 = characterReader25.current();
        boolean boolean31 = characterReader25.matchesIgnoreCase("h");
        java.lang.String str32 = characterReader25.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader34 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader34.unconsume();
        characterReader34.rewindToMark();
        boolean boolean38 = characterReader34.matches("");
        java.lang.String str39 = characterReader34.consumeLetterSequence();
        java.lang.String str40 = characterReader34.consumeToEnd();
        org.jsoup.parser.CharacterReader characterReader42 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str43 = characterReader42.consumeLetterThenDigitSequence();
        boolean boolean45 = characterReader42.matches(' ');
        boolean boolean47 = characterReader42.matchesIgnoreCase("hi!");
        boolean boolean49 = characterReader42.matches('a');
        java.lang.String str50 = characterReader42.toString();
        org.jsoup.parser.CharacterReader characterReader52 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean53 = characterReader52.matchesLetter();
        java.lang.String str54 = characterReader52.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader56 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader56.unconsume();
        characterReader56.rewindToMark();
        boolean boolean59 = characterReader56.matchesDigit();
        java.lang.String str60 = characterReader56.consumeAsString();
        boolean boolean62 = characterReader56.matchConsumeIgnoreCase("");
        java.lang.String str63 = characterReader56.toString();
        org.jsoup.parser.CharacterReader characterReader65 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str67 = characterReader65.consumeTo('#');
        char[] charArray71 = new char[] { '#', '#', 'a' };
        boolean boolean72 = characterReader65.matchesAny(charArray71);
        java.lang.String str73 = characterReader56.consumeToAnySorted(charArray71);
        java.lang.String str74 = characterReader52.consumeToAnySorted(charArray71);
        boolean boolean75 = characterReader42.matchesAnySorted(charArray71);
        boolean boolean76 = characterReader34.matchesAny(charArray71);
        boolean boolean77 = characterReader25.matchesAnySorted(charArray71);
        boolean boolean78 = characterReader20.matchesAny(charArray71);
        java.lang.String str79 = characterReader10.consumeToAny(charArray71);
        java.lang.String str80 = characterReader1.consumeToAnySorted(charArray71);
        boolean boolean82 = characterReader1.matchConsumeIgnoreCase("h");
        java.lang.String str83 = characterReader1.consumeData();
        char char84 = characterReader1.consume();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + 'h' + "'", char22 == 'h');
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\uffff' + "'", char29 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi" + "'", str39, "hi");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "!" + "'", str40, "!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi" + "'", str54, "hi");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "h" + "'", str60, "h");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "i!" + "'", str63, "i!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertArrayEquals(charArray71, new char[] { '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "i!" + "'", str73, "i!");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "!" + "'", str74, "!");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertTrue("'" + char84 + "' != '" + '\uffff' + "'", char84 == '\uffff');
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray6 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        java.lang.String str8 = characterReader1.consumeHexSequence();
        boolean boolean10 = characterReader1.matches('\uffff');
        java.lang.String str11 = characterReader1.consumeToEnd();
        java.lang.String str12 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean13 = characterReader1.matchesLetter();
        java.lang.String str14 = characterReader1.consumeData();
        java.lang.String str15 = characterReader1.consumeTagName();
        boolean boolean17 = characterReader1.matches("");
        java.lang.String str19 = characterReader1.consumeTo('4');
        boolean boolean21 = characterReader1.matchConsumeIgnoreCase("hi");
        int int22 = characterReader1.pos();
        boolean boolean24 = characterReader1.containsIgnoreCase("hi!");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean2 = characterReader1.matchesDigit();
        boolean boolean4 = characterReader1.matches('a');
        boolean boolean6 = characterReader1.matches("");
        java.lang.String str7 = characterReader1.consumeLetterThenDigitSequence();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi" + "'", str7, "hi");
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('#');
        characterReader1.mark();
        java.lang.String str5 = characterReader1.consumeToEnd();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str9 = characterReader7.consumeTo('#');
        boolean boolean11 = characterReader7.matches("");
        boolean boolean15 = characterReader7.rangeEquals((int) '4', (int) '4', "");
        boolean boolean17 = characterReader7.matches('h');
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader19.unconsume();
        characterReader19.rewindToMark();
        boolean boolean23 = characterReader19.matches("");
        boolean boolean24 = characterReader19.matchesDigit();
        char char25 = characterReader19.consume();
        org.jsoup.parser.CharacterReader characterReader27 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str28 = characterReader27.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("");
        char[] charArray35 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str36 = characterReader30.consumeToAnySorted(charArray35);
        boolean boolean37 = characterReader27.matchesAnySorted(charArray35);
        java.lang.String str38 = characterReader19.consumeToAnySorted(charArray35);
        boolean boolean39 = characterReader7.matchesAny(charArray35);
        boolean boolean40 = characterReader1.matchesAny(charArray35);
        char char41 = characterReader1.consume();
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("");
        char[] charArray48 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str49 = characterReader43.consumeToAnySorted(charArray48);
        java.lang.String str50 = characterReader43.consumeHexSequence();
        org.jsoup.parser.CharacterReader characterReader52 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str53 = characterReader52.consumeLetterThenDigitSequence();
        boolean boolean55 = characterReader52.matches(' ');
        boolean boolean57 = characterReader52.matchesIgnoreCase("hi!");
        boolean boolean59 = characterReader52.matches('a');
        boolean boolean60 = characterReader52.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader62 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str64 = characterReader62.consumeTo('#');
        characterReader62.mark();
        org.jsoup.parser.CharacterReader characterReader67 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str68 = characterReader67.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader70 = new org.jsoup.parser.CharacterReader("");
        char[] charArray75 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str76 = characterReader70.consumeToAnySorted(charArray75);
        boolean boolean77 = characterReader67.matchesAny(charArray75);
        boolean boolean78 = characterReader62.matchesAny(charArray75);
        java.lang.String str79 = characterReader52.consumeToAny(charArray75);
        boolean boolean80 = characterReader43.matchesAnySorted(charArray75);
        java.lang.String str81 = characterReader1.consumeToAny(charArray75);
        characterReader1.unconsume();
        java.lang.String str84 = characterReader1.consumeTo("h");
        boolean boolean85 = characterReader1.matchesLetter();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + 'h' + "'", char25 == 'h');
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "i!" + "'", str38, "i!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + char41 + "' != '" + '\uffff' + "'", char41 == '\uffff');
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertArrayEquals(charArray75, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean8 = characterReader1.matches('a');
        java.lang.String str9 = characterReader1.toString();
        java.lang.String str10 = characterReader1.consumeData();
        java.lang.String str11 = characterReader1.consumeData();
        boolean boolean13 = characterReader1.matches("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matchesDigit();
        java.lang.String str5 = characterReader1.consumeAsString();
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str8 = characterReader1.toString();
        boolean boolean10 = characterReader1.matches('a');
        java.lang.String str11 = characterReader1.consumeLetterSequence();
        java.lang.String str12 = characterReader1.consumeAsString();
        boolean boolean14 = characterReader1.matchesIgnoreCase("i!");
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str17 = characterReader16.consumeLetterThenDigitSequence();
        boolean boolean19 = characterReader16.matches(' ');
        char char20 = characterReader16.current();
        boolean boolean22 = characterReader16.matches('\uffff');
        char char23 = characterReader16.current();
        characterReader16.mark();
        java.lang.String str25 = characterReader16.consumeData();
        int int27 = characterReader16.nextIndexOf('h');
        org.jsoup.parser.CharacterReader characterReader29 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader29.unconsume();
        characterReader29.rewindToMark();
        boolean boolean33 = characterReader29.matches("");
        org.jsoup.parser.CharacterReader characterReader35 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str36 = characterReader35.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader38 = new org.jsoup.parser.CharacterReader("");
        char[] charArray43 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str44 = characterReader38.consumeToAnySorted(charArray43);
        boolean boolean45 = characterReader35.matchesAnySorted(charArray43);
        boolean boolean47 = characterReader35.matchConsume("hi!");
        org.jsoup.parser.CharacterReader characterReader49 = new org.jsoup.parser.CharacterReader("");
        int int51 = characterReader49.nextIndexOf(' ');
        char[] charArray53 = new char[] { '4' };
        java.lang.String str54 = characterReader49.consumeToAny(charArray53);
        java.lang.String str55 = characterReader35.consumeToAny(charArray53);
        boolean boolean56 = characterReader29.matchesAny(charArray53);
        boolean boolean58 = characterReader29.matchConsume("");
        org.jsoup.parser.CharacterReader characterReader60 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str61 = characterReader60.consumeLetterThenDigitSequence();
        boolean boolean63 = characterReader60.matches(' ');
        char char64 = characterReader60.current();
        char[] charArray66 = new char[] { '4' };
        boolean boolean67 = characterReader60.matchesAny(charArray66);
        java.lang.String str68 = characterReader29.consumeToAny(charArray66);
        org.jsoup.parser.CharacterReader characterReader70 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader70.unconsume();
        characterReader70.rewindToMark();
        boolean boolean74 = characterReader70.matches("");
        boolean boolean75 = characterReader70.matchesDigit();
        char char76 = characterReader70.consume();
        org.jsoup.parser.CharacterReader characterReader78 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str79 = characterReader78.consumeLetterThenDigitSequence();
        boolean boolean81 = characterReader78.matches(' ');
        boolean boolean83 = characterReader78.matchesIgnoreCase("hi!");
        org.jsoup.parser.CharacterReader characterReader85 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str86 = characterReader85.consumeLetterThenDigitSequence();
        boolean boolean88 = characterReader85.matches(' ');
        char char89 = characterReader85.current();
        char[] charArray91 = new char[] { '4' };
        boolean boolean92 = characterReader85.matchesAny(charArray91);
        boolean boolean93 = characterReader78.matchesAnySorted(charArray91);
        boolean boolean94 = characterReader70.matchesAny(charArray91);
        java.lang.String str95 = characterReader29.consumeToAnySorted(charArray91);
        boolean boolean96 = characterReader16.matchesAny(charArray91);
        boolean boolean97 = characterReader1.matchesAnySorted(charArray91);
        int int99 = characterReader1.nextIndexOf('i');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i!" + "'", str8, "i!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "i" + "'", str11, "i");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "!" + "'", str12, "!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\uffff' + "'", char20 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\uffff' + "'", char23 == '\uffff');
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + char64 + "' != '" + '\uffff' + "'", char64 == '\uffff');
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertArrayEquals(charArray66, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + char76 + "' != '" + 'h' + "'", char76 == 'h');
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + char89 + "' != '" + '\uffff' + "'", char89 == '\uffff');
        org.junit.Assert.assertNotNull(charArray91);
        org.junit.Assert.assertArrayEquals(charArray91, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + (-1) + "'", int99 == (-1));
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        char char3 = characterReader1.current();
        int int5 = characterReader1.nextIndexOf(' ');
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        int int8 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        char char9 = characterReader1.current();
        java.lang.String str10 = characterReader1.toString();
        java.lang.String str12 = characterReader1.consumeTo('h');
        boolean boolean16 = characterReader1.rangeEquals((int) (byte) 100, (int) ' ', "hi");
        boolean boolean18 = characterReader1.matchesIgnoreCase("hi");
        char char19 = characterReader1.current();
        java.lang.String str20 = characterReader1.consumeLetterSequence();
        int int21 = characterReader1.pos();
        java.lang.String str23 = characterReader1.consumeTo('h');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\uffff' + "'", char19 == '\uffff');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('#');
        boolean boolean5 = characterReader1.matches("");
        boolean boolean9 = characterReader1.rangeEquals((int) '4', (int) '4', "");
        int int11 = characterReader1.nextIndexOf('4');
        boolean boolean12 = characterReader1.isEmpty();
        java.lang.String str13 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str14 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str15 = characterReader1.consumeDigitSequence();
        characterReader1.mark();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('#');
        char[] charArray7 = new char[] { '#', '#', 'a' };
        boolean boolean8 = characterReader1.matchesAny(charArray7);
        int int10 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        java.lang.String str11 = characterReader1.consumeData();
        boolean boolean13 = characterReader1.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader15 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str16 = characterReader15.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader18 = new org.jsoup.parser.CharacterReader("");
        char[] charArray23 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str24 = characterReader18.consumeToAnySorted(charArray23);
        boolean boolean25 = characterReader15.matchesAny(charArray23);
        java.lang.String str26 = characterReader15.consumeHexSequence();
        java.lang.String str27 = characterReader15.consumeData();
        org.jsoup.parser.CharacterReader characterReader29 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str31 = characterReader29.consumeTo('#');
        characterReader29.mark();
        org.jsoup.parser.CharacterReader characterReader34 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str35 = characterReader34.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("");
        char[] charArray42 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str43 = characterReader37.consumeToAnySorted(charArray42);
        boolean boolean44 = characterReader34.matchesAny(charArray42);
        boolean boolean45 = characterReader29.matchesAny(charArray42);
        java.lang.String str46 = characterReader15.consumeToAny(charArray42);
        org.jsoup.parser.CharacterReader characterReader48 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str49 = characterReader48.consumeLetterThenDigitSequence();
        boolean boolean51 = characterReader48.matches(' ');
        boolean boolean53 = characterReader48.matchesIgnoreCase("hi!");
        int int55 = characterReader48.nextIndexOf((java.lang.CharSequence) "hi!");
        org.jsoup.parser.CharacterReader characterReader57 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader59 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str60 = characterReader59.consumeLetterThenDigitSequence();
        boolean boolean62 = characterReader59.matches(' ');
        boolean boolean64 = characterReader59.matchesIgnoreCase("hi!");
        org.jsoup.parser.CharacterReader characterReader66 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str67 = characterReader66.consumeLetterThenDigitSequence();
        boolean boolean69 = characterReader66.matches(' ');
        char char70 = characterReader66.current();
        char[] charArray72 = new char[] { '4' };
        boolean boolean73 = characterReader66.matchesAny(charArray72);
        boolean boolean74 = characterReader59.matchesAnySorted(charArray72);
        java.lang.String str75 = characterReader57.consumeToAnySorted(charArray72);
        boolean boolean76 = characterReader48.matchesAny(charArray72);
        java.lang.String str77 = characterReader15.consumeToAny(charArray72);
        java.lang.String str78 = characterReader1.consumeToAnySorted(charArray72);
        int int79 = characterReader1.pos();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + char70 + "' != '" + '\uffff' + "'", char70 == '\uffff');
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertArrayEquals(charArray72, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        java.lang.String str5 = characterReader1.toString();
        char char6 = characterReader1.current();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str10 = characterReader8.consumeTo('#');
        characterReader8.mark();
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str14 = characterReader13.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        char[] charArray21 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str22 = characterReader16.consumeToAnySorted(charArray21);
        boolean boolean23 = characterReader13.matchesAny(charArray21);
        boolean boolean24 = characterReader8.matchesAny(charArray21);
        boolean boolean25 = characterReader1.matchesAny(charArray21);
        characterReader1.rewindToMark();
        boolean boolean27 = characterReader1.matchesLetter();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\uffff' + "'", char6 == '\uffff');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean8 = characterReader1.matches('a');
        boolean boolean9 = characterReader1.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader11 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str13 = characterReader11.consumeTo('#');
        characterReader11.mark();
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str17 = characterReader16.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("");
        char[] charArray24 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str25 = characterReader19.consumeToAnySorted(charArray24);
        boolean boolean26 = characterReader16.matchesAny(charArray24);
        boolean boolean27 = characterReader11.matchesAny(charArray24);
        java.lang.String str28 = characterReader1.consumeToAny(charArray24);
        characterReader1.mark();
        char char30 = characterReader1.current();
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader32.unconsume();
        characterReader32.rewindToMark();
        boolean boolean35 = characterReader32.matchesDigit();
        java.lang.String str36 = characterReader32.consumeAsString();
        boolean boolean38 = characterReader32.matchConsumeIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader40 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str41 = characterReader40.consumeLetterThenDigitSequence();
        boolean boolean43 = characterReader40.matches(' ');
        boolean boolean45 = characterReader40.matchesIgnoreCase("hi!");
        boolean boolean47 = characterReader40.matches('a');
        boolean boolean48 = characterReader40.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader50 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str52 = characterReader50.consumeTo('#');
        characterReader50.mark();
        org.jsoup.parser.CharacterReader characterReader55 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str56 = characterReader55.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader58 = new org.jsoup.parser.CharacterReader("");
        char[] charArray63 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str64 = characterReader58.consumeToAnySorted(charArray63);
        boolean boolean65 = characterReader55.matchesAny(charArray63);
        boolean boolean66 = characterReader50.matchesAny(charArray63);
        java.lang.String str67 = characterReader40.consumeToAny(charArray63);
        java.lang.String str68 = characterReader32.consumeToAny(charArray63);
        boolean boolean69 = characterReader1.matchesAny(charArray63);
        java.lang.String str70 = characterReader1.consumeData();
        java.lang.String str72 = characterReader1.consumeTo("hi!");
        boolean boolean73 = characterReader1.matchesDigit();
        boolean boolean75 = characterReader1.containsIgnoreCase("i!");
        characterReader1.advance();
        characterReader1.advance();
        boolean boolean79 = characterReader1.matches("!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '\uffff' + "'", char30 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "h" + "'", str36, "h");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertArrayEquals(charArray63, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "i!" + "'", str68, "i!");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matchesDigit();
        java.lang.String str5 = characterReader1.consumeAsString();
        characterReader1.unconsume();
        characterReader1.advance();
        boolean boolean9 = characterReader1.matchesIgnoreCase("hi!");
        int int11 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        boolean boolean13 = characterReader1.matches("i");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = characterReader1.containsIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean2 = characterReader1.matchesLetter();
        boolean boolean6 = characterReader1.rangeEquals((int) (short) -1, (int) '#', "hi");
        java.lang.String str7 = characterReader1.consumeLetterSequence();
        java.lang.String str8 = characterReader1.consumeHexSequence();
        java.lang.String str9 = characterReader1.consumeData();
        boolean boolean10 = characterReader1.matchesLetter();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi" + "'", str7, "hi");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "!" + "'", str9, "!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader4 = new org.jsoup.parser.CharacterReader("");
        char[] charArray9 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str10 = characterReader4.consumeToAnySorted(charArray9);
        boolean boolean11 = characterReader1.matchesAnySorted(charArray9);
        boolean boolean13 = characterReader1.matchConsume("i!");
        java.lang.String str14 = characterReader1.consumeTagName();
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean17 = characterReader16.matchesLetter();
        boolean boolean21 = characterReader16.rangeEquals((int) (short) -1, (int) '#', "hi");
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str24 = characterReader23.consumeLetterThenDigitSequence();
        char char25 = characterReader23.current();
        int int27 = characterReader23.nextIndexOf(' ');
        java.lang.String str28 = characterReader23.consumeLetterSequence();
        int int29 = characterReader23.pos();
        boolean boolean31 = characterReader23.matches("h");
        org.jsoup.parser.CharacterReader characterReader33 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str34 = characterReader33.consumeLetterThenDigitSequence();
        char char35 = characterReader33.current();
        boolean boolean39 = characterReader33.rangeEquals(0, (int) (short) 1, "");
        org.jsoup.parser.CharacterReader characterReader41 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str42 = characterReader41.consumeLetterThenDigitSequence();
        boolean boolean44 = characterReader41.matches(' ');
        boolean boolean46 = characterReader41.matchesIgnoreCase("hi!");
        boolean boolean48 = characterReader41.matches('a');
        boolean boolean49 = characterReader41.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader51 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str53 = characterReader51.consumeTo('#');
        characterReader51.mark();
        org.jsoup.parser.CharacterReader characterReader56 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str57 = characterReader56.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader59 = new org.jsoup.parser.CharacterReader("");
        char[] charArray64 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str65 = characterReader59.consumeToAnySorted(charArray64);
        boolean boolean66 = characterReader56.matchesAny(charArray64);
        boolean boolean67 = characterReader51.matchesAny(charArray64);
        java.lang.String str68 = characterReader41.consumeToAny(charArray64);
        java.lang.String str69 = characterReader33.consumeToAny(charArray64);
        boolean boolean70 = characterReader23.matchesAnySorted(charArray64);
        java.lang.String str71 = characterReader16.consumeToAnySorted(charArray64);
        boolean boolean72 = characterReader1.matchesAny(charArray64);
        boolean boolean74 = characterReader1.matches('a');
        char char75 = characterReader1.consume();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\uffff' + "'", char25 == '\uffff');
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + char35 + "' != '" + '\uffff' + "'", char35 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertArrayEquals(charArray64, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + char75 + "' != '" + '\uffff' + "'", char75 == '\uffff');
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        char char3 = characterReader1.current();
        int int5 = characterReader1.nextIndexOf(' ');
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        int int8 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        char char9 = characterReader1.current();
        java.lang.String str10 = characterReader1.toString();
        java.lang.String str12 = characterReader1.consumeTo('h');
        java.lang.String str13 = characterReader1.consumeTagName();
        java.lang.String str14 = characterReader1.toString();
        boolean boolean18 = characterReader1.rangeEquals((int) (short) 1, (int) (byte) 1, "");
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str21 = characterReader20.consumeLetterThenDigitSequence();
        boolean boolean23 = characterReader20.matches(' ');
        boolean boolean25 = characterReader20.matchesIgnoreCase("hi!");
        boolean boolean27 = characterReader20.matches('a');
        characterReader20.advance();
        boolean boolean30 = characterReader20.containsIgnoreCase("h");
        boolean boolean32 = characterReader20.containsIgnoreCase("h");
        org.jsoup.parser.CharacterReader characterReader34 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str35 = characterReader34.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("");
        char[] charArray42 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str43 = characterReader37.consumeToAnySorted(charArray42);
        boolean boolean44 = characterReader34.matchesAnySorted(charArray42);
        characterReader34.rewindToMark();
        characterReader34.mark();
        java.lang.String str47 = characterReader34.toString();
        org.jsoup.parser.CharacterReader characterReader49 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str51 = characterReader49.consumeTo('#');
        char[] charArray55 = new char[] { '#', '#', 'a' };
        boolean boolean56 = characterReader49.matchesAny(charArray55);
        boolean boolean57 = characterReader34.matchesAnySorted(charArray55);
        java.lang.String str58 = characterReader20.consumeToAny(charArray55);
        org.jsoup.parser.CharacterReader characterReader60 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str61 = characterReader60.consumeLetterThenDigitSequence();
        boolean boolean63 = characterReader60.matches(' ');
        char char64 = characterReader60.current();
        char[] charArray66 = new char[] { '4' };
        boolean boolean67 = characterReader60.matchesAny(charArray66);
        java.lang.String str68 = characterReader20.consumeToAny(charArray66);
        boolean boolean69 = characterReader1.matchesAnySorted(charArray66);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + char64 + "' != '" + '\uffff' + "'", char64 == '\uffff');
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertArrayEquals(charArray66, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matchesDigit();
        java.lang.String str5 = characterReader1.consumeAsString();
        characterReader1.unconsume();
        characterReader1.advance();
        boolean boolean9 = characterReader1.matchesIgnoreCase("h");
        java.lang.String str10 = characterReader1.consumeHexSequence();
        characterReader1.rewindToMark();
        boolean boolean13 = characterReader1.containsIgnoreCase("i!");
        boolean boolean15 = characterReader1.matchConsume("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = characterReader1.containsIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader3 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str4 = characterReader3.consumeLetterThenDigitSequence();
        boolean boolean6 = characterReader3.matches(' ');
        boolean boolean8 = characterReader3.matchesIgnoreCase("hi!");
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str11 = characterReader10.consumeLetterThenDigitSequence();
        boolean boolean13 = characterReader10.matches(' ');
        char char14 = characterReader10.current();
        char[] charArray16 = new char[] { '4' };
        boolean boolean17 = characterReader10.matchesAny(charArray16);
        boolean boolean18 = characterReader3.matchesAnySorted(charArray16);
        java.lang.String str19 = characterReader1.consumeToAnySorted(charArray16);
        java.lang.String str20 = characterReader1.consumeData();
        java.lang.String str21 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean23 = characterReader1.matchConsume("i");
        java.lang.String str24 = characterReader1.consumeTagName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\uffff' + "'", char14 == '\uffff');
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader4 = new org.jsoup.parser.CharacterReader("");
        char[] charArray9 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str10 = characterReader4.consumeToAnySorted(charArray9);
        boolean boolean11 = characterReader1.matchesAnySorted(charArray9);
        char[] charArray15 = new char[] { '\uffff', '4', '\uffff' };
        boolean boolean16 = characterReader1.matchesAnySorted(charArray15);
        boolean boolean20 = characterReader1.rangeEquals((-1), (int) ' ', "hi!");
        boolean boolean21 = characterReader1.matchesDigit();
        boolean boolean23 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str25 = characterReader1.consumeTo("hi!");
        boolean boolean29 = characterReader1.rangeEquals((int) (short) -1, (-1), "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', '4', '\uffff' });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray6 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        int int10 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        boolean boolean12 = characterReader1.matches('4');
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("h");
        boolean boolean2 = characterReader1.matchesDigit();
        boolean boolean4 = characterReader1.matches("");
        org.jsoup.parser.CharacterReader characterReader6 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str7 = characterReader6.consumeLetterThenDigitSequence();
        char char8 = characterReader6.current();
        int int10 = characterReader6.nextIndexOf(' ');
        java.lang.String str11 = characterReader6.consumeLetterSequence();
        int int13 = characterReader6.nextIndexOf((java.lang.CharSequence) "hi!");
        char char14 = characterReader6.current();
        java.lang.String str15 = characterReader6.toString();
        java.lang.String str17 = characterReader6.consumeTo('h');
        boolean boolean21 = characterReader6.rangeEquals((int) (byte) 100, (int) ' ', "hi");
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str24 = characterReader23.consumeLetterThenDigitSequence();
        boolean boolean26 = characterReader23.matches(' ');
        java.lang.String str27 = characterReader23.toString();
        char char28 = characterReader23.current();
        boolean boolean30 = characterReader23.matchConsumeIgnoreCase("");
        java.lang.String str31 = characterReader23.toString();
        java.lang.String str32 = characterReader23.consumeData();
        org.jsoup.parser.CharacterReader characterReader34 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str35 = characterReader34.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("");
        char[] charArray42 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str43 = characterReader37.consumeToAnySorted(charArray42);
        boolean boolean44 = characterReader34.matchesAnySorted(charArray42);
        characterReader34.rewindToMark();
        characterReader34.mark();
        java.lang.String str47 = characterReader34.toString();
        org.jsoup.parser.CharacterReader characterReader49 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str51 = characterReader49.consumeTo('#');
        char[] charArray55 = new char[] { '#', '#', 'a' };
        boolean boolean56 = characterReader49.matchesAny(charArray55);
        boolean boolean57 = characterReader34.matchesAnySorted(charArray55);
        boolean boolean58 = characterReader23.matchesAnySorted(charArray55);
        boolean boolean59 = characterReader6.matchesAny(charArray55);
        java.lang.String str60 = characterReader1.consumeToAny(charArray55);
        characterReader1.rewindToMark();
        boolean boolean63 = characterReader1.containsIgnoreCase("hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\uffff' + "'", char14 == '\uffff');
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\uffff' + "'", char28 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "h" + "'", str60, "h");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean2 = characterReader1.matchesLetter();
        boolean boolean6 = characterReader1.rangeEquals((int) '#', (int) '!', "h");
        characterReader1.rewindToMark();
        int int9 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean5 = characterReader1.matches("");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str8 = characterReader7.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        char[] charArray15 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str16 = characterReader10.consumeToAnySorted(charArray15);
        boolean boolean17 = characterReader7.matchesAnySorted(charArray15);
        boolean boolean18 = characterReader1.matchesAnySorted(charArray15);
        boolean boolean20 = characterReader1.matches("h");
        java.lang.String str21 = characterReader1.consumeHexSequence();
        boolean boolean22 = characterReader1.matchesDigit();
        characterReader1.unconsume();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean5 = characterReader1.matches("");
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("");
        boolean boolean9 = characterReader1.matchConsume("");
        boolean boolean11 = characterReader1.matches("h");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matchesDigit();
        java.lang.String str5 = characterReader1.consumeAsString();
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str8 = characterReader1.toString();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str12 = characterReader10.consumeTo('#');
        char[] charArray16 = new char[] { '#', '#', 'a' };
        boolean boolean17 = characterReader10.matchesAny(charArray16);
        java.lang.String str18 = characterReader1.consumeToAnySorted(charArray16);
        characterReader1.advance();
        boolean boolean20 = characterReader1.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader22.unconsume();
        characterReader22.rewindToMark();
        boolean boolean26 = characterReader22.matches("");
        boolean boolean27 = characterReader22.matchesDigit();
        char char28 = characterReader22.consume();
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str31 = characterReader30.consumeLetterThenDigitSequence();
        boolean boolean33 = characterReader30.matches(' ');
        boolean boolean35 = characterReader30.matchesIgnoreCase("hi!");
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str38 = characterReader37.consumeLetterThenDigitSequence();
        boolean boolean40 = characterReader37.matches(' ');
        char char41 = characterReader37.current();
        char[] charArray43 = new char[] { '4' };
        boolean boolean44 = characterReader37.matchesAny(charArray43);
        boolean boolean45 = characterReader30.matchesAnySorted(charArray43);
        boolean boolean46 = characterReader22.matchesAny(charArray43);
        boolean boolean47 = characterReader1.matchesAny(charArray43);
        boolean boolean49 = characterReader1.matchesIgnoreCase("");
        boolean boolean53 = characterReader1.rangeEquals((int) (byte) 0, (-1), "h");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i!" + "'", str8, "i!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "i!" + "'", str18, "i!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + 'h' + "'", char28 == 'h');
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + char41 + "' != '" + '\uffff' + "'", char41 == '\uffff');
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray6 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        java.lang.String str8 = characterReader1.consumeHexSequence();
        boolean boolean10 = characterReader1.matches('\uffff');
        boolean boolean11 = characterReader1.isEmpty();
        java.lang.String str12 = characterReader1.consumeLetterSequence();
        char char13 = characterReader1.current();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\uffff' + "'", char13 == '\uffff');
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader4 = new org.jsoup.parser.CharacterReader("");
        char[] charArray9 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str10 = characterReader4.consumeToAnySorted(charArray9);
        boolean boolean11 = characterReader1.matchesAnySorted(charArray9);
        char[] charArray15 = new char[] { '\uffff', '4', '\uffff' };
        boolean boolean16 = characterReader1.matchesAnySorted(charArray15);
        java.lang.String str18 = characterReader1.consumeTo('#');
        java.lang.String str19 = characterReader1.consumeHexSequence();
        java.lang.String str20 = characterReader1.consumeTagName();
        boolean boolean22 = characterReader1.matches('i');
        java.lang.String str23 = characterReader1.consumeToEnd();
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean26 = characterReader25.matchesLetter();
        int int28 = characterReader25.nextIndexOf('h');
        java.lang.String str29 = characterReader25.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader31 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader31.unconsume();
        characterReader31.rewindToMark();
        boolean boolean35 = characterReader31.matches("");
        boolean boolean36 = characterReader31.matchesDigit();
        java.lang.String str37 = characterReader31.consumeTagName();
        org.jsoup.parser.CharacterReader characterReader39 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean40 = characterReader39.matchesLetter();
        boolean boolean44 = characterReader39.rangeEquals((int) (short) -1, (int) '#', "hi");
        org.jsoup.parser.CharacterReader characterReader46 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str47 = characterReader46.consumeLetterThenDigitSequence();
        char char48 = characterReader46.current();
        int int50 = characterReader46.nextIndexOf(' ');
        java.lang.String str51 = characterReader46.consumeLetterSequence();
        int int52 = characterReader46.pos();
        boolean boolean54 = characterReader46.matches("h");
        org.jsoup.parser.CharacterReader characterReader56 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str57 = characterReader56.consumeLetterThenDigitSequence();
        char char58 = characterReader56.current();
        boolean boolean62 = characterReader56.rangeEquals(0, (int) (short) 1, "");
        org.jsoup.parser.CharacterReader characterReader64 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str65 = characterReader64.consumeLetterThenDigitSequence();
        boolean boolean67 = characterReader64.matches(' ');
        boolean boolean69 = characterReader64.matchesIgnoreCase("hi!");
        boolean boolean71 = characterReader64.matches('a');
        boolean boolean72 = characterReader64.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader74 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str76 = characterReader74.consumeTo('#');
        characterReader74.mark();
        org.jsoup.parser.CharacterReader characterReader79 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str80 = characterReader79.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader82 = new org.jsoup.parser.CharacterReader("");
        char[] charArray87 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str88 = characterReader82.consumeToAnySorted(charArray87);
        boolean boolean89 = characterReader79.matchesAny(charArray87);
        boolean boolean90 = characterReader74.matchesAny(charArray87);
        java.lang.String str91 = characterReader64.consumeToAny(charArray87);
        java.lang.String str92 = characterReader56.consumeToAny(charArray87);
        boolean boolean93 = characterReader46.matchesAnySorted(charArray87);
        java.lang.String str94 = characterReader39.consumeToAnySorted(charArray87);
        java.lang.String str95 = characterReader31.consumeToAny(charArray87);
        boolean boolean96 = characterReader25.matchesAnySorted(charArray87);
        boolean boolean97 = characterReader1.matchesAny(charArray87);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', '4', '\uffff' });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi" + "'", str29, "hi");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + char48 + "' != '" + '\uffff' + "'", char48 == '\uffff');
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + char58 + "' != '" + '\uffff' + "'", char58 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(charArray87);
        org.junit.Assert.assertArrayEquals(charArray87, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "hi!" + "'", str94, "hi!");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean5 = characterReader1.matches("");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str8 = characterReader7.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        char[] charArray15 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str16 = characterReader10.consumeToAnySorted(charArray15);
        boolean boolean17 = characterReader7.matchesAnySorted(charArray15);
        boolean boolean19 = characterReader7.matchConsume("hi!");
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("");
        int int23 = characterReader21.nextIndexOf(' ');
        char[] charArray25 = new char[] { '4' };
        java.lang.String str26 = characterReader21.consumeToAny(charArray25);
        java.lang.String str27 = characterReader7.consumeToAny(charArray25);
        boolean boolean28 = characterReader1.matchesAny(charArray25);
        boolean boolean30 = characterReader1.matchConsume("");
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str33 = characterReader32.consumeLetterThenDigitSequence();
        boolean boolean35 = characterReader32.matches(' ');
        char char36 = characterReader32.current();
        char[] charArray38 = new char[] { '4' };
        boolean boolean39 = characterReader32.matchesAny(charArray38);
        java.lang.String str40 = characterReader1.consumeToAny(charArray38);
        org.jsoup.parser.CharacterReader characterReader42 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader42.unconsume();
        characterReader42.rewindToMark();
        boolean boolean46 = characterReader42.matches("");
        boolean boolean47 = characterReader42.matchesDigit();
        char char48 = characterReader42.consume();
        org.jsoup.parser.CharacterReader characterReader50 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str51 = characterReader50.consumeLetterThenDigitSequence();
        boolean boolean53 = characterReader50.matches(' ');
        boolean boolean55 = characterReader50.matchesIgnoreCase("hi!");
        org.jsoup.parser.CharacterReader characterReader57 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str58 = characterReader57.consumeLetterThenDigitSequence();
        boolean boolean60 = characterReader57.matches(' ');
        char char61 = characterReader57.current();
        char[] charArray63 = new char[] { '4' };
        boolean boolean64 = characterReader57.matchesAny(charArray63);
        boolean boolean65 = characterReader50.matchesAnySorted(charArray63);
        boolean boolean66 = characterReader42.matchesAny(charArray63);
        java.lang.String str67 = characterReader1.consumeToAnySorted(charArray63);
        characterReader1.mark();
        char char69 = characterReader1.current();
        boolean boolean71 = characterReader1.matchesIgnoreCase("i!");
        boolean boolean73 = characterReader1.matchesIgnoreCase("!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + char36 + "' != '" + '\uffff' + "'", char36 == '\uffff');
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + char48 + "' != '" + 'h' + "'", char48 == 'h');
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + char61 + "' != '" + '\uffff' + "'", char61 == '\uffff');
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertArrayEquals(charArray63, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + char69 + "' != '" + '\uffff' + "'", char69 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader4 = new org.jsoup.parser.CharacterReader("");
        char[] charArray9 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str10 = characterReader4.consumeToAnySorted(charArray9);
        boolean boolean11 = characterReader1.matchesAnySorted(charArray9);
        char[] charArray15 = new char[] { '\uffff', '4', '\uffff' };
        boolean boolean16 = characterReader1.matchesAnySorted(charArray15);
        boolean boolean20 = characterReader1.rangeEquals((-1), (int) ' ', "hi!");
        java.lang.String str21 = characterReader1.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str24 = characterReader23.consumeLetterThenDigitSequence();
        boolean boolean26 = characterReader23.matches(' ');
        boolean boolean28 = characterReader23.matchesIgnoreCase("hi!");
        int int30 = characterReader23.nextIndexOf((java.lang.CharSequence) "hi!");
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader34 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str35 = characterReader34.consumeLetterThenDigitSequence();
        boolean boolean37 = characterReader34.matches(' ');
        boolean boolean39 = characterReader34.matchesIgnoreCase("hi!");
        org.jsoup.parser.CharacterReader characterReader41 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str42 = characterReader41.consumeLetterThenDigitSequence();
        boolean boolean44 = characterReader41.matches(' ');
        char char45 = characterReader41.current();
        char[] charArray47 = new char[] { '4' };
        boolean boolean48 = characterReader41.matchesAny(charArray47);
        boolean boolean49 = characterReader34.matchesAnySorted(charArray47);
        java.lang.String str50 = characterReader32.consumeToAnySorted(charArray47);
        boolean boolean51 = characterReader23.matchesAny(charArray47);
        java.lang.String str52 = characterReader1.consumeToAny(charArray47);
        boolean boolean54 = characterReader1.matches('a');
        boolean boolean55 = characterReader1.matchesLetter();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', '4', '\uffff' });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + char45 + "' != '" + '\uffff' + "'", char45 == '\uffff');
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean5 = characterReader1.matches("");
        boolean boolean6 = characterReader1.matchesDigit();
        java.lang.String str7 = characterReader1.consumeTagName();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        int int9 = characterReader1.pos();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('#');
        boolean boolean5 = characterReader1.matches("");
        boolean boolean9 = characterReader1.rangeEquals((int) '4', (int) '4', "");
        boolean boolean11 = characterReader1.matches('h');
        boolean boolean13 = characterReader1.matches("i!");
        boolean boolean14 = characterReader1.matchesLetter();
        boolean boolean15 = characterReader1.isEmpty();
        java.lang.String str16 = characterReader1.consumeLetterSequence();
        java.lang.String str17 = characterReader1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matchesDigit();
        java.lang.String str5 = characterReader1.consumeAsString();
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str8 = characterReader1.toString();
        characterReader1.mark();
        java.lang.String str10 = characterReader1.consumeHexSequence();
        characterReader1.mark();
        java.lang.String str13 = characterReader1.consumeTo('4');
        boolean boolean14 = characterReader1.matchesDigit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i!" + "'", str8, "i!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "i!" + "'", str13, "i!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('#');
        char[] charArray7 = new char[] { '#', '#', 'a' };
        boolean boolean8 = characterReader1.matchesAny(charArray7);
        java.lang.String str9 = characterReader1.consumeTagName();
        java.lang.String str10 = characterReader1.consumeHexSequence();
        java.lang.String str12 = characterReader1.consumeTo('h');
        org.jsoup.parser.CharacterReader characterReader14 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str16 = characterReader14.consumeTo('#');
        char[] charArray20 = new char[] { '#', '#', 'a' };
        boolean boolean21 = characterReader14.matchesAny(charArray20);
        boolean boolean22 = characterReader1.matchesAny(charArray20);
        boolean boolean23 = characterReader1.matchesDigit();
        characterReader1.rewindToMark();
        boolean boolean25 = characterReader1.matchesDigit();
        boolean boolean26 = characterReader1.matchesLetter();
        java.lang.String str28 = characterReader1.consumeTo("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        char char3 = characterReader1.current();
        int int5 = characterReader1.nextIndexOf(' ');
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        int int8 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        java.lang.String str10 = characterReader1.consumeTo('\uffff');
        java.lang.String str11 = characterReader1.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str15 = characterReader13.consumeTo('#');
        boolean boolean17 = characterReader13.matches("");
        characterReader13.mark();
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str21 = characterReader20.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        char[] charArray28 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str29 = characterReader23.consumeToAnySorted(charArray28);
        boolean boolean30 = characterReader20.matchesAny(charArray28);
        java.lang.String str31 = characterReader20.consumeHexSequence();
        java.lang.String str32 = characterReader20.consumeData();
        org.jsoup.parser.CharacterReader characterReader34 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str36 = characterReader34.consumeTo('#');
        characterReader34.mark();
        org.jsoup.parser.CharacterReader characterReader39 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str40 = characterReader39.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader42 = new org.jsoup.parser.CharacterReader("");
        char[] charArray47 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str48 = characterReader42.consumeToAnySorted(charArray47);
        boolean boolean49 = characterReader39.matchesAny(charArray47);
        boolean boolean50 = characterReader34.matchesAny(charArray47);
        java.lang.String str51 = characterReader20.consumeToAny(charArray47);
        java.lang.String str52 = characterReader13.consumeToAnySorted(charArray47);
        java.lang.String str53 = characterReader1.consumeToAny(charArray47);
        java.lang.String str54 = characterReader1.consumeData();
        java.lang.String str56 = characterReader1.consumeTo("h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matchesDigit();
        java.lang.String str5 = characterReader1.consumeAsString();
        characterReader1.unconsume();
        characterReader1.advance();
        boolean boolean9 = characterReader1.matchesIgnoreCase("h");
        boolean boolean13 = characterReader1.rangeEquals((int) (byte) -1, 10, "hi!");
        boolean boolean14 = characterReader1.isEmpty();
        int int15 = characterReader1.pos();
        boolean boolean17 = characterReader1.matches("");
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str20 = characterReader19.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("");
        char[] charArray27 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str28 = characterReader22.consumeToAnySorted(charArray27);
        boolean boolean29 = characterReader19.matchesAnySorted(charArray27);
        char[] charArray33 = new char[] { '\uffff', '4', '\uffff' };
        boolean boolean34 = characterReader19.matchesAnySorted(charArray33);
        boolean boolean38 = characterReader19.rangeEquals((-1), (int) ' ', "hi!");
        java.lang.String str39 = characterReader19.consumeLetterSequence();
        boolean boolean41 = characterReader19.containsIgnoreCase("hi");
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean44 = characterReader43.matchesLetter();
        int int46 = characterReader43.nextIndexOf('h');
        org.jsoup.parser.CharacterReader characterReader48 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str50 = characterReader48.consumeTo('#');
        char[] charArray54 = new char[] { '#', '#', 'a' };
        boolean boolean55 = characterReader48.matchesAny(charArray54);
        int int57 = characterReader48.nextIndexOf((java.lang.CharSequence) "hi!");
        java.lang.String str58 = characterReader48.consumeData();
        boolean boolean60 = characterReader48.matchesIgnoreCase("");
        java.lang.String str61 = characterReader48.consumeHexSequence();
        org.jsoup.parser.CharacterReader characterReader63 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str64 = characterReader63.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader66 = new org.jsoup.parser.CharacterReader("");
        char[] charArray71 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str72 = characterReader66.consumeToAnySorted(charArray71);
        boolean boolean73 = characterReader63.matchesAnySorted(charArray71);
        char[] charArray77 = new char[] { '\uffff', '4', '\uffff' };
        boolean boolean78 = characterReader63.matchesAnySorted(charArray77);
        boolean boolean79 = characterReader48.matchesAnySorted(charArray77);
        boolean boolean80 = characterReader43.matchesAnySorted(charArray77);
        java.lang.String str81 = characterReader19.consumeToAny(charArray77);
        boolean boolean82 = characterReader1.matchesAnySorted(charArray77);
        java.lang.String str84 = characterReader1.consumeTo("!");
        int int86 = characterReader1.nextIndexOf('\uffff');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '\uffff', '4', '\uffff' });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] { '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertArrayEquals(charArray71, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertArrayEquals(charArray77, new char[] { '\uffff', '4', '\uffff' });
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "i" + "'", str84, "i");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        char char3 = characterReader1.current();
        int int5 = characterReader1.nextIndexOf(' ');
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        int int7 = characterReader1.pos();
        boolean boolean9 = characterReader1.matches("h");
        boolean boolean11 = characterReader1.matchConsume("!");
        characterReader1.mark();
        java.lang.String str13 = characterReader1.consumeDigitSequence();
        java.lang.String str15 = characterReader1.consumeTo('h');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray6 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        int int10 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        boolean boolean12 = characterReader1.matches("!");
        boolean boolean13 = characterReader1.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader15 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader15.unconsume();
        characterReader15.rewindToMark();
        boolean boolean18 = characterReader15.matchesDigit();
        java.lang.String str19 = characterReader15.consumeAsString();
        boolean boolean21 = characterReader15.matchConsumeIgnoreCase("");
        java.lang.String str22 = characterReader15.toString();
        boolean boolean24 = characterReader15.matches('a');
        boolean boolean26 = characterReader15.matchConsume("hi");
        boolean boolean28 = characterReader15.containsIgnoreCase("hi");
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean31 = characterReader30.matchesDigit();
        int int33 = characterReader30.nextIndexOf('#');
        characterReader30.advance();
        characterReader30.advance();
        boolean boolean39 = characterReader30.rangeEquals((int) (short) -1, (int) (byte) 0, "hi!");
        org.jsoup.parser.CharacterReader characterReader41 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str42 = characterReader41.consumeLetterThenDigitSequence();
        boolean boolean44 = characterReader41.matches(' ');
        boolean boolean46 = characterReader41.matchesIgnoreCase("hi!");
        boolean boolean48 = characterReader41.matches('a');
        java.lang.String str49 = characterReader41.toString();
        org.jsoup.parser.CharacterReader characterReader51 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean52 = characterReader51.matchesLetter();
        java.lang.String str53 = characterReader51.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader55 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader55.unconsume();
        characterReader55.rewindToMark();
        boolean boolean58 = characterReader55.matchesDigit();
        java.lang.String str59 = characterReader55.consumeAsString();
        boolean boolean61 = characterReader55.matchConsumeIgnoreCase("");
        java.lang.String str62 = characterReader55.toString();
        org.jsoup.parser.CharacterReader characterReader64 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str66 = characterReader64.consumeTo('#');
        char[] charArray70 = new char[] { '#', '#', 'a' };
        boolean boolean71 = characterReader64.matchesAny(charArray70);
        java.lang.String str72 = characterReader55.consumeToAnySorted(charArray70);
        java.lang.String str73 = characterReader51.consumeToAnySorted(charArray70);
        boolean boolean74 = characterReader41.matchesAnySorted(charArray70);
        boolean boolean75 = characterReader30.matchesAnySorted(charArray70);
        java.lang.String str76 = characterReader15.consumeToAny(charArray70);
        boolean boolean77 = characterReader1.matchesAny(charArray70);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "i!" + "'", str22, "i!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi" + "'", str53, "hi");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "h" + "'", str59, "h");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "i!" + "'", str62, "i!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertArrayEquals(charArray70, new char[] { '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "i!" + "'", str72, "i!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "!" + "'", str73, "!");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "i!" + "'", str76, "i!");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean5 = characterReader1.matches("");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str8 = characterReader7.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        char[] charArray15 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str16 = characterReader10.consumeToAnySorted(charArray15);
        boolean boolean17 = characterReader7.matchesAnySorted(charArray15);
        boolean boolean19 = characterReader7.matchConsume("hi!");
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("");
        int int23 = characterReader21.nextIndexOf(' ');
        char[] charArray25 = new char[] { '4' };
        java.lang.String str26 = characterReader21.consumeToAny(charArray25);
        java.lang.String str27 = characterReader7.consumeToAny(charArray25);
        boolean boolean28 = characterReader1.matchesAny(charArray25);
        char char29 = characterReader1.consume();
        java.lang.String str31 = characterReader1.consumeTo("h");
        org.jsoup.parser.CharacterReader characterReader33 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str34 = characterReader33.consumeLetterThenDigitSequence();
        boolean boolean36 = characterReader33.matches(' ');
        boolean boolean38 = characterReader33.matchesIgnoreCase("hi!");
        int int40 = characterReader33.nextIndexOf((java.lang.CharSequence) "hi!");
        java.lang.String str41 = characterReader33.toString();
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("");
        char[] charArray48 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str49 = characterReader43.consumeToAnySorted(charArray48);
        java.lang.String str50 = characterReader33.consumeToAny(charArray48);
        boolean boolean51 = characterReader1.matchesAnySorted(charArray48);
        java.lang.String str52 = characterReader1.consumeHexSequence();
        java.lang.String str53 = characterReader1.consumeData();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + 'h' + "'", char29 == 'h');
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "i!" + "'", str31, "i!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        java.lang.String str5 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str6 = characterReader1.consumeToEnd();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        char char3 = characterReader1.current();
        int int5 = characterReader1.nextIndexOf(' ');
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        int int8 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        characterReader1.mark();
        java.lang.String str10 = characterReader1.consumeHexSequence();
        java.lang.String str11 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean12 = characterReader1.matchesLetter();
        java.lang.String str13 = characterReader1.consumeTagName();
        java.lang.String str14 = characterReader1.consumeTagName();
        boolean boolean16 = characterReader1.matchConsume("h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str3 = characterReader1.consumeTagName();
        org.jsoup.parser.CharacterReader characterReader5 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader5.unconsume();
        characterReader5.rewindToMark();
        boolean boolean9 = characterReader5.matches("");
        org.jsoup.parser.CharacterReader characterReader11 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str12 = characterReader11.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader14 = new org.jsoup.parser.CharacterReader("");
        char[] charArray19 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str20 = characterReader14.consumeToAnySorted(charArray19);
        boolean boolean21 = characterReader11.matchesAnySorted(charArray19);
        boolean boolean23 = characterReader11.matchConsume("hi!");
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("");
        int int27 = characterReader25.nextIndexOf(' ');
        char[] charArray29 = new char[] { '4' };
        java.lang.String str30 = characterReader25.consumeToAny(charArray29);
        java.lang.String str31 = characterReader11.consumeToAny(charArray29);
        boolean boolean32 = characterReader5.matchesAny(charArray29);
        boolean boolean33 = characterReader1.matchesAny(charArray29);
        int int35 = characterReader1.nextIndexOf('\uffff');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 0, count 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean2 = characterReader1.matchesLetter();
        java.lang.String str3 = characterReader1.consumeData();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean5 = characterReader1.matches("");
        boolean boolean6 = characterReader1.matchesDigit();
        char char7 = characterReader1.consume();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str10 = characterReader9.consumeLetterThenDigitSequence();
        boolean boolean12 = characterReader9.matches(' ');
        boolean boolean14 = characterReader9.matchesIgnoreCase("hi!");
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str17 = characterReader16.consumeLetterThenDigitSequence();
        boolean boolean19 = characterReader16.matches(' ');
        char char20 = characterReader16.current();
        char[] charArray22 = new char[] { '4' };
        boolean boolean23 = characterReader16.matchesAny(charArray22);
        boolean boolean24 = characterReader9.matchesAnySorted(charArray22);
        boolean boolean25 = characterReader1.matchesAny(charArray22);
        java.lang.String str26 = characterReader1.consumeData();
        boolean boolean28 = characterReader1.matchConsumeIgnoreCase("h");
        boolean boolean30 = characterReader1.matches("h");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'h' + "'", char7 == 'h');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\uffff' + "'", char20 == '\uffff');
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "i!" + "'", str26, "i!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray6 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        java.lang.String str8 = characterReader1.consumeHexSequence();
        java.lang.String str9 = characterReader1.consumeToEnd();
        java.lang.String str10 = characterReader1.consumeData();
        int int12 = characterReader1.nextIndexOf((java.lang.CharSequence) "i");
        boolean boolean13 = characterReader1.matchesDigit();
        boolean boolean14 = characterReader1.isEmpty();
        int int16 = characterReader1.nextIndexOf('\uffff');
        characterReader1.unconsume();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean6 = characterReader1.rangeEquals((int) (short) 1, (int) '#', "h");
        int int7 = characterReader1.pos();
        characterReader1.mark();
        characterReader1.unconsume();
        boolean boolean10 = characterReader1.matchesDigit();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi" + "'", str2, "hi");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean5 = characterReader1.matches("");
        boolean boolean9 = characterReader1.rangeEquals((int) (byte) 100, (int) 'i', "hi");
        characterReader1.mark();
        boolean boolean12 = characterReader1.matchConsumeIgnoreCase("i!");
        boolean boolean13 = characterReader1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matchesDigit();
        java.lang.String str5 = characterReader1.consumeAsString();
        characterReader1.unconsume();
        java.lang.String str7 = characterReader1.consumeTagName();
        char char8 = characterReader1.current();
        char char9 = characterReader1.current();
        java.lang.String str10 = characterReader1.consumeLetterSequence();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        char char3 = characterReader1.current();
        int int5 = characterReader1.nextIndexOf(' ');
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        int int8 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        char char9 = characterReader1.current();
        java.lang.String str10 = characterReader1.toString();
        java.lang.String str12 = characterReader1.consumeTo('h');
        boolean boolean16 = characterReader1.rangeEquals((int) (byte) 100, (int) ' ', "hi");
        boolean boolean18 = characterReader1.matchesIgnoreCase("hi");
        boolean boolean19 = characterReader1.isEmpty();
        java.lang.String str20 = characterReader1.consumeTagName();
        boolean boolean22 = characterReader1.matchConsume("i!");
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader24.unconsume();
        characterReader24.rewindToMark();
        boolean boolean28 = characterReader24.matches("");
        boolean boolean29 = characterReader24.isEmpty();
        org.jsoup.parser.CharacterReader characterReader31 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str32 = characterReader31.consumeLetterThenDigitSequence();
        char char33 = characterReader31.current();
        int int35 = characterReader31.nextIndexOf(' ');
        java.lang.String str36 = characterReader31.consumeLetterSequence();
        int int38 = characterReader31.nextIndexOf((java.lang.CharSequence) "hi!");
        org.jsoup.parser.CharacterReader characterReader40 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str41 = characterReader40.consumeLetterThenDigitSequence();
        char char42 = characterReader40.current();
        boolean boolean46 = characterReader40.rangeEquals(0, (int) (short) 1, "");
        org.jsoup.parser.CharacterReader characterReader48 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str49 = characterReader48.consumeLetterThenDigitSequence();
        boolean boolean51 = characterReader48.matches(' ');
        boolean boolean53 = characterReader48.matchesIgnoreCase("hi!");
        boolean boolean55 = characterReader48.matches('a');
        boolean boolean56 = characterReader48.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader58 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str60 = characterReader58.consumeTo('#');
        characterReader58.mark();
        org.jsoup.parser.CharacterReader characterReader63 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str64 = characterReader63.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader66 = new org.jsoup.parser.CharacterReader("");
        char[] charArray71 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str72 = characterReader66.consumeToAnySorted(charArray71);
        boolean boolean73 = characterReader63.matchesAny(charArray71);
        boolean boolean74 = characterReader58.matchesAny(charArray71);
        java.lang.String str75 = characterReader48.consumeToAny(charArray71);
        java.lang.String str76 = characterReader40.consumeToAny(charArray71);
        java.lang.String str77 = characterReader31.consumeToAnySorted(charArray71);
        boolean boolean78 = characterReader24.matchesAny(charArray71);
        java.lang.String str79 = characterReader1.consumeToAny(charArray71);
        boolean boolean81 = characterReader1.matches("i");
        java.lang.String str82 = characterReader1.consumeHexSequence();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '\uffff' + "'", char33 == '\uffff');
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + char42 + "' != '" + '\uffff' + "'", char42 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertArrayEquals(charArray71, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        int int8 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str13 = characterReader12.consumeLetterThenDigitSequence();
        boolean boolean15 = characterReader12.matches(' ');
        boolean boolean17 = characterReader12.matchesIgnoreCase("hi!");
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str20 = characterReader19.consumeLetterThenDigitSequence();
        boolean boolean22 = characterReader19.matches(' ');
        char char23 = characterReader19.current();
        char[] charArray25 = new char[] { '4' };
        boolean boolean26 = characterReader19.matchesAny(charArray25);
        boolean boolean27 = characterReader12.matchesAnySorted(charArray25);
        java.lang.String str28 = characterReader10.consumeToAnySorted(charArray25);
        boolean boolean29 = characterReader1.matchesAny(charArray25);
        int int30 = characterReader1.pos();
        characterReader1.mark();
        char char32 = characterReader1.current();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\uffff' + "'", char23 == '\uffff');
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\uffff' + "'", char32 == '\uffff');
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader4 = new org.jsoup.parser.CharacterReader("");
        char[] charArray9 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str10 = characterReader4.consumeToAnySorted(charArray9);
        boolean boolean11 = characterReader1.matchesAnySorted(charArray9);
        char[] charArray15 = new char[] { '\uffff', '4', '\uffff' };
        boolean boolean16 = characterReader1.matchesAnySorted(charArray15);
        java.lang.String str18 = characterReader1.consumeTo('#');
        java.lang.String str19 = characterReader1.consumeHexSequence();
        java.lang.String str20 = characterReader1.consumeTagName();
        java.lang.String str21 = characterReader1.consumeToEnd();
        int int23 = characterReader1.nextIndexOf('h');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', '4', '\uffff' });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matchConsumeIgnoreCase("!");
        java.lang.String str4 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeTo("hi");
        characterReader1.mark();
        boolean boolean9 = characterReader1.matches("!");
        boolean boolean10 = characterReader1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        char char3 = characterReader1.current();
        boolean boolean4 = characterReader1.isEmpty();
        java.lang.String str6 = characterReader1.consumeTo('#');
        boolean boolean8 = characterReader1.matches("!");
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        char[] charArray15 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str16 = characterReader10.consumeToAnySorted(charArray15);
        java.lang.String str17 = characterReader10.consumeHexSequence();
        java.lang.String str18 = characterReader10.consumeToEnd();
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str21 = characterReader20.consumeLetterThenDigitSequence();
        char char22 = characterReader20.current();
        boolean boolean26 = characterReader20.rangeEquals(0, (int) (short) 1, "");
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str29 = characterReader28.consumeLetterThenDigitSequence();
        boolean boolean31 = characterReader28.matches(' ');
        boolean boolean33 = characterReader28.matchesIgnoreCase("hi!");
        boolean boolean35 = characterReader28.matches('a');
        boolean boolean36 = characterReader28.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader38 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str40 = characterReader38.consumeTo('#');
        characterReader38.mark();
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str44 = characterReader43.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader46 = new org.jsoup.parser.CharacterReader("");
        char[] charArray51 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str52 = characterReader46.consumeToAnySorted(charArray51);
        boolean boolean53 = characterReader43.matchesAny(charArray51);
        boolean boolean54 = characterReader38.matchesAny(charArray51);
        java.lang.String str55 = characterReader28.consumeToAny(charArray51);
        java.lang.String str56 = characterReader20.consumeToAny(charArray51);
        java.lang.String str57 = characterReader10.consumeToAny(charArray51);
        boolean boolean59 = characterReader10.matchesIgnoreCase("");
        char char60 = characterReader10.current();
        org.jsoup.parser.CharacterReader characterReader62 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str63 = characterReader62.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader65 = new org.jsoup.parser.CharacterReader("");
        char[] charArray70 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str71 = characterReader65.consumeToAnySorted(charArray70);
        boolean boolean72 = characterReader62.matchesAnySorted(charArray70);
        java.lang.String str73 = characterReader10.consumeToAny(charArray70);
        boolean boolean74 = characterReader1.matchesAny(charArray70);
        int int75 = characterReader1.pos();
        characterReader1.rewindToMark();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\uffff' + "'", char22 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + char60 + "' != '" + '\uffff' + "'", char60 == '\uffff');
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertArrayEquals(charArray70, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matchesDigit();
        java.lang.String str5 = characterReader1.consumeAsString();
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str8 = characterReader1.toString();
        boolean boolean10 = characterReader1.matches('a');
        boolean boolean12 = characterReader1.matchConsume("hi");
        boolean boolean14 = characterReader1.matchConsumeIgnoreCase("h");
        boolean boolean16 = characterReader1.containsIgnoreCase("i");
        boolean boolean20 = characterReader1.rangeEquals((int) (short) 1, (int) '!', "hi!");
        boolean boolean22 = characterReader1.matches("i");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i!" + "'", str8, "i!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader4 = new org.jsoup.parser.CharacterReader("");
        char[] charArray9 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str10 = characterReader4.consumeToAnySorted(charArray9);
        boolean boolean11 = characterReader1.matchesAnySorted(charArray9);
        boolean boolean13 = characterReader1.matchConsume("hi!");
        org.jsoup.parser.CharacterReader characterReader15 = new org.jsoup.parser.CharacterReader("");
        int int17 = characterReader15.nextIndexOf(' ');
        char[] charArray19 = new char[] { '4' };
        java.lang.String str20 = characterReader15.consumeToAny(charArray19);
        java.lang.String str21 = characterReader1.consumeToAny(charArray19);
        boolean boolean22 = characterReader1.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("");
        char[] charArray29 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str30 = characterReader24.consumeToAnySorted(charArray29);
        java.lang.String str31 = characterReader24.consumeHexSequence();
        boolean boolean33 = characterReader24.matches('\uffff');
        java.lang.String str34 = characterReader24.consumeToEnd();
        java.lang.String str35 = characterReader24.consumeLetterThenDigitSequence();
        int int36 = characterReader24.pos();
        org.jsoup.parser.CharacterReader characterReader38 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str39 = characterReader38.consumeLetterThenDigitSequence();
        char char40 = characterReader38.current();
        int int42 = characterReader38.nextIndexOf(' ');
        java.lang.String str43 = characterReader38.consumeLetterSequence();
        int int44 = characterReader38.pos();
        boolean boolean46 = characterReader38.matches("h");
        org.jsoup.parser.CharacterReader characterReader48 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str49 = characterReader48.consumeLetterThenDigitSequence();
        char char50 = characterReader48.current();
        boolean boolean54 = characterReader48.rangeEquals(0, (int) (short) 1, "");
        org.jsoup.parser.CharacterReader characterReader56 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str57 = characterReader56.consumeLetterThenDigitSequence();
        boolean boolean59 = characterReader56.matches(' ');
        boolean boolean61 = characterReader56.matchesIgnoreCase("hi!");
        boolean boolean63 = characterReader56.matches('a');
        boolean boolean64 = characterReader56.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader66 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str68 = characterReader66.consumeTo('#');
        characterReader66.mark();
        org.jsoup.parser.CharacterReader characterReader71 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str72 = characterReader71.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader74 = new org.jsoup.parser.CharacterReader("");
        char[] charArray79 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str80 = characterReader74.consumeToAnySorted(charArray79);
        boolean boolean81 = characterReader71.matchesAny(charArray79);
        boolean boolean82 = characterReader66.matchesAny(charArray79);
        java.lang.String str83 = characterReader56.consumeToAny(charArray79);
        java.lang.String str84 = characterReader48.consumeToAny(charArray79);
        boolean boolean85 = characterReader38.matchesAnySorted(charArray79);
        boolean boolean86 = characterReader24.matchesAnySorted(charArray79);
        java.lang.String str87 = characterReader1.consumeToAnySorted(charArray79);
        int int89 = characterReader1.nextIndexOf('#');
        java.lang.String str90 = characterReader1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + char40 + "' != '" + '\uffff' + "'", char40 == '\uffff');
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + char50 + "' != '" + '\uffff' + "'", char50 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertArrayEquals(charArray79, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray6 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        java.lang.String str8 = characterReader1.consumeHexSequence();
        java.lang.String str9 = characterReader1.consumeToEnd();
        java.lang.String str10 = characterReader1.consumeToEnd();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str13 = characterReader12.consumeLetterThenDigitSequence();
        boolean boolean15 = characterReader12.matches(' ');
        java.lang.String str16 = characterReader12.toString();
        char char17 = characterReader12.current();
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str21 = characterReader19.consumeTo('#');
        characterReader19.mark();
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str25 = characterReader24.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader27 = new org.jsoup.parser.CharacterReader("");
        char[] charArray32 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str33 = characterReader27.consumeToAnySorted(charArray32);
        boolean boolean34 = characterReader24.matchesAny(charArray32);
        boolean boolean35 = characterReader19.matchesAny(charArray32);
        boolean boolean36 = characterReader12.matchesAny(charArray32);
        java.lang.String str37 = characterReader1.consumeToAnySorted(charArray32);
        characterReader1.rewindToMark();
        boolean boolean40 = characterReader1.matchesIgnoreCase("hi");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\uffff' + "'", char17 == '\uffff');
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean8 = characterReader1.matches('a');
        characterReader1.advance();
        boolean boolean13 = characterReader1.rangeEquals((int) (byte) 10, (int) (short) 10, "i!");
        boolean boolean14 = characterReader1.matchesLetter();
        java.lang.String str15 = characterReader1.consumeLetterThenDigitSequence();
        characterReader1.advance();
        boolean boolean17 = characterReader1.isEmpty();
        boolean boolean18 = characterReader1.isEmpty();
        java.lang.String str19 = characterReader1.consumeLetterSequence();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('#');
        boolean boolean5 = characterReader1.matches("");
        boolean boolean9 = characterReader1.rangeEquals((int) '4', (int) '4', "");
        int int11 = characterReader1.nextIndexOf('4');
        boolean boolean12 = characterReader1.isEmpty();
        java.lang.String str13 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str14 = characterReader1.consumeHexSequence();
        boolean boolean16 = characterReader1.matches("h");
        boolean boolean17 = characterReader1.matchesDigit();
        boolean boolean18 = characterReader1.matchesDigit();
        characterReader1.unconsume();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray6 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        java.lang.String str8 = characterReader1.consumeHexSequence();
        boolean boolean10 = characterReader1.matches('\uffff');
        java.lang.String str11 = characterReader1.consumeToEnd();
        java.lang.String str12 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean13 = characterReader1.matchesLetter();
        java.lang.String str15 = characterReader1.consumeTo('#');
        boolean boolean17 = characterReader1.matchesIgnoreCase("");
        char char18 = characterReader1.consume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = characterReader1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 1, count -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\uffff' + "'", char18 == '\uffff');
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray6 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        java.lang.String str8 = characterReader1.consumeHexSequence();
        java.lang.String str9 = characterReader1.consumeToEnd();
        org.jsoup.parser.CharacterReader characterReader11 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str12 = characterReader11.consumeLetterThenDigitSequence();
        char char13 = characterReader11.current();
        boolean boolean17 = characterReader11.rangeEquals(0, (int) (short) 1, "");
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str20 = characterReader19.consumeLetterThenDigitSequence();
        boolean boolean22 = characterReader19.matches(' ');
        boolean boolean24 = characterReader19.matchesIgnoreCase("hi!");
        boolean boolean26 = characterReader19.matches('a');
        boolean boolean27 = characterReader19.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader29 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str31 = characterReader29.consumeTo('#');
        characterReader29.mark();
        org.jsoup.parser.CharacterReader characterReader34 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str35 = characterReader34.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("");
        char[] charArray42 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str43 = characterReader37.consumeToAnySorted(charArray42);
        boolean boolean44 = characterReader34.matchesAny(charArray42);
        boolean boolean45 = characterReader29.matchesAny(charArray42);
        java.lang.String str46 = characterReader19.consumeToAny(charArray42);
        java.lang.String str47 = characterReader11.consumeToAny(charArray42);
        java.lang.String str48 = characterReader1.consumeToAny(charArray42);
        java.lang.String str49 = characterReader1.consumeHexSequence();
        org.jsoup.parser.CharacterReader characterReader51 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str52 = characterReader51.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader54 = new org.jsoup.parser.CharacterReader("");
        char[] charArray59 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str60 = characterReader54.consumeToAnySorted(charArray59);
        boolean boolean61 = characterReader51.matchesAnySorted(charArray59);
        boolean boolean63 = characterReader51.matchConsume("hi!");
        org.jsoup.parser.CharacterReader characterReader65 = new org.jsoup.parser.CharacterReader("");
        int int67 = characterReader65.nextIndexOf(' ');
        char[] charArray69 = new char[] { '4' };
        java.lang.String str70 = characterReader65.consumeToAny(charArray69);
        java.lang.String str71 = characterReader51.consumeToAny(charArray69);
        org.jsoup.parser.CharacterReader characterReader73 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str74 = characterReader73.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader76 = new org.jsoup.parser.CharacterReader("");
        char[] charArray81 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str82 = characterReader76.consumeToAnySorted(charArray81);
        boolean boolean83 = characterReader73.matchesAnySorted(charArray81);
        char[] charArray87 = new char[] { '\uffff', '4', '\uffff' };
        boolean boolean88 = characterReader73.matchesAnySorted(charArray87);
        boolean boolean89 = characterReader51.matchesAnySorted(charArray87);
        boolean boolean90 = characterReader1.matchesAnySorted(charArray87);
        boolean boolean94 = characterReader1.rangeEquals((int) 'h', (int) (short) -1, "h");
        java.lang.String str95 = characterReader1.consumeTagName();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\uffff' + "'", char13 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertArrayEquals(charArray69, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertArrayEquals(charArray81, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(charArray87);
        org.junit.Assert.assertArrayEquals(charArray87, new char[] { '\uffff', '4', '\uffff' });
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('#');
        boolean boolean5 = characterReader1.matches("");
        boolean boolean9 = characterReader1.rangeEquals((int) '4', (int) '4', "");
        int int11 = characterReader1.nextIndexOf('4');
        java.lang.String str13 = characterReader1.consumeTo('h');
        boolean boolean17 = characterReader1.rangeEquals((int) (short) 10, (int) '#', "hi");
        int int19 = characterReader1.nextIndexOf('a');
        java.lang.String str20 = characterReader1.consumeHexSequence();
        boolean boolean21 = characterReader1.matchesDigit();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('#');
        boolean boolean5 = characterReader1.matches("");
        boolean boolean9 = characterReader1.rangeEquals((int) '4', (int) '4', "");
        boolean boolean11 = characterReader1.matches('h');
        boolean boolean15 = characterReader1.rangeEquals(1, (int) (short) 10, "");
        char char16 = characterReader1.consume();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\uffff' + "'", char16 == '\uffff');
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray6 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        java.lang.String str8 = characterReader1.consumeHexSequence();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str11 = characterReader10.consumeLetterThenDigitSequence();
        boolean boolean13 = characterReader10.matches(' ');
        boolean boolean15 = characterReader10.matchesIgnoreCase("hi!");
        boolean boolean17 = characterReader10.matches('a');
        boolean boolean18 = characterReader10.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str22 = characterReader20.consumeTo('#');
        characterReader20.mark();
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str26 = characterReader25.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader("");
        char[] charArray33 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str34 = characterReader28.consumeToAnySorted(charArray33);
        boolean boolean35 = characterReader25.matchesAny(charArray33);
        boolean boolean36 = characterReader20.matchesAny(charArray33);
        java.lang.String str37 = characterReader10.consumeToAny(charArray33);
        boolean boolean38 = characterReader1.matchesAnySorted(charArray33);
        char char39 = characterReader1.consume();
        boolean boolean41 = characterReader1.matchConsumeIgnoreCase("i!");
        boolean boolean42 = characterReader1.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader44 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str46 = characterReader44.consumeTo('#');
        characterReader44.mark();
        org.jsoup.parser.CharacterReader characterReader49 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str50 = characterReader49.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader52 = new org.jsoup.parser.CharacterReader("");
        char[] charArray57 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str58 = characterReader52.consumeToAnySorted(charArray57);
        boolean boolean59 = characterReader49.matchesAny(charArray57);
        boolean boolean60 = characterReader44.matchesAny(charArray57);
        java.lang.String str61 = characterReader44.toString();
        org.jsoup.parser.CharacterReader characterReader63 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str64 = characterReader63.consumeLetterThenDigitSequence();
        boolean boolean66 = characterReader63.matches(' ');
        char char67 = characterReader63.current();
        char[] charArray69 = new char[] { '4' };
        boolean boolean70 = characterReader63.matchesAny(charArray69);
        boolean boolean71 = characterReader44.matchesAnySorted(charArray69);
        java.lang.String str72 = characterReader1.consumeToAny(charArray69);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str73 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 1, count 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + char39 + "' != '" + '\uffff' + "'", char39 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertArrayEquals(charArray57, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + char67 + "' != '" + '\uffff' + "'", char67 == '\uffff');
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertArrayEquals(charArray69, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        char char3 = characterReader1.current();
        int int5 = characterReader1.nextIndexOf(' ');
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        int int8 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        char char9 = characterReader1.current();
        java.lang.String str10 = characterReader1.toString();
        java.lang.String str12 = characterReader1.consumeTo('h');
        java.lang.String str13 = characterReader1.consumeTagName();
        characterReader1.mark();
        java.lang.String str15 = characterReader1.consumeHexSequence();
        int int16 = characterReader1.pos();
        boolean boolean18 = characterReader1.matches("!");
        boolean boolean19 = characterReader1.matchesDigit();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader4 = new org.jsoup.parser.CharacterReader("");
        char[] charArray9 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str10 = characterReader4.consumeToAnySorted(charArray9);
        boolean boolean11 = characterReader1.matchesAnySorted(charArray9);
        characterReader1.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader14 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader14.unconsume();
        characterReader14.rewindToMark();
        boolean boolean18 = characterReader14.matches("");
        boolean boolean19 = characterReader14.matchesDigit();
        char char20 = characterReader14.consume();
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str23 = characterReader22.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("");
        char[] charArray30 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str31 = characterReader25.consumeToAnySorted(charArray30);
        boolean boolean32 = characterReader22.matchesAnySorted(charArray30);
        java.lang.String str33 = characterReader14.consumeToAnySorted(charArray30);
        boolean boolean34 = characterReader1.matchesAnySorted(charArray30);
        characterReader1.mark();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + 'h' + "'", char20 == 'h');
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "i!" + "'", str33, "i!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean5 = characterReader1.matches("");
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("");
        boolean boolean9 = characterReader1.matchConsume("");
        boolean boolean11 = characterReader1.containsIgnoreCase("i!");
        boolean boolean13 = characterReader1.matchConsumeIgnoreCase("i!");
        java.lang.String str14 = characterReader1.consumeAsString();
        boolean boolean15 = characterReader1.matchesDigit();
        java.lang.String str16 = characterReader1.consumeDigitSequence();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('#');
        boolean boolean5 = characterReader1.matches("");
        boolean boolean9 = characterReader1.rangeEquals((int) '4', (int) '4', "");
        int int11 = characterReader1.nextIndexOf('4');
        boolean boolean12 = characterReader1.isEmpty();
        java.lang.String str13 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str14 = characterReader1.consumeLetterThenDigitSequence();
        int int16 = characterReader1.nextIndexOf((java.lang.CharSequence) "i!");
        java.lang.String str18 = characterReader1.consumeTo(' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matchesDigit();
        java.lang.String str5 = characterReader1.consumeData();
        characterReader1.rewindToMark();
        boolean boolean8 = characterReader1.matches('h');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        char char3 = characterReader1.current();
        int int5 = characterReader1.nextIndexOf(' ');
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        int int8 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        characterReader1.mark();
        java.lang.String str10 = characterReader1.consumeHexSequence();
        char[] charArray13 = new char[] { '#', 'a' };
        java.lang.String str14 = characterReader1.consumeToAny(charArray13);
        int int16 = characterReader1.nextIndexOf((java.lang.CharSequence) "!");
        org.jsoup.parser.CharacterReader characterReader18 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str19 = characterReader18.consumeLetterThenDigitSequence();
        boolean boolean21 = characterReader18.matches(' ');
        char char22 = characterReader18.consume();
        boolean boolean24 = characterReader18.matches(' ');
        int int26 = characterReader18.nextIndexOf((java.lang.CharSequence) "i!");
        characterReader18.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader29 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean30 = characterReader29.matchesDigit();
        int int31 = characterReader29.pos();
        boolean boolean32 = characterReader29.isEmpty();
        org.jsoup.parser.CharacterReader characterReader34 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str35 = characterReader34.consumeLetterThenDigitSequence();
        boolean boolean37 = characterReader34.matches(' ');
        boolean boolean39 = characterReader34.matchesIgnoreCase("hi!");
        boolean boolean41 = characterReader34.matches('a');
        java.lang.String str42 = characterReader34.toString();
        org.jsoup.parser.CharacterReader characterReader44 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean45 = characterReader44.matchesLetter();
        java.lang.String str46 = characterReader44.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader48 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader48.unconsume();
        characterReader48.rewindToMark();
        boolean boolean51 = characterReader48.matchesDigit();
        java.lang.String str52 = characterReader48.consumeAsString();
        boolean boolean54 = characterReader48.matchConsumeIgnoreCase("");
        java.lang.String str55 = characterReader48.toString();
        org.jsoup.parser.CharacterReader characterReader57 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str59 = characterReader57.consumeTo('#');
        char[] charArray63 = new char[] { '#', '#', 'a' };
        boolean boolean64 = characterReader57.matchesAny(charArray63);
        java.lang.String str65 = characterReader48.consumeToAnySorted(charArray63);
        java.lang.String str66 = characterReader44.consumeToAnySorted(charArray63);
        boolean boolean67 = characterReader34.matchesAnySorted(charArray63);
        java.lang.String str68 = characterReader29.consumeToAny(charArray63);
        boolean boolean69 = characterReader18.matchesAnySorted(charArray63);
        java.lang.String str70 = characterReader1.consumeToAnySorted(charArray63);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', 'a' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\uffff' + "'", char22 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi" + "'", str46, "hi");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "h" + "'", str52, "h");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "i!" + "'", str55, "i!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertArrayEquals(charArray63, new char[] { '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "i!" + "'", str65, "i!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "!" + "'", str66, "!");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matchesDigit();
        java.lang.String str5 = characterReader1.consumeAsString();
        java.lang.String str7 = characterReader1.consumeTo('a');
        int int9 = characterReader1.nextIndexOf('h');
        java.lang.Class<?> wildcardClass10 = characterReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "i!" + "'", str7, "i!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('#');
        boolean boolean5 = characterReader1.matches("");
        boolean boolean9 = characterReader1.rangeEquals((int) '4', (int) '4', "");
        int int11 = characterReader1.nextIndexOf('4');
        java.lang.String str13 = characterReader1.consumeTo('h');
        boolean boolean17 = characterReader1.rangeEquals((int) (short) 10, (int) '#', "hi");
        boolean boolean21 = characterReader1.rangeEquals((int) (short) 10, (int) 'a', "hi");
        characterReader1.rewindToMark();
        characterReader1.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader25.unconsume();
        characterReader25.rewindToMark();
        boolean boolean28 = characterReader25.matchesDigit();
        java.lang.String str29 = characterReader25.consumeAsString();
        boolean boolean31 = characterReader25.matchConsumeIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader33 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str34 = characterReader33.consumeLetterThenDigitSequence();
        boolean boolean36 = characterReader33.matches(' ');
        boolean boolean38 = characterReader33.matchesIgnoreCase("hi!");
        boolean boolean40 = characterReader33.matches('a');
        boolean boolean41 = characterReader33.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str45 = characterReader43.consumeTo('#');
        characterReader43.mark();
        org.jsoup.parser.CharacterReader characterReader48 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str49 = characterReader48.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader51 = new org.jsoup.parser.CharacterReader("");
        char[] charArray56 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str57 = characterReader51.consumeToAnySorted(charArray56);
        boolean boolean58 = characterReader48.matchesAny(charArray56);
        boolean boolean59 = characterReader43.matchesAny(charArray56);
        java.lang.String str60 = characterReader33.consumeToAny(charArray56);
        java.lang.String str61 = characterReader25.consumeToAny(charArray56);
        boolean boolean63 = characterReader25.containsIgnoreCase("h");
        characterReader25.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader66 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str67 = characterReader66.consumeLetterThenDigitSequence();
        char char68 = characterReader66.current();
        int int70 = characterReader66.nextIndexOf(' ');
        java.lang.String str71 = characterReader66.consumeLetterSequence();
        int int73 = characterReader66.nextIndexOf((java.lang.CharSequence) "hi!");
        char char74 = characterReader66.current();
        java.lang.String str75 = characterReader66.consumeDigitSequence();
        boolean boolean76 = characterReader66.isEmpty();
        char[] charArray77 = new char[] {};
        java.lang.String str78 = characterReader66.consumeToAny(charArray77);
        java.lang.String str79 = characterReader25.consumeToAnySorted(charArray77);
        java.lang.String str80 = characterReader1.consumeToAnySorted(charArray77);
        characterReader1.mark();
        boolean boolean83 = characterReader1.matches('#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "h" + "'", str29, "h");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertArrayEquals(charArray56, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "i!" + "'", str61, "i!");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + char68 + "' != '" + '\uffff' + "'", char68 == '\uffff');
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + char74 + "' != '" + '\uffff' + "'", char74 == '\uffff');
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertArrayEquals(charArray77, new char[] {});
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        char char3 = characterReader1.current();
        int int5 = characterReader1.nextIndexOf(' ');
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        int int7 = characterReader1.pos();
        boolean boolean9 = characterReader1.matches("h");
        boolean boolean11 = characterReader1.matchConsume("!");
        characterReader1.mark();
        java.lang.String str13 = characterReader1.consumeHexSequence();
        java.lang.String str15 = characterReader1.consumeTo(' ');
        boolean boolean16 = characterReader1.isEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('#');
        boolean boolean5 = characterReader1.matches("");
        boolean boolean9 = characterReader1.rangeEquals((int) '4', (int) '4', "");
        boolean boolean11 = characterReader1.matches('h');
        int int13 = characterReader1.nextIndexOf('h');
        boolean boolean14 = characterReader1.isEmpty();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        java.lang.String str7 = characterReader1.consumeToEnd();
        java.lang.String str8 = characterReader1.consumeHexSequence();
        int int10 = characterReader1.nextIndexOf((java.lang.CharSequence) "h");
        char char11 = characterReader1.consume();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\uffff' + "'", char11 == '\uffff');
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        char char5 = characterReader1.current();
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = characterReader1.matchesAny(charArray7);
        java.lang.String str10 = characterReader1.consumeTo('\uffff');
        java.lang.String str12 = characterReader1.consumeTo('a');
        int int14 = characterReader1.nextIndexOf(' ');
        boolean boolean15 = characterReader1.matchesDigit();
        java.lang.String str16 = characterReader1.consumeData();
        boolean boolean17 = characterReader1.matchesLetter();
        boolean boolean18 = characterReader1.isEmpty();
        java.lang.String str19 = characterReader1.consumeLetterSequence();
        java.lang.String str20 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str21 = characterReader1.consumeLetterSequence();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\uffff' + "'", char5 == '\uffff');
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader4 = new org.jsoup.parser.CharacterReader("");
        char[] charArray9 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str10 = characterReader4.consumeToAnySorted(charArray9);
        boolean boolean11 = characterReader1.matchesAnySorted(charArray9);
        java.lang.String str12 = characterReader1.consumeLetterThenDigitSequence();
        int int13 = characterReader1.pos();
        boolean boolean15 = characterReader1.matchConsumeIgnoreCase("i!");
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("");
        int int19 = characterReader17.nextIndexOf(' ');
        char[] charArray21 = new char[] { '4' };
        java.lang.String str22 = characterReader17.consumeToAny(charArray21);
        boolean boolean23 = characterReader1.matchesAny(charArray21);
        java.lang.String str24 = characterReader1.toString();
        boolean boolean26 = characterReader1.matchConsumeIgnoreCase("hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        boolean boolean6 = characterReader1.matches("");
        java.lang.String str7 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str9 = characterReader1.consumeTo("hi");
        boolean boolean11 = characterReader1.matches("h");
        boolean boolean15 = characterReader1.rangeEquals((int) 'a', 100, "i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        int int3 = characterReader1.nextIndexOf(' ');
        char[] charArray5 = new char[] { '4' };
        java.lang.String str6 = characterReader1.consumeToAny(charArray5);
        java.lang.String str7 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean9 = characterReader1.containsIgnoreCase("!");
        boolean boolean10 = characterReader1.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader12.unconsume();
        characterReader12.rewindToMark();
        boolean boolean15 = characterReader12.matchesDigit();
        java.lang.String str16 = characterReader12.consumeAsString();
        boolean boolean18 = characterReader12.matchConsumeIgnoreCase("");
        java.lang.String str19 = characterReader12.toString();
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str23 = characterReader21.consumeTo('#');
        char[] charArray27 = new char[] { '#', '#', 'a' };
        boolean boolean28 = characterReader21.matchesAny(charArray27);
        java.lang.String str29 = characterReader12.consumeToAnySorted(charArray27);
        java.lang.String str30 = characterReader12.consumeTagName();
        java.lang.String str32 = characterReader12.consumeTo(' ');
        org.jsoup.parser.CharacterReader characterReader34 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader34.unconsume();
        characterReader34.rewindToMark();
        boolean boolean37 = characterReader34.matchesDigit();
        java.lang.String str38 = characterReader34.consumeAsString();
        characterReader34.unconsume();
        characterReader34.advance();
        boolean boolean42 = characterReader34.matchesIgnoreCase("h");
        boolean boolean46 = characterReader34.rangeEquals((int) (byte) -1, 10, "hi!");
        org.jsoup.parser.CharacterReader characterReader48 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str49 = characterReader48.consumeLetterThenDigitSequence();
        boolean boolean51 = characterReader48.matches(' ');
        boolean boolean53 = characterReader48.matchesIgnoreCase("hi!");
        boolean boolean55 = characterReader48.matches('a');
        characterReader48.advance();
        boolean boolean58 = characterReader48.containsIgnoreCase("h");
        boolean boolean60 = characterReader48.containsIgnoreCase("h");
        org.jsoup.parser.CharacterReader characterReader62 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str63 = characterReader62.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader65 = new org.jsoup.parser.CharacterReader("");
        char[] charArray70 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str71 = characterReader65.consumeToAnySorted(charArray70);
        boolean boolean72 = characterReader62.matchesAnySorted(charArray70);
        characterReader62.rewindToMark();
        characterReader62.mark();
        java.lang.String str75 = characterReader62.toString();
        org.jsoup.parser.CharacterReader characterReader77 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str79 = characterReader77.consumeTo('#');
        char[] charArray83 = new char[] { '#', '#', 'a' };
        boolean boolean84 = characterReader77.matchesAny(charArray83);
        boolean boolean85 = characterReader62.matchesAnySorted(charArray83);
        java.lang.String str86 = characterReader48.consumeToAny(charArray83);
        boolean boolean87 = characterReader34.matchesAnySorted(charArray83);
        boolean boolean88 = characterReader12.matchesAny(charArray83);
        java.lang.String str89 = characterReader1.consumeToAnySorted(charArray83);
        int int91 = characterReader1.nextIndexOf((java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "i!" + "'", str19, "i!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "i!" + "'", str29, "i!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "h" + "'", str38, "h");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertArrayEquals(charArray70, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(charArray83);
        org.junit.Assert.assertArrayEquals(charArray83, new char[] { '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean5 = characterReader1.matches('\uffff');
        java.lang.String str6 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean8 = characterReader1.containsIgnoreCase("hi");
        boolean boolean9 = characterReader1.matchesDigit();
        java.lang.String str10 = characterReader1.consumeAsString();
        boolean boolean12 = characterReader1.matchesIgnoreCase("hi");
        boolean boolean14 = characterReader1.matchesIgnoreCase("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi" + "'", str6, "hi");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "!" + "'", str10, "!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean5 = characterReader1.matches("");
        boolean boolean6 = characterReader1.isEmpty();
        boolean boolean7 = characterReader1.matchesLetter();
        java.lang.String str8 = characterReader1.consumeDigitSequence();
        boolean boolean10 = characterReader1.matches("h");
        java.lang.String str11 = characterReader1.consumeLetterSequence();
        boolean boolean15 = characterReader1.rangeEquals((int) '\uffff', (int) (byte) 1, "");
        boolean boolean17 = characterReader1.matchConsumeIgnoreCase("hi");
        java.lang.String str19 = characterReader1.consumeTo('i');
        char char20 = characterReader1.current();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi" + "'", str11, "hi");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "!" + "'", str19, "!");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\uffff' + "'", char20 == '\uffff');
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean5 = characterReader1.matches("");
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        java.lang.String str7 = characterReader1.consumeToEnd();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str10 = characterReader9.consumeLetterThenDigitSequence();
        boolean boolean12 = characterReader9.matches(' ');
        boolean boolean14 = characterReader9.matchesIgnoreCase("hi!");
        boolean boolean16 = characterReader9.matches('a');
        java.lang.String str17 = characterReader9.toString();
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean20 = characterReader19.matchesLetter();
        java.lang.String str21 = characterReader19.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader23.unconsume();
        characterReader23.rewindToMark();
        boolean boolean26 = characterReader23.matchesDigit();
        java.lang.String str27 = characterReader23.consumeAsString();
        boolean boolean29 = characterReader23.matchConsumeIgnoreCase("");
        java.lang.String str30 = characterReader23.toString();
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str34 = characterReader32.consumeTo('#');
        char[] charArray38 = new char[] { '#', '#', 'a' };
        boolean boolean39 = characterReader32.matchesAny(charArray38);
        java.lang.String str40 = characterReader23.consumeToAnySorted(charArray38);
        java.lang.String str41 = characterReader19.consumeToAnySorted(charArray38);
        boolean boolean42 = characterReader9.matchesAnySorted(charArray38);
        boolean boolean43 = characterReader1.matchesAny(charArray38);
        java.lang.String str44 = characterReader1.consumeData();
        boolean boolean46 = characterReader1.matchesIgnoreCase("hi!");
        java.lang.String str47 = characterReader1.consumeHexSequence();
        int int48 = characterReader1.pos();
        java.lang.String str49 = characterReader1.consumeHexSequence();
        boolean boolean51 = characterReader1.matches('a');
        java.lang.String str52 = characterReader1.consumeDigitSequence();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi" + "'", str6, "hi");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "!" + "'", str7, "!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi" + "'", str21, "hi");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "h" + "'", str27, "h");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "i!" + "'", str30, "i!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "i!" + "'", str40, "i!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "!" + "'", str41, "!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        java.lang.String str5 = characterReader1.toString();
        boolean boolean6 = characterReader1.isEmpty();
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.consumeLetterThenDigitSequence();
        char char9 = characterReader1.consume();
        int int11 = characterReader1.nextIndexOf((java.lang.CharSequence) "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        characterReader1.advance();
        boolean boolean9 = characterReader1.rangeEquals((int) (short) 100, (int) ' ', "h");
        java.lang.String str10 = characterReader1.consumeData();
        boolean boolean12 = characterReader1.matchesIgnoreCase("i!");
        java.lang.String str13 = characterReader1.consumeData();
        int int15 = characterReader1.nextIndexOf((java.lang.CharSequence) "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean2 = characterReader1.matchesDigit();
        java.lang.String str3 = characterReader1.toString();
        java.lang.String str4 = characterReader1.consumeAsString();
        boolean boolean6 = characterReader1.containsIgnoreCase("!");
        int int8 = characterReader1.nextIndexOf(' ');
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str11 = characterReader10.consumeLetterThenDigitSequence();
        boolean boolean13 = characterReader10.matches(' ');
        boolean boolean15 = characterReader10.matchesIgnoreCase("hi!");
        boolean boolean17 = characterReader10.matches('a');
        boolean boolean18 = characterReader10.matchesLetter();
        boolean boolean19 = characterReader10.matchesLetter();
        boolean boolean21 = characterReader10.matchConsume("!");
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str24 = characterReader23.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader26 = new org.jsoup.parser.CharacterReader("");
        char[] charArray31 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str32 = characterReader26.consumeToAnySorted(charArray31);
        boolean boolean33 = characterReader23.matchesAnySorted(charArray31);
        boolean boolean34 = characterReader10.matchesAnySorted(charArray31);
        boolean boolean35 = characterReader1.matchesAny(charArray31);
        java.lang.String str36 = characterReader1.toString();
        boolean boolean38 = characterReader1.matches('4');
        java.lang.String str39 = characterReader1.consumeToEnd();
        boolean boolean41 = characterReader1.matchesIgnoreCase("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "i!" + "'", str36, "i!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "i!" + "'", str39, "i!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('#');
        boolean boolean5 = characterReader1.matches("");
        boolean boolean9 = characterReader1.rangeEquals((int) '4', (int) '4', "");
        int int11 = characterReader1.nextIndexOf('4');
        boolean boolean12 = characterReader1.isEmpty();
        java.lang.String str13 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean15 = characterReader1.matches('\uffff');
        boolean boolean17 = characterReader1.matches("i!");
        boolean boolean19 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str20 = characterReader1.consumeToEnd();
        java.lang.String str21 = characterReader1.consumeDigitSequence();
        java.lang.String str22 = characterReader1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        char char3 = characterReader1.current();
        int int5 = characterReader1.nextIndexOf(' ');
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        boolean boolean7 = characterReader1.matchesLetter();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str12 = characterReader10.consumeTo('#');
        char[] charArray16 = new char[] { '#', '#', 'a' };
        boolean boolean17 = characterReader10.matchesAny(charArray16);
        java.lang.String str18 = characterReader10.consumeTagName();
        java.lang.String str19 = characterReader10.consumeHexSequence();
        java.lang.String str21 = characterReader10.consumeTo('h');
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str25 = characterReader23.consumeTo('#');
        char[] charArray29 = new char[] { '#', '#', 'a' };
        boolean boolean30 = characterReader23.matchesAny(charArray29);
        boolean boolean31 = characterReader10.matchesAny(charArray29);
        java.lang.String str32 = characterReader1.consumeToAnySorted(charArray29);
        boolean boolean34 = characterReader1.matchConsumeIgnoreCase("i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        char char3 = characterReader1.current();
        int int5 = characterReader1.nextIndexOf(' ');
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        int int8 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        char char9 = characterReader1.current();
        java.lang.String str10 = characterReader1.toString();
        java.lang.String str12 = characterReader1.consumeTo('h');
        boolean boolean16 = characterReader1.rangeEquals((int) (byte) 100, (int) ' ', "hi");
        boolean boolean17 = characterReader1.matchesDigit();
        java.lang.String str19 = characterReader1.consumeTo('a');
        characterReader1.rewindToMark();
        characterReader1.advance();
        java.lang.String str22 = characterReader1.consumeDigitSequence();
        java.lang.String str23 = characterReader1.consumeTagName();
        java.lang.Class<?> wildcardClass24 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean5 = characterReader1.matches("");
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        java.lang.String str7 = characterReader1.consumeToEnd();
        int int8 = characterReader1.pos();
        boolean boolean9 = characterReader1.matchesLetter();
        boolean boolean11 = characterReader1.matches("!");
        boolean boolean12 = characterReader1.matchesDigit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi" + "'", str6, "hi");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "!" + "'", str7, "!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        char char3 = characterReader1.current();
        int int5 = characterReader1.nextIndexOf(' ');
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        int int7 = characterReader1.pos();
        boolean boolean9 = characterReader1.matches("h");
        boolean boolean11 = characterReader1.matchConsume("!");
        characterReader1.mark();
        java.lang.String str13 = characterReader1.consumeTagName();
        org.jsoup.parser.CharacterReader characterReader15 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str16 = characterReader15.consumeLetterThenDigitSequence();
        boolean boolean18 = characterReader15.matches(' ');
        char char19 = characterReader15.current();
        boolean boolean21 = characterReader15.matches('\uffff');
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str24 = characterReader23.consumeLetterThenDigitSequence();
        char char25 = characterReader23.current();
        boolean boolean29 = characterReader23.rangeEquals(0, (int) (short) 1, "");
        org.jsoup.parser.CharacterReader characterReader31 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str32 = characterReader31.consumeLetterThenDigitSequence();
        boolean boolean34 = characterReader31.matches(' ');
        boolean boolean36 = characterReader31.matchesIgnoreCase("hi!");
        boolean boolean38 = characterReader31.matches('a');
        boolean boolean39 = characterReader31.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader41 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str43 = characterReader41.consumeTo('#');
        characterReader41.mark();
        org.jsoup.parser.CharacterReader characterReader46 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str47 = characterReader46.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader49 = new org.jsoup.parser.CharacterReader("");
        char[] charArray54 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str55 = characterReader49.consumeToAnySorted(charArray54);
        boolean boolean56 = characterReader46.matchesAny(charArray54);
        boolean boolean57 = characterReader41.matchesAny(charArray54);
        java.lang.String str58 = characterReader31.consumeToAny(charArray54);
        java.lang.String str59 = characterReader23.consumeToAny(charArray54);
        java.lang.String str60 = characterReader15.consumeToAnySorted(charArray54);
        boolean boolean61 = characterReader1.matchesAnySorted(charArray54);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\uffff' + "'", char19 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\uffff' + "'", char25 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean2 = characterReader1.matchesDigit();
        int int3 = characterReader1.pos();
        java.lang.String str4 = characterReader1.consumeTagName();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        boolean boolean6 = characterReader1.matchesDigit();
        characterReader1.mark();
        characterReader1.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str11 = characterReader10.consumeLetterThenDigitSequence();
        boolean boolean13 = characterReader10.matches(' ');
        java.lang.String str14 = characterReader10.consumeLetterSequence();
        java.lang.String str16 = characterReader10.consumeTo(' ');
        char char17 = characterReader10.current();
        java.lang.String str18 = characterReader10.consumeData();
        java.lang.String str19 = characterReader10.consumeLetterThenDigitSequence();
        char char20 = characterReader10.current();
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader22.unconsume();
        characterReader22.rewindToMark();
        boolean boolean26 = characterReader22.matches("");
        boolean boolean27 = characterReader22.matchesDigit();
        boolean boolean29 = characterReader22.matchConsume("h");
        org.jsoup.parser.CharacterReader characterReader31 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader31.unconsume();
        characterReader31.rewindToMark();
        boolean boolean34 = characterReader31.matchesDigit();
        java.lang.String str35 = characterReader31.consumeAsString();
        characterReader31.unconsume();
        characterReader31.advance();
        boolean boolean39 = characterReader31.matchesIgnoreCase("h");
        boolean boolean43 = characterReader31.rangeEquals((int) (byte) -1, 10, "hi!");
        org.jsoup.parser.CharacterReader characterReader45 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str46 = characterReader45.consumeLetterThenDigitSequence();
        boolean boolean48 = characterReader45.matches(' ');
        boolean boolean50 = characterReader45.matchesIgnoreCase("hi!");
        boolean boolean52 = characterReader45.matches('a');
        characterReader45.advance();
        boolean boolean55 = characterReader45.containsIgnoreCase("h");
        boolean boolean57 = characterReader45.containsIgnoreCase("h");
        org.jsoup.parser.CharacterReader characterReader59 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str60 = characterReader59.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader62 = new org.jsoup.parser.CharacterReader("");
        char[] charArray67 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str68 = characterReader62.consumeToAnySorted(charArray67);
        boolean boolean69 = characterReader59.matchesAnySorted(charArray67);
        characterReader59.rewindToMark();
        characterReader59.mark();
        java.lang.String str72 = characterReader59.toString();
        org.jsoup.parser.CharacterReader characterReader74 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str76 = characterReader74.consumeTo('#');
        char[] charArray80 = new char[] { '#', '#', 'a' };
        boolean boolean81 = characterReader74.matchesAny(charArray80);
        boolean boolean82 = characterReader59.matchesAnySorted(charArray80);
        java.lang.String str83 = characterReader45.consumeToAny(charArray80);
        boolean boolean84 = characterReader31.matchesAnySorted(charArray80);
        java.lang.String str85 = characterReader22.consumeToAny(charArray80);
        java.lang.String str86 = characterReader10.consumeToAnySorted(charArray80);
        java.lang.String str87 = characterReader1.consumeToAny(charArray80);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\uffff' + "'", char17 == '\uffff');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\uffff' + "'", char20 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "h" + "'", str35, "h");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertArrayEquals(charArray67, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertArrayEquals(charArray80, new char[] { '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "i!" + "'", str85, "i!");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean5 = characterReader1.matches("");
        boolean boolean6 = characterReader1.isEmpty();
        boolean boolean7 = characterReader1.matchesLetter();
        java.lang.String str8 = characterReader1.consumeDigitSequence();
        java.lang.String str9 = characterReader1.consumeLetterSequence();
        java.lang.String str11 = characterReader1.consumeTo("hi");
        java.lang.String str12 = characterReader1.consumeToEnd();
        boolean boolean13 = characterReader1.matchesDigit();
        java.lang.String str14 = characterReader1.consumeDigitSequence();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi" + "'", str9, "hi");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "!" + "'", str11, "!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        int int8 = characterReader1.nextIndexOf('#');
        boolean boolean10 = characterReader1.matches('\uffff');
        int int12 = characterReader1.nextIndexOf('h');
        characterReader1.advance();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        boolean boolean6 = characterReader1.matches("");
        boolean boolean7 = characterReader1.isEmpty();
        boolean boolean9 = characterReader1.matchesIgnoreCase("i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        java.lang.String str5 = characterReader1.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader7.unconsume();
        characterReader7.rewindToMark();
        boolean boolean11 = characterReader7.matches("");
        boolean boolean12 = characterReader7.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader14 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader14.unconsume();
        characterReader14.rewindToMark();
        boolean boolean17 = characterReader14.matchesDigit();
        java.lang.String str18 = characterReader14.consumeAsString();
        boolean boolean20 = characterReader14.matchConsumeIgnoreCase("");
        java.lang.String str21 = characterReader14.toString();
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str25 = characterReader23.consumeTo('#');
        char[] charArray29 = new char[] { '#', '#', 'a' };
        boolean boolean30 = characterReader23.matchesAny(charArray29);
        java.lang.String str31 = characterReader14.consumeToAnySorted(charArray29);
        boolean boolean32 = characterReader7.matchesAnySorted(charArray29);
        boolean boolean33 = characterReader1.matchesAny(charArray29);
        java.lang.String str34 = characterReader1.consumeData();
        boolean boolean36 = characterReader1.matchesIgnoreCase("i");
        java.lang.String str37 = characterReader1.consumeHexSequence();
        characterReader1.mark();
        org.jsoup.parser.CharacterReader characterReader40 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean41 = characterReader40.matchesDigit();
        java.lang.String str42 = characterReader40.toString();
        boolean boolean43 = characterReader40.matchesLetter();
        java.lang.String str44 = characterReader40.consumeTagName();
        org.jsoup.parser.CharacterReader characterReader46 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader46.unconsume();
        characterReader46.rewindToMark();
        boolean boolean50 = characterReader46.matches("");
        org.jsoup.parser.CharacterReader characterReader52 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str53 = characterReader52.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader55 = new org.jsoup.parser.CharacterReader("");
        char[] charArray60 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str61 = characterReader55.consumeToAnySorted(charArray60);
        boolean boolean62 = characterReader52.matchesAnySorted(charArray60);
        boolean boolean64 = characterReader52.matchConsume("hi!");
        org.jsoup.parser.CharacterReader characterReader66 = new org.jsoup.parser.CharacterReader("");
        int int68 = characterReader66.nextIndexOf(' ');
        char[] charArray70 = new char[] { '4' };
        java.lang.String str71 = characterReader66.consumeToAny(charArray70);
        java.lang.String str72 = characterReader52.consumeToAny(charArray70);
        boolean boolean73 = characterReader46.matchesAny(charArray70);
        boolean boolean75 = characterReader46.matchConsume("");
        org.jsoup.parser.CharacterReader characterReader77 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str78 = characterReader77.consumeLetterThenDigitSequence();
        boolean boolean80 = characterReader77.matches(' ');
        char char81 = characterReader77.current();
        char[] charArray83 = new char[] { '4' };
        boolean boolean84 = characterReader77.matchesAny(charArray83);
        java.lang.String str85 = characterReader46.consumeToAny(charArray83);
        java.lang.String str86 = characterReader40.consumeToAny(charArray83);
        boolean boolean87 = characterReader1.matchesAny(charArray83);
        java.lang.String str88 = characterReader1.consumeLetterThenDigitSequence();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str89 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 0, count 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "i!" + "'", str21, "i!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "i!" + "'", str31, "i!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertArrayEquals(charArray60, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertArrayEquals(charArray70, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + char81 + "' != '" + '\uffff' + "'", char81 == '\uffff');
        org.junit.Assert.assertNotNull(charArray83);
        org.junit.Assert.assertArrayEquals(charArray83, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        java.lang.String str7 = characterReader1.consumeToEnd();
        java.lang.String str8 = characterReader1.consumeHexSequence();
        boolean boolean9 = characterReader1.isEmpty();
        characterReader1.rewindToMark();
        int int11 = characterReader1.pos();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray6 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        java.lang.String str8 = characterReader1.consumeHexSequence();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str11 = characterReader10.consumeLetterThenDigitSequence();
        boolean boolean13 = characterReader10.matches(' ');
        boolean boolean15 = characterReader10.matchesIgnoreCase("hi!");
        boolean boolean17 = characterReader10.matches('a');
        boolean boolean18 = characterReader10.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str22 = characterReader20.consumeTo('#');
        characterReader20.mark();
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str26 = characterReader25.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader("");
        char[] charArray33 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str34 = characterReader28.consumeToAnySorted(charArray33);
        boolean boolean35 = characterReader25.matchesAny(charArray33);
        boolean boolean36 = characterReader20.matchesAny(charArray33);
        java.lang.String str37 = characterReader10.consumeToAny(charArray33);
        boolean boolean38 = characterReader1.matchesAnySorted(charArray33);
        characterReader1.rewindToMark();
        int int41 = characterReader1.nextIndexOf('\uffff');
        boolean boolean43 = characterReader1.matches('i');
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean2 = characterReader1.matchesDigit();
        java.lang.String str3 = characterReader1.consumeData();
        characterReader1.rewindToMark();
        boolean boolean6 = characterReader1.matches('h');
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader8.unconsume();
        characterReader8.rewindToMark();
        boolean boolean11 = characterReader8.matchesDigit();
        java.lang.String str12 = characterReader8.consumeAsString();
        characterReader8.unconsume();
        boolean boolean15 = characterReader8.matchConsume("");
        java.lang.String str17 = characterReader8.consumeTo('\uffff');
        java.lang.String str18 = characterReader8.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str22 = characterReader20.consumeTo('#');
        characterReader20.mark();
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str26 = characterReader25.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader("");
        char[] charArray33 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str34 = characterReader28.consumeToAnySorted(charArray33);
        boolean boolean35 = characterReader25.matchesAny(charArray33);
        boolean boolean36 = characterReader20.matchesAny(charArray33);
        boolean boolean38 = characterReader20.matchesIgnoreCase("");
        boolean boolean40 = characterReader20.matches("!");
        org.jsoup.parser.CharacterReader characterReader42 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str44 = characterReader42.consumeTo('#');
        boolean boolean46 = characterReader42.matches("");
        boolean boolean50 = characterReader42.rangeEquals((int) '4', (int) '4', "");
        int int52 = characterReader42.nextIndexOf('4');
        org.jsoup.parser.CharacterReader characterReader54 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str55 = characterReader54.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader57 = new org.jsoup.parser.CharacterReader("");
        char[] charArray62 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str63 = characterReader57.consumeToAnySorted(charArray62);
        boolean boolean64 = characterReader54.matchesAnySorted(charArray62);
        java.lang.String str65 = characterReader42.consumeToAny(charArray62);
        boolean boolean66 = characterReader20.matchesAny(charArray62);
        boolean boolean67 = characterReader8.matchesAny(charArray62);
        java.lang.String str68 = characterReader1.consumeToAnySorted(charArray62);
        boolean boolean69 = characterReader1.matchesLetter();
        boolean boolean71 = characterReader1.containsIgnoreCase("hi");
        java.lang.String str72 = characterReader1.consumeHexSequence();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader4 = new org.jsoup.parser.CharacterReader("");
        char[] charArray9 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str10 = characterReader4.consumeToAnySorted(charArray9);
        boolean boolean11 = characterReader1.matchesAnySorted(charArray9);
        char[] charArray15 = new char[] { '\uffff', '4', '\uffff' };
        boolean boolean16 = characterReader1.matchesAnySorted(charArray15);
        boolean boolean20 = characterReader1.rangeEquals((-1), (int) ' ', "hi!");
        boolean boolean21 = characterReader1.matchesDigit();
        boolean boolean23 = characterReader1.matchConsumeIgnoreCase("hi!");
        boolean boolean24 = characterReader1.isEmpty();
        boolean boolean28 = characterReader1.rangeEquals(3, (int) '\uffff', "i!");
        boolean boolean29 = characterReader1.isEmpty();
        org.jsoup.parser.CharacterReader characterReader31 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str32 = characterReader31.consumeLetterThenDigitSequence();
        boolean boolean34 = characterReader31.matches(' ');
        characterReader31.advance();
        boolean boolean39 = characterReader31.rangeEquals((int) (short) 100, (int) ' ', "h");
        java.lang.String str40 = characterReader31.consumeData();
        org.jsoup.parser.CharacterReader characterReader42 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader42.unconsume();
        characterReader42.rewindToMark();
        boolean boolean46 = characterReader42.matches("");
        org.jsoup.parser.CharacterReader characterReader48 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str49 = characterReader48.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader51 = new org.jsoup.parser.CharacterReader("");
        char[] charArray56 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str57 = characterReader51.consumeToAnySorted(charArray56);
        boolean boolean58 = characterReader48.matchesAnySorted(charArray56);
        boolean boolean60 = characterReader48.matchConsume("hi!");
        org.jsoup.parser.CharacterReader characterReader62 = new org.jsoup.parser.CharacterReader("");
        int int64 = characterReader62.nextIndexOf(' ');
        char[] charArray66 = new char[] { '4' };
        java.lang.String str67 = characterReader62.consumeToAny(charArray66);
        java.lang.String str68 = characterReader48.consumeToAny(charArray66);
        boolean boolean69 = characterReader42.matchesAny(charArray66);
        char char70 = characterReader42.consume();
        java.lang.String str72 = characterReader42.consumeTo("h");
        org.jsoup.parser.CharacterReader characterReader74 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str75 = characterReader74.consumeLetterThenDigitSequence();
        boolean boolean77 = characterReader74.matches(' ');
        boolean boolean79 = characterReader74.matchesIgnoreCase("hi!");
        int int81 = characterReader74.nextIndexOf((java.lang.CharSequence) "hi!");
        java.lang.String str82 = characterReader74.toString();
        org.jsoup.parser.CharacterReader characterReader84 = new org.jsoup.parser.CharacterReader("");
        char[] charArray89 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str90 = characterReader84.consumeToAnySorted(charArray89);
        java.lang.String str91 = characterReader74.consumeToAny(charArray89);
        boolean boolean92 = characterReader42.matchesAnySorted(charArray89);
        boolean boolean93 = characterReader31.matchesAnySorted(charArray89);
        boolean boolean94 = characterReader1.matchesAnySorted(charArray89);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', '4', '\uffff' });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertArrayEquals(charArray56, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertArrayEquals(charArray66, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + char70 + "' != '" + 'h' + "'", char70 == 'h');
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "i!" + "'", str72, "i!");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(charArray89);
        org.junit.Assert.assertArrayEquals(charArray89, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('#');
        boolean boolean5 = characterReader1.matches("");
        boolean boolean9 = characterReader1.rangeEquals((int) '4', (int) '4', "");
        java.lang.String str10 = characterReader1.consumeDigitSequence();
        int int11 = characterReader1.pos();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean2 = characterReader1.matchesDigit();
        boolean boolean4 = characterReader1.matchesIgnoreCase("!");
        java.lang.String str5 = characterReader1.consumeDigitSequence();
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matchesDigit();
        java.lang.String str5 = characterReader1.consumeAsString();
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str10 = characterReader9.consumeLetterThenDigitSequence();
        boolean boolean12 = characterReader9.matches(' ');
        boolean boolean14 = characterReader9.matchesIgnoreCase("hi!");
        boolean boolean16 = characterReader9.matches('a');
        boolean boolean17 = characterReader9.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str21 = characterReader19.consumeTo('#');
        characterReader19.mark();
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str25 = characterReader24.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader27 = new org.jsoup.parser.CharacterReader("");
        char[] charArray32 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str33 = characterReader27.consumeToAnySorted(charArray32);
        boolean boolean34 = characterReader24.matchesAny(charArray32);
        boolean boolean35 = characterReader19.matchesAny(charArray32);
        java.lang.String str36 = characterReader9.consumeToAny(charArray32);
        java.lang.String str37 = characterReader1.consumeToAny(charArray32);
        java.lang.String str38 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean40 = characterReader1.matchConsumeIgnoreCase("!");
        boolean boolean41 = characterReader1.matchesDigit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "i!" + "'", str37, "i!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean2 = characterReader1.matchesDigit();
        int int4 = characterReader1.nextIndexOf('#');
        characterReader1.advance();
        characterReader1.advance();
        boolean boolean10 = characterReader1.rangeEquals((int) (short) -1, (int) (byte) 0, "hi!");
        java.lang.String str11 = characterReader1.consumeLetterSequence();
        java.lang.String str12 = characterReader1.consumeData();
        java.lang.String str13 = characterReader1.consumeHexSequence();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "!" + "'", str12, "!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        java.lang.String str5 = characterReader1.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader7.unconsume();
        characterReader7.rewindToMark();
        boolean boolean11 = characterReader7.matches("");
        boolean boolean12 = characterReader7.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader14 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader14.unconsume();
        characterReader14.rewindToMark();
        boolean boolean17 = characterReader14.matchesDigit();
        java.lang.String str18 = characterReader14.consumeAsString();
        boolean boolean20 = characterReader14.matchConsumeIgnoreCase("");
        java.lang.String str21 = characterReader14.toString();
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str25 = characterReader23.consumeTo('#');
        char[] charArray29 = new char[] { '#', '#', 'a' };
        boolean boolean30 = characterReader23.matchesAny(charArray29);
        java.lang.String str31 = characterReader14.consumeToAnySorted(charArray29);
        boolean boolean32 = characterReader7.matchesAnySorted(charArray29);
        boolean boolean33 = characterReader1.matchesAny(charArray29);
        java.lang.String str34 = characterReader1.consumeDigitSequence();
        java.lang.String str35 = characterReader1.toString();
        java.lang.String str36 = characterReader1.consumeHexSequence();
        java.lang.String str37 = characterReader1.consumeHexSequence();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "i!" + "'", str21, "i!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "i!" + "'", str31, "i!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        java.lang.String str5 = characterReader1.toString();
        char char6 = characterReader1.current();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str10 = characterReader8.consumeTo('#');
        characterReader8.mark();
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str14 = characterReader13.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        char[] charArray21 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str22 = characterReader16.consumeToAnySorted(charArray21);
        boolean boolean23 = characterReader13.matchesAny(charArray21);
        boolean boolean24 = characterReader8.matchesAny(charArray21);
        boolean boolean25 = characterReader1.matchesAny(charArray21);
        characterReader1.rewindToMark();
        java.lang.String str27 = characterReader1.consumeHexSequence();
        boolean boolean29 = characterReader1.matches('#');
        boolean boolean31 = characterReader1.matchesIgnoreCase("!");
        boolean boolean33 = characterReader1.matchConsumeIgnoreCase("i!");
        char char34 = characterReader1.current();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\uffff' + "'", char6 == '\uffff');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + char34 + "' != '" + '\uffff' + "'", char34 == '\uffff');
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        char char3 = characterReader1.current();
        int int5 = characterReader1.nextIndexOf(' ');
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        int int8 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        char char9 = characterReader1.current();
        java.lang.String str10 = characterReader1.toString();
        java.lang.String str12 = characterReader1.consumeTo('h');
        boolean boolean16 = characterReader1.rangeEquals((int) (byte) 100, (int) ' ', "hi");
        boolean boolean17 = characterReader1.matchesDigit();
        boolean boolean18 = characterReader1.isEmpty();
        boolean boolean20 = characterReader1.matchConsumeIgnoreCase("i!");
        characterReader1.advance();
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        boolean boolean25 = characterReader23.matchConsumeIgnoreCase("!");
        java.lang.String str26 = characterReader23.consumeHexSequence();
        java.lang.String str28 = characterReader23.consumeTo("hi");
        characterReader23.mark();
        boolean boolean31 = characterReader23.matches("!");
        java.lang.String str32 = characterReader23.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader34 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str35 = characterReader34.consumeLetterThenDigitSequence();
        char char36 = characterReader34.current();
        int int38 = characterReader34.nextIndexOf(' ');
        java.lang.String str39 = characterReader34.consumeLetterSequence();
        int int41 = characterReader34.nextIndexOf((java.lang.CharSequence) "hi!");
        characterReader34.mark();
        java.lang.String str43 = characterReader34.consumeHexSequence();
        char[] charArray46 = new char[] { '#', 'a' };
        java.lang.String str47 = characterReader34.consumeToAny(charArray46);
        boolean boolean48 = characterReader23.matchesAny(charArray46);
        boolean boolean49 = characterReader1.matchesAny(charArray46);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + char36 + "' != '" + '\uffff' + "'", char36 == '\uffff');
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { '#', 'a' });
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matchesDigit();
        java.lang.String str5 = characterReader1.consumeAsString();
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str8 = characterReader1.toString();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str12 = characterReader10.consumeTo('#');
        char[] charArray16 = new char[] { '#', '#', 'a' };
        boolean boolean17 = characterReader10.matchesAny(charArray16);
        java.lang.String str18 = characterReader1.consumeToAnySorted(charArray16);
        java.lang.String str19 = characterReader1.consumeTagName();
        java.lang.String str21 = characterReader1.consumeTo(' ');
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader23.unconsume();
        characterReader23.rewindToMark();
        boolean boolean26 = characterReader23.matchesDigit();
        java.lang.String str27 = characterReader23.consumeAsString();
        characterReader23.unconsume();
        characterReader23.advance();
        boolean boolean31 = characterReader23.matchesIgnoreCase("h");
        boolean boolean35 = characterReader23.rangeEquals((int) (byte) -1, 10, "hi!");
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str38 = characterReader37.consumeLetterThenDigitSequence();
        boolean boolean40 = characterReader37.matches(' ');
        boolean boolean42 = characterReader37.matchesIgnoreCase("hi!");
        boolean boolean44 = characterReader37.matches('a');
        characterReader37.advance();
        boolean boolean47 = characterReader37.containsIgnoreCase("h");
        boolean boolean49 = characterReader37.containsIgnoreCase("h");
        org.jsoup.parser.CharacterReader characterReader51 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str52 = characterReader51.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader54 = new org.jsoup.parser.CharacterReader("");
        char[] charArray59 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str60 = characterReader54.consumeToAnySorted(charArray59);
        boolean boolean61 = characterReader51.matchesAnySorted(charArray59);
        characterReader51.rewindToMark();
        characterReader51.mark();
        java.lang.String str64 = characterReader51.toString();
        org.jsoup.parser.CharacterReader characterReader66 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str68 = characterReader66.consumeTo('#');
        char[] charArray72 = new char[] { '#', '#', 'a' };
        boolean boolean73 = characterReader66.matchesAny(charArray72);
        boolean boolean74 = characterReader51.matchesAnySorted(charArray72);
        java.lang.String str75 = characterReader37.consumeToAny(charArray72);
        boolean boolean76 = characterReader23.matchesAnySorted(charArray72);
        boolean boolean77 = characterReader1.matchesAny(charArray72);
        java.lang.String str78 = characterReader1.consumeDigitSequence();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i!" + "'", str8, "i!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "i!" + "'", str18, "i!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "h" + "'", str27, "h");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertArrayEquals(charArray72, new char[] { '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('#');
        boolean boolean5 = characterReader1.matches("");
        boolean boolean9 = characterReader1.rangeEquals((int) '4', (int) '4', "");
        int int11 = characterReader1.nextIndexOf('4');
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str14 = characterReader13.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        char[] charArray21 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str22 = characterReader16.consumeToAnySorted(charArray21);
        boolean boolean23 = characterReader13.matchesAnySorted(charArray21);
        java.lang.String str24 = characterReader1.consumeToAny(charArray21);
        boolean boolean26 = characterReader1.matches("");
        boolean boolean28 = characterReader1.matchesIgnoreCase("hi");
        boolean boolean30 = characterReader1.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean33 = characterReader32.matchesDigit();
        int int35 = characterReader32.nextIndexOf('#');
        characterReader32.advance();
        characterReader32.unconsume();
        boolean boolean39 = characterReader32.matches("i!");
        org.jsoup.parser.CharacterReader characterReader41 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str42 = characterReader41.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader44 = new org.jsoup.parser.CharacterReader("");
        char[] charArray49 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str50 = characterReader44.consumeToAnySorted(charArray49);
        boolean boolean51 = characterReader41.matchesAnySorted(charArray49);
        char char52 = characterReader41.consume();
        characterReader41.mark();
        org.jsoup.parser.CharacterReader characterReader55 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str56 = characterReader55.consumeLetterThenDigitSequence();
        boolean boolean58 = characterReader55.matches(' ');
        boolean boolean60 = characterReader55.matchesIgnoreCase("hi!");
        org.jsoup.parser.CharacterReader characterReader62 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str63 = characterReader62.consumeLetterThenDigitSequence();
        boolean boolean65 = characterReader62.matches(' ');
        char char66 = characterReader62.current();
        char[] charArray68 = new char[] { '4' };
        boolean boolean69 = characterReader62.matchesAny(charArray68);
        boolean boolean70 = characterReader55.matchesAnySorted(charArray68);
        java.lang.String str71 = characterReader41.consumeToAnySorted(charArray68);
        java.lang.String str72 = characterReader32.consumeToAny(charArray68);
        boolean boolean73 = characterReader1.matchesAnySorted(charArray68);
        boolean boolean75 = characterReader1.matches('a');
        char char76 = characterReader1.consume();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + char52 + "' != '" + '\uffff' + "'", char52 == '\uffff');
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + char66 + "' != '" + '\uffff' + "'", char66 == '\uffff');
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + char76 + "' != '" + '\uffff' + "'", char76 == '\uffff');
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean3 = characterReader1.matchesDigit();
        java.lang.String str4 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        java.lang.String str6 = characterReader1.consumeData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean5 = characterReader1.matches("");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str8 = characterReader7.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        char[] charArray15 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str16 = characterReader10.consumeToAnySorted(charArray15);
        boolean boolean17 = characterReader7.matchesAnySorted(charArray15);
        boolean boolean19 = characterReader7.matchConsume("hi!");
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("");
        int int23 = characterReader21.nextIndexOf(' ');
        char[] charArray25 = new char[] { '4' };
        java.lang.String str26 = characterReader21.consumeToAny(charArray25);
        java.lang.String str27 = characterReader7.consumeToAny(charArray25);
        boolean boolean28 = characterReader1.matchesAny(charArray25);
        boolean boolean30 = characterReader1.matchConsume("");
        boolean boolean32 = characterReader1.matchesIgnoreCase("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matchesDigit();
        java.lang.String str5 = characterReader1.consumeAsString();
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str8 = characterReader1.consumeDigitSequence();
        boolean boolean10 = characterReader1.matchConsumeIgnoreCase("!");
        characterReader1.advance();
        java.lang.String str12 = characterReader1.consumeLetterThenDigitSequence();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = characterReader1.containsIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        char char3 = characterReader1.current();
        boolean boolean7 = characterReader1.rangeEquals(0, (int) (short) 1, "");
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str10 = characterReader9.consumeLetterThenDigitSequence();
        boolean boolean12 = characterReader9.matches(' ');
        boolean boolean14 = characterReader9.matchesIgnoreCase("hi!");
        boolean boolean16 = characterReader9.matches('a');
        boolean boolean17 = characterReader9.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str21 = characterReader19.consumeTo('#');
        characterReader19.mark();
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str25 = characterReader24.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader27 = new org.jsoup.parser.CharacterReader("");
        char[] charArray32 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str33 = characterReader27.consumeToAnySorted(charArray32);
        boolean boolean34 = characterReader24.matchesAny(charArray32);
        boolean boolean35 = characterReader19.matchesAny(charArray32);
        java.lang.String str36 = characterReader9.consumeToAny(charArray32);
        java.lang.String str37 = characterReader1.consumeToAny(charArray32);
        java.lang.String str38 = characterReader1.consumeLetterSequence();
        char char39 = characterReader1.consume();
        org.jsoup.parser.CharacterReader characterReader41 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader41.advance();
        int int44 = characterReader41.nextIndexOf('4');
        int int45 = characterReader41.pos();
        org.jsoup.parser.CharacterReader characterReader47 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader47.unconsume();
        characterReader47.rewindToMark();
        boolean boolean51 = characterReader47.matches("");
        boolean boolean52 = characterReader47.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader54 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader54.unconsume();
        characterReader54.rewindToMark();
        boolean boolean57 = characterReader54.matchesDigit();
        java.lang.String str58 = characterReader54.consumeAsString();
        boolean boolean60 = characterReader54.matchConsumeIgnoreCase("");
        java.lang.String str61 = characterReader54.toString();
        org.jsoup.parser.CharacterReader characterReader63 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str65 = characterReader63.consumeTo('#');
        char[] charArray69 = new char[] { '#', '#', 'a' };
        boolean boolean70 = characterReader63.matchesAny(charArray69);
        java.lang.String str71 = characterReader54.consumeToAnySorted(charArray69);
        boolean boolean72 = characterReader47.matchesAnySorted(charArray69);
        java.lang.String str73 = characterReader41.consumeToAnySorted(charArray69);
        boolean boolean74 = characterReader1.matchesAny(charArray69);
        boolean boolean76 = characterReader1.containsIgnoreCase("i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + char39 + "' != '" + '\uffff' + "'", char39 == '\uffff');
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "h" + "'", str58, "h");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "i!" + "'", str61, "i!");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertArrayEquals(charArray69, new char[] { '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "i!" + "'", str71, "i!");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "i!" + "'", str73, "i!");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean5 = characterReader1.matches("");
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str8 = characterReader1.consumeAsString();
        java.lang.String str9 = characterReader1.consumeDigitSequence();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        char char5 = characterReader1.current();
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = characterReader1.matchesAny(charArray7);
        java.lang.String str10 = characterReader1.consumeTo('\uffff');
        java.lang.String str12 = characterReader1.consumeTo('a');
        java.lang.String str14 = characterReader1.consumeTo("h");
        java.lang.String str15 = characterReader1.consumeHexSequence();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\uffff' + "'", char5 == '\uffff');
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean8 = characterReader1.matches('a');
        characterReader1.advance();
        boolean boolean11 = characterReader1.containsIgnoreCase("h");
        boolean boolean13 = characterReader1.containsIgnoreCase("h");
        org.jsoup.parser.CharacterReader characterReader15 = new org.jsoup.parser.CharacterReader("i!");
        java.lang.String str16 = characterReader15.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader18 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader18.unconsume();
        characterReader18.rewindToMark();
        boolean boolean22 = characterReader18.matches("");
        boolean boolean23 = characterReader18.matchesDigit();
        char char24 = characterReader18.consume();
        org.jsoup.parser.CharacterReader characterReader26 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str27 = characterReader26.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader29 = new org.jsoup.parser.CharacterReader("");
        char[] charArray34 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str35 = characterReader29.consumeToAnySorted(charArray34);
        boolean boolean36 = characterReader26.matchesAnySorted(charArray34);
        java.lang.String str37 = characterReader18.consumeToAnySorted(charArray34);
        java.lang.String str38 = characterReader15.consumeToAny(charArray34);
        boolean boolean39 = characterReader1.matchesAny(charArray34);
        boolean boolean41 = characterReader1.matchConsumeIgnoreCase("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "i" + "'", str16, "i");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + 'h' + "'", char24 == 'h');
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "i!" + "'", str37, "i!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "!" + "'", str38, "!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray6 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        int int10 = characterReader1.nextIndexOf('4');
        java.lang.String str11 = characterReader1.consumeLetterSequence();
        java.lang.String str12 = characterReader1.consumeTagName();
        char char13 = characterReader1.consume();
        boolean boolean14 = characterReader1.matchesLetter();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\uffff' + "'", char13 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        int int8 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        java.lang.String str9 = characterReader1.toString();
        java.lang.String str10 = characterReader1.consumeHexSequence();
        boolean boolean12 = characterReader1.containsIgnoreCase("h");
        java.lang.String str13 = characterReader1.consumeHexSequence();
        java.lang.String str14 = characterReader1.consumeData();
        java.lang.String str15 = characterReader1.consumeToEnd();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean2 = characterReader1.matchesDigit();
        int int3 = characterReader1.pos();
        boolean boolean4 = characterReader1.isEmpty();
        org.jsoup.parser.CharacterReader characterReader6 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str7 = characterReader6.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        char[] charArray14 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str15 = characterReader9.consumeToAnySorted(charArray14);
        boolean boolean16 = characterReader6.matchesAnySorted(charArray14);
        boolean boolean18 = characterReader6.matchConsume("i!");
        java.lang.String str19 = characterReader6.consumeTagName();
        characterReader6.rewindToMark();
        characterReader6.advance();
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader23.unconsume();
        characterReader23.rewindToMark();
        boolean boolean26 = characterReader23.matchesDigit();
        java.lang.String str27 = characterReader23.consumeAsString();
        boolean boolean29 = characterReader23.matchConsumeIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader31 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str32 = characterReader31.consumeLetterThenDigitSequence();
        boolean boolean34 = characterReader31.matches(' ');
        boolean boolean36 = characterReader31.matchesIgnoreCase("hi!");
        boolean boolean38 = characterReader31.matches('a');
        boolean boolean39 = characterReader31.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader41 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str43 = characterReader41.consumeTo('#');
        characterReader41.mark();
        org.jsoup.parser.CharacterReader characterReader46 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str47 = characterReader46.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader49 = new org.jsoup.parser.CharacterReader("");
        char[] charArray54 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str55 = characterReader49.consumeToAnySorted(charArray54);
        boolean boolean56 = characterReader46.matchesAny(charArray54);
        boolean boolean57 = characterReader41.matchesAny(charArray54);
        java.lang.String str58 = characterReader31.consumeToAny(charArray54);
        java.lang.String str59 = characterReader23.consumeToAny(charArray54);
        java.lang.String str60 = characterReader6.consumeToAnySorted(charArray54);
        boolean boolean61 = characterReader1.matchesAnySorted(charArray54);
        boolean boolean63 = characterReader1.containsIgnoreCase("i!");
        java.lang.String str65 = characterReader1.consumeTo(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "h" + "'", str27, "h");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "i!" + "'", str59, "i!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean5 = characterReader1.matches("");
        boolean boolean6 = characterReader1.matchesDigit();
        java.lang.String str7 = characterReader1.consumeAsString();
        char char8 = characterReader1.consume();
        java.lang.String str9 = characterReader1.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'i' + "'", char8 == 'i');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "!" + "'", str9, "!");
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matchesDigit();
        java.lang.String str5 = characterReader1.consumeAsString();
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str8 = characterReader1.toString();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str12 = characterReader10.consumeTo('#');
        char[] charArray16 = new char[] { '#', '#', 'a' };
        boolean boolean17 = characterReader10.matchesAny(charArray16);
        java.lang.String str18 = characterReader1.consumeToAnySorted(charArray16);
        java.lang.String str19 = characterReader1.consumeTagName();
        java.lang.String str20 = characterReader1.consumeData();
        boolean boolean22 = characterReader1.matchConsume("!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i!" + "'", str8, "i!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "i!" + "'", str18, "i!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean8 = characterReader1.matches('a');
        java.lang.String str9 = characterReader1.toString();
        java.lang.String str10 = characterReader1.consumeData();
        int int12 = characterReader1.nextIndexOf(' ');
        java.lang.String str13 = characterReader1.consumeLetterSequence();
        int int14 = characterReader1.pos();
        char char15 = characterReader1.consume();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\uffff' + "'", char15 == '\uffff');
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        char char5 = characterReader1.current();
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = characterReader1.matchesAny(charArray7);
        java.lang.String str10 = characterReader1.consumeTo('\uffff');
        java.lang.String str12 = characterReader1.consumeTo('a');
        int int14 = characterReader1.nextIndexOf(' ');
        boolean boolean15 = characterReader1.matchesDigit();
        java.lang.String str16 = characterReader1.consumeLetterSequence();
        java.lang.String str17 = characterReader1.consumeLetterSequence();
        java.lang.String str19 = characterReader1.consumeTo('h');
        int int20 = characterReader1.pos();
        boolean boolean22 = characterReader1.matchConsumeIgnoreCase("");
        characterReader1.mark();
        boolean boolean25 = characterReader1.containsIgnoreCase("!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\uffff' + "'", char5 == '\uffff');
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matchesDigit();
        java.lang.String str5 = characterReader1.consumeAsString();
        characterReader1.unconsume();
        characterReader1.advance();
        boolean boolean9 = characterReader1.matchesIgnoreCase("h");
        java.lang.String str11 = characterReader1.consumeTo('#');
        boolean boolean13 = characterReader1.matches('i');
        boolean boolean15 = characterReader1.matchConsumeIgnoreCase("i!");
        char char16 = characterReader1.consume();
        int int18 = characterReader1.nextIndexOf(' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "i!" + "'", str11, "i!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\uffff' + "'", char16 == '\uffff');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean5 = characterReader1.matches("");
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("");
        boolean boolean9 = characterReader1.matchConsume("");
        java.lang.String str10 = characterReader1.consumeData();
        char char11 = characterReader1.current();
        java.lang.String str12 = characterReader1.consumeLetterSequence();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\uffff' + "'", char11 == '\uffff');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        char char3 = characterReader1.current();
        int int5 = characterReader1.nextIndexOf(' ');
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        java.lang.String str7 = characterReader1.toString();
        java.lang.String str8 = characterReader1.consumeLetterThenDigitSequence();
        char char9 = characterReader1.consume();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        java.lang.String str5 = characterReader1.toString();
        boolean boolean6 = characterReader1.isEmpty();
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.consumeTagName();
        boolean boolean10 = characterReader1.containsIgnoreCase("hi!");
        int int11 = characterReader1.pos();
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        int int15 = characterReader13.nextIndexOf(' ');
        java.lang.String str16 = characterReader13.toString();
        boolean boolean20 = characterReader13.rangeEquals(100, 100, "");
        java.lang.String str21 = characterReader13.consumeHexSequence();
        characterReader13.mark();
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str25 = characterReader24.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader27 = new org.jsoup.parser.CharacterReader("");
        char[] charArray32 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str33 = characterReader27.consumeToAnySorted(charArray32);
        boolean boolean34 = characterReader24.matchesAnySorted(charArray32);
        characterReader24.rewindToMark();
        int int37 = characterReader24.nextIndexOf('h');
        org.jsoup.parser.CharacterReader characterReader39 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str40 = characterReader39.consumeLetterThenDigitSequence();
        char char41 = characterReader39.current();
        int int43 = characterReader39.nextIndexOf(' ');
        java.lang.String str44 = characterReader39.consumeLetterSequence();
        int int46 = characterReader39.nextIndexOf((java.lang.CharSequence) "hi!");
        char char47 = characterReader39.current();
        java.lang.String str48 = characterReader39.toString();
        java.lang.String str50 = characterReader39.consumeTo('h');
        boolean boolean54 = characterReader39.rangeEquals((int) (byte) 100, (int) ' ', "hi");
        org.jsoup.parser.CharacterReader characterReader56 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str57 = characterReader56.consumeLetterThenDigitSequence();
        boolean boolean59 = characterReader56.matches(' ');
        java.lang.String str60 = characterReader56.toString();
        char char61 = characterReader56.current();
        boolean boolean63 = characterReader56.matchConsumeIgnoreCase("");
        java.lang.String str64 = characterReader56.toString();
        java.lang.String str65 = characterReader56.consumeData();
        org.jsoup.parser.CharacterReader characterReader67 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str68 = characterReader67.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader70 = new org.jsoup.parser.CharacterReader("");
        char[] charArray75 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str76 = characterReader70.consumeToAnySorted(charArray75);
        boolean boolean77 = characterReader67.matchesAnySorted(charArray75);
        characterReader67.rewindToMark();
        characterReader67.mark();
        java.lang.String str80 = characterReader67.toString();
        org.jsoup.parser.CharacterReader characterReader82 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str84 = characterReader82.consumeTo('#');
        char[] charArray88 = new char[] { '#', '#', 'a' };
        boolean boolean89 = characterReader82.matchesAny(charArray88);
        boolean boolean90 = characterReader67.matchesAnySorted(charArray88);
        boolean boolean91 = characterReader56.matchesAnySorted(charArray88);
        boolean boolean92 = characterReader39.matchesAny(charArray88);
        boolean boolean93 = characterReader24.matchesAny(charArray88);
        java.lang.String str94 = characterReader13.consumeToAny(charArray88);
        boolean boolean95 = characterReader1.matchesAnySorted(charArray88);
        characterReader1.rewindToMark();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str97 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 0, count 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + char41 + "' != '" + '\uffff' + "'", char41 == '\uffff');
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + char47 + "' != '" + '\uffff' + "'", char47 == '\uffff');
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + char61 + "' != '" + '\uffff' + "'", char61 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertArrayEquals(charArray75, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(charArray88);
        org.junit.Assert.assertArrayEquals(charArray88, new char[] { '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        characterReader1.advance();
        boolean boolean9 = characterReader1.rangeEquals((int) (short) 100, (int) ' ', "h");
        java.lang.String str10 = characterReader1.consumeData();
        boolean boolean12 = characterReader1.matches('a');
        boolean boolean14 = characterReader1.matchConsumeIgnoreCase("i");
        java.lang.String str15 = characterReader1.consumeLetterSequence();
        boolean boolean19 = characterReader1.rangeEquals(2, 4, "i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean2 = characterReader1.matchesDigit();
        java.lang.String str3 = characterReader1.toString();
        org.jsoup.parser.CharacterReader characterReader5 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader5.unconsume();
        characterReader5.rewindToMark();
        boolean boolean8 = characterReader5.matchesDigit();
        java.lang.String str9 = characterReader5.consumeAsString();
        boolean boolean11 = characterReader5.matchConsumeIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str14 = characterReader13.consumeLetterThenDigitSequence();
        boolean boolean16 = characterReader13.matches(' ');
        boolean boolean18 = characterReader13.matchesIgnoreCase("hi!");
        boolean boolean20 = characterReader13.matches('a');
        boolean boolean21 = characterReader13.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str25 = characterReader23.consumeTo('#');
        characterReader23.mark();
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str29 = characterReader28.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader31 = new org.jsoup.parser.CharacterReader("");
        char[] charArray36 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str37 = characterReader31.consumeToAnySorted(charArray36);
        boolean boolean38 = characterReader28.matchesAny(charArray36);
        boolean boolean39 = characterReader23.matchesAny(charArray36);
        java.lang.String str40 = characterReader13.consumeToAny(charArray36);
        java.lang.String str41 = characterReader5.consumeToAny(charArray36);
        boolean boolean42 = characterReader1.matchesAnySorted(charArray36);
        java.lang.String str43 = characterReader1.consumeAsString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "i!" + "'", str41, "i!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "h" + "'", str43, "h");
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        char char5 = characterReader1.current();
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = characterReader1.matchesAny(charArray7);
        boolean boolean10 = characterReader1.matchConsumeIgnoreCase("h");
        boolean boolean11 = characterReader1.isEmpty();
        java.lang.String str12 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean14 = characterReader1.matchConsume("!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\uffff' + "'", char5 == '\uffff');
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matchesDigit();
        java.lang.String str5 = characterReader1.consumeAsString();
        characterReader1.unconsume();
        characterReader1.advance();
        boolean boolean9 = characterReader1.matchesIgnoreCase("h");
        char char10 = characterReader1.consume();
        characterReader1.mark();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + 'i' + "'", char10 == 'i');
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('#');
        characterReader1.mark();
        boolean boolean6 = characterReader1.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str11 = characterReader10.consumeLetterThenDigitSequence();
        boolean boolean13 = characterReader10.matches(' ');
        boolean boolean15 = characterReader10.matchesIgnoreCase("hi!");
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str18 = characterReader17.consumeLetterThenDigitSequence();
        boolean boolean20 = characterReader17.matches(' ');
        char char21 = characterReader17.current();
        char[] charArray23 = new char[] { '4' };
        boolean boolean24 = characterReader17.matchesAny(charArray23);
        boolean boolean25 = characterReader10.matchesAnySorted(charArray23);
        java.lang.String str26 = characterReader8.consumeToAnySorted(charArray23);
        java.lang.String str27 = characterReader8.consumeHexSequence();
        int int29 = characterReader8.nextIndexOf('a');
        java.lang.String str30 = characterReader8.consumeToEnd();
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str33 = characterReader32.consumeLetterThenDigitSequence();
        boolean boolean35 = characterReader32.matches(' ');
        java.lang.String str36 = characterReader32.toString();
        char char37 = characterReader32.current();
        org.jsoup.parser.CharacterReader characterReader39 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str41 = characterReader39.consumeTo('#');
        characterReader39.mark();
        org.jsoup.parser.CharacterReader characterReader44 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str45 = characterReader44.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader47 = new org.jsoup.parser.CharacterReader("");
        char[] charArray52 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str53 = characterReader47.consumeToAnySorted(charArray52);
        boolean boolean54 = characterReader44.matchesAny(charArray52);
        boolean boolean55 = characterReader39.matchesAny(charArray52);
        boolean boolean56 = characterReader32.matchesAny(charArray52);
        org.jsoup.parser.CharacterReader characterReader58 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str59 = characterReader58.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader61 = new org.jsoup.parser.CharacterReader("");
        char[] charArray66 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str67 = characterReader61.consumeToAnySorted(charArray66);
        boolean boolean68 = characterReader58.matchesAny(charArray66);
        java.lang.String str69 = characterReader32.consumeToAny(charArray66);
        java.lang.String str70 = characterReader8.consumeToAny(charArray66);
        boolean boolean71 = characterReader1.matchesAnySorted(charArray66);
        char char72 = characterReader1.current();
        java.lang.String str73 = characterReader1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\uffff' + "'", char21 == '\uffff');
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + char37 + "' != '" + '\uffff' + "'", char37 == '\uffff');
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertArrayEquals(charArray66, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + char72 + "' != '" + '\uffff' + "'", char72 == '\uffff');
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader4 = new org.jsoup.parser.CharacterReader("");
        char[] charArray9 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str10 = characterReader4.consumeToAnySorted(charArray9);
        boolean boolean11 = characterReader1.matchesAnySorted(charArray9);
        characterReader1.rewindToMark();
        characterReader1.mark();
        int int15 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        java.lang.String str17 = characterReader1.consumeTo("!");
        int int19 = characterReader1.nextIndexOf('!');
        java.lang.String str21 = characterReader1.consumeTo("i");
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean24 = characterReader23.matchesLetter();
        int int26 = characterReader23.nextIndexOf('h');
        java.lang.String str27 = characterReader23.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader29 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader29.unconsume();
        characterReader29.rewindToMark();
        boolean boolean33 = characterReader29.matches("");
        boolean boolean34 = characterReader29.matchesDigit();
        java.lang.String str35 = characterReader29.consumeTagName();
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean38 = characterReader37.matchesLetter();
        boolean boolean42 = characterReader37.rangeEquals((int) (short) -1, (int) '#', "hi");
        org.jsoup.parser.CharacterReader characterReader44 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str45 = characterReader44.consumeLetterThenDigitSequence();
        char char46 = characterReader44.current();
        int int48 = characterReader44.nextIndexOf(' ');
        java.lang.String str49 = characterReader44.consumeLetterSequence();
        int int50 = characterReader44.pos();
        boolean boolean52 = characterReader44.matches("h");
        org.jsoup.parser.CharacterReader characterReader54 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str55 = characterReader54.consumeLetterThenDigitSequence();
        char char56 = characterReader54.current();
        boolean boolean60 = characterReader54.rangeEquals(0, (int) (short) 1, "");
        org.jsoup.parser.CharacterReader characterReader62 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str63 = characterReader62.consumeLetterThenDigitSequence();
        boolean boolean65 = characterReader62.matches(' ');
        boolean boolean67 = characterReader62.matchesIgnoreCase("hi!");
        boolean boolean69 = characterReader62.matches('a');
        boolean boolean70 = characterReader62.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader72 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str74 = characterReader72.consumeTo('#');
        characterReader72.mark();
        org.jsoup.parser.CharacterReader characterReader77 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str78 = characterReader77.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader80 = new org.jsoup.parser.CharacterReader("");
        char[] charArray85 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str86 = characterReader80.consumeToAnySorted(charArray85);
        boolean boolean87 = characterReader77.matchesAny(charArray85);
        boolean boolean88 = characterReader72.matchesAny(charArray85);
        java.lang.String str89 = characterReader62.consumeToAny(charArray85);
        java.lang.String str90 = characterReader54.consumeToAny(charArray85);
        boolean boolean91 = characterReader44.matchesAnySorted(charArray85);
        java.lang.String str92 = characterReader37.consumeToAnySorted(charArray85);
        java.lang.String str93 = characterReader29.consumeToAny(charArray85);
        boolean boolean94 = characterReader23.matchesAnySorted(charArray85);
        java.lang.String str95 = characterReader1.consumeToAny(charArray85);
        boolean boolean96 = characterReader1.matchesDigit();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi" + "'", str27, "hi");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + char46 + "' != '" + '\uffff' + "'", char46 == '\uffff');
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + char56 + "' != '" + '\uffff' + "'", char56 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(charArray85);
        org.junit.Assert.assertArrayEquals(charArray85, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "hi!" + "'", str92, "hi!");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean2 = characterReader1.matchesDigit();
        int int4 = characterReader1.nextIndexOf('#');
        characterReader1.advance();
        characterReader1.unconsume();
        boolean boolean8 = characterReader1.matches("i!");
        boolean boolean9 = characterReader1.matchesDigit();
        boolean boolean11 = characterReader1.matchConsume("hi!");
        int int13 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        java.lang.String str14 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str15 = characterReader1.consumeDigitSequence();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray6 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        java.lang.String str8 = characterReader1.consumeHexSequence();
        java.lang.String str9 = characterReader1.consumeToEnd();
        java.lang.String str10 = characterReader1.consumeData();
        int int12 = characterReader1.nextIndexOf((java.lang.CharSequence) "i");
        java.lang.String str14 = characterReader1.consumeTo("hi!");
        boolean boolean16 = characterReader1.matches("h");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('#');
        boolean boolean5 = characterReader1.matches("");
        boolean boolean9 = characterReader1.rangeEquals((int) '4', (int) '4', "");
        int int11 = characterReader1.nextIndexOf('4');
        boolean boolean12 = characterReader1.isEmpty();
        java.lang.String str13 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean15 = characterReader1.matches('\uffff');
        boolean boolean17 = characterReader1.matches("i!");
        boolean boolean19 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str20 = characterReader1.consumeToEnd();
        int int22 = characterReader1.nextIndexOf('i');
        boolean boolean24 = characterReader1.matchConsumeIgnoreCase("hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        characterReader1.advance();
        java.lang.String str4 = characterReader1.consumeLetterSequence();
        boolean boolean6 = characterReader1.containsIgnoreCase("i!");
        boolean boolean8 = characterReader1.matchesIgnoreCase("");
        int int10 = characterReader1.nextIndexOf(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = characterReader1.consumeTo('#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 1, count -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("h");
        boolean boolean2 = characterReader1.matchesDigit();
        boolean boolean4 = characterReader1.matches("");
        boolean boolean5 = characterReader1.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean8 = characterReader7.matchesDigit();
        char char9 = characterReader7.current();
        characterReader7.advance();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str13 = characterReader12.consumeLetterThenDigitSequence();
        boolean boolean15 = characterReader12.matches(' ');
        char char16 = characterReader12.current();
        boolean boolean18 = characterReader12.matchesIgnoreCase("h");
        java.lang.String str19 = characterReader12.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader21.unconsume();
        characterReader21.rewindToMark();
        boolean boolean25 = characterReader21.matches("");
        java.lang.String str26 = characterReader21.consumeLetterSequence();
        java.lang.String str27 = characterReader21.consumeToEnd();
        org.jsoup.parser.CharacterReader characterReader29 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str30 = characterReader29.consumeLetterThenDigitSequence();
        boolean boolean32 = characterReader29.matches(' ');
        boolean boolean34 = characterReader29.matchesIgnoreCase("hi!");
        boolean boolean36 = characterReader29.matches('a');
        java.lang.String str37 = characterReader29.toString();
        org.jsoup.parser.CharacterReader characterReader39 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean40 = characterReader39.matchesLetter();
        java.lang.String str41 = characterReader39.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader43.unconsume();
        characterReader43.rewindToMark();
        boolean boolean46 = characterReader43.matchesDigit();
        java.lang.String str47 = characterReader43.consumeAsString();
        boolean boolean49 = characterReader43.matchConsumeIgnoreCase("");
        java.lang.String str50 = characterReader43.toString();
        org.jsoup.parser.CharacterReader characterReader52 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str54 = characterReader52.consumeTo('#');
        char[] charArray58 = new char[] { '#', '#', 'a' };
        boolean boolean59 = characterReader52.matchesAny(charArray58);
        java.lang.String str60 = characterReader43.consumeToAnySorted(charArray58);
        java.lang.String str61 = characterReader39.consumeToAnySorted(charArray58);
        boolean boolean62 = characterReader29.matchesAnySorted(charArray58);
        boolean boolean63 = characterReader21.matchesAny(charArray58);
        boolean boolean64 = characterReader12.matchesAnySorted(charArray58);
        boolean boolean65 = characterReader7.matchesAny(charArray58);
        boolean boolean66 = characterReader1.matchesAnySorted(charArray58);
        org.jsoup.parser.CharacterReader characterReader68 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str69 = characterReader68.consumeLetterThenDigitSequence();
        boolean boolean71 = characterReader68.matches(' ');
        java.lang.String str72 = characterReader68.toString();
        char char73 = characterReader68.current();
        org.jsoup.parser.CharacterReader characterReader75 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str77 = characterReader75.consumeTo('#');
        characterReader75.mark();
        org.jsoup.parser.CharacterReader characterReader80 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str81 = characterReader80.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader83 = new org.jsoup.parser.CharacterReader("");
        char[] charArray88 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str89 = characterReader83.consumeToAnySorted(charArray88);
        boolean boolean90 = characterReader80.matchesAny(charArray88);
        boolean boolean91 = characterReader75.matchesAny(charArray88);
        boolean boolean92 = characterReader68.matchesAny(charArray88);
        boolean boolean93 = characterReader1.matchesAnySorted(charArray88);
        boolean boolean94 = characterReader1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + 'h' + "'", char9 == 'h');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\uffff' + "'", char16 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi" + "'", str26, "hi");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "!" + "'", str27, "!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi" + "'", str41, "hi");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "h" + "'", str47, "h");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "i!" + "'", str50, "i!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertArrayEquals(charArray58, new char[] { '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "i!" + "'", str60, "i!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "!" + "'", str61, "!");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + char73 + "' != '" + '\uffff' + "'", char73 == '\uffff');
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(charArray88);
        org.junit.Assert.assertArrayEquals(charArray88, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader4 = new org.jsoup.parser.CharacterReader("");
        char[] charArray9 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str10 = characterReader4.consumeToAnySorted(charArray9);
        boolean boolean11 = characterReader1.matchesAnySorted(charArray9);
        char char12 = characterReader1.consume();
        java.lang.String str13 = characterReader1.consumeLetterSequence();
        boolean boolean14 = characterReader1.isEmpty();
        characterReader1.unconsume();
        java.lang.String str16 = characterReader1.consumeDigitSequence();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\uffff' + "'", char12 == '\uffff');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean5 = characterReader1.matches("");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str8 = characterReader7.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        char[] charArray15 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str16 = characterReader10.consumeToAnySorted(charArray15);
        boolean boolean17 = characterReader7.matchesAnySorted(charArray15);
        boolean boolean19 = characterReader7.matchConsume("hi!");
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("");
        int int23 = characterReader21.nextIndexOf(' ');
        char[] charArray25 = new char[] { '4' };
        java.lang.String str26 = characterReader21.consumeToAny(charArray25);
        java.lang.String str27 = characterReader7.consumeToAny(charArray25);
        boolean boolean28 = characterReader1.matchesAny(charArray25);
        boolean boolean30 = characterReader1.matchConsumeIgnoreCase("");
        int int32 = characterReader1.nextIndexOf((java.lang.CharSequence) "i");
        int int34 = characterReader1.nextIndexOf('i');
        char char35 = characterReader1.consume();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + char35 + "' != '" + 'h' + "'", char35 == 'h');
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean2 = characterReader1.matchesDigit();
        char char3 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeHexSequence();
        java.lang.String str5 = characterReader1.consumeData();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'h' + "'", char3 == 'h');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        java.lang.String str5 = characterReader1.toString();
        char char6 = characterReader1.current();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi");
        char char9 = characterReader1.current();
        boolean boolean11 = characterReader1.matchConsume("hi!");
        boolean boolean12 = characterReader1.matchesDigit();
        int int13 = characterReader1.pos();
        java.lang.String str14 = characterReader1.consumeTagName();
        boolean boolean15 = characterReader1.matchesLetter();
        boolean boolean16 = characterReader1.isEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\uffff' + "'", char6 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean5 = characterReader1.matches("");
        boolean boolean6 = characterReader1.matchesDigit();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("i!");
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str11 = characterReader10.consumeLetterThenDigitSequence();
        boolean boolean13 = characterReader10.matches(' ');
        java.lang.String str14 = characterReader10.toString();
        char char15 = characterReader10.current();
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str19 = characterReader17.consumeTo('#');
        characterReader17.mark();
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str23 = characterReader22.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("");
        char[] charArray30 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str31 = characterReader25.consumeToAnySorted(charArray30);
        boolean boolean32 = characterReader22.matchesAny(charArray30);
        boolean boolean33 = characterReader17.matchesAny(charArray30);
        boolean boolean34 = characterReader10.matchesAny(charArray30);
        java.lang.String str35 = characterReader1.consumeToAnySorted(charArray30);
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = characterReader1.consumeTo("hi");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 4, count -1, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\uffff' + "'", char15 == '\uffff');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        int int8 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str13 = characterReader12.consumeLetterThenDigitSequence();
        boolean boolean15 = characterReader12.matches(' ');
        boolean boolean17 = characterReader12.matchesIgnoreCase("hi!");
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str20 = characterReader19.consumeLetterThenDigitSequence();
        boolean boolean22 = characterReader19.matches(' ');
        char char23 = characterReader19.current();
        char[] charArray25 = new char[] { '4' };
        boolean boolean26 = characterReader19.matchesAny(charArray25);
        boolean boolean27 = characterReader12.matchesAnySorted(charArray25);
        java.lang.String str28 = characterReader10.consumeToAnySorted(charArray25);
        boolean boolean29 = characterReader1.matchesAny(charArray25);
        java.lang.String str30 = characterReader1.consumeToEnd();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 0, count 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\uffff' + "'", char23 == '\uffff');
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        char char3 = characterReader1.current();
        boolean boolean7 = characterReader1.rangeEquals(0, (int) (short) 1, "");
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str10 = characterReader9.consumeLetterThenDigitSequence();
        boolean boolean12 = characterReader9.matches(' ');
        boolean boolean14 = characterReader9.matchesIgnoreCase("hi!");
        boolean boolean16 = characterReader9.matches('a');
        boolean boolean17 = characterReader9.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str21 = characterReader19.consumeTo('#');
        characterReader19.mark();
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str25 = characterReader24.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader27 = new org.jsoup.parser.CharacterReader("");
        char[] charArray32 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str33 = characterReader27.consumeToAnySorted(charArray32);
        boolean boolean34 = characterReader24.matchesAny(charArray32);
        boolean boolean35 = characterReader19.matchesAny(charArray32);
        java.lang.String str36 = characterReader9.consumeToAny(charArray32);
        java.lang.String str37 = characterReader1.consumeToAny(charArray32);
        java.lang.String str38 = characterReader1.consumeLetterSequence();
        java.lang.String str39 = characterReader1.consumeData();
        java.lang.String str40 = characterReader1.consumeHexSequence();
        org.jsoup.parser.CharacterReader characterReader42 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean43 = characterReader42.matchesDigit();
        int int45 = characterReader42.nextIndexOf('#');
        characterReader42.advance();
        characterReader42.unconsume();
        boolean boolean49 = characterReader42.matches("i!");
        org.jsoup.parser.CharacterReader characterReader51 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str52 = characterReader51.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader54 = new org.jsoup.parser.CharacterReader("");
        char[] charArray59 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str60 = characterReader54.consumeToAnySorted(charArray59);
        boolean boolean61 = characterReader51.matchesAnySorted(charArray59);
        char char62 = characterReader51.consume();
        characterReader51.mark();
        org.jsoup.parser.CharacterReader characterReader65 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str66 = characterReader65.consumeLetterThenDigitSequence();
        boolean boolean68 = characterReader65.matches(' ');
        boolean boolean70 = characterReader65.matchesIgnoreCase("hi!");
        org.jsoup.parser.CharacterReader characterReader72 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str73 = characterReader72.consumeLetterThenDigitSequence();
        boolean boolean75 = characterReader72.matches(' ');
        char char76 = characterReader72.current();
        char[] charArray78 = new char[] { '4' };
        boolean boolean79 = characterReader72.matchesAny(charArray78);
        boolean boolean80 = characterReader65.matchesAnySorted(charArray78);
        java.lang.String str81 = characterReader51.consumeToAnySorted(charArray78);
        java.lang.String str82 = characterReader42.consumeToAny(charArray78);
        java.lang.String str83 = characterReader1.consumeToAnySorted(charArray78);
        boolean boolean85 = characterReader1.matchesIgnoreCase("i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + char62 + "' != '" + '\uffff' + "'", char62 == '\uffff');
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + char76 + "' != '" + '\uffff' + "'", char76 == '\uffff');
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertArrayEquals(charArray78, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str9 = characterReader8.consumeLetterThenDigitSequence();
        boolean boolean11 = characterReader8.matches(' ');
        char char12 = characterReader8.current();
        char[] charArray14 = new char[] { '4' };
        boolean boolean15 = characterReader8.matchesAny(charArray14);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray14);
        boolean boolean18 = characterReader1.matches("!");
        java.lang.String str19 = characterReader1.consumeDigitSequence();
        java.lang.String str20 = characterReader1.consumeDigitSequence();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\uffff' + "'", char12 == '\uffff');
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean8 = characterReader1.matches('a');
        boolean boolean9 = characterReader1.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader11 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str13 = characterReader11.consumeTo('#');
        characterReader11.mark();
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str17 = characterReader16.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("");
        char[] charArray24 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str25 = characterReader19.consumeToAnySorted(charArray24);
        boolean boolean26 = characterReader16.matchesAny(charArray24);
        boolean boolean27 = characterReader11.matchesAny(charArray24);
        java.lang.String str28 = characterReader1.consumeToAny(charArray24);
        characterReader1.mark();
        char char30 = characterReader1.current();
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader32.unconsume();
        characterReader32.rewindToMark();
        boolean boolean35 = characterReader32.matchesDigit();
        java.lang.String str36 = characterReader32.consumeAsString();
        boolean boolean38 = characterReader32.matchConsumeIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader40 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str41 = characterReader40.consumeLetterThenDigitSequence();
        boolean boolean43 = characterReader40.matches(' ');
        boolean boolean45 = characterReader40.matchesIgnoreCase("hi!");
        boolean boolean47 = characterReader40.matches('a');
        boolean boolean48 = characterReader40.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader50 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str52 = characterReader50.consumeTo('#');
        characterReader50.mark();
        org.jsoup.parser.CharacterReader characterReader55 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str56 = characterReader55.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader58 = new org.jsoup.parser.CharacterReader("");
        char[] charArray63 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str64 = characterReader58.consumeToAnySorted(charArray63);
        boolean boolean65 = characterReader55.matchesAny(charArray63);
        boolean boolean66 = characterReader50.matchesAny(charArray63);
        java.lang.String str67 = characterReader40.consumeToAny(charArray63);
        java.lang.String str68 = characterReader32.consumeToAny(charArray63);
        boolean boolean69 = characterReader1.matchesAny(charArray63);
        java.lang.String str70 = characterReader1.consumeData();
        java.lang.String str72 = characterReader1.consumeTo("hi!");
        boolean boolean73 = characterReader1.matchesDigit();
        characterReader1.unconsume();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '\uffff' + "'", char30 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "h" + "'", str36, "h");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertArrayEquals(charArray63, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "i!" + "'", str68, "i!");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        char char3 = characterReader1.current();
        int int5 = characterReader1.nextIndexOf(' ');
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        int int8 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        char char9 = characterReader1.current();
        java.lang.String str10 = characterReader1.toString();
        java.lang.String str12 = characterReader1.consumeTo('h');
        boolean boolean16 = characterReader1.rangeEquals((int) (byte) 100, (int) ' ', "hi");
        boolean boolean17 = characterReader1.matchesDigit();
        java.lang.String str19 = characterReader1.consumeTo('a');
        java.lang.String str20 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean22 = characterReader1.matches("hi!");
        java.lang.String str23 = characterReader1.consumeLetterSequence();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean8 = characterReader1.matches('a');
        characterReader1.advance();
        int int11 = characterReader1.nextIndexOf('a');
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader13.unconsume();
        characterReader13.rewindToMark();
        boolean boolean16 = characterReader13.matchesDigit();
        java.lang.String str17 = characterReader13.consumeAsString();
        boolean boolean19 = characterReader13.matchConsumeIgnoreCase("");
        java.lang.String str20 = characterReader13.toString();
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str24 = characterReader22.consumeTo('#');
        char[] charArray28 = new char[] { '#', '#', 'a' };
        boolean boolean29 = characterReader22.matchesAny(charArray28);
        java.lang.String str30 = characterReader13.consumeToAnySorted(charArray28);
        characterReader13.advance();
        boolean boolean32 = characterReader13.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader34 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader34.unconsume();
        characterReader34.rewindToMark();
        boolean boolean38 = characterReader34.matches("");
        boolean boolean39 = characterReader34.matchesDigit();
        char char40 = characterReader34.consume();
        org.jsoup.parser.CharacterReader characterReader42 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str43 = characterReader42.consumeLetterThenDigitSequence();
        boolean boolean45 = characterReader42.matches(' ');
        boolean boolean47 = characterReader42.matchesIgnoreCase("hi!");
        org.jsoup.parser.CharacterReader characterReader49 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str50 = characterReader49.consumeLetterThenDigitSequence();
        boolean boolean52 = characterReader49.matches(' ');
        char char53 = characterReader49.current();
        char[] charArray55 = new char[] { '4' };
        boolean boolean56 = characterReader49.matchesAny(charArray55);
        boolean boolean57 = characterReader42.matchesAnySorted(charArray55);
        boolean boolean58 = characterReader34.matchesAny(charArray55);
        boolean boolean59 = characterReader13.matchesAny(charArray55);
        org.jsoup.parser.CharacterReader characterReader61 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str62 = characterReader61.consumeLetterThenDigitSequence();
        boolean boolean64 = characterReader61.matches(' ');
        java.lang.String str65 = characterReader61.toString();
        char char66 = characterReader61.current();
        org.jsoup.parser.CharacterReader characterReader68 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str70 = characterReader68.consumeTo('#');
        characterReader68.mark();
        org.jsoup.parser.CharacterReader characterReader73 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str74 = characterReader73.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader76 = new org.jsoup.parser.CharacterReader("");
        char[] charArray81 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str82 = characterReader76.consumeToAnySorted(charArray81);
        boolean boolean83 = characterReader73.matchesAny(charArray81);
        boolean boolean84 = characterReader68.matchesAny(charArray81);
        boolean boolean85 = characterReader61.matchesAny(charArray81);
        boolean boolean86 = characterReader13.matchesAny(charArray81);
        boolean boolean87 = characterReader1.matchesAnySorted(charArray81);
        characterReader1.rewindToMark();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "i!" + "'", str20, "i!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "i!" + "'", str30, "i!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + char40 + "' != '" + 'h' + "'", char40 == 'h');
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + char53 + "' != '" + '\uffff' + "'", char53 == '\uffff');
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + char66 + "' != '" + '\uffff' + "'", char66 == '\uffff');
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertArrayEquals(charArray81, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('#');
        char[] charArray7 = new char[] { '#', '#', 'a' };
        boolean boolean8 = characterReader1.matchesAny(charArray7);
        java.lang.String str9 = characterReader1.consumeTagName();
        java.lang.String str10 = characterReader1.consumeHexSequence();
        java.lang.String str12 = characterReader1.consumeTo('h');
        characterReader1.rewindToMark();
        boolean boolean14 = characterReader1.matchesDigit();
        boolean boolean16 = characterReader1.matchConsume("i");
        int int17 = characterReader1.pos();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        char char3 = characterReader1.current();
        boolean boolean4 = characterReader1.isEmpty();
        boolean boolean8 = characterReader1.rangeEquals((int) (byte) -1, (int) (short) 100, "hi!");
        java.lang.String str9 = characterReader1.consumeHexSequence();
        boolean boolean11 = characterReader1.matchConsume("i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        char char3 = characterReader1.current();
        int int5 = characterReader1.nextIndexOf(' ');
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        int int7 = characterReader1.pos();
        boolean boolean9 = characterReader1.matches("h");
        boolean boolean11 = characterReader1.matchConsume("!");
        int int12 = characterReader1.pos();
        char char13 = characterReader1.current();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\uffff' + "'", char13 == '\uffff');
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        char char3 = characterReader1.current();
        int int5 = characterReader1.nextIndexOf(' ');
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        int int8 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        char char9 = characterReader1.current();
        java.lang.String str10 = characterReader1.toString();
        java.lang.String str12 = characterReader1.consumeTo('h');
        java.lang.String str13 = characterReader1.consumeToEnd();
        java.lang.String str14 = characterReader1.consumeToEnd();
        char char15 = characterReader1.consume();
        boolean boolean17 = characterReader1.containsIgnoreCase("h");
        boolean boolean19 = characterReader1.matchConsumeIgnoreCase("i");
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str22 = characterReader21.consumeLetterThenDigitSequence();
        char char23 = characterReader21.current();
        int int25 = characterReader21.nextIndexOf(' ');
        java.lang.String str26 = characterReader21.consumeLetterSequence();
        int int28 = characterReader21.nextIndexOf((java.lang.CharSequence) "hi!");
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str31 = characterReader30.consumeLetterThenDigitSequence();
        char char32 = characterReader30.current();
        boolean boolean36 = characterReader30.rangeEquals(0, (int) (short) 1, "");
        org.jsoup.parser.CharacterReader characterReader38 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str39 = characterReader38.consumeLetterThenDigitSequence();
        boolean boolean41 = characterReader38.matches(' ');
        boolean boolean43 = characterReader38.matchesIgnoreCase("hi!");
        boolean boolean45 = characterReader38.matches('a');
        boolean boolean46 = characterReader38.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader48 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str50 = characterReader48.consumeTo('#');
        characterReader48.mark();
        org.jsoup.parser.CharacterReader characterReader53 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str54 = characterReader53.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader56 = new org.jsoup.parser.CharacterReader("");
        char[] charArray61 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str62 = characterReader56.consumeToAnySorted(charArray61);
        boolean boolean63 = characterReader53.matchesAny(charArray61);
        boolean boolean64 = characterReader48.matchesAny(charArray61);
        java.lang.String str65 = characterReader38.consumeToAny(charArray61);
        java.lang.String str66 = characterReader30.consumeToAny(charArray61);
        java.lang.String str67 = characterReader21.consumeToAnySorted(charArray61);
        boolean boolean68 = characterReader1.matchesAny(charArray61);
        java.lang.String str69 = characterReader1.consumeLetterSequence();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\uffff' + "'", char15 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\uffff' + "'", char23 == '\uffff');
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\uffff' + "'", char32 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertArrayEquals(charArray61, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matchesDigit();
        java.lang.String str5 = characterReader1.consumeAsString();
        characterReader1.unconsume();
        java.lang.String str7 = characterReader1.consumeTagName();
        boolean boolean9 = characterReader1.containsIgnoreCase("h");
        characterReader1.advance();
        boolean boolean14 = characterReader1.rangeEquals(100, 100, "!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        char char3 = characterReader1.current();
        int int5 = characterReader1.nextIndexOf(' ');
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        int int7 = characterReader1.pos();
        boolean boolean9 = characterReader1.matches("h");
        characterReader1.advance();
        boolean boolean12 = characterReader1.matchesIgnoreCase("!");
        char char13 = characterReader1.current();
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 2, count 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\uffff' + "'", char13 == '\uffff');
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matchesDigit();
        java.lang.String str5 = characterReader1.consumeAsString();
        java.lang.String str7 = characterReader1.consumeTo('a');
        char char8 = characterReader1.consume();
        boolean boolean10 = characterReader1.matchesIgnoreCase("h");
        boolean boolean11 = characterReader1.matchesDigit();
        char char12 = characterReader1.consume();
        characterReader1.advance();
        characterReader1.rewindToMark();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = characterReader1.consumeTo("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "i!" + "'", str7, "i!");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\uffff' + "'", char12 == '\uffff');
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader4 = new org.jsoup.parser.CharacterReader("");
        char[] charArray9 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str10 = characterReader4.consumeToAnySorted(charArray9);
        boolean boolean11 = characterReader1.matchesAnySorted(charArray9);
        characterReader1.rewindToMark();
        characterReader1.mark();
        java.lang.String str14 = characterReader1.toString();
        java.lang.String str15 = characterReader1.consumeData();
        boolean boolean17 = characterReader1.matches('#');
        java.lang.String str18 = characterReader1.consumeHexSequence();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        char char3 = characterReader1.current();
        int int5 = characterReader1.nextIndexOf(' ');
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        int int8 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        java.lang.String str10 = characterReader1.consumeTo('\uffff');
        java.lang.String str11 = characterReader1.consumeDigitSequence();
        int int13 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader4 = new org.jsoup.parser.CharacterReader("");
        char[] charArray9 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str10 = characterReader4.consumeToAnySorted(charArray9);
        boolean boolean11 = characterReader1.matchesAnySorted(charArray9);
        char char12 = characterReader1.consume();
        java.lang.String str13 = characterReader1.consumeLetterSequence();
        boolean boolean14 = characterReader1.isEmpty();
        boolean boolean16 = characterReader1.matchConsume("i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\uffff' + "'", char12 == '\uffff');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        char char5 = characterReader1.current();
        boolean boolean7 = characterReader1.matches('\uffff');
        char char8 = characterReader1.current();
        java.lang.String str10 = characterReader1.consumeTo("i");
        char char11 = characterReader1.current();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\uffff' + "'", char5 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\uffff' + "'", char11 == '\uffff');
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray6 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        java.lang.String str8 = characterReader1.consumeHexSequence();
        boolean boolean10 = characterReader1.matches('\uffff');
        java.lang.String str11 = characterReader1.consumeToEnd();
        java.lang.String str12 = characterReader1.consumeDigitSequence();
        boolean boolean14 = characterReader1.containsIgnoreCase("!");
        java.lang.String str15 = characterReader1.consumeToEnd();
        java.lang.String str16 = characterReader1.toString();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray6 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        java.lang.String str8 = characterReader1.consumeHexSequence();
        boolean boolean10 = characterReader1.matches('\uffff');
        java.lang.String str11 = characterReader1.consumeToEnd();
        int int13 = characterReader1.nextIndexOf(' ');
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        char char3 = characterReader1.current();
        int int5 = characterReader1.nextIndexOf(' ');
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        int int7 = characterReader1.pos();
        boolean boolean9 = characterReader1.matches("h");
        java.lang.String str10 = characterReader1.consumeToEnd();
        boolean boolean11 = characterReader1.isEmpty();
        boolean boolean12 = characterReader1.matchesLetter();
        boolean boolean13 = characterReader1.matchesDigit();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean6 = characterReader1.rangeEquals((int) (short) 1, (int) '#', "h");
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str10 = characterReader8.consumeTo('#');
        char[] charArray14 = new char[] { '#', '#', 'a' };
        boolean boolean15 = characterReader8.matchesAny(charArray14);
        java.lang.String str16 = characterReader8.consumeTagName();
        java.lang.String str17 = characterReader8.consumeHexSequence();
        java.lang.String str19 = characterReader8.consumeTo('h');
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str23 = characterReader21.consumeTo('#');
        char[] charArray27 = new char[] { '#', '#', 'a' };
        boolean boolean28 = characterReader21.matchesAny(charArray27);
        boolean boolean29 = characterReader8.matchesAny(charArray27);
        java.lang.String str30 = characterReader1.consumeToAny(charArray27);
        characterReader1.mark();
        boolean boolean32 = characterReader1.matchesLetter();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi" + "'", str2, "hi");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "!" + "'", str30, "!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean5 = characterReader1.matches('\uffff');
        java.lang.String str6 = characterReader1.consumeLetterThenDigitSequence();
        characterReader1.advance();
        java.lang.String str8 = characterReader1.consumeDigitSequence();
        boolean boolean9 = characterReader1.matchesLetter();
        java.lang.String str10 = characterReader1.consumeToEnd();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi" + "'", str6, "hi");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        char char3 = characterReader1.current();
        int int5 = characterReader1.nextIndexOf(' ');
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        int int7 = characterReader1.pos();
        boolean boolean9 = characterReader1.matches("h");
        boolean boolean11 = characterReader1.matchConsume("!");
        characterReader1.mark();
        java.lang.String str13 = characterReader1.consumeDigitSequence();
        boolean boolean15 = characterReader1.matchConsumeIgnoreCase("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matchesDigit();
        java.lang.String str5 = characterReader1.consumeAsString();
        characterReader1.unconsume();
        java.lang.String str7 = characterReader1.consumeTagName();
        boolean boolean9 = characterReader1.matchConsume("!");
        java.lang.String str10 = characterReader1.consumeLetterThenDigitSequence();
        characterReader1.advance();
        characterReader1.advance();
        boolean boolean14 = characterReader1.matchConsumeIgnoreCase("");
        characterReader1.mark();
        java.lang.String str16 = characterReader1.consumeDigitSequence();
        boolean boolean17 = characterReader1.matchesLetter();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = characterReader1.containsIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        java.lang.String str5 = characterReader1.consumeLetterSequence();
        boolean boolean6 = characterReader1.matchesDigit();
        boolean boolean8 = characterReader1.matchConsume("hi");
        boolean boolean10 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean12 = characterReader1.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader14 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader14.unconsume();
        characterReader14.rewindToMark();
        boolean boolean17 = characterReader14.matchesDigit();
        java.lang.String str18 = characterReader14.consumeAsString();
        boolean boolean20 = characterReader14.matchConsumeIgnoreCase("");
        java.lang.String str21 = characterReader14.toString();
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str25 = characterReader23.consumeTo('#');
        char[] charArray29 = new char[] { '#', '#', 'a' };
        boolean boolean30 = characterReader23.matchesAny(charArray29);
        java.lang.String str31 = characterReader14.consumeToAnySorted(charArray29);
        characterReader14.advance();
        boolean boolean33 = characterReader14.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader35 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader35.unconsume();
        characterReader35.rewindToMark();
        boolean boolean39 = characterReader35.matches("");
        boolean boolean40 = characterReader35.matchesDigit();
        char char41 = characterReader35.consume();
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str44 = characterReader43.consumeLetterThenDigitSequence();
        boolean boolean46 = characterReader43.matches(' ');
        boolean boolean48 = characterReader43.matchesIgnoreCase("hi!");
        org.jsoup.parser.CharacterReader characterReader50 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str51 = characterReader50.consumeLetterThenDigitSequence();
        boolean boolean53 = characterReader50.matches(' ');
        char char54 = characterReader50.current();
        char[] charArray56 = new char[] { '4' };
        boolean boolean57 = characterReader50.matchesAny(charArray56);
        boolean boolean58 = characterReader43.matchesAnySorted(charArray56);
        boolean boolean59 = characterReader35.matchesAny(charArray56);
        boolean boolean60 = characterReader14.matchesAny(charArray56);
        boolean boolean61 = characterReader1.matchesAnySorted(charArray56);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "i!" + "'", str21, "i!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "i!" + "'", str31, "i!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + char41 + "' != '" + 'h' + "'", char41 == 'h');
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + char54 + "' != '" + '\uffff' + "'", char54 == '\uffff');
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertArrayEquals(charArray56, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        char char3 = characterReader1.current();
        boolean boolean7 = characterReader1.rangeEquals(0, (int) (short) 1, "");
        java.lang.String str8 = characterReader1.consumeHexSequence();
        java.lang.String str10 = characterReader1.consumeTo('#');
        java.lang.String str11 = characterReader1.consumeData();
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str14 = characterReader13.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        char[] charArray21 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str22 = characterReader16.consumeToAnySorted(charArray21);
        boolean boolean23 = characterReader13.matchesAny(charArray21);
        java.lang.String str24 = characterReader13.consumeHexSequence();
        java.lang.String str25 = characterReader13.consumeData();
        org.jsoup.parser.CharacterReader characterReader27 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str29 = characterReader27.consumeTo('#');
        characterReader27.mark();
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str33 = characterReader32.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader35 = new org.jsoup.parser.CharacterReader("");
        char[] charArray40 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str41 = characterReader35.consumeToAnySorted(charArray40);
        boolean boolean42 = characterReader32.matchesAny(charArray40);
        boolean boolean43 = characterReader27.matchesAny(charArray40);
        java.lang.String str44 = characterReader13.consumeToAny(charArray40);
        org.jsoup.parser.CharacterReader characterReader46 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str47 = characterReader46.consumeLetterThenDigitSequence();
        boolean boolean49 = characterReader46.matches(' ');
        boolean boolean51 = characterReader46.matchesIgnoreCase("hi!");
        int int53 = characterReader46.nextIndexOf((java.lang.CharSequence) "hi!");
        org.jsoup.parser.CharacterReader characterReader55 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader57 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str58 = characterReader57.consumeLetterThenDigitSequence();
        boolean boolean60 = characterReader57.matches(' ');
        boolean boolean62 = characterReader57.matchesIgnoreCase("hi!");
        org.jsoup.parser.CharacterReader characterReader64 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str65 = characterReader64.consumeLetterThenDigitSequence();
        boolean boolean67 = characterReader64.matches(' ');
        char char68 = characterReader64.current();
        char[] charArray70 = new char[] { '4' };
        boolean boolean71 = characterReader64.matchesAny(charArray70);
        boolean boolean72 = characterReader57.matchesAnySorted(charArray70);
        java.lang.String str73 = characterReader55.consumeToAnySorted(charArray70);
        boolean boolean74 = characterReader46.matchesAny(charArray70);
        java.lang.String str75 = characterReader13.consumeToAny(charArray70);
        boolean boolean76 = characterReader1.matchesAny(charArray70);
        java.lang.String str77 = characterReader1.consumeHexSequence();
        boolean boolean78 = characterReader1.matchesLetter();
        int int80 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        boolean boolean82 = characterReader1.matchesIgnoreCase("!");
        java.lang.String str83 = characterReader1.consumeLetterThenDigitSequence();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + char68 + "' != '" + '\uffff' + "'", char68 == '\uffff');
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertArrayEquals(charArray70, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader4 = new org.jsoup.parser.CharacterReader("");
        char[] charArray9 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str10 = characterReader4.consumeToAnySorted(charArray9);
        boolean boolean11 = characterReader1.matchesAnySorted(charArray9);
        boolean boolean13 = characterReader1.matchConsume("i!");
        java.lang.String str15 = characterReader1.consumeTo('a');
        int int16 = characterReader1.pos();
        java.lang.String str17 = characterReader1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean4 = characterReader1.matches(' ');
        java.lang.String str5 = characterReader1.toString();
        char char6 = characterReader1.current();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str9 = characterReader1.toString();
        java.lang.String str10 = characterReader1.consumeData();
        java.lang.String str11 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str12 = characterReader1.consumeDigitSequence();
        java.lang.String str13 = characterReader1.consumeToEnd();
        java.lang.String str15 = characterReader1.consumeTo('#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\uffff' + "'", char6 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean5 = characterReader1.matches("");
        boolean boolean6 = characterReader1.matchesDigit();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("i!");
        characterReader1.rewindToMark();
        boolean boolean10 = characterReader1.isEmpty();
        java.lang.String str12 = characterReader1.consumeTo('h');
        java.lang.String str13 = characterReader1.consumeTagName();
        boolean boolean15 = characterReader1.matches('#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray6 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        java.lang.String str8 = characterReader1.consumeHexSequence();
        java.lang.String str9 = characterReader1.consumeToEnd();
        java.lang.String str10 = characterReader1.consumeToEnd();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str13 = characterReader12.consumeLetterThenDigitSequence();
        boolean boolean15 = characterReader12.matches(' ');
        java.lang.String str16 = characterReader12.toString();
        char char17 = characterReader12.current();
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str21 = characterReader19.consumeTo('#');
        characterReader19.mark();
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str25 = characterReader24.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader27 = new org.jsoup.parser.CharacterReader("");
        char[] charArray32 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str33 = characterReader27.consumeToAnySorted(charArray32);
        boolean boolean34 = characterReader24.matchesAny(charArray32);
        boolean boolean35 = characterReader19.matchesAny(charArray32);
        boolean boolean36 = characterReader12.matchesAny(charArray32);
        java.lang.String str37 = characterReader1.consumeToAnySorted(charArray32);
        int int39 = characterReader1.nextIndexOf('a');
        int int40 = characterReader1.pos();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\uffff' + "'", char17 == '\uffff');
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("i!");
        java.lang.String str3 = characterReader1.consumeTo('\uffff');
        characterReader1.advance();
        boolean boolean6 = characterReader1.matches('a');
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("");
        boolean boolean9 = characterReader1.matchesDigit();
        int int10 = characterReader1.pos();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!" + "'", str3, "i!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matchesDigit();
        java.lang.String str5 = characterReader1.consumeAsString();
        boolean boolean6 = characterReader1.matchesLetter();
        java.lang.String str7 = characterReader1.consumeHexSequence();
        java.lang.String str8 = characterReader1.toString();
        java.lang.String str9 = characterReader1.consumeLetterThenDigitSequence();
        characterReader1.advance();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str13 = characterReader12.consumeLetterThenDigitSequence();
        char char14 = characterReader12.current();
        int int16 = characterReader12.nextIndexOf(' ');
        java.lang.String str17 = characterReader12.consumeLetterSequence();
        int int19 = characterReader12.nextIndexOf((java.lang.CharSequence) "hi!");
        characterReader12.mark();
        boolean boolean22 = characterReader12.matchConsumeIgnoreCase("i!");
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str25 = characterReader24.consumeLetterThenDigitSequence();
        char char26 = characterReader24.current();
        boolean boolean30 = characterReader24.rangeEquals(0, (int) (short) 1, "");
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str33 = characterReader32.consumeLetterThenDigitSequence();
        boolean boolean35 = characterReader32.matches(' ');
        boolean boolean37 = characterReader32.matchesIgnoreCase("hi!");
        boolean boolean39 = characterReader32.matches('a');
        boolean boolean40 = characterReader32.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader42 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str44 = characterReader42.consumeTo('#');
        characterReader42.mark();
        org.jsoup.parser.CharacterReader characterReader47 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str48 = characterReader47.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader50 = new org.jsoup.parser.CharacterReader("");
        char[] charArray55 = new char[] { '4', '4', '#', 'a' };
        java.lang.String str56 = characterReader50.consumeToAnySorted(charArray55);
        boolean boolean57 = characterReader47.matchesAny(charArray55);
        boolean boolean58 = characterReader42.matchesAny(charArray55);
        java.lang.String str59 = characterReader32.consumeToAny(charArray55);
        java.lang.String str60 = characterReader24.consumeToAny(charArray55);
        boolean boolean61 = characterReader12.matchesAnySorted(charArray55);
        boolean boolean62 = characterReader1.matchesAny(charArray55);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i!" + "'", str8, "i!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "i" + "'", str9, "i");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\uffff' + "'", char14 == '\uffff');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\uffff' + "'", char26 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { '4', '4', '#', 'a' });
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }
}

