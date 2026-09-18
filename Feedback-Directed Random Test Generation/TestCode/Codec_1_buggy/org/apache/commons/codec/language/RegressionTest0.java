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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = metaphone0.encode((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "hi!");
        java.lang.Class<?> wildcardClass4 = metaphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "hi!");
        metaphone0.setMaxCodeLen((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("");
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = caverphone0.encode(obj3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "hi!");
        int int4 = metaphone0.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = metaphone0.encode((java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("AA11111111", "");
        java.lang.String str5 = metaphone0.metaphone("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.codec.language.SoundexUtils soundexUtils0 = new org.apache.commons.codec.language.SoundexUtils();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI" + "'", str1, "HI");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "hi!");
        int int4 = metaphone0.getMaxCodeLen();
        int int7 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "HI", "HI");
        metaphone0.setMaxCodeLen((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("1111111111", "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("");
        java.lang.String str4 = caverphone0.encode("1111111111");
        java.lang.String str6 = caverphone0.caverphone("AA11111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("HI", "HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1111111111" + "'", str4, "1111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AA11111111" + "'", str6, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI" + "'", str1, "HI");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", 10);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        char char9 = doubleMetaphone0.charAt("H", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "hi!");
        int int4 = metaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone5 = new org.apache.commons.codec.language.DoubleMetaphone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = metaphone0.encode((java.lang.Object) doubleMetaphone5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("H", (int) (short) 1);
        boolean boolean6 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen(1);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.caverphone("hi!");
        boolean boolean5 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str7 = caverphone0.encode("hi!");
        boolean boolean10 = caverphone0.isCaverphoneEqual("1111111111", "H");
        java.lang.Class<?> wildcardClass11 = caverphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AA11111111" + "'", str2, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.caverphone("hi!");
        boolean boolean5 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AA11111111" + "'", str2, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.Caverphone caverphone1 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str3 = caverphone1.caverphone("hi!");
        boolean boolean6 = caverphone1.isCaverphoneEqual("hi!", "");
        java.lang.String str8 = caverphone1.encode("hi!");
        boolean boolean11 = caverphone1.isCaverphoneEqual("1111111111", "H");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) boolean11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AA11111111" + "'", str3, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", 10);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        int int9 = doubleMetaphone0.maxCodeLen;
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("hi!");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("");
        java.lang.String str4 = caverphone0.encode("1111111111");
        java.lang.String str6 = caverphone0.encode("AA11111111");
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "HI", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = caverphone0.encode((java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1111111111" + "'", str4, "1111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AA11111111" + "'", str6, "AA11111111");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "hi!");
        boolean boolean6 = metaphone0.isMetaphoneEqual("", "hi!");
        metaphone0.setMaxCodeLen((int) (short) 0);
        boolean boolean11 = metaphone0.isMetaphoneEqual("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = metaphone0.encode((java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "hi!");
        boolean boolean6 = metaphone0.isMetaphoneEqual("", "hi!");
        metaphone0.setMaxCodeLen((int) (short) 0);
        int int9 = metaphone0.getMaxCodeLen();
        int int10 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", 10);
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("AA11111111", "hi!", true);
        java.lang.String str9 = doubleMetaphone0.encode("");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "hi!");
        java.lang.String str5 = metaphone0.metaphone("");
        java.lang.String str7 = metaphone0.encode("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("");
        java.lang.String str4 = caverphone0.encode("1111111111");
        java.lang.String str6 = caverphone0.caverphone("AA11111111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = caverphone0.encode((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1111111111" + "'", str4, "1111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AA11111111" + "'", str6, "AA11111111");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("AA11111111", "");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "", "HI");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", 10);
        int int4 = doubleMetaphone0.maxCodeLen;
        char char7 = doubleMetaphone0.charAt("AA11111111", 0);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("", false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'A' + "'", char7 == 'A');
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        java.lang.String[] strArray12 = new java.lang.String[] { "AA11111111", "", "hi!", "hi!", "hi!", "" };
        boolean boolean13 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'a', (int) (short) 0, strArray12);
        boolean boolean14 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) '4', (-1), strArray12);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "AA11111111", "", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", 10);
        int int4 = doubleMetaphone0.maxCodeLen;
        java.lang.String str6 = doubleMetaphone0.encode("1111111111");
        java.lang.Class<?> wildcardClass7 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.caverphone("hi!");
        boolean boolean5 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "H");
        java.lang.String str10 = caverphone0.encode("HI");
        boolean boolean13 = caverphone0.isCaverphoneEqual("hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AA11111111" + "'", str2, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }
}

