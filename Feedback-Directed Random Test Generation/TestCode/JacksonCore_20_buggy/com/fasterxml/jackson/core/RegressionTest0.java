package com.fasterxml.jackson.core;

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
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        int int0 = com.fasterxml.jackson.core.JsonGenerator.Feature.collectDefaults();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 31 + "'", int0 == 31);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
        java.lang.Class<?> wildcardClass1 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
        boolean boolean2 = feature0.enabledIn(0);
        java.lang.Class<?> wildcardClass3 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
        java.lang.Class<?> wildcardClass1 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
        boolean boolean2 = feature0.enabledIn((int) (short) -1);
        java.lang.Class<?> wildcardClass3 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
        java.lang.Class<?> wildcardClass1 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
        java.lang.Class<?> wildcardClass1 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
        int int1 = feature0.getMask();
        java.lang.Class<?> wildcardClass2 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
        boolean boolean2 = feature0.enabledIn(0);
        boolean boolean4 = feature0.enabledIn((int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
        boolean boolean2 = feature0.enabledIn((int) (short) 10);
        boolean boolean3 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
        java.lang.Class<?> wildcardClass1 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
        boolean boolean2 = feature0.enabledIn((int) '4');
        java.lang.Class<?> wildcardClass3 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(32);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
        boolean boolean2 = feature0.enabledIn((int) '4');
        int int3 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
        boolean boolean2 = feature0.enabledIn((int) '4');
        boolean boolean4 = feature0.enabledIn(1);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
        boolean boolean1 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass2 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
        boolean boolean2 = feature0.enabledIn(0);
        java.lang.Class<?> wildcardClass3 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
        boolean boolean2 = feature0.enabledIn(0);
        boolean boolean4 = feature0.enabledIn((int) (byte) -1);
        boolean boolean6 = feature0.enabledIn(1);
        java.lang.Class<?> wildcardClass7 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
        int int1 = feature0.getMask();
        java.lang.Class<?> wildcardClass2 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 256 + "'", int1 == 256);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        boolean boolean3 = feature0.enabledByDefault();
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
        boolean boolean2 = feature0.enabledIn((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
        boolean boolean2 = feature0.enabledIn(8);
        java.lang.Class<?> wildcardClass3 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        java.lang.Class<?> wildcardClass4 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
        boolean boolean2 = feature0.enabledIn(0);
        boolean boolean4 = feature0.enabledIn((int) (byte) -1);
        boolean boolean6 = feature0.enabledIn(10);
        boolean boolean8 = feature0.enabledIn((int) (short) -1);
        boolean boolean10 = feature0.enabledIn(100);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
        boolean boolean2 = feature0.enabledIn(0);
        boolean boolean4 = feature0.enabledIn((int) (byte) -1);
        boolean boolean6 = feature0.enabledIn(1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
        boolean boolean2 = feature0.enabledIn(0);
        boolean boolean4 = feature0.enabledIn((int) (byte) -1);
        boolean boolean6 = feature0.enabledIn(1);
        boolean boolean7 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
        boolean boolean2 = feature0.enabledIn((int) (byte) 100);
        int int3 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass3 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
        boolean boolean2 = feature0.enabledIn(0);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass5 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass3 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 128 + "'", int1 == 128);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
        boolean boolean2 = feature0.enabledIn(0);
        boolean boolean4 = feature0.enabledIn((-1));
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
        boolean boolean2 = feature0.enabledIn(0);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(256);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
        java.lang.Class<?> wildcardClass1 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
        boolean boolean2 = feature0.enabledIn((int) (short) 10);
        java.lang.Class<?> wildcardClass3 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
        boolean boolean2 = feature0.enabledIn((int) (short) 10);
        int int3 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
        boolean boolean2 = feature0.enabledIn((int) (short) 10);
        boolean boolean4 = feature0.enabledIn((int) (short) 10);
        boolean boolean6 = feature0.enabledIn(0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
        boolean boolean2 = feature0.enabledIn((int) (short) 10);
        boolean boolean4 = feature0.enabledIn((int) (short) 10);
        int int5 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
        int int1 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
        boolean boolean1 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 256 + "'", int1 == 256);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 256 + "'", int2 == 256);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature0 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
        boolean boolean2 = feature0.enabledIn((int) 'a');
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII + "'", feature0.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}

