package org.mockito.internal.util.reflection;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

import java.lang.reflect.Field;

public class GenericMasterTest {

    private GenericMaster genericMaster;

    @Before
    public void setUp() {
        genericMaster = new GenericMaster();
    }

    @After
    public void tearDown() {
        genericMaster = null;
    }

    private static class GenericFieldHolder<T> {
        public T genericField;
        public String nonGenericField;
        public List<String> listGenericField;
        public Map<String, Integer> mapGenericField;
        public int primitiveField;
        public Integer wrapperField;
    }

    private static class List<T> {}
    private static class Map<K, V> {}

    private Field getField(String name) throws NoSuchFieldException {
        return GenericFieldHolder.class.getDeclaredField(name);
    }

    @Test
    public void testGetGenericType_NullField_ReturnsObjectClass() throws Exception {
        Field field = null;
        Class result = genericMaster.getGenericType(field);
        Assert.fail("Expected NullPointerException when field is null");
    }

    @Test
    public void testGetGenericType_NonGenericField_ReturnsObjectClass() throws Exception {
        Field field = getField("nonGenericField");
        Class result = genericMaster.getGenericType(field);
        Assert.assertEquals(Object.class, result);
    }

    @Test
    public void testGetGenericType_PrimitiveField_ReturnsObjectClass() throws Exception {
        Field field = getField("primitiveField");
        Class result = genericMaster.getGenericType(field);
        Assert.assertEquals(Object.class, result);
    }

    @Test
    public void testGetGenericType_WrapperField_ReturnsObjectClass() throws Exception {
        Field field = getField("wrapperField");
        Class result = genericMaster.getGenericType(field);
        Assert.assertEquals(Object.class, result);
    }

    @Test
    public void testGetGenericType_SimpleGenericField_ReturnsGenericType() throws Exception {
        Field field = GenericFieldHolder.class.getDeclaredField("genericField");
        field.setAccessible(true);
        Class result = genericMaster.getGenericType(field);
        Assert.assertNotNull(result);
    }

    @Test
    public void testGetGenericType_ListGenericField_ReturnsListType() throws Exception {
        Field field = getField("listGenericField");
        Class result = genericMaster.getGenericType(field);
        Assert.assertNotNull(result);
    }

    @Test
    public void testGetGenericType_MapGenericField_ReturnsMapType() throws Exception {
        Field field = getField("mapGenericField");
        Class result = genericMaster.getGenericType(field);
        Assert.assertNotNull(result);
    }

    @Test
    public void testGetGenericType_NestedGenericField_ReturnsFirstTypeArgument() throws Exception {
        Field field = GenericFieldHolder.class.getDeclaredField("genericField");
        field.setAccessible(true);
        // Will use raw type
        Class result = genericMaster.getGenericType(field);
        Assert.assertNotNull(result);
    }

    @Test(expected = NullPointerException.class)
    public void testGetGenericType_NullFieldThrowsNPE() throws Exception {
        Field field = null;
        genericMaster.getGenericType(field);
    }
}