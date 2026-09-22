package org.joda.time.field;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.joda.time.Chronology;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.junit.Assert;
import org.junit.Test;

public class UnsupportedDurationFieldTest {

    private static class DummyDurationFieldType extends DurationFieldType {
        private static final long serialVersionUID = 1L;

        public DummyDurationFieldType(String name) {
            super(name);
        }

        public DurationField getField(Chronology chronology) {
            return null;
        }
    }

    private static class MockDurationField extends DurationField implements Serializable {
        private static final long serialVersionUID = 1L;
        private final boolean supported;

        public MockDurationField(boolean supported) {
            this.supported = supported;
        }

        public DurationFieldType getType() {
            return DurationFieldType.seconds();
        }

        public String getName() {
            return "seconds";
        }

        public boolean isSupported() {
            return this.supported;
        }

        public boolean isPrecise() {
            return true;
        }

        public long getUnitMillis() {
            return 1000L;
        }

        public int getValue(long duration) {
            return 0;
        }

        public long getValueAsLong(long duration) {
            return 0L;
        }

        public int getValue(long duration, long instant) {
            return 0;
        }

        public long getValueAsLong(long duration, long instant) {
            return 0L;
        }

        public long getMillis(int value) {
            return 0L;
        }

        public long getMillis(long value) {
            return 0L;
        }

        public long getMillis(int value, long instant) {
            return 0L;
        }

        public long getMillis(long value, long instant) {
            return 0L;
        }

        public long add(long instant, int value) {
            return 0L;
        }

        public long add(long instant, long value) {
            return 0L;
        }

        public int getDifference(long minuendInstant, long subtrahendInstant) {
            return 0;
        }

        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
            return 0L;
        }

        public int compareTo(DurationField durationField) {
            return 0;
        }

