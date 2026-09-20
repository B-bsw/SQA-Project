package org.apache.commons.csv;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import org.junit.Assert;
import org.junit.Test;

public class CSVRecordTest {

    @Test
    public void constructor_givenNullValues_shouldInitializeWithEmptyArray() {
        // Arrange & Act
        CSVRecord record = new CSVRecord(null, null, null, 1L);

        // Assert
        Assert.assertNotNull(record.values());
        Assert.assertEquals(0, record.size());
        Assert.assertNull(record.getComment());
        Assert.assertEquals(1L, record.getRecordNumber());
    }

    @Test
    public void get_givenValidIndex_shouldReturnValue() {
        // Arrange
        String[] values = new String[]{"first", "second", "third"};
        CSVRecord record = new CSVRecord(values, null, "comment", 100L);

        // Act
        String val0 = record.get(0);
        String val1 = record.get(1);
        String val2 = record.get(2);

        // Assert
        Assert.assertEquals("first", val0);
        Assert.assertEquals("second", val1);
        Assert.assertEquals("third", val2);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void get_givenNegativeIndex_shouldThrowArrayIndexOutOfBoundsException() {
        // Arrange
        String[] values = new String[]{"A", "B"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);

        // Act
        record.get(-1);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void get_givenIndexEqualToLength_shouldThrowArrayIndexOutOfBoundsException() {
        // Arrange
        String[] values = new String[]{"A", "B"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);

        // Act
        record.get(2);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void get_givenIndexOnEmptyRecord_shouldThrowArrayIndexOutOfBoundsException() {
        // Arrange
        CSVRecord record = new CSVRecord(null, null, null, 1L);

        // Act
        record.get(0);
    }

    @Test
    public void get_givenNullMapping_shouldThrowIllegalStateException() {
        // Arrange
        String[] values = new String[]{"alpha", "beta"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);

        // Act & Assert
        try {
            record.get("alpha");
            Assert.fail("Expected IllegalStateException to be thrown");
        } catch (IllegalStateException e) {
            Assert.assertEquals("No header mapping was specified, the record values can't be accessed by name", e.getMessage());
        }
    }

    @Test
    public void get_givenMappedNameExists_shouldReturnValue() {
        // Arrange
        String[] values = new String[]{"John", "Doe", "30"};
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("firstName", Integer.valueOf(0));
        mapping.put("lastName", Integer.valueOf(1));
        mapping.put("age", Integer.valueOf(2));
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);

        // Act
        String firstName = record.get("firstName");
        String lastName = record.get("lastName");
        String age = record.get("age");

        // Assert
        Assert.assertEquals("John", firstName);
        Assert.assertEquals("Doe", lastName);
        Assert.assertEquals("30", age);
    }

    @Test
    public void get_givenMappedNameDoesNotExist_shouldReturnNull() {
        // Arrange
        String[] values = new String[]{"John", "Doe"};
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("firstName", Integer.valueOf(0));
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);

        // Act
        String nonExistent = record.get("unknownColumn");

        // Assert
        Assert.assertNull(nonExistent);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void get_givenMappedIndexOutOfBounds_shouldThrowArrayIndexOutOfBoundsException() {
        // Arrange
        String[] values = new String[]{"value"};
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("col1", Integer.valueOf(5));
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);

        // Act
        record.get("col1");
    }

    @Test
    public void isConsistent_givenNullMapping_shouldReturnTrue() {
        // Arrange
        String[] values = new String[]{"a", "b"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);

        // Act & Assert
        Assert.assertTrue(record.isConsistent());
    }

    @Test
    public void isConsistent_givenEqualMappingAndValuesSize_shouldReturnTrue() {
        // Arrange
        String[] values = new String[]{"val1", "val2"};
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("col1", Integer.valueOf(0));
        mapping.put("col2", Integer.valueOf(1));
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);

        // Act & Assert
        Assert.assertTrue(record.isConsistent());
    }

