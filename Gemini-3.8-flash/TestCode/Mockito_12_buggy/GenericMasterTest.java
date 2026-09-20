package org.mockito.internal.util.reflection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

public class GenericMasterTest {

    private GenericMaster genericMaster;

    // Test fixture fields
    public List<String> stringListField;
    public Map<Integer, String> mapField;
    public String nonGenericStringField;
    public int primitiveIntField;
    public String[] arrayField;
    @SuppressWarnings("rawtypes")
    public List rawListField;
    public List<List<String>> nestedGenericListField;

    @Before
    public void setUp() {
        genericMaster = new GenericMaster();
    }

    @Test
    public void getGenericType_givenSingleGenericField_shouldReturnGenericTypeClass() throws Exception {
        // Arrange
        Field field = GenericMasterTest.class.getField("stringListField");

        // Act
        Class result = genericMaster.getGenericType(field);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(String.class, result);
    }

    @Test
    public void getGenericType_givenMultipleGenericParameters_shouldReturnFirstGenericParameterType() throws Exception {
        // Arrange
        Field field = GenericMasterTest.class.getField("mapField");

        // Act
        Class result = genericMaster.getGenericType(field);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(Integer.class, result);
    }

    @Test
    public void getGenericType_givenNonGenericObjectField_shouldReturnObjectClass() throws Exception {
        // Arrange
        Field field = GenericMasterTest.class.getField("nonGenericStringField");

        // Act
        Class result = genericMaster.getGenericType(field);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(Object.class, result);
    }

    @Test
    public void getGenericType_givenPrimitiveField_shouldReturnObjectClass() throws Exception {
        // Arrange
        Field field = GenericMasterTest.class.getField("primitiveIntField");

        // Act
        Class result = genericMaster.getGenericType(field);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(Object.class, result);
    }

    @Test
    public void getGenericType_givenArrayField_shouldReturnObjectClass() throws Exception {
        // Arrange
        Field field = GenericMasterTest.class.getField("arrayField");

        // Act
        Class result = genericMaster.getGenericType(field);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(Object.class, result);
    }

    @Test
    public void getGenericType_givenRawTypeField_shouldReturnObjectClass() throws Exception {
        // Arrange
        Field field = GenericMasterTest.class.getField("rawListField");

        // Act
        Class result = genericMaster.getGenericType(field);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(Object.class, result);
    }

    @Test(expected = NullPointerException.class)
    public void getGenericType_givenNullField_shouldThrowNullPointerException() {
        // Arrange
        Field nullField = null;

        // Act
        genericMaster.getGenericType(nullField);

        // Assert - Handled by expected = NullPointerException.class
    }

    @Test(expected = ClassCastException.class)
    public void getGenericType_givenNestedGenericField_shouldThrowClassCastExceptionDueToDirectCast() throws Exception {
        // Arrange
        Field field = GenericMasterTest.class.getField("nestedGenericListField");

        // Act
        genericMaster.getGenericType(field);

        // Assert - Handled by expected = ClassCastException.class
    }
}