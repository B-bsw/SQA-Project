package org.joda.time.field;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.joda.time.Chronology;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.junit.Assert;
import org.junit.Test;

public class UnsupportedDurationFieldTest {

    private static class MockDurationFieldType extends DurationFieldType {
        private static final long serialVersionUID = 1L;

        MockDurationFieldType(String name) {
            super(name);
        }

        public DurationField getField(Chronology chronology) {
            return null;
        }
    }

    @Test
    public void getInstance_givenSameType_shouldReturnCachedSingletonInstance() {
        // Arrange
        DurationFieldType type = DurationFieldType.days();

        // Act
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(type);
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(type);

        // Assert
        Assert.assertNotNull(field1);
        Assert.assertSame(field1, field2);
    }

    @Test
    public void getInstance_givenDifferentTypes_shouldReturnDifferentInstances() {
        // Arrange
        DurationFieldType daysType = DurationFieldType.days();
        DurationFieldType hoursType = DurationFieldType.hours();

        // Act
        UnsupportedDurationField fieldDays = UnsupportedDurationField.getInstance(daysType);
        UnsupportedDurationField fieldHours = UnsupportedDurationField.getInstance(hoursType);

        // Assert
        Assert.assertNotNull(fieldDays);
        Assert.assertNotNull(fieldHours);
        Assert.assertNotSame(fieldDays, fieldHours);
    }

    @Test
    public void getType_givenStandardInstance_shouldReturnDurationFieldType() {
        // Arrange
        DurationFieldType type = DurationFieldType.months();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);

        // Act
        DurationFieldType resultType = field.getType();