        public String toString() {
            return "MockDurationField";
        }
    }

    @Test
    public void getInstance_givenSameType_shouldReturnCachedSingletonInstance() {
        DurationFieldType type = DurationFieldType.seconds();
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(type);
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(type);

        Assert.assertNotNull(field1);
        Assert.assertSame(field1, field2);
    }

    @Test
    public void getInstance_givenDifferentTypes_shouldReturnDistinctInstances() {
        DurationFieldType type1 = DurationFieldType.seconds();
        DurationFieldType type2 = DurationFieldType.minutes();
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(type1);
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(type2);

        Assert.assertNotNull(field1);
        Assert.assertNotNull(field2);
        Assert.assertNotSame(field1, field2);
    }

    @Test
    public void getType_givenValidType_shouldReturnConfiguredType() {
        DurationFieldType type = DurationFieldType.hours();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);

        Assert.assertSame(type, field.getType());
    }

    @Test
    public void getName_givenValidType_shouldReturnNameFromType() {
        DurationFieldType type = DurationFieldType.days();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);

        Assert.assertEquals(type.getName(), field.getName());
    }

    @Test
    public void isSupported_whenCalled_shouldAlwaysReturnFalse() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.millis());

        Assert.assertFalse(field.isSupported());
    }

    @Test
    public void isPrecise_whenCalled_shouldAlwaysReturnTrue() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.millis());

        Assert.assertTrue(field.isPrecise());
    }

    @Test
    public void getUnitMillis_whenCalled_shouldAlwaysReturnZero() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.millis());

        Assert.assertEquals(0L, field.getUnitMillis());
    }

    @Test
    public void getValue_givenDuration_shouldThrowUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        try {
            field.getValue(1000L);
            Assert.fail("Expected UnsupportedOperationException was not thrown");
        } catch (UnsupportedOperationException ex) {
            Assert.assertEquals(field.getType() + " field is unsupported", ex.getMessage());
        }
    }

    @Test
    public void getValueAsLong_givenDuration_shouldThrowUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        try {
            field.getValueAsLong(1000L);
            Assert.fail("Expected UnsupportedOperationException was not thrown");
        } catch (UnsupportedOperationException ex) {
            Assert.assertEquals(field.getType() + " field is unsupported", ex.getMessage());
        }
    }

    @Test
    public void getValue_givenDurationAndInstant_shouldThrowUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        try {
            field.getValue(1000L, 500L);
            Assert.fail("Expected UnsupportedOperationException was not thrown");
        } catch (UnsupportedOperationException ex) {
            Assert.assertEquals(field.getType() + " field is unsupported", ex.getMessage());
        }
    }

    @Test
    public void getValueAsLong_givenDurationAndInstant_shouldThrowUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        try {
            field.getValueAsLong(1000L, 500L);
            Assert.fail("Expected UnsupportedOperationException was not thrown");
        } catch (UnsupportedOperationException ex) {
            Assert.assertEquals(field.getType() + " field is unsupported", ex.getMessage());
        }
    }

    @Test
    public void getMillis_givenIntValue_shouldThrowUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        try {
            field.getMillis(10);
            Assert.fail("Expected UnsupportedOperationException was not thrown");
        } catch (UnsupportedOperationException ex) {
            Assert.assertEquals(field.getType() + " field is unsupported", ex.getMessage());
        }
    }

    @Test
    public void getMillis_givenLongValue_shouldThrowUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        try {
            field.getMillis(10L);
            Assert.fail("Expected UnsupportedOperationException was not thrown");
        } catch (UnsupportedOperationException ex) {
            Assert.assertEquals(field.getType() + " field is unsupported", ex.getMessage());
        }
    }

    @Test
    public void getMillis_givenIntValueAndInstant_shouldThrowUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        try {
            field.getMillis(10, 500L);
            Assert.fail("Expected UnsupportedOperationException was not thrown");
        } catch (UnsupportedOperationException ex) {
            Assert.assertEquals(field.getType() + " field is unsupported", ex.getMessage());
        }
    }

    @Test
    public void getMillis_givenLongValueAndInstant_shouldThrowUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        try {
            field.getMillis(10L, 500L);
            Assert.fail("Expected UnsupportedOperationException was not thrown");
        } catch (UnsupportedOperationException ex) {
            Assert.assertEquals(field.getType() + " field is unsupported", ex.getMessage());
        }
    }

    @Test
    public void add_givenInstantAndIntValue_shouldThrowUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        try {
            field.add(500L, 10);
            Assert.fail("Expected UnsupportedOperationException was not thrown");
        } catch (UnsupportedOperationException ex) {
            Assert.assertEquals(field.getType() + " field is unsupported", ex.getMessage());
        }
    }

    @Test
    public void add_givenInstantAndLongValue_shouldThrowUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        try {
            field.add(500L, 10L);
            Assert.fail("Expected UnsupportedOperationException was not thrown");
        } catch (UnsupportedOperationException ex) {
            Assert.assertEquals(field.getType() + " field is unsupported", ex.getMessage());
        }
    }

    @Test
    public void getDifference_givenMinuendAndSubtrahend_shouldThrowUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        try {
            field.getDifference(1000L, 500L);
            Assert.fail("Expected UnsupportedOperationException was not thrown");
        } catch (UnsupportedOperationException ex) {
            Assert.assertEquals(field.getType() + " field is unsupported", ex.getMessage());
        }
    }

    @Test
    public void getDifferenceAsLong_givenMinuendAndSubtrahend_shouldThrowUnsupportedOperationException() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        try {
            field.getDifferenceAsLong(1000L, 500L);
            Assert.fail("Expected UnsupportedOperationException was not thrown");
        } catch (UnsupportedOperationException ex) {
            Assert.assertEquals(field.getType() + " field is unsupported", ex.getMessage());
        }
    }

    @Test
    public void compareTo_givenSupportedDurationField_shouldReturnOne() {
        UnsupportedDurationField unsupportedField = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        DurationField supportedField = new MockDurationField(true);

        int result = unsupportedField.compareTo(supportedField);

        Assert.assertEquals(1, result);
    }

    @Test
    public void compareTo_givenUnsupportedDurationField_shouldReturnZero() {
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        DurationField unsupportedMock = new MockDurationField(false);

        int result = field1.compareTo(unsupportedMock);

        Assert.assertEquals(0, result);
    }

    @Test
    public void compareTo_givenSameInstance_shouldReturnZero() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.seconds());

        int result = field.compareTo(field);

        Assert.assertEquals(0, result);
    }

    @Test
    public void equals_givenSameInstance_shouldReturnTrue() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.seconds());

        Assert.assertTrue(field.equals(field));
    }

    @Test
    public void equals_givenNull_shouldReturnFalse() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.seconds());

        Assert.assertFalse(field.equals(null));
    }

    @Test
    public void equals_givenDifferentClassInstance_shouldReturnFalse() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.seconds());

        Assert.assertFalse(field.equals("seconds"));
    }

    @Test
    public void equals_givenDifferentTypeWithDifferentName_shouldReturnFalse() {
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(DurationFieldType.minutes());

        Assert.assertFalse(field1.equals(field2));
    }

    @Test
    public void equals_givenAnotherInstanceWithSameName_shouldReturnTrue() {
        DurationFieldType type1 = new DummyDurationFieldType("customEqualName");
        DurationFieldType type2 = new DummyDurationFieldType("customEqualName");
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(type1);
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(type2);

        Assert.assertTrue(field1.equals(field2));
        Assert.assertTrue(field2.equals(field1));
    }

    @Test
    public void equals_givenBothWithNullName_shouldReturnTrue() {
        DurationFieldType type1 = new DummyDurationFieldType(null);
        DurationFieldType type2 = new DummyDurationFieldType(null);
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(type1);
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(type2);

        Assert.assertTrue(field1.equals(field2));
        Assert.assertTrue(field2.equals(field1));
    }

    @Test
    public void equals_givenOtherNullNameAndThisNonNullName_shouldReturnFalse() {
        DurationFieldType typeWithNullName = new DummyDurationFieldType(null);
        DurationFieldType typeWithNonNullName = new DummyDurationFieldType("namedField");
        UnsupportedDurationField fieldWithNullName = UnsupportedDurationField.getInstance(typeWithNullName);
        UnsupportedDurationField fieldWithNonNullName = UnsupportedDurationField.getInstance(typeWithNonNullName);

        Assert.assertFalse(fieldWithNonNullName.equals(fieldWithNullName));
    }

    @Test
    public void equals_givenThisNullNameAndOtherNonNullName_shouldReturnFalse() {
        DurationFieldType typeWithNullName = new DummyDurationFieldType(null);
        DurationFieldType typeWithNonNullName = new DummyDurationFieldType("namedField");
        UnsupportedDurationField fieldWithNullName = UnsupportedDurationField.getInstance(typeWithNullName);
        UnsupportedDurationField fieldWithNonNullName = UnsupportedDurationField.getInstance(typeWithNonNullName);

        Assert.assertFalse(fieldWithNullName.equals(fieldWithNonNullName));
    }

    @Test
    public void hashCode_givenEqualInstances_shouldProduceSameHashCode() {
        DurationFieldType type1 = new DummyDurationFieldType("hashName");
        DurationFieldType type2 = new DummyDurationFieldType("hashName");
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(type1);
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(type2);

        Assert.assertEquals(field1.hashCode(), field2.hashCode());
        Assert.assertEquals("hashName".hashCode(), field1.hashCode());
    }

    @Test
    public void toString_givenValidField_shouldReturnExpectedDebugString() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.years());

        String expected = "UnsupportedDurationField[" + field.getName() + "]";
        Assert.assertEquals(expected, field.toString());
    }

    @Test
    public void serialization_givenInstance_shouldResolveToSameCachedSingletonInstance() throws Exception {
        DurationFieldType type = DurationFieldType.centuries();
        UnsupportedDurationField original = UnsupportedDurationField.getInstance(type);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object deserialized = ois.readObject();
        ois.close();

        Assert.assertSame(original, deserialized);
    }
}