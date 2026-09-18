package org.mockito.internal.util.reflection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class GenericMasterTest {

    private GenericMaster genericMaster;

    // Field with generic type parameter of String
    private List<String> genericStringListField;

    // Field with generic type parameter of Integer
    private List<Integer> genericIntegerListField;

    // Field with generic Map type - first actual type argument is String
    private Map<String, Integer> genericMapField;

    // Field with no generic type (plain Object)
    private String nonGenericField;

    // Field with raw List type (no parameterization)
    private List rawListField;

    // Field with primitive type (no generics possible)
    private int primitiveField;

    // Field with generic type parameter that is itself generic (nested generics)
    private List<List<String>> nestedGenericField;

    @Before
    public void setUp() {
        genericMaster = new GenericMaster();
    }

    @Test
    public void shouldReturnStringClassForGenericStringListField() throws NoSuchFieldException {
        Field field = GenericMasterTest.class.getDeclaredField("genericStringListField");
        Class result = genericMaster.getGenericType(field);
        assertEquals(String.class, result);
    }

    @Test
    public void shouldReturnIntegerClassForGenericIntegerListField() throws NoSuchFieldException {
        Field field = GenericMasterTest.class.getDeclaredField("genericIntegerListField");
        Class result = genericMaster.getGenericType(field);
        assertEquals(Integer.class, result);
    }

    @Test
    public void shouldReturnFirstActualTypeArgumentForMapField() throws NoSuchFieldException {
        Field field = GenericMasterTest.class.getDeclaredField("genericMapField");
        Class result = genericMaster.getGenericType(field);
        assertEquals(String.class, result);
    }

    @Test
    public void shouldReturnObjectClassForNonGenericField() throws NoSuchFieldException {
        Field field = GenericMasterTest.class.getDeclaredField("nonGenericField");
        Class result = genericMaster.getGenericType(field);
        assertEquals(Object.class, result);
    }

    @Test
    public void shouldReturnObjectClassForRawListFieldWithoutParameterization() throws NoSuchFieldException {
        Field field = GenericMasterTest.class.getDeclaredField("rawListField");
        Class result = genericMaster.getGenericType(field);
        assertEquals(Object.class, result);
    }

    @Test
    public void shouldReturnObjectClassForPrimitiveField() throws NoSuchFieldException {
        Field field = GenericMasterTest.class.getDeclaredField("primitiveField");
        Class result = genericMaster.getGenericType(field);
        assertEquals(Object.class, result);
    }

    @Test
    public void shouldReturnListClassForNestedGenericFieldWithoutGoingDeep() throws NoSuchFieldException {
        Field field = GenericMasterTest.class.getDeclaredField("nestedGenericField");
        Class result = genericMaster.getGenericType(field);
        assertEquals(List.class, result);
    }

    @Test
    public void resultShouldNotBeNullForAnyField() throws NoSuchFieldException {
        Field field = GenericMasterTest.class.getDeclaredField("nonGenericField");
        Class result = genericMaster.getGenericType(field);
        assertNotNull(result);
    }
}