        // Assert
        Assert.assertSame(type, resultType);
    }

    @Test
    public void getName_givenStandardInstance_shouldReturnTypeName() {
        // Arrange
        DurationFieldType type = DurationFieldType.years();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);

        // Act
        String name = field.getName();

        // Assert
        Assert.assertEquals("years", name);
    }

    @Test
    public void isSupported_givenStandardInstance_shouldReturnFalse() {
        // Arrange
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.seconds());

        // Act
        boolean supported = field.isSupported();

        // Assert
        Assert.assertFalse(supported);
    }

    @Test
    public void isPrecise_givenStandardInstance_shouldReturnTrue() {
        // Arrange
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.minutes());

        // Act
        boolean precise = field.isPrecise();

        // Assert
        Assert.assertTrue(precise);
    }

    @Test
    public void getUnitMillis_givenStandardInstance_shouldReturnZero() {
        // Arrange
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.millis());

        // Act
        long unitMillis = field.getUnitMillis();

        // Assert
        Assert.assertEquals(0L, unitMillis);
    }

    @Test
    public void compareTo_givenOtherDurationField_shouldReturnZero() {
        // Arrange
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(DurationFieldType.hours());
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(DurationFieldType.days());

        // Act
        int result = field1.compareTo(field2);

        // Assert
        Assert.assertEquals(0, result);
    }

    @Test
    public void getValue_givenDuration_shouldThrowUnsupportedOperationException() {
        // Arrange
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());

        // Act & Assert
        try {
            field.getValue(1234L);
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ex) {
            Assert.assertEquals(DurationFieldType.days() + " field is unsupported", ex.getMessage());
        }
    }

    @Test
    public void getValueAsLong_givenDuration_shouldThrowUnsupportedOperationException() {
        // Arrange
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());

        // Act & Assert
        try {
            field.getValueAsLong(1234L);
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ex) {
            Assert.assertEquals(DurationFieldType.days() + " field is unsupported", ex.getMessage());
        }
    }

    @Test
    public void getValue_givenDurationAndInstant_shouldThrowUnsupportedOperationException() {
        // Arrange
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());

        // Act & Assert
        try {
            field.getValue(1234L, 5678L);
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ex) {
            Assert.assertEquals(DurationFieldType.days() + " field is unsupported", ex.getMessage());
        }
    }

    @Test
    public void getValueAsLong_givenDurationAndInstant_shouldThrowUnsupportedOperationException() {
        // Arrange
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());

        // Act & Assert
        try {
            field.getValueAsLong(1234L, 5678L);
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ex) {
            Assert.assertEquals(DurationFieldType.days() + " field is unsupported", ex.getMessage());
        }
    }

    @Test
    public void getMillis_givenIntValue_shouldThrowUnsupportedOperationException() {
        // Arrange
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());

        // Act & Assert
        try {
            field.getMillis(10);
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ex) {
            Assert.assertEquals(DurationFieldType.days() + " field is unsupported", ex.getMessage());
        }
    }

    @Test
    public void getMillis_givenLongValue_shouldThrowUnsupportedOperationException() {
        // Arrange
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());

        // Act & Assert
        try {
            field.getMillis(10L);
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ex) {
            Assert.assertEquals(DurationFieldType.days() + " field is unsupported", ex.getMessage());
        }
    }

    @Test
    public void getMillis_givenIntValueAndInstant_shouldThrowUnsupportedOperationException() {
        // Arrange
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());

        // Act & Assert
        try {
            field.getMillis(10, 5678L);
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ex) {
            Assert.assertEquals(DurationFieldType.days() + " field is unsupported", ex.getMessage());
        }
    }

    @Test
    public void getMillis_givenLongValueAndInstant_shouldThrowUnsupportedOperationException() {
        // Arrange
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());

        // Act & Assert
        try {
            field.getMillis(10L, 5678L);
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ex) {
            Assert.assertEquals(DurationFieldType.days() + " field is unsupported", ex.getMessage());
        }
    }

    @Test
    public void add_givenInstantAndIntValue_shouldThrowUnsupportedOperationException() {
        // Arrange
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());

        // Act & Assert
        try {
            field.add(5678L, 10);
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ex) {
            Assert.assertEquals(DurationFieldType.days() + " field is unsupported", ex.getMessage());
        }
    }

    @Test
    public void add_givenInstantAndLongValue_shouldThrowUnsupportedOperationException() {
        // Arrange
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());

        // Act & Assert
        try {
            field.add(5678L, 10L);
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ex) {
            Assert.assertEquals(DurationFieldType.days() + " field is unsupported", ex.getMessage());
        }
    }

    @Test
    public void getDifference_givenInstants_shouldThrowUnsupportedOperationException() {
        // Arrange
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());

        // Act & Assert
        try {
            field.getDifference(1000L, 500L);
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ex) {
            Assert.assertEquals(DurationFieldType.days() + " field is unsupported", ex.getMessage());
        }
    }

    @Test
    public void getDifferenceAsLong_givenInstants_shouldThrowUnsupportedOperationException() {
        // Arrange
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());

        // Act & Assert
        try {
            field.getDifferenceAsLong(1000L, 500L);
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ex) {
            Assert.assertEquals(DurationFieldType.days() + " field is unsupported", ex.getMessage());
        }
    }

    @Test
    public void equals_givenSameReference_shouldReturnTrue() {
        // Arrange
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());

        // Act
        boolean result = field.equals(field);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equals_givenNull_shouldReturnFalse() {
        // Arrange
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());

        // Act
        boolean result = field.equals(null);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void equals_givenDifferentTypeClass_shouldReturnFalse() {
        // Arrange
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());

        // Act
        boolean result = field.equals("string_not_duration_field");

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void equals_givenDifferentFieldWithSameName_shouldReturnTrue() {
        // Arrange
        DurationFieldType type1 = new MockDurationFieldType("customTestField");
        DurationFieldType type2 = new MockDurationFieldType("customTestField");
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(type1);
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(type2);

        // Act
        boolean result = field1.equals(field2);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equals_givenDifferentFieldWithDifferentName_shouldReturnFalse() {
        // Arrange
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(DurationFieldType.days());
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(DurationFieldType.hours());

        // Act
        boolean result = field1.equals(field2);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void equals_givenBothFieldsWithNullName_shouldReturnTrue() {
        // Arrange
        DurationFieldType type1 = new MockDurationFieldType(null);
        DurationFieldType type2 = new MockDurationFieldType(null);
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(type1);
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(type2);

        // Act
        boolean result = field1.equals(field2);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equals_givenOtherWithNullNameAndThisWithNonNullName_shouldReturnFalse() {
        // Arrange
        DurationFieldType typeWithNullName = new MockDurationFieldType(null);
        UnsupportedDurationField fieldWithNullName = UnsupportedDurationField.getInstance(typeWithNullName);
        UnsupportedDurationField fieldWithNonNullName = UnsupportedDurationField.getInstance(DurationFieldType.days());

        // Act
        boolean result = fieldWithNonNullName.equals(fieldWithNullName);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void equals_givenThisWithNullNameAndOtherWithNonNullName_shouldReturnFalse() {
        // Arrange
        DurationFieldType typeWithNullName = new MockDurationFieldType(null);
        UnsupportedDurationField fieldWithNullName = UnsupportedDurationField.getInstance(typeWithNullName);
        UnsupportedDurationField fieldWithNonNullName = UnsupportedDurationField.getInstance(DurationFieldType.days());

        // Act
        boolean result = fieldWithNullName.equals(fieldWithNonNullName);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void hashCode_givenEqualInstances_shouldReturnEqualHashCode() {
        // Arrange
        DurationFieldType type1 = new MockDurationFieldType("hashField");
        DurationFieldType type2 = new MockDurationFieldType("hashField");
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(type1);
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(type2);

        // Act & Assert
        Assert.assertEquals(field1.hashCode(), field2.hashCode());
        Assert.assertEquals("hashField".hashCode(), field1.hashCode());
    }

    @Test
    public void toString_givenStandardInstance_shouldReturnExpectedFormattedString() {
        // Arrange
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());

        // Act
        String result = field.toString();

        // Assert
        Assert.assertEquals("UnsupportedDurationField[days]", result);
    }

    @Test
    public void serialization_givenInstance_shouldResolveToCanonicalInstance() throws Exception {
        // Arrange
        UnsupportedDurationField original = UnsupportedDurationField.getInstance(DurationFieldType.weeks());
        ByteArrayOutputStream baos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bais = null;
        ObjectInputStream ois = null;

        try {
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(original);
            oos.flush();

            byte[] serializedData = baos.toByteArray();
            bais = new ByteArrayInputStream(serializedData);
            ois = new ObjectInputStream(bais);

            // Act
            Object deserialized = ois.readObject();

            // Assert
            Assert.assertSame(original, deserialized);
        } finally {
            if (oos != null) {
                oos.close();
            }
            if (ois != null) {
                ois.close();
            }
        }
    }
}