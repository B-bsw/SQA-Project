package org.joda.time.field;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

public class UnsupportedDurationFieldTest {

    private static final DurationFieldType YEARS_TYPE = DurationFieldType.years();
    private static final DurationFieldType MONTHS_TYPE = DurationFieldType.months();

    @Test
    public void testGetInstance_returnsSameInstanceForSameType() {
        UnsupportedDurationField first = UnsupportedDurationField.getInstance(YEARS_TYPE);
        UnsupportedDurationField second = UnsupportedDurationField.getInstance(YEARS_TYPE);
        assertSame("Cached instance should be returned", first, second);
    }

    @Test
    public void testGetInstance_differentTypesReturnDifferentInstances() {
        UnsupportedDurationField years = UnsupportedDurationField.getInstance(YEARS_TYPE);
        UnsupportedDurationField months = UnsupportedDurationField.getInstance(MONTHS_TYPE);
        assertNotSame("Different types should return different instances", years, months);
    }

    @Test
    public void testGetInstance_nullTypeThrowsNPE() {
        try {
            UnsupportedDurationField.getInstance(null);
            fail("Expected NullPointerException for null type");
        } catch (NullPointerException e) {
            assertNotNull("Exception should have a message", e.getMessage());
        }
    }

    @Test
    public void testGetType_returnsCorrectType() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(MONTHS_TYPE);
        assertEquals("Type should match", MONTHS_TYPE, field.getType());
    }

    @Test
    public void testGetName_returnsNameOfType() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(YEARS_TYPE);
        assertEquals("Name should match type name", YEARS_TYPE.getName(), field.getName());
    }

    @Test
    public void testIsSupported_alwaysFalse() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(YEARS_TYPE);
        assertFalse("isSupported should always be false", field.isSupported());
    }

    @Test
    public void testIsPrecise_alwaysTrue() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(YEARS_TYPE);
        assertTrue("isPrecise should always be true", field.isPrecise());
    }

    @Test
    public void testGetValue_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(YEARS_TYPE);
        try {
            field.getValue(1000L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertTrue(e.getMessage().contains("unsupported"));
        }
    }

    @Test
    public void testGetValueAsLong_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(YEARS_TYPE);
        try {
            field.getValueAsLong(1000L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertTrue(e.getMessage().contains("unsupported"));
        }
    }

    @Test
    public void testGetValueWithInstant_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(YEARS_TYPE);
        try {
            field.getValue(1000L, 2000L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertTrue(e.getMessage().contains("unsupported"));
        }
    }

    @Test
    public void testGetValueAsLongWithInstant_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(YEARS_TYPE);
        try {
            field.getValueAsLong(1000L, 2000L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertTrue(e.getMessage().contains("unsupported"));
        }
    }

    @Test
    public void testGetMillisFromInt_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(YEARS_TYPE);
        try {
            field.getMillis(5);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertTrue(e.getMessage().contains("unsupported"));
        }
    }

    @Test
    public void testGetMillisFromLong_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(YEARS_TYPE);
        try {
            field.getMillis(5L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertTrue(e.getMessage().contains("unsupported"));
        }
    }

    @Test
    public void testGetMillisWithInstant_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(YEARS_TYPE);
        try {
            field.getMillis(5, 1000L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertTrue(e.getMessage().contains("unsupported"));
        }
    }

    @Test
    public void testGetMillisWithLongInstant_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(YEARS_TYPE);
        try {
            field.getMillis(5L, 1000L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertTrue(e.getMessage().contains("unsupported"));
        }
    }

    @Test
    public void testAdd_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(YEARS_TYPE);
        try {
            field.add(1000L, 5);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertTrue(e.getMessage().contains("unsupported"));
        }
    }

    @Test
    public void testAddLong_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(YEARS_TYPE);
        try {
            field.add(1000L, 5L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertTrue(e.getMessage().contains("unsupported"));
        }
    }

    @Test
    public void testGetDifference_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(YEARS_TYPE);
        try {
            field.getDifference(1000L, 500L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertTrue(e.getMessage().contains("unsupported"));
        }
    }

    @Test
    public void testGetDifferenceAsLong_throwsUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(YEARS_TYPE);
        try {
            field.getDifferenceAsLong(1000L, 500L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertTrue(e.getMessage().contains("unsupported"));
        }
    }

    @Test
    public void testGetUnitMillis_returnsZero() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(YEARS_TYPE);
        assertEquals("unit millis should be zero", 0L, field.getUnitMillis());
    }

    @Test
    public void testCompareTo_supportedFieldReturnsPositive() {
        UnsupportedDurationField unsupported = UnsupportedDurationField.getInstance(YEARS_TYPE);
        DurationField supported = new MockSupportedDurationField();
        assertTrue("compare to supported should be positive", unsupported.compareTo(supported) > 0);
    }

    @Test
    public void testCompareTo_unsupportedFieldReturnsZero() {
        UnsupportedDurationField first = UnsupportedDurationField.getInstance(YEARS_TYPE);
        UnsupportedDurationField second = UnsupportedDurationField.getInstance(MONTHS_TYPE);
        assertEquals("compare to unsupported should be zero", 0, first.compareTo(second));
    }

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(YEARS_TYPE);
        assertEquals("same instance should be equal", field, field);
    }

    @Test
    public void testEquals_sameTypeDifferentInstance_returnsTrue() {
        UnsupportedDurationField first = UnsupportedDurationField.getInstance(YEARS_TYPE);
        UnsupportedDurationField second = UnsupportedDurationField.getInstance(YEARS_TYPE);
        assertEquals("same type should be equal", first, second);
    }

    @Test
    public void testEquals_differentType_returnsFalse() {
        UnsupportedDurationField years = UnsupportedDurationField.getInstance(YEARS_TYPE);
        UnsupportedDurationField months = UnsupportedDurationField.getInstance(MONTHS_TYPE);
        assertNotEquals("different types should not be equal", years, months);
    }

    @Test
    public void testEquals_nonUnsupportedField_returnsFalse() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(YEARS_TYPE);
        assertFalse("non-unsupported field should not be equal", field.equals(new Object()));
    }

    @Test
    public void testHashCode_matchesNameHashCode() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(YEARS_TYPE);
        assertEquals("hashCode should match name hash", field.getName().hashCode(), field.hashCode());
    }

    @Test
    public void testToString_containsClassNameAndName() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(YEARS_TYPE);
        String str = field.toString();
        assertTrue("should contain class name", str.contains("UnsupportedDurationField"));
        assertTrue("should contain field name", str.contains(YEARS_TYPE.getName()));
    }

    private static class MockSupportedDurationField extends DurationField {
        private static final long serialVersionUID = 1L;

        @Override
        public String getName() { return "mock"; }

        @Override
        public boolean isSupported() { return true; }

        @Override
        public boolean isPrecise() { return true; }

        @Override
        public long getUnitMillis() { return 1000L; }

        @Override
        public int getValue(long duration) { return (int) duration; }

        @Override
        public long getValueAsLong(long duration) { return duration; }

        @Override
        public int getValue(long duration, long instant) { return (int) duration; }

        @Override
        public long getValueAsLong(long duration, long instant) { return duration; }

        @Override
        public long getMillis(int value) { return value * 1000L; }

        @Override
        public long getMillis(long value) { return value * 1000L; }

        @Override
        public long getMillis(int value, long instant) { return value * 1000L; }

        @Override
        public long getMillis(long value, long instant) { return value * 1000L; }

        @Override
        public long add(long instant, int value) { return instant + value * 1000L; }

        @Override
        public long add(long instant, long value) { return instant + value * 1000L; }

        @Override
        public int getDifference(long minuendInstant, long subtrahendInstant) {
            return (int) ((minuendInstant - subtrahendInstant) / 1000L);
        }

        @Override
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
            return (minuendInstant - subtrahendInstant) / 1000L;
        }

        @Override
        public int compareTo(DurationField other) {
            return 0;
        }
    }
}