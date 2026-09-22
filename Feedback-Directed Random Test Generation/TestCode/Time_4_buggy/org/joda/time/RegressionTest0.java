package org.joda.time;

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
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[] {};
        int[] intArray7 = new int[] { (byte) 1, 'a', '4', '#', (short) 1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial8 = new org.joda.time.Partial(dateTimeFieldTypeArray0, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Values array must be the same length as the types array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray0);
        org.junit.Assert.assertArrayEquals(dateTimeFieldTypeArray0, new org.joda.time.DateTimeFieldType[] {});
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1, 97, 52, 35, 1, 52 });
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial2 = new org.joda.time.Partial(dateTimeFieldType0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean8 = partial1.isMatch((org.joda.time.ReadablePartial) partial4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = partial1.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField3 = partial1.getField((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean8 = partial1.isMatch((org.joda.time.ReadablePartial) partial4);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.Partial partial10 = partial1.plus(readablePeriod9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType12 = partial1.getFieldType(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(partial10);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.Partial partial4 = partial1.without(dateTimeFieldType3);
        boolean boolean6 = partial4.equals((java.lang.Object) 10L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType8 = partial4.getFieldType((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(partial4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean8 = partial1.isMatch((org.joda.time.ReadablePartial) partial4);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial.Property property10 = partial4.property(dateTimeFieldType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean8 = partial1.isMatch((org.joda.time.ReadablePartial) partial4);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.Partial partial10 = partial1.plus(readablePeriod9);
        java.lang.String str11 = partial10.toStringList();
        java.lang.Class<?> wildcardClass12 = partial10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(partial10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType3 = partial1.getFieldType((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean8 = partial1.isMatch((org.joda.time.ReadablePartial) partial4);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.Partial partial10 = partial1.plus(readablePeriod9);
        java.lang.String str11 = partial10.toStringList();
        org.joda.time.Partial.Property property13 = new org.joda.time.Partial.Property(partial10, 100);
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = property13.getMaximumShortTextLength(locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(partial10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean8 = partial1.isMatch((org.joda.time.ReadablePartial) partial4);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.Partial partial10 = partial1.plus(readablePeriod9);
        java.lang.String str11 = partial10.toStringList();
        org.joda.time.Partial.Property property13 = new org.joda.time.Partial.Property(partial10, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = property13.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(partial10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean8 = partial1.isMatch((org.joda.time.ReadablePartial) partial4);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.Partial partial10 = partial1.plus(readablePeriod9);
        java.lang.String str11 = partial10.toStringList();
        org.joda.time.Partial.Property property13 = new org.joda.time.Partial.Property(partial10, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = property13.getAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(partial10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.Partial partial4 = partial1.without(dateTimeFieldType3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = partial4.toString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(partial4);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.Partial partial4 = partial1.without(dateTimeFieldType3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial7 = partial4.withField(dateTimeFieldType5, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(partial4);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[] {};
        int[] intArray7 = new int[] { 10, 1, (short) 0, (byte) 1, (byte) 100, (byte) 100 };
        org.joda.time.Chronology chronology8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial9 = new org.joda.time.Partial(dateTimeFieldTypeArray0, intArray7, chronology8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Values array must be the same length as the types array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray0);
        org.junit.Assert.assertArrayEquals(dateTimeFieldTypeArray0, new org.joda.time.DateTimeFieldType[] {});
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 10, 1, 0, 1, 100, 100 });
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean8 = partial1.isMatch((org.joda.time.ReadablePartial) partial4);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.Partial partial10 = partial1.plus(readablePeriod9);
        java.lang.String str11 = partial10.toStringList();
        org.joda.time.Partial.Property property13 = new org.joda.time.Partial.Property(partial10, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial15 = property13.addWrapFieldToCopy((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(partial10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean8 = partial1.isMatch((org.joda.time.ReadablePartial) partial4);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.Partial partial10 = partial1.plus(readablePeriod9);
        java.lang.String str11 = partial10.toStringList();
        org.joda.time.Partial.Property property13 = new org.joda.time.Partial.Property(partial10, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial15 = property13.setCopy((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(partial10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.Partial partial4 = partial1.without(dateTimeFieldType3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Partial partial6 = partial1.withChronologyRetainFields(chronology5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        boolean boolean8 = partial6.isMatch(readableInstant7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial.Property property10 = partial6.property(dateTimeFieldType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(partial4);
        org.junit.Assert.assertNotNull(partial6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean8 = partial1.isMatch((org.joda.time.ReadablePartial) partial4);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.Partial partial10 = partial1.plus(readablePeriod9);
        java.lang.String str11 = partial10.toStringList();
        org.joda.time.Partial.Property property13 = new org.joda.time.Partial.Property(partial10, 100);
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = property13.getAsText(locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(partial10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean8 = partial1.isMatch((org.joda.time.ReadablePartial) partial4);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.Partial partial10 = partial1.plus(readablePeriod9);
        java.lang.String str11 = partial10.toStringList();
        org.joda.time.Partial.Property property13 = new org.joda.time.Partial.Property(partial10, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = property13.getAsText();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(partial10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean8 = partial1.isMatch((org.joda.time.ReadablePartial) partial4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = partial1.toString(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        java.lang.String str2 = partial0.toString(dateTimeFormatter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.Partial partial4 = partial1.without(dateTimeFieldType3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Partial partial6 = partial1.withChronologyRetainFields(chronology5);
        java.lang.String str7 = partial6.toString();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = partial6.getFormatter();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(partial4);
        org.junit.Assert.assertNotNull(partial6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(dateTimeFormatter8);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean8 = partial1.isMatch((org.joda.time.ReadablePartial) partial4);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.Partial partial10 = partial1.plus(readablePeriod9);
        java.lang.String str11 = partial10.toStringList();
        org.joda.time.Partial.Property property13 = new org.joda.time.Partial.Property(partial10, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationField durationField14 = property13.getDurationField();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(partial10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.Partial partial4 = partial1.without(dateTimeFieldType3);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = partial1.getFieldTypes();
        int[] intArray10 = new int[] { 0, (short) 1, 'a', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial11 = new org.joda.time.Partial(dateTimeFieldTypeArray5, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Values array must be the same length as the types array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(partial4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertArrayEquals(dateTimeFieldTypeArray5, new org.joda.time.DateTimeFieldType[] {});
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 1, 97, (-1) });
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean8 = partial1.isMatch((org.joda.time.ReadablePartial) partial4);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.Partial partial10 = partial1.plus(readablePeriod9);
        java.lang.String str11 = partial10.toStringList();
        org.joda.time.Partial.Property property13 = new org.joda.time.Partial.Property(partial10, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationField durationField14 = property13.getRangeDurationField();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(partial10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean8 = partial1.isMatch((org.joda.time.ReadablePartial) partial4);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.Partial partial10 = partial1.plus(readablePeriod9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        int int12 = partial10.indexOf(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(partial10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.Partial partial4 = partial1.without(dateTimeFieldType3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Partial partial6 = partial1.withChronologyRetainFields(chronology5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        boolean boolean8 = partial6.isMatch(readableInstant7);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = partial6.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(partial4);
        org.junit.Assert.assertNotNull(partial6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean8 = partial1.isMatch((org.joda.time.ReadablePartial) partial4);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.Partial partial10 = partial1.plus(readablePeriod9);
        java.lang.String str11 = partial10.toStringList();
        org.joda.time.Partial.Property property13 = new org.joda.time.Partial.Property(partial10, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial15 = property13.setCopy("[]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(partial10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Partial partial2 = new org.joda.time.Partial(chronology1);
        int[] intArray3 = partial2.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        org.joda.time.Partial partial5 = partial2.without(dateTimeFieldType4);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray6 = partial2.getFieldTypes();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Partial partial8 = new org.joda.time.Partial(chronology7);
        int[] intArray9 = partial8.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.Partial partial11 = partial8.without(dateTimeFieldType10);
        int[] intArray15 = new int[] { (byte) -1, 'a', (short) 0 };
        org.joda.time.Partial partial16 = new org.joda.time.Partial(partial11, intArray15);
        org.joda.time.Partial partial17 = new org.joda.time.Partial(chronology0, dateTimeFieldTypeArray6, intArray15);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] {});
        org.junit.Assert.assertNotNull(partial5);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray6);
        org.junit.Assert.assertArrayEquals(dateTimeFieldTypeArray6, new org.joda.time.DateTimeFieldType[] {});
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] {});
        org.junit.Assert.assertNotNull(partial11);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-1), 97, 0 });
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.Partial partial4 = partial1.without(dateTimeFieldType3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = partial1.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(partial4);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.Partial partial3 = partial1.plus(readablePeriod2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Partial partial5 = partial1.withChronologyRetainFields(chronology4);
        org.joda.time.Partial partial6 = new org.joda.time.Partial((org.joda.time.ReadablePartial) partial5);
        org.joda.time.Chronology chronology8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField9 = partial6.getField((int) (short) 1, chronology8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(partial3);
        org.junit.Assert.assertNotNull(partial5);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean8 = partial1.isMatch((org.joda.time.ReadablePartial) partial4);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.Partial partial10 = partial1.plus(readablePeriod9);
        java.lang.String str11 = partial10.toStringList();
        org.joda.time.Partial.Property property13 = new org.joda.time.Partial.Property(partial10, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = property13.getMaximumValue();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(partial10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean8 = partial1.isMatch((org.joda.time.ReadablePartial) partial4);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.Partial partial10 = partial1.plus(readablePeriod9);
        java.lang.String str11 = partial10.toStringList();
        org.joda.time.Partial.Property property13 = new org.joda.time.Partial.Property(partial10, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial14 = property13.withMaximumValue();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(partial10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.Chronology chronology2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial3 = new org.joda.time.Partial(dateTimeFieldType0, 1, chronology2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean8 = partial1.isMatch((org.joda.time.ReadablePartial) partial4);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.Partial partial10 = partial1.plus(readablePeriod9);
        java.lang.String str11 = partial10.toStringList();
        org.joda.time.Partial.Property property13 = new org.joda.time.Partial.Property(partial10, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType14 = property13.getFieldType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(partial10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = partial1.toString("[]", locale3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean8 = partial1.isMatch((org.joda.time.ReadablePartial) partial4);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.Partial partial10 = partial1.plus(readablePeriod9);
        java.lang.String str11 = partial10.toStringList();
        org.joda.time.Partial.Property property13 = new org.joda.time.Partial.Property(partial10, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = property13.getMinimumValue();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(partial10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.Partial partial4 = partial1.without(dateTimeFieldType3);
        int[] intArray8 = new int[] { (byte) -1, 'a', (short) 0 };
        org.joda.time.Partial partial9 = new org.joda.time.Partial(partial4, intArray8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        int int11 = partial4.indexOf(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(partial4);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { (-1), 97, 0 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[] {};
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Partial partial2 = new org.joda.time.Partial(chronology1);
        int[] intArray3 = partial2.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        org.joda.time.Partial partial5 = partial2.without(dateTimeFieldType4);
        int[] intArray9 = new int[] { (byte) -1, 'a', (short) 0 };
        org.joda.time.Partial partial10 = new org.joda.time.Partial(partial5, intArray9);
        org.joda.time.Chronology chronology11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial12 = new org.joda.time.Partial(dateTimeFieldTypeArray0, intArray9, chronology11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Values array must be the same length as the types array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray0);
        org.junit.Assert.assertArrayEquals(dateTimeFieldTypeArray0, new org.joda.time.DateTimeFieldType[] {});
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] {});
        org.junit.Assert.assertNotNull(partial5);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 97, 0 });
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean8 = partial1.isMatch((org.joda.time.ReadablePartial) partial4);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.Partial partial10 = partial1.plus(readablePeriod9);
        java.lang.String str11 = partial10.toStringList();
        org.joda.time.Partial.Property property13 = new org.joda.time.Partial.Property(partial10, 100);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Partial partial15 = new org.joda.time.Partial(chronology14);
        int[] intArray16 = partial15.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        org.joda.time.Partial partial18 = partial15.without(dateTimeFieldType17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Partial partial20 = partial15.withChronologyRetainFields(chronology19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        boolean boolean22 = partial20.isMatch(readableInstant21);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = property13.compareTo((org.joda.time.ReadablePartial) partial20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(partial10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] {});
        org.junit.Assert.assertNotNull(partial18);
        org.junit.Assert.assertNotNull(partial20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.Partial partial3 = partial1.plus(readablePeriod2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Partial partial5 = partial1.withChronologyRetainFields(chronology4);
        org.joda.time.Partial partial6 = new org.joda.time.Partial((org.joda.time.ReadablePartial) partial5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial9 = partial6.with(dateTimeFieldType7, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(partial3);
        org.junit.Assert.assertNotNull(partial5);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray2 = partial1.getFieldTypes();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean9 = partial7.equals((java.lang.Object) 10L);
        boolean boolean10 = partial1.isBefore((org.joda.time.ReadablePartial) partial7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Partial partial12 = partial1.withChronologyRetainFields(chronology11);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldTypeArray2, new org.joda.time.DateTimeFieldType[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(partial12);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean8 = partial1.isMatch((org.joda.time.ReadablePartial) partial4);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.Partial partial10 = partial1.plus(readablePeriod9);
        java.lang.String str11 = partial10.toStringList();
        org.joda.time.Partial.Property property13 = new org.joda.time.Partial.Property(partial10, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = property13.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(partial10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean8 = partial1.isMatch((org.joda.time.ReadablePartial) partial4);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.Partial partial10 = partial1.plus(readablePeriod9);
        java.lang.String str11 = partial10.toStringList();
        org.joda.time.Partial.Property property13 = new org.joda.time.Partial.Property(partial10, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField14 = property13.getField();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(partial10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.Partial partial4 = partial1.without(dateTimeFieldType3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Partial partial6 = partial1.withChronologyRetainFields(chronology5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = partial6.toString(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(partial4);
        org.junit.Assert.assertNotNull(partial6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.Partial partial4 = partial1.without(dateTimeFieldType3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Partial partial6 = partial1.withChronologyRetainFields(chronology5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = partial1.isSupported(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(partial4);
        org.junit.Assert.assertNotNull(partial6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.Chronology chronology2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial3 = new org.joda.time.Partial(dateTimeFieldType0, (int) ' ', chronology2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean8 = partial1.isMatch((org.joda.time.ReadablePartial) partial4);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.Partial partial11 = partial1.withPeriodAdded(readablePeriod9, (int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        org.joda.time.Partial partial13 = partial11.without(dateTimeFieldType12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.Partial partial15 = partial11.minus(readablePeriod14);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(partial11);
        org.junit.Assert.assertNotNull(partial13);
        org.junit.Assert.assertNotNull(partial15);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray2 = partial1.getFieldTypes();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean9 = partial7.equals((java.lang.Object) 10L);
        boolean boolean10 = partial1.isBefore((org.joda.time.ReadablePartial) partial7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = partial1.toString(dateTimeFormatter11);
        org.joda.time.Partial.Property property14 = new org.joda.time.Partial.Property(partial1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = property14.getMaximumValue();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldTypeArray2, new org.joda.time.DateTimeFieldType[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.Partial partial3 = partial1.plus(readablePeriod2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Partial partial5 = partial1.withChronologyRetainFields(chronology4);
        org.joda.time.Partial partial6 = new org.joda.time.Partial((org.joda.time.ReadablePartial) partial5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Partial partial8 = new org.joda.time.Partial(chronology7);
        int[] intArray9 = partial8.getValues();
        org.joda.time.Partial partial10 = new org.joda.time.Partial(partial6, intArray9);
        org.junit.Assert.assertNotNull(partial3);
        org.junit.Assert.assertNotNull(partial5);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] {});
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean8 = partial1.isMatch((org.joda.time.ReadablePartial) partial4);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.Partial partial11 = partial1.withPeriodAdded(readablePeriod9, (int) ' ');
        org.joda.time.Partial partial12 = new org.joda.time.Partial((org.joda.time.ReadablePartial) partial11);
        java.lang.Class<?> wildcardClass13 = partial12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(partial11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.Partial partial3 = partial1.plus(readablePeriod2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Partial partial5 = partial1.withChronologyRetainFields(chronology4);
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = partial1.getFields();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Partial partial8 = partial1.withChronologyRetainFields(chronology7);
        org.junit.Assert.assertNotNull(partial3);
        org.junit.Assert.assertNotNull(partial5);
        org.junit.Assert.assertNotNull(dateTimeFieldArray6);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray6, new org.joda.time.DateTimeField[] {});
        org.junit.Assert.assertNotNull(partial8);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray2 = partial1.getFieldTypes();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean9 = partial7.equals((java.lang.Object) 10L);
        boolean boolean10 = partial1.isBefore((org.joda.time.ReadablePartial) partial7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = partial1.toString(dateTimeFormatter11);
        org.joda.time.Partial.Property property14 = new org.joda.time.Partial.Property(partial1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = property14.get();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldTypeArray2, new org.joda.time.DateTimeFieldType[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean8 = partial1.isMatch((org.joda.time.ReadablePartial) partial4);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Partial partial10 = new org.joda.time.Partial(chronology9);
        int[] intArray11 = partial10.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        org.joda.time.Partial partial13 = partial10.without(dateTimeFieldType12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Partial partial15 = partial10.withChronologyRetainFields(chronology14);
        java.lang.String str16 = partial15.toString();
        boolean boolean17 = partial1.isEqual((org.joda.time.ReadablePartial) partial15);
        java.util.Locale locale19 = null;
        java.lang.String str20 = partial1.toString("[]", locale19);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] {});
        org.junit.Assert.assertNotNull(partial13);
        org.junit.Assert.assertNotNull(partial15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType2 = partial0.getFieldType((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean8 = partial1.isMatch((org.joda.time.ReadablePartial) partial4);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.Partial partial10 = partial1.plus(readablePeriod9);
        java.lang.String str11 = partial10.toStringList();
        org.joda.time.Partial.Property property13 = new org.joda.time.Partial.Property(partial10, 100);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Partial partial15 = new org.joda.time.Partial(chronology14);
        int[] intArray16 = partial15.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        org.joda.time.Partial partial18 = partial15.without(dateTimeFieldType17);
        int[] intArray22 = new int[] { (byte) -1, 'a', (short) 0 };
        org.joda.time.Partial partial23 = new org.joda.time.Partial(partial18, intArray22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.DateTime dateTime25 = partial18.toDateTime(readableInstant24);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = property13.compareTo(readableInstant24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The instant must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(partial10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] {});
        org.junit.Assert.assertNotNull(partial18);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { (-1), 97, 0 });
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray2 = partial1.getFieldTypes();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean9 = partial7.equals((java.lang.Object) 10L);
        boolean boolean10 = partial1.isBefore((org.joda.time.ReadablePartial) partial7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = partial1.toString(dateTimeFormatter11);
        org.joda.time.Partial.Property property14 = new org.joda.time.Partial.Property(partial1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationField durationField15 = property14.getRangeDurationField();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldTypeArray2, new org.joda.time.DateTimeFieldType[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        org.joda.time.Partial partial4 = partial1.without(dateTimeFieldType3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Partial partial6 = partial1.withChronologyRetainFields(chronology5);
        java.lang.String str7 = partial6.toString();
        org.joda.time.Chronology chronology8 = partial6.getChronology();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(partial4);
        org.junit.Assert.assertNotNull(partial6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray2 = partial1.getFieldTypes();
        org.joda.time.DurationFieldType durationFieldType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial5 = partial1.withFieldAddWrapped(durationFieldType3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldTypeArray2, new org.joda.time.DateTimeFieldType[] {});
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray2 = partial1.getFieldTypes();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean9 = partial7.equals((java.lang.Object) 10L);
        boolean boolean10 = partial1.isBefore((org.joda.time.ReadablePartial) partial7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = partial1.toString(dateTimeFormatter11);
        org.joda.time.Partial.Property property14 = new org.joda.time.Partial.Property(partial1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = property14.getMaximumValueOverall();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldTypeArray2, new org.joda.time.DateTimeFieldType[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean8 = partial1.isMatch((org.joda.time.ReadablePartial) partial4);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.Partial partial11 = partial1.withPeriodAdded(readablePeriod9, (int) ' ');
        org.joda.time.Partial partial12 = new org.joda.time.Partial((org.joda.time.ReadablePartial) partial11);
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = partial11.toString("hi!", locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(partial11);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.Partial partial3 = partial1.plus(readablePeriod2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.Partial partial6 = partial3.withPeriodAdded(readablePeriod4, (int) (byte) 100);
        org.junit.Assert.assertNotNull(partial3);
        org.junit.Assert.assertNotNull(partial6);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean8 = partial1.isMatch((org.joda.time.ReadablePartial) partial4);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.Partial partial10 = partial1.plus(readablePeriod9);
        java.lang.String str11 = partial10.toStringList();
        org.joda.time.Partial.Property property13 = new org.joda.time.Partial.Property(partial10, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial14 = property13.withMinimumValue();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(partial10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean8 = partial1.isMatch((org.joda.time.ReadablePartial) partial4);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.Partial partial10 = partial1.plus(readablePeriod9);
        java.lang.String str11 = partial10.toStringList();
        org.joda.time.Partial.Property property13 = new org.joda.time.Partial.Property(partial10, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial15 = property13.setCopy("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(partial10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray2 = partial1.getFieldTypes();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean9 = partial7.equals((java.lang.Object) 10L);
        boolean boolean10 = partial1.isBefore((org.joda.time.ReadablePartial) partial7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = partial1.toString(dateTimeFormatter11);
        org.joda.time.Partial.Property property14 = new org.joda.time.Partial.Property(partial1, 1);
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = property14.getMaximumShortTextLength(locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldTypeArray2, new org.joda.time.DateTimeFieldType[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        int[] intArray2 = partial1.getValues();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean8 = partial1.isMatch((org.joda.time.ReadablePartial) partial4);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Partial partial10 = new org.joda.time.Partial(chronology9);
        int[] intArray11 = partial10.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        org.joda.time.Partial partial13 = partial10.without(dateTimeFieldType12);
        int[] intArray17 = new int[] { (byte) -1, 'a', (short) 0 };
        org.joda.time.Partial partial18 = new org.joda.time.Partial(partial13, intArray17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.DateTime dateTime20 = partial13.toDateTime(readableInstant19);
        boolean boolean21 = partial4.isMatch((org.joda.time.ReadableInstant) dateTime20);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] {});
        org.junit.Assert.assertNotNull(partial13);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1), 97, 0 });
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray2 = partial1.getFieldTypes();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray5 = partial4.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Partial partial7 = partial4.without(dateTimeFieldType6);
        boolean boolean9 = partial7.equals((java.lang.Object) 10L);
        boolean boolean10 = partial1.isBefore((org.joda.time.ReadablePartial) partial7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = partial1.toString(dateTimeFormatter11);
        org.joda.time.Partial.Property property14 = new org.joda.time.Partial.Property(partial1, 1);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Partial partial16 = new org.joda.time.Partial(chronology15);
        int[] intArray17 = partial16.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        org.joda.time.Partial partial19 = partial16.without(dateTimeFieldType18);
        int[] intArray23 = new int[] { (byte) -1, 'a', (short) 0 };
        org.joda.time.Partial partial24 = new org.joda.time.Partial(partial19, intArray23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.DateTime dateTime26 = partial19.toDateTime(readableInstant25);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = property14.compareTo(readableInstant25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The instant must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldTypeArray2, new org.joda.time.DateTimeFieldType[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertNotNull(partial7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] {});
        org.junit.Assert.assertNotNull(partial19);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-1), 97, 0 });
        org.junit.Assert.assertNotNull(dateTime26);
    }
}

