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
        final CSVRecord record = new CSVRecord(new String[] { "Value1" }, mapping, null, 1L);

        // Act & Assert
        try {
            record.get("nonExistentCol");
            Assert.fail("Expected IllegalArgumentException when column is not mapped");
        } catch (final IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().contains("Mapping for nonExistentCol not found"));
        }
    }

    @Test
    public void getByName_givenIndexOutOfBoundsInMapping_shouldThrowIllegalArgumentException() {
        // Arrange
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("tooFar", Integer.valueOf(5));
        final CSVRecord record = new CSVRecord(new String[] { "A", "B" }, mapping, null, 1L);

        // Act & Assert
        try {
            record.get("tooFar");
            Assert.fail("Expected IllegalArgumentException when header points to index out of bounds");
        } catch (final IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().contains("Index for header 'tooFar' is 5 but CSVRecord only has 2 values!"));
        }
    }

    @Test
    public void getByName_givenValidMappedHeader_shouldReturnValue() {
        // Arrange
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("first", Integer.valueOf(0));
        mapping.put("second", Integer.valueOf(1));
        final CSVRecord record = new CSVRecord(new String[] { "Foo", "Bar" }, mapping, null, 1L);

        // Act & Assert
        Assert.assertEquals("Foo", record.get("first"));
        Assert.assertEquals("Bar", record.get("second"));
    }

    @Test
    public void getByEnum_givenValidEnumHeader_shouldReturnValue() {
        // Arrange
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("FIRST_NAME", Integer.valueOf(0));
        mapping.put("LAST_NAME", Integer.valueOf(1));
        final CSVRecord record = new CSVRecord(new String[] { "John", "Doe" }, mapping, null, 1L);

        // Act & Assert
        Assert.assertEquals("John", record.get(HeaderEnum.FIRST_NAME));
        Assert.assertEquals("Doe", record.get(HeaderEnum.LAST_NAME));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getByEnum_givenUnmappedEnumHeader_shouldThrowIllegalArgumentException() {
        // Arrange
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("FIRST_NAME", Integer.valueOf(0));
        final CSVRecord record = new CSVRecord(new String[] { "John" }, mapping, null, 1L);

        // Act
        record.get(HeaderEnum.NON_EXISTENT);
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
        mapping.put("col1", Integer.valueOf(0));
        mapping.put("col2", Integer.valueOf(1));
        final CSVRecord record = new CSVRecord(new String[] { "A", "B" }, mapping, null, 1L);

        // Act & Assert
        Assert.assertTrue(record.isConsistent());
    }

    @Test
    public void isConsistent_givenMismatchedMappingSize_shouldReturnFalse() {
        // Arrange
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("col1", Integer.valueOf(0));
        final CSVRecord record = new CSVRecord(new String[] { "A", "B" }, mapping, null, 1L);

        // Act & Assert
        Assert.assertFalse(record.isConsistent());
    }

    @Test
    public void isMapped_givenNullMapping_shouldReturnFalse() {
        // Arrange
        final CSVRecord record = new CSVRecord(new String[] { "A" }, null, null, 1L);

        // Act & Assert
        Assert.assertFalse(record.isMapped("any"));
    }

    @Test
    public void isMapped_givenExistingAndNonExistingKeys_shouldReturnCorrectBoolean() {
        // Arrange
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("present", Integer.valueOf(0));
        final CSVRecord record = new CSVRecord(new String[] { "A" }, mapping, null, 1L);

        // Act & Assert
        Assert.assertTrue(record.isMapped("present"));
        Assert.assertFalse(record.isMapped("absent"));
    }

    @Test
    public void isSet_givenNullMapping_shouldReturnFalse() {
        // Arrange
        final CSVRecord record = new CSVRecord(new String[] { "A" }, null, null, 1L);

        // Act & Assert
        Assert.assertFalse(record.isSet("col"));
    }

    @Test
    public void isSet_givenUnmappedHeader_shouldReturnFalse() {
        // Arrange
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("col1", Integer.valueOf(0));
        final CSVRecord record = new CSVRecord(new String[] { "Val1" }, mapping, null, 1L);

        // Act & Assert
        Assert.assertFalse(record.isSet("unknown"));
    }

    @Test
    public void isSet_givenMappedHeaderWithIndexInRange_shouldReturnTrue() {
        // Arrange
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("col1", Integer.valueOf(0));
        final CSVRecord record = new CSVRecord(new String[] { "Val1" }, mapping, null, 1L);

        // Act & Assert
        Assert.assertTrue(record.isSet("col1"));
    }

    @Test
    public void isSet_givenMappedHeaderWithIndexOutOfRange_shouldReturnFalse() {
        // Arrange
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("colOutOfBounds", Integer.valueOf(5));
        final CSVRecord record = new CSVRecord(new String[] { "Val1" }, mapping, null, 1L);

        // Act & Assert
        Assert.assertFalse(record.isSet("colOutOfBounds"));
    }

    @Test
    public void iterator_givenValues_shouldIterateOverAllValues() {
        // Arrange
        final String[] values = new String[] { "1", "2", "3" };
        final CSVRecord record = new CSVRecord(values, null, null, 1L);

        // Act
        final Iterator<String> it = record.iterator();

        // Assert
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("1", it.next());
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("2", it.next());
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("3", it.next());
        Assert.assertFalse(it.hasNext());
    }

    @Test(expected = NoSuchElementException.class)
    public void iterator_givenEmptyValues_shouldThrowNoSuchElementExceptionOnNext() {
        // Arrange
        final CSVRecord record = new CSVRecord(new String[0], null, null, 1L);
        final Iterator<String> it = record.iterator();

        // Act
        it.next();
    }

    @Test
    public void putIn_givenValidMappingAndValues_shouldPopulateMap() {
        // Arrange
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("A", Integer.valueOf(0));
        mapping.put("B", Integer.valueOf(1));
        mapping.put("Out", Integer.valueOf(10));
        final CSVRecord record = new CSVRecord(new String[] { "valA", "valB" }, mapping, null, 1L);
        final Map<String, String> targetMap = new HashMap<String, String>();

        // Act
        final Map<String, String> result = record.putIn(targetMap);

        // Assert
        Assert.assertSame(targetMap, result);
        Assert.assertEquals(2, result.size());
        Assert.assertEquals("valA", result.get("A"));
        Assert.assertEquals("valB", result.get("B"));
        Assert.assertFalse(result.containsKey("Out"));
    }

    @Test
    public void toMap_givenValidMapping_shouldReturnPopulatedMap() {
        // Arrange
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("h1", Integer.valueOf(0));
        mapping.put("h2", Integer.valueOf(1));
        final CSVRecord record = new CSVRecord(new String[] { "v1", "v2" }, mapping, null, 1L);

        // Act
        final Map<String, String> map = record.toMap();

        // Assert
        Assert.assertEquals(2, map.size());
        Assert.assertEquals("v1", map.get("h1"));
        Assert.assertEquals("v2", map.get("h2"));
    }

    @Test
    public void toString_givenValues_shouldMatchArraysToString() {
        // Arrange
        final String[] values = new String[] { "hello", "world" };
        final CSVRecord record = new CSVRecord(values, null, null, 1L);

        // Act & Assert
        Assert.assertEquals("[hello, world]", record.toString());
    }

    @Test
    public void serialization_givenCSVRecord_shouldSerializeAndDeserializeCorrectly() throws Exception {
        // Arrange
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("colA", Integer.valueOf(0));
        final CSVRecord original = new CSVRecord(new String[] { "ValueA" }, mapping, "Serializable comment", 42L);

        // Act
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        final ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        final ObjectInputStream ois = new ObjectInputStream(bais);
        final CSVRecord deserialized = (CSVRecord) ois.readObject();
        ois.close();

        // Assert
        Assert.assertEquals(original.getRecordNumber(), deserialized.getRecordNumber());
        Assert.assertEquals(original.getComment(), deserialized.getComment());
        Assert.assertEquals(original.size(), deserialized.size());
        Assert.assertEquals(original.get(0), deserialized.get(0));
        Assert.assertEquals(original.get("colA"), deserialized.get("colA"));
    }
}
