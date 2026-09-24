package org.jsoup.parser;

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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        char char0 = org.jsoup.parser.CharacterReader.EOF;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\uffff' + "'", char0 == '\uffff');
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = characterReader1.consumeTo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        java.lang.Class<?> wildcardClass6 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = characterReader1.consumeTo('\uffff');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        characterReader1.rewindToMark();
        java.lang.String str5 = characterReader1.consumeAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = characterReader1.consumeTo('a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        java.lang.Class<?> wildcardClass4 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        java.lang.String str6 = characterReader1.consumeHexSequence();
        boolean boolean8 = characterReader1.containsIgnoreCase("");
        char char9 = characterReader1.current();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = characterReader1.consumeTo(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = characterReader1.consumeHexSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader3 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str4 = characterReader3.consumeLetterSequence();
        characterReader3.rewindToMark();
        char[] charArray8 = new char[] { '\uffff', 'a' };
        java.lang.String str9 = characterReader3.consumeToAny(charArray8);
        boolean boolean10 = characterReader1.matchesAny(charArray8);
        boolean boolean12 = characterReader1.matches('#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = characterReader1.consumeTo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        java.lang.String str6 = characterReader1.consumeHexSequence();
        boolean boolean8 = characterReader1.containsIgnoreCase("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.consumeTo(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        char[] charArray6 = new char[] { '\uffff', 'a' };
        java.lang.String str7 = characterReader1.consumeToAny(charArray6);
        java.lang.String str8 = characterReader1.consumeAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = characterReader1.consumeLetterSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        characterReader1.unconsume();
        boolean boolean6 = characterReader1.matchesIgnoreCase("");
        java.lang.Class<?> wildcardClass7 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        char[] charArray6 = new char[] { '\uffff', 'a' };
        java.lang.String str7 = characterReader1.consumeToAny(charArray6);
        boolean boolean9 = characterReader1.matchesIgnoreCase("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        boolean boolean4 = characterReader1.matchesDigit();
        java.lang.Class<?> wildcardClass5 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        java.lang.String str6 = characterReader1.consumeHexSequence();
        boolean boolean8 = characterReader1.containsIgnoreCase("");
        boolean boolean10 = characterReader1.matches("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = characterReader1.consumeTo('4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
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
        boolean boolean19 = characterReader1.matchesDigit();
        characterReader1.mark();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = characterReader1.consumeTo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        boolean boolean5 = characterReader1.matchConsume("hi!");
        char char6 = characterReader1.current();
        java.lang.Class<?> wildcardClass7 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\uffff' + "'", char6 == '\uffff');
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader3 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str4 = characterReader3.consumeLetterSequence();
        characterReader3.rewindToMark();
        char[] charArray8 = new char[] { '\uffff', 'a' };
        java.lang.String str9 = characterReader3.consumeToAny(charArray8);
        boolean boolean10 = characterReader1.matchesAny(charArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = characterReader1.consumeTo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        boolean boolean3 = characterReader1.matchesLetter();
        java.lang.Class<?> wildcardClass4 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        int int9 = characterReader1.pos();
        boolean boolean11 = characterReader1.matches("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        boolean boolean5 = characterReader1.matchConsume("hi!");
        char char6 = characterReader1.current();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = characterReader1.consumeLetterSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\uffff' + "'", char6 == '\uffff');
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader3 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str4 = characterReader3.consumeLetterSequence();
        characterReader3.rewindToMark();
        char[] charArray8 = new char[] { '\uffff', 'a' };
        java.lang.String str9 = characterReader3.consumeToAny(charArray8);
        boolean boolean10 = characterReader1.matchesAny(charArray8);
        boolean boolean12 = characterReader1.matches('#');
        boolean boolean13 = characterReader1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = characterReader1.consumeTo('a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str4 = characterReader1.consumeTo("");
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean8 = characterReader1.matchConsume("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.consumeTo(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        boolean boolean4 = characterReader1.isEmpty();
        boolean boolean6 = characterReader1.matches("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader5 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str8 = characterReader7.consumeLetterSequence();
        characterReader7.rewindToMark();
        char[] charArray12 = new char[] { '\uffff', 'a' };
        java.lang.String str13 = characterReader7.consumeToAny(charArray12);
        boolean boolean14 = characterReader5.matchesAny(charArray12);
        java.lang.String str15 = characterReader1.consumeToAny(charArray12);
        characterReader1.rewindToMark();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray6 = new char[] { '#', 'a', '\uffff', 'a' };
        boolean boolean7 = characterReader1.matchesAny(charArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = characterReader1.consumeTo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str4 = characterReader1.consumeTo("");
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        char char7 = characterReader1.consume();
        char char8 = characterReader1.current();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = characterReader1.consumeHexSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        characterReader1.rewindToMark();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = characterReader1.consumeTo(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str4 = characterReader1.consumeTo("");
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = characterReader1.consumeTo("hi");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        boolean boolean4 = characterReader1.isEmpty();
        boolean boolean6 = characterReader1.matches("hi!");
        boolean boolean7 = characterReader1.matchesDigit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = characterReader1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
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
        java.lang.String str19 = characterReader1.consumeAsString();
        java.lang.Class<?> wildcardClass20 = characterReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        characterReader1.rewindToMark();
        boolean boolean9 = characterReader1.matchConsume("hi");
        boolean boolean10 = characterReader1.matchesLetter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = characterReader1.consumeTo('a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
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
        boolean boolean20 = characterReader1.matches("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = characterReader1.consumeTo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        boolean boolean5 = characterReader1.matchConsume("hi!");
        char char6 = characterReader1.current();
        characterReader1.mark();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\uffff' + "'", char6 == '\uffff');
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.consumeTo("hi");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        characterReader1.rewindToMark();
        char char4 = characterReader1.consume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = characterReader1.consumeHexSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\uffff' + "'", char4 == '\uffff');
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = characterReader1.consumeTo("!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = characterReader1.consumeTo('a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = characterReader1.consumeTo('\uffff');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        java.lang.String str6 = characterReader1.consumeHexSequence();
        boolean boolean8 = characterReader1.containsIgnoreCase("");
        boolean boolean10 = characterReader1.matches("hi!");
        boolean boolean12 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str13 = characterReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = characterReader1.consumeTo('\uffff');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        characterReader1.rewindToMark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = characterReader1.consumeTo('\uffff');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        characterReader1.rewindToMark();
        java.lang.String str5 = characterReader1.consumeAsString();
        java.lang.Class<?> wildcardClass6 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
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
        java.lang.Class<?> wildcardClass21 = characterReader1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        java.lang.String str6 = characterReader1.consumeHexSequence();
        boolean boolean8 = characterReader1.containsIgnoreCase("");
        boolean boolean10 = characterReader1.matches("hi!");
        boolean boolean12 = characterReader1.containsIgnoreCase("hi!");
        java.lang.Class<?> wildcardClass13 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
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
        java.lang.Class<?> wildcardClass19 = charArray15.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        boolean boolean3 = characterReader1.matchesLetter();
        characterReader1.advance();
        boolean boolean6 = characterReader1.matches('\uffff');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = characterReader1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = characterReader1.consumeTo('!');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matches('a');
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("");
        int int8 = characterReader1.pos();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        characterReader1.advance();
        characterReader1.rewindToMark();
        boolean boolean6 = characterReader1.matchesDigit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        characterReader1.unconsume();
        char char5 = characterReader1.consume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\uffff' + "'", char5 == '\uffff');
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
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
        java.lang.String str26 = characterReader1.consumeAsString();
        boolean boolean27 = characterReader1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = characterReader1.consumeDigitSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        int int9 = characterReader1.pos();
        boolean boolean11 = characterReader1.matches("hi!");
        java.lang.String str12 = characterReader1.consumeAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = characterReader1.consumeDigitSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        int int9 = characterReader1.pos();
        boolean boolean11 = characterReader1.matches("hi!");
        java.lang.String str12 = characterReader1.consumeAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
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
        boolean boolean19 = characterReader1.matchesDigit();
        characterReader1.mark();
        boolean boolean21 = characterReader1.matchesDigit();
        java.lang.Class<?> wildcardClass22 = characterReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        char[] charArray6 = new char[] { '\uffff', 'a' };
        java.lang.String str7 = characterReader1.consumeToAny(charArray6);
        java.lang.String str8 = characterReader1.consumeAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = characterReader1.consumeDigitSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matches('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = characterReader1.consumeTo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        characterReader1.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader6 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str9 = characterReader8.consumeLetterSequence();
        characterReader8.rewindToMark();
        char[] charArray13 = new char[] { '\uffff', 'a' };
        java.lang.String str14 = characterReader8.consumeToAny(charArray13);
        boolean boolean15 = characterReader6.matchesAny(charArray13);
        boolean boolean16 = characterReader1.matchesAny(charArray13);
        java.lang.Class<?> wildcardClass17 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        characterReader1.rewindToMark();
        java.lang.String str5 = characterReader1.consumeAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = characterReader1.consumeLetterSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        java.lang.String str4 = characterReader1.toString();
        boolean boolean6 = characterReader1.matches("hi");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.consumeToEnd();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 3, end 2, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        characterReader1.unconsume();
        boolean boolean6 = characterReader1.matchesIgnoreCase("");
        char char7 = characterReader1.current();
        java.lang.String str8 = characterReader1.consumeAsString();
        boolean boolean9 = characterReader1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.toString();
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
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        characterReader1.mark();
        org.jsoup.parser.CharacterReader characterReader5 = new org.jsoup.parser.CharacterReader("");
        char[] charArray10 = new char[] { '#', 'a', '\uffff', 'a' };
        boolean boolean11 = characterReader5.matchesAny(charArray10);
        boolean boolean12 = characterReader1.matchesAny(charArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = characterReader1.consumeTo('\uffff');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str9 = characterReader1.toString();
        java.lang.String str10 = characterReader1.consumeAsString();
        boolean boolean12 = characterReader1.containsIgnoreCase("!");
        char char13 = characterReader1.consume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 2, end 2, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\uffff' + "'", char13 == '\uffff');
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
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
        boolean boolean24 = characterReader1.isEmpty();
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = characterReader1.consumeTo(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str4 = characterReader1.consumeTo("");
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        int int7 = characterReader1.pos();
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.consumeTo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
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
        boolean boolean19 = characterReader1.matchesDigit();
        characterReader1.unconsume();
        boolean boolean21 = characterReader1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        java.lang.String str4 = characterReader1.consumeAsString();
        characterReader1.advance();
        boolean boolean7 = characterReader1.matchesIgnoreCase("hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        characterReader1.rewindToMark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        boolean boolean7 = characterReader1.matches("!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        java.lang.String str4 = characterReader1.consumeAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = characterReader1.consumeLetterSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
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
        boolean boolean25 = characterReader1.matches("");
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        characterReader1.rewindToMark();
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = characterReader1.consumeLetterSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.rewindToMark();
        java.lang.Class<?> wildcardClass3 = characterReader1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str9 = characterReader1.toString();
        java.lang.String str10 = characterReader1.consumeAsString();
        boolean boolean12 = characterReader1.containsIgnoreCase("!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = characterReader1.consumeDigitSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        java.lang.String str6 = characterReader1.consumeHexSequence();
        boolean boolean8 = characterReader1.containsIgnoreCase("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        characterReader1.rewindToMark();
        java.lang.String str5 = characterReader1.consumeAsString();
        boolean boolean6 = characterReader1.matchesDigit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = characterReader1.consumeLetterSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str4 = characterReader1.consumeTo("");
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        char char7 = characterReader1.consume();
        char char8 = characterReader1.current();
        boolean boolean10 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.Class<?> wildcardClass11 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        characterReader1.rewindToMark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        boolean boolean7 = characterReader1.matches('4');
        characterReader1.unconsume();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str11 = characterReader10.consumeLetterSequence();
        char char12 = characterReader10.consume();
        boolean boolean14 = characterReader10.matchConsume("hi!");
        char char15 = characterReader10.current();
        characterReader10.mark();
        org.jsoup.parser.CharacterReader characterReader18 = new org.jsoup.parser.CharacterReader("");
        characterReader18.rewindToMark();
        boolean boolean21 = characterReader18.matches("");
        java.lang.String str22 = characterReader18.consumeHexSequence();
        java.lang.String str23 = characterReader18.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader27 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str28 = characterReader27.consumeLetterSequence();
        characterReader27.rewindToMark();
        char[] charArray32 = new char[] { '\uffff', 'a' };
        java.lang.String str33 = characterReader27.consumeToAny(charArray32);
        boolean boolean34 = characterReader25.matchesAny(charArray32);
        java.lang.String str35 = characterReader18.consumeToAny(charArray32);
        java.lang.String str36 = characterReader10.consumeToAny(charArray32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = characterReader1.consumeToAny(charArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\uffff' + "'", char12 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\uffff' + "'", char15 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray2 = new char[] {};
        boolean boolean3 = characterReader1.matchesAny(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = characterReader1.consumeTo('#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        characterReader1.unconsume();
        char char5 = characterReader1.consume();
        char char6 = characterReader1.consume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = characterReader1.consumeDigitSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 2, end 2, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\uffff' + "'", char5 == '\uffff');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\uffff' + "'", char6 == '\uffff');
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        char char7 = characterReader1.current();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.consumeTo('\uffff');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matches('a');
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("");
        char char8 = characterReader1.current();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.consumeTo("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
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
        boolean boolean24 = characterReader1.isEmpty();
        java.lang.String str25 = characterReader1.consumeHexSequence();
        int int26 = characterReader1.pos();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = characterReader1.consumeTo('#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
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
        java.lang.String str26 = characterReader1.consumeAsString();
        boolean boolean27 = characterReader1.isEmpty();
        java.lang.Class<?> wildcardClass28 = characterReader1.getClass();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        java.lang.String str6 = characterReader1.consumeHexSequence();
        boolean boolean8 = characterReader1.containsIgnoreCase("");
        boolean boolean10 = characterReader1.matches("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray2 = new char[] {};
        boolean boolean3 = characterReader1.matchesAny(charArray2);
        int int4 = characterReader1.pos();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        java.lang.String str6 = characterReader1.consumeHexSequence();
        boolean boolean8 = characterReader1.matches('!');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.consumeTo("!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
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
        java.lang.String str19 = characterReader1.consumeDigitSequence();
        boolean boolean21 = characterReader1.matches('#');
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str24 = characterReader23.consumeLetterSequence();
        characterReader23.rewindToMark();
        char[] charArray28 = new char[] { '\uffff', 'a' };
        java.lang.String str29 = characterReader23.consumeToAny(charArray28);
        char char30 = characterReader23.consume();
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str33 = characterReader32.consumeLetterSequence();
        characterReader32.rewindToMark();
        char[] charArray37 = new char[] { '\uffff', 'a' };
        java.lang.String str38 = characterReader32.consumeToAny(charArray37);
        java.lang.String str39 = characterReader23.consumeToAny(charArray37);
        boolean boolean40 = characterReader1.matchesAny(charArray37);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '\uffff' + "'", char30 == '\uffff');
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str9 = characterReader1.consumeDigitSequence();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = characterReader1.consumeTo('a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = characterReader1.consumeDigitSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.Class<?> wildcardClass2 = characterReader1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str9 = characterReader1.toString();
        java.lang.String str10 = characterReader1.consumeAsString();
        boolean boolean12 = characterReader1.containsIgnoreCase("!");
        char char13 = characterReader1.consume();
        java.lang.Class<?> wildcardClass14 = characterReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\uffff' + "'", char13 == '\uffff');
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader3 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str4 = characterReader3.consumeLetterSequence();
        characterReader3.rewindToMark();
        char[] charArray8 = new char[] { '\uffff', 'a' };
        java.lang.String str9 = characterReader3.consumeToAny(charArray8);
        boolean boolean10 = characterReader1.matchesAny(charArray8);
        boolean boolean12 = characterReader1.matches('#');
        java.lang.String str13 = characterReader1.consumeAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = characterReader1.consumeDigitSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        characterReader1.unconsume();
        boolean boolean6 = characterReader1.matchesIgnoreCase("");
        char char7 = characterReader1.current();
        java.lang.String str8 = characterReader1.consumeAsString();
        boolean boolean9 = characterReader1.isEmpty();
        boolean boolean10 = characterReader1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = characterReader1.consumeTo("hi");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
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
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        characterReader1.rewindToMark();
        char char8 = characterReader1.current();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.consumeTo('#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        char[] charArray6 = new char[] { '\uffff', 'a' };
        java.lang.String str7 = characterReader1.consumeToAny(charArray6);
        boolean boolean9 = characterReader1.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader11 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str12 = characterReader11.consumeLetterSequence();
        java.lang.String str13 = characterReader11.toString();
        org.jsoup.parser.CharacterReader characterReader15 = new org.jsoup.parser.CharacterReader("");
        characterReader15.rewindToMark();
        boolean boolean18 = characterReader15.matches("");
        java.lang.String str19 = characterReader15.consumeHexSequence();
        java.lang.String str20 = characterReader15.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str25 = characterReader24.consumeLetterSequence();
        characterReader24.rewindToMark();
        char[] charArray29 = new char[] { '\uffff', 'a' };
        java.lang.String str30 = characterReader24.consumeToAny(charArray29);
        boolean boolean31 = characterReader22.matchesAny(charArray29);
        java.lang.String str32 = characterReader15.consumeToAny(charArray29);
        java.lang.String str33 = characterReader11.consumeToAny(charArray29);
        boolean boolean35 = characterReader11.matches('4');
        java.lang.String str36 = characterReader11.consumeAsString();
        boolean boolean37 = characterReader11.isEmpty();
        org.jsoup.parser.CharacterReader characterReader39 = new org.jsoup.parser.CharacterReader("");
        characterReader39.rewindToMark();
        boolean boolean42 = characterReader39.matches("");
        org.jsoup.parser.CharacterReader characterReader44 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str45 = characterReader44.consumeLetterSequence();
        java.lang.String str46 = characterReader44.consumeDigitSequence();
        characterReader44.rewindToMark();
        java.lang.String str48 = characterReader44.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader50 = new org.jsoup.parser.CharacterReader("");
        char[] charArray51 = new char[] {};
        boolean boolean52 = characterReader50.matchesAny(charArray51);
        java.lang.String str53 = characterReader44.consumeToAny(charArray51);
        boolean boolean54 = characterReader39.matchesAny(charArray51);
        java.lang.String str55 = characterReader11.consumeToAny(charArray51);
        boolean boolean56 = characterReader1.matchesAny(charArray51);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str58 = characterReader1.consumeTo("hi");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        characterReader1.rewindToMark();
        boolean boolean9 = characterReader1.matchConsume("hi");
        boolean boolean10 = characterReader1.matchesLetter();
        int int11 = characterReader1.pos();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str9 = characterReader1.toString();
        characterReader1.rewindToMark();
        boolean boolean12 = characterReader1.matchConsumeIgnoreCase("!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
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
        boolean boolean19 = characterReader1.matchesDigit();
        characterReader1.unconsume();
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str23 = characterReader22.consumeHexSequence();
        boolean boolean25 = characterReader22.matchConsumeIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader27 = new org.jsoup.parser.CharacterReader("");
        characterReader27.rewindToMark();
        boolean boolean30 = characterReader27.matches("");
        java.lang.String str31 = characterReader27.consumeHexSequence();
        characterReader27.advance();
        org.jsoup.parser.CharacterReader characterReader34 = new org.jsoup.parser.CharacterReader("");
        char[] charArray39 = new char[] { '#', 'a', '\uffff', 'a' };
        boolean boolean40 = characterReader34.matchesAny(charArray39);
        boolean boolean41 = characterReader27.matchesAny(charArray39);
        boolean boolean42 = characterReader22.matchesAny(charArray39);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = characterReader1.matchesAny(charArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str9 = characterReader1.consumeDigitSequence();
        characterReader1.mark();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = characterReader1.consumeTo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = characterReader1.consumeTo('#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
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
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        boolean boolean6 = characterReader1.matchesLetter();
        characterReader1.rewindToMark();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = characterReader1.consumeTo('a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
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
        java.lang.String str26 = characterReader1.toString();
        java.lang.Class<?> wildcardClass27 = characterReader1.getClass();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        characterReader1.rewindToMark();
        java.lang.String str5 = characterReader1.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        char[] charArray8 = new char[] {};
        boolean boolean9 = characterReader7.matchesAny(charArray8);
        java.lang.String str10 = characterReader1.consumeToAny(charArray8);
        characterReader1.rewindToMark();
        boolean boolean12 = characterReader1.isEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        characterReader1.rewindToMark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = characterReader1.consumeTo(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        characterReader1.unconsume();
        char char5 = characterReader1.consume();
        char char6 = characterReader1.consume();
        java.lang.Class<?> wildcardClass7 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\uffff' + "'", char5 == '\uffff');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\uffff' + "'", char6 == '\uffff');
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        characterReader1.unconsume();
        boolean boolean6 = characterReader1.matchesIgnoreCase("");
        java.lang.String str7 = characterReader1.consumeAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = characterReader1.consumeLetterSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str4 = characterReader1.consumeTo("");
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        char char7 = characterReader1.consume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        java.lang.String str6 = characterReader1.consumeHexSequence();
        boolean boolean8 = characterReader1.containsIgnoreCase("");
        boolean boolean9 = characterReader1.isEmpty();
        boolean boolean11 = characterReader1.matches('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = characterReader1.consumeTo("hi");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        characterReader1.rewindToMark();
        char char8 = characterReader1.current();
        java.lang.String str9 = characterReader1.consumeDigitSequence();
        boolean boolean10 = characterReader1.matchesDigit();
        java.lang.Class<?> wildcardClass11 = characterReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
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
        java.lang.String str26 = characterReader1.consumeAsString();
        boolean boolean27 = characterReader1.isEmpty();
        boolean boolean29 = characterReader1.matches("hi");
        org.jsoup.parser.CharacterReader characterReader31 = new org.jsoup.parser.CharacterReader("");
        char[] charArray32 = new char[] {};
        boolean boolean33 = characterReader31.matchesAny(charArray32);
        boolean boolean34 = characterReader1.matchesAny(charArray32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = characterReader1.consumeHexSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
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
        boolean boolean24 = characterReader1.isEmpty();
        characterReader1.unconsume();
        org.jsoup.parser.CharacterReader characterReader27 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str28 = characterReader27.consumeLetterSequence();
        java.lang.String str29 = characterReader27.toString();
        boolean boolean31 = characterReader27.matchConsume("");
        java.lang.String str32 = characterReader27.consumeHexSequence();
        boolean boolean34 = characterReader27.containsIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader36 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str37 = characterReader36.consumeLetterSequence();
        java.lang.String str38 = characterReader36.toString();
        org.jsoup.parser.CharacterReader characterReader40 = new org.jsoup.parser.CharacterReader("");
        characterReader40.rewindToMark();
        boolean boolean43 = characterReader40.matches("");
        java.lang.String str44 = characterReader40.consumeHexSequence();
        java.lang.String str45 = characterReader40.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader47 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader49 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str50 = characterReader49.consumeLetterSequence();
        characterReader49.rewindToMark();
        char[] charArray54 = new char[] { '\uffff', 'a' };
        java.lang.String str55 = characterReader49.consumeToAny(charArray54);
        boolean boolean56 = characterReader47.matchesAny(charArray54);
        java.lang.String str57 = characterReader40.consumeToAny(charArray54);
        java.lang.String str58 = characterReader36.consumeToAny(charArray54);
        java.lang.String str59 = characterReader27.consumeToAny(charArray54);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str60 = characterReader1.consumeToAny(charArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
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
        java.lang.String str26 = characterReader1.consumeAsString();
        boolean boolean27 = characterReader1.isEmpty();
        char char28 = characterReader1.current();
        java.lang.Class<?> wildcardClass29 = characterReader1.getClass();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\uffff' + "'", char28 == '\uffff');
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        boolean boolean5 = characterReader1.matchConsume("hi!");
        char char6 = characterReader1.current();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        characterReader8.rewindToMark();
        boolean boolean11 = characterReader8.matches("");
        java.lang.String str12 = characterReader8.consumeHexSequence();
        characterReader8.advance();
        characterReader8.rewindToMark();
        boolean boolean16 = characterReader8.matchConsume("hi");
        boolean boolean17 = characterReader8.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str20 = characterReader19.consumeLetterSequence();
        java.lang.String str21 = characterReader19.consumeDigitSequence();
        characterReader19.rewindToMark();
        java.lang.String str23 = characterReader19.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("");
        char[] charArray26 = new char[] {};
        boolean boolean27 = characterReader25.matchesAny(charArray26);
        java.lang.String str28 = characterReader19.consumeToAny(charArray26);
        java.lang.String str29 = characterReader8.consumeToAny(charArray26);
        boolean boolean30 = characterReader1.matchesAny(charArray26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = characterReader1.consumeLetterSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\uffff' + "'", char6 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        boolean boolean4 = characterReader1.matchesLetter();
        java.lang.Class<?> wildcardClass5 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
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
        java.lang.String str26 = characterReader1.consumeAsString();
        boolean boolean27 = characterReader1.isEmpty();
        char char28 = characterReader1.current();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = characterReader1.consumeTo('4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\uffff' + "'", char28 == '\uffff');
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        char char4 = characterReader1.consume();
        boolean boolean6 = characterReader1.matches('\uffff');
        java.lang.Class<?> wildcardClass7 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\uffff' + "'", char4 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
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
        boolean boolean19 = characterReader1.matchesDigit();
        characterReader1.mark();
        java.lang.String str21 = characterReader1.consumeLetterSequence();
        boolean boolean23 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean25 = characterReader1.containsIgnoreCase("hi!");
        int int26 = characterReader1.pos();
        java.lang.String str27 = characterReader1.consumeDigitSequence();
        java.lang.String str28 = characterReader1.consumeHexSequence();
        boolean boolean29 = characterReader1.matchesDigit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader3 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str4 = characterReader3.consumeLetterSequence();
        characterReader3.rewindToMark();
        char[] charArray8 = new char[] { '\uffff', 'a' };
        java.lang.String str9 = characterReader3.consumeToAny(charArray8);
        boolean boolean10 = characterReader1.matchesAny(charArray8);
        boolean boolean12 = characterReader1.matches('#');
        boolean boolean13 = characterReader1.isEmpty();
        char char14 = characterReader1.consume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = characterReader1.consumeTo("i");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\uffff' + "'", char14 == '\uffff');
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = characterReader1.consumeTo("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str4 = characterReader1.consumeTo("");
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean8 = characterReader1.matchConsume("");
        char char9 = characterReader1.current();
        boolean boolean10 = characterReader1.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        characterReader12.rewindToMark();
        boolean boolean15 = characterReader12.matches("");
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str18 = characterReader17.consumeLetterSequence();
        java.lang.String str19 = characterReader17.consumeDigitSequence();
        characterReader17.rewindToMark();
        java.lang.String str21 = characterReader17.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        char[] charArray24 = new char[] {};
        boolean boolean25 = characterReader23.matchesAny(charArray24);
        java.lang.String str26 = characterReader17.consumeToAny(charArray24);
        boolean boolean27 = characterReader12.matchesAny(charArray24);
        java.lang.String str28 = characterReader1.consumeToAny(charArray24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        characterReader1.rewindToMark();
        java.lang.String str5 = characterReader1.consumeAsString();
        boolean boolean7 = characterReader1.matchesIgnoreCase("hi");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = characterReader1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
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
        boolean boolean24 = characterReader1.isEmpty();
        java.lang.String str25 = characterReader1.consumeHexSequence();
        boolean boolean27 = characterReader1.matchConsumeIgnoreCase("hi");
        char char28 = characterReader1.consume();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\uffff' + "'", char28 == '\uffff');
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray2 = new char[] {};
        boolean boolean3 = characterReader1.matchesAny(charArray2);
        java.lang.String str4 = characterReader1.consumeLetterSequence();
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = characterReader1.consumeTo('\uffff');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str4 = characterReader1.consumeTo("");
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = characterReader1.consumeDigitSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        java.lang.String str4 = characterReader1.toString();
        boolean boolean6 = characterReader1.matches("hi");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.consumeToEnd();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.consumeTo('4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 3, end 2, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
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
        java.lang.String str19 = characterReader1.consumeDigitSequence();
        boolean boolean21 = characterReader1.matches('#');
        boolean boolean23 = characterReader1.containsIgnoreCase("");
        char char24 = characterReader1.current();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\uffff' + "'", char24 == '\uffff');
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
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
        boolean boolean19 = characterReader1.matchesDigit();
        characterReader1.mark();
        java.lang.String str21 = characterReader1.consumeLetterSequence();
        boolean boolean23 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean25 = characterReader1.matches('!');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        int int4 = characterReader1.pos();
        java.lang.String str5 = characterReader1.consumeLetterSequence();
        java.lang.String str6 = characterReader1.consumeHexSequence();
        java.lang.String str7 = characterReader1.consumeAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = characterReader1.consumeTo('#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 3, end 2, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
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
        boolean boolean29 = characterReader1.matchConsume("i!");
        java.lang.Class<?> wildcardClass30 = characterReader1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matches('a');
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = characterReader1.consumeTo("i");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        characterReader1.unconsume();
        boolean boolean6 = characterReader1.matchesIgnoreCase("");
        char char7 = characterReader1.current();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        characterReader9.rewindToMark();
        characterReader9.mark();
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        char[] charArray18 = new char[] { '#', 'a', '\uffff', 'a' };
        boolean boolean19 = characterReader13.matchesAny(charArray18);
        boolean boolean20 = characterReader9.matchesAny(charArray18);
        boolean boolean21 = characterReader1.matchesAny(charArray18);
        char char22 = characterReader1.consume();
        char char23 = characterReader1.current();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\uffff' + "'", char22 == '\uffff');
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\uffff' + "'", char23 == '\uffff');
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str4 = characterReader1.consumeTo("");
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        char char7 = characterReader1.consume();
        boolean boolean8 = characterReader1.matchesLetter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.consumeTo('#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        int int4 = characterReader1.pos();
        java.lang.String str5 = characterReader1.consumeLetterSequence();
        java.lang.String str6 = characterReader1.consumeHexSequence();
        characterReader1.unconsume();
        char char8 = characterReader1.current();
        java.lang.String str9 = characterReader1.consumeToEnd();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = characterReader1.consumeTo(' ');
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
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        boolean boolean5 = characterReader1.matchConsume("hi!");
        char char6 = characterReader1.current();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = characterReader1.consumeTo("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 0, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\uffff' + "'", char6 == '\uffff');
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        boolean boolean5 = characterReader1.matchConsume("hi!");
        char char6 = characterReader1.current();
        characterReader1.mark();
        boolean boolean9 = characterReader1.matches('#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\uffff' + "'", char6 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        java.lang.String str6 = characterReader1.consumeHexSequence();
        boolean boolean8 = characterReader1.containsIgnoreCase("");
        boolean boolean10 = characterReader1.matches("hi!");
        boolean boolean12 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str13 = characterReader1.toString();
        char char14 = characterReader1.consume();
        boolean boolean16 = characterReader1.matches('\uffff');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = characterReader1.consumeHexSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\uffff' + "'", char14 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str9 = characterReader1.consumeDigitSequence();
        characterReader1.mark();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.rewindToMark();
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = characterReader1.consumeDigitSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str4 = characterReader1.consumeTo("");
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        char char7 = characterReader1.consume();
        char char8 = characterReader1.current();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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
        java.lang.String str24 = characterReader1.consumeDigitSequence();
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            char char26 = characterReader1.current();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        characterReader1.rewindToMark();
        char char8 = characterReader1.current();
        char char9 = characterReader1.consume();
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 2, end 2, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray2 = new char[] {};
        boolean boolean3 = characterReader1.matchesAny(charArray2);
        boolean boolean5 = characterReader1.matchConsumeIgnoreCase("hi!");
        int int6 = characterReader1.pos();
        char char7 = characterReader1.current();
        char[] charArray13 = new char[] { '\uffff', '4', '\uffff', '!', 'a' };
        boolean boolean14 = characterReader1.matchesAny(charArray13);
        boolean boolean16 = characterReader1.matchesIgnoreCase("hi!");
        java.lang.Class<?> wildcardClass17 = characterReader1.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '\uffff', '4', '\uffff', '!', 'a' });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        boolean boolean5 = characterReader1.matchConsume("hi!");
        boolean boolean6 = characterReader1.matchesDigit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = characterReader1.consumeLetterSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        java.lang.String str4 = characterReader1.consumeAsString();
        characterReader1.advance();
        char char6 = characterReader1.current();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = characterReader1.consumeTo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 2, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\uffff' + "'", char6 == '\uffff');
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        java.lang.String str4 = characterReader1.consumeDigitSequence();
        char char5 = characterReader1.current();
        boolean boolean7 = characterReader1.matches('#');
        java.lang.Class<?> wildcardClass8 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\uffff' + "'", char5 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        boolean boolean5 = characterReader1.matchConsume("hi!");
        char char6 = characterReader1.current();
        characterReader1.mark();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = characterReader1.consumeTo('i');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\uffff' + "'", char6 == '\uffff');
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        characterReader1.rewindToMark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str7 = characterReader1.consumeTo("");
        java.lang.String str8 = characterReader1.consumeHexSequence();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        characterReader1.rewindToMark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        boolean boolean7 = characterReader1.matches('4');
        characterReader1.unconsume();
        boolean boolean10 = characterReader1.containsIgnoreCase("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
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
        boolean boolean19 = characterReader1.matchesDigit();
        characterReader1.mark();
        java.lang.String str21 = characterReader1.consumeLetterSequence();
        boolean boolean23 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean25 = characterReader1.containsIgnoreCase("hi!");
        int int26 = characterReader1.pos();
        java.lang.String str27 = characterReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = characterReader1.consumeTo('!');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        characterReader1.rewindToMark();
        char char8 = characterReader1.current();
        char char9 = characterReader1.consume();
        characterReader1.rewindToMark();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        char[] charArray6 = new char[] { '\uffff', 'a' };
        java.lang.String str7 = characterReader1.consumeToAny(charArray6);
        java.lang.String str8 = characterReader1.consumeAsString();
        boolean boolean10 = characterReader1.matchConsumeIgnoreCase("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = characterReader1.consumeLetterSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        int int4 = characterReader1.pos();
        java.lang.String str5 = characterReader1.consumeDigitSequence();
        boolean boolean7 = characterReader1.containsIgnoreCase("i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader4 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str5 = characterReader4.consumeLetterSequence();
        java.lang.String str6 = characterReader4.consumeDigitSequence();
        characterReader4.rewindToMark();
        java.lang.String str8 = characterReader4.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        char[] charArray11 = new char[] {};
        boolean boolean12 = characterReader10.matchesAny(charArray11);
        java.lang.String str13 = characterReader4.consumeToAny(charArray11);
        java.lang.String str14 = characterReader1.consumeToAny(charArray11);
        java.lang.String str15 = characterReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = characterReader1.consumeTo("hi");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        boolean boolean3 = characterReader1.isEmpty();
        boolean boolean5 = characterReader1.matches('\uffff');
        characterReader1.unconsume();
        java.lang.Class<?> wildcardClass7 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        java.lang.String str6 = characterReader1.consumeHexSequence();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = characterReader1.consumeTo(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        boolean boolean7 = characterReader1.containsIgnoreCase("");
        java.lang.String str8 = characterReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
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
        java.lang.String str26 = characterReader1.consumeAsString();
        characterReader1.rewindToMark();
        java.lang.String str28 = characterReader1.consumeLetterSequence();
        java.lang.String str29 = characterReader1.consumeLetterSequence();
        boolean boolean30 = characterReader1.isEmpty();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        characterReader1.advance();
        characterReader1.rewindToMark();
        char char6 = characterReader1.current();
        java.lang.Class<?> wildcardClass7 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\uffff' + "'", char6 == '\uffff');
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        characterReader1.unconsume();
        boolean boolean6 = characterReader1.matchesIgnoreCase("");
        char char7 = characterReader1.current();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        characterReader9.rewindToMark();
        characterReader9.mark();
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        char[] charArray18 = new char[] { '#', 'a', '\uffff', 'a' };
        boolean boolean19 = characterReader13.matchesAny(charArray18);
        boolean boolean20 = characterReader9.matchesAny(charArray18);
        boolean boolean21 = characterReader1.matchesAny(charArray18);
        char char22 = characterReader1.consume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = characterReader1.consumeTo("i");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\uffff' + "'", char22 == '\uffff');
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        int int4 = characterReader1.pos();
        java.lang.String str5 = characterReader1.consumeLetterSequence();
        characterReader1.advance();
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 4, end 2, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matchConsume("!");
        boolean boolean4 = characterReader1.isEmpty();
        java.lang.String str5 = characterReader1.consumeDigitSequence();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        java.lang.String str6 = characterReader1.consumeHexSequence();
        boolean boolean8 = characterReader1.containsIgnoreCase("");
        boolean boolean10 = characterReader1.matches("hi!");
        boolean boolean12 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str13 = characterReader1.toString();
        char char14 = characterReader1.consume();
        boolean boolean16 = characterReader1.matches('\uffff');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = characterReader1.consumeTo('#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\uffff' + "'", char14 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str4 = characterReader1.consumeTo("");
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean8 = characterReader1.matchConsume("");
        char char9 = characterReader1.current();
        java.lang.Class<?> wildcardClass10 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
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
        boolean boolean24 = characterReader1.isEmpty();
        java.lang.String str25 = characterReader1.consumeHexSequence();
        int int26 = characterReader1.pos();
        java.lang.String str27 = characterReader1.consumeAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = characterReader1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
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
        java.lang.String str26 = characterReader1.consumeAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = characterReader1.consumeHexSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        java.lang.String str6 = characterReader1.consumeHexSequence();
        boolean boolean8 = characterReader1.containsIgnoreCase("");
        boolean boolean10 = characterReader1.matches("hi!");
        boolean boolean12 = characterReader1.containsIgnoreCase("hi!");
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        boolean boolean4 = characterReader1.matchesDigit();
        boolean boolean6 = characterReader1.matchConsume("i!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = characterReader1.consumeTo("i");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray2 = new char[] {};
        boolean boolean3 = characterReader1.matchesAny(charArray2);
        boolean boolean5 = characterReader1.matchConsumeIgnoreCase("hi!");
        int int6 = characterReader1.pos();
        char char7 = characterReader1.current();
        char[] charArray13 = new char[] { '\uffff', '4', '\uffff', '!', 'a' };
        boolean boolean14 = characterReader1.matchesAny(charArray13);
        boolean boolean16 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean18 = characterReader1.matchConsume("hi");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '\uffff', '4', '\uffff', '!', 'a' });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader3 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str4 = characterReader3.consumeLetterSequence();
        characterReader3.rewindToMark();
        char[] charArray8 = new char[] { '\uffff', 'a' };
        java.lang.String str9 = characterReader3.consumeToAny(charArray8);
        boolean boolean10 = characterReader1.matchesAny(charArray8);
        boolean boolean12 = characterReader1.matches('#');
        boolean boolean13 = characterReader1.isEmpty();
        char char14 = characterReader1.consume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\uffff' + "'", char14 == '\uffff');
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        characterReader1.advance();
        characterReader1.mark();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        java.lang.String str6 = characterReader1.consumeHexSequence();
        boolean boolean8 = characterReader1.containsIgnoreCase("");
        boolean boolean10 = characterReader1.matches('!');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
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
        char char22 = characterReader1.current();
        boolean boolean24 = characterReader1.matches(' ');
        boolean boolean26 = characterReader1.containsIgnoreCase("");
        java.lang.String str27 = characterReader1.consumeDigitSequence();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\uffff' + "'", char22 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        int int9 = characterReader1.pos();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = characterReader1.consumeTo("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        characterReader1.rewindToMark();
        boolean boolean9 = characterReader1.matchConsume("hi");
        boolean boolean10 = characterReader1.matchesLetter();
        characterReader1.mark();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        boolean boolean3 = characterReader1.matchesLetter();
        characterReader1.advance();
        boolean boolean6 = characterReader1.matches('\uffff');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        java.lang.String str6 = characterReader1.consumeHexSequence();
        characterReader1.mark();
        boolean boolean9 = characterReader1.matchConsumeIgnoreCase("!");
        boolean boolean10 = characterReader1.matchesLetter();
        char char11 = characterReader1.consume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = characterReader1.consumeTo('#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\uffff' + "'", char11 == '\uffff');
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        boolean boolean5 = characterReader1.matchConsume("hi!");
        java.lang.Class<?> wildcardClass6 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
        java.lang.String str26 = characterReader1.consumeAsString();
        boolean boolean28 = characterReader1.matchesIgnoreCase("hi");
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        characterReader1.advance();
        boolean boolean6 = characterReader1.containsIgnoreCase("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = characterReader1.consumeTo("i");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        characterReader1.rewindToMark();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = characterReader1.consumeTo('\uffff');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
        java.lang.String str26 = characterReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = characterReader1.consumeTo(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        java.lang.Class<?> wildcardClass3 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader4 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str5 = characterReader4.consumeLetterSequence();
        java.lang.String str6 = characterReader4.consumeDigitSequence();
        characterReader4.rewindToMark();
        java.lang.String str8 = characterReader4.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        char[] charArray11 = new char[] {};
        boolean boolean12 = characterReader10.matchesAny(charArray11);
        java.lang.String str13 = characterReader4.consumeToAny(charArray11);
        java.lang.String str14 = characterReader1.consumeToAny(charArray11);
        java.lang.String str15 = characterReader1.toString();
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str18 = characterReader17.consumeHexSequence();
        boolean boolean20 = characterReader17.matchConsumeIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("");
        characterReader22.rewindToMark();
        boolean boolean25 = characterReader22.matches("");
        java.lang.String str26 = characterReader22.consumeHexSequence();
        characterReader22.advance();
        org.jsoup.parser.CharacterReader characterReader29 = new org.jsoup.parser.CharacterReader("");
        char[] charArray34 = new char[] { '#', 'a', '\uffff', 'a' };
        boolean boolean35 = characterReader29.matchesAny(charArray34);
        boolean boolean36 = characterReader22.matchesAny(charArray34);
        boolean boolean37 = characterReader17.matchesAny(charArray34);
        java.lang.String str38 = characterReader1.consumeToAny(charArray34);
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = characterReader1.consumeTo("h");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        int int4 = characterReader1.pos();
        java.lang.String str5 = characterReader1.consumeLetterSequence();
        java.lang.String str6 = characterReader1.consumeHexSequence();
        characterReader1.unconsume();
        char char8 = characterReader1.current();
        java.lang.String str9 = characterReader1.consumeToEnd();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = characterReader1.consumeTo('i');
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
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        char[] charArray6 = new char[] { '\uffff', 'a' };
        java.lang.String str7 = characterReader1.consumeToAny(charArray6);
        boolean boolean9 = characterReader1.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader11 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str12 = characterReader11.consumeLetterSequence();
        java.lang.String str13 = characterReader11.toString();
        org.jsoup.parser.CharacterReader characterReader15 = new org.jsoup.parser.CharacterReader("");
        characterReader15.rewindToMark();
        boolean boolean18 = characterReader15.matches("");
        java.lang.String str19 = characterReader15.consumeHexSequence();
        java.lang.String str20 = characterReader15.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str25 = characterReader24.consumeLetterSequence();
        characterReader24.rewindToMark();
        char[] charArray29 = new char[] { '\uffff', 'a' };
        java.lang.String str30 = characterReader24.consumeToAny(charArray29);
        boolean boolean31 = characterReader22.matchesAny(charArray29);
        java.lang.String str32 = characterReader15.consumeToAny(charArray29);
        java.lang.String str33 = characterReader11.consumeToAny(charArray29);
        boolean boolean35 = characterReader11.matches('4');
        java.lang.String str36 = characterReader11.consumeAsString();
        boolean boolean37 = characterReader11.isEmpty();
        org.jsoup.parser.CharacterReader characterReader39 = new org.jsoup.parser.CharacterReader("");
        characterReader39.rewindToMark();
        boolean boolean42 = characterReader39.matches("");
        org.jsoup.parser.CharacterReader characterReader44 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str45 = characterReader44.consumeLetterSequence();
        java.lang.String str46 = characterReader44.consumeDigitSequence();
        characterReader44.rewindToMark();
        java.lang.String str48 = characterReader44.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader50 = new org.jsoup.parser.CharacterReader("");
        char[] charArray51 = new char[] {};
        boolean boolean52 = characterReader50.matchesAny(charArray51);
        java.lang.String str53 = characterReader44.consumeToAny(charArray51);
        boolean boolean54 = characterReader39.matchesAny(charArray51);
        java.lang.String str55 = characterReader11.consumeToAny(charArray51);
        boolean boolean56 = characterReader1.matchesAny(charArray51);
        java.lang.Class<?> wildcardClass57 = charArray51.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
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
        java.lang.String str26 = characterReader1.consumeAsString();
        boolean boolean27 = characterReader1.isEmpty();
        char char28 = characterReader1.current();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\uffff' + "'", char28 == '\uffff');
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
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
        boolean boolean24 = characterReader1.isEmpty();
        java.lang.String str25 = characterReader1.consumeHexSequence();
        boolean boolean27 = characterReader1.matchConsumeIgnoreCase("hi");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray2 = new char[] {};
        boolean boolean3 = characterReader1.matchesAny(charArray2);
        characterReader1.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader6 = new org.jsoup.parser.CharacterReader("");
        characterReader6.rewindToMark();
        java.lang.String str8 = characterReader6.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str13 = characterReader12.consumeLetterSequence();
        characterReader12.rewindToMark();
        char[] charArray17 = new char[] { '\uffff', 'a' };
        java.lang.String str18 = characterReader12.consumeToAny(charArray17);
        boolean boolean19 = characterReader10.matchesAny(charArray17);
        java.lang.String str20 = characterReader6.consumeToAny(charArray17);
        java.lang.String str21 = characterReader1.consumeToAny(charArray17);
        characterReader1.rewindToMark();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = characterReader1.consumeTo('a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matches('a');
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("");
        char char8 = characterReader1.current();
        boolean boolean9 = characterReader1.isEmpty();
        boolean boolean11 = characterReader1.matches("hi");
        char char12 = characterReader1.consume();
        java.lang.Class<?> wildcardClass13 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\uffff' + "'", char12 == '\uffff');
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
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
        characterReader1.advance();
        char char20 = characterReader1.consume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = characterReader1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\uffff' + "'", char20 == '\uffff');
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        characterReader1.rewindToMark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str7 = characterReader1.consumeTo("");
        java.lang.String str8 = characterReader1.consumeHexSequence();
        characterReader1.unconsume();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        characterReader1.unconsume();
        boolean boolean6 = characterReader1.matchesIgnoreCase("");
        char char7 = characterReader1.current();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        characterReader9.rewindToMark();
        characterReader9.mark();
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        char[] charArray18 = new char[] { '#', 'a', '\uffff', 'a' };
        boolean boolean19 = characterReader13.matchesAny(charArray18);
        boolean boolean20 = characterReader9.matchesAny(charArray18);
        boolean boolean21 = characterReader1.matchesAny(charArray18);
        java.lang.String str22 = characterReader1.toString();
        java.lang.String str23 = characterReader1.consumeDigitSequence();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeDigitSequence();
        char char3 = characterReader1.current();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'h' + "'", char3 == 'h');
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader4 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str5 = characterReader4.consumeLetterSequence();
        java.lang.String str6 = characterReader4.consumeDigitSequence();
        characterReader4.rewindToMark();
        java.lang.String str8 = characterReader4.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        char[] charArray11 = new char[] {};
        boolean boolean12 = characterReader10.matchesAny(charArray11);
        java.lang.String str13 = characterReader4.consumeToAny(charArray11);
        java.lang.String str14 = characterReader1.consumeToAny(charArray11);
        java.lang.String str15 = characterReader1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = characterReader1.consumeTo('#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        boolean boolean4 = characterReader1.isEmpty();
        boolean boolean6 = characterReader1.matches("hi!");
        boolean boolean7 = characterReader1.matchesDigit();
        java.lang.Class<?> wildcardClass8 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        java.lang.String str6 = characterReader1.consumeHexSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean4 = characterReader1.matchesLetter();
        boolean boolean5 = characterReader1.matchesLetter();
        char[] charArray6 = new char[] {};
        boolean boolean7 = characterReader1.matchesAny(charArray6);
        boolean boolean9 = characterReader1.matches('\uffff');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str4 = characterReader1.consumeTo("");
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean8 = characterReader1.matchConsume("");
        char char9 = characterReader1.current();
        boolean boolean11 = characterReader1.matchConsumeIgnoreCase("!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = characterReader1.consumeTo('\uffff');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        characterReader1.rewindToMark();
        boolean boolean5 = characterReader1.matchesDigit();
        java.lang.String str6 = characterReader1.consumeAsString();
        java.lang.Class<?> wildcardClass7 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
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
        boolean boolean20 = characterReader1.matches("");
        char[] charArray21 = null;
        java.lang.String str22 = characterReader1.consumeToAny(charArray21);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str4 = characterReader1.consumeTo("");
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        int int4 = characterReader1.pos();
        java.lang.String str5 = characterReader1.consumeLetterSequence();
        java.lang.String str6 = characterReader1.consumeHexSequence();
        characterReader1.unconsume();
        java.lang.String str8 = characterReader1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i!" + "'", str8, "i!");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matches('a');
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("");
        char char8 = characterReader1.current();
        boolean boolean9 = characterReader1.isEmpty();
        boolean boolean11 = characterReader1.matches("hi");
        char char12 = characterReader1.consume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = characterReader1.consumeLetterSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\uffff' + "'", char12 == '\uffff');
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader4 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str5 = characterReader4.consumeLetterSequence();
        java.lang.String str6 = characterReader4.consumeDigitSequence();
        characterReader4.rewindToMark();
        java.lang.String str8 = characterReader4.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        char[] charArray11 = new char[] {};
        boolean boolean12 = characterReader10.matchesAny(charArray11);
        java.lang.String str13 = characterReader4.consumeToAny(charArray11);
        java.lang.String str14 = characterReader1.consumeToAny(charArray11);
        java.lang.String str15 = characterReader1.toString();
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str18 = characterReader17.consumeHexSequence();
        boolean boolean20 = characterReader17.matchConsumeIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("");
        characterReader22.rewindToMark();
        boolean boolean25 = characterReader22.matches("");
        java.lang.String str26 = characterReader22.consumeHexSequence();
        characterReader22.advance();
        org.jsoup.parser.CharacterReader characterReader29 = new org.jsoup.parser.CharacterReader("");
        char[] charArray34 = new char[] { '#', 'a', '\uffff', 'a' };
        boolean boolean35 = characterReader29.matchesAny(charArray34);
        boolean boolean36 = characterReader22.matchesAny(charArray34);
        boolean boolean37 = characterReader17.matchesAny(charArray34);
        java.lang.String str38 = characterReader1.consumeToAny(charArray34);
        java.lang.Class<?> wildcardClass39 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchesIgnoreCase("!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        char[] charArray6 = new char[] { '\uffff', 'a' };
        java.lang.String str7 = characterReader1.consumeToAny(charArray6);
        char char8 = characterReader1.consume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.consumeTo('!');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str9 = characterReader1.toString();
        boolean boolean11 = characterReader1.matches('#');
        characterReader1.unconsume();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        characterReader1.rewindToMark();
        char char8 = characterReader1.current();
        java.lang.String str9 = characterReader1.consumeDigitSequence();
        boolean boolean11 = characterReader1.matches("hi!");
        java.lang.String str13 = characterReader1.consumeTo("");
        boolean boolean15 = characterReader1.containsIgnoreCase("i");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        boolean boolean5 = characterReader1.matchConsume("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = characterReader1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader4 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str5 = characterReader4.consumeLetterSequence();
        java.lang.String str6 = characterReader4.consumeDigitSequence();
        characterReader4.rewindToMark();
        java.lang.String str8 = characterReader4.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        char[] charArray11 = new char[] {};
        boolean boolean12 = characterReader10.matchesAny(charArray11);
        java.lang.String str13 = characterReader4.consumeToAny(charArray11);
        java.lang.String str14 = characterReader1.consumeToAny(charArray11);
        java.lang.String str15 = characterReader1.toString();
        boolean boolean17 = characterReader1.containsIgnoreCase("i!");
        java.lang.Class<?> wildcardClass18 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = characterReader1.consumeHexSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        int int4 = characterReader1.pos();
        java.lang.String str5 = characterReader1.consumeDigitSequence();
        java.lang.Class<?> wildcardClass6 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader5 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str8 = characterReader7.consumeLetterSequence();
        characterReader7.rewindToMark();
        char[] charArray12 = new char[] { '\uffff', 'a' };
        java.lang.String str13 = characterReader7.consumeToAny(charArray12);
        boolean boolean14 = characterReader5.matchesAny(charArray12);
        java.lang.String str15 = characterReader1.consumeToAny(charArray12);
        boolean boolean17 = characterReader1.matches("!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
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
        boolean boolean19 = characterReader1.matchesDigit();
        characterReader1.mark();
        boolean boolean22 = characterReader1.matchConsume("");
        java.lang.String str23 = characterReader1.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("");
        characterReader25.rewindToMark();
        characterReader25.mark();
        org.jsoup.parser.CharacterReader characterReader29 = new org.jsoup.parser.CharacterReader("");
        char[] charArray34 = new char[] { '#', 'a', '\uffff', 'a' };
        boolean boolean35 = characterReader29.matchesAny(charArray34);
        boolean boolean36 = characterReader25.matchesAny(charArray34);
        java.lang.String str37 = characterReader1.consumeToAny(charArray34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = characterReader1.consumeTo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matches('a');
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("");
        char char8 = characterReader1.current();
        boolean boolean9 = characterReader1.isEmpty();
        boolean boolean11 = characterReader1.matches("hi");
        java.lang.String str12 = characterReader1.consumeAsString();
        java.lang.Class<?> wildcardClass13 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        char char7 = characterReader1.current();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        boolean boolean10 = characterReader1.containsIgnoreCase("hi");
        java.lang.Class<?> wildcardClass11 = characterReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = characterReader1.consumeTo("h");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        java.lang.String str4 = characterReader1.consumeLetterSequence();
        boolean boolean6 = characterReader1.matchConsumeIgnoreCase("hi!");
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = characterReader1.consumeTo('4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        boolean boolean4 = characterReader1.isEmpty();
        boolean boolean6 = characterReader1.matches("hi");
        characterReader1.mark();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = characterReader1.consumeDigitSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        characterReader1.advance();
        char char6 = characterReader1.consume();
        int int7 = characterReader1.pos();
        boolean boolean9 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean11 = characterReader1.matches(' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'i' + "'", char6 == 'i');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
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
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        boolean boolean7 = characterReader1.containsIgnoreCase("");
        characterReader1.unconsume();
        boolean boolean9 = characterReader1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = characterReader1.consumeTo(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        characterReader1.rewindToMark();
        boolean boolean6 = characterReader1.matchConsumeIgnoreCase("hi");
        java.lang.Class<?> wildcardClass7 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str9 = characterReader1.toString();
        java.lang.String str10 = characterReader1.consumeAsString();
        boolean boolean12 = characterReader1.containsIgnoreCase("!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = characterReader1.consumeHexSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        boolean boolean5 = characterReader1.matchConsume("hi!");
        char char6 = characterReader1.current();
        characterReader1.mark();
        boolean boolean9 = characterReader1.matches('#');
        characterReader1.unconsume();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\uffff' + "'", char6 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("h");
        boolean boolean2 = characterReader1.matchesDigit();
        boolean boolean3 = characterReader1.matchesDigit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        char[] charArray6 = new char[] { '\uffff', 'a' };
        java.lang.String str7 = characterReader1.consumeToAny(charArray6);
        boolean boolean9 = characterReader1.matchesIgnoreCase("");
        char char10 = characterReader1.consume();
        java.lang.Class<?> wildcardClass11 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\uffff' + "'", char10 == '\uffff');
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
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
        boolean boolean19 = characterReader1.matchesDigit();
        characterReader1.mark();
        boolean boolean22 = characterReader1.matchConsume("");
        java.lang.String str23 = characterReader1.consumeDigitSequence();
        boolean boolean24 = characterReader1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = characterReader1.consumeTo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        int int9 = characterReader1.pos();
        boolean boolean11 = characterReader1.matches("hi!");
        java.lang.String str12 = characterReader1.consumeAsString();
        boolean boolean14 = characterReader1.matchConsumeIgnoreCase("hi!");
        boolean boolean16 = characterReader1.matches('!');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = characterReader1.consumeTo("!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str4 = characterReader1.consumeTo("");
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean8 = characterReader1.matchConsume("");
        char char9 = characterReader1.current();
        boolean boolean10 = characterReader1.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        characterReader12.rewindToMark();
        boolean boolean15 = characterReader12.matches("");
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str18 = characterReader17.consumeLetterSequence();
        java.lang.String str19 = characterReader17.consumeDigitSequence();
        characterReader17.rewindToMark();
        java.lang.String str21 = characterReader17.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        char[] charArray24 = new char[] {};
        boolean boolean25 = characterReader23.matchesAny(charArray24);
        java.lang.String str26 = characterReader17.consumeToAny(charArray24);
        boolean boolean27 = characterReader12.matchesAny(charArray24);
        java.lang.String str28 = characterReader1.consumeToAny(charArray24);
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = characterReader1.consumeHexSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
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
        java.lang.String str26 = characterReader1.consumeAsString();
        characterReader1.rewindToMark();
        java.lang.String str28 = characterReader1.consumeLetterSequence();
        boolean boolean30 = characterReader1.matchConsume("i");
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        characterReader1.unconsume();
        boolean boolean6 = characterReader1.matchesIgnoreCase("");
        char char7 = characterReader1.current();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        characterReader9.rewindToMark();
        characterReader9.mark();
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        char[] charArray18 = new char[] { '#', 'a', '\uffff', 'a' };
        boolean boolean19 = characterReader13.matchesAny(charArray18);
        boolean boolean20 = characterReader9.matchesAny(charArray18);
        boolean boolean21 = characterReader1.matchesAny(charArray18);
        java.lang.String str22 = characterReader1.toString();
        boolean boolean24 = characterReader1.containsIgnoreCase("");
        char[] charArray30 = new char[] { '!', '#', 'i', 'i', '#' };
        java.lang.String str31 = characterReader1.consumeToAny(charArray30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { '!', '#', 'i', 'i', '#' });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str9 = characterReader1.consumeDigitSequence();
        characterReader1.mark();
        java.lang.String str11 = characterReader1.consumeLetterSequence();
        java.lang.String str12 = characterReader1.consumeDigitSequence();
        characterReader1.rewindToMark();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        java.lang.String str6 = characterReader1.consumeHexSequence();
        characterReader1.mark();
        boolean boolean9 = characterReader1.matchConsumeIgnoreCase("!");
        boolean boolean10 = characterReader1.matchesLetter();
        characterReader1.advance();
        characterReader1.mark();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = characterReader1.consumeTo('\uffff');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        boolean boolean3 = characterReader1.matchesLetter();
        characterReader1.advance();
        boolean boolean6 = characterReader1.matches('\uffff');
        java.lang.Class<?> wildcardClass7 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        char[] charArray6 = new char[] { '\uffff', 'a' };
        java.lang.String str7 = characterReader1.consumeToAny(charArray6);
        boolean boolean9 = characterReader1.matchesIgnoreCase("");
        char char10 = characterReader1.consume();
        char char11 = characterReader1.current();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\uffff' + "'", char10 == '\uffff');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\uffff' + "'", char11 == '\uffff');
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        characterReader1.rewindToMark();
        char char8 = characterReader1.current();
        java.lang.String str9 = characterReader1.consumeDigitSequence();
        boolean boolean10 = characterReader1.matchesDigit();
        boolean boolean12 = characterReader1.matches('\uffff');
        characterReader1.unconsume();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        java.lang.String str6 = characterReader1.consumeHexSequence();
        boolean boolean8 = characterReader1.containsIgnoreCase("");
        boolean boolean10 = characterReader1.matches("hi!");
        boolean boolean12 = characterReader1.containsIgnoreCase("hi!");
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = characterReader1.consumeDigitSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        boolean boolean3 = characterReader1.matchesLetter();
        characterReader1.advance();
        boolean boolean6 = characterReader1.matches('\uffff');
        boolean boolean7 = characterReader1.matchesDigit();
        boolean boolean9 = characterReader1.containsIgnoreCase("i");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.consumeLetterSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader5 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str8 = characterReader7.consumeLetterSequence();
        characterReader7.rewindToMark();
        char[] charArray12 = new char[] { '\uffff', 'a' };
        java.lang.String str13 = characterReader7.consumeToAny(charArray12);
        boolean boolean14 = characterReader5.matchesAny(charArray12);
        java.lang.String str15 = characterReader1.consumeToAny(charArray12);
        boolean boolean17 = characterReader1.matchConsumeIgnoreCase("");
        int int18 = characterReader1.pos();
        boolean boolean20 = characterReader1.matchConsumeIgnoreCase("i!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = characterReader1.consumeTo('4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
        java.lang.String str26 = characterReader1.consumeAsString();
        boolean boolean27 = characterReader1.isEmpty();
        boolean boolean29 = characterReader1.matches("hi");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = characterReader1.consumeHexSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        characterReader1.rewindToMark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        boolean boolean6 = characterReader1.matchesLetter();
        char char7 = characterReader1.current();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = characterReader1.consumeTo('i');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        boolean boolean4 = characterReader1.isEmpty();
        characterReader1.advance();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        int int2 = characterReader1.pos();
        java.lang.String str3 = characterReader1.consumeToEnd();
        characterReader1.mark();
        boolean boolean5 = characterReader1.matchesLetter();
        boolean boolean7 = characterReader1.matchConsume("i!");
        boolean boolean9 = characterReader1.containsIgnoreCase("hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
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
        boolean boolean27 = characterReader1.matchConsumeIgnoreCase("hi");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = characterReader1.consumeTo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("h");
        boolean boolean2 = characterReader1.matchesDigit();
        java.lang.Class<?> wildcardClass3 = characterReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray2 = new char[] {};
        boolean boolean3 = characterReader1.matchesAny(charArray2);
        int int4 = characterReader1.pos();
        boolean boolean5 = characterReader1.matchesLetter();
        characterReader1.mark();
        characterReader1.rewindToMark();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        characterReader1.advance();
        boolean boolean8 = characterReader1.matches('4');
        char char9 = characterReader1.consume();
        char char10 = characterReader1.current();
        char char11 = characterReader1.consume();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\uffff' + "'", char10 == '\uffff');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\uffff' + "'", char11 == '\uffff');
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        int int2 = characterReader1.pos();
        java.lang.String str3 = characterReader1.consumeToEnd();
        java.lang.String str4 = characterReader1.consumeDigitSequence();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = characterReader1.consumeTo("h");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 3, end 2, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        boolean boolean9 = characterReader1.matchesDigit();
        characterReader1.advance();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
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
        boolean boolean30 = characterReader1.matchesDigit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        boolean boolean5 = characterReader1.matchConsume("hi!");
        char char6 = characterReader1.current();
        characterReader1.mark();
        boolean boolean9 = characterReader1.matchConsumeIgnoreCase("h");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = characterReader1.consumeTo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\uffff' + "'", char6 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
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
        boolean boolean35 = characterReader1.isEmpty();
        characterReader1.advance();
        boolean boolean38 = characterReader1.matchesIgnoreCase("i");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = characterReader1.consumeTo('#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader5 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str8 = characterReader7.consumeLetterSequence();
        characterReader7.rewindToMark();
        char[] charArray12 = new char[] { '\uffff', 'a' };
        java.lang.String str13 = characterReader7.consumeToAny(charArray12);
        boolean boolean14 = characterReader5.matchesAny(charArray12);
        java.lang.String str15 = characterReader1.consumeToAny(charArray12);
        characterReader1.rewindToMark();
        char char17 = characterReader1.consume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\uffff' + "'", char17 == '\uffff');
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray2 = new char[] {};
        boolean boolean3 = characterReader1.matchesAny(charArray2);
        characterReader1.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader6 = new org.jsoup.parser.CharacterReader("");
        characterReader6.rewindToMark();
        java.lang.String str8 = characterReader6.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str13 = characterReader12.consumeLetterSequence();
        characterReader12.rewindToMark();
        char[] charArray17 = new char[] { '\uffff', 'a' };
        java.lang.String str18 = characterReader12.consumeToAny(charArray17);
        boolean boolean19 = characterReader10.matchesAny(charArray17);
        java.lang.String str20 = characterReader6.consumeToAny(charArray17);
        java.lang.String str21 = characterReader1.consumeToAny(charArray17);
        boolean boolean23 = characterReader1.matchConsumeIgnoreCase("hi");
        boolean boolean25 = characterReader1.containsIgnoreCase("");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
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
        boolean boolean19 = characterReader1.matchesDigit();
        characterReader1.mark();
        boolean boolean22 = characterReader1.matchConsume("");
        java.lang.String str23 = characterReader1.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("");
        characterReader25.rewindToMark();
        characterReader25.mark();
        org.jsoup.parser.CharacterReader characterReader29 = new org.jsoup.parser.CharacterReader("");
        char[] charArray34 = new char[] { '#', 'a', '\uffff', 'a' };
        boolean boolean35 = characterReader29.matchesAny(charArray34);
        boolean boolean36 = characterReader25.matchesAny(charArray34);
        java.lang.String str37 = characterReader1.consumeToAny(charArray34);
        char char38 = characterReader1.consume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = characterReader1.consumeTo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + char38 + "' != '" + '\uffff' + "'", char38 == '\uffff');
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        characterReader1.rewindToMark();
        char char8 = characterReader1.current();
        java.lang.String str9 = characterReader1.consumeAsString();
        boolean boolean11 = characterReader1.containsIgnoreCase("i");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = characterReader1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        java.lang.String str4 = characterReader1.consumeLetterSequence();
        boolean boolean6 = characterReader1.matchConsumeIgnoreCase("hi!");
        characterReader1.mark();
        char char8 = characterReader1.current();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        java.lang.String str4 = characterReader1.toString();
        boolean boolean6 = characterReader1.matches("hi");
        boolean boolean8 = characterReader1.containsIgnoreCase("!");
        boolean boolean10 = characterReader1.matchConsumeIgnoreCase("");
        boolean boolean12 = characterReader1.containsIgnoreCase("i!");
        java.lang.String str13 = characterReader1.consumeLetterSequence();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!" + "'", str4, "!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        boolean boolean24 = characterReader1.isEmpty();
        java.lang.String str25 = characterReader1.consumeHexSequence();
        int int26 = characterReader1.pos();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = characterReader1.consumeTo("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        boolean boolean24 = characterReader1.isEmpty();
        java.lang.String str25 = characterReader1.consumeHexSequence();
        boolean boolean27 = characterReader1.matchConsumeIgnoreCase("hi");
        characterReader1.rewindToMark();
        java.lang.String str29 = characterReader1.consumeHexSequence();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        char[] charArray6 = new char[] { '\uffff', 'a' };
        java.lang.String str7 = characterReader1.consumeToAny(charArray6);
        boolean boolean9 = characterReader1.matchConsume("hi!");
        java.lang.Class<?> wildcardClass10 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        java.lang.String str4 = characterReader1.toString();
        boolean boolean6 = characterReader1.matches("hi");
        int int7 = characterReader1.pos();
        boolean boolean8 = characterReader1.matchesLetter();
        boolean boolean10 = characterReader1.matchConsume("hi!");
        java.lang.String str11 = characterReader1.toString();
        java.lang.String str12 = characterReader1.consumeHexSequence();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!" + "'", str4, "!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "!" + "'", str11, "!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        int int4 = characterReader1.pos();
        boolean boolean6 = characterReader1.matchesIgnoreCase("");
        java.lang.String str8 = characterReader1.consumeTo('4');
        boolean boolean10 = characterReader1.matches('#');
        boolean boolean12 = characterReader1.matches('4');
        java.lang.String str13 = characterReader1.consumeDigitSequence();
        char[] charArray14 = null;
        boolean boolean15 = characterReader1.matchesAny(charArray14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str9 = characterReader1.toString();
        java.lang.String str10 = characterReader1.consumeAsString();
        boolean boolean12 = characterReader1.containsIgnoreCase("!");
        char char13 = characterReader1.consume();
        boolean boolean14 = characterReader1.matchesLetter();
        java.lang.Class<?> wildcardClass15 = characterReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\uffff' + "'", char13 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader3 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str4 = characterReader3.consumeLetterSequence();
        characterReader3.rewindToMark();
        char[] charArray8 = new char[] { '\uffff', 'a' };
        java.lang.String str9 = characterReader3.consumeToAny(charArray8);
        boolean boolean10 = characterReader1.matchesAny(charArray8);
        boolean boolean12 = characterReader1.matches('#');
        boolean boolean14 = characterReader1.matches('a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
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
        boolean boolean19 = characterReader1.matchesDigit();
        characterReader1.mark();
        java.lang.String str21 = characterReader1.consumeLetterSequence();
        boolean boolean23 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean25 = characterReader1.containsIgnoreCase("hi!");
        int int26 = characterReader1.pos();
        java.lang.String str27 = characterReader1.toString();
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        characterReader1.rewindToMark();
        char char8 = characterReader1.current();
        char char9 = characterReader1.consume();
        characterReader1.advance();
        boolean boolean12 = characterReader1.matchesIgnoreCase("h");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = characterReader1.consumeLetterSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 2, end 2, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        boolean boolean3 = characterReader1.matchesLetter();
        java.lang.String str4 = characterReader1.consumeAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
        boolean boolean19 = characterReader1.matchConsumeIgnoreCase("h");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        characterReader1.advance();
        boolean boolean9 = characterReader1.matchesIgnoreCase("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.consumeHexSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 2, end 2, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray6 = new char[] { '#', 'a', '\uffff', 'a' };
        boolean boolean7 = characterReader1.matchesAny(charArray6);
        characterReader1.rewindToMark();
        int int9 = characterReader1.pos();
        java.lang.Class<?> wildcardClass10 = characterReader1.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader3 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str4 = characterReader3.consumeLetterSequence();
        characterReader3.rewindToMark();
        char[] charArray8 = new char[] { '\uffff', 'a' };
        java.lang.String str9 = characterReader3.consumeToAny(charArray8);
        boolean boolean10 = characterReader1.matchesAny(charArray8);
        boolean boolean12 = characterReader1.matches('#');
        boolean boolean13 = characterReader1.isEmpty();
        char char14 = characterReader1.consume();
        characterReader1.rewindToMark();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\uffff' + "'", char14 == '\uffff');
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
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
        java.lang.String str26 = characterReader1.consumeAsString();
        boolean boolean27 = characterReader1.isEmpty();
        boolean boolean29 = characterReader1.matches("hi");
        boolean boolean30 = characterReader1.matchesLetter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = characterReader1.consumeTo("h");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
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
        characterReader1.advance();
        boolean boolean21 = characterReader1.matches("i");
        boolean boolean23 = characterReader1.matches('!');
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
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
        java.lang.Class<?> wildcardClass29 = characterReader1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
        boolean boolean19 = characterReader1.matchesDigit();
        characterReader1.mark();
        boolean boolean22 = characterReader1.matchConsume("");
        boolean boolean23 = characterReader1.isEmpty();
        boolean boolean24 = characterReader1.matchesDigit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
        boolean boolean30 = characterReader1.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str33 = characterReader32.consumeLetterSequence();
        char char34 = characterReader32.consume();
        characterReader32.unconsume();
        boolean boolean37 = characterReader32.matchesIgnoreCase("");
        java.lang.String str38 = characterReader32.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader40 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str41 = characterReader40.consumeLetterSequence();
        characterReader40.rewindToMark();
        char[] charArray45 = new char[] { '\uffff', 'a' };
        java.lang.String str46 = characterReader40.consumeToAny(charArray45);
        java.lang.String str47 = characterReader32.consumeToAny(charArray45);
        java.lang.String str48 = characterReader1.consumeToAny(charArray45);
        boolean boolean50 = characterReader1.matchesIgnoreCase("hi");
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + char34 + "' != '" + '\uffff' + "'", char34 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        characterReader1.rewindToMark();
        char char5 = characterReader1.consume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = characterReader1.consumeTo('h');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\uffff' + "'", char5 == '\uffff');
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
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
        java.lang.String str19 = characterReader1.consumeDigitSequence();
        boolean boolean21 = characterReader1.matches('#');
        boolean boolean23 = characterReader1.containsIgnoreCase("");
        int int24 = characterReader1.pos();
        java.lang.Class<?> wildcardClass25 = characterReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.unconsume();
        java.lang.String str9 = characterReader1.consumeHexSequence();
        boolean boolean11 = characterReader1.matches("");
        java.lang.String str12 = characterReader1.consumeAsString();
        int int13 = characterReader1.pos();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        characterReader1.rewindToMark();
        boolean boolean6 = characterReader1.matchConsumeIgnoreCase("hi");
        java.lang.String str7 = characterReader1.consumeHexSequence();
        java.lang.Class<?> wildcardClass8 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        int int4 = characterReader1.pos();
        java.lang.String str5 = characterReader1.consumeLetterSequence();
        java.lang.String str6 = characterReader1.consumeHexSequence();
        characterReader1.unconsume();
        java.lang.String str8 = characterReader1.consumeDigitSequence();
        int int9 = characterReader1.pos();
        java.lang.String str10 = characterReader1.consumeDigitSequence();
        boolean boolean11 = characterReader1.isEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        boolean boolean25 = characterReader1.matches(' ');
        boolean boolean27 = characterReader1.matches("hi!");
        boolean boolean29 = characterReader1.matches("!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = characterReader1.consumeTo('h');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        boolean boolean10 = characterReader1.matchConsume("");
        boolean boolean12 = characterReader1.matchConsume("hi");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        java.lang.String str4 = characterReader1.consumeLetterSequence();
        boolean boolean6 = characterReader1.matchConsumeIgnoreCase("hi!");
        characterReader1.advance();
        boolean boolean9 = characterReader1.matchesIgnoreCase("hi");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.consumeLetterSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        characterReader1.rewindToMark();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        char char9 = characterReader1.current();
        org.jsoup.parser.CharacterReader characterReader11 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str12 = characterReader11.consumeLetterSequence();
        characterReader11.rewindToMark();
        characterReader11.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader18 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str19 = characterReader18.consumeLetterSequence();
        characterReader18.rewindToMark();
        char[] charArray23 = new char[] { '\uffff', 'a' };
        java.lang.String str24 = characterReader18.consumeToAny(charArray23);
        boolean boolean25 = characterReader16.matchesAny(charArray23);
        boolean boolean26 = characterReader11.matchesAny(charArray23);
        boolean boolean27 = characterReader1.matchesAny(charArray23);
        boolean boolean29 = characterReader1.matchesIgnoreCase("!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        characterReader1.rewindToMark();
        java.lang.String str5 = characterReader1.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        characterReader7.rewindToMark();
        boolean boolean10 = characterReader7.matches("");
        java.lang.String str11 = characterReader7.consumeHexSequence();
        java.lang.String str12 = characterReader7.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader14 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str17 = characterReader16.consumeLetterSequence();
        characterReader16.rewindToMark();
        char[] charArray21 = new char[] { '\uffff', 'a' };
        java.lang.String str22 = characterReader16.consumeToAny(charArray21);
        boolean boolean23 = characterReader14.matchesAny(charArray21);
        java.lang.String str24 = characterReader7.consumeToAny(charArray21);
        java.lang.String str25 = characterReader1.consumeToAny(charArray21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        java.lang.String str4 = characterReader1.consumeAsString();
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 2, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        characterReader1.rewindToMark();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        char char9 = characterReader1.current();
        org.jsoup.parser.CharacterReader characterReader11 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str12 = characterReader11.consumeLetterSequence();
        characterReader11.rewindToMark();
        characterReader11.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader18 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str19 = characterReader18.consumeLetterSequence();
        characterReader18.rewindToMark();
        char[] charArray23 = new char[] { '\uffff', 'a' };
        java.lang.String str24 = characterReader18.consumeToAny(charArray23);
        boolean boolean25 = characterReader16.matchesAny(charArray23);
        boolean boolean26 = characterReader11.matchesAny(charArray23);
        boolean boolean27 = characterReader1.matchesAny(charArray23);
        boolean boolean28 = characterReader1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
        java.lang.String str26 = characterReader1.consumeAsString();
        boolean boolean27 = characterReader1.isEmpty();
        org.jsoup.parser.CharacterReader characterReader29 = new org.jsoup.parser.CharacterReader("");
        characterReader29.rewindToMark();
        boolean boolean32 = characterReader29.matches("");
        org.jsoup.parser.CharacterReader characterReader34 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str35 = characterReader34.consumeLetterSequence();
        java.lang.String str36 = characterReader34.consumeDigitSequence();
        characterReader34.rewindToMark();
        java.lang.String str38 = characterReader34.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader40 = new org.jsoup.parser.CharacterReader("");
        char[] charArray41 = new char[] {};
        boolean boolean42 = characterReader40.matchesAny(charArray41);
        java.lang.String str43 = characterReader34.consumeToAny(charArray41);
        boolean boolean44 = characterReader29.matchesAny(charArray41);
        java.lang.String str45 = characterReader1.consumeToAny(charArray41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str46 = characterReader1.consumeLetterSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        java.lang.String str6 = characterReader1.consumeHexSequence();
        boolean boolean8 = characterReader1.containsIgnoreCase("");
        boolean boolean9 = characterReader1.isEmpty();
        java.lang.Class<?> wildcardClass10 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        char[] charArray6 = new char[] { '\uffff', 'a' };
        java.lang.String str7 = characterReader1.consumeToAny(charArray6);
        boolean boolean9 = characterReader1.matchesIgnoreCase("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = characterReader1.consumeTo('#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        char[] charArray6 = new char[] { '\uffff', 'a' };
        java.lang.String str7 = characterReader1.consumeToAny(charArray6);
        boolean boolean9 = characterReader1.matchesIgnoreCase("");
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = characterReader1.matchesLetter();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
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
        boolean boolean19 = characterReader1.matchesDigit();
        characterReader1.mark();
        boolean boolean22 = characterReader1.matchConsume("");
        java.lang.String str23 = characterReader1.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("");
        characterReader25.rewindToMark();
        characterReader25.mark();
        org.jsoup.parser.CharacterReader characterReader29 = new org.jsoup.parser.CharacterReader("");
        char[] charArray34 = new char[] { '#', 'a', '\uffff', 'a' };
        boolean boolean35 = characterReader29.matchesAny(charArray34);
        boolean boolean36 = characterReader25.matchesAny(charArray34);
        java.lang.String str37 = characterReader1.consumeToAny(charArray34);
        java.lang.String str38 = characterReader1.consumeHexSequence();
        boolean boolean40 = characterReader1.matchConsume("!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
        java.lang.String str24 = characterReader1.consumeDigitSequence();
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = characterReader1.consumeTo("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end 0, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
        java.lang.String str26 = characterReader1.consumeAsString();
        boolean boolean27 = characterReader1.isEmpty();
        boolean boolean29 = characterReader1.matches("hi");
        boolean boolean30 = characterReader1.matchesDigit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = characterReader1.consumeDigitSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        boolean boolean5 = characterReader1.matchConsume("hi!");
        char char6 = characterReader1.current();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        characterReader8.rewindToMark();
        boolean boolean11 = characterReader8.matches("");
        java.lang.String str12 = characterReader8.consumeHexSequence();
        characterReader8.advance();
        characterReader8.rewindToMark();
        boolean boolean16 = characterReader8.matchConsume("hi");
        boolean boolean17 = characterReader8.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str20 = characterReader19.consumeLetterSequence();
        java.lang.String str21 = characterReader19.consumeDigitSequence();
        characterReader19.rewindToMark();
        java.lang.String str23 = characterReader19.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("");
        char[] charArray26 = new char[] {};
        boolean boolean27 = characterReader25.matchesAny(charArray26);
        java.lang.String str28 = characterReader19.consumeToAny(charArray26);
        java.lang.String str29 = characterReader8.consumeToAny(charArray26);
        boolean boolean30 = characterReader1.matchesAny(charArray26);
        boolean boolean32 = characterReader1.matchConsume("");
        char char33 = characterReader1.current();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = characterReader1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\uffff' + "'", char6 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '\uffff' + "'", char33 == '\uffff');
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        characterReader1.unconsume();
        boolean boolean6 = characterReader1.matchesIgnoreCase("");
        char char7 = characterReader1.current();
        java.lang.String str8 = characterReader1.consumeAsString();
        boolean boolean9 = characterReader1.isEmpty();
        boolean boolean10 = characterReader1.isEmpty();
        characterReader1.rewindToMark();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
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
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray2 = new char[] {};
        boolean boolean3 = characterReader1.matchesAny(charArray2);
        boolean boolean5 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str6 = characterReader1.consumeAsString();
        java.lang.Class<?> wildcardClass7 = characterReader1.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader5 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str8 = characterReader7.consumeLetterSequence();
        characterReader7.rewindToMark();
        char[] charArray12 = new char[] { '\uffff', 'a' };
        java.lang.String str13 = characterReader7.consumeToAny(charArray12);
        boolean boolean14 = characterReader5.matchesAny(charArray12);
        java.lang.String str15 = characterReader1.consumeToAny(charArray12);
        boolean boolean17 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str18 = characterReader1.consumeHexSequence();
        java.lang.String str19 = characterReader1.consumeLetterSequence();
        boolean boolean21 = characterReader1.matchConsumeIgnoreCase("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        java.lang.String str6 = characterReader1.consumeHexSequence();
        boolean boolean8 = characterReader1.containsIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str11 = characterReader10.consumeLetterSequence();
        java.lang.String str12 = characterReader10.toString();
        org.jsoup.parser.CharacterReader characterReader14 = new org.jsoup.parser.CharacterReader("");
        characterReader14.rewindToMark();
        boolean boolean17 = characterReader14.matches("");
        java.lang.String str18 = characterReader14.consumeHexSequence();
        java.lang.String str19 = characterReader14.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str24 = characterReader23.consumeLetterSequence();
        characterReader23.rewindToMark();
        char[] charArray28 = new char[] { '\uffff', 'a' };
        java.lang.String str29 = characterReader23.consumeToAny(charArray28);
        boolean boolean30 = characterReader21.matchesAny(charArray28);
        java.lang.String str31 = characterReader14.consumeToAny(charArray28);
        java.lang.String str32 = characterReader10.consumeToAny(charArray28);
        java.lang.String str33 = characterReader1.consumeToAny(charArray28);
        boolean boolean34 = characterReader1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
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
        java.lang.String str19 = characterReader1.consumeDigitSequence();
        java.lang.String str20 = characterReader1.consumeAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = characterReader1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        java.lang.String str6 = characterReader1.consumeHexSequence();
        boolean boolean8 = characterReader1.containsIgnoreCase("");
        boolean boolean10 = characterReader1.matches("hi!");
        boolean boolean12 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean14 = characterReader1.matches('a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        char[] charArray13 = new char[] { '#', 'a', '\uffff', 'a' };
        boolean boolean14 = characterReader8.matchesAny(charArray13);
        boolean boolean15 = characterReader1.matchesAny(charArray13);
        char char16 = characterReader1.consume();
        java.lang.Class<?> wildcardClass17 = characterReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\uffff' + "'", char16 == '\uffff');
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean4 = characterReader1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = characterReader1.consumeTo("hi");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = characterReader1.consumeTo("h");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 2, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
        boolean boolean19 = characterReader1.matchesDigit();
        characterReader1.mark();
        java.lang.String str21 = characterReader1.consumeLetterSequence();
        boolean boolean23 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean25 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean27 = characterReader1.matchesIgnoreCase("hi");
        org.jsoup.parser.CharacterReader characterReader29 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str30 = characterReader29.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str33 = characterReader32.consumeLetterSequence();
        java.lang.String str34 = characterReader32.consumeDigitSequence();
        characterReader32.rewindToMark();
        java.lang.String str36 = characterReader32.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader38 = new org.jsoup.parser.CharacterReader("");
        char[] charArray39 = new char[] {};
        boolean boolean40 = characterReader38.matchesAny(charArray39);
        java.lang.String str41 = characterReader32.consumeToAny(charArray39);
        java.lang.String str42 = characterReader29.consumeToAny(charArray39);
        java.lang.String str43 = characterReader29.toString();
        org.jsoup.parser.CharacterReader characterReader45 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str46 = characterReader45.consumeHexSequence();
        boolean boolean48 = characterReader45.matchConsumeIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader50 = new org.jsoup.parser.CharacterReader("");
        characterReader50.rewindToMark();
        boolean boolean53 = characterReader50.matches("");
        java.lang.String str54 = characterReader50.consumeHexSequence();
        characterReader50.advance();
        org.jsoup.parser.CharacterReader characterReader57 = new org.jsoup.parser.CharacterReader("");
        char[] charArray62 = new char[] { '#', 'a', '\uffff', 'a' };
        boolean boolean63 = characterReader57.matchesAny(charArray62);
        boolean boolean64 = characterReader50.matchesAny(charArray62);
        boolean boolean65 = characterReader45.matchesAny(charArray62);
        java.lang.String str66 = characterReader29.consumeToAny(charArray62);
        boolean boolean67 = characterReader1.matchesAny(charArray62);
        java.lang.String str68 = characterReader1.consumeAsString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        boolean boolean4 = characterReader1.isEmpty();
        boolean boolean6 = characterReader1.matches("hi");
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("!");
        boolean boolean10 = characterReader1.containsIgnoreCase("hi");
        boolean boolean12 = characterReader1.matches("i");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = characterReader1.consumeHexSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        boolean boolean3 = characterReader1.matchesLetter();
        java.lang.String str4 = characterReader1.consumeAsString();
        int int5 = characterReader1.pos();
        char char6 = characterReader1.consume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = characterReader1.consumeTo("h");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 2, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\uffff' + "'", char6 == '\uffff');
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        char[] charArray6 = new char[] { '\uffff', 'a' };
        java.lang.String str7 = characterReader1.consumeToAny(charArray6);
        boolean boolean9 = characterReader1.matchesIgnoreCase("");
        java.lang.String str10 = characterReader1.consumeLetterSequence();
        java.lang.String str11 = characterReader1.consumeHexSequence();
        java.lang.String str12 = characterReader1.consumeDigitSequence();
        java.lang.String str13 = characterReader1.consumeHexSequence();
        java.lang.Class<?> wildcardClass14 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
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
        boolean boolean30 = characterReader1.matchConsume("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = characterReader1.consumeTo('a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        characterReader1.unconsume();
        boolean boolean6 = characterReader1.matchesIgnoreCase("");
        boolean boolean7 = characterReader1.matchesLetter();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        java.lang.String str6 = characterReader1.consumeHexSequence();
        boolean boolean8 = characterReader1.containsIgnoreCase("");
        boolean boolean10 = characterReader1.matches("hi!");
        boolean boolean12 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str13 = characterReader1.toString();
        java.lang.String str14 = characterReader1.consumeDigitSequence();
        characterReader1.advance();
        characterReader1.mark();
        boolean boolean18 = characterReader1.matches('\uffff');
        boolean boolean19 = characterReader1.matchesLetter();
        characterReader1.advance();
        java.lang.Class<?> wildcardClass21 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.rewindToMark();
        characterReader1.unconsume();
        java.lang.Class<?> wildcardClass4 = characterReader1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        int int4 = characterReader1.pos();
        java.lang.String str5 = characterReader1.consumeLetterSequence();
        java.lang.String str6 = characterReader1.consumeHexSequence();
        characterReader1.unconsume();
        java.lang.String str8 = characterReader1.consumeDigitSequence();
        int int9 = characterReader1.pos();
        java.lang.String str10 = characterReader1.consumeDigitSequence();
        characterReader1.advance();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        characterReader1.advance();
        char char6 = characterReader1.consume();
        int int7 = characterReader1.pos();
        boolean boolean9 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean11 = characterReader1.matchConsume("hi!");
        java.lang.Class<?> wildcardClass12 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'i' + "'", char6 == 'i');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        boolean boolean5 = characterReader1.matchConsume("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = characterReader1.consumeLetterSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        characterReader1.rewindToMark();
        java.lang.String str5 = characterReader1.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        char[] charArray8 = new char[] {};
        boolean boolean9 = characterReader7.matchesAny(charArray8);
        java.lang.String str10 = characterReader1.consumeToAny(charArray8);
        characterReader1.rewindToMark();
        java.lang.String str12 = characterReader1.consumeAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = characterReader1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        char[] charArray6 = new char[] { '\uffff', 'a' };
        java.lang.String str7 = characterReader1.consumeToAny(charArray6);
        boolean boolean9 = characterReader1.matchesIgnoreCase("");
        characterReader1.unconsume();
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = characterReader1.consumeTo('i');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -2, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        boolean boolean5 = characterReader1.matchConsume("hi!");
        char char6 = characterReader1.current();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        characterReader8.rewindToMark();
        boolean boolean11 = characterReader8.matches("");
        java.lang.String str12 = characterReader8.consumeHexSequence();
        characterReader8.advance();
        characterReader8.rewindToMark();
        boolean boolean16 = characterReader8.matchConsume("hi");
        boolean boolean17 = characterReader8.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str20 = characterReader19.consumeLetterSequence();
        java.lang.String str21 = characterReader19.consumeDigitSequence();
        characterReader19.rewindToMark();
        java.lang.String str23 = characterReader19.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("");
        char[] charArray26 = new char[] {};
        boolean boolean27 = characterReader25.matchesAny(charArray26);
        java.lang.String str28 = characterReader19.consumeToAny(charArray26);
        java.lang.String str29 = characterReader8.consumeToAny(charArray26);
        boolean boolean30 = characterReader1.matchesAny(charArray26);
        boolean boolean32 = characterReader1.matchConsume("");
        char char33 = characterReader1.current();
        char char34 = characterReader1.consume();
        characterReader1.unconsume();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\uffff' + "'", char6 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '\uffff' + "'", char33 == '\uffff');
        org.junit.Assert.assertTrue("'" + char34 + "' != '" + '\uffff' + "'", char34 == '\uffff');
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader5 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str6 = characterReader5.consumeLetterSequence();
        java.lang.String str7 = characterReader5.toString();
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
        java.lang.String str27 = characterReader5.consumeToAny(charArray23);
        boolean boolean29 = characterReader5.matches('4');
        java.lang.String str30 = characterReader5.consumeAsString();
        boolean boolean31 = characterReader5.isEmpty();
        boolean boolean33 = characterReader5.matches("hi");
        org.jsoup.parser.CharacterReader characterReader35 = new org.jsoup.parser.CharacterReader("");
        char[] charArray36 = new char[] {};
        boolean boolean37 = characterReader35.matchesAny(charArray36);
        boolean boolean38 = characterReader5.matchesAny(charArray36);
        boolean boolean39 = characterReader1.matchesAny(charArray36);
        characterReader1.advance();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
        boolean boolean24 = characterReader1.isEmpty();
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = characterReader1.consumeHexSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        java.lang.String str4 = characterReader1.consumeAsString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        characterReader1.rewindToMark();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        java.lang.String str9 = characterReader1.consumeAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = characterReader1.consumeTo('!');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeDigitSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean4 = characterReader1.isEmpty();
        char char5 = characterReader1.consume();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\uffff' + "'", char5 == '\uffff');
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        boolean boolean30 = characterReader1.matches("hi");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = characterReader1.consumeTo(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 2, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        characterReader1.advance();
        boolean boolean8 = characterReader1.matches('4');
        boolean boolean9 = characterReader1.matchesLetter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.consumeHexSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        characterReader1.rewindToMark();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        char char9 = characterReader1.current();
        java.lang.String str10 = characterReader1.consumeLetterSequence();
        boolean boolean12 = characterReader1.matchesIgnoreCase("");
        boolean boolean13 = characterReader1.matchesLetter();
        java.lang.Class<?> wildcardClass14 = characterReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        int int2 = characterReader1.pos();
        characterReader1.advance();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = characterReader1.consumeTo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        characterReader1.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader6 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str9 = characterReader8.consumeLetterSequence();
        characterReader8.rewindToMark();
        char[] charArray13 = new char[] { '\uffff', 'a' };
        java.lang.String str14 = characterReader8.consumeToAny(charArray13);
        boolean boolean15 = characterReader6.matchesAny(charArray13);
        boolean boolean16 = characterReader1.matchesAny(charArray13);
        boolean boolean18 = characterReader1.matchConsumeIgnoreCase("hi!");
        characterReader1.mark();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = characterReader1.consumeTo("!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeDigitSequence();
        boolean boolean4 = characterReader1.matchConsume("hi!");
        java.lang.String str5 = characterReader1.consumeAsString();
        boolean boolean7 = characterReader1.matchesIgnoreCase("hi");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        characterReader1.rewindToMark();
        java.lang.String str5 = characterReader1.consumeAsString();
        boolean boolean6 = characterReader1.matchesDigit();
        boolean boolean8 = characterReader1.containsIgnoreCase("i!");
        java.lang.Class<?> wildcardClass9 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
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
        boolean boolean19 = characterReader1.matchesDigit();
        characterReader1.mark();
        java.lang.String str21 = characterReader1.consumeLetterSequence();
        boolean boolean23 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean25 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean27 = characterReader1.matchesIgnoreCase("hi");
        org.jsoup.parser.CharacterReader characterReader29 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str30 = characterReader29.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str33 = characterReader32.consumeLetterSequence();
        java.lang.String str34 = characterReader32.consumeDigitSequence();
        characterReader32.rewindToMark();
        java.lang.String str36 = characterReader32.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader38 = new org.jsoup.parser.CharacterReader("");
        char[] charArray39 = new char[] {};
        boolean boolean40 = characterReader38.matchesAny(charArray39);
        java.lang.String str41 = characterReader32.consumeToAny(charArray39);
        java.lang.String str42 = characterReader29.consumeToAny(charArray39);
        java.lang.String str43 = characterReader29.toString();
        org.jsoup.parser.CharacterReader characterReader45 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str46 = characterReader45.consumeHexSequence();
        boolean boolean48 = characterReader45.matchConsumeIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader50 = new org.jsoup.parser.CharacterReader("");
        characterReader50.rewindToMark();
        boolean boolean53 = characterReader50.matches("");
        java.lang.String str54 = characterReader50.consumeHexSequence();
        characterReader50.advance();
        org.jsoup.parser.CharacterReader characterReader57 = new org.jsoup.parser.CharacterReader("");
        char[] charArray62 = new char[] { '#', 'a', '\uffff', 'a' };
        boolean boolean63 = characterReader57.matchesAny(charArray62);
        boolean boolean64 = characterReader50.matchesAny(charArray62);
        boolean boolean65 = characterReader45.matchesAny(charArray62);
        java.lang.String str66 = characterReader29.consumeToAny(charArray62);
        boolean boolean67 = characterReader1.matchesAny(charArray62);
        characterReader1.advance();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str4 = characterReader1.consumeTo("");
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean8 = characterReader1.matches('i');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
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
        org.jsoup.parser.CharacterReader characterReader26 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str27 = characterReader26.consumeLetterSequence();
        characterReader26.rewindToMark();
        char[] charArray31 = new char[] { '\uffff', 'a' };
        java.lang.String str32 = characterReader26.consumeToAny(charArray31);
        boolean boolean34 = characterReader26.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader36 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str37 = characterReader36.consumeLetterSequence();
        java.lang.String str38 = characterReader36.toString();
        org.jsoup.parser.CharacterReader characterReader40 = new org.jsoup.parser.CharacterReader("");
        characterReader40.rewindToMark();
        boolean boolean43 = characterReader40.matches("");
        java.lang.String str44 = characterReader40.consumeHexSequence();
        java.lang.String str45 = characterReader40.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader47 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader49 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str50 = characterReader49.consumeLetterSequence();
        characterReader49.rewindToMark();
        char[] charArray54 = new char[] { '\uffff', 'a' };
        java.lang.String str55 = characterReader49.consumeToAny(charArray54);
        boolean boolean56 = characterReader47.matchesAny(charArray54);
        java.lang.String str57 = characterReader40.consumeToAny(charArray54);
        java.lang.String str58 = characterReader36.consumeToAny(charArray54);
        boolean boolean60 = characterReader36.matches('4');
        java.lang.String str61 = characterReader36.consumeAsString();
        boolean boolean62 = characterReader36.isEmpty();
        org.jsoup.parser.CharacterReader characterReader64 = new org.jsoup.parser.CharacterReader("");
        characterReader64.rewindToMark();
        boolean boolean67 = characterReader64.matches("");
        org.jsoup.parser.CharacterReader characterReader69 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str70 = characterReader69.consumeLetterSequence();
        java.lang.String str71 = characterReader69.consumeDigitSequence();
        characterReader69.rewindToMark();
        java.lang.String str73 = characterReader69.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader75 = new org.jsoup.parser.CharacterReader("");
        char[] charArray76 = new char[] {};
        boolean boolean77 = characterReader75.matchesAny(charArray76);
        java.lang.String str78 = characterReader69.consumeToAny(charArray76);
        boolean boolean79 = characterReader64.matchesAny(charArray76);
        java.lang.String str80 = characterReader36.consumeToAny(charArray76);
        boolean boolean81 = characterReader26.matchesAny(charArray76);
        boolean boolean82 = characterReader1.matchesAny(charArray76);
        boolean boolean84 = characterReader1.containsIgnoreCase("i!");
        java.lang.String str85 = characterReader1.consumeHexSequence();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(charArray76);
        org.junit.Assert.assertArrayEquals(charArray76, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
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
        boolean boolean19 = characterReader1.matchesDigit();
        characterReader1.mark();
        java.lang.String str21 = characterReader1.consumeLetterSequence();
        boolean boolean23 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean24 = characterReader1.isEmpty();
        boolean boolean25 = characterReader1.matchesLetter();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        boolean boolean5 = characterReader1.matchConsume("hi!");
        char char6 = characterReader1.current();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = characterReader1.consumeHexSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\uffff' + "'", char6 == '\uffff');
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        characterReader1.advance();
        boolean boolean9 = characterReader1.matchesIgnoreCase("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 2, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        java.lang.String str6 = characterReader1.consumeHexSequence();
        characterReader1.mark();
        boolean boolean9 = characterReader1.matchConsumeIgnoreCase("!");
        boolean boolean10 = characterReader1.matchesLetter();
        characterReader1.advance();
        characterReader1.mark();
        boolean boolean14 = characterReader1.matches("i!");
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        characterReader16.rewindToMark();
        boolean boolean19 = characterReader16.matches('4');
        java.lang.String str20 = characterReader16.consumeHexSequence();
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str23 = characterReader22.consumeLetterSequence();
        characterReader22.rewindToMark();
        characterReader22.advance();
        characterReader22.rewindToMark();
        java.lang.String str27 = characterReader22.toString();
        org.jsoup.parser.CharacterReader characterReader29 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str30 = characterReader29.consumeLetterSequence();
        java.lang.String str31 = characterReader29.toString();
        org.jsoup.parser.CharacterReader characterReader33 = new org.jsoup.parser.CharacterReader("");
        characterReader33.rewindToMark();
        boolean boolean36 = characterReader33.matches("");
        java.lang.String str37 = characterReader33.consumeHexSequence();
        java.lang.String str38 = characterReader33.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader40 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader42 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str43 = characterReader42.consumeLetterSequence();
        characterReader42.rewindToMark();
        char[] charArray47 = new char[] { '\uffff', 'a' };
        java.lang.String str48 = characterReader42.consumeToAny(charArray47);
        boolean boolean49 = characterReader40.matchesAny(charArray47);
        java.lang.String str50 = characterReader33.consumeToAny(charArray47);
        java.lang.String str51 = characterReader29.consumeToAny(charArray47);
        boolean boolean53 = characterReader29.matches('4');
        java.lang.String str54 = characterReader29.consumeAsString();
        boolean boolean55 = characterReader29.isEmpty();
        boolean boolean57 = characterReader29.matches("hi");
        org.jsoup.parser.CharacterReader characterReader59 = new org.jsoup.parser.CharacterReader("");
        char[] charArray60 = new char[] {};
        boolean boolean61 = characterReader59.matchesAny(charArray60);
        boolean boolean62 = characterReader29.matchesAny(charArray60);
        java.lang.String str63 = characterReader22.consumeToAny(charArray60);
        boolean boolean64 = characterReader16.matchesAny(charArray60);
        java.lang.String str65 = characterReader1.consumeToAny(charArray60);
        boolean boolean67 = characterReader1.matchesIgnoreCase("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertArrayEquals(charArray60, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
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
        java.lang.String str23 = characterReader1.consumeLetterSequence();
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = characterReader1.consumeDigitSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        characterReader1.rewindToMark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        boolean boolean7 = characterReader1.matches('4');
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        java.lang.String str10 = characterReader1.consumeDigitSequence();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        characterReader1.unconsume();
        boolean boolean5 = characterReader1.matchesLetter();
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str9 = characterReader1.consumeDigitSequence();
        characterReader1.mark();
        boolean boolean12 = characterReader1.matches('4');
        boolean boolean14 = characterReader1.matchesIgnoreCase("");
        characterReader1.advance();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
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
        boolean boolean24 = characterReader1.matchesDigit();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        java.lang.String str6 = characterReader1.consumeHexSequence();
        boolean boolean8 = characterReader1.containsIgnoreCase("");
        boolean boolean9 = characterReader1.matchesLetter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
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
        boolean boolean19 = characterReader1.matchesDigit();
        characterReader1.mark();
        java.lang.String str21 = characterReader1.consumeLetterSequence();
        boolean boolean23 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean25 = characterReader1.containsIgnoreCase("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = characterReader1.consumeTo('\uffff');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        characterReader1.advance();
        char char6 = characterReader1.consume();
        int int7 = characterReader1.pos();
        characterReader1.rewindToMark();
        boolean boolean9 = characterReader1.matchesDigit();
        boolean boolean11 = characterReader1.matches("i!");
        java.lang.String str13 = characterReader1.consumeTo("i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'i' + "'", char6 == 'i');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean3 = characterReader1.matchesIgnoreCase("");
        boolean boolean5 = characterReader1.matches('\uffff');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str4 = characterReader1.consumeTo("");
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        char char7 = characterReader1.consume();
        boolean boolean8 = characterReader1.matchesLetter();
        char char9 = characterReader1.consume();
        boolean boolean11 = characterReader1.matchConsume("h");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = characterReader1.consumeLetterSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 2, end 2, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        characterReader1.rewindToMark();
        char char5 = characterReader1.consume();
        boolean boolean7 = characterReader1.matchConsume("");
        java.lang.Class<?> wildcardClass8 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\uffff' + "'", char5 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        int int9 = characterReader1.pos();
        boolean boolean11 = characterReader1.matches("hi!");
        java.lang.String str12 = characterReader1.consumeAsString();
        boolean boolean14 = characterReader1.matchConsumeIgnoreCase("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = characterReader1.consumeHexSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        int int4 = characterReader1.pos();
        boolean boolean6 = characterReader1.matchesIgnoreCase("");
        boolean boolean7 = characterReader1.matchesLetter();
        characterReader1.unconsume();
        char char9 = characterReader1.current();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + 'i' + "'", char9 == 'i');
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
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
        boolean boolean24 = characterReader1.isEmpty();
        characterReader1.unconsume();
        boolean boolean27 = characterReader1.matchConsume("i");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = characterReader1.consumeTo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        boolean boolean4 = characterReader1.isEmpty();
        boolean boolean6 = characterReader1.matches("hi");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = characterReader1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        characterReader1.rewindToMark();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        java.lang.String str9 = characterReader1.consumeAsString();
        char char10 = characterReader1.consume();
        char char11 = characterReader1.current();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = characterReader1.consumeTo('h');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 2, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\uffff' + "'", char10 == '\uffff');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\uffff' + "'", char11 == '\uffff');
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        java.lang.String str6 = characterReader1.consumeHexSequence();
        boolean boolean8 = characterReader1.containsIgnoreCase("");
        boolean boolean9 = characterReader1.isEmpty();
        java.lang.String str10 = characterReader1.consumeHexSequence();
        java.lang.String str11 = characterReader1.toString();
        java.lang.Class<?> wildcardClass12 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        java.lang.String str4 = characterReader1.consumeLetterSequence();
        boolean boolean6 = characterReader1.matchConsumeIgnoreCase("hi!");
        characterReader1.mark();
        java.lang.String str8 = characterReader1.consumeDigitSequence();
        java.lang.Class<?> wildcardClass9 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
        boolean boolean19 = characterReader1.matchesDigit();
        characterReader1.mark();
        java.lang.String str21 = characterReader1.consumeLetterSequence();
        characterReader1.unconsume();
        boolean boolean24 = characterReader1.matchConsume("i!");
        org.jsoup.parser.CharacterReader characterReader26 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str27 = characterReader26.consumeLetterSequence();
        java.lang.String str28 = characterReader26.consumeDigitSequence();
        characterReader26.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader31 = new org.jsoup.parser.CharacterReader("");
        characterReader31.rewindToMark();
        boolean boolean34 = characterReader31.matches("");
        java.lang.String str35 = characterReader31.consumeHexSequence();
        characterReader31.advance();
        org.jsoup.parser.CharacterReader characterReader38 = new org.jsoup.parser.CharacterReader("");
        char[] charArray43 = new char[] { '#', 'a', '\uffff', 'a' };
        boolean boolean44 = characterReader38.matchesAny(charArray43);
        boolean boolean45 = characterReader31.matchesAny(charArray43);
        java.lang.String str46 = characterReader26.consumeToAny(charArray43);
        org.jsoup.parser.CharacterReader characterReader48 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str49 = characterReader48.consumeLetterSequence();
        java.lang.String str50 = characterReader48.consumeDigitSequence();
        characterReader48.rewindToMark();
        java.lang.String str52 = characterReader48.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader54 = new org.jsoup.parser.CharacterReader("");
        char[] charArray55 = new char[] {};
        boolean boolean56 = characterReader54.matchesAny(charArray55);
        java.lang.String str57 = characterReader48.consumeToAny(charArray55);
        boolean boolean58 = characterReader26.matchesAny(charArray55);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str59 = characterReader1.consumeToAny(charArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
        boolean boolean24 = characterReader1.isEmpty();
        java.lang.String str25 = characterReader1.consumeHexSequence();
        boolean boolean27 = characterReader1.matchConsumeIgnoreCase("hi");
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = characterReader1.consumeDigitSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray2 = new char[] {};
        boolean boolean3 = characterReader1.matchesAny(charArray2);
        boolean boolean5 = characterReader1.matchConsumeIgnoreCase("hi!");
        int int6 = characterReader1.pos();
        char char7 = characterReader1.current();
        char[] charArray13 = new char[] { '\uffff', '4', '\uffff', '!', 'a' };
        boolean boolean14 = characterReader1.matchesAny(charArray13);
        characterReader1.rewindToMark();
        boolean boolean17 = characterReader1.matchesIgnoreCase("!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '\uffff', '4', '\uffff', '!', 'a' });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        boolean boolean25 = characterReader1.matches(' ');
        boolean boolean27 = characterReader1.matchConsume("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        boolean boolean4 = characterReader1.matchesLetter();
        java.lang.String str5 = characterReader1.consumeLetterSequence();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = characterReader1.consumeTo("h");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
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
        boolean boolean20 = characterReader1.matches("");
        int int21 = characterReader1.pos();
        characterReader1.rewindToMark();
        java.lang.String str23 = characterReader1.consumeLetterSequence();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = characterReader1.consumeTo("i");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
        boolean boolean19 = characterReader1.matchesDigit();
        characterReader1.unconsume();
        boolean boolean22 = characterReader1.matchConsume("hi");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = characterReader1.matches('\uffff');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        java.lang.String str19 = characterReader1.consumeDigitSequence();
        boolean boolean21 = characterReader1.matches('#');
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str24 = characterReader23.consumeLetterSequence();
        characterReader23.rewindToMark();
        char[] charArray28 = new char[] { '\uffff', 'a' };
        java.lang.String str29 = characterReader23.consumeToAny(charArray28);
        boolean boolean30 = characterReader1.matchesAny(charArray28);
        java.lang.Class<?> wildcardClass31 = charArray28.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matches('a');
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("");
        char char8 = characterReader1.current();
        boolean boolean9 = characterReader1.isEmpty();
        boolean boolean11 = characterReader1.matches("hi");
        char char12 = characterReader1.consume();
        boolean boolean13 = characterReader1.matchesLetter();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\uffff' + "'", char12 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        int int4 = characterReader1.pos();
        boolean boolean6 = characterReader1.matchesIgnoreCase("");
        java.lang.String str8 = characterReader1.consumeTo('4');
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str11 = characterReader10.consumeLetterSequence();
        characterReader10.rewindToMark();
        characterReader10.advance();
        characterReader10.rewindToMark();
        java.lang.String str15 = characterReader10.toString();
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str18 = characterReader17.consumeLetterSequence();
        java.lang.String str19 = characterReader17.toString();
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("");
        characterReader21.rewindToMark();
        boolean boolean24 = characterReader21.matches("");
        java.lang.String str25 = characterReader21.consumeHexSequence();
        java.lang.String str26 = characterReader21.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str31 = characterReader30.consumeLetterSequence();
        characterReader30.rewindToMark();
        char[] charArray35 = new char[] { '\uffff', 'a' };
        java.lang.String str36 = characterReader30.consumeToAny(charArray35);
        boolean boolean37 = characterReader28.matchesAny(charArray35);
        java.lang.String str38 = characterReader21.consumeToAny(charArray35);
        java.lang.String str39 = characterReader17.consumeToAny(charArray35);
        boolean boolean41 = characterReader17.matches('4');
        java.lang.String str42 = characterReader17.consumeAsString();
        boolean boolean43 = characterReader17.isEmpty();
        boolean boolean45 = characterReader17.matches("hi");
        org.jsoup.parser.CharacterReader characterReader47 = new org.jsoup.parser.CharacterReader("");
        char[] charArray48 = new char[] {};
        boolean boolean49 = characterReader47.matchesAny(charArray48);
        boolean boolean50 = characterReader17.matchesAny(charArray48);
        java.lang.String str51 = characterReader10.consumeToAny(charArray48);
        java.lang.String str52 = characterReader1.consumeToAny(charArray48);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str54 = characterReader1.consumeTo("h");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 3, end 2, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader3 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str4 = characterReader3.consumeLetterSequence();
        characterReader3.rewindToMark();
        char[] charArray8 = new char[] { '\uffff', 'a' };
        java.lang.String str9 = characterReader3.consumeToAny(charArray8);
        boolean boolean10 = characterReader1.matchesAny(charArray8);
        boolean boolean12 = characterReader1.matches('#');
        boolean boolean13 = characterReader1.isEmpty();
        char char14 = characterReader1.consume();
        boolean boolean16 = characterReader1.matches("i");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = characterReader1.consumeHexSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\uffff' + "'", char14 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        boolean boolean19 = characterReader1.matchesDigit();
        characterReader1.mark();
        java.lang.String str21 = characterReader1.consumeLetterSequence();
        boolean boolean23 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean25 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean27 = characterReader1.matchesIgnoreCase("hi");
        boolean boolean29 = characterReader1.matchConsume("!");
        char char30 = characterReader1.consume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = characterReader1.consumeLetterSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '\uffff' + "'", char30 == '\uffff');
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        characterReader1.rewindToMark();
        java.lang.String str5 = characterReader1.consumeAsString();
        characterReader1.unconsume();
        boolean boolean7 = characterReader1.matchesLetter();
        boolean boolean9 = characterReader1.matches("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str4 = characterReader1.consumeTo("");
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        char char7 = characterReader1.consume();
        boolean boolean8 = characterReader1.matchesLetter();
        char char9 = characterReader1.consume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = characterReader1.consumeTo("!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 2, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
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
        org.jsoup.parser.CharacterReader characterReader26 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str27 = characterReader26.consumeLetterSequence();
        characterReader26.rewindToMark();
        char[] charArray31 = new char[] { '\uffff', 'a' };
        java.lang.String str32 = characterReader26.consumeToAny(charArray31);
        boolean boolean34 = characterReader26.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader36 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str37 = characterReader36.consumeLetterSequence();
        java.lang.String str38 = characterReader36.toString();
        org.jsoup.parser.CharacterReader characterReader40 = new org.jsoup.parser.CharacterReader("");
        characterReader40.rewindToMark();
        boolean boolean43 = characterReader40.matches("");
        java.lang.String str44 = characterReader40.consumeHexSequence();
        java.lang.String str45 = characterReader40.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader47 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader49 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str50 = characterReader49.consumeLetterSequence();
        characterReader49.rewindToMark();
        char[] charArray54 = new char[] { '\uffff', 'a' };
        java.lang.String str55 = characterReader49.consumeToAny(charArray54);
        boolean boolean56 = characterReader47.matchesAny(charArray54);
        java.lang.String str57 = characterReader40.consumeToAny(charArray54);
        java.lang.String str58 = characterReader36.consumeToAny(charArray54);
        boolean boolean60 = characterReader36.matches('4');
        java.lang.String str61 = characterReader36.consumeAsString();
        boolean boolean62 = characterReader36.isEmpty();
        org.jsoup.parser.CharacterReader characterReader64 = new org.jsoup.parser.CharacterReader("");
        characterReader64.rewindToMark();
        boolean boolean67 = characterReader64.matches("");
        org.jsoup.parser.CharacterReader characterReader69 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str70 = characterReader69.consumeLetterSequence();
        java.lang.String str71 = characterReader69.consumeDigitSequence();
        characterReader69.rewindToMark();
        java.lang.String str73 = characterReader69.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader75 = new org.jsoup.parser.CharacterReader("");
        char[] charArray76 = new char[] {};
        boolean boolean77 = characterReader75.matchesAny(charArray76);
        java.lang.String str78 = characterReader69.consumeToAny(charArray76);
        boolean boolean79 = characterReader64.matchesAny(charArray76);
        java.lang.String str80 = characterReader36.consumeToAny(charArray76);
        boolean boolean81 = characterReader26.matchesAny(charArray76);
        boolean boolean82 = characterReader1.matchesAny(charArray76);
        boolean boolean84 = characterReader1.containsIgnoreCase("i!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str85 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(charArray76);
        org.junit.Assert.assertArrayEquals(charArray76, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeDigitSequence();
        java.lang.String str3 = characterReader1.toString();
        int int4 = characterReader1.pos();
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = characterReader1.consumeLetterSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        characterReader1.rewindToMark();
        java.lang.String str5 = characterReader1.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        char[] charArray8 = new char[] {};
        boolean boolean9 = characterReader7.matchesAny(charArray8);
        java.lang.String str10 = characterReader1.consumeToAny(charArray8);
        boolean boolean12 = characterReader1.matchConsume("hi");
        boolean boolean14 = characterReader1.containsIgnoreCase("hi");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = characterReader1.consumeHexSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str9 = characterReader1.toString();
        boolean boolean11 = characterReader1.containsIgnoreCase("i!");
        java.lang.String str12 = characterReader1.consumeHexSequence();
        java.lang.String str13 = characterReader1.toString();
        java.lang.Class<?> wildcardClass14 = characterReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        characterReader1.rewindToMark();
        char char8 = characterReader1.current();
        char char9 = characterReader1.consume();
        characterReader1.advance();
        boolean boolean12 = characterReader1.matchesIgnoreCase("h");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 2, end 2, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        java.lang.String str26 = characterReader1.consumeAsString();
        boolean boolean27 = characterReader1.isEmpty();
        boolean boolean29 = characterReader1.matchesIgnoreCase("!");
        boolean boolean30 = characterReader1.matchesDigit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = characterReader1.consumeLetterSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        characterReader1.rewindToMark();
        java.lang.String str5 = characterReader1.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        char[] charArray8 = new char[] {};
        boolean boolean9 = characterReader7.matchesAny(charArray8);
        java.lang.String str10 = characterReader1.consumeToAny(charArray8);
        boolean boolean12 = characterReader1.matchConsume("hi");
        boolean boolean14 = characterReader1.containsIgnoreCase("hi");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str9 = characterReader1.consumeDigitSequence();
        characterReader1.mark();
        boolean boolean12 = characterReader1.matchesIgnoreCase("hi");
        java.lang.String str13 = characterReader1.consumeDigitSequence();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = characterReader1.consumeTo("h");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matches('a');
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("");
        char char8 = characterReader1.current();
        boolean boolean9 = characterReader1.isEmpty();
        boolean boolean11 = characterReader1.matchesIgnoreCase("i!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        boolean boolean19 = characterReader1.matchesDigit();
        characterReader1.mark();
        boolean boolean22 = characterReader1.matchConsume("");
        java.lang.String str23 = characterReader1.consumeDigitSequence();
        characterReader1.rewindToMark();
        characterReader1.mark();
        boolean boolean26 = characterReader1.matchesDigit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matches('a');
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("");
        char char8 = characterReader1.current();
        boolean boolean9 = characterReader1.isEmpty();
        boolean boolean11 = characterReader1.matches("hi");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = characterReader1.consumeTo('\uffff');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        int int4 = characterReader1.pos();
        java.lang.String str5 = characterReader1.consumeLetterSequence();
        java.lang.String str6 = characterReader1.consumeHexSequence();
        java.lang.String str7 = characterReader1.consumeAsString();
        boolean boolean9 = characterReader1.matchesIgnoreCase("!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = characterReader1.consumeTo("h");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 3, end 2, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str9 = characterReader1.toString();
        java.lang.String str10 = characterReader1.consumeAsString();
        boolean boolean12 = characterReader1.containsIgnoreCase("!");
        char char13 = characterReader1.consume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = characterReader1.consumeLetterSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 2, end 2, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\uffff' + "'", char13 == '\uffff');
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str4 = characterReader1.consumeTo("");
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean8 = characterReader1.matchConsume("");
        char char9 = characterReader1.current();
        boolean boolean10 = characterReader1.matchesDigit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        boolean boolean4 = characterReader1.matchesLetter();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        characterReader1.advance();
        boolean boolean9 = characterReader1.matches('a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeDigitSequence();
        boolean boolean4 = characterReader1.matchConsume("hi!");
        java.lang.String str5 = characterReader1.consumeAsString();
        boolean boolean7 = characterReader1.matchesIgnoreCase("hi");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = characterReader1.consumeTo(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        int int4 = characterReader1.pos();
        boolean boolean6 = characterReader1.matchesIgnoreCase("");
        characterReader1.rewindToMark();
        boolean boolean9 = characterReader1.matches("i!");
        boolean boolean11 = characterReader1.matches("h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        int int4 = characterReader1.pos();
        boolean boolean6 = characterReader1.matchesIgnoreCase("");
        java.lang.String str8 = characterReader1.consumeTo('4');
        boolean boolean10 = characterReader1.matches('#');
        boolean boolean12 = characterReader1.matchConsume("");
        boolean boolean14 = characterReader1.matchesIgnoreCase("h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        boolean boolean10 = characterReader1.matchConsume("");
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = characterReader1.consumeDigitSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        boolean boolean29 = characterReader1.matches('i');
        boolean boolean31 = characterReader1.matchesIgnoreCase("i!");
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        characterReader1.rewindToMark();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        java.lang.String str9 = characterReader1.toString();
        boolean boolean11 = characterReader1.matches("hi");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = characterReader1.consumeTo(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        characterReader1.rewindToMark();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        java.lang.String str9 = characterReader1.consumeAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        boolean boolean3 = characterReader1.matchesLetter();
        characterReader1.advance();
        boolean boolean5 = characterReader1.isEmpty();
        java.lang.Class<?> wildcardClass6 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.rewindToMark();
        characterReader1.unconsume();
        characterReader1.advance();
        java.lang.String str5 = characterReader1.consumeToEnd();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi" + "'", str5, "hi");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str4 = characterReader1.consumeTo("");
        char[] charArray8 = new char[] { ' ', '4', '4' };
        java.lang.String str9 = characterReader1.consumeToAny(charArray8);
        boolean boolean11 = characterReader1.matchConsumeIgnoreCase("i");
        java.lang.String str12 = characterReader1.consumeDigitSequence();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { ' ', '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        characterReader1.unconsume();
        boolean boolean6 = characterReader1.matchesIgnoreCase("");
        char char7 = characterReader1.current();
        java.lang.String str8 = characterReader1.consumeAsString();
        boolean boolean9 = characterReader1.isEmpty();
        boolean boolean11 = characterReader1.containsIgnoreCase("i!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
        boolean boolean30 = characterReader1.matches("hi");
        boolean boolean31 = characterReader1.matchesLetter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = characterReader1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        characterReader1.rewindToMark();
        char char8 = characterReader1.current();
        java.lang.String str9 = characterReader1.consumeDigitSequence();
        boolean boolean11 = characterReader1.matches("hi!");
        java.lang.String str13 = characterReader1.consumeTo("");
        boolean boolean14 = characterReader1.matchesDigit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = characterReader1.consumeTo("!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.mark();
        char[] charArray7 = null;
        java.lang.String str8 = characterReader1.consumeToAny(charArray7);
        characterReader1.rewindToMark();
        boolean boolean10 = characterReader1.matchesLetter();
        java.lang.String str11 = characterReader1.consumeHexSequence();
        characterReader1.rewindToMark();
        boolean boolean13 = characterReader1.matchesDigit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
        boolean boolean19 = characterReader1.matchesDigit();
        characterReader1.mark();
        java.lang.String str21 = characterReader1.consumeLetterSequence();
        boolean boolean23 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean25 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean27 = characterReader1.matchesIgnoreCase("hi");
        java.lang.Class<?> wildcardClass28 = characterReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str9 = characterReader1.toString();
        characterReader1.rewindToMark();
        int int11 = characterReader1.pos();
        java.lang.String str12 = characterReader1.consumeAsString();
        char char13 = characterReader1.consume();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\uffff' + "'", char13 == '\uffff');
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        java.lang.String str6 = characterReader1.consumeHexSequence();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str9 = characterReader8.consumeLetterSequence();
        characterReader8.rewindToMark();
        char[] charArray13 = new char[] { '\uffff', 'a' };
        java.lang.String str14 = characterReader8.consumeToAny(charArray13);
        boolean boolean15 = characterReader1.matchesAny(charArray13);
        boolean boolean17 = characterReader1.matchConsumeIgnoreCase("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = characterReader1.consumeTo("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        int int4 = characterReader1.pos();
        characterReader1.rewindToMark();
        boolean boolean7 = characterReader1.containsIgnoreCase("hi!");
        char char8 = characterReader1.current();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'h' + "'", char8 == 'h');
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str4 = characterReader1.consumeTo("");
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean8 = characterReader1.matchConsume("");
        char char9 = characterReader1.current();
        boolean boolean10 = characterReader1.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        characterReader12.rewindToMark();
        boolean boolean15 = characterReader12.matches("");
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str18 = characterReader17.consumeLetterSequence();
        java.lang.String str19 = characterReader17.consumeDigitSequence();
        characterReader17.rewindToMark();
        java.lang.String str21 = characterReader17.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        char[] charArray24 = new char[] {};
        boolean boolean25 = characterReader23.matchesAny(charArray24);
        java.lang.String str26 = characterReader17.consumeToAny(charArray24);
        boolean boolean27 = characterReader12.matchesAny(charArray24);
        java.lang.String str28 = characterReader1.consumeToAny(charArray24);
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = characterReader1.consumeDigitSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        char[] charArray6 = new char[] { '\uffff', 'a' };
        java.lang.String str7 = characterReader1.consumeToAny(charArray6);
        java.lang.String str8 = characterReader1.consumeAsString();
        characterReader1.unconsume();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        characterReader1.rewindToMark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        boolean boolean6 = characterReader1.matchesLetter();
        char char7 = characterReader1.current();
        java.lang.String str8 = characterReader1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        characterReader1.rewindToMark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        boolean boolean6 = characterReader1.matchesLetter();
        boolean boolean8 = characterReader1.matchesIgnoreCase("hi");
        int int9 = characterReader1.pos();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = characterReader1.consumeTo("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        boolean boolean19 = characterReader1.matchesDigit();
        characterReader1.mark();
        java.lang.String str21 = characterReader1.consumeLetterSequence();
        boolean boolean23 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean25 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean27 = characterReader1.matchesIgnoreCase("hi");
        org.jsoup.parser.CharacterReader characterReader29 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str30 = characterReader29.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str33 = characterReader32.consumeLetterSequence();
        java.lang.String str34 = characterReader32.consumeDigitSequence();
        characterReader32.rewindToMark();
        java.lang.String str36 = characterReader32.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader38 = new org.jsoup.parser.CharacterReader("");
        char[] charArray39 = new char[] {};
        boolean boolean40 = characterReader38.matchesAny(charArray39);
        java.lang.String str41 = characterReader32.consumeToAny(charArray39);
        java.lang.String str42 = characterReader29.consumeToAny(charArray39);
        java.lang.String str43 = characterReader29.toString();
        org.jsoup.parser.CharacterReader characterReader45 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str46 = characterReader45.consumeHexSequence();
        boolean boolean48 = characterReader45.matchConsumeIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader50 = new org.jsoup.parser.CharacterReader("");
        characterReader50.rewindToMark();
        boolean boolean53 = characterReader50.matches("");
        java.lang.String str54 = characterReader50.consumeHexSequence();
        characterReader50.advance();
        org.jsoup.parser.CharacterReader characterReader57 = new org.jsoup.parser.CharacterReader("");
        char[] charArray62 = new char[] { '#', 'a', '\uffff', 'a' };
        boolean boolean63 = characterReader57.matchesAny(charArray62);
        boolean boolean64 = characterReader50.matchesAny(charArray62);
        boolean boolean65 = characterReader45.matchesAny(charArray62);
        java.lang.String str66 = characterReader29.consumeToAny(charArray62);
        boolean boolean67 = characterReader1.matchesAny(charArray62);
        boolean boolean69 = characterReader1.matchConsumeIgnoreCase("i!");
        boolean boolean71 = characterReader1.matchConsumeIgnoreCase("i!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
        boolean boolean35 = characterReader1.matchesIgnoreCase("h");
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray2 = new char[] {};
        boolean boolean3 = characterReader1.matchesAny(charArray2);
        int int4 = characterReader1.pos();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = characterReader1.consumeTo('#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.mark();
        char[] charArray7 = null;
        java.lang.String str8 = characterReader1.consumeToAny(charArray7);
        characterReader1.rewindToMark();
        boolean boolean10 = characterReader1.matchesLetter();
        boolean boolean11 = characterReader1.matchesLetter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = characterReader1.consumeTo("!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        boolean boolean3 = characterReader1.isEmpty();
        boolean boolean5 = characterReader1.matches('\uffff');
        java.lang.String str7 = characterReader1.consumeTo("i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        int int4 = characterReader1.pos();
        java.lang.String str5 = characterReader1.consumeLetterSequence();
        java.lang.String str6 = characterReader1.consumeHexSequence();
        characterReader1.unconsume();
        char char8 = characterReader1.current();
        java.lang.String str9 = characterReader1.consumeToEnd();
        characterReader1.mark();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = characterReader1.consumeTo("h");
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
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        char[] charArray6 = new char[] { '\uffff', 'a' };
        java.lang.String str7 = characterReader1.consumeToAny(charArray6);
        boolean boolean9 = characterReader1.matchesIgnoreCase("");
        characterReader1.unconsume();
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            char char12 = characterReader1.current();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        char char6 = characterReader1.current();
        boolean boolean7 = characterReader1.matchesLetter();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\uffff' + "'", char6 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        characterReader1.advance();
        boolean boolean8 = characterReader1.matches('4');
        char char9 = characterReader1.current();
        boolean boolean10 = characterReader1.matchesDigit();
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = characterReader1.consumeTo('\uffff');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 2, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        int int9 = characterReader1.pos();
        boolean boolean11 = characterReader1.matches("hi!");
        java.lang.String str12 = characterReader1.consumeAsString();
        boolean boolean14 = characterReader1.matchConsumeIgnoreCase("hi!");
        boolean boolean16 = characterReader1.matches('!');
        boolean boolean18 = characterReader1.matchConsume("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
        java.lang.String str26 = characterReader1.consumeAsString();
        boolean boolean27 = characterReader1.isEmpty();
        boolean boolean29 = characterReader1.matchesIgnoreCase("!");
        boolean boolean30 = characterReader1.matchesDigit();
        boolean boolean32 = characterReader1.containsIgnoreCase("i");
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
        boolean boolean19 = characterReader1.matchesDigit();
        characterReader1.mark();
        java.lang.String str21 = characterReader1.consumeLetterSequence();
        boolean boolean23 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean25 = characterReader1.containsIgnoreCase("hi!");
        int int26 = characterReader1.pos();
        char char27 = characterReader1.current();
        char char28 = characterReader1.current();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '\uffff' + "'", char27 == '\uffff');
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\uffff' + "'", char28 == '\uffff');
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        java.lang.String str26 = characterReader1.consumeAsString();
        boolean boolean27 = characterReader1.isEmpty();
        boolean boolean29 = characterReader1.matchesIgnoreCase("!");
        boolean boolean30 = characterReader1.matchesDigit();
        boolean boolean32 = characterReader1.matches('4');
        boolean boolean34 = characterReader1.matchesIgnoreCase("hi");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = characterReader1.consumeDigitSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader4 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str5 = characterReader4.consumeLetterSequence();
        java.lang.String str6 = characterReader4.consumeDigitSequence();
        characterReader4.rewindToMark();
        java.lang.String str8 = characterReader4.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        char[] charArray11 = new char[] {};
        boolean boolean12 = characterReader10.matchesAny(charArray11);
        java.lang.String str13 = characterReader4.consumeToAny(charArray11);
        java.lang.String str14 = characterReader1.consumeToAny(charArray11);
        java.lang.String str15 = characterReader1.toString();
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str18 = characterReader17.consumeHexSequence();
        boolean boolean20 = characterReader17.matchConsumeIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("");
        characterReader22.rewindToMark();
        boolean boolean25 = characterReader22.matches("");
        java.lang.String str26 = characterReader22.consumeHexSequence();
        characterReader22.advance();
        org.jsoup.parser.CharacterReader characterReader29 = new org.jsoup.parser.CharacterReader("");
        char[] charArray34 = new char[] { '#', 'a', '\uffff', 'a' };
        boolean boolean35 = characterReader29.matchesAny(charArray34);
        boolean boolean36 = characterReader22.matchesAny(charArray34);
        boolean boolean37 = characterReader17.matchesAny(charArray34);
        java.lang.String str38 = characterReader1.consumeToAny(charArray34);
        characterReader1.advance();
        org.jsoup.parser.CharacterReader characterReader41 = new org.jsoup.parser.CharacterReader("");
        characterReader41.rewindToMark();
        boolean boolean44 = characterReader41.matches("");
        java.lang.String str45 = characterReader41.consumeHexSequence();
        characterReader41.advance();
        characterReader41.rewindToMark();
        char char48 = characterReader41.current();
        java.lang.String str49 = characterReader41.consumeDigitSequence();
        boolean boolean51 = characterReader41.matches("hi!");
        java.lang.String str53 = characterReader41.consumeTo("");
        org.jsoup.parser.CharacterReader characterReader55 = new org.jsoup.parser.CharacterReader("");
        characterReader55.rewindToMark();
        boolean boolean58 = characterReader55.matches("");
        java.lang.String str59 = characterReader55.consumeHexSequence();
        characterReader55.advance();
        characterReader55.rewindToMark();
        java.lang.String str62 = characterReader55.consumeLetterSequence();
        char char63 = characterReader55.current();
        org.jsoup.parser.CharacterReader characterReader65 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str66 = characterReader65.consumeLetterSequence();
        characterReader65.rewindToMark();
        characterReader65.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader70 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader72 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str73 = characterReader72.consumeLetterSequence();
        characterReader72.rewindToMark();
        char[] charArray77 = new char[] { '\uffff', 'a' };
        java.lang.String str78 = characterReader72.consumeToAny(charArray77);
        boolean boolean79 = characterReader70.matchesAny(charArray77);
        boolean boolean80 = characterReader65.matchesAny(charArray77);
        boolean boolean81 = characterReader55.matchesAny(charArray77);
        java.lang.String str82 = characterReader41.consumeToAny(charArray77);
        java.lang.String str83 = characterReader1.consumeToAny(charArray77);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str84 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + char48 + "' != '" + '\uffff' + "'", char48 == '\uffff');
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + char63 + "' != '" + '\uffff' + "'", char63 == '\uffff');
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertArrayEquals(charArray77, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str4 = characterReader1.consumeTo("");
        characterReader1.mark();
        characterReader1.unconsume();
        boolean boolean8 = characterReader1.matches("hi");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = characterReader1.matches('a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray2 = new char[] {};
        boolean boolean3 = characterReader1.matchesAny(charArray2);
        boolean boolean5 = characterReader1.matchConsumeIgnoreCase("hi!");
        int int6 = characterReader1.pos();
        char char7 = characterReader1.current();
        char[] charArray13 = new char[] { '\uffff', '4', '\uffff', '!', 'a' };
        boolean boolean14 = characterReader1.matchesAny(charArray13);
        boolean boolean16 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean17 = characterReader1.isEmpty();
        java.lang.String str18 = characterReader1.consumeDigitSequence();
        java.lang.Class<?> wildcardClass19 = characterReader1.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '\uffff', '4', '\uffff', '!', 'a' });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str4 = characterReader1.consumeTo("");
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean8 = characterReader1.matchConsume("");
        char char9 = characterReader1.current();
        boolean boolean10 = characterReader1.matchesDigit();
        java.lang.Class<?> wildcardClass11 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        char[] charArray6 = new char[] { '\uffff', 'a' };
        java.lang.String str7 = characterReader1.consumeToAny(charArray6);
        boolean boolean9 = characterReader1.matchesIgnoreCase("");
        java.lang.String str10 = characterReader1.consumeLetterSequence();
        java.lang.Class<?> wildcardClass11 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("!");
        boolean boolean2 = characterReader1.isEmpty();
        org.jsoup.parser.CharacterReader characterReader4 = new org.jsoup.parser.CharacterReader("");
        characterReader4.rewindToMark();
        java.lang.String str7 = characterReader4.consumeTo("");
        boolean boolean9 = characterReader4.matchesIgnoreCase("hi!");
        boolean boolean11 = characterReader4.matchesIgnoreCase("hi!");
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str14 = characterReader13.consumeLetterSequence();
        java.lang.String str15 = characterReader13.toString();
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("");
        characterReader17.rewindToMark();
        boolean boolean20 = characterReader17.matches("");
        java.lang.String str21 = characterReader17.consumeHexSequence();
        java.lang.String str22 = characterReader17.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader26 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str27 = characterReader26.consumeLetterSequence();
        characterReader26.rewindToMark();
        char[] charArray31 = new char[] { '\uffff', 'a' };
        java.lang.String str32 = characterReader26.consumeToAny(charArray31);
        boolean boolean33 = characterReader24.matchesAny(charArray31);
        java.lang.String str34 = characterReader17.consumeToAny(charArray31);
        java.lang.String str35 = characterReader13.consumeToAny(charArray31);
        boolean boolean37 = characterReader13.matches('4');
        java.lang.String str38 = characterReader13.consumeAsString();
        boolean boolean39 = characterReader13.isEmpty();
        org.jsoup.parser.CharacterReader characterReader41 = new org.jsoup.parser.CharacterReader("");
        characterReader41.rewindToMark();
        boolean boolean44 = characterReader41.matches("");
        org.jsoup.parser.CharacterReader characterReader46 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str47 = characterReader46.consumeLetterSequence();
        java.lang.String str48 = characterReader46.consumeDigitSequence();
        characterReader46.rewindToMark();
        java.lang.String str50 = characterReader46.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader52 = new org.jsoup.parser.CharacterReader("");
        char[] charArray53 = new char[] {};
        boolean boolean54 = characterReader52.matchesAny(charArray53);
        java.lang.String str55 = characterReader46.consumeToAny(charArray53);
        boolean boolean56 = characterReader41.matchesAny(charArray53);
        java.lang.String str57 = characterReader13.consumeToAny(charArray53);
        boolean boolean58 = characterReader4.matchesAny(charArray53);
        boolean boolean59 = characterReader1.matchesAny(charArray53);
        boolean boolean61 = characterReader1.containsIgnoreCase("hi!");
        char[] charArray62 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str63 = characterReader1.consumeToAny(charArray62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        characterReader1.rewindToMark();
        characterReader1.advance();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
        characterReader1.unconsume();
        java.lang.Class<?> wildcardClass27 = characterReader1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        characterReader1.rewindToMark();
        char char8 = characterReader1.current();
        char char9 = characterReader1.consume();
        characterReader1.advance();
        java.lang.Class<?> wildcardClass11 = characterReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        java.lang.String str6 = characterReader1.consumeHexSequence();
        boolean boolean8 = characterReader1.containsIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str11 = characterReader10.consumeLetterSequence();
        java.lang.String str12 = characterReader10.toString();
        org.jsoup.parser.CharacterReader characterReader14 = new org.jsoup.parser.CharacterReader("");
        characterReader14.rewindToMark();
        boolean boolean17 = characterReader14.matches("");
        java.lang.String str18 = characterReader14.consumeHexSequence();
        java.lang.String str19 = characterReader14.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str24 = characterReader23.consumeLetterSequence();
        characterReader23.rewindToMark();
        char[] charArray28 = new char[] { '\uffff', 'a' };
        java.lang.String str29 = characterReader23.consumeToAny(charArray28);
        boolean boolean30 = characterReader21.matchesAny(charArray28);
        java.lang.String str31 = characterReader14.consumeToAny(charArray28);
        java.lang.String str32 = characterReader10.consumeToAny(charArray28);
        java.lang.String str33 = characterReader1.consumeToAny(charArray28);
        boolean boolean34 = characterReader1.isEmpty();
        boolean boolean36 = characterReader1.matchConsumeIgnoreCase("hi");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = characterReader1.consumeTo('#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str9 = characterReader1.toString();
        boolean boolean11 = characterReader1.matches('#');
        boolean boolean13 = characterReader1.containsIgnoreCase("!");
        int int14 = characterReader1.pos();
        java.lang.String str15 = characterReader1.consumeDigitSequence();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean3 = characterReader1.matchesIgnoreCase("");
        characterReader1.unconsume();
        int int5 = characterReader1.pos();
        int int6 = characterReader1.pos();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        characterReader1.unconsume();
        boolean boolean6 = characterReader1.matchesIgnoreCase("");
        char char7 = characterReader1.current();
        boolean boolean9 = characterReader1.matchesIgnoreCase("i!");
        java.lang.String str10 = characterReader1.consumeLetterSequence();
        java.lang.String str11 = characterReader1.consumeLetterSequence();
        boolean boolean12 = characterReader1.matchesDigit();
        boolean boolean14 = characterReader1.matchConsume("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        characterReader1.advance();
        char char6 = characterReader1.consume();
        int int7 = characterReader1.pos();
        boolean boolean9 = characterReader1.matchesIgnoreCase("hi!");
        characterReader1.unconsume();
        boolean boolean12 = characterReader1.matchConsumeIgnoreCase("i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'i' + "'", char6 == 'i');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        int int9 = characterReader1.pos();
        boolean boolean10 = characterReader1.matchesLetter();
        int int11 = characterReader1.pos();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
        boolean boolean19 = characterReader1.matchesDigit();
        characterReader1.mark();
        boolean boolean22 = characterReader1.matchConsume("");
        java.lang.String str23 = characterReader1.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("");
        characterReader25.rewindToMark();
        characterReader25.mark();
        org.jsoup.parser.CharacterReader characterReader29 = new org.jsoup.parser.CharacterReader("");
        char[] charArray34 = new char[] { '#', 'a', '\uffff', 'a' };
        boolean boolean35 = characterReader29.matchesAny(charArray34);
        boolean boolean36 = characterReader25.matchesAny(charArray34);
        java.lang.String str37 = characterReader1.consumeToAny(charArray34);
        boolean boolean39 = characterReader1.containsIgnoreCase("!");
        org.jsoup.parser.CharacterReader characterReader41 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str42 = characterReader41.consumeLetterSequence();
        characterReader41.rewindToMark();
        char[] charArray46 = new char[] { '\uffff', 'a' };
        java.lang.String str47 = characterReader41.consumeToAny(charArray46);
        boolean boolean48 = characterReader1.matchesAny(charArray46);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str50 = characterReader1.consumeTo('4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        characterReader1.advance();
        boolean boolean7 = characterReader1.matchesIgnoreCase("i!");
        boolean boolean8 = characterReader1.matchesDigit();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
        boolean boolean24 = characterReader1.isEmpty();
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = characterReader1.consumeLetterSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        characterReader1.rewindToMark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str7 = characterReader1.consumeTo("");
        boolean boolean9 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str10 = characterReader1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        java.lang.String str4 = characterReader1.consumeDigitSequence();
        char char5 = characterReader1.current();
        java.lang.Class<?> wildcardClass6 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\uffff' + "'", char5 == '\uffff');
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        boolean boolean4 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str6 = characterReader1.consumeTo(' ');
        java.lang.String str7 = characterReader1.consumeLetterSequence();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi" + "'", str6, "hi");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        java.lang.String str6 = characterReader1.consumeHexSequence();
        boolean boolean8 = characterReader1.containsIgnoreCase("");
        boolean boolean10 = characterReader1.matches("hi!");
        boolean boolean12 = characterReader1.containsIgnoreCase("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = characterReader1.consumeTo('h');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
        boolean boolean19 = characterReader1.matchesDigit();
        characterReader1.mark();
        boolean boolean22 = characterReader1.matchConsume("");
        java.lang.String str23 = characterReader1.consumeDigitSequence();
        characterReader1.rewindToMark();
        java.lang.String str25 = characterReader1.consumeAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = characterReader1.consumeTo(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = characterReader1.consumeDigitSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray2 = new char[] {};
        boolean boolean3 = characterReader1.matchesAny(charArray2);
        characterReader1.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader6 = new org.jsoup.parser.CharacterReader("");
        characterReader6.rewindToMark();
        java.lang.String str8 = characterReader6.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str13 = characterReader12.consumeLetterSequence();
        characterReader12.rewindToMark();
        char[] charArray17 = new char[] { '\uffff', 'a' };
        java.lang.String str18 = characterReader12.consumeToAny(charArray17);
        boolean boolean19 = characterReader10.matchesAny(charArray17);
        java.lang.String str20 = characterReader6.consumeToAny(charArray17);
        java.lang.String str21 = characterReader1.consumeToAny(charArray17);
        characterReader1.rewindToMark();
        boolean boolean23 = characterReader1.matchesDigit();
        boolean boolean25 = characterReader1.matches('4');
        char char26 = characterReader1.consume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = characterReader1.consumeLetterSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\uffff' + "'", char26 == '\uffff');
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matches('a');
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("");
        char char8 = characterReader1.current();
        boolean boolean9 = characterReader1.isEmpty();
        boolean boolean11 = characterReader1.containsIgnoreCase("i");
        boolean boolean13 = characterReader1.matches('#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str4 = characterReader1.consumeTo("");
        characterReader1.mark();
        char char6 = characterReader1.current();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\uffff' + "'", char6 == '\uffff');
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        int int4 = characterReader1.pos();
        boolean boolean6 = characterReader1.matchesIgnoreCase("");
        java.lang.String str8 = characterReader1.consumeTo('4');
        java.lang.String str9 = characterReader1.consumeAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.consumeLetterSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 4, end 4, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        boolean boolean4 = characterReader1.isEmpty();
        boolean boolean6 = characterReader1.matches("hi");
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("!");
        char char9 = characterReader1.current();
        char char10 = characterReader1.current();
        boolean boolean12 = characterReader1.matchesIgnoreCase("hi!");
        characterReader1.advance();
        characterReader1.mark();
        boolean boolean16 = characterReader1.matches('#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\uffff' + "'", char10 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        boolean boolean5 = characterReader1.matchConsumeIgnoreCase("");
        boolean boolean6 = characterReader1.matchesDigit();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader3 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str4 = characterReader3.consumeLetterSequence();
        characterReader3.rewindToMark();
        char[] charArray8 = new char[] { '\uffff', 'a' };
        java.lang.String str9 = characterReader3.consumeToAny(charArray8);
        boolean boolean10 = characterReader1.matchesAny(charArray8);
        boolean boolean12 = characterReader1.matches('#');
        boolean boolean13 = characterReader1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = characterReader1.consumeTo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        characterReader1.rewindToMark();
        java.lang.String str5 = characterReader1.consumeAsString();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        characterReader7.rewindToMark();
        boolean boolean10 = characterReader7.matches("");
        java.lang.String str11 = characterReader7.consumeHexSequence();
        java.lang.String str12 = characterReader7.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader14 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str17 = characterReader16.consumeLetterSequence();
        characterReader16.rewindToMark();
        char[] charArray21 = new char[] { '\uffff', 'a' };
        java.lang.String str22 = characterReader16.consumeToAny(charArray21);
        boolean boolean23 = characterReader14.matchesAny(charArray21);
        java.lang.String str24 = characterReader7.consumeToAny(charArray21);
        java.lang.String str25 = characterReader1.consumeToAny(charArray21);
        boolean boolean27 = characterReader1.containsIgnoreCase("h");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        boolean boolean3 = characterReader1.matchesLetter();
        characterReader1.advance();
        boolean boolean5 = characterReader1.isEmpty();
        boolean boolean7 = characterReader1.containsIgnoreCase("!");
        characterReader1.unconsume();
        java.lang.String str9 = characterReader1.consumeAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        characterReader1.rewindToMark();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        java.lang.String str9 = characterReader1.consumeAsString();
        char char10 = characterReader1.consume();
        char char11 = characterReader1.current();
        characterReader1.advance();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\uffff' + "'", char10 == '\uffff');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\uffff' + "'", char11 == '\uffff');
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        java.lang.String str6 = characterReader1.consumeHexSequence();
        boolean boolean8 = characterReader1.containsIgnoreCase("");
        boolean boolean9 = characterReader1.isEmpty();
        boolean boolean11 = characterReader1.matches('a');
        boolean boolean13 = characterReader1.matchesIgnoreCase("i!");
        java.lang.Class<?> wildcardClass14 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
        boolean boolean19 = characterReader1.matchesDigit();
        characterReader1.mark();
        boolean boolean22 = characterReader1.matchConsume("");
        java.lang.String str23 = characterReader1.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("");
        characterReader25.rewindToMark();
        characterReader25.mark();
        org.jsoup.parser.CharacterReader characterReader29 = new org.jsoup.parser.CharacterReader("");
        char[] charArray34 = new char[] { '#', 'a', '\uffff', 'a' };
        boolean boolean35 = characterReader29.matchesAny(charArray34);
        boolean boolean36 = characterReader25.matchesAny(charArray34);
        java.lang.String str37 = characterReader1.consumeToAny(charArray34);
        boolean boolean38 = characterReader1.matchesDigit();
        java.lang.String str39 = characterReader1.consumeLetterSequence();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        boolean boolean19 = characterReader1.matchesDigit();
        characterReader1.mark();
        boolean boolean22 = characterReader1.matchConsume("");
        java.lang.String str23 = characterReader1.consumeDigitSequence();
        characterReader1.rewindToMark();
        java.lang.String str25 = characterReader1.consumeAsString();
        boolean boolean26 = characterReader1.matchesLetter();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray2 = new char[] {};
        boolean boolean3 = characterReader1.matchesAny(charArray2);
        boolean boolean5 = characterReader1.matchConsumeIgnoreCase("hi!");
        int int6 = characterReader1.pos();
        java.lang.Class<?> wildcardClass7 = characterReader1.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        boolean boolean10 = characterReader1.matchConsume("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = characterReader1.consumeTo(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str4 = characterReader1.consumeTo("");
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean8 = characterReader1.matchConsume("");
        char char9 = characterReader1.current();
        boolean boolean10 = characterReader1.matchesDigit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = characterReader1.consumeTo('a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        characterReader1.rewindToMark();
        char char8 = characterReader1.current();
        java.lang.String str9 = characterReader1.consumeAsString();
        boolean boolean11 = characterReader1.containsIgnoreCase("i");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = characterReader1.consumeDigitSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str4 = characterReader1.consumeTo("");
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        int int7 = characterReader1.pos();
        characterReader1.advance();
        characterReader1.mark();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.consumeHexSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray2 = new char[] {};
        boolean boolean3 = characterReader1.matchesAny(charArray2);
        boolean boolean5 = characterReader1.matchConsumeIgnoreCase("hi!");
        int int6 = characterReader1.pos();
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            char char8 = characterReader1.consume();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str4 = characterReader1.consumeTo("");
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        char char7 = characterReader1.consume();
        boolean boolean8 = characterReader1.matchesLetter();
        char char9 = characterReader1.consume();
        boolean boolean11 = characterReader1.matchConsume("h");
        boolean boolean12 = characterReader1.matchesDigit();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        boolean boolean4 = characterReader1.isEmpty();
        boolean boolean6 = characterReader1.matches("hi");
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("!");
        char char9 = characterReader1.current();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.consumeDigitSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
        java.lang.String str26 = characterReader1.consumeAsString();
        characterReader1.rewindToMark();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = characterReader1.consumeTo("i");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        java.lang.String str6 = characterReader1.consumeHexSequence();
        boolean boolean8 = characterReader1.containsIgnoreCase("");
        boolean boolean10 = characterReader1.matches("hi!");
        boolean boolean12 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str13 = characterReader1.toString();
        java.lang.String str14 = characterReader1.consumeDigitSequence();
        characterReader1.advance();
        characterReader1.mark();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = characterReader1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean4 = characterReader1.matchesLetter();
        java.lang.String str5 = characterReader1.consumeLetterSequence();
        char char6 = characterReader1.current();
        char char7 = characterReader1.consume();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\uffff' + "'", char6 == '\uffff');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.unconsume();
        boolean boolean5 = characterReader1.matchConsume("i!");
        int int6 = characterReader1.pos();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = characterReader1.consumeHexSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        boolean boolean19 = characterReader1.matchesDigit();
        characterReader1.mark();
        java.lang.String str21 = characterReader1.consumeLetterSequence();
        boolean boolean23 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean24 = characterReader1.isEmpty();
        boolean boolean26 = characterReader1.matchesIgnoreCase("i!");
        java.lang.Class<?> wildcardClass27 = characterReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str9 = characterReader1.consumeDigitSequence();
        characterReader1.mark();
        boolean boolean12 = characterReader1.matches('4');
        boolean boolean14 = characterReader1.matchConsume("hi!");
        boolean boolean16 = characterReader1.containsIgnoreCase("i");
        boolean boolean18 = characterReader1.containsIgnoreCase("hi");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = characterReader1.consumeTo(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("i!");
        java.lang.Class<?> wildcardClass2 = characterReader1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        characterReader1.rewindToMark();
        java.lang.String str5 = characterReader1.consumeAsString();
        boolean boolean7 = characterReader1.containsIgnoreCase("!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.rewindToMark();
        characterReader1.unconsume();
        characterReader1.advance();
        characterReader1.advance();
        int int6 = characterReader1.pos();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = characterReader1.consumeTo("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        boolean boolean6 = characterReader1.matchesLetter();
        java.lang.String str7 = characterReader1.consumeDigitSequence();
        boolean boolean9 = characterReader1.matches('#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        boolean boolean19 = characterReader1.matchesDigit();
        characterReader1.mark();
        boolean boolean22 = characterReader1.matchConsume("");
        java.lang.String str23 = characterReader1.consumeDigitSequence();
        characterReader1.rewindToMark();
        boolean boolean25 = characterReader1.matchesLetter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = characterReader1.consumeTo("h");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matchConsume("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.unconsume();
        java.lang.String str9 = characterReader1.consumeHexSequence();
        boolean boolean11 = characterReader1.matches("");
        characterReader1.mark();
        org.jsoup.parser.CharacterReader characterReader14 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str15 = characterReader14.consumeLetterSequence();
        characterReader14.rewindToMark();
        char[] charArray19 = new char[] { '\uffff', 'a' };
        java.lang.String str20 = characterReader14.consumeToAny(charArray19);
        boolean boolean22 = characterReader14.matchesIgnoreCase("");
        boolean boolean24 = characterReader14.matchConsume("hi!");
        org.jsoup.parser.CharacterReader characterReader26 = new org.jsoup.parser.CharacterReader("");
        characterReader26.rewindToMark();
        java.lang.String str29 = characterReader26.consumeTo("");
        char[] charArray33 = new char[] { ' ', '4', '4' };
        java.lang.String str34 = characterReader26.consumeToAny(charArray33);
        java.lang.String str35 = characterReader14.consumeToAny(charArray33);
        java.lang.String str36 = characterReader1.consumeToAny(charArray33);
        java.lang.Class<?> wildcardClass37 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { ' ', '4', '4' });
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        char char3 = characterReader1.consume();
        boolean boolean5 = characterReader1.matchConsume("hi!");
        boolean boolean6 = characterReader1.matchesDigit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        characterReader1.advance();
        char char6 = characterReader1.consume();
        characterReader1.rewindToMark();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        boolean boolean10 = characterReader1.matches('#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'i' + "'", char6 == 'i');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi" + "'", str8, "hi");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        characterReader1.rewindToMark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        boolean boolean7 = characterReader1.matches('4');
        characterReader1.unconsume();
        boolean boolean10 = characterReader1.containsIgnoreCase("hi!");
        characterReader1.advance();
        java.lang.String str12 = characterReader1.consumeDigitSequence();
        java.lang.String str13 = characterReader1.consumeAsString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean5 = characterReader1.matches('a');
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("");
        char char8 = characterReader1.consume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = characterReader1.consumeLetterSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray2 = new char[] {};
        boolean boolean3 = characterReader1.matchesAny(charArray2);
        boolean boolean5 = characterReader1.matchConsumeIgnoreCase("hi!");
        char char6 = characterReader1.consume();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\uffff' + "'", char6 == '\uffff');
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
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
        boolean boolean19 = characterReader1.matchesDigit();
        characterReader1.mark();
        java.lang.String str21 = characterReader1.consumeLetterSequence();
        boolean boolean23 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean25 = characterReader1.containsIgnoreCase("hi!");
        int int26 = characterReader1.pos();
        char char27 = characterReader1.current();
        boolean boolean28 = characterReader1.matchesLetter();
        char char29 = characterReader1.current();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '\uffff', 'a' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '\uffff' + "'", char27 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\uffff' + "'", char29 == '\uffff');
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        java.lang.String str4 = characterReader1.consumeTo("");
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        int int7 = characterReader1.pos();
        characterReader1.advance();
        int int9 = characterReader1.pos();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char[] charArray6 = new char[] { '#', 'a', '\uffff', 'a' };
        boolean boolean7 = characterReader1.matchesAny(charArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#', 'a', '\uffff', 'a' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi");
        java.lang.String str3 = characterReader1.consumeTo(' ');
        characterReader1.mark();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = characterReader1.consumeTo("h");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 2, end 1, length 2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        characterReader1.rewindToMark();
        char char8 = characterReader1.current();
        boolean boolean9 = characterReader1.matchesLetter();
        characterReader1.rewindToMark();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = characterReader1.consumeTo('!');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.rewindToMark();
        boolean boolean4 = characterReader1.matches("");
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str9 = characterReader1.consumeDigitSequence();
        characterReader1.mark();
        boolean boolean12 = characterReader1.matches('4');
        java.lang.String str13 = characterReader1.consumeHexSequence();
        boolean boolean14 = characterReader1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = characterReader1.consumeTo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        boolean boolean3 = characterReader1.matchesLetter();
        characterReader1.advance();
        boolean boolean6 = characterReader1.matches('\uffff');
        boolean boolean7 = characterReader1.matchesDigit();
        char char8 = characterReader1.current();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = characterReader1.consumeHexSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
    }
}

