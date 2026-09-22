package org.apache.commons.codec.language;

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = soundex5.encode((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex5.setMaxLength(1);
        java.lang.Object obj8 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = soundex5.encode(obj8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex5.setMaxLength(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = soundex5.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.Class<?> wildcardClass6 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = soundex3.encode((java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.String str0 = org.apache.commons.codec.language.Soundex.US_ENGLISH_MAPPING_STRING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "01230120022455012623010202" + "'", str0, "01230120022455012623010202");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.Class<?> wildcardClass5 = soundex4.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.Class<?> wildcardClass1 = soundex0.getClass();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex5.setMaxLength(1);
        soundex5.setMaxLength(1);
        java.lang.String str11 = soundex5.encode("");
        java.lang.Class<?> wildcardClass12 = soundex5.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex5.setMaxLength(1);
        int int8 = soundex5.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = soundex5.encode((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex5.setMaxLength(1);
        soundex5.setMaxLength(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = soundex5.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex5.setMaxLength(1);
        soundex5.setMaxLength(0);
        char[] charArray12 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = soundex5.encode((java.lang.Object) soundex13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', ' ' });
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex5.setMaxLength(1);
        java.lang.Class<?> wildcardClass8 = soundex5.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex5.setMaxLength(1);
        int int8 = soundex5.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = soundex5.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.Class<?> wildcardClass5 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("hi!");
        soundex1.setMaxLength((int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = soundex1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int6 = soundex5.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = soundex5.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex5.setMaxLength(1);
        soundex5.setMaxLength((int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = soundex4.encode((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex5.setMaxLength(1);
        soundex5.setMaxLength(0);
        int int10 = soundex5.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = soundex5.encode((java.lang.Object) soundex12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        char[] charArray7 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray7);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray7);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray7);
        soundex10.setMaxLength(1);
        soundex10.setMaxLength(0);
        int int15 = soundex10.getMaxLength();
        int int16 = soundex10.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = soundex4.encode((java.lang.Object) int16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = soundex5.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("hi!");
        java.lang.Class<?> wildcardClass2 = soundex1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = soundex5.encode((java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.encode("01230120022455012623010202");
        int int5 = soundex0.difference("hi!", "");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("hi!");
        soundex1.setMaxLength((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = soundex1.difference("H000", "H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex5.setMaxLength(1);
        soundex5.setMaxLength(1);
        java.lang.String str11 = soundex5.encode("");
        // The following exception was thrown during execution in test generation
        try {
            int int14 = soundex5.difference("", "H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int6 = soundex5.getMaxLength();
        java.lang.String str8 = soundex5.encode("01230120022455012623010202");
        soundex5.setMaxLength((int) 'a');
        java.lang.Class<?> wildcardClass11 = soundex5.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex5.setMaxLength(1);
        soundex5.setMaxLength(1);
        int int10 = soundex5.getMaxLength();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int6 = soundex5.getMaxLength();
        java.lang.String str8 = soundex5.encode("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = soundex5.difference("01230120022455012623010202", "H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex5.setMaxLength(1);
        soundex5.setMaxLength(0);
        java.lang.Class<?> wildcardClass10 = soundex5.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex5.setMaxLength(1);
        soundex5.setMaxLength(1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = soundex5.difference("hi!", "01230120022455012623010202");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex5.setMaxLength(1);
        soundex5.setMaxLength(1);
        java.lang.String str11 = soundex5.encode("");
        java.lang.String str13 = soundex5.encode("01230120022455012623010202");
        int int14 = soundex5.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = soundex5.encode((java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("hi!");
        soundex1.setMaxLength((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = soundex1.difference("", "H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("hi!");
        soundex1.setMaxLength((int) (byte) 0);
        soundex1.setMaxLength((int) (byte) 0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            int int10 = soundex5.difference("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int6 = soundex5.getMaxLength();
        java.lang.String str8 = soundex5.encode("01230120022455012623010202");
        soundex5.setMaxLength((int) 'a');
        java.lang.String str12 = soundex5.encode("01230120022455012623010202");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.encode("01230120022455012623010202");
        soundex0.setMaxLength((int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = soundex0.getClass();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("hi!");
        int int4 = soundex1.difference("01230120022455012623010202", "");
        soundex1.setMaxLength(4);
        java.lang.Class<?> wildcardClass7 = soundex1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.encode("01230120022455012623010202");
        java.lang.String str4 = soundex0.encode("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = soundex0.encode((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int6 = soundex3.difference("", "");
        char[] charArray9 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray9);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray9);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray9);
        soundex12.setMaxLength(1);
        soundex12.setMaxLength(1);
        java.lang.String str18 = soundex12.encode("");
        java.lang.String str20 = soundex12.encode("01230120022455012623010202");
        int int21 = soundex12.getMaxLength();
        int int22 = soundex12.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = soundex3.encode((java.lang.Object) soundex12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        java.lang.Class<?> wildcardClass3 = soundex0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex();
        int int8 = soundex7.getMaxLength();
        java.lang.Class<?> wildcardClass9 = soundex7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = soundex6.encode((java.lang.Object) soundex7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("hi!");
        int int4 = soundex1.difference("01230120022455012623010202", "");
        java.lang.Class<?> wildcardClass5 = soundex1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("hi!");
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex("hi!");
        int int6 = soundex3.difference("01230120022455012623010202", "");
        soundex3.setMaxLength(4);
        java.lang.String str10 = soundex3.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = soundex1.encode((java.lang.Object) soundex3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int4 = soundex3.getMaxLength();
        char[] charArray7 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray7);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray7);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = soundex3.encode((java.lang.Object) charArray7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', ' ' });
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        soundex0.setMaxLength(0);
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex();
        int int4 = soundex3.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = soundex0.encode((java.lang.Object) soundex3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int6 = soundex3.difference("", "");
        int int9 = soundex3.difference("01230120022455012623010202", "");
        soundex3.setMaxLength((int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = soundex0.encode((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex5.setMaxLength(1);
        soundex5.setMaxLength(0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = soundex5.difference("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int6 = soundex3.difference("", "");
        int int9 = soundex3.difference("01230120022455012623010202", "");
        int int10 = soundex3.getMaxLength();
        java.lang.Class<?> wildcardClass11 = soundex3.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.Class<?> wildcardClass1 = soundex0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.soundex("01230120022455012623010202");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex5.setMaxLength(1);
        soundex5.setMaxLength(1);
        java.lang.String str11 = soundex5.encode("");
        java.lang.String str13 = soundex5.encode("01230120022455012623010202");
        int int14 = soundex5.getMaxLength();
        int int15 = soundex5.getMaxLength();
        int int16 = soundex5.getMaxLength();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex5.setMaxLength(1);
        soundex5.setMaxLength(0);
        java.lang.String str11 = soundex5.encode("");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        soundex0.setMaxLength(0);
        int int3 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (short) 10);
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex5.setMaxLength(1);
        soundex5.setMaxLength(0);
        int int10 = soundex5.getMaxLength();
        soundex5.setMaxLength((int) (byte) 100);
        java.lang.String str14 = soundex5.soundex("01230120022455012623010202");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        soundex0.setMaxLength(0);
        java.lang.String str4 = soundex0.encode("hi!");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex5.setMaxLength(1);
        soundex5.setMaxLength(1);
        soundex5.setMaxLength((int) (short) 0);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("H000");
        java.lang.String str3 = soundex1.soundex("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex5.setMaxLength(1);
        soundex5.setMaxLength(0);
        int int10 = soundex5.getMaxLength();
        soundex5.setMaxLength((int) (byte) 100);
        int int13 = soundex5.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = soundex5.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int6 = soundex3.difference("", "");
        int int9 = soundex3.difference("01230120022455012623010202", "");
        int int10 = soundex3.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = soundex3.encode((java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex5.setMaxLength(1);
        soundex5.setMaxLength(1);
        java.lang.String str11 = soundex5.encode("");
        java.lang.String str13 = soundex5.encode("01230120022455012623010202");
        int int14 = soundex5.getMaxLength();
        int int15 = soundex5.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = soundex5.difference("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex5.setMaxLength(1);
        soundex5.setMaxLength(0);
        int int10 = soundex5.getMaxLength();
        soundex5.setMaxLength((int) (byte) 100);
        int int13 = soundex5.getMaxLength();
        char[] charArray16 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray16);
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray16);
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray16);
        java.lang.String str21 = soundex19.encode("01230120022455012623010202");
        int int24 = soundex19.difference("01230120022455012623010202", "01230120022455012623010202");
        soundex19.setMaxLength((int) (short) 0);
        soundex19.setMaxLength((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = soundex5.encode((java.lang.Object) soundex19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex5.setMaxLength(1);
        soundex5.setMaxLength(1);
        java.lang.String str11 = soundex5.encode("");
        java.lang.String str13 = soundex5.encode("01230120022455012623010202");
        int int14 = soundex5.getMaxLength();
        java.lang.Class<?> wildcardClass15 = soundex5.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.encode("01230120022455012623010202");
        java.lang.String str4 = soundex0.soundex("hi!");
        int int5 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex("hi!");
        soundex7.setMaxLength(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = soundex0.encode((java.lang.Object) soundex7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int6 = soundex3.difference("", "");
        java.lang.String str8 = soundex3.encode("");
        java.lang.Class<?> wildcardClass9 = soundex3.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("hi!");
        soundex1.setMaxLength(100);
        java.lang.String str5 = soundex1.soundex("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            int int8 = soundex1.difference("01230120022455012623010202", "H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("hi!");
        int int4 = soundex1.difference("01230120022455012623010202", "");
        java.lang.String str6 = soundex1.soundex("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int6 = soundex5.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = soundex5.difference("hi!", "01230120022455012623010202");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        java.lang.String str3 = soundex0.encode("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("hi!");
        int int2 = soundex1.getMaxLength();
        java.lang.String str4 = soundex1.soundex("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int6 = soundex3.difference("", "");
        int int9 = soundex3.difference("01230120022455012623010202", "");
        int int10 = soundex3.getMaxLength();
        soundex3.setMaxLength(4);
        int int13 = soundex3.getMaxLength();
        int int14 = soundex3.getMaxLength();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("hi!");
        int int4 = soundex1.difference("01230120022455012623010202", "");
        soundex1.setMaxLength(4);
        int int7 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int6 = soundex5.getMaxLength();
        soundex5.setMaxLength(10);
        java.lang.String str10 = soundex5.soundex("");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex5.setMaxLength(1);
        soundex5.setMaxLength(1);
        java.lang.String str11 = soundex5.encode("");
        java.lang.String str13 = soundex5.encode("01230120022455012623010202");
        int int14 = soundex5.getMaxLength();
        int int15 = soundex5.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = soundex5.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex5.setMaxLength(1);
        soundex5.setMaxLength(1);
        java.lang.String str11 = soundex5.encode("");
        soundex5.setMaxLength(0);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex5.setMaxLength(1);
        soundex5.setMaxLength(0);
        int int10 = soundex5.getMaxLength();
        int int11 = soundex5.getMaxLength();
        soundex5.setMaxLength((int) (short) 1);
        java.lang.Class<?> wildcardClass14 = soundex5.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        int int1 = soundex0.getMaxLength();
        int int2 = soundex0.getMaxLength();
        int int3 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex();
        int int5 = soundex4.getMaxLength();
        soundex4.setMaxLength((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = soundex0.encode((java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int7 = soundex4.difference("", "01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = soundex4.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("hi!");
        int int4 = soundex1.difference("01230120022455012623010202", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = soundex1.soundex("H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = soundex0.encode(obj1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int6 = soundex5.getMaxLength();
        java.lang.String str8 = soundex5.encode("01230120022455012623010202");
        soundex5.setMaxLength((int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.encode("01230120022455012623010202");
        java.lang.String str4 = soundex0.encode("hi!");
        int int7 = soundex0.difference("H000", "");
        soundex0.setMaxLength((int) ' ');
        java.lang.Class<?> wildcardClass10 = soundex0.getClass();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("hi!");
        soundex1.setMaxLength(100);
        java.lang.String str5 = soundex1.soundex("01230120022455012623010202");
        int int6 = soundex1.getMaxLength();
        int int9 = soundex1.difference("01230120022455012623010202", "");
        char[] charArray12 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray12);
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray12);
        int int17 = soundex14.difference("", "01230120022455012623010202");
        int int18 = soundex14.getMaxLength();
        int int19 = soundex14.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = soundex1.encode((java.lang.Object) soundex14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.encode("01230120022455012623010202");
        java.lang.String str4 = soundex0.encode("hi!");
        int int7 = soundex0.difference("H000", "");
        soundex0.setMaxLength((int) (short) 100);
        int int12 = soundex0.difference("01230120022455012623010202", "H000");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int7 = soundex4.difference("", "01230120022455012623010202");
        int int8 = soundex4.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = soundex4.difference("01230120022455012623010202", "H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex5.setMaxLength(1);
        soundex5.setMaxLength(1);
        java.lang.String str11 = soundex5.encode("");
        java.lang.String str13 = soundex5.encode("01230120022455012623010202");
        int int14 = soundex5.getMaxLength();
        int int15 = soundex5.getMaxLength();
        java.lang.String str17 = soundex5.encode("");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("hi!");
        int int2 = soundex1.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = soundex1.encode((java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int6 = soundex5.getMaxLength();
        java.lang.String str8 = soundex5.encode("01230120022455012623010202");
        soundex5.setMaxLength((int) 'a');
        char[] charArray13 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray13);
        int int17 = soundex16.getMaxLength();
        java.lang.String str19 = soundex16.encode("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = soundex5.encode((java.lang.Object) soundex16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int6 = soundex5.getMaxLength();
        java.lang.String str8 = soundex5.encode("01230120022455012623010202");
        soundex5.setMaxLength((int) 'a');
        int int13 = soundex5.difference("", "");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.encode("01230120022455012623010202");
        soundex0.setMaxLength((int) (byte) -1);
        soundex0.setMaxLength(1);
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.encode("01230120022455012623010202");
        java.lang.Class<?> wildcardClass3 = soundex0.getClass();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex5.setMaxLength(1);
        soundex5.setMaxLength(0);
        int int10 = soundex5.getMaxLength();
        int int11 = soundex5.getMaxLength();
        soundex5.setMaxLength((int) (short) 1);
        java.lang.String str15 = soundex5.encode("01230120022455012623010202");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int6 = soundex5.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = soundex5.difference("", "H000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.encode("01230120022455012623010202");
        java.lang.String str4 = soundex0.encode("hi!");
        int int7 = soundex0.difference("H000", "");
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex5.setMaxLength(1);
        soundex5.setMaxLength(0);
        int int10 = soundex5.getMaxLength();
        soundex5.setMaxLength((int) (byte) 100);
        int int13 = soundex5.getMaxLength();
        java.lang.String str15 = soundex5.soundex("01230120022455012623010202");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex5.setMaxLength(1);
        soundex5.setMaxLength(0);
        soundex5.setMaxLength(100);
        int int12 = soundex5.getMaxLength();
        int int15 = soundex5.difference("", "01230120022455012623010202");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int6 = soundex5.getMaxLength();
        soundex5.setMaxLength(10);
        int int9 = soundex5.getMaxLength();
        int int10 = soundex5.getMaxLength();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        char[] charArray2 = new char[] { '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex5.setMaxLength(1);
        soundex5.setMaxLength(0);
        int int10 = soundex5.getMaxLength();
        soundex5.setMaxLength((int) (byte) 100);
        int int15 = soundex5.difference("01230120022455012623010202", "01230120022455012623010202");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4', ' ' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.encode("01230120022455012623010202");
        java.lang.String str4 = soundex0.encode("hi!");
        soundex0.setMaxLength((-1));
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
    }
}

