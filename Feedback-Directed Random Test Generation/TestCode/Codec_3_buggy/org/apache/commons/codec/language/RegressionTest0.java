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
        java.lang.String[] strArray3 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) 1, (int) (short) -1, strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = doubleMetaphone0.encode(obj2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str5 = doubleMetaphone0.encode("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int4 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        java.lang.String str4 = doubleMetaphoneResult3.getPrimary();
        doubleMetaphoneResult3.append("", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.maxCodeLen = 0;
        doubleMetaphone0.maxCodeLen = (byte) 0;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = doubleMetaphone0.encode((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        doubleMetaphoneResult3.appendPrimary("H");
        doubleMetaphoneResult3.append('a');
        doubleMetaphoneResult3.append('#', 'a');
        doubleMetaphoneResult3.appendPrimary("H");
        doubleMetaphoneResult3.appendAlternate("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.Class<?> wildcardClass4 = doubleMetaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean3 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int4 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("");
        char char7 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("", false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        doubleMetaphoneResult3.appendPrimary("H");
        doubleMetaphoneResult3.appendPrimary("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(0);
        doubleMetaphone0.setMaxCodeLen((int) '4');
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        doubleMetaphoneResult3.appendPrimary("H");
        doubleMetaphoneResult3.append('a');
        doubleMetaphoneResult3.append('#', 'a');
        doubleMetaphoneResult3.appendPrimary("H");
        doubleMetaphoneResult3.appendPrimary("H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("hi!", true);
        java.lang.String str10 = doubleMetaphone0.encode("H");
        char char13 = doubleMetaphone0.charAt("hi!", 100);
        int int14 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        doubleMetaphoneResult3.appendPrimary("H");
        doubleMetaphoneResult3.append('a');
        doubleMetaphoneResult3.appendAlternate('4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        doubleMetaphoneResult3.appendPrimary("H");
        doubleMetaphoneResult3.append('a');
        doubleMetaphoneResult3.appendAlternate("");
        doubleMetaphoneResult3.appendPrimary("hi!");
        doubleMetaphoneResult3.append(' ', '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        doubleMetaphoneResult3.appendPrimary("H");
        doubleMetaphoneResult3.append('a');
        doubleMetaphoneResult3.appendAlternate('\000');
        doubleMetaphoneResult3.append("hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        doubleMetaphoneResult3.appendPrimary("H");
        doubleMetaphoneResult3.append(' ');
        doubleMetaphoneResult3.appendAlternate("");
        doubleMetaphoneResult3.append("", "");
        doubleMetaphoneResult3.appendPrimary("hi!");
        doubleMetaphoneResult3.append("hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        doubleMetaphoneResult3.appendPrimary("H");
        java.lang.String str6 = doubleMetaphoneResult3.getAlternate();
        java.lang.String str7 = doubleMetaphoneResult3.getPrimary();
        doubleMetaphoneResult3.append('a', 'a');
        java.lang.String str11 = doubleMetaphoneResult3.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = (byte) 1;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        doubleMetaphoneResult3.appendPrimary("H");
        doubleMetaphoneResult3.append('a');
        doubleMetaphoneResult3.append('#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int2 = doubleMetaphone1.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone1.new DoubleMetaphoneResult(1);
        doubleMetaphoneResult4.appendPrimary("H");
        boolean boolean7 = doubleMetaphoneResult4.isComplete();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        doubleMetaphoneResult3.appendPrimary("H");
        doubleMetaphoneResult3.appendPrimary('\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("hi!");
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "", false);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        int int11 = doubleMetaphone0.getMaxCodeLen();
        int int12 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("");
        char char7 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.maxCodeLen = 0;
        int int6 = doubleMetaphone0.maxCodeLen;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        java.lang.String str4 = doubleMetaphoneResult3.getPrimary();
        doubleMetaphoneResult3.appendPrimary("hi!");
        doubleMetaphoneResult3.appendAlternate("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        doubleMetaphoneResult3.appendPrimary("H");
        doubleMetaphoneResult3.append(' ');
        doubleMetaphoneResult3.appendAlternate("");
        doubleMetaphoneResult3.append("", "");
        doubleMetaphoneResult3.appendPrimary("hi!");
        doubleMetaphoneResult3.append("", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!", false);
        java.lang.String str13 = doubleMetaphone0.encode("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        doubleMetaphoneResult3.appendPrimary("H");
        doubleMetaphoneResult3.append('a');
        doubleMetaphoneResult3.appendAlternate('\000');
        doubleMetaphoneResult3.appendAlternate('4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        int int2 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.maxCodeLen = (short) 1;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        java.lang.String[] strArray15 = new java.lang.String[] { "H", "hi!", "", "H", "H", "H" };
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) (short) 100, strArray15);
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'a', (int) (byte) 0, strArray15);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", 10, (int) 'a', strArray15);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "H", "hi!", "", "H", "H", "H" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        doubleMetaphoneResult3.append('\000', ' ');
        doubleMetaphoneResult3.append('\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.maxCodeLen = 0;
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("", true);
        java.lang.String str12 = doubleMetaphone0.encode("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        doubleMetaphoneResult3.appendPrimary("H");
        doubleMetaphoneResult3.append('a');
        java.lang.String str8 = doubleMetaphoneResult3.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen(1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        doubleMetaphoneResult3.appendPrimary("H");
        doubleMetaphoneResult3.append('a');
        doubleMetaphoneResult3.appendAlternate("");
        doubleMetaphoneResult3.appendPrimary("hi!");
        doubleMetaphoneResult3.appendPrimary('\000');
        java.lang.String str14 = doubleMetaphoneResult3.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        doubleMetaphoneResult3.appendPrimary("H");
        doubleMetaphoneResult3.append('a');
        doubleMetaphoneResult3.appendAlternate("");
        doubleMetaphoneResult3.append("H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.maxCodeLen = 0;
        int int6 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (byte) 10;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("hi!");
        int int6 = doubleMetaphone0.maxCodeLen;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult4.append("", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("hi!", true);
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = ' ';
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult4.append('\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = (byte) 1;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        doubleMetaphoneResult8.append('#');
        java.lang.String str11 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#" + "'", str11, "#");
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 1);
        boolean boolean6 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        doubleMetaphoneResult3.appendPrimary("H");
        doubleMetaphoneResult3.append('a');
        doubleMetaphoneResult3.append("H");
        doubleMetaphoneResult3.append("", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult3 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = (byte) 1;
        doubleMetaphone0.maxCodeLen = 10;
        java.lang.Class<?> wildcardClass9 = doubleMetaphone0.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = (byte) 1;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        int int9 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen(0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean3 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("hi!");
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "", false);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.maxCodeLen = 0;
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("", true);
        doubleMetaphone0.maxCodeLen = (short) 1;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        int int2 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        doubleMetaphone0.maxCodeLen = 10;
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("hi!", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(0);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H", false);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        char char5 = doubleMetaphone0.charAt("#", (int) '4');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("a", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.maxCodeLen = 0;
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.maxCodeLen = 0;
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = 4;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }
}

