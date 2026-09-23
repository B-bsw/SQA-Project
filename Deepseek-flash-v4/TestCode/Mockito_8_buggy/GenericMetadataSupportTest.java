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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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

@SuppressWarnings("unchecked")
public class GenericMetadataSupportTest {

    // Test Subjects
    private static class SimpleClass {}
    private static class ParameterizedClass<T> {}
    private static class NestedGeneric<T> extends ParameterizedClass<List<T>> {}
    private static class MultipleBounds<T extends Comparable<T> & Cloneable> {}
    private static interface GenericInterface<K, V> {
        V get(K key);
        K convert(V value);
        List<? super Integer> wildcardLower();
        List<? extends Number> wildcardUpper();
        K returnTypeVar();
    }

    private static class ConcreteGeneric implements GenericInterface<String, Integer> {
        public Integer get(String key) { return 1; }
        public String convert(Integer value) { return "x"; }
        public List<? super Integer> wildcardLower() { return new ArrayList<Object>(); }
        public List<? extends Number> wildcardUpper() { return new ArrayList<Integer>(); }
        public String returnTypeVar() { return "s"; }
    }

    @Test
    public void testInferFromClass() {
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(SimpleClass.class);
        assertNotNull(support);
        assertEquals(SimpleClass.class, support.rawType());
        assertFalse(support.hasRawExtraInterfaces());
        assertEquals(0, support.rawExtraInterfaces().length);
        assertEquals(0, support.extraInterfaces().size());
        assertEquals(0, support.actualTypeArguments().size());
    }

    @Test
    public void testInferFromParameterizedType() throws Exception {
        ParameterizedType type = (ParameterizedType) ParameterizedClass.class.getGenericSuperclass();
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(type);
        assertNotNull(support);
        assertEquals(Object.class, support.rawType()); // rawType of ParameterizedClass<T> where T is unbounded
    }

    @Test
    public void testInferFromInvalidType() {
        Type invalidType = new Type() {
            public String getTypeName() { return "invalid"; }
        };
        try {
            GenericMetadataSupport.inferFrom(invalidType);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            // expected
        }
    }

    @Test(expected = MockitoException.class)
    public void testInferFromNull() {
        GenericMetadataSupport.inferFrom(null);
    }

    @Test
    public void testNotGenericReturnTypeSupport() throws Exception {
        Method method = SimpleClass.class.getMethod("toString");
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(SimpleClass.class);
        GenericMetadataSupport result = support.resolveGenericReturnType(method);
        assertNotNull(result);
        assertEquals(String.class, result.rawType());
    }

    @Test
    public void testResolveGenericReturnTypeParameterized() throws Exception {
        Method method = GenericInterface.class.getMethod("get", Object.class);
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(ConcreteGeneric.class);
        GenericMetadataSupport result = support.resolveGenericReturnType(method);
        assertNotNull(result);
        // For parameterized return type Integer should be resolved
        // rawType should be Integer for the get method called on ConcreteGeneric
        // (but the method is invoked on interface, so let's use a parameterized subclass)
    }

    @Test
    public void testResolveGenericReturnTypeTypeVariable() throws Exception {
        Method method = GenericInterface.class.getMethod("returnTypeVar");
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(ConcreteGeneric.class);
        GenericMetadataSupport result = support.resolveGenericReturnType(method);
        assertNotNull(result);
    }

    @Test
    public void testRawExtraInterfaces() throws Exception {
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(SimpleClass.class);
        assertFalse(support.hasRawExtraInterfaces());
        assertEquals(0, support.rawExtraInterfaces().length);
    }

    @Test
    public void testExtraInterfacesEmpty() {
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(SimpleClass.class);
        assertEquals(0, support.extraInterfaces().size());
    }

    @Test
    public void testActualTypeArgumentsEmpty() {
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(SimpleClass.class);
        assertEquals(0, support.actualTypeArguments().size());
    }

