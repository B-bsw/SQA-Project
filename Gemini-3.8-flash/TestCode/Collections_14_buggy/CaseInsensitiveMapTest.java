package org.apache.commons.collections.map;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CaseInsensitiveMapTest {

    @Test
    public void defaultConstructor_givenNoParameters_shouldInitializeEmptyMap() {
        // Arrange & Act
        CaseInsensitiveMap map = new CaseInsensitiveMap();

        // Assert
        Assert.assertNotNull(map);
        Assert.assertTrue(map.isEmpty());
        Assert.assertEquals(0, map.size());
    }

    @Test
    public void capacityConstructor_givenValidInitialCapacity_shouldInitializeEmptyMap() {
        // Arrange & Act
        CaseInsensitiveMap map = new CaseInsensitiveMap(32);

        // Assert
        Assert.assertNotNull(map);
        Assert.assertTrue(map.isEmpty());
        Assert.assertEquals(0, map.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void capacityConstructor_givenZeroCapacity_shouldThrowIllegalArgumentException() {
        // Arrange, Act & Assert
        new CaseInsensitiveMap(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void capacityConstructor_givenNegativeCapacity_shouldThrowIllegalArgumentException() {
        // Arrange, Act & Assert
        new CaseInsensitiveMap(-1);
    }

    @Test
    public void capacityAndLoadFactorConstructor_givenValidArguments_shouldInitializeEmptyMap() {
        // Arrange & Act
        CaseInsensitiveMap map = new CaseInsensitiveMap(16, 0.75f);

        // Assert
        Assert.assertNotNull(map);
        Assert.assertTrue(map.isEmpty());
        Assert.assertEquals(0, map.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void capacityAndLoadFactorConstructor_givenInvalidCapacity_shouldThrowIllegalArgumentException() {
        // Arrange, Act & Assert
        new CaseInsensitiveMap(0, 0.75f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void capacityAndLoadFactorConstructor_givenZeroLoadFactor_shouldThrowIllegalArgumentException() {
        // Arrange, Act & Assert
        new CaseInsensitiveMap(16, 0.0f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void capacityAndLoadFactorConstructor_givenNegativeLoadFactor_shouldThrowIllegalArgumentException() {
        // Arrange, Act & Assert
        new CaseInsensitiveMap(16, -0.5f);
    }

    @Test
    public void mapConstructor_givenPopulatedMap_shouldCopyAndConvertToLowerCaseKeys() {
        // Arrange
        Map source = new HashMap();
        source.put("KeyA", "ValueA");
        source.put("keya", "ValueA2");
        source.put("KEYB", "ValueB");
        source.put(null, "NullValue");

        // Act
        CaseInsensitiveMap map = new CaseInsensitiveMap(source);

        // Assert
        Assert.assertEquals(3, map.size());
        Assert.assertEquals("ValueA2", map.get("keya"));
        Assert.assertEquals("ValueA2", map.get("KEYA"));
        Assert.assertEquals("ValueB", map.get("keyb"));
        Assert.assertEquals("NullValue", map.get(null));
    }

    @Test(expected = NullPointerException.class)
    public void mapConstructor_givenNullMap_shouldThrowNullPointerException() {
        // Arrange, Act & Assert
        new CaseInsensitiveMap((Map) null);
    }

    @Test
    public void putAndGet_givenMixedCaseKeys_shouldRetrieveCorrectValues() {
        // Arrange
        CaseInsensitiveMap map = new CaseInsensitiveMap();

        // Act
        map.put("One", "One");
        map.put("Two", "Two");
        map.put(null, "Three");
        map.put("one", "Four");

        // Assert
        Assert.assertEquals(3, map.size());
        Assert.assertEquals("Four", map.get("ONE"));
        Assert.assertEquals("Four", map.get("one"));
        Assert.assertEquals("Four", map.get("OnE"));
        Assert.assertEquals("Two", map.get("TWO"));
        Assert.assertEquals("Two", map.get("two"));
        Assert.assertEquals("Three", map.get(null));
    }

    @Test
    public void putAndGet_givenEmptyStringKey_shouldHandleCorrectly() {
        // Arrange
        CaseInsensitiveMap map = new CaseInsensitiveMap();

        // Act
        map.put("", "EmptyStringValue");

        // Assert
        Assert.assertEquals(1, map.size());
        Assert.assertEquals("EmptyStringValue", map.get(""));
        Assert.assertTrue(map.containsKey(""));
    }

    @Test
    public void putAndGet_givenNonStringObjectKey_shouldConvertToStringLowerCase() {
        // Arrange
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        Integer intKey = new Integer(12345);

        // Act
        map.put(intKey, "NumericKey");

        // Assert
        Assert.assertEquals(1, map.size());
        Assert.assertEquals("NumericKey", map.get("12345"));
        Assert.assertEquals("NumericKey", map.get(intKey));
        Assert.assertTrue(map.containsKey("12345"));
        Assert.assertTrue(map.containsKey(intKey));
    }

    @Test
    public void containsKey_givenExistingKeyInDifferentCase_shouldReturnTrue() {
        // Arrange
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("CaseSensitive", "Value");

        // Act & Assert
        Assert.assertTrue(map.containsKey("casesensitive"));
        Assert.assertTrue(map.containsKey("CASESENSITIVE"));
        Assert.assertTrue(map.containsKey("CaseSensitive"));
        Assert.assertFalse(map.containsKey("CaseSensitive_NotExisting"));
    }

    @Test
    public void containsKey_givenNullKey_shouldIdentifyCorrectly() {
        // Arrange
        CaseInsensitiveMap map = new CaseInsensitiveMap();

        // Act & Assert
        Assert.assertFalse(map.containsKey(null));
        map.put(null, "NullValue");
        Assert.assertTrue(map.containsKey(null));
    }

    @Test
    public void remove_givenKeyInDifferentCase_shouldRemoveEntryAndReturnOldValue() {
        // Arrange
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("ToRemove", "ExistingValue");

        // Act
        Object removedValue = map.remove("TOREMOVE");

        // Assert
        Assert.assertEquals("ExistingValue", removedValue);
        Assert.assertEquals(0, map.size());
        Assert.assertFalse(map.containsKey("toremove"));
        Assert.assertNull(map.get("ToRemove"));
    }

    @Test
    public void remove_givenNullKey_shouldRemoveNullEntry() {
        // Arrange
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put(null, "NullValue");

        // Act
        Object removedValue = map.remove(null);

        // Assert
        Assert.assertEquals("NullValue", removedValue);
        Assert.assertEquals(0, map.size());
        Assert.assertFalse(map.containsKey(null));
    }

    @Test
    public void remove_givenNonExistingKey_shouldReturnNull() {
        // Arrange
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("Existing", "Value");

        // Act
        Object removedValue = map.remove("NonExisting");

        // Assert
        Assert.assertNull(removedValue);
        Assert.assertEquals(1, map.size());
    }

    @Test
    public void keySet_givenMixedCaseKeys_shouldContainAllLowerCaseAndNullKeys() {
        // Arrange
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("ABC", "1");
        map.put("def", "2");
        map.put(null, "3");

        // Act
        Set keys = map.keySet();

        // Assert
        Assert.assertEquals(3, keys.size());
        Assert.assertTrue(keys.contains("abc"));
        Assert.assertTrue(keys.contains("def"));
        Assert.assertTrue(keys.contains(null));
        Assert.assertFalse(keys.contains("ABC"));
        Assert.assertFalse(keys.contains("DEF"));
    }

    @Test
    public void convertKey_givenCustomSubclass_shouldDemonstrateConvertKeyLogic() {
        // Arrange
        CaseInsensitiveMap map = new CaseInsensitiveMap();

        // Act
        Object convertedNonNull = map.convertKey("FooBar");
        Object convertedNull = map.convertKey(null);

        // Assert
        Assert.assertEquals("foobar", convertedNonNull);
        Assert.assertEquals(AbstractHashedMap.NULL, convertedNull);
    }

    @Test
    public void clone_givenPopulatedMap_shouldProduceShallowCopy() {
        // Arrange
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("KEY1", "Val1");
        map.put(null, "Val2");

        // Act
        CaseInsensitiveMap clonedMap = (CaseInsensitiveMap) map.clone();

        // Assert
        Assert.assertNotNull(clonedMap);
        Assert.assertNotSame(map, clonedMap);
        Assert.assertEquals(map.size(), clonedMap.size());
        Assert.assertEquals("Val1", clonedMap.get("key1"));
        Assert.assertEquals("Val2", clonedMap.get(null));

        // Verify independent state
        clonedMap.put("key1", "ModifiedVal1");
        Assert.assertEquals("ModifiedVal1", clonedMap.get("KEY1"));
        Assert.assertEquals("Val1", map.get("KEY1"));
    }

    @Test
    public void serialization_givenPopulatedMap_shouldSerializeAndDeserializeCorrectly() throws Exception {
        // Arrange
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("Alpha", "Value1");
        map.put("BETA", "Value2");
        map.put(null, "Value3");

        // Act: Serialize
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        ObjectOutputStream objectOut = new ObjectOutputStream(byteOut);
        objectOut.writeObject(map);
        objectOut.flush();
        objectOut.close();

        // Act: Deserialize
        ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
        ObjectInputStream objectIn = new ObjectInputStream(byteIn);
        CaseInsensitiveMap deserializedMap = (CaseInsensitiveMap) objectIn.readObject();
        objectIn.close();

        // Assert
        Assert.assertNotNull(deserializedMap);
        Assert.assertNotSame(map, deserializedMap);
        Assert.assertEquals(3, deserializedMap.size());
        Assert.assertEquals("Value1", deserializedMap.get("ALPHA"));
        Assert.assertEquals("Value1", deserializedMap.get("alpha"));
        Assert.assertEquals("Value2", deserializedMap.get("beta"));
        Assert.assertEquals("Value3", deserializedMap.get(null));
        Assert.assertTrue(deserializedMap.containsKey("alpha"));
        Assert.assertTrue(deserializedMap.containsKey(null));
    }

    @Test
    public void serialization_givenEmptyMap_shouldSerializeAndDeserializeCorrectly() throws Exception {
        // Arrange
        CaseInsensitiveMap map = new CaseInsensitiveMap();

        // Act
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        ObjectOutputStream objectOut = new ObjectOutputStream(byteOut);
        objectOut.writeObject(map);
        objectOut.flush();
        objectOut.close();

        ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
        ObjectInputStream objectIn = new ObjectInputStream(byteIn);
        CaseInsensitiveMap deserializedMap = (CaseInsensitiveMap) objectIn.readObject();
        objectIn.close();

        // Assert
        Assert.assertNotNull(deserializedMap);
        Assert.assertTrue(deserializedMap.isEmpty());
        Assert.assertEquals(0, deserializedMap.size());
    }
}