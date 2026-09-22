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
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationFieldType durationFieldType1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial3 = partial0.withFieldAddWrapped(durationFieldType1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = null;
        int[] intArray5 = new int[] { (byte) 0, 1, 1, (short) 1 };
        org.joda.time.Chronology chronology6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial7 = new org.joda.time.Partial(dateTimeFieldTypeArray0, intArray5, chronology6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Types array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 1, 1, 1 });
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[] {};
        int[] intArray3 = new int[] { 1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial4 = new org.joda.time.Partial(dateTimeFieldTypeArray0, intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Values array must be the same length as the types array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray0);
        org.junit.Assert.assertArrayEquals(dateTimeFieldTypeArray0, new org.joda.time.DateTimeFieldType[] {});
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 32 });
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial2 = new org.joda.time.Partial(dateTimeFieldType0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = partial0.getFields();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField4 = partial0.getField(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray2, new org.joda.time.DateTimeField[] {});
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = partial0.getFields();
        org.joda.time.Partial partial3 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology4 = partial3.getChronology();
        boolean boolean5 = partial0.isBefore((org.joda.time.ReadablePartial) partial3);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial.Property property7 = partial3.property(dateTimeFieldType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray2, new org.joda.time.DateTimeField[] {});
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = partial0.getFields();
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = partial0.getFields();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray2, new org.joda.time.DateTimeField[] {});
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray3, new org.joda.time.DateTimeField[] {});
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial4 = partial0.withField(dateTimeFieldType2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[] {};
        int[] intArray5 = new int[] { (short) -1, (byte) 10, (short) 100, '4' };
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial6 = new org.joda.time.Partial(dateTimeFieldTypeArray0, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Values array must be the same length as the types array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray0);
        org.junit.Assert.assertArrayEquals(dateTimeFieldTypeArray0, new org.joda.time.DateTimeFieldType[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { (-1), 10, 100, 52 });
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial3 = partial0.with(dateTimeFieldType1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray1 = new org.joda.time.DateTimeFieldType[] { dateTimeFieldType0 };
        int[] intArray2 = null;
        org.joda.time.Chronology chronology3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial4 = new org.joda.time.Partial(dateTimeFieldTypeArray1, intArray2, chronology3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Values array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray1);
        org.junit.Assert.assertArrayEquals(dateTimeFieldTypeArray1, new org.joda.time.DateTimeFieldType[] { null });
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = partial0.getFields();
        org.joda.time.Partial.Property property4 = new org.joda.time.Partial.Property(partial0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = property4.getMinimumValueOverall();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray2, new org.joda.time.DateTimeField[] {});
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial4 = partial0.with(dateTimeFieldType2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        int int1 = partial0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = partial0.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = partial0.getFields();
        org.joda.time.Partial.Property property4 = new org.joda.time.Partial.Property(partial0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationField durationField5 = property4.getRangeDurationField();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray2, new org.joda.time.DateTimeField[] {});
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = partial0.getFields();
        org.joda.time.Partial.Property property4 = new org.joda.time.Partial.Property(partial0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = property4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray2, new org.joda.time.DateTimeField[] {});
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = partial0.getFields();
        org.joda.time.Partial.Property property4 = new org.joda.time.Partial.Property(partial0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = property4.getAsShortText();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray2, new org.joda.time.DateTimeField[] {});
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = partial0.getFields();
        org.joda.time.Partial.Property property4 = new org.joda.time.Partial.Property(partial0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial6 = property4.setCopy("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray2, new org.joda.time.DateTimeField[] {});
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = partial0.getFields();
        org.joda.time.Partial.Property property4 = new org.joda.time.Partial.Property(partial0, (int) (byte) 1);
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial7 = property4.setCopy("hi!", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray2, new org.joda.time.DateTimeField[] {});
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = partial0.getFields();
        org.joda.time.Partial.Property property4 = new org.joda.time.Partial.Property(partial0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType5 = property4.getFieldType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray2, new org.joda.time.DateTimeField[] {});
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = partial0.toString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.Partial partial2 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology3 = partial2.getChronology();
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial5 = new org.joda.time.Partial(dateTimeFieldType0, (int) 'a', chronology3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology3);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[] {};
        int[] intArray3 = new int[] { (byte) 100, (byte) -1 };
        org.joda.time.Partial partial4 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology5 = partial4.getChronology();
        org.joda.time.Partial partial6 = new org.joda.time.Partial(chronology5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial7 = new org.joda.time.Partial(dateTimeFieldTypeArray0, intArray3, chronology5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Values array must be the same length as the types array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray0);
        org.junit.Assert.assertArrayEquals(dateTimeFieldTypeArray0, new org.joda.time.DateTimeFieldType[] {});
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, (-1) });
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = partial0.getFields();
        org.joda.time.Partial.Property property4 = new org.joda.time.Partial.Property(partial0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = property4.getMinimumValue();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray2, new org.joda.time.DateTimeField[] {});
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial2 = new org.joda.time.Partial(dateTimeFieldType0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.Partial partial2 = new org.joda.time.Partial(chronology1);
        boolean boolean4 = partial2.equals((java.lang.Object) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial7 = partial2.with(dateTimeFieldType5, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = partial0.getFields();
        org.joda.time.Partial.Property property4 = new org.joda.time.Partial.Property(partial0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField5 = property4.getField();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray2, new org.joda.time.DateTimeField[] {});
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = partial0.getFields();
        org.joda.time.Partial.Property property4 = new org.joda.time.Partial.Property(partial0, (int) (byte) 1);
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = property4.getMaximumTextLength(locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray2, new org.joda.time.DateTimeField[] {});
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = partial0.getFields();
        org.joda.time.Partial.Property property4 = new org.joda.time.Partial.Property(partial0, (int) (byte) 1);
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = property4.getAsText(locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray2, new org.joda.time.DateTimeField[] {});
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = partial0.getFields();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = partial0.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray2, new org.joda.time.DateTimeField[] {});
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.DateTime dateTime2 = partial0.toDateTime(readableInstant1);
        org.joda.time.Partial partial3 = new org.joda.time.Partial();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = partial3.toDateTime(readableInstant4);
        org.joda.time.DateTime dateTime6 = partial0.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Partial partial7 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology8 = partial7.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = partial7.getFields();
        org.joda.time.Partial partial10 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology11 = partial10.getChronology();
        boolean boolean12 = partial7.isBefore((org.joda.time.ReadablePartial) partial10);
        boolean boolean13 = partial0.isMatch((org.joda.time.ReadablePartial) partial10);
        org.joda.time.Partial partial15 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology16 = partial15.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField17 = partial10.getField(10, chronology16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFieldArray9);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray9, new org.joda.time.DateTimeField[] {});
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = partial0.getFields();
        org.joda.time.Partial.Property property4 = new org.joda.time.Partial.Property(partial0, (int) (byte) 1);
        org.joda.time.Partial partial5 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology6 = partial5.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = partial5.getFields();
        org.joda.time.Partial partial8 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology9 = partial8.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray10 = partial8.getFields();
        boolean boolean11 = partial5.isBefore((org.joda.time.ReadablePartial) partial8);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = property4.compareTo((org.joda.time.ReadablePartial) partial8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray2, new org.joda.time.DateTimeField[] {});
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray7, new org.joda.time.DateTimeField[] {});
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeFieldArray10);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray10, new org.joda.time.DateTimeField[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = partial0.getFields();
        int int3 = partial0.size();
        org.joda.time.Partial.Property property5 = new org.joda.time.Partial.Property(partial0, (int) (short) 1);
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial8 = property5.setCopy("hi!", locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray2, new org.joda.time.DateTimeField[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = partial0.getFields();
        org.joda.time.Partial.Property property4 = new org.joda.time.Partial.Property(partial0, (int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial.Property property6 = partial0.property(dateTimeFieldType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray2, new org.joda.time.DateTimeField[] {});
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = partial0.getFields();
        org.joda.time.Partial partial3 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology4 = partial3.getChronology();
        boolean boolean5 = partial0.isBefore((org.joda.time.ReadablePartial) partial3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = partial3.toString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray2, new org.joda.time.DateTimeField[] {});
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = partial0.getFields();
        int int3 = partial0.size();
        org.joda.time.Partial partial5 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology6 = partial5.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField7 = partial0.getField((int) (byte) -1, chronology6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray2, new org.joda.time.DateTimeField[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.Partial partial2 = new org.joda.time.Partial(chronology1);
        boolean boolean4 = partial2.equals((java.lang.Object) '#');
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.Partial partial6 = partial2.minus(readablePeriod5);
        org.joda.time.Partial.Property property8 = new org.joda.time.Partial.Property(partial6, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType9 = property8.getFieldType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(partial6);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = partial0.getFields();
        org.joda.time.Partial partial3 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology4 = partial3.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = partial3.getFields();
        boolean boolean6 = partial0.isBefore((org.joda.time.ReadablePartial) partial3);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.Partial partial8 = partial3.plus(readablePeriod7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.Partial partial11 = partial8.withPeriodAdded(readablePeriod9, (int) (short) 10);
        java.lang.Class<?> wildcardClass12 = partial8.getClass();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray2, new org.joda.time.DateTimeField[] {});
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray5, new org.joda.time.DateTimeField[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(partial8);
        org.junit.Assert.assertNotNull(partial11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = partial0.getFields();
        org.joda.time.Partial partial3 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology4 = partial3.getChronology();
        boolean boolean5 = partial0.isBefore((org.joda.time.ReadablePartial) partial3);
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = partial3.toString("", locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray2, new org.joda.time.DateTimeField[] {});
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = partial0.getFields();
        int int3 = partial0.size();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = partial0.toString(dateTimeFormatter4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField7 = partial0.getField(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray2, new org.joda.time.DateTimeField[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = partial0.getFields();
        org.joda.time.Partial.Property property4 = new org.joda.time.Partial.Property(partial0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = property4.getAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray2, new org.joda.time.DateTimeField[] {});
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.DateTime dateTime2 = partial0.toDateTime(readableInstant1);
        java.lang.String str3 = partial0.toStringList();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = partial0.getFields();
        org.joda.time.Partial partial3 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology4 = partial3.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = partial3.getFields();
        boolean boolean6 = partial0.isBefore((org.joda.time.ReadablePartial) partial3);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.Partial partial8 = partial3.plus(readablePeriod7);
        java.lang.Class<?> wildcardClass9 = partial8.getClass();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray2, new org.joda.time.DateTimeField[] {});
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray5, new org.joda.time.DateTimeField[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(partial8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.Partial partial2 = new org.joda.time.Partial(chronology1);
        boolean boolean4 = partial2.equals((java.lang.Object) '#');
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.Partial partial6 = partial2.minus(readablePeriod5);
        org.joda.time.Partial.Property property8 = new org.joda.time.Partial.Property(partial6, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial10 = property8.setCopy("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(partial6);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.Partial partial2 = new org.joda.time.Partial(chronology1);
        boolean boolean4 = partial2.equals((java.lang.Object) '#');
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.Partial partial6 = partial2.minus(readablePeriod5);
        org.joda.time.Partial.Property property8 = new org.joda.time.Partial.Property(partial6, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial9 = property8.withMaximumValue();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(partial6);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = partial0.getFields();
        org.joda.time.Partial.Property property4 = new org.joda.time.Partial.Property(partial0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = property4.getAsText();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray2, new org.joda.time.DateTimeField[] {});
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = partial0.getFields();
        org.joda.time.Partial partial3 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology4 = partial3.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = partial3.getFields();
        boolean boolean6 = partial0.isBefore((org.joda.time.ReadablePartial) partial3);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.Partial partial8 = partial3.plus(readablePeriod7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.Partial partial11 = partial8.withPeriodAdded(readablePeriod9, (int) (short) 10);
        org.joda.time.Partial partial12 = new org.joda.time.Partial();
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.DateTime dateTime14 = partial12.toDateTime(readableInstant13);
        org.joda.time.Partial partial15 = new org.joda.time.Partial();
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.DateTime dateTime17 = partial15.toDateTime(readableInstant16);
        org.joda.time.DateTime dateTime18 = partial12.toDateTime((org.joda.time.ReadableInstant) dateTime17);
        boolean boolean19 = partial11.isMatch((org.joda.time.ReadableInstant) dateTime17);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray2, new org.joda.time.DateTimeField[] {});
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray5, new org.joda.time.DateTimeField[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(partial8);
        org.junit.Assert.assertNotNull(partial11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = partial0.getFields();
        int int3 = partial0.size();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = partial0.toString(dateTimeFormatter4);
        org.joda.time.Partial partial6 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology7 = partial6.getChronology();
        org.joda.time.Partial partial8 = new org.joda.time.Partial(chronology7);
        boolean boolean10 = partial8.equals((java.lang.Object) '#');
        boolean boolean11 = partial0.isBefore((org.joda.time.ReadablePartial) partial8);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray2, new org.joda.time.DateTimeField[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.Partial partial2 = new org.joda.time.Partial(chronology1);
        boolean boolean4 = partial2.equals((java.lang.Object) '#');
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.Partial partial6 = partial2.minus(readablePeriod5);
        org.joda.time.Partial.Property property8 = new org.joda.time.Partial.Property(partial6, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial10 = property8.addWrapFieldToCopy((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(partial6);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.DateTime dateTime2 = partial0.toDateTime(readableInstant1);
        org.joda.time.Partial partial3 = new org.joda.time.Partial();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = partial3.toDateTime(readableInstant4);
        org.joda.time.DateTime dateTime6 = partial0.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = partial0.toString("hi!", locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.DateTime dateTime2 = partial0.toDateTime(readableInstant1);
        org.joda.time.Partial partial3 = new org.joda.time.Partial();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = partial3.toDateTime(readableInstant4);
        org.joda.time.DateTime dateTime6 = partial0.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Partial partial7 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology8 = partial7.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = partial7.getFields();
        org.joda.time.Partial partial10 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology11 = partial10.getChronology();
        boolean boolean12 = partial7.isBefore((org.joda.time.ReadablePartial) partial10);
        boolean boolean13 = partial0.isMatch((org.joda.time.ReadablePartial) partial10);
        int int14 = partial0.size();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFieldArray9);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray9, new org.joda.time.DateTimeField[] {});
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = partial0.toString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial.Property property3 = partial0.property(dateTimeFieldType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = partial0.getFields();
        org.joda.time.Partial.Property property4 = new org.joda.time.Partial.Property(partial0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = property4.getMaximumValueOverall();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray2, new org.joda.time.DateTimeField[] {});
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = partial0.getFields();
        org.joda.time.Partial partial3 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology4 = partial3.getChronology();
        boolean boolean5 = partial0.isBefore((org.joda.time.ReadablePartial) partial3);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.Partial partial7 = partial0.minus(readablePeriod6);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray2, new org.joda.time.DateTimeField[] {});
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(partial7);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.Partial partial2 = new org.joda.time.Partial(chronology1);
        boolean boolean4 = partial2.equals((java.lang.Object) '#');
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.Partial partial6 = partial2.minus(readablePeriod5);
        org.joda.time.Partial.Property property8 = new org.joda.time.Partial.Property(partial6, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = property8.get();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(partial6);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = partial0.getFields();
        int int3 = partial0.size();
        org.joda.time.Partial.Property property5 = new org.joda.time.Partial.Property(partial0, (int) (short) 1);
        org.joda.time.Partial partial6 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology7 = partial6.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray8 = partial6.getFields();
        org.joda.time.Partial partial9 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology10 = partial9.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray11 = partial9.getFields();
        boolean boolean12 = partial6.isBefore((org.joda.time.ReadablePartial) partial9);
        java.lang.String str13 = partial6.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = property5.compareTo((org.joda.time.ReadablePartial) partial6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray2, new org.joda.time.DateTimeField[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeFieldArray8);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray8, new org.joda.time.DateTimeField[] {});
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFieldArray11);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray11, new org.joda.time.DateTimeField[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.Partial partial2 = new org.joda.time.Partial(chronology1);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray3 = new org.joda.time.DateTimeFieldType[] {};
        org.joda.time.Partial partial4 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology5 = partial4.getChronology();
        int[] intArray6 = partial4.getValues();
        org.joda.time.Partial partial7 = new org.joda.time.Partial(chronology1, dateTimeFieldTypeArray3, intArray6);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray3);
        org.junit.Assert.assertArrayEquals(dateTimeFieldTypeArray3, new org.joda.time.DateTimeFieldType[] {});
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] {});
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.Partial partial2 = new org.joda.time.Partial(chronology1);
        boolean boolean4 = partial2.equals((java.lang.Object) '#');
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.Partial partial6 = partial2.minus(readablePeriod5);
        org.joda.time.Partial partial7 = new org.joda.time.Partial();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.DateTime dateTime9 = partial7.toDateTime(readableInstant8);
        org.joda.time.Partial partial10 = new org.joda.time.Partial();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.DateTime dateTime12 = partial10.toDateTime(readableInstant11);
        org.joda.time.DateTime dateTime13 = partial7.toDateTime((org.joda.time.ReadableInstant) dateTime12);
        boolean boolean14 = partial6.isMatch((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = null;
        int int16 = partial6.indexOf(dateTimeFieldType15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = partial6.get(dateTimeFieldType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(partial6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = partial0.getFields();
        org.joda.time.Partial partial3 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology4 = partial3.getChronology();
        boolean boolean5 = partial0.isBefore((org.joda.time.ReadablePartial) partial3);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = partial0.isSupported(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray2, new org.joda.time.DateTimeField[] {});
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = partial0.getFields();
        org.joda.time.Partial partial3 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology4 = partial3.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = partial3.getFields();
        boolean boolean6 = partial0.isBefore((org.joda.time.ReadablePartial) partial3);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.Partial partial8 = partial3.plus(readablePeriod7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.Partial partial11 = partial8.withPeriodAdded(readablePeriod9, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField13 = partial11.getField((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray2, new org.joda.time.DateTimeField[] {});
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray5, new org.joda.time.DateTimeField[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(partial8);
        org.junit.Assert.assertNotNull(partial11);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.DateTime dateTime2 = partial0.toDateTime(readableInstant1);
        org.joda.time.Partial partial3 = new org.joda.time.Partial();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = partial3.toDateTime(readableInstant4);
        org.joda.time.DateTime dateTime6 = partial0.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        java.lang.Class<?> wildcardClass7 = partial0.getClass();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = partial0.getFields();
        org.joda.time.Partial partial3 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology4 = partial3.getChronology();
        boolean boolean5 = partial0.isBefore((org.joda.time.ReadablePartial) partial3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = partial0.getFormatter();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertArrayEquals(dateTimeFieldArray2, new org.joda.time.DateTimeField[] {});
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(dateTimeFormatter6);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        int[] intArray2 = partial0.getValues();
        boolean boolean4 = partial0.equals((java.lang.Object) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        boolean boolean6 = partial0.isSupported(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }
}

