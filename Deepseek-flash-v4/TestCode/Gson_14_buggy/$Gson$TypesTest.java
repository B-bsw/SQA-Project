package com.google.gson.internal;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.lang.reflect.*;
import java.util.*;

public class $Gson$TypesTest {
    private static class SimpleClass {}
    private static class GenericClass<T> {}
    private static class MultiGeneric<T, U> {}
    private static class SubGeneric<T> extends GenericClass<T> {}
    private static class StringCollection implements Collection<String> {
        public int size() { return 0; }
        public boolean isEmpty() { return true; }
        public boolean contains(Object o) { return false; }
        public Iterator<String> iterator() { return null; }
        public Object[] toArray() { return new Object[0]; }
        public <T> T[] toArray(T[] a) { return a; }
        public boolean add(String e) { return false; }
        public boolean remove(Object o) { return false; }
        public boolean containsAll(Collection<?> c) { return false; }
        public boolean addAll(Collection<? extends String> c) { return false; }
        public boolean removeAll(Collection<?> c) { return false; }
        public boolean retainAll(Collection<?> c) { return false; }
        public void clear() {}
    }
    private static class StringMap implements Map<String, Integer> {
        public int size() { return 0; }
        public boolean isEmpty() { return true; }
        public boolean containsKey(Object key) { return false; }
        public boolean containsValue(Object value) { return false; }
        public Integer get(Object key) { return null; }
        public Integer put(String key, Integer value) { return null; }
        public Integer remove(Object key) { return null; }
        public void putAll(Map<? extends String, ? extends Integer> m) {}
        public void clear() {}
        public Set<String> keySet() { return null; }
        public Collection<Integer> values() { return null; }
        public Set<Entry<String, Integer>> entrySet() { return null; }
    }
    private static class GenericSub extends GenericClass<String> {}
    private static class TypeVarSub<T> extends GenericClass<T> {}

    @Before
    public void setUp() {}

    @After
    public void tearDown() {}

