package org.mockito.internal.util.reflection;

import org.junit.Test;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.util.reflection.GenericMetadataSupport.BoundedType;
import org.mockito.internal.util.reflection.GenericMetadataSupport.TypeVarBoundedType;
import org.mockito.internal.util.reflection.GenericMetadataSupport.WildCardBoundedType;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GenericMetadataSupportTest {

    // Test interfaces and classes for generic scenarios
    interface TestInterface<T> {
        T getValue();
        List<String> getList();
    }

    interface GenericInterface<K extends Comparable<K> & Cloneable, V> extends Map<K, V> {
        V get(K key);
        List<? super Integer> getWildcardLower();
        K getKey();
        <O extends K> List<O> getParamType(O o);
    }

    interface BoundedInterface<T extends Number & Comparable<T>> {
        T getBounded();
    }

    static class TestClass implements TestInterface<String> {
        @Override
        public String getValue() { return "test"; }
        @Override
        public List<String> getList() { return Arrays.asList("a"); }
    }

    static class GenericClass<T extends Number & Comparable<T>> implements BoundedInterface<T> {
        @Override
        public T getBounded() { return null; }
    }

    static class NestedGeneric<T> {
        class Inner<T> {
            T value;
        }
    }

    static class SimpleClass {}

    private interface CustomBoundInterface<K> {
        K getCustom();
    }

    static class MultiBoundClass<T extends Number & Comparable<T> & CustomBoundInterface<T>> {
        T getMultiBound() { return null; }
    }

    @Test
    public void testInferFromClass() {
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(String.class);
        assertNotNull(support);
        assertEquals(String.class, support.rawType());
    }

    @Test
    public void testInferFromParameterizedType() throws NoSuchMethodException {
        Method method = GenericInterface.class.getMethod("getKey");
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(method.getGenericReturnType());
        assertNotNull(support);
    }

    @Test
    public void testInferFromUnsupportedType() {
        try {
            GenericMetadataSupport.inferFrom(null);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            // expected
        }
    }

    @Test
    public void testNotGenericReturnTypeSupport() throws NoSuchMethodException {
        Method method = SimpleClass.class.getMethod("toString");
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(SimpleClass.class);
        GenericMetadataSupport result = support.resolveGenericReturnType(method);
        assertNotNull(result);
        assertEquals(String.class, result.rawType());
    }

    @Test
    public void testFromClassRawType() {
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(TestClass.class);
        assertEquals(TestClass.class, support.rawType());
    }

    @Test
    public void testFromParameterizedTypeRawType() throws NoSuchMethodException {
        Method method = GenericInterface.class.getMethod("getKey");
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(method.getGenericReturnType());
        if (support != null) {
            // Should be able to resolve raw type
        }
    }

    @Test
    public void testExtraInterfacesEmpty() {
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(SimpleClass.class);
        assertTrue(support.extraInterfaces().isEmpty());
        assertEquals(0, support.rawExtraInterfaces().length);
        assertFalse(support.hasRawExtraInterfaces());
    }

    @Test
    public void testTypeVarBoundedType() {
        TypeVariable<?>[] typeVariables = MultiBoundClass.class.getTypeParameters();
        TypeVarBoundedType boundedType = new GenericMetadataSupport.TypeVarBoundedType(typeVariables[0]);
        assertNotNull(boundedType);
        assertNotNull(boundedType.firstBound());
        assertEquals(1, boundedType.interfaceBounds().length);
        assertEquals(typeVariables[0], boundedType.typeVariable());
        assertEquals(typeVariables[0].hashCode(), boundedType.hashCode());
        assertTrue(boundedType.toString().contains("firstBound"));
    }

    @Test
    public void testTypeVarBoundedTypeEquals() {
        TypeVariable<?>[] typeVariables = MultiBoundClass.class.getTypeParameters();
        TypeVarBoundedType boundedType1 = new TypeVarBoundedType(typeVariables[0]);
        TypeVarBoundedType boundedType2 = new TypeVarBoundedType(typeVariables[0]);
        assertEquals(boundedType1, boundedType2);
        assertEquals(boundedType1.hashCode(), boundedType2.hashCode());
        assertFalse(boundedType1.equals(null));
        assertFalse(boundedType1.equals("not same"));
    }

    @Test
    public void testWildCardBoundedType() throws NoSuchMethodException {
        Method method = GenericInterface.class.getMethod("getWildcardLower");
        WildcardType wildcardType = (WildcardType) ((ParameterizedType) method.getGenericReturnType()).getActualTypeArguments()[0];
        WildCardBoundedType boundedType = new GenericMetadataSupport.WildCardBoundedType(wildcardType);
        assertNotNull(boundedType);
        assertEquals(wildcardType, boundedType.wildCard());
        assertNotNull(boundedType.firstBound());
        assertEquals(0, boundedType.interfaceBounds().length);
        assertEquals(wildcardType.hashCode(), boundedType.hashCode());
        assertTrue(boundedType.toString().contains("firstBound"));
    }

    @Test
    public void testWildCardBoundedTypeEquals() throws NoSuchMethodException {
        Method method = GenericInterface.class.getMethod("getWildcardLower");
        WildcardType wildcardType1 = (WildcardType) ((ParameterizedType) method.getGenericReturnType()).getActualTypeArguments()[0];
        WildCardBoundedType boundedType1 = new WildCardBoundedType(wildcardType1);
        WildCardBoundedType boundedType2 = new WildCardBoundedType(wildcardType1);
        assertEquals(boundedType1, boundedType2);
        assertEquals(boundedType1.hashCode(), boundedType2.hashCode());
        assertFalse(boundedType1.equals(null));
        assertFalse(boundedType1.equals(new Object()));
    }

    @Test
    public void testNotGenericReturnTypeSupportExtractRawType() throws NoSuchMethodException {
        Method method = SimpleClass.class.getMethod("toString");
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(SimpleClass.class);
        GenericMetadataSupport nonGeneric = support.resolveGenericReturnType(method);
        assertEquals(String.class, nonGeneric.rawType());
        assertEquals(0, nonGeneric.extraInterfaces().size());
        assertEquals(0, nonGeneric.rawExtraInterfaces().length);
        assertFalse(nonGeneric.hasRawExtraInterfaces());
    }

    @Test
    public void testTypeVariableReturnType() throws NoSuchMethodException {
        Method method = TestInterface.class.getMethod("getValue");
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(TestInterface.class);
        GenericMetadataSupport result = support.resolveGenericReturnType(method);
        assertNotNull(result);
    }

    @Test
    public void testParameterizedReturnType() throws NoSuchMethodException {
        Method method = TestInterface.class.getMethod("getList");
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(TestInterface.class);
        GenericMetadataSupport result = support.resolveGenericReturnType(method);
        assertNotNull(result);
    }

    @Test
    public void testFromClassGenericMetadataSupportSuperClass() {
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(TestClass.class);
        assertNotNull(support.rawType());
    }

    @Test
    public void testFromClassWithInterfaces() {
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(TestClass.class);
        assertEquals(TestClass.class, support.rawType());
    }

    @Test
    public void testActualTypeArguments() {
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(TestClass.class);
        Map<TypeVariable, Type> actualArgs = support.actualTypeArguments();
        assertNotNull(actualArgs);
    }

    @Test
    public void testExtractRawTypeOfBoundType() {
        TypeVariable<?>[] typeVariables = MultiBoundClass.class.getTypeParameters();
        TypeVarBoundedType boundedType = new TypeVarBoundedType(typeVariables[0]);
        assertNotNull(boundedType.firstBound());
    }

    @Test
    public void testBoundedTypeInterfaceBoundsWithMultipleBounds() {
        TypeVariable<?>[] typeVariables = MultiBoundClass.class.getTypeParameters();
        TypeVarBoundedType boundedType = new TypeVarBoundedType(typeVariables[0]);
        Type[] interfaceBounds = boundedType.interfaceBounds();
        assertTrue(interfaceBounds.length >= 1);
        for (Type bound : interfaceBounds) {
            assertFalse(bound instanceof Class<?>);
        }
    }

    @Test
    public void testRawExtraInterfaceSupport() {
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(TestClass.class);
        assertFalse(support.hasRawExtraInterfaces());
        assertEquals(0, support.rawExtraInterfaces().length);
    }

    @Test
    public void testInferFromClassWithGenericTypeParameters() {
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(GenericClass.class);
        assertNotNull(support);
        assertEquals(GenericClass.class, support.rawType());
    }

    @Test
    public void testInferFromParameterizedTypeInstance() throws NoSuchMethodException {
        Method method = GenericInterface.class.getMethod("getKey");
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(method.getGenericReturnType());
        if (!(method.getGenericReturnType() instanceof Class)) {
            assertNotNull(support);
        }
    }
}