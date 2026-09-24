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
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean2 = characterReader1.matchesDigit();
        boolean boolean3 = characterReader1.isEmpty();
        java.lang.String str4 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str5 = characterReader1.consumeToEnd();
        boolean boolean7 = characterReader1.matchesIgnoreCase("hi");
        boolean boolean9 = characterReader1.matchesIgnoreCase("hi");
        java.lang.String str11 = characterReader1.consumeTo('!');
        char char12 = characterReader1.consume();
        boolean boolean13 = characterReader1.isEmpty();
        int int15 = characterReader1.nextIndexOf('i');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = characterReader1.consumeLetterSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 1, count 0, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\uffff' + "'", char12 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        java.lang.String str8 = characterReader1.consumeTo(' ');
        boolean boolean9 = characterReader1.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader11 = new org.jsoup.parser.CharacterReader("");
        char[] charArray15 = new char[] { ' ', '#', '4' };
        boolean boolean16 = characterReader11.matchesAny(charArray15);
        org.jsoup.parser.CharacterReader characterReader18 = new org.jsoup.parser.CharacterReader("");
        char[] charArray22 = new char[] { ' ', '#', '4' };
        boolean boolean23 = characterReader18.matchesAny(charArray22);
        boolean boolean24 = characterReader11.matchesAny(charArray22);
        boolean boolean25 = characterReader1.matchesAny(charArray22);
        java.lang.String str26 = characterReader1.consumeLetterSequence();
        boolean boolean28 = characterReader1.matchConsume("");
        int int29 = characterReader1.pos();
        characterReader1.advance();
        boolean boolean31 = characterReader1.matchesLetter();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        java.lang.String str8 = characterReader1.consumeTo(' ');
        boolean boolean9 = characterReader1.matchesLetter();
        boolean boolean10 = characterReader1.isEmpty();
        java.lang.String str11 = characterReader1.toString();
        int int13 = characterReader1.nextIndexOf(' ');
        boolean boolean15 = characterReader1.matches("hi!");
        int int17 = characterReader1.nextIndexOf('a');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        java.lang.String str12 = characterReader1.toString();
        characterReader1.unconsume();
        characterReader1.advance();
        boolean boolean15 = characterReader1.matchesDigit();
        java.lang.String str16 = characterReader1.toString();
        java.lang.String str17 = characterReader1.consumeHexSequence();
        java.lang.String str19 = characterReader1.consumeTo("i");
        java.lang.String str20 = characterReader1.consumeLetterSequence();
        boolean boolean22 = characterReader1.matchConsumeIgnoreCase("i!");
        boolean boolean24 = characterReader1.matchConsume("!");
        int int26 = characterReader1.nextIndexOf((java.lang.CharSequence) "i!");
        boolean boolean28 = characterReader1.matches('a');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        java.lang.String str12 = characterReader1.toString();
        characterReader1.unconsume();
        characterReader1.advance();
        int int15 = characterReader1.pos();
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("");
        char[] charArray21 = new char[] { ' ', '#', '4' };
        boolean boolean22 = characterReader17.matchesAny(charArray21);
        char[] charArray26 = new char[] { 'a', 'a', 'a' };
        boolean boolean27 = characterReader17.matchesAny(charArray26);
        java.lang.String str28 = characterReader17.toString();
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("");
        char[] charArray34 = new char[] { ' ', '#', '4' };
        boolean boolean35 = characterReader30.matchesAny(charArray34);
        boolean boolean36 = characterReader17.matchesAny(charArray34);
        boolean boolean37 = characterReader1.matchesAny(charArray34);
        java.lang.String str38 = characterReader1.toString();
        boolean boolean39 = characterReader1.matchesDigit();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        java.lang.String str8 = characterReader1.consumeTo(' ');
        boolean boolean9 = characterReader1.matchesLetter();
        boolean boolean10 = characterReader1.isEmpty();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        boolean boolean14 = characterReader12.matchConsume("");
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        char[] charArray20 = new char[] { ' ', '#', '4' };
        boolean boolean21 = characterReader16.matchesAny(charArray20);
        char[] charArray25 = new char[] { 'a', 'a', 'a' };
        boolean boolean26 = characterReader16.matchesAny(charArray25);
        java.lang.String str27 = characterReader16.consumeDigitSequence();
        characterReader16.mark();
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("");
        char[] charArray34 = new char[] { ' ', '#', '4' };
        boolean boolean35 = characterReader30.matchesAny(charArray34);
        char[] charArray39 = new char[] { 'a', 'a', 'a' };
        boolean boolean40 = characterReader30.matchesAny(charArray39);
        java.lang.String str41 = characterReader16.consumeToAny(charArray39);
        java.lang.String str42 = characterReader12.consumeToAny(charArray39);
        boolean boolean43 = characterReader1.matchesAny(charArray39);
        java.lang.String str44 = characterReader1.consumeDigitSequence();
        boolean boolean46 = characterReader1.matchesIgnoreCase("");
        char char47 = characterReader1.current();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + char47 + "' != '" + '\uffff' + "'", char47 == '\uffff');
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean2 = characterReader1.matchesDigit();
        boolean boolean3 = characterReader1.matchesDigit();
        int int5 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        boolean boolean7 = characterReader1.matchConsume("!");
        java.lang.String str8 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        char[] charArray14 = new char[] { ' ', '#', '4' };
        boolean boolean15 = characterReader10.matchesAny(charArray14);
        char[] charArray19 = new char[] { 'a', 'a', 'a' };
        boolean boolean20 = characterReader10.matchesAny(charArray19);
        java.lang.String str21 = characterReader10.toString();
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        boolean boolean25 = characterReader23.matchConsume("");
        char char26 = characterReader23.current();
        java.lang.String str27 = characterReader23.consumeToEnd();
        org.jsoup.parser.CharacterReader characterReader29 = new org.jsoup.parser.CharacterReader("");
        boolean boolean31 = characterReader29.matchConsume("");
        char char32 = characterReader29.current();
        boolean boolean34 = characterReader29.matchConsume("hi!");
        org.jsoup.parser.CharacterReader characterReader36 = new org.jsoup.parser.CharacterReader("");
        char[] charArray40 = new char[] { ' ', '#', '4' };
        boolean boolean41 = characterReader36.matchesAny(charArray40);
        char[] charArray45 = new char[] { 'a', 'a', 'a' };
        boolean boolean46 = characterReader36.matchesAny(charArray45);
        java.lang.String str47 = characterReader36.consumeDigitSequence();
        characterReader36.mark();
        org.jsoup.parser.CharacterReader characterReader50 = new org.jsoup.parser.CharacterReader("");
        char[] charArray54 = new char[] { ' ', '#', '4' };
        boolean boolean55 = characterReader50.matchesAny(charArray54);
        char[] charArray59 = new char[] { 'a', 'a', 'a' };
        boolean boolean60 = characterReader50.matchesAny(charArray59);
        java.lang.String str61 = characterReader36.consumeToAny(charArray59);
        boolean boolean62 = characterReader29.matchesAny(charArray59);
        java.lang.String str63 = characterReader23.consumeToAny(charArray59);
        java.lang.String str64 = characterReader10.consumeToAny(charArray59);
        boolean boolean65 = characterReader1.matchesAny(charArray59);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str66 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 0, count 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\uffff' + "'", char26 == '\uffff');
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\uffff' + "'", char32 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        java.lang.String str12 = characterReader1.consumeDigitSequence();
        java.lang.String str13 = characterReader1.consumeDigitSequence();
        boolean boolean14 = characterReader1.matchesLetter();
        java.lang.String str15 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str17 = characterReader1.consumeTo('4');
        java.lang.String str18 = characterReader1.consumeDigitSequence();
        boolean boolean20 = characterReader1.containsIgnoreCase("!");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matchesIgnoreCase("hi");
        java.lang.String str4 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        int int7 = characterReader1.nextIndexOf('h');
        boolean boolean9 = characterReader1.matchConsume("hi");
        int int11 = characterReader1.nextIndexOf('#');
        boolean boolean13 = characterReader1.matchesIgnoreCase("!");
        char[] charArray19 = new char[] { '4', 'h', '!', '4', ' ' };
        java.lang.String str20 = characterReader1.consumeToAny(charArray19);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', 'h', '!', '4', ' ' });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        java.lang.String str12 = characterReader1.toString();
        characterReader1.unconsume();
        characterReader1.advance();
        int int15 = characterReader1.pos();
        boolean boolean16 = characterReader1.isEmpty();
        boolean boolean18 = characterReader1.matchConsume("hi!");
        java.lang.String str19 = characterReader1.consumeDigitSequence();
        boolean boolean21 = characterReader1.matchesIgnoreCase("");
        boolean boolean23 = characterReader1.matchesIgnoreCase("!");
        int int24 = characterReader1.pos();
        boolean boolean26 = characterReader1.matches("!");
        boolean boolean28 = characterReader1.matches("i");
        boolean boolean29 = characterReader1.matchesDigit();
        int int31 = characterReader1.nextIndexOf('!');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        java.lang.String str12 = characterReader1.toString();
        org.jsoup.parser.CharacterReader characterReader14 = new org.jsoup.parser.CharacterReader("");
        char[] charArray18 = new char[] { ' ', '#', '4' };
        boolean boolean19 = characterReader14.matchesAny(charArray18);
        boolean boolean20 = characterReader1.matchesAny(charArray18);
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("");
        char[] charArray26 = new char[] { ' ', '#', '4' };
        boolean boolean27 = characterReader22.matchesAny(charArray26);
        char[] charArray31 = new char[] { 'a', 'a', 'a' };
        boolean boolean32 = characterReader22.matchesAny(charArray31);
        java.lang.String str33 = characterReader22.toString();
        java.lang.String str35 = characterReader22.consumeTo("hi!");
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("");
        char[] charArray41 = new char[] { ' ', '#', '4' };
        boolean boolean42 = characterReader37.matchesAny(charArray41);
        java.lang.String str44 = characterReader37.consumeTo(' ');
        boolean boolean45 = characterReader37.matchesLetter();
        boolean boolean46 = characterReader37.isEmpty();
        org.jsoup.parser.CharacterReader characterReader48 = new org.jsoup.parser.CharacterReader("");
        boolean boolean50 = characterReader48.matchConsume("");
        org.jsoup.parser.CharacterReader characterReader52 = new org.jsoup.parser.CharacterReader("");
        char[] charArray56 = new char[] { ' ', '#', '4' };
        boolean boolean57 = characterReader52.matchesAny(charArray56);
        char[] charArray61 = new char[] { 'a', 'a', 'a' };
        boolean boolean62 = characterReader52.matchesAny(charArray61);
        java.lang.String str63 = characterReader52.consumeDigitSequence();
        characterReader52.mark();
        org.jsoup.parser.CharacterReader characterReader66 = new org.jsoup.parser.CharacterReader("");
        char[] charArray70 = new char[] { ' ', '#', '4' };
        boolean boolean71 = characterReader66.matchesAny(charArray70);
        char[] charArray75 = new char[] { 'a', 'a', 'a' };
        boolean boolean76 = characterReader66.matchesAny(charArray75);
        java.lang.String str77 = characterReader52.consumeToAny(charArray75);
        java.lang.String str78 = characterReader48.consumeToAny(charArray75);
        boolean boolean79 = characterReader37.matchesAny(charArray75);
        java.lang.String str80 = characterReader22.consumeToAny(charArray75);
        java.lang.String str81 = characterReader1.consumeToAny(charArray75);
        java.lang.String str82 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean84 = characterReader1.matches('a');
        characterReader1.rewindToMark();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertArrayEquals(charArray56, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertArrayEquals(charArray61, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertArrayEquals(charArray70, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertArrayEquals(charArray75, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matchesIgnoreCase("hi");
        int int5 = characterReader1.nextIndexOf('a');
        boolean boolean7 = characterReader1.matches("i!");
        int int9 = characterReader1.nextIndexOf('\uffff');
        characterReader1.unconsume();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matchConsume("");
        char char4 = characterReader1.current();
        java.lang.String str5 = characterReader1.consumeToEnd();
        java.lang.String str6 = characterReader1.toString();
        java.lang.String str7 = characterReader1.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        char[] charArray13 = new char[] { ' ', '#', '4' };
        boolean boolean14 = characterReader9.matchesAny(charArray13);
        characterReader9.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("");
        char[] charArray21 = new char[] { ' ', '#', '4' };
        boolean boolean22 = characterReader17.matchesAny(charArray21);
        char[] charArray26 = new char[] { 'a', 'a', 'a' };
        boolean boolean27 = characterReader17.matchesAny(charArray26);
        java.lang.String str28 = characterReader17.consumeDigitSequence();
        boolean boolean30 = characterReader17.matches("hi!");
        java.lang.String str31 = characterReader17.consumeLetterThenDigitSequence();
        characterReader17.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader34 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean36 = characterReader34.matchConsumeIgnoreCase("hi!");
        org.jsoup.parser.CharacterReader characterReader38 = new org.jsoup.parser.CharacterReader("");
        char[] charArray42 = new char[] { ' ', '#', '4' };
        boolean boolean43 = characterReader38.matchesAny(charArray42);
        char[] charArray47 = new char[] { 'a', 'a', 'a' };
        boolean boolean48 = characterReader38.matchesAny(charArray47);
        java.lang.String str49 = characterReader38.toString();
        org.jsoup.parser.CharacterReader characterReader51 = new org.jsoup.parser.CharacterReader("");
        char[] charArray55 = new char[] { ' ', '#', '4' };
        boolean boolean56 = characterReader51.matchesAny(charArray55);
        boolean boolean57 = characterReader38.matchesAny(charArray55);
        java.lang.String str58 = characterReader34.consumeToAny(charArray55);
        java.lang.String str59 = characterReader17.consumeToAny(charArray55);
        java.lang.String str60 = characterReader9.consumeToAny(charArray55);
        boolean boolean61 = characterReader1.matchesAny(charArray55);
        java.lang.String str62 = characterReader1.consumeLetterSequence();
        boolean boolean64 = characterReader1.matchConsumeIgnoreCase("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\uffff' + "'", char4 == '\uffff');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        boolean boolean13 = characterReader1.matchConsumeIgnoreCase("");
        characterReader1.mark();
        boolean boolean15 = characterReader1.matchesLetter();
        java.lang.String str16 = characterReader1.consumeLetterThenDigitSequence();
        int int18 = characterReader1.nextIndexOf((java.lang.CharSequence) "i!");
        int int20 = characterReader1.nextIndexOf('4');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        characterReader1.rewindToMark();
        java.lang.String str9 = characterReader1.consumeTo("hi");
        boolean boolean11 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean13 = characterReader1.matchConsume("");
        java.lang.String str14 = characterReader1.consumeLetterSequence();
        boolean boolean16 = characterReader1.matchConsumeIgnoreCase("!");
        java.lang.String str17 = characterReader1.consumeDigitSequence();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        char[] charArray17 = new char[] { ' ', '#', '4' };
        boolean boolean18 = characterReader13.matchesAny(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        java.lang.String str21 = characterReader1.consumeTo(' ');
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        char[] charArray27 = new char[] { ' ', '#', '4' };
        boolean boolean28 = characterReader23.matchesAny(charArray27);
        char[] charArray32 = new char[] { 'a', 'a', 'a' };
        boolean boolean33 = characterReader23.matchesAny(charArray32);
        java.lang.String str34 = characterReader23.toString();
        org.jsoup.parser.CharacterReader characterReader36 = new org.jsoup.parser.CharacterReader("");
        char[] charArray40 = new char[] { ' ', '#', '4' };
        boolean boolean41 = characterReader36.matchesAny(charArray40);
        boolean boolean42 = characterReader23.matchesAny(charArray40);
        java.lang.String str43 = characterReader1.consumeToAny(charArray40);
        int int44 = characterReader1.pos();
        boolean boolean45 = characterReader1.matchesDigit();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean3 = characterReader1.matchConsumeIgnoreCase("hi!");
        boolean boolean5 = characterReader1.matchConsume("hi");
        int int6 = characterReader1.pos();
        java.lang.String str7 = characterReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 3, count 1, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        java.lang.String str12 = characterReader1.toString();
        characterReader1.unconsume();
        characterReader1.advance();
        int int15 = characterReader1.pos();
        boolean boolean16 = characterReader1.isEmpty();
        boolean boolean18 = characterReader1.matchConsume("hi!");
        java.lang.String str19 = characterReader1.consumeDigitSequence();
        int int21 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        char[] charArray27 = new char[] { ' ', '#', '4' };
        boolean boolean28 = characterReader23.matchesAny(charArray27);
        java.lang.String str30 = characterReader23.consumeTo(' ');
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("");
        char[] charArray36 = new char[] { ' ', '#', '4' };
        boolean boolean37 = characterReader32.matchesAny(charArray36);
        boolean boolean38 = characterReader23.matchesAny(charArray36);
        boolean boolean39 = characterReader1.matchesAny(charArray36);
        int int40 = characterReader1.pos();
        boolean boolean42 = characterReader1.matchesIgnoreCase("i");
        java.lang.String str43 = characterReader1.consumeHexSequence();
        java.lang.String str45 = characterReader1.consumeTo('4');
        characterReader1.advance();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        char[] charArray17 = new char[] { ' ', '#', '4' };
        boolean boolean18 = characterReader13.matchesAny(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        boolean boolean20 = characterReader1.isEmpty();
        boolean boolean22 = characterReader1.matchConsumeIgnoreCase("hi");
        int int24 = characterReader1.nextIndexOf('!');
        java.lang.String str26 = characterReader1.consumeTo('\uffff');
        characterReader1.mark();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        java.lang.String str12 = characterReader1.toString();
        characterReader1.unconsume();
        characterReader1.advance();
        int int15 = characterReader1.pos();
        boolean boolean17 = characterReader1.matches('#');
        java.lang.String str18 = characterReader1.consumeHexSequence();
        boolean boolean19 = characterReader1.matchesDigit();
        characterReader1.mark();
        boolean boolean22 = characterReader1.containsIgnoreCase("i!");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        char[] charArray12 = new char[] { ' ', '#', '4' };
        boolean boolean13 = characterReader8.matchesAny(charArray12);
        boolean boolean14 = characterReader1.matchesAny(charArray12);
        java.lang.String str15 = characterReader1.consumeDigitSequence();
        char char16 = characterReader1.current();
        java.lang.String str17 = characterReader1.toString();
        boolean boolean18 = characterReader1.isEmpty();
        char char19 = characterReader1.consume();
        boolean boolean21 = characterReader1.containsIgnoreCase("i");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\uffff' + "'", char16 == '\uffff');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\uffff' + "'", char19 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matchConsume("");
        char char4 = characterReader1.current();
        boolean boolean6 = characterReader1.matchConsume("hi!");
        int int7 = characterReader1.pos();
        boolean boolean8 = characterReader1.matchesDigit();
        char char9 = characterReader1.current();
        boolean boolean11 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str12 = characterReader1.consumeToEnd();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\uffff' + "'", char4 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matchesIgnoreCase("hi");
        java.lang.String str4 = characterReader1.consumeLetterSequence();
        int int6 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        boolean boolean7 = characterReader1.matchesLetter();
        java.lang.String str8 = characterReader1.consumeToEnd();
        java.lang.String str9 = characterReader1.consumeHexSequence();
        boolean boolean11 = characterReader1.matches('4');
        boolean boolean13 = characterReader1.containsIgnoreCase("i!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = characterReader1.containsIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean3 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeTo('a');
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        java.lang.String str8 = characterReader1.consumeTo('#');
        java.lang.String str9 = characterReader1.consumeToEnd();
        org.jsoup.parser.CharacterReader characterReader11 = new org.jsoup.parser.CharacterReader("");
        char[] charArray15 = new char[] { ' ', '#', '4' };
        boolean boolean16 = characterReader11.matchesAny(charArray15);
        char[] charArray20 = new char[] { 'a', 'a', 'a' };
        boolean boolean21 = characterReader11.matchesAny(charArray20);
        java.lang.String str22 = characterReader11.consumeDigitSequence();
        boolean boolean24 = characterReader11.matches("hi!");
        java.lang.String str25 = characterReader11.consumeLetterThenDigitSequence();
        boolean boolean27 = characterReader11.containsIgnoreCase("hi!");
        boolean boolean29 = characterReader11.containsIgnoreCase("!");
        org.jsoup.parser.CharacterReader characterReader31 = new org.jsoup.parser.CharacterReader("");
        char[] charArray35 = new char[] { ' ', '#', '4' };
        boolean boolean36 = characterReader31.matchesAny(charArray35);
        char[] charArray40 = new char[] { 'a', 'a', 'a' };
        boolean boolean41 = characterReader31.matchesAny(charArray40);
        java.lang.String str42 = characterReader31.consumeDigitSequence();
        characterReader31.mark();
        org.jsoup.parser.CharacterReader characterReader45 = new org.jsoup.parser.CharacterReader("");
        char[] charArray49 = new char[] { ' ', '#', '4' };
        boolean boolean50 = characterReader45.matchesAny(charArray49);
        char[] charArray54 = new char[] { 'a', 'a', 'a' };
        boolean boolean55 = characterReader45.matchesAny(charArray54);
        java.lang.String str56 = characterReader31.consumeToAny(charArray54);
        characterReader31.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader59 = new org.jsoup.parser.CharacterReader("");
        char[] charArray63 = new char[] { ' ', '#', '4' };
        boolean boolean64 = characterReader59.matchesAny(charArray63);
        boolean boolean65 = characterReader31.matchesAny(charArray63);
        java.lang.String str66 = characterReader11.consumeToAny(charArray63);
        java.lang.String str67 = characterReader1.consumeToAny(charArray63);
        boolean boolean69 = characterReader1.matches('!');
        java.lang.String str70 = characterReader1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertArrayEquals(charArray63, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        boolean boolean3 = characterReader1.matchesDigit();
        java.lang.String str4 = characterReader1.consumeHexSequence();
        characterReader1.mark();
        characterReader1.unconsume();
        int int7 = characterReader1.pos();
        boolean boolean9 = characterReader1.matchesIgnoreCase("hi!");
        char char10 = characterReader1.consume();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi" + "'", str2, "hi");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + 'i' + "'", char10 == 'i');
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        char[] charArray12 = new char[] { ' ', '#', '4' };
        boolean boolean13 = characterReader8.matchesAny(charArray12);
        boolean boolean14 = characterReader1.matchesAny(charArray12);
        boolean boolean15 = characterReader1.isEmpty();
        characterReader1.mark();
        boolean boolean18 = characterReader1.matches('#');
        boolean boolean20 = characterReader1.matchesIgnoreCase("");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean2 = characterReader1.matchesDigit();
        boolean boolean3 = characterReader1.isEmpty();
        java.lang.String str4 = characterReader1.consumeLetterSequence();
        int int6 = characterReader1.nextIndexOf((java.lang.CharSequence) "!");
        boolean boolean7 = characterReader1.matchesLetter();
        int int8 = characterReader1.pos();
        boolean boolean10 = characterReader1.matches("h");
        java.lang.String str11 = characterReader1.consumeToEnd();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi");
        int int3 = characterReader1.nextIndexOf(' ');
        char char4 = characterReader1.consume();
        characterReader1.unconsume();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'h' + "'", char4 == 'h');
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean2 = characterReader1.matchesDigit();
        boolean boolean3 = characterReader1.isEmpty();
        java.lang.String str4 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str5 = characterReader1.consumeToEnd();
        boolean boolean7 = characterReader1.matches("");
        java.lang.String str8 = characterReader1.toString();
        characterReader1.rewindToMark();
        char char10 = characterReader1.consume();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\uffff' + "'", char10 == '\uffff');
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        java.lang.String str12 = characterReader1.consumeDigitSequence();
        java.lang.String str13 = characterReader1.toString();
        boolean boolean14 = characterReader1.isEmpty();
        boolean boolean15 = characterReader1.isEmpty();
        java.lang.String str16 = characterReader1.toString();
        boolean boolean18 = characterReader1.matches("hi!");
        int int20 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        java.lang.String str22 = characterReader1.consumeTo("hi!");
        characterReader1.advance();
        char char24 = characterReader1.consume();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\uffff' + "'", char24 == '\uffff');
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matchesIgnoreCase("hi");
        java.lang.String str4 = characterReader1.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader6 = new org.jsoup.parser.CharacterReader("");
        char[] charArray10 = new char[] { ' ', '#', '4' };
        boolean boolean11 = characterReader6.matchesAny(charArray10);
        characterReader6.rewindToMark();
        java.lang.String str14 = characterReader6.consumeTo("hi");
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        char[] charArray20 = new char[] { ' ', '#', '4' };
        boolean boolean21 = characterReader16.matchesAny(charArray20);
        char[] charArray25 = new char[] { 'a', 'a', 'a' };
        boolean boolean26 = characterReader16.matchesAny(charArray25);
        java.lang.String str27 = characterReader6.consumeToAny(charArray25);
        java.lang.String str28 = characterReader1.consumeToAny(charArray25);
        java.lang.String str29 = characterReader1.toString();
        java.lang.String str30 = characterReader1.consumeLetterSequence();
        characterReader1.unconsume();
        characterReader1.advance();
        java.lang.String str33 = characterReader1.consumeHexSequence();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        char[] charArray17 = new char[] { ' ', '#', '4' };
        boolean boolean18 = characterReader13.matchesAny(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        java.lang.String str21 = characterReader1.consumeTo(' ');
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        char[] charArray27 = new char[] { ' ', '#', '4' };
        boolean boolean28 = characterReader23.matchesAny(charArray27);
        char[] charArray32 = new char[] { 'a', 'a', 'a' };
        boolean boolean33 = characterReader23.matchesAny(charArray32);
        java.lang.String str34 = characterReader23.toString();
        org.jsoup.parser.CharacterReader characterReader36 = new org.jsoup.parser.CharacterReader("");
        char[] charArray40 = new char[] { ' ', '#', '4' };
        boolean boolean41 = characterReader36.matchesAny(charArray40);
        boolean boolean42 = characterReader23.matchesAny(charArray40);
        java.lang.String str43 = characterReader1.consumeToAny(charArray40);
        boolean boolean45 = characterReader1.matches("");
        boolean boolean47 = characterReader1.matches("hi!");
        java.lang.String str49 = characterReader1.consumeTo("i!");
        java.lang.String str51 = characterReader1.consumeTo("hi!");
        characterReader1.unconsume();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        char[] charArray12 = new char[] { ' ', '#', '4' };
        boolean boolean13 = characterReader8.matchesAny(charArray12);
        boolean boolean14 = characterReader1.matchesAny(charArray12);
        boolean boolean15 = characterReader1.isEmpty();
        boolean boolean17 = characterReader1.matches('4');
        java.lang.String str18 = characterReader1.consumeHexSequence();
        java.lang.String str20 = characterReader1.consumeTo("hi!");
        java.lang.String str21 = characterReader1.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        char[] charArray27 = new char[] { ' ', '#', '4' };
        boolean boolean28 = characterReader23.matchesAny(charArray27);
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("");
        char[] charArray34 = new char[] { ' ', '#', '4' };
        boolean boolean35 = characterReader30.matchesAny(charArray34);
        boolean boolean36 = characterReader23.matchesAny(charArray34);
        java.lang.String str37 = characterReader1.consumeToAny(charArray34);
        boolean boolean39 = characterReader1.matches("i");
        java.lang.String str41 = characterReader1.consumeTo("i");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        java.lang.String str12 = characterReader1.consumeDigitSequence();
        boolean boolean14 = characterReader1.matches("hi!");
        characterReader1.unconsume();
        boolean boolean17 = characterReader1.matchesIgnoreCase("hi!");
        // The following exception was thrown during execution in test generation
        try {
            char char18 = characterReader1.consume();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        java.lang.String str12 = characterReader1.toString();
        characterReader1.unconsume();
        characterReader1.advance();
        int int15 = characterReader1.pos();
        boolean boolean16 = characterReader1.isEmpty();
        boolean boolean18 = characterReader1.matchesIgnoreCase("");
        java.lang.String str19 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean21 = characterReader1.matchConsume("hi!");
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str24 = characterReader23.consumeLetterSequence();
        int int25 = characterReader23.pos();
        java.lang.String str26 = characterReader23.consumeAsString();
        boolean boolean28 = characterReader23.containsIgnoreCase("!");
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("");
        boolean boolean32 = characterReader30.matchesIgnoreCase("hi");
        java.lang.String str33 = characterReader30.consumeHexSequence();
        org.jsoup.parser.CharacterReader characterReader35 = new org.jsoup.parser.CharacterReader("");
        char[] charArray39 = new char[] { ' ', '#', '4' };
        boolean boolean40 = characterReader35.matchesAny(charArray39);
        char[] charArray44 = new char[] { 'a', 'a', 'a' };
        boolean boolean45 = characterReader35.matchesAny(charArray44);
        java.lang.String str46 = characterReader30.consumeToAny(charArray44);
        org.jsoup.parser.CharacterReader characterReader48 = new org.jsoup.parser.CharacterReader("");
        char[] charArray52 = new char[] { ' ', '#', '4' };
        boolean boolean53 = characterReader48.matchesAny(charArray52);
        char[] charArray57 = new char[] { 'a', 'a', 'a' };
        boolean boolean58 = characterReader48.matchesAny(charArray57);
        java.lang.String str59 = characterReader48.toString();
        org.jsoup.parser.CharacterReader characterReader61 = new org.jsoup.parser.CharacterReader("");
        char[] charArray65 = new char[] { ' ', '#', '4' };
        boolean boolean66 = characterReader61.matchesAny(charArray65);
        boolean boolean67 = characterReader48.matchesAny(charArray65);
        java.lang.String str68 = characterReader30.consumeToAny(charArray65);
        java.lang.String str69 = characterReader23.consumeToAny(charArray65);
        boolean boolean70 = characterReader1.matchesAny(charArray65);
        boolean boolean71 = characterReader1.matchesDigit();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi" + "'", str24, "hi");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "!" + "'", str26, "!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertArrayEquals(charArray57, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertArrayEquals(charArray65, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        char[] charArray12 = new char[] { ' ', '#', '4' };
        boolean boolean13 = characterReader8.matchesAny(charArray12);
        boolean boolean14 = characterReader1.matchesAny(charArray12);
        boolean boolean15 = characterReader1.isEmpty();
        boolean boolean17 = characterReader1.matches("");
        java.lang.String str18 = characterReader1.consumeHexSequence();
        boolean boolean20 = characterReader1.matchConsumeIgnoreCase("hi");
        characterReader1.mark();
        char char22 = characterReader1.consume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = characterReader1.consumeHexSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 1, count 0, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\uffff' + "'", char22 == '\uffff');
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        char[] charArray17 = new char[] { ' ', '#', '4' };
        boolean boolean18 = characterReader13.matchesAny(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        java.lang.String str21 = characterReader1.consumeTo(' ');
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        char[] charArray27 = new char[] { ' ', '#', '4' };
        boolean boolean28 = characterReader23.matchesAny(charArray27);
        char[] charArray32 = new char[] { 'a', 'a', 'a' };
        boolean boolean33 = characterReader23.matchesAny(charArray32);
        java.lang.String str34 = characterReader23.toString();
        org.jsoup.parser.CharacterReader characterReader36 = new org.jsoup.parser.CharacterReader("");
        char[] charArray40 = new char[] { ' ', '#', '4' };
        boolean boolean41 = characterReader36.matchesAny(charArray40);
        boolean boolean42 = characterReader23.matchesAny(charArray40);
        java.lang.String str43 = characterReader1.consumeToAny(charArray40);
        boolean boolean45 = characterReader1.matches("");
        boolean boolean47 = characterReader1.matches("hi!");
        java.lang.String str49 = characterReader1.consumeTo("i!");
        java.lang.String str51 = characterReader1.consumeTo('\uffff');
        boolean boolean53 = characterReader1.matches('!');
        boolean boolean54 = characterReader1.isEmpty();
        java.lang.String str55 = characterReader1.consumeDigitSequence();
        java.lang.Class<?> wildcardClass56 = characterReader1.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matchesIgnoreCase("hi");
        java.lang.String str4 = characterReader1.consumeHexSequence();
        characterReader1.mark();
        java.lang.String str7 = characterReader1.consumeTo("hi!");
        boolean boolean8 = characterReader1.matchesDigit();
        boolean boolean10 = characterReader1.matchConsume("i!");
        char char11 = characterReader1.current();
        characterReader1.rewindToMark();
        boolean boolean14 = characterReader1.matches(' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\uffff' + "'", char11 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        boolean boolean4 = characterReader1.matchConsume("");
        java.lang.String str5 = characterReader1.consumeToEnd();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi" + "'", str2, "hi");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!" + "'", str5, "!");
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        java.lang.String str12 = characterReader1.consumeDigitSequence();
        boolean boolean14 = characterReader1.matches("hi!");
        java.lang.String str15 = characterReader1.consumeLetterThenDigitSequence();
        characterReader1.rewindToMark();
        boolean boolean18 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean20 = characterReader1.matchesIgnoreCase("i");
        boolean boolean21 = characterReader1.matchesLetter();
        boolean boolean23 = characterReader1.matches("!");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        java.lang.String str12 = characterReader1.consumeDigitSequence();
        characterReader1.mark();
        org.jsoup.parser.CharacterReader characterReader15 = new org.jsoup.parser.CharacterReader("");
        char[] charArray19 = new char[] { ' ', '#', '4' };
        boolean boolean20 = characterReader15.matchesAny(charArray19);
        char[] charArray24 = new char[] { 'a', 'a', 'a' };
        boolean boolean25 = characterReader15.matchesAny(charArray24);
        java.lang.String str26 = characterReader1.consumeToAny(charArray24);
        characterReader1.rewindToMark();
        java.lang.String str29 = characterReader1.consumeTo("hi");
        boolean boolean30 = characterReader1.matchesLetter();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        java.lang.String str12 = characterReader1.consumeDigitSequence();
        characterReader1.mark();
        boolean boolean15 = characterReader1.matches("hi!");
        int int17 = characterReader1.nextIndexOf('4');
        int int19 = characterReader1.nextIndexOf('4');
        java.lang.String str20 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str21 = characterReader1.consumeLetterSequence();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        char[] charArray12 = new char[] { ' ', '#', '4' };
        boolean boolean13 = characterReader8.matchesAny(charArray12);
        boolean boolean14 = characterReader1.matchesAny(charArray12);
        boolean boolean15 = characterReader1.isEmpty();
        boolean boolean17 = characterReader1.matchConsumeIgnoreCase("hi");
        java.lang.String str18 = characterReader1.consumeDigitSequence();
        java.lang.String str19 = characterReader1.consumeDigitSequence();
        boolean boolean20 = characterReader1.matchesLetter();
        boolean boolean22 = characterReader1.containsIgnoreCase("h");
        boolean boolean23 = characterReader1.matchesDigit();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        java.lang.String str12 = characterReader1.toString();
        characterReader1.unconsume();
        characterReader1.advance();
        java.lang.String str15 = characterReader1.consumeHexSequence();
        boolean boolean17 = characterReader1.matchConsumeIgnoreCase("hi!");
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("");
        boolean boolean21 = characterReader19.matchesIgnoreCase("hi");
        java.lang.String str22 = characterReader19.consumeHexSequence();
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("");
        char[] charArray28 = new char[] { ' ', '#', '4' };
        boolean boolean29 = characterReader24.matchesAny(charArray28);
        char[] charArray33 = new char[] { 'a', 'a', 'a' };
        boolean boolean34 = characterReader24.matchesAny(charArray33);
        java.lang.String str35 = characterReader19.consumeToAny(charArray33);
        boolean boolean36 = characterReader1.matchesAny(charArray33);
        java.lang.String str37 = characterReader1.consumeHexSequence();
        int int38 = characterReader1.pos();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matchConsume("");
        boolean boolean5 = characterReader1.matches('4');
        java.lang.String str6 = characterReader1.toString();
        java.lang.String str7 = characterReader1.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        char[] charArray13 = new char[] { ' ', '#', '4' };
        boolean boolean14 = characterReader9.matchesAny(charArray13);
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        char[] charArray20 = new char[] { ' ', '#', '4' };
        boolean boolean21 = characterReader16.matchesAny(charArray20);
        boolean boolean22 = characterReader9.matchesAny(charArray20);
        boolean boolean23 = characterReader9.isEmpty();
        java.lang.String str24 = characterReader9.consumeHexSequence();
        int int25 = characterReader9.pos();
        boolean boolean27 = characterReader9.matchConsumeIgnoreCase("hi");
        java.lang.String str28 = characterReader9.consumeLetterSequence();
        boolean boolean29 = characterReader9.matchesLetter();
        int int31 = characterReader9.nextIndexOf((java.lang.CharSequence) "h");
        java.lang.String str32 = characterReader9.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader34 = new org.jsoup.parser.CharacterReader("");
        char[] charArray38 = new char[] { ' ', '#', '4' };
        boolean boolean39 = characterReader34.matchesAny(charArray38);
        java.lang.String str41 = characterReader34.consumeTo(' ');
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("");
        char[] charArray47 = new char[] { ' ', '#', '4' };
        boolean boolean48 = characterReader43.matchesAny(charArray47);
        boolean boolean49 = characterReader34.matchesAny(charArray47);
        boolean boolean50 = characterReader9.matchesAny(charArray47);
        boolean boolean51 = characterReader1.matchesAny(charArray47);
        java.lang.String str53 = characterReader1.consumeTo('i');
        int int55 = characterReader1.nextIndexOf((java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        java.lang.String str12 = characterReader1.consumeDigitSequence();
        boolean boolean14 = characterReader1.matches("hi!");
        characterReader1.unconsume();
        boolean boolean17 = characterReader1.matchesIgnoreCase("");
        characterReader1.rewindToMark();
        boolean boolean20 = characterReader1.matches("hi");
        boolean boolean21 = characterReader1.matchesDigit();
        java.lang.String str22 = characterReader1.consumeLetterSequence();
        java.lang.String str23 = characterReader1.consumeToEnd();
        characterReader1.advance();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matchesIgnoreCase("hi");
        java.lang.String str4 = characterReader1.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader6 = new org.jsoup.parser.CharacterReader("");
        char[] charArray10 = new char[] { ' ', '#', '4' };
        boolean boolean11 = characterReader6.matchesAny(charArray10);
        characterReader6.rewindToMark();
        java.lang.String str14 = characterReader6.consumeTo("hi");
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        char[] charArray20 = new char[] { ' ', '#', '4' };
        boolean boolean21 = characterReader16.matchesAny(charArray20);
        char[] charArray25 = new char[] { 'a', 'a', 'a' };
        boolean boolean26 = characterReader16.matchesAny(charArray25);
        java.lang.String str27 = characterReader6.consumeToAny(charArray25);
        java.lang.String str28 = characterReader1.consumeToAny(charArray25);
        java.lang.String str29 = characterReader1.consumeToEnd();
        int int31 = characterReader1.nextIndexOf('4');
        java.lang.String str32 = characterReader1.consumeDigitSequence();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean2 = characterReader1.matchesDigit();
        boolean boolean3 = characterReader1.isEmpty();
        java.lang.String str4 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str5 = characterReader1.consumeToEnd();
        characterReader1.advance();
        characterReader1.mark();
        char char8 = characterReader1.current();
        char char9 = characterReader1.consume();
        org.jsoup.parser.CharacterReader characterReader11 = new org.jsoup.parser.CharacterReader("");
        boolean boolean12 = characterReader11.matchesDigit();
        boolean boolean13 = characterReader11.isEmpty();
        java.lang.String str14 = characterReader11.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        char[] charArray20 = new char[] { ' ', '#', '4' };
        boolean boolean21 = characterReader16.matchesAny(charArray20);
        char[] charArray25 = new char[] { 'a', 'a', 'a' };
        boolean boolean26 = characterReader16.matchesAny(charArray25);
        java.lang.String str27 = characterReader16.consumeDigitSequence();
        java.lang.String str28 = characterReader16.toString();
        boolean boolean29 = characterReader16.matchesDigit();
        java.lang.String str30 = characterReader16.consumeDigitSequence();
        java.lang.String str31 = characterReader16.consumeHexSequence();
        org.jsoup.parser.CharacterReader characterReader33 = new org.jsoup.parser.CharacterReader("");
        boolean boolean35 = characterReader33.matchConsume("");
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("");
        char[] charArray41 = new char[] { ' ', '#', '4' };
        boolean boolean42 = characterReader37.matchesAny(charArray41);
        char[] charArray46 = new char[] { 'a', 'a', 'a' };
        boolean boolean47 = characterReader37.matchesAny(charArray46);
        java.lang.String str48 = characterReader37.consumeDigitSequence();
        characterReader37.mark();
        org.jsoup.parser.CharacterReader characterReader51 = new org.jsoup.parser.CharacterReader("");
        char[] charArray55 = new char[] { ' ', '#', '4' };
        boolean boolean56 = characterReader51.matchesAny(charArray55);
        char[] charArray60 = new char[] { 'a', 'a', 'a' };
        boolean boolean61 = characterReader51.matchesAny(charArray60);
        java.lang.String str62 = characterReader37.consumeToAny(charArray60);
        java.lang.String str63 = characterReader33.consumeToAny(charArray60);
        java.lang.String str64 = characterReader16.consumeToAny(charArray60);
        java.lang.String str65 = characterReader11.consumeToAny(charArray60);
        boolean boolean66 = characterReader1.matchesAny(charArray60);
        boolean boolean67 = characterReader1.matchesDigit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertArrayEquals(charArray60, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        char[] charArray12 = new char[] { ' ', '#', '4' };
        boolean boolean13 = characterReader8.matchesAny(charArray12);
        boolean boolean14 = characterReader1.matchesAny(charArray12);
        java.lang.String str15 = characterReader1.consumeDigitSequence();
        java.lang.String str16 = characterReader1.toString();
        java.lang.String str17 = characterReader1.consumeToEnd();
        java.lang.String str19 = characterReader1.consumeTo("i");
        java.lang.String str21 = characterReader1.consumeTo("hi!");
        boolean boolean23 = characterReader1.matchConsumeIgnoreCase("hi");
        characterReader1.advance();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        java.lang.String str8 = characterReader1.consumeTo(' ');
        boolean boolean9 = characterReader1.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader11 = new org.jsoup.parser.CharacterReader("");
        char[] charArray15 = new char[] { ' ', '#', '4' };
        boolean boolean16 = characterReader11.matchesAny(charArray15);
        org.jsoup.parser.CharacterReader characterReader18 = new org.jsoup.parser.CharacterReader("");
        char[] charArray22 = new char[] { ' ', '#', '4' };
        boolean boolean23 = characterReader18.matchesAny(charArray22);
        boolean boolean24 = characterReader11.matchesAny(charArray22);
        boolean boolean25 = characterReader1.matchesAny(charArray22);
        java.lang.String str26 = characterReader1.consumeLetterSequence();
        boolean boolean28 = characterReader1.matchConsume("");
        int int29 = characterReader1.pos();
        characterReader1.advance();
        characterReader1.unconsume();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        java.lang.String str12 = characterReader1.toString();
        characterReader1.unconsume();
        characterReader1.advance();
        int int15 = characterReader1.pos();
        boolean boolean16 = characterReader1.isEmpty();
        boolean boolean18 = characterReader1.matchConsume("hi!");
        boolean boolean20 = characterReader1.matches("");
        java.lang.String str21 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean22 = characterReader1.matchesLetter();
        java.lang.String str23 = characterReader1.consumeDigitSequence();
        int int25 = characterReader1.nextIndexOf((java.lang.CharSequence) "h");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matchesIgnoreCase("hi");
        java.lang.String str4 = characterReader1.consumeLetterSequence();
        int int6 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        boolean boolean7 = characterReader1.matchesLetter();
        java.lang.String str8 = characterReader1.consumeToEnd();
        java.lang.String str9 = characterReader1.consumeHexSequence();
        boolean boolean11 = characterReader1.matches('4');
        boolean boolean13 = characterReader1.containsIgnoreCase("i!");
        boolean boolean14 = characterReader1.matchesLetter();
        boolean boolean16 = characterReader1.matches("!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        int int3 = characterReader1.pos();
        java.lang.String str4 = characterReader1.consumeAsString();
        boolean boolean6 = characterReader1.containsIgnoreCase("!");
        java.lang.String str8 = characterReader1.consumeTo('a');
        boolean boolean10 = characterReader1.matchConsume("!");
        java.lang.String str11 = characterReader1.consumeToEnd();
        boolean boolean13 = characterReader1.matchConsume("i");
        java.lang.String str15 = characterReader1.consumeTo("hi");
        boolean boolean17 = characterReader1.containsIgnoreCase("hi");
        java.lang.String str19 = characterReader1.consumeTo('!');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi" + "'", str2, "hi");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!" + "'", str4, "!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        java.lang.String str12 = characterReader1.consumeDigitSequence();
        java.lang.String str14 = characterReader1.consumeTo('4');
        int int16 = characterReader1.nextIndexOf('4');
        boolean boolean18 = characterReader1.matches('h');
        java.lang.String str19 = characterReader1.toString();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        java.lang.String str12 = characterReader1.toString();
        characterReader1.unconsume();
        characterReader1.advance();
        int int15 = characterReader1.pos();
        boolean boolean16 = characterReader1.isEmpty();
        boolean boolean18 = characterReader1.matchConsume("hi!");
        boolean boolean20 = characterReader1.matches("");
        java.lang.String str21 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str22 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean24 = characterReader1.matches("");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        char[] charArray17 = new char[] { ' ', '#', '4' };
        boolean boolean18 = characterReader13.matchesAny(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        boolean boolean21 = characterReader1.containsIgnoreCase("hi");
        java.lang.String str22 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str23 = characterReader1.consumeToEnd();
        java.lang.String str24 = characterReader1.consumeLetterSequence();
        char char25 = characterReader1.current();
        int int27 = characterReader1.nextIndexOf('#');
        characterReader1.advance();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\uffff' + "'", char25 == '\uffff');
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        char[] charArray12 = new char[] { ' ', '#', '4' };
        boolean boolean13 = characterReader8.matchesAny(charArray12);
        boolean boolean14 = characterReader1.matchesAny(charArray12);
        java.lang.String str15 = characterReader1.consumeDigitSequence();
        java.lang.String str16 = characterReader1.toString();
        java.lang.String str17 = characterReader1.consumeToEnd();
        java.lang.String str18 = characterReader1.consumeHexSequence();
        java.lang.Class<?> wildcardClass19 = characterReader1.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        java.lang.String str12 = characterReader1.consumeDigitSequence();
        boolean boolean14 = characterReader1.matches("hi!");
        boolean boolean16 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str18 = characterReader1.consumeTo('a');
        characterReader1.rewindToMark();
        char char20 = characterReader1.consume();
        boolean boolean21 = characterReader1.matchesDigit();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\uffff' + "'", char20 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        java.lang.String str12 = characterReader1.toString();
        characterReader1.unconsume();
        characterReader1.advance();
        int int15 = characterReader1.pos();
        boolean boolean17 = characterReader1.matches('#');
        boolean boolean19 = characterReader1.matches('\uffff');
        boolean boolean20 = characterReader1.matchesLetter();
        boolean boolean22 = characterReader1.matchesIgnoreCase("i!");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        java.lang.String str12 = characterReader1.consumeDigitSequence();
        boolean boolean14 = characterReader1.matches("hi!");
        java.lang.String str15 = characterReader1.consumeLetterThenDigitSequence();
        characterReader1.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader18 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean20 = characterReader18.matchConsumeIgnoreCase("hi!");
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("");
        char[] charArray26 = new char[] { ' ', '#', '4' };
        boolean boolean27 = characterReader22.matchesAny(charArray26);
        char[] charArray31 = new char[] { 'a', 'a', 'a' };
        boolean boolean32 = characterReader22.matchesAny(charArray31);
        java.lang.String str33 = characterReader22.toString();
        org.jsoup.parser.CharacterReader characterReader35 = new org.jsoup.parser.CharacterReader("");
        char[] charArray39 = new char[] { ' ', '#', '4' };
        boolean boolean40 = characterReader35.matchesAny(charArray39);
        boolean boolean41 = characterReader22.matchesAny(charArray39);
        java.lang.String str42 = characterReader18.consumeToAny(charArray39);
        java.lang.String str43 = characterReader1.consumeToAny(charArray39);
        char char44 = characterReader1.consume();
        int int45 = characterReader1.pos();
        characterReader1.rewindToMark();
        boolean boolean48 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean50 = characterReader1.matchConsumeIgnoreCase("hi!");
        characterReader1.mark();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + char44 + "' != '" + '\uffff' + "'", char44 == '\uffff');
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        characterReader1.rewindToMark();
        java.lang.Class<?> wildcardClass13 = characterReader1.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        char[] charArray12 = new char[] { ' ', '#', '4' };
        boolean boolean13 = characterReader8.matchesAny(charArray12);
        boolean boolean14 = characterReader1.matchesAny(charArray12);
        boolean boolean15 = characterReader1.isEmpty();
        java.lang.String str16 = characterReader1.consumeHexSequence();
        int int17 = characterReader1.pos();
        boolean boolean18 = characterReader1.matchesDigit();
        boolean boolean20 = characterReader1.matches("hi");
        boolean boolean22 = characterReader1.matches("h");
        int int23 = characterReader1.pos();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        char[] charArray12 = new char[] { ' ', '#', '4' };
        boolean boolean13 = characterReader8.matchesAny(charArray12);
        boolean boolean14 = characterReader1.matchesAny(charArray12);
        boolean boolean15 = characterReader1.isEmpty();
        java.lang.String str16 = characterReader1.consumeHexSequence();
        char char17 = characterReader1.current();
        boolean boolean18 = characterReader1.matchesDigit();
        java.lang.String str19 = characterReader1.consumeToEnd();
        boolean boolean21 = characterReader1.matchConsumeIgnoreCase("h");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\uffff' + "'", char17 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean3 = characterReader1.matchConsumeIgnoreCase("hi!");
        characterReader1.rewindToMark();
        int int6 = characterReader1.nextIndexOf('#');
        int int7 = characterReader1.pos();
        characterReader1.mark();
        java.lang.String str9 = characterReader1.consumeLetterSequence();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi" + "'", str9, "hi");
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean3 = characterReader1.containsIgnoreCase("hi!");
        int int5 = characterReader1.nextIndexOf('#');
        boolean boolean6 = characterReader1.isEmpty();
        char char7 = characterReader1.consume();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'h' + "'", char7 == 'h');
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        int int13 = characterReader1.nextIndexOf('#');
        org.jsoup.parser.CharacterReader characterReader15 = new org.jsoup.parser.CharacterReader("");
        char[] charArray19 = new char[] { ' ', '#', '4' };
        boolean boolean20 = characterReader15.matchesAny(charArray19);
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("");
        char[] charArray26 = new char[] { ' ', '#', '4' };
        boolean boolean27 = characterReader22.matchesAny(charArray26);
        boolean boolean28 = characterReader15.matchesAny(charArray26);
        boolean boolean29 = characterReader15.isEmpty();
        java.lang.String str30 = characterReader15.consumeHexSequence();
        int int31 = characterReader15.pos();
        boolean boolean32 = characterReader15.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader34 = new org.jsoup.parser.CharacterReader("");
        char[] charArray38 = new char[] { ' ', '#', '4' };
        boolean boolean39 = characterReader34.matchesAny(charArray38);
        char[] charArray43 = new char[] { 'a', 'a', 'a' };
        boolean boolean44 = characterReader34.matchesAny(charArray43);
        java.lang.String str45 = characterReader34.toString();
        characterReader34.unconsume();
        characterReader34.advance();
        int int48 = characterReader34.pos();
        org.jsoup.parser.CharacterReader characterReader50 = new org.jsoup.parser.CharacterReader("");
        char[] charArray54 = new char[] { ' ', '#', '4' };
        boolean boolean55 = characterReader50.matchesAny(charArray54);
        char[] charArray59 = new char[] { 'a', 'a', 'a' };
        boolean boolean60 = characterReader50.matchesAny(charArray59);
        java.lang.String str61 = characterReader50.toString();
        org.jsoup.parser.CharacterReader characterReader63 = new org.jsoup.parser.CharacterReader("");
        char[] charArray67 = new char[] { ' ', '#', '4' };
        boolean boolean68 = characterReader63.matchesAny(charArray67);
        boolean boolean69 = characterReader50.matchesAny(charArray67);
        boolean boolean70 = characterReader34.matchesAny(charArray67);
        java.lang.String str71 = characterReader15.consumeToAny(charArray67);
        boolean boolean72 = characterReader1.matchesAny(charArray67);
        java.lang.String str74 = characterReader1.consumeTo('h');
        boolean boolean75 = characterReader1.isEmpty();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertArrayEquals(charArray67, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        char[] charArray17 = new char[] { ' ', '#', '4' };
        boolean boolean18 = characterReader13.matchesAny(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        java.lang.String str21 = characterReader1.consumeTo(' ');
        characterReader1.rewindToMark();
        java.lang.String str24 = characterReader1.consumeTo("hi");
        boolean boolean26 = characterReader1.matchesIgnoreCase("i");
        java.lang.String str27 = characterReader1.consumeDigitSequence();
        java.lang.String str28 = characterReader1.consumeToEnd();
        int int30 = characterReader1.nextIndexOf((java.lang.CharSequence) "!");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        int int3 = characterReader1.pos();
        java.lang.String str5 = characterReader1.consumeTo(' ');
        java.lang.Class<?> wildcardClass6 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi" + "'", str2, "hi");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!" + "'", str5, "!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean2 = characterReader1.matchesDigit();
        boolean boolean3 = characterReader1.matchesDigit();
        int int5 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        java.lang.String str7 = characterReader1.consumeTo('a');
        boolean boolean8 = characterReader1.matchesLetter();
        characterReader1.unconsume();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean2 = characterReader1.matchesDigit();
        boolean boolean3 = characterReader1.isEmpty();
        java.lang.String str4 = characterReader1.consumeLetterThenDigitSequence();
        int int5 = characterReader1.pos();
        boolean boolean7 = characterReader1.matches("");
        int int9 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        int int11 = characterReader1.nextIndexOf((java.lang.CharSequence) "!");
        java.lang.String str12 = characterReader1.consumeToEnd();
        int int14 = characterReader1.nextIndexOf('a');
        java.lang.String str15 = characterReader1.consumeLetterSequence();
        boolean boolean16 = characterReader1.matchesLetter();
        boolean boolean18 = characterReader1.containsIgnoreCase("hi!");
        char char19 = characterReader1.current();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\uffff' + "'", char19 == '\uffff');
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        java.lang.String str12 = characterReader1.consumeDigitSequence();
        java.lang.String str13 = characterReader1.toString();
        boolean boolean14 = characterReader1.isEmpty();
        boolean boolean15 = characterReader1.isEmpty();
        java.lang.String str16 = characterReader1.toString();
        boolean boolean18 = characterReader1.matches("hi!");
        java.lang.String str19 = characterReader1.consumeDigitSequence();
        int int20 = characterReader1.pos();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        char[] charArray17 = new char[] { ' ', '#', '4' };
        boolean boolean18 = characterReader13.matchesAny(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        java.lang.String str21 = characterReader1.consumeTo(' ');
        java.lang.String str22 = characterReader1.consumeLetterSequence();
        boolean boolean24 = characterReader1.matches('a');
        java.lang.String str25 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str26 = characterReader1.consumeLetterSequence();
        int int28 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        char char29 = characterReader1.consume();
        char char30 = characterReader1.current();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\uffff' + "'", char29 == '\uffff');
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '\uffff' + "'", char30 == '\uffff');
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.containsIgnoreCase("hi");
        boolean boolean5 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean7 = characterReader1.matches("i!");
        int int8 = characterReader1.pos();
        java.lang.String str9 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str10 = characterReader1.consumeLetterSequence();
        char char11 = characterReader1.consume();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\uffff' + "'", char11 == '\uffff');
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matchesIgnoreCase("hi");
        java.lang.String str4 = characterReader1.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader6 = new org.jsoup.parser.CharacterReader("");
        char[] charArray10 = new char[] { ' ', '#', '4' };
        boolean boolean11 = characterReader6.matchesAny(charArray10);
        characterReader6.rewindToMark();
        java.lang.String str14 = characterReader6.consumeTo("hi");
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        char[] charArray20 = new char[] { ' ', '#', '4' };
        boolean boolean21 = characterReader16.matchesAny(charArray20);
        char[] charArray25 = new char[] { 'a', 'a', 'a' };
        boolean boolean26 = characterReader16.matchesAny(charArray25);
        java.lang.String str27 = characterReader6.consumeToAny(charArray25);
        java.lang.String str28 = characterReader1.consumeToAny(charArray25);
        java.lang.String str29 = characterReader1.consumeHexSequence();
        java.lang.String str31 = characterReader1.consumeTo("hi");
        characterReader1.unconsume();
        characterReader1.unconsume();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matchConsume("");
        char char4 = characterReader1.current();
        boolean boolean6 = characterReader1.matchConsume("hi!");
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        char[] charArray12 = new char[] { ' ', '#', '4' };
        boolean boolean13 = characterReader8.matchesAny(charArray12);
        char[] charArray17 = new char[] { 'a', 'a', 'a' };
        boolean boolean18 = characterReader8.matchesAny(charArray17);
        java.lang.String str19 = characterReader8.consumeDigitSequence();
        characterReader8.mark();
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("");
        char[] charArray26 = new char[] { ' ', '#', '4' };
        boolean boolean27 = characterReader22.matchesAny(charArray26);
        char[] charArray31 = new char[] { 'a', 'a', 'a' };
        boolean boolean32 = characterReader22.matchesAny(charArray31);
        java.lang.String str33 = characterReader8.consumeToAny(charArray31);
        boolean boolean34 = characterReader1.matchesAny(charArray31);
        int int36 = characterReader1.nextIndexOf('#');
        boolean boolean37 = characterReader1.isEmpty();
        boolean boolean38 = characterReader1.isEmpty();
        java.lang.String str40 = characterReader1.consumeTo('4');
        java.lang.String str41 = characterReader1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\uffff' + "'", char4 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.advance();
        boolean boolean5 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str7 = characterReader1.consumeTo("hi!");
        boolean boolean9 = characterReader1.matches("hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi" + "'", str2, "hi");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        java.lang.String str12 = characterReader1.consumeDigitSequence();
        boolean boolean13 = characterReader1.matchesLetter();
        char char14 = characterReader1.current();
        boolean boolean16 = characterReader1.matchConsumeIgnoreCase("hi");
        boolean boolean17 = characterReader1.matchesLetter();
        java.lang.String str19 = characterReader1.consumeTo("h");
        boolean boolean20 = characterReader1.matchesDigit();
        int int21 = characterReader1.pos();
        characterReader1.unconsume();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\uffff' + "'", char14 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        char[] charArray17 = new char[] { ' ', '#', '4' };
        boolean boolean18 = characterReader13.matchesAny(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        java.lang.String str21 = characterReader1.consumeTo(' ');
        java.lang.String str22 = characterReader1.consumeLetterSequence();
        java.lang.String str23 = characterReader1.consumeDigitSequence();
        java.lang.String str24 = characterReader1.consumeToEnd();
        boolean boolean26 = characterReader1.containsIgnoreCase("hi");
        boolean boolean28 = characterReader1.containsIgnoreCase("i!");
        char char29 = characterReader1.current();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\uffff' + "'", char29 == '\uffff');
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        char[] charArray17 = new char[] { ' ', '#', '4' };
        boolean boolean18 = characterReader13.matchesAny(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        java.lang.String str21 = characterReader1.consumeTo(' ');
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        char[] charArray27 = new char[] { ' ', '#', '4' };
        boolean boolean28 = characterReader23.matchesAny(charArray27);
        char[] charArray32 = new char[] { 'a', 'a', 'a' };
        boolean boolean33 = characterReader23.matchesAny(charArray32);
        java.lang.String str34 = characterReader23.toString();
        org.jsoup.parser.CharacterReader characterReader36 = new org.jsoup.parser.CharacterReader("");
        char[] charArray40 = new char[] { ' ', '#', '4' };
        boolean boolean41 = characterReader36.matchesAny(charArray40);
        boolean boolean42 = characterReader23.matchesAny(charArray40);
        java.lang.String str43 = characterReader1.consumeToAny(charArray40);
        java.lang.String str44 = characterReader1.consumeToEnd();
        org.jsoup.parser.CharacterReader characterReader46 = new org.jsoup.parser.CharacterReader("");
        char[] charArray50 = new char[] { ' ', '#', '4' };
        boolean boolean51 = characterReader46.matchesAny(charArray50);
        characterReader46.rewindToMark();
        java.lang.String str54 = characterReader46.consumeTo("hi");
        org.jsoup.parser.CharacterReader characterReader56 = new org.jsoup.parser.CharacterReader("");
        char[] charArray60 = new char[] { ' ', '#', '4' };
        boolean boolean61 = characterReader56.matchesAny(charArray60);
        char[] charArray65 = new char[] { 'a', 'a', 'a' };
        boolean boolean66 = characterReader56.matchesAny(charArray65);
        java.lang.String str67 = characterReader46.consumeToAny(charArray65);
        java.lang.String str68 = characterReader1.consumeToAny(charArray65);
        java.lang.String str69 = characterReader1.consumeHexSequence();
        boolean boolean71 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean73 = characterReader1.matchConsume("i!");
        java.lang.String str74 = characterReader1.toString();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertArrayEquals(charArray60, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertArrayEquals(charArray65, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        characterReader1.rewindToMark();
        java.lang.String str9 = characterReader1.consumeTo("hi");
        boolean boolean11 = characterReader1.containsIgnoreCase("hi!");
        int int13 = characterReader1.nextIndexOf('4');
        java.lang.String str14 = characterReader1.consumeLetterSequence();
        boolean boolean15 = characterReader1.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("");
        char[] charArray21 = new char[] { ' ', '#', '4' };
        boolean boolean22 = characterReader17.matchesAny(charArray21);
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("");
        char[] charArray28 = new char[] { ' ', '#', '4' };
        boolean boolean29 = characterReader24.matchesAny(charArray28);
        boolean boolean30 = characterReader17.matchesAny(charArray28);
        boolean boolean31 = characterReader17.isEmpty();
        boolean boolean33 = characterReader17.matches("");
        java.lang.String str34 = characterReader17.consumeHexSequence();
        int int35 = characterReader17.pos();
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("");
        char[] charArray41 = new char[] { ' ', '#', '4' };
        boolean boolean42 = characterReader37.matchesAny(charArray41);
        char[] charArray46 = new char[] { 'a', 'a', 'a' };
        boolean boolean47 = characterReader37.matchesAny(charArray46);
        java.lang.String str48 = characterReader37.consumeDigitSequence();
        characterReader37.mark();
        org.jsoup.parser.CharacterReader characterReader51 = new org.jsoup.parser.CharacterReader("");
        char[] charArray55 = new char[] { ' ', '#', '4' };
        boolean boolean56 = characterReader51.matchesAny(charArray55);
        char[] charArray60 = new char[] { 'a', 'a', 'a' };
        boolean boolean61 = characterReader51.matchesAny(charArray60);
        java.lang.String str62 = characterReader37.consumeToAny(charArray60);
        java.lang.String str63 = characterReader17.consumeToAny(charArray60);
        java.lang.String str64 = characterReader1.consumeToAny(charArray60);
        java.lang.String str66 = characterReader1.consumeTo("hi!");
        boolean boolean67 = characterReader1.matchesLetter();
        characterReader1.mark();
        boolean boolean70 = characterReader1.matchConsume("hi!");
        characterReader1.rewindToMark();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertArrayEquals(charArray60, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        java.lang.String str12 = characterReader1.toString();
        java.lang.String str14 = characterReader1.consumeTo("hi!");
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        boolean boolean18 = characterReader16.matchConsume("");
        char char19 = characterReader16.current();
        java.lang.String str20 = characterReader16.consumeToEnd();
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("");
        boolean boolean24 = characterReader22.matchConsume("");
        char char25 = characterReader22.current();
        boolean boolean27 = characterReader22.matchConsume("hi!");
        org.jsoup.parser.CharacterReader characterReader29 = new org.jsoup.parser.CharacterReader("");
        char[] charArray33 = new char[] { ' ', '#', '4' };
        boolean boolean34 = characterReader29.matchesAny(charArray33);
        char[] charArray38 = new char[] { 'a', 'a', 'a' };
        boolean boolean39 = characterReader29.matchesAny(charArray38);
        java.lang.String str40 = characterReader29.consumeDigitSequence();
        characterReader29.mark();
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("");
        char[] charArray47 = new char[] { ' ', '#', '4' };
        boolean boolean48 = characterReader43.matchesAny(charArray47);
        char[] charArray52 = new char[] { 'a', 'a', 'a' };
        boolean boolean53 = characterReader43.matchesAny(charArray52);
        java.lang.String str54 = characterReader29.consumeToAny(charArray52);
        boolean boolean55 = characterReader22.matchesAny(charArray52);
        java.lang.String str56 = characterReader16.consumeToAny(charArray52);
        boolean boolean57 = characterReader1.matchesAny(charArray52);
        java.lang.String str58 = characterReader1.consumeLetterThenDigitSequence();
        characterReader1.rewindToMark();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\uffff' + "'", char19 == '\uffff');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\uffff' + "'", char25 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        java.lang.String str12 = characterReader1.consumeDigitSequence();
        boolean boolean14 = characterReader1.matches("hi!");
        characterReader1.unconsume();
        boolean boolean17 = characterReader1.matchesIgnoreCase("hi!");
        characterReader1.rewindToMark();
        boolean boolean20 = characterReader1.matchConsumeIgnoreCase("i!");
        java.lang.String str21 = characterReader1.toString();
        boolean boolean22 = characterReader1.matchesLetter();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        characterReader1.rewindToMark();
        java.lang.String str9 = characterReader1.consumeTo("hi");
        boolean boolean11 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean13 = characterReader1.matchConsume("");
        characterReader1.rewindToMark();
        characterReader1.rewindToMark();
        int int17 = characterReader1.nextIndexOf((java.lang.CharSequence) "i!");
        java.lang.String str18 = characterReader1.toString();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matchConsume("");
        char char4 = characterReader1.current();
        java.lang.String str5 = characterReader1.consumeToEnd();
        char char6 = characterReader1.consume();
        char char7 = characterReader1.current();
        int int9 = characterReader1.nextIndexOf(' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\uffff' + "'", char4 == '\uffff');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\uffff' + "'", char6 == '\uffff');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        char[] charArray17 = new char[] { ' ', '#', '4' };
        boolean boolean18 = characterReader13.matchesAny(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        java.lang.String str21 = characterReader1.consumeTo(' ');
        java.lang.String str22 = characterReader1.consumeLetterSequence();
        java.lang.String str23 = characterReader1.consumeDigitSequence();
        java.lang.String str24 = characterReader1.consumeToEnd();
        boolean boolean26 = characterReader1.containsIgnoreCase("hi");
        characterReader1.mark();
        boolean boolean29 = characterReader1.matchConsume("h");
        java.lang.String str30 = characterReader1.toString();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        java.lang.String str12 = characterReader1.consumeDigitSequence();
        java.lang.String str13 = characterReader1.toString();
        boolean boolean14 = characterReader1.matchesDigit();
        int int16 = characterReader1.nextIndexOf('a');
        java.lang.String str17 = characterReader1.toString();
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("");
        char[] charArray23 = new char[] { ' ', '#', '4' };
        boolean boolean24 = characterReader19.matchesAny(charArray23);
        org.jsoup.parser.CharacterReader characterReader26 = new org.jsoup.parser.CharacterReader("");
        char[] charArray30 = new char[] { ' ', '#', '4' };
        boolean boolean31 = characterReader26.matchesAny(charArray30);
        boolean boolean32 = characterReader19.matchesAny(charArray30);
        boolean boolean33 = characterReader19.isEmpty();
        java.lang.String str34 = characterReader19.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader36 = new org.jsoup.parser.CharacterReader("");
        char[] charArray40 = new char[] { ' ', '#', '4' };
        boolean boolean41 = characterReader36.matchesAny(charArray40);
        java.lang.String str43 = characterReader36.consumeTo(' ');
        org.jsoup.parser.CharacterReader characterReader45 = new org.jsoup.parser.CharacterReader("");
        char[] charArray49 = new char[] { ' ', '#', '4' };
        boolean boolean50 = characterReader45.matchesAny(charArray49);
        boolean boolean51 = characterReader36.matchesAny(charArray49);
        java.lang.String str52 = characterReader19.consumeToAny(charArray49);
        java.lang.String str53 = characterReader1.consumeToAny(charArray49);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean2 = characterReader1.matchesDigit();
        boolean boolean3 = characterReader1.isEmpty();
        java.lang.String str4 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str5 = characterReader1.consumeToEnd();
        int int7 = characterReader1.nextIndexOf(' ');
        char char8 = characterReader1.current();
        boolean boolean10 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str11 = characterReader1.consumeDigitSequence();
        characterReader1.mark();
        characterReader1.rewindToMark();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        char[] charArray17 = new char[] { ' ', '#', '4' };
        boolean boolean18 = characterReader13.matchesAny(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        boolean boolean20 = characterReader1.isEmpty();
        char char21 = characterReader1.consume();
        boolean boolean23 = characterReader1.matchConsume("i");
        int int25 = characterReader1.nextIndexOf('i');
        characterReader1.advance();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\uffff' + "'", char21 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        java.lang.String str12 = characterReader1.toString();
        characterReader1.unconsume();
        characterReader1.advance();
        int int15 = characterReader1.pos();
        boolean boolean16 = characterReader1.isEmpty();
        boolean boolean18 = characterReader1.matchConsume("hi!");
        java.lang.String str19 = characterReader1.consumeDigitSequence();
        int int21 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        char[] charArray27 = new char[] { ' ', '#', '4' };
        boolean boolean28 = characterReader23.matchesAny(charArray27);
        java.lang.String str30 = characterReader23.consumeTo(' ');
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("");
        char[] charArray36 = new char[] { ' ', '#', '4' };
        boolean boolean37 = characterReader32.matchesAny(charArray36);
        boolean boolean38 = characterReader23.matchesAny(charArray36);
        boolean boolean39 = characterReader1.matchesAny(charArray36);
        int int40 = characterReader1.pos();
        boolean boolean42 = characterReader1.matchesIgnoreCase("h");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        java.lang.String str12 = characterReader1.consumeDigitSequence();
        java.lang.String str13 = characterReader1.consumeDigitSequence();
        boolean boolean14 = characterReader1.matchesLetter();
        java.lang.String str15 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str16 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean18 = characterReader1.matchConsume("hi!");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        java.lang.String str12 = characterReader1.toString();
        characterReader1.unconsume();
        characterReader1.advance();
        int int15 = characterReader1.pos();
        boolean boolean17 = characterReader1.matches('#');
        java.lang.String str18 = characterReader1.consumeHexSequence();
        boolean boolean20 = characterReader1.matchConsume("");
        java.lang.String str21 = characterReader1.consumeDigitSequence();
        java.lang.String str22 = characterReader1.consumeDigitSequence();
        boolean boolean23 = characterReader1.isEmpty();
        characterReader1.mark();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matchesIgnoreCase("hi");
        java.lang.String str4 = characterReader1.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader6 = new org.jsoup.parser.CharacterReader("");
        char[] charArray10 = new char[] { ' ', '#', '4' };
        boolean boolean11 = characterReader6.matchesAny(charArray10);
        characterReader6.rewindToMark();
        java.lang.String str14 = characterReader6.consumeTo("hi");
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        char[] charArray20 = new char[] { ' ', '#', '4' };
        boolean boolean21 = characterReader16.matchesAny(charArray20);
        char[] charArray25 = new char[] { 'a', 'a', 'a' };
        boolean boolean26 = characterReader16.matchesAny(charArray25);
        java.lang.String str27 = characterReader6.consumeToAny(charArray25);
        java.lang.String str28 = characterReader1.consumeToAny(charArray25);
        int int30 = characterReader1.nextIndexOf((java.lang.CharSequence) "i!");
        java.lang.String str31 = characterReader1.consumeHexSequence();
        int int33 = characterReader1.nextIndexOf((java.lang.CharSequence) "h");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 0, count 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        char[] charArray12 = new char[] { ' ', '#', '4' };
        boolean boolean13 = characterReader8.matchesAny(charArray12);
        boolean boolean14 = characterReader1.matchesAny(charArray12);
        boolean boolean15 = characterReader1.isEmpty();
        java.lang.String str16 = characterReader1.consumeHexSequence();
        int int17 = characterReader1.pos();
        boolean boolean18 = characterReader1.matchesDigit();
        boolean boolean19 = characterReader1.matchesDigit();
        characterReader1.mark();
        char char21 = characterReader1.consume();
        int int23 = characterReader1.nextIndexOf('a');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\uffff' + "'", char21 == '\uffff');
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        char[] charArray12 = new char[] { ' ', '#', '4' };
        boolean boolean13 = characterReader8.matchesAny(charArray12);
        boolean boolean14 = characterReader1.matchesAny(charArray12);
        boolean boolean15 = characterReader1.isEmpty();
        java.lang.String str17 = characterReader1.consumeTo('a');
        java.lang.String str18 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str19 = characterReader1.consumeToEnd();
        characterReader1.mark();
        characterReader1.mark();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        java.lang.String str12 = characterReader1.consumeDigitSequence();
        java.lang.String str13 = characterReader1.toString();
        boolean boolean14 = characterReader1.isEmpty();
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        char[] charArray20 = new char[] { ' ', '#', '4' };
        boolean boolean21 = characterReader16.matchesAny(charArray20);
        java.lang.String str23 = characterReader16.consumeTo(' ');
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("");
        char[] charArray29 = new char[] { ' ', '#', '4' };
        boolean boolean30 = characterReader25.matchesAny(charArray29);
        boolean boolean31 = characterReader16.matchesAny(charArray29);
        boolean boolean32 = characterReader1.matchesAny(charArray29);
        org.jsoup.parser.CharacterReader characterReader34 = new org.jsoup.parser.CharacterReader("");
        char[] charArray38 = new char[] { ' ', '#', '4' };
        boolean boolean39 = characterReader34.matchesAny(charArray38);
        char[] charArray43 = new char[] { 'a', 'a', 'a' };
        boolean boolean44 = characterReader34.matchesAny(charArray43);
        java.lang.String str45 = characterReader34.toString();
        org.jsoup.parser.CharacterReader characterReader47 = new org.jsoup.parser.CharacterReader("");
        boolean boolean49 = characterReader47.matchConsume("");
        char char50 = characterReader47.current();
        java.lang.String str51 = characterReader47.consumeToEnd();
        org.jsoup.parser.CharacterReader characterReader53 = new org.jsoup.parser.CharacterReader("");
        boolean boolean55 = characterReader53.matchConsume("");
        char char56 = characterReader53.current();
        boolean boolean58 = characterReader53.matchConsume("hi!");
        org.jsoup.parser.CharacterReader characterReader60 = new org.jsoup.parser.CharacterReader("");
        char[] charArray64 = new char[] { ' ', '#', '4' };
        boolean boolean65 = characterReader60.matchesAny(charArray64);
        char[] charArray69 = new char[] { 'a', 'a', 'a' };
        boolean boolean70 = characterReader60.matchesAny(charArray69);
        java.lang.String str71 = characterReader60.consumeDigitSequence();
        characterReader60.mark();
        org.jsoup.parser.CharacterReader characterReader74 = new org.jsoup.parser.CharacterReader("");
        char[] charArray78 = new char[] { ' ', '#', '4' };
        boolean boolean79 = characterReader74.matchesAny(charArray78);
        char[] charArray83 = new char[] { 'a', 'a', 'a' };
        boolean boolean84 = characterReader74.matchesAny(charArray83);
        java.lang.String str85 = characterReader60.consumeToAny(charArray83);
        boolean boolean86 = characterReader53.matchesAny(charArray83);
        java.lang.String str87 = characterReader47.consumeToAny(charArray83);
        java.lang.String str88 = characterReader34.consumeToAny(charArray83);
        java.lang.String str89 = characterReader1.consumeToAny(charArray83);
        boolean boolean91 = characterReader1.matches("!");
        java.lang.String str93 = characterReader1.consumeTo('#');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + char50 + "' != '" + '\uffff' + "'", char50 == '\uffff');
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + char56 + "' != '" + '\uffff' + "'", char56 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertArrayEquals(charArray64, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertArrayEquals(charArray69, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertArrayEquals(charArray78, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(charArray83);
        org.junit.Assert.assertArrayEquals(charArray83, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        boolean boolean8 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean9 = characterReader1.matchesDigit();
        boolean boolean10 = characterReader1.matchesLetter();
        java.lang.String str11 = characterReader1.consumeToEnd();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean2 = characterReader1.matchesDigit();
        boolean boolean3 = characterReader1.isEmpty();
        java.lang.String str4 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str5 = characterReader1.consumeToEnd();
        boolean boolean7 = characterReader1.matchesIgnoreCase("hi");
        boolean boolean9 = characterReader1.matchesIgnoreCase("hi");
        java.lang.String str11 = characterReader1.consumeTo('!');
        boolean boolean13 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str14 = characterReader1.consumeLetterThenDigitSequence();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        java.lang.String str12 = characterReader1.consumeDigitSequence();
        java.lang.String str13 = characterReader1.toString();
        boolean boolean14 = characterReader1.isEmpty();
        boolean boolean15 = characterReader1.isEmpty();
        java.lang.String str16 = characterReader1.toString();
        boolean boolean18 = characterReader1.matches("hi!");
        java.lang.String str19 = characterReader1.toString();
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("");
        char[] charArray25 = new char[] { ' ', '#', '4' };
        boolean boolean26 = characterReader21.matchesAny(charArray25);
        char[] charArray30 = new char[] { 'a', 'a', 'a' };
        boolean boolean31 = characterReader21.matchesAny(charArray30);
        java.lang.String str32 = characterReader21.toString();
        java.lang.String str34 = characterReader21.consumeTo("hi!");
        org.jsoup.parser.CharacterReader characterReader36 = new org.jsoup.parser.CharacterReader("");
        char[] charArray40 = new char[] { ' ', '#', '4' };
        boolean boolean41 = characterReader36.matchesAny(charArray40);
        java.lang.String str43 = characterReader36.consumeTo(' ');
        boolean boolean44 = characterReader36.matchesLetter();
        boolean boolean45 = characterReader36.isEmpty();
        org.jsoup.parser.CharacterReader characterReader47 = new org.jsoup.parser.CharacterReader("");
        boolean boolean49 = characterReader47.matchConsume("");
        org.jsoup.parser.CharacterReader characterReader51 = new org.jsoup.parser.CharacterReader("");
        char[] charArray55 = new char[] { ' ', '#', '4' };
        boolean boolean56 = characterReader51.matchesAny(charArray55);
        char[] charArray60 = new char[] { 'a', 'a', 'a' };
        boolean boolean61 = characterReader51.matchesAny(charArray60);
        java.lang.String str62 = characterReader51.consumeDigitSequence();
        characterReader51.mark();
        org.jsoup.parser.CharacterReader characterReader65 = new org.jsoup.parser.CharacterReader("");
        char[] charArray69 = new char[] { ' ', '#', '4' };
        boolean boolean70 = characterReader65.matchesAny(charArray69);
        char[] charArray74 = new char[] { 'a', 'a', 'a' };
        boolean boolean75 = characterReader65.matchesAny(charArray74);
        java.lang.String str76 = characterReader51.consumeToAny(charArray74);
        java.lang.String str77 = characterReader47.consumeToAny(charArray74);
        boolean boolean78 = characterReader36.matchesAny(charArray74);
        java.lang.String str79 = characterReader21.consumeToAny(charArray74);
        boolean boolean80 = characterReader1.matchesAny(charArray74);
        boolean boolean82 = characterReader1.matchConsumeIgnoreCase("hi");
        characterReader1.rewindToMark();
        java.lang.String str84 = characterReader1.consumeDigitSequence();
        java.lang.String str86 = characterReader1.consumeTo('\uffff');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertArrayEquals(charArray60, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertArrayEquals(charArray69, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(charArray74);
        org.junit.Assert.assertArrayEquals(charArray74, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        java.lang.String str12 = characterReader1.consumeDigitSequence();
        java.lang.String str13 = characterReader1.toString();
        boolean boolean14 = characterReader1.matchesDigit();
        java.lang.String str15 = characterReader1.consumeDigitSequence();
        java.lang.String str16 = characterReader1.consumeLetterSequence();
        int int18 = characterReader1.nextIndexOf('a');
        int int20 = characterReader1.nextIndexOf('\uffff');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matchesIgnoreCase("hi");
        java.lang.String str4 = characterReader1.consumeLetterSequence();
        java.lang.String str5 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean7 = characterReader1.matches("!");
        boolean boolean9 = characterReader1.containsIgnoreCase("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray5 = new char[] { ' ', '#', '4' };
        boolean boolean6 = characterReader1.matchesAny(charArray5);
        char[] charArray10 = new char[] { 'a', 'a', 'a' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        java.lang.String str12 = characterReader1.toString();
        characterReader1.unconsume();
        characterReader1.advance();
        int int15 = characterReader1.pos();
        boolean boolean16 = characterReader1.isEmpty();
        boolean boolean18 = characterReader1.matchConsume("hi!");
        boolean boolean20 = characterReader1.matches("");
        java.lang.String str21 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str22 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str23 = characterReader1.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("");
        char[] charArray29 = new char[] { ' ', '#', '4' };
        boolean boolean30 = characterReader25.matchesAny(charArray29);
        char[] charArray34 = new char[] { 'a', 'a', 'a' };
        boolean boolean35 = characterReader25.matchesAny(charArray34);
        java.lang.String str36 = characterReader25.toString();
        characterReader25.unconsume();
        characterReader25.advance();
        java.lang.String str39 = characterReader25.consumeHexSequence();
        boolean boolean41 = characterReader25.matchConsumeIgnoreCase("hi!");
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("");
        boolean boolean45 = characterReader43.matchesIgnoreCase("hi");
        java.lang.String str46 = characterReader43.consumeHexSequence();
        org.jsoup.parser.CharacterReader characterReader48 = new org.jsoup.parser.CharacterReader("");
        char[] charArray52 = new char[] { ' ', '#', '4' };
        boolean boolean53 = characterReader48.matchesAny(charArray52);
        char[] charArray57 = new char[] { 'a', 'a', 'a' };
        boolean boolean58 = characterReader48.matchesAny(charArray57);
        java.lang.String str59 = characterReader43.consumeToAny(charArray57);
        boolean boolean60 = characterReader25.matchesAny(charArray57);
        boolean boolean61 = characterReader1.matchesAny(charArray57);
        boolean boolean63 = characterReader1.matches("hi!");
        boolean boolean65 = characterReader1.containsIgnoreCase("h");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertArrayEquals(charArray57, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean2 = characterReader1.matchesDigit();
        boolean boolean3 = characterReader1.isEmpty();
        java.lang.String str4 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str5 = characterReader1.consumeToEnd();
        int int7 = characterReader1.nextIndexOf(' ');
        char char8 = characterReader1.current();
        char char9 = characterReader1.consume();
        int int11 = characterReader1.nextIndexOf('a');
        characterReader1.mark();
        characterReader1.mark();
        characterReader1.mark();
        boolean boolean16 = characterReader1.matchesIgnoreCase("i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matchConsume("");
        char char4 = characterReader1.current();
        boolean boolean6 = characterReader1.matchConsume("hi!");
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        char[] charArray12 = new char[] { ' ', '#', '4' };
        boolean boolean13 = characterReader8.matchesAny(charArray12);
        char[] charArray17 = new char[] { 'a', 'a', 'a' };
        boolean boolean18 = characterReader8.matchesAny(charArray17);
        java.lang.String str19 = characterReader8.consumeDigitSequence();
        characterReader8.mark();
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("");
        char[] charArray26 = new char[] { ' ', '#', '4' };
        boolean boolean27 = characterReader22.matchesAny(charArray26);
        char[] charArray31 = new char[] { 'a', 'a', 'a' };
        boolean boolean32 = characterReader22.matchesAny(charArray31);
        java.lang.String str33 = characterReader8.consumeToAny(charArray31);
        boolean boolean34 = characterReader1.matchesAny(charArray31);
        boolean boolean36 = characterReader1.containsIgnoreCase("!");
        org.jsoup.parser.CharacterReader characterReader38 = new org.jsoup.parser.CharacterReader("");
        char[] charArray42 = new char[] { ' ', '#', '4' };
        boolean boolean43 = characterReader38.matchesAny(charArray42);
        char[] charArray47 = new char[] { 'a', 'a', 'a' };
        boolean boolean48 = characterReader38.matchesAny(charArray47);
        java.lang.String str49 = characterReader38.consumeDigitSequence();
        boolean boolean51 = characterReader38.matches("hi!");
        java.lang.String str52 = characterReader38.consumeLetterThenDigitSequence();
        characterReader38.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader55 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean57 = characterReader55.matchConsumeIgnoreCase("hi!");
        org.jsoup.parser.CharacterReader characterReader59 = new org.jsoup.parser.CharacterReader("");
        char[] charArray63 = new char[] { ' ', '#', '4' };
        boolean boolean64 = characterReader59.matchesAny(charArray63);
        char[] charArray68 = new char[] { 'a', 'a', 'a' };
        boolean boolean69 = characterReader59.matchesAny(charArray68);
        java.lang.String str70 = characterReader59.toString();
        org.jsoup.parser.CharacterReader characterReader72 = new org.jsoup.parser.CharacterReader("");
        char[] charArray76 = new char[] { ' ', '#', '4' };
        boolean boolean77 = characterReader72.matchesAny(charArray76);
        boolean boolean78 = characterReader59.matchesAny(charArray76);
        java.lang.String str79 = characterReader55.consumeToAny(charArray76);
        java.lang.String str80 = characterReader38.consumeToAny(charArray76);
        java.lang.String str81 = characterReader1.consumeToAny(charArray76);
        boolean boolean83 = characterReader1.matchConsume("hi!");
        char char84 = characterReader1.consume();
        boolean boolean86 = characterReader1.matches("!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\uffff' + "'", char4 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertArrayEquals(charArray63, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(charArray76);
        org.junit.Assert.assertArrayEquals(charArray76, new char[] { ' ', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + char84 + "' != '" + '\uffff' + "'", char84 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }
}