    @Test
    public void testPrivateConstructorThrows() {
        try {
            new $Gson$Types();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {}
    }

    @Test
    public void testNewParameterizedTypeWithOwner() {
        ParameterizedType type = $Gson$Types.newParameterizedTypeWithOwner(
            GenericClass.class, String.class, Integer.class);
        assertNotNull(type);
        assertEquals(GenericClass.class, type.getRawType());
        assertEquals(String.class, type.getOwnerType());
        assertEquals(2, type.getActualTypeArguments().length);
    }

    @Test
    public void testNewParameterizedTypeWithNullOwnerAndEmptyArgs() {
        ParameterizedType type = $Gson$Types.newParameterizedTypeWithOwner(
            null, String.class);
        assertNotNull(type);
        assertNull(type.getOwnerType());
        assertEquals(0, type.getActualTypeArguments().length);
    }

    @Test
    public void testArrayOf() {
        GenericArrayType arrayType = $Gson$Types.arrayOf(String.class);
        assertNotNull(arrayType);
        assertEquals(String.class, arrayType.getGenericComponentType());
    }

    @Test
    public void testSubtypeOf() {
        WildcardType wildcard = $Gson$Types.subtypeOf(Number.class);
        assertNotNull(wildcard);
        assertEquals(1, wildcard.getUpperBounds().length);
        assertEquals(Number.class, wildcard.getUpperBounds()[0]);
        assertEquals(0, wildcard.getLowerBounds().length);
    }

    @Test
    public void testSubtypeOfObject() {
        WildcardType wildcard = $Gson$Types.subtypeOf(Object.class);
        assertNotNull(wildcard);
        assertEquals(1, wildcard.getUpperBounds().length);
        assertEquals(Object.class, wildcard.getUpperBounds()[0]);
    }

    @Test
    public void testSupertypeOf() {
        WildcardType wildcard = $Gson$Types.supertypeOf(String.class);
        assertNotNull(wildcard);
        assertEquals(0, wildcard.getUpperBounds().length);
        assertEquals(1, wildcard.getLowerBounds().length);
        assertEquals(String.class, wildcard.getLowerBounds()[0]);
    }

    @Test
    public void testCanonicalizeClass() {
        Type result = $Gson$Types.canonicalize(String.class);
        assertEquals(String.class, result);
    }

    @Test
    public void testCanonicalizeArrayClass() {
        Type result = $Gson$Types.canonicalize(String[].class);
        assertTrue(result instanceof GenericArrayType);
        assertEquals(String.class, ((GenericArrayType) result).getGenericComponentType());
    }

    @Test
    public void testCanonicalizeParameterizedType() {
        ParameterizedType original = $Gson$Types.newParameterizedTypeWithOwner(
            null, StringCollection.class, String.class);
        Type result = $Gson$Types.canonicalize(original);
        assertTrue(result instanceof ParameterizedType);
        assertNotSame(original, result);
    }

    @Test
    public void testCanonicalizeGenericArray() {
        GenericArrayType original = $Gson$Types.arrayOf(String.class);
        Type result = $Gson$Types.canonicalize(original);
        assertTrue(result instanceof GenericArrayType);
    }

    @Test
    public void testCanonicalizeWildcard() {
        WildcardType original = $Gson$Types.subtypeOf(Number.class);
        Type result = $Gson$Types.canonicalize(original);
        assertTrue(result instanceof WildcardType);
    }

    @Test
    public void testCanonicalizeUnsupported() {
        TypeVariable<?> tv = new TypeVariableImpl();
        Type result = $Gson$Types.canonicalize(tv);
        assertSame(tv, result);
    }

    @Test
    public void testGetRawTypeClass() {
        assertEquals(String.class, $Gson$Types.getRawType(String.class));
    }

    @Test
    public void testGetRawTypeParameterized() {
        ParameterizedType type = $Gson$Types.newParameterizedTypeWithOwner(null, ArrayList.class);
        assertEquals(ArrayList.class, $Gson$Types.getRawType(type));
    }

    @Test
    public void testGetRawTypeGenericArray() {
        GenericArrayType arrayType = $Gson$Types.arrayOf(String.class);
        assertTrue($Gson$Types.getRawType(arrayType).isArray());
    }

    @Test
    public void testGetRawTypeTypeVariable() {
        TypeVariable<?> tv = new TypeVariableImpl();
        assertEquals(Object.class, $Gson$Types.getRawType(tv));
    }

    @Test
    public void testGetRawTypeWildcard() {
        WildcardType wildcard = $Gson$Types.subtypeOf(String.class);
        assertEquals(String.class, $Gson$Types.getRawType(wildcard));
    }

    @Test
    public void testEqualsSameObject() {
        assertTrue($Gson$Types.equals(String.class, String.class));
    }

    @Test
    public void testEqualsNullAndDifferent() {
        assertFalse($Gson$Types.equals(null, String.class));
        assertFalse($Gson$Types.equals(String.class, null));
        assertFalse($Gson$Types.equals(String.class, Integer.class));
    }

    @Test
    public void testEqualsClassTypes() {
        assertTrue($Gson$Types.equals(String.class, String.class));
        assertFalse($Gson$Types.equals(String.class, Integer.class));
    }

    @Test
    public void testEqualsParameterizedTypes() {
        ParameterizedType t1 = $Gson$Types.newParameterizedTypeWithOwner(null, ArrayList.class, String.class);
        ParameterizedType t2 = $Gson$Types.newParameterizedTypeWithOwner(null, ArrayList.class, String.class);
        assertTrue($Gson$Types.equals(t1, t2));
        ParameterizedType t3 = $Gson$Types.newParameterizedTypeWithOwner(null, ArrayList.class, Integer.class);
        assertFalse($Gson$Types.equals(t1, t3));
    }

    @Test
    public void testEqualsDifferentTypeKinds() {
        GenericArrayType arrayType = $Gson$Types.arrayOf(String.class);
        ParameterizedType paramType = $Gson$Types.newParameterizedTypeWithOwner(null, ArrayList.class);
        assertFalse($Gson$Types.equals(arrayType, paramType));
        assertFalse($Gson$Types.equals(arrayType, String.class));
    }

    @Test
    public void testEqualsWildcardTypes() {
        WildcardType w1 = $Gson$Types.subtypeOf(Number.class);
        WildcardType w2 = $Gson$Types.subtypeOf(Number.class);
        assertTrue($Gson$Types.equals(w1, w2));
        WildcardType w3 = $Gson$Types.subtypeOf(String.class);
        assertFalse($Gson$Types.equals(w1, w3));
    }

    @Test
    public void testTypeToStringClass() {
        assertEquals(String.class.getName(), $Gson$Types.typeToString(String.class));
    }

    @Test
    public void testTypeToStringNonClass() {
        ParameterizedType type = $Gson$Types.newParameterizedTypeWithOwner(null, ArrayList.class);
        assertEquals(type.toString(), $Gson$Types.typeToString(type));
    }

    @Test
    public void testGetSupertypeWhenSameClass() {
        Type result = $Gson$Types.getSupertype(String.class, String.class, String.class);
        assertEquals(String.class, result);
    }

    @Test
    public void testGetSupertypeInterface() {
        Type result = $Gson$Types.getSupertype(StringCollection.class, StringCollection.class, Collection.class);
        assertTrue(result instanceof ParameterizedType);
    }

    @Test
    public void testGetSupertypeClassHierarchy() {
        Type result = $Gson$Types.getSupertype(GenericSub.class, GenericSub.class, GenericClass.class);
        assertTrue(result instanceof ParameterizedType);
    }

    @Test
    public void testGetArrayComponentTypeGeneric() {
        GenericArrayType arrayType = $Gson$Types.arrayOf(String.class);
        assertEquals(String.class, $Gson$Types.getArrayComponentType(arrayType));
    }

    @Test
    public void testGetArrayComponentTypeClass() {
        assertEquals(String.class, $Gson$Types.getArrayComponentType(String[].class));
    }

    @Test
    public void testGetCollectionElementTypeParameterized() {
        ParameterizedType collectionType = $Gson$Types.newParameterizedTypeWithOwner(
            null, StringCollection.class, String.class);
        Function<Type, Type> context = new Function<Type, Type>() {
            public Type apply(Type t) { return t; }
        };
        assertEquals(String.class, $Gson$Types.getCollectionElementType(collectionType, StringCollection.class));
    }

    @Test
    public void testGetMapKeyAndValueTypesProperties() {
        Type[] result = $Gson$Types.getMapKeyAndValueTypes(Properties.class, Properties.class);
        assertEquals(String.class, result[0]);
        assertEquals(String.class, result[1]);
    }

    @Test
    public void testGetMapKeyAndValueTypesParameterizedMap() {
        ParameterizedType mapType = $Gson$Types.newParameterizedTypeWithOwner(
            null, StringMap.class, String.class, Integer.class);
        Type[] result = $Gson$Types.getMapKeyAndValueTypes(mapType, StringMap.class);
        assertEquals(2, result.length);
    }

    @Test
    public void testResolveTypeVariable() throws Exception {
        TypeVariable<?> tv = new TypeVariableImpl();
        Type resolved = $Gson$Types.resolve(GenericClass.class, GenericClass.class, tv);
        assertNotNull(resolved);
    }

    @Test
    public void testResolveArrayClass() {
        Type resolved = $Gson$Types.resolve(GenericSub.class, GenericSub.class, String[].class);
        assertEquals(String[].class, resolved);
    }

    @Test
    public void testResolveGenericArray() {
        GenericArrayType arrayType = $Gson$Types.arrayOf(String.class);
        Type resolved = $Gson$Types.resolve(GenericSub.class, GenericSub.class, arrayType);
        assertNotNull(resolved);
    }

    @Test
    public void testResolveParameterizedType() {
        ParameterizedType paramType = $Gson$Types.newParameterizedTypeWithOwner(
            null, SubGeneric.class, String.class);
        Type resolved = $Gson$Types.resolve(GenericSub.class, GenericSub.class, paramType);
        assertNotNull(resolved);
    }

    @Test
    public void testResolveWildcardType() {
        WildcardType wildcard = $Gson$Types.subtypeOf(String.class);
        Type resolved = $Gson$Types.resolve(GenericSub.class, GenericSub.class, wildcard);
        assertNotNull(resolved);
    }

    @Test
    public void testParameterizedTypeImplEquals() {
        ParameterizedType t1 = $Gson$Types.newParameterizedTypeWithOwner(null, ArrayList.class, String.class);
        ParameterizedType t2 = new $Gson$Types.ParameterizedTypeImpl(null, ArrayList.class, new Type[]{String.class});
        assertEquals(t1, t2);
    }

    @Test
    public void testParameterizedTypeImplHashCode() {
        ParameterizedType t1 = $Gson$Types.newParameterizedTypeWithOwner(null, ArrayList.class, String.class);
        ParameterizedType t2 = new $Gson$Types.ParameterizedTypeImpl(null, ArrayList.class, new Type[]{String.class});
        assertEquals(t1.hashCode(), t2.hashCode());
    }

    @Test
    public void testParameterizedTypeImplToString() {
        ParameterizedType t = $Gson$Types.newParameterizedTypeWithOwner(null, ArrayList.class, String.class);
        assertNotNull(t.toString());
    }

    @Test
    public void testParameterizedTypeImplToStringEmptyArgs() {
        ParameterizedType t = $Gson$Types.newParameterizedTypeWithOwner(null, ArrayList.class);
        String result = t.toString();
        assertNotNull(result);
    }

    @Test
    public void testGenericArrayTypeImplEquals() {
        GenericArrayType g1 = $Gson$Types.arrayOf(String.class);
        GenericArrayType g2 = new $Gson$Types.GenericArrayTypeImpl(String.class);
        assertEquals(g1, g2);
    }

    @Test
    public void testGenericArrayTypeImplHashCode() {
        GenericArrayType g1 = $Gson$Types.arrayOf(String.class);
        GenericArrayType g2 = new $Gson$Types.GenericArrayTypeImpl(String.class);
        assertEquals(g1.hashCode(), g2.hashCode());
    }

    @Test
    public void testGenericArrayTypeImplToString() {
        GenericArrayType g = $Gson$Types.arrayOf(String.class);
        assertNotNull(g.toString());
    }

    @Test
    public void testWildcardTypeImplToString() {
        WildcardType w = $Gson$Types.subtypeOf(Number.class);
        assertNotNull(w.toString());
    }

    @Test
    public void testWildcardTypeImplToStringObjectUpperBound() {
        WildcardType w = $Gson$Types.supertypeOf(String.class);
        assertNotNull(w.toString());
    }

    @Test
    public void testWildcardTypeImplToStringWithLowerBound() {
        WildcardType w = $Gson$Types.supertypeOf(String.class);
        String result = w.toString();
        assertTrue(result.contains("? super"));
    }

    @Test
    public void testWildcardTypeImplToStringWildcard() {
        WildcardType w = $Gson$Types.subtypeOf(Object.class);
        String result = w.toString();
        assertEquals("?", result);
    }

    @Test
    public void testWildcardTypeImplEquals() {
        WildcardType w1 = $Gson$Types.supertypeOf(String.class);
        WildcardType w2 = new $Gson$Types.WildcardTypeImpl(new Type[]{Object.class}, new Type[]{String.class});
        assertTrue($Gson$Types.equals(w1, w2));
    }

    @Test
    public void testWildcardTypeImplNotEqualsDifferentKind() {
        WildcardType w = $Gson$Types.subtypeOf(String.class);
        assertFalse(w.equals(String.class));
    }

    @Test
    public void testWildcardTypeImplHashCode() {
        WildcardType w1 = $Gson$Types.supertypeOf(String.class);
        WildcardType w2 = new $Gson$Types.WildcardTypeImpl(new Type[]{Object.class}, new Type[]{String.class});
        assertEquals(w1.hashCode(), w2.hashCode());
    }

    @Test
    public void testGetSupertypeGenericClassHierarchy() {
        Type result = $Gson$Types.getSupertype(GenericSub.class, GenericSub.class, Object.class);
        assertNotNull(result);
    }

    @Test
    public void testResolveTypeWithPrimitiveClass() {
        Type resolved = $Gson$Types.resolve(GenericSub.class, GenericSub.class, int.class);
        assertEquals(int.class, resolved);
    }

    @Test
    public void testResolveTypeComponentTypeClass() {
        Type resolved = $Gson$Types.resolve(GenericSub.class, GenericSub.class, Integer[].class);
        assertEquals(Integer[].class, resolved);
    }

    @Test
    public void testGetRawTypeWithWildcardMultipleUpperBounds() {
        WildcardType wildcard = $Gson$Types.subtypeOf(Number.class);
        Type result = $Gson$Types.getRawType(wildcard);
        assertNotNull(result);
    }

    @Test
    public void testEqualsMultipleBounds() {
        WildcardType w1 = $Gson$Types.supertypeOf(Number.class);
        WildcardType w2 = new $Gson$Types.WildcardTypeImpl(new Type[]{Object.class}, new Type[]{Number.class});
        assertTrue($Gson$Types.equals(w1, w2));
    }

    @Test
    public void testTypeToStringGetNameClass() {
        assertEquals("java.lang.String", $Gson$Types.typeToString(String.class));
    }

    @Test
    public void testParameterizedTypeImplOwnerType() {
        ParameterizedType p1 = $Gson$Types.newParameterizedTypeWithOwner(String.class, StringCollection.class);
        ParameterizedType p2 = $Gson$Types.newParameterizedTypeWithOwner(Integer.class, StringCollection.class);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testWildcardTypeImplGetUpperBoundsMultiple() {
        WildcardType w = $Gson$Types.supertypeOf(String.class);
        Type[] bounds = w.getUpperBounds();
        assertEquals(1, bounds.length);
        assertEquals(Object.class, bounds[0]);
    }

    @Test
    public void testWildcardTypeImplGetLowerBoundsLength() {
        WildcardType w = $Gson$Types.supertypeOf(String.class);
        Type[] bounds = w.getLowerBounds();
        assertEquals(1, bounds.length);
        assertEquals(String.class, bounds[0]);
    }

    private static class TypeVariableImpl<T> implements TypeVariable<T> {
        public T[] getBounds() { return null; }
        public String getName() { return "T"; }
        public GenericDeclaration getGenericDeclaration() { return null; }
        public boolean isSynthetic() { return false; }
        public String getTypeName() { return "T"; }
    }

    private interface Function<F, T> {
        T apply(F input);
    }
}