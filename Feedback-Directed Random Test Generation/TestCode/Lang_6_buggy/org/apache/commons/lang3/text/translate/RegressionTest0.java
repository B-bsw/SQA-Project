package org.apache.commons.lang3.text.translate;

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
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((-1));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1, "FFFFFFFF");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23" + "'", str1, "23");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61" + "'", str1, "61");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "64" + "'", str1, "64");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1, "FFFFFFFF");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1, "FFFFFFFF");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "34" + "'", str1, "34");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "64" + "'", str1, "64");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "64" + "'", str1, "64");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "20" + "'", str1, "20");
    }
}