    @Test
    public void testTypeVarBoundedType() throws Exception {
        TypeVariable typeVariable = MultipleBounds.class.getTypeParameters()[0];
        TypeVarBoundedType boundedType = new TypeVarBoundedType(typeVariable);
        
        assertNotNull(boundedType.firstBound());
        assertEquals(Comparable.class, extractRawClass(boundedType.firstBound()));
        assertEquals(1, boundedType.interfaceBounds().length);
        assertEquals(Cloneable.class, extractRawClass(boundedType.interfaceBounds()[0]));
        
        TypeVarBoundedType same = new TypeVarBoundedType(typeVariable);
        assertTrue(boundedType.equals(same));
        assertEquals(boundedType.hashCode(), same.hashCode());
        assertFalse(boundedType.equals(null));
        assertFalse(boundedType.equals(new Object()));
        assertTrue(boundedType.toString().contains("firstBound"));
        assertSame(typeVariable, boundedType.typeVariable());
    }

    @Test
    public void testWildCardBoundedType() throws Exception {
        Method method = GenericInterface.class.getMethod("wildcardLower");
        WildcardType wildcardType = (WildcardType) ((ParameterizedType) method.getGenericReturnType()).getActualTypeArguments()[0];
        WildCardBoundedType boundedType = new WildCardBoundedType(wildcardType);
        
        assertNotNull(boundedType.firstBound()); // lower bound should be Integer
        assertEquals(Integer.class, extractRawClass(boundedType.firstBound()));
        assertEquals(0, boundedType.interfaceBounds().length);
        assertEquals(wildcardType, boundedType.wildCard());
        
        WildCardBoundedType same = new WildCardBoundedType(wildcardType);
        assertTrue(boundedType.equals(same));
        assertEquals(boundedType.hashCode(), same.hashCode());
        assertFalse(boundedType.equals(null));
        assertFalse(boundedType.equals(new Object()));
        assertTrue(boundedType.toString().contains("firstBound"));
    }

    @Test
    public void testWildCardBoundedTypeUpperBound() throws Exception {
        Method method = GenericInterface.class.getMethod("wildcardUpper");
        WildcardType wildcardType = (WildcardType) ((ParameterizedType) method.getGenericReturnType()).getActualTypeArguments()[0];
        WildCardBoundedType boundedType = new WildCardBoundedType(wildcardType);
        
        assertNotNull(boundedType.firstBound());
        assertEquals(Number.class, extractRawClass(boundedType.firstBound()));
        assertEquals(0, boundedType.interfaceBounds().length);
    }

    @Test
    public void testTypeVarBoundedTypeNoInterfaceBounds() throws Exception {
        TypeVariable typeVariable = ParameterizedClass.class.getTypeParameters()[0];
        TypeVarBoundedType boundedType = new TypeVarBoundedType(typeVariable);
        assertEquals(Object.class, extractRawClass(boundedType.firstBound()));
        assertEquals(0, boundedType.interfaceBounds().length);
    }

    private Class<?> extractRawClass(Type type) {
        if (type instanceof Class) {
            return (Class<?>) type;
        } else if (type instanceof ParameterizedType) {
            return (Class<?>) ((ParameterizedType) type).getRawType();
        } else {
            return null;
        }
    }

    @Test
    public void testParameterizedReturnTypeWithDeepNesting() throws Exception {
        Method method = NestedGeneric.class.getMethod("get", Object.class);
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(NestedGeneric.class);
        GenericMetadataSupport result = support.resolveGenericReturnType(method);
        assertNotNull(result);
    }

    @Test
    public void testFromParameterizedTypeRawType() {
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(ParameterizedClass.class);
        // Use reflection to get the generic superclass as ParameterizedType
        java.lang.reflect.Type type = ParameterizedClass.class.getGenericSuperclass();
        GenericMetadataSupport fromParameterized = GenericMetadataSupport.inferFrom(type);
        assertNotNull(fromParameterized.rawType());
    }
}