    @Test
    public void isConsistent_givenMappingSizeLessThanValues_shouldReturnFalse() {
        // Arrange
        String[] values = new String[]{"val1", "val2", "val3"};
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("col1", Integer.valueOf(0));
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);

        // Act & Assert
        Assert.assertFalse(record.isConsistent());
    }

    @Test
    public void isConsistent_givenMappingSizeGreaterThanValues_shouldReturnFalse() {
        // Arrange
        String[] values = new String[]{"val1"};
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("col1", Integer.valueOf(0));
        mapping.put("col2", Integer.valueOf(1));
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);

        // Act & Assert
        Assert.assertFalse(record.isConsistent());
    }

    @Test
    public void isMapped_givenNullMapping_shouldReturnFalse() {
        // Arrange
        CSVRecord record = new CSVRecord(new String[]{"val"}, null, null, 1L);

        // Act & Assert
        Assert.assertFalse(record.isMapped("anyColumn"));
    }

    @Test
    public void isMapped_givenExistingColumn_shouldReturnTrue() {
        // Arrange
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("header", Integer.valueOf(0));
        CSVRecord record = new CSVRecord(new String[]{"data"}, mapping, null, 1L);

        // Act & Assert
        Assert.assertTrue(record.isMapped("header"));
    }

    @Test
    public void isMapped_givenNonExistingColumn_shouldReturnFalse() {
        // Arrange
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("header", Integer.valueOf(0));
        CSVRecord record = new CSVRecord(new String[]{"data"}, mapping, null, 1L);

        // Act & Assert
        Assert.assertFalse(record.isMapped("nonExisting"));
    }

    @Test
    public void isSet_givenNullMapping_shouldReturnFalse() {
        // Arrange
        CSVRecord record = new CSVRecord(new String[]{"data"}, null, null, 1L);

        // Act & Assert
        Assert.assertFalse(record.isSet("col"));
    }

    @Test
    public void isSet_givenUnmappedColumn_shouldReturnFalse() {
        // Arrange
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("col1", Integer.valueOf(0));
        CSVRecord record = new CSVRecord(new String[]{"data"}, mapping, null, 1L);

        // Act & Assert
        Assert.assertFalse(record.isSet("unmapped"));
    }

    @Test
    public void isSet_givenMappedColumnWithinBounds_shouldReturnTrue() {
        // Arrange
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("col1", Integer.valueOf(0));
        mapping.put("col2", Integer.valueOf(1));
        CSVRecord record = new CSVRecord(new String[]{"val1", "val2"}, mapping, null, 1L);

        // Act & Assert
        Assert.assertTrue(record.isSet("col1"));
        Assert.assertTrue(record.isSet("col2"));
    }

    @Test
    public void isSet_givenMappedColumnOutOfBounds_shouldReturnFalse() {
        // Arrange
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("col1", Integer.valueOf(0));
        mapping.put("col2", Integer.valueOf(1));
        CSVRecord record = new CSVRecord(new String[]{"onlyOneValue"}, mapping, null, 1L);

        // Act & Assert
        Assert.assertTrue(record.isSet("col1"));
        Assert.assertFalse(record.isSet("col2"));
    }

    @Test
    public void iterator_givenValues_shouldIterateAllElementsInOrder() {
        // Arrange
        String[] values = new String[]{"one", "two", "three"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);

        // Act
        Iterator<String> it = record.iterator();

        // Assert
        Assert.assertNotNull(it);
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("one", it.next());
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("two", it.next());
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("three", it.next());
        Assert.assertFalse(it.hasNext());
    }

    @Test(expected = NoSuchElementException.class)
    public void iterator_givenExhaustedIterator_shouldThrowNoSuchElementException() {
        // Arrange
        CSVRecord record = new CSVRecord(new String[0], null, null, 1L);
        Iterator<String> it = record.iterator();

        // Act
        it.next();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void iterator_givenCallToRemove_shouldThrowUnsupportedOperationException() {
        // Arrange
        CSVRecord record = new CSVRecord(new String[]{"data"}, null, null, 1L);
        Iterator<String> it = record.iterator();
        it.next();

        // Act
        it.remove();
    }

    @Test
    public void values_givenRecord_shouldReturnUnderlyingArray() {
        // Arrange
        String[] originalValues = new String[]{"a", "b"};
        CSVRecord record = new CSVRecord(originalValues, null, null, 1L);

        // Act
        String[] returnedValues = record.values();

        // Assert
        Assert.assertArrayEquals(originalValues, returnedValues);
    }

    @Test
    public void getComment_givenProvidedComment_shouldReturnComment() {
        // Arrange
        String commentText = "Sample comment text";
        CSVRecord record = new CSVRecord(new String[0], null, commentText, 1L);

        // Act & Assert
        Assert.assertEquals(commentText, record.getComment());
    }

    @Test
    public void getComment_givenNullComment_shouldReturnNull() {
        // Arrange
        CSVRecord record = new CSVRecord(new String[0], null, null, 1L);

        // Act & Assert
        Assert.assertNull(record.getComment());
    }

    @Test
    public void getRecordNumber_givenRecordNumber_shouldReturnExactValue() {
        // Arrange & Act
        CSVRecord record1 = new CSVRecord(new String[0], null, null, 0L);
        CSVRecord record2 = new CSVRecord(new String[0], null, null, 42L);
        CSVRecord record3 = new CSVRecord(new String[0], null, null, -1L);

        // Assert
        Assert.assertEquals(0L, record1.getRecordNumber());
        Assert.assertEquals(42L, record2.getRecordNumber());
        Assert.assertEquals(-1L, record3.getRecordNumber());
    }

    @Test
    public void size_givenVariousValueSizes_shouldReturnCorrectLength() {
        // Arrange
        CSVRecord emptyRecord = new CSVRecord(new String[0], null, null, 1L);
        CSVRecord twoItemRecord = new CSVRecord(new String[]{"A", "B"}, null, null, 1L);

        // Act & Assert
        Assert.assertEquals(0, emptyRecord.size());
        Assert.assertEquals(2, twoItemRecord.size());
    }

    @Test
    public void toString_givenValues_shouldMatchArraysToString() {
        // Arrange
        String[] values = new String[]{"foo", "bar", "baz"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);

        // Act
        String actual = record.toString();

        // Assert
        Assert.assertEquals("[foo, bar, baz]", actual);
    }

    @Test
    public void toString_givenEmptyValues_shouldReturnEmptyArrayString() {
        // Arrange
        CSVRecord record = new CSVRecord(null, null, null, 1L);

        // Act
        String actual = record.toString();

        // Assert
        Assert.assertEquals("[]", actual);
    }

    @Test
    public void serialization_givenValidRecord_shouldSerializeAndDeserialize() throws Exception {
        // Arrange
        String[] values = new String[]{"val1", "val2"};
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("k1", Integer.valueOf(0));
        mapping.put("k2", Integer.valueOf(1));
        CSVRecord original = new CSVRecord(values, mapping, "serialization comment", 99L);

        // Act
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        CSVRecord deserialized = (CSVRecord) ois.readObject();
        ois.close();

        // Assert
        Assert.assertEquals(original.getRecordNumber(), deserialized.getRecordNumber());
        Assert.assertEquals(original.getComment(), deserialized.getComment());
        Assert.assertEquals(original.size(), deserialized.size());
        Assert.assertEquals(original.get("k1"), deserialized.get("k1"));
        Assert.assertEquals(original.get("k2"), deserialized.get("k2"));
        Assert.assertEquals(original.toString(), deserialized.toString());
        Assert.assertTrue(deserialized.isConsistent());
    }
}