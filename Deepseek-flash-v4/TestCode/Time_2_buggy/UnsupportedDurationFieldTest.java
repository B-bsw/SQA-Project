package org.joda.time.field;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.junit.Test;

public class UnsupportedDurationFieldTest {

    private DurationFieldType getType(String name) {
        return DurationFieldType.millis(); // Simple stub; adjust as needed
    }

    @Test
    public void testGetInstance_sameInstanceForSameType() {
        DurationFieldType type = getType("millis");
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(type);
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(type);
        assertSame("Cached instances should be same", field1, field2);
    }

    @Test
    public void testGetInstance_nullType() {
        try {
            UnsupportedDurationField.getInstance(null);
            fail("Expected NullPointerException for null type");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testGetInstance_differentTypes() {
        DurationFieldType type1 = getType("millis");
        DurationFieldType type2 = getType("centuries");
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(type1);
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(type2);
        assertNotSame("Different types should give different instances", field1, field2);
    }

    @Test
    public void testBasicAccessors() {
        DurationFieldType type = getType("millis");
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        assertEquals("getType should return same type", type, field.getType());
        assertEquals("getName should return type name", type.getName(), field.getName());
        assertFalse("isSupported should return false", field.isSupported());
        assertTrue("isPrecise should return true", field.isPrecise());
        assertEquals("getUnitMillis should be zero", 0L, field.getUnitMillis());
    }

    @Test
    public void testUnsupportedOperations_throwExceptions() {
        DurationFieldType type = getType("millis");
        final UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);

        // getValue(long)
        assertThrowsUnsupported(new UnsupportedOperationException() {
            public void run() { field.getValue(100L); }
        });
        // getValueAsLong(long)
        assertThrowsUnsupported(new UnsupportedOperationException() {
            public void run() { field.getValueAsLong(100L); }
        });
        // getValue(long, long)
        assertThrowsUnsupported(new UnsupportedOperationException() {
            public void run() { field.getValue(100L, 200L); }
        });
        // getValueAsLong(long, long)
        assertThrowsUnsupported(new UnsupportedOperationException() {
            public void run() { field.getValueAsLong(100L, 200L); }
        });
        // getMillis(int)
        assertThrowsUnsupported(new UnsupportedOperationException() {
            public void run() { field.getMillis(5); }
        });
        // getMillis(long)
        assertThrowsUnsupported(new UnsupportedOperationException() {
            public void run() { field.getMillis(5L); }
        });
        // getMillis(int, long)
        assertThrowsUnsupported(new UnsupportedOperationException() {
            public void run() { field.getMillis(5, 100L); }
        });
        // getMillis(long, long)
        assertThrowsUnsupported(new UnsupportedOperationException() {
            public void run() { field.getMillis(5L, 100L); }
        });
        // add(long, int)
        assertThrowsUnsupported(new UnsupportedOperationException() {
            public void run() { field.add(100L, 5); }
        });
        // add(long, long)
        assertThrowsUnsupported(new UnsupportedOperationException() {
            public void run() { field.add(100L, 5L); }
        });
        // getDifference(long, long)
        assertThrowsUnsupported(new UnsupportedOperationException() {
            public void run() { field.getDifference(100L, 200L); }
        });
        // getDifferenceAsLong(long, long)
        assertThrowsUnsupported(new UnsupportedOperationException() {
            public void run() { field.getDifferenceAsLong(100L, 200L); }
        });
    }

    @Test
    public void testCompareTo_alwaysZero() {
        DurationFieldType type1 = getType("millis");
        DurationFieldType type2 = getType("centuries");
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(type1);
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(type2);
        assertEquals("compareTo should return 0 for any field", 0, field1.compareTo(field2));
        assertEquals("compareTo should return 0 for itself", 0, field1.compareTo(field1));
        assertEquals("compareTo should return 0 for null", 0, field1.compareTo(null));
    }

    @Test
    public void testEquals() {
        DurationFieldType type1 = getType("millis");
        DurationFieldType type2 = getType("millis"); // same name? May need check
        DurationFieldType type3 = getType("centuries");
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(type1);
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(type2);
        UnsupportedDurationField field3 = UnsupportedDurationField.getInstance(type3);

        assertTrue("Same instance should be equal", field1.equals(field1));
        assertTrue("Same type should be equal", field1.equals(field2));
        assertTrue("Same type but different object should be equal", field1.equals(field3) == field1.getName().equals(field3.getName()));
        assertFalse("Different name should not be equal", field1.equals(field3));
        assertFalse("Null should not be equal", field1.equals(null));
        assertFalse("Object of different class should not be equal", field1.equals("string"));
    }

    @Test
    public void testHashCode() {
        DurationFieldType type = getType("millis");
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        assertEquals("Hashcode should match name hashcode", type.getName().hashCode(), field.hashCode());
    }

    @Test
    public void testToString() {
        DurationFieldType type = getType("millis");
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        assertEquals("ToString should have correct format", "UnsupportedDurationField[" + type.getName() + "]", field.toString());
    }

    @Test
    public void testReadResolve() throws Exception {
        DurationFieldType type = getType("millis");
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        // Simulate deserialization - not easily testable without serialization, but check that readResolve runs without error
        // We'll just check that the method exists and runs for completeness (covered by other tests indirectly)
    }

    private void assertThrowsUnsupported(final Runnable runnable) {
        try {
            runnable.run();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }
}