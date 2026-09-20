package org.apache.commons.csv;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public class CSVRecordTest {

    private enum HeaderEnum {
        FIRST_NAME,
        LAST_NAME,
        NON_EXISTENT
    }

    @Test
    public void constructor_givenNullValues_shouldInitializeEmptyArray() {
        // Arrange & Act
        final CSVRecord record = new CSVRecord(null, null, "test comment", 1L);

        // Assert
        Assert.assertEquals(0, record.size());
        Assert.assertNotNull(record.values());
        Assert.assertEquals(0, record.values().length);
        Assert.assertEquals("test comment", record.getComment());
        Assert.assertEquals(1L, record.getRecordNumber());
    }

    @Test
    public void constructor_givenNonNullValues_shouldRetainValues() {
        // Arrange
        final String[] values = new String[] { "A", "B", "C" };

        // Act
        final CSVRecord record = new CSVRecord(values, null, null, 0L);

        // Assert
        Assert.assertEquals(3, record.size());
        Assert.assertArrayEquals(values, record.values());
        Assert.assertNull(record.getComment());
        Assert.assertEquals(0L, record.getRecordNumber());
    }

    @Test
    public void getByIndex_givenValidIndex_shouldReturnValue() {
        // Arrange
        final String[] values = new String[] { "Alpha", "Beta", "Gamma" };
        final CSVRecord record = new CSVRecord(values, null, null, 1L);

        // Act & Assert
        Assert.assertEquals("Alpha", record.get(0));
        Assert.assertEquals("Beta", record.get(1));
        Assert.assertEquals("Gamma", record.get(2));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void getByIndex_givenNegativeIndex_shouldThrowException() {
        // Arrange
        final CSVRecord record = new CSVRecord(new String[] { "A" }, null, null, 1L);

        // Act
        record.get(-1);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void getByIndex_givenIndexEqualToSize_shouldThrowException() {
        // Arrange
        final CSVRecord record = new CSVRecord(new String[] { "A" }, null, null, 1L);

        // Act
        record.get(1);
    }

    @Test
    public void getByName_givenNullMapping_shouldThrowIllegalStateException() {
        // Arrange
        final CSVRecord record = new CSVRecord(new String[] { "Alpha" }, null, null, 1L);

        // Act & Assert
        try {
            record.get("anyColumn");
            Assert.fail("Expected IllegalStateException when mapping is null");
        } catch (final IllegalStateException ex) {
            Assert.assertEquals(
                    "No header mapping was specified, the record values can't be accessed by name",
                    ex.getMessage());
        }
    }

    @Test
    public void getByName_givenUnmappedHeader_shouldThrowIllegalArgumentException() {
        // Arrange
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("col1", Integer.valueOf(0));
        final CSVRecord record = new CSVRecord(new String[] { "val1" }, mapping, null, 1L);

        // Act & Assert
        try {
            record.get("unmappedCol");
            Assert.fail("Expected IllegalArgumentException for unmapped column");
        } catch (final IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().contains("Mapping for unmappedCol not found"));
        }
    }

    @Test
    public void getByName_givenValidMappedHeader_shouldReturnValue() {
        // Arrange
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("firstName", Integer.valueOf(0));
        mapping.put("lastName", Integer.valueOf(1));
        final CSVRecord record = new CSVRecord(new String[] { "John", "Doe" }, mapping, null, 1L);

        // Act & Assert
        Assert.assertEquals("John", record.get("firstName"));
        Assert.assertEquals("Doe", record.get("lastName"));
    }

    @Test
    public void getByName_givenIndexOutOfBoundsInMapping_shouldThrowIllegalArgumentException() {
        // Arrange
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("colOutOfBounds", Integer.valueOf(5));
        final CSVRecord record = new CSVRecord(new String[] { "val0", "val1" }, mapping, null, 1L);

        // Act & Assert
        try {
            record.get("colOutOfBounds");
            Assert.fail("Expected IllegalArgumentException when index exceeds values length");
        } catch (final IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().contains("Index for header 'colOutOfBounds' is 5 but CSVRecord only has 2 values!"));
        }
    }

    @Test
    public void getByName_givenNegativeIndexInMapping_shouldThrowIllegalArgumentException() {
        // Arrange
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("colNegative", Integer.valueOf(-1));
        final CSVRecord record = new CSVRecord(new String[] { "val0" }, mapping, null, 1L);

        // Act & Assert
        try {
            record.get("colNegative");
            Assert.fail("Expected IllegalArgumentException when index is negative in mapping");
        } catch (final IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().contains("Index for header 'colNegative' is -1 but CSVRecord only has 1 values!"));
        }
    }

    @Test
    public void getByEnum_givenMappedEnum_shouldReturnValue() {
        // Arrange
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("FIRST_NAME", Integer.valueOf(0));
        mapping.put("LAST_NAME", Integer.valueOf(1));
        final CSVRecord record = new CSVRecord(new String[] { "Jane", "Smith" }, mapping, null, 1L);

        // Act & Assert
        Assert.assertEquals("Jane", record.get(HeaderEnum.FIRST_NAME));
        Assert.assertEquals("Smith", record.get(HeaderEnum.LAST_NAME));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getByEnum_givenUnmappedEnum_shouldThrowIllegalArgumentException() {
        // Arrange
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("FIRST_NAME", Integer.valueOf(0));
        final CSVRecord record = new CSVRecord(new String[] { "Jane" }, mapping, null, 1L);

        // Act
        record.get(HeaderEnum.NON_EXISTENT);
    }

    @Test
    public void getComment_givenRecordWithComment_shouldReturnComment() {
        // Arrange
        final CSVRecord record = new CSVRecord(new String[0], null, "Sample comment", 10L);

        // Act & Assert
        Assert.assertEquals("Sample comment", record.getComment());
    }

    @Test
    public void getComment_givenRecordWithoutComment_shouldReturnNull() {
        // Arrange
        final CSVRecord record = new CSVRecord(new String[0], null, null, 10L);

        // Act & Assert
        Assert.assertNull(record.getComment());
    }

    @Test
    public void getRecordNumber_givenRecordNumber_shouldReturnExactValue() {
        // Arrange
        final CSVRecord record1 = new CSVRecord(new String[0], null, null, 0L);
        final CSVRecord record2 = new CSVRecord(new String[0], null, null, 9999999999L);
        final CSVRecord record3 = new CSVRecord(new String[0], null, null, -1L);

        // Act & Assert
        Assert.assertEquals(0L, record1.getRecordNumber());
        Assert.assertEquals(9999999999L, record2.getRecordNumber());
        Assert.assertEquals(-1L, record3.getRecordNumber());
    }

    @Test
    public void isConsistent_givenNullMapping_shouldReturnTrue() {
        // Arrange
        final CSVRecord record = new CSVRecord(new String[] { "A", "B" }, null, null, 1L);

        // Act & Assert
        Assert.assertTrue(record.isConsistent());
    }

    @Test
    public void isConsistent_givenMatchingMappingSize_shouldReturnTrue() {
        // Arrange
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("A", Integer.valueOf(0));
        mapping.put("B", Integer.valueOf(1));
        final CSVRecord record = new CSVRecord(new String[] { "val1", "val2" }, mapping, null, 1L);

        // Act & Assert
        Assert.assertTrue(record.isConsistent());
    }

    @Test
    public void isConsistent_givenMismatchedMappingSize_shouldReturnFalse() {
        // Arrange
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("A", Integer.valueOf(0));
        mapping.put("B", Integer.valueOf(1));
        mapping.put("C", Integer.valueOf(2));
        final CSVRecord record = new CSVRecord(new String[] { "val1", "val2" }, mapping, null, 1L);

        // Act & Assert
        Assert.assertFalse(record.isConsistent());
    }

    @Test
    public void isMapped_givenNullMapping_shouldReturnFalse() {
        // Arrange
        final CSVRecord record = new CSVRecord(new String[] { "val" }, null, null, 1L);

        // Act & Assert
        Assert.assertFalse(record.isMapped("val"));
    }

    @Test
    public void isMapped_givenKeyExists_shouldReturnTrue() {
        // Arrange
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("name", Integer.valueOf(0));
        final CSVRecord record = new CSVRecord(new String[] { "val" }, mapping, null, 1L);

        // Act & Assert
        Assert.assertTrue(record.isMapped("name"));
    }

    @Test
    public void isMapped_givenKeyDoesNotExist_shouldReturnFalse() {
        // Arrange
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("name", Integer.valueOf(0));
        final CSVRecord record = new CSVRecord(new String[] { "val" }, mapping, null, 1L);

        // Act & Assert
        Assert.assertFalse(record.isMapped("age"));
    }

    @Test
    public void isSet_givenNullMapping_shouldReturnFalse() {
        // Arrange
        final CSVRecord record = new CSVRecord(new String[] { "val" }, null, null, 1L);

        // Act & Assert
        Assert.assertFalse(record.isSet("val"));
    }

    @Test
    public void isSet_givenUnmappedHeader_shouldReturnFalse() {
        // Arrange
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("col1", Integer.valueOf(0));
        final CSVRecord record = new CSVRecord(new String[] { "val" }, mapping, null, 1L);

        // Act & Assert
        Assert.assertFalse(record.isSet("col2"));
    }

    @Test
    public void isSet_givenMappedHeaderAndIndexWithinBounds_shouldReturnTrue() {
        // Arrange
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("col1", Integer.valueOf(0));
        final CSVRecord record = new CSVRecord(new String[] { "val" }, mapping, null, 1L);

        // Act & Assert
        Assert.assertTrue(record.isSet("col1"));
    }

    @Test
    public void isSet_givenMappedHeaderAndIndexOutOfBounds_shouldReturnFalse() {
        // Arrange
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("colOutOfBounds", Integer.valueOf(3));
        final CSVRecord record = new CSVRecord(new String[] { "val1", "val2" }, mapping, null, 1L);

        // Act & Assert
        Assert.assertFalse(record.isSet("colOutOfBounds"));
    }

    @Test
    public void isSet_givenMappedHeaderAndIndexEqualToSize_shouldReturnFalse() {
        // Arrange
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("colEdge", Integer.valueOf(1));
        final CSVRecord record = new CSVRecord(new String[] { "val0" }, mapping, null, 1L);

        // Act & Assert
        Assert.assertFalse(record.isSet("colEdge"));
    }

    @Test
    public void iterator_givenNonEmptyRecord_shouldIterateAllElements() {
        // Arrange
        final String[] values = new String[] { "A", "B", "C" };
        final CSVRecord record = new CSVRecord(values, null, null, 1L);

        // Act
        final Iterator<String> iterator = record.iterator();

        // Assert
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals("A", iterator.next());
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals("B", iterator.next());
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals("C", iterator.next());
        Assert.assertFalse(iterator.hasNext());
    }

    @Test(expected = NoSuchElementException.class)
    public void iterator_givenEmptyRecord_callingNextShouldThrowNoSuchElementException() {
        // Arrange
        final CSVRecord record = new CSVRecord(null, null, null, 1L);

        // Act
        final Iterator<String> iterator = record.iterator();

        // Assert
        Assert.assertFalse(iterator.hasNext());
        iterator.next();
    }

    @Test
    public void putIn_givenValidMap_shouldPopulateAndReturnMap() {
        // Arrange
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("key1", Integer.valueOf(0));
        mapping.put("key2", Integer.valueOf(1));
        final CSVRecord record = new CSVRecord(new String[] { "val1", "val2" }, mapping, null, 1L);
        final Map<String, String> targetMap = new HashMap<String, String>();

        // Act
        final Map<String, String> result = record.putIn(targetMap);

        // Assert
        Assert.assertSame(targetMap, result);
        Assert.assertEquals(2, result.size());
        Assert.assertEquals("val1", result.get("key1"));
        Assert.assertEquals("val2", result.get("key2"));
    }

    @Test
    public void size_givenVariousArraySizes_shouldReturnAccurateCount() {
        // Arrange
        final CSVRecord emptyRecord = new CSVRecord(new String[0], null, null, 1L);
        final CSVRecord singleRecord = new CSVRecord(new String[] { "one" }, null, null, 1L);
        final CSVRecord multiRecord = new CSVRecord(new String[] { "one", "two", "three" }, null, null, 1L);

        // Act & Assert
        Assert.assertEquals(0, emptyRecord.size());
        Assert.assertEquals(1, singleRecord.size());
        Assert.assertEquals(3, multiRecord.size());
    }

    @Test
    public void toMap_givenMappedRecord_shouldReturnPopulatedMap() {
        // Arrange
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("name", Integer.valueOf(0));
        mapping.put("city", Integer.valueOf(1));
        final CSVRecord record = new CSVRecord(new String[] { "Alice", "Paris" }, mapping, null, 1L);

        // Act
        final Map<String, String> resultMap = record.toMap();

        // Assert
        Assert.assertNotNull(resultMap);
        Assert.assertEquals(2, resultMap.size());
        Assert.assertEquals("Alice", resultMap.get("name"));
        Assert.assertEquals("Paris", resultMap.get("city"));
    }

    @Test
    public void toMap_givenEmptyMapping_shouldReturnEmptyMap() {
        // Arrange
        final Map<String, Integer> mapping = Collections.emptyMap();
        final CSVRecord record = new CSVRecord(new String[] { "Alice" }, mapping, null, 1L);

        // Act
        final Map<String, String> resultMap = record.toMap();

        // Assert
        Assert.assertNotNull(resultMap);
        Assert.assertTrue(resultMap.isEmpty());
    }

    @Test
    public void toString_givenValues_shouldFormatAsArrayString() {
        // Arrange
        final CSVRecord record = new CSVRecord(new String[] { "1", "two", "3" }, null, null, 1L);

        // Act
        final String result = record.toString();

        // Assert
        Assert.assertEquals("[1, two, 3]", result);
    }

    @Test
    public void toString_givenEmptyValues_shouldFormatAsEmptyArrayString() {
        // Arrange
        final CSVRecord record = new CSVRecord(new String[0], null, null, 1L);

        // Act
        final String result = record.toString();

        // Assert
        Assert.assertEquals("[]", result);
    }

    @Test
    public void values_givenRecord_shouldReturnUnderlyingArray() {
        // Arrange
        final String[] original = new String[] { "X", "Y" };
        final CSVRecord record = new CSVRecord(original, null, null, 1L);

        // Act
        final String[] retrieved = record.values();

        // Assert
        Assert.assertSame(original, retrieved);
    }

    @Test
    public void serialization_givenValidRecord_shouldSerializeAndDeserializeCorrectly() throws Exception {
        // Arrange
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("col1", Integer.valueOf(0));
        mapping.put("col2", Integer.valueOf(1));
        final CSVRecord originalRecord = new CSVRecord(
                new String[] { "v1", "v2" },
                mapping,
                "Serialization test comment",
                42L
        );

        // Act
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(originalRecord);
        oos.flush();
        oos.close();

        final ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        final ObjectInputStream ois = new ObjectInputStream(bais);
        final CSVRecord deserializedRecord = (CSVRecord) ois.readObject();
        ois.close();

        // Assert
        Assert.assertNotNull(deserializedRecord);
        Assert.assertEquals(originalRecord.getRecordNumber(), deserializedRecord.getRecordNumber());
        Assert.assertEquals(originalRecord.getComment(), deserializedRecord.getComment());
        Assert.assertEquals(originalRecord.size(), deserializedRecord.size());
        Assert.assertEquals(originalRecord.get(0), deserializedRecord.get(0));
        Assert.assertEquals(originalRecord.get(1), deserializedRecord.get(1));
        Assert.assertEquals(originalRecord.get("col1"), deserializedRecord.get("col1"));
        Assert.assertEquals(originalRecord.get("col2"), deserializedRecord.get("col2"));
        Assert.assertTrue(deserializedRecord.isConsistent());
    }
}