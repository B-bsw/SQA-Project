package com.google.gson;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.List;
import java.util.ArrayList;

public class TypeInfoFactoryTest {
    
    private static class TestClass<T> {
        private T field;
        private String strField;
        private List<String> listField;
        private T[] arrayField;
        private List<?> wildcardList;
        private List<? extends Number> boundedWildcardList;
    }
    
    private static class ExtendedTestClass extends TestClass<Integer> {
    }
    
    private static class MultiGenericClass<A, B> {
        private A a;
        private B b;
    }
    
    private static class MyWildcardType implements WildcardType {
        private final Type[] upperBounds;
        private final Type[] lowerBounds;
        
        public MyWildcardType(Type[] upper, Type[] lower) {
            this.upperBounds = upper;
            this.lowerBounds = lower;
        }
        
        @Override
        public Type[] getUpperBounds() {
            return upperBounds;
        }
        
        @Override
        public Type[] getLowerBounds() {
            return lowerBounds;
        }
    }
    
    private static class MyGenericArrayType implements GenericArrayType {
        private final Type componentType;
        
        public MyGenericArrayType(Type component) {
            this.componentType = component;
        }
        
        @Override
        public Type getGenericComponentType() {
            return componentType;
        }
    }
    
    private Field field;
    
    @Before
    public void setUp() {
        // Setup code if needed
    }
    
    @After
    public void tearDown() {
        // Teardown code if needed
    }
    
    @Test
    public void testGetTypeInfoForFieldWithClass() throws Exception {
        field = TestClass.class.getDeclaredField("strField");
        TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(field, TestClass.class);
        Assert.assertEquals(String.class, typeInfo.getRawClass());
    }
    
    @Test
    public void testGetTypeInfoForFieldWithTypeVariable() throws Exception {
        field = TestClass.class.getDeclaredField("field");
        TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(field, TestClass.class);
        Assert.assertEquals(Object.class, typeInfo.getRawClass());
    }
    
    @Test
    public void testGetTypeInfoForFieldWithParameterizedTypeVariable() throws Exception {
        field = TestClass.class.getDeclaredField("field");
        TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(field, ExtendedTestClass.class);
        Assert.assertEquals(Integer.class, typeInfo.getRawClass());
    }
    
    @Test
    public void testGetTypeInfoForFieldWithParameterizedList() throws Exception {
        field = TestClass.class.getDeclaredField("listField");
        TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(field, TestClass.class);
        Assert.assertEquals(java.util.ArrayList.class, typeInfo.getRawClass());
    }
    
    @Test
    public void testGetTypeInfoForFieldWithArrayType() throws Exception {
        field = TestClass.class.getDeclaredField("arrayField");
        TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(field, TestClass.class);
        Assert.assertTrue(typeInfo.getRawClass().isArray());
    }
    
    @Test
    public void testGetTypeInfoForFieldWithWildcard() throws Exception {
        field = TestClass.class.getDeclaredField("wildcardList");
        TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(field, TestClass.class);
        Assert.assertNotNull(typeInfo);
    }
    
    @Test
    public void testGetTypeInfoForFieldWithBoundedWildcard() throws Exception {
        field = TestClass.class.getDeclaredField("boundedWildcardList");
        TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(field, TestClass.class);
        Assert.assertNotNull(typeInfo);
    }
    
    @Test
    public void testGetTypeInfoForFieldWithMultiGenericNested() throws Exception {
        Field aField = MultiGenericClass.class.getDeclaredField("a");
        Field bField = MultiGenericClass.class.getDeclaredField("b");
        
        TypeInfo typeInfoA = TypeInfoFactory.getTypeInfoForField(aField, MultiGenericClass.class);
        Assert.assertEquals(Object.class, typeInfoA.getRawClass());
        
        TypeInfo typeInfoB = TypeInfoFactory.getTypeInfoForField(bField, MultiGenericClass.class);
        Assert.assertEquals(Object.class, typeInfoB.getRawClass());
    }
    
    @Test
    public void testGetTypeInfoForFieldWithClassTypeVariable() throws Exception {
        field = TestClass.class.getDeclaredField("field");
        TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(field, ExtendedTestClass.class);
        Assert.assertEquals(Integer.class, typeInfo.getRawClass());
    }
    
    @Test
    public void testGetTypeInfoForFieldWithNullField() {
        try {
            TypeInfoFactory.getTypeInfoForField(null, TestClass.class);
            Assert.fail("Should throw NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }
    
    @Test
    public void testGetTypeInfoForFieldWithNullTypeDefining() {
        try {
            Field anyField = TestClass.class.getDeclaredField("strField");
            TypeInfoFactory.getTypeInfoForField(anyField, null);
            Assert.fail("Should throw NullPointerException");
        } catch (Exception e) {
            // Expected - either IllegalArgument or NullPointer
        }
    }
    
    @Test
    public void testGetTypeInfoForArrayWithNull() {
        try {
            TypeInfoFactory.getTypeInfoForArray(null);
            Assert.fail("Should throw exception");
        } catch (Exception e) {
            // Expected - either IllegalArgument or NullPointer
        }
    }
    
    @Test
    public void testGetTypeInfoForArrayWithNonArrayType() {
        try {
            TypeInfoFactory.getTypeInfoForArray(String.class);
            Assert.fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }
    
    @Test
    public void testGetTypeInfoForArrayWithArray() {
        TypeInfoArray typeInfo = TypeInfoFactory.getTypeInfoForArray(String[].class);
        Assert.assertNotNull(typeInfo);
        Assert.assertEquals(String[].class, typeInfo.getRawClass());
    }
    
    @Test
    public void testGetTypeInfoForFieldWithGenericArrayType() throws Exception {
        Class<?> wrapperClass = TestClass.class;
        Field genericArrayField = null;
        try {
            genericArrayField = wrapperClass.getDeclaredField("arrayField");
            TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(genericArrayField, wrapperClass);
            Assert.assertNotNull(typeInfo);
        } catch (Exception e) {
            // Handle generic array issue
            Assert.fail("Unexpected exception: " + e.getMessage());
        }
    }
    
    @Test
    public void testGetTypeInfoForFieldWithTypeVariableInNestedClass() throws Exception {
        class LocalClass<T> {
            private T value;
        }
        
        Field localField = LocalClass.class.getDeclaredField("value");
        TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(localField, LocalClass.class);
        Assert.assertEquals(Object.class, typeInfo.getRawClass());
    }
    
    @Test
    public void testGetTypeInfoForFieldWithMultiParameterizedType() throws Exception {
        class ParameterizedContainer<A, B> {
            private java.util.Map<A, B> mapField;
        }
        
        Field mapField = ParameterizedContainer.class.getDeclaredField("mapField");
        TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(mapField, ParameterizedContainer.class);
        Assert.assertNotNull(typeInfo);
    }
    
    @Test
    public void testGetTypeInfoForFieldWithGenericClassNested() throws Exception {
        class GenericContainer<T> {
            private List<List<T>> nestedList;
        }
        
        Field nestedField = GenericContainer.class.getDeclaredField("nestedList");
        TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(nestedField, GenericContainer.class);
        Assert.assertNotNull(typeInfo);
    }
    
    @Test
    public void testGetTypeInfoForFieldWithTypeVariableInArray() throws Exception {
        class ArrayContainer<T> {
            private T[] array;
        }
        
        Field arrayField = ArrayContainer.class.getDeclaredField("array");
        TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(arrayField, ArrayContainer.class);
        Assert.assertNotNull(typeInfo);
    }
    
    private static class PrivateFieldClass {
        private String privateField;
    }
    
    @Test
    public void testGetTypeInfoForFieldWithPrivateField() throws Exception {
        field = PrivateFieldClass.class.getDeclaredField("privateField");
        field.setAccessible(true);
        TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(field, PrivateFieldClass.class);
        Assert.assertEquals(String.class, typeInfo.getRawClass());
    }
}