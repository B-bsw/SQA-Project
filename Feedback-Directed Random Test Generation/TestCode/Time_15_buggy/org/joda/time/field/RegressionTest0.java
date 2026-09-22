package org.joda.time.field;

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
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) 'a', (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) 'a', (int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) 10, 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) '4', 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) '#', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 350L + "'", long2 == 350L);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) '4', 0, (int) '4');
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) (short) 1, (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1 for hi! must be in the range [100,100]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 10, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (short) 100, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 197L + "'", long2 == 197L);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 520 + "'", int2 == 520);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (int) (short) 0, (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [1,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 100, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 0, 520, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [520,35]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 0, (int) '4', 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (byte) 100, 1, (int) (short) 100);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (short) -1, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31L + "'", long2 == 31L);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (byte) 1, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (byte) -1, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) (byte) 1, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1 for hi! must be in the range [0,-1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10) + "'", int1 == (-10));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-10), (int) ' ', 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1), (java.lang.Object) (-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 100, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(10, 100, 520);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 431 + "'", int3 == 431);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) ' ', (int) (short) 0, (int) ' ');
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1L), (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (int) (short) 1, (int) (short) 0, (int) 'a');
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) 100, (int) (byte) 100, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 1, 520, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) '4', 0, 431);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 52, 22);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1144L + "'", long2 == 1144L);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-10), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-970) + "'", int2 == (-970));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (byte) 1, 520, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 62 + "'", int2 == 62);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-10));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) '#', 350L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 385L + "'", long2 == 385L);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(22, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1144 + "'", int2 == 1144);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 22, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-30L) + "'", long2 == (-30L));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(350L, (long) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33950 + "'", int2 == 33950);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (byte) 0, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) ' ', (long) 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1664 + "'", int2 == 1664);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (byte) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 350L + "'", long2 == 350L);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1, (int) (byte) -1, (int) 'a', 520);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 424 + "'", int4 == 424);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(385L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 285L + "'", long2 == 285L);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 100, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hi! must be in the range [32,35]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1), 33950, 33950);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-30L), (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22L + "'", long2 == 22L);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 424, (java.lang.Object) (-970));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1, 33950, 33950);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) ' ', 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 22, (int) (byte) 100, 1144);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 22 for  must be in the range [100,1144]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1664, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1664 for hi! must be in the range [10,97]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) '4', (-970), 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-930) + "'", int3 == (-930));
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(100L, (-1L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-100) + "'", int2 == (-100));
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) ' ', (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1144, 1144, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, (-970), 1144);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 11, (long) (-970));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-959L) + "'", long2 == (-959L));
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) -1, (int) (byte) 100, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1664, (int) '4', (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 54 + "'", int3 == 54);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(100L, (long) 33950);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3395000 + "'", int2 == 3395000);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-100), (int) ' ', 22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 3395000, 431, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(424, 3395000, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (byte) 1, (java.lang.Object) 52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1L), (-970));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 970L + "'", long2 == 970L);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (byte) 10, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 22);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(431, 424);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 855 + "'", int2 == 855);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(431, 54, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(855, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 865 + "'", int2 == 865);
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test86");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(33950, (-970), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-70) + "'", int3 == (-70));
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test87");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 62, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test88");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (byte) 100, 0, (-970));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test89");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) '4', 11, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test90");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (byte) 1, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-96L) + "'", long2 == (-96L));
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test91");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(33950, (-100), 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test92");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-100) + "'", int1 == (-100));
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test93");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (byte) 100, 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9700L + "'", long2 == 9700L);
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test94");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 54, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54 for  must be in the range [10,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test95() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test95");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1L, 865);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 865L + "'", long2 == 865L);
    }
}

