package com.google.gson.internal;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import java.lang.reflect.*;
import java.util.*;

public class $Gson$TypesTest {

    private static class GenericClass<T> {}
    private static class StringGenericClass extends GenericClass<String> {}
    private static class PropertyClass extends Properties {}
    private static class StringListClass implements List<String> {
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
        public boolean addAll(int index, Collection<? extends String> c) { return false; }
        public boolean removeAll(Collection<?> c) { return false; }
        public boolean retainAll(Collection<?> c) { return false; }
        public void clear() {}
        public String get(int index) { return null; }
        public String set(int index, String element) { return null; }
        public void add(int index, String element) {}
        public String remove(int index) { return null; }
        public int indexOf(Object o) { return 0; }
        public int lastIndexOf(Object o) { return 0; }
        public ListIterator<String> listIterator() { return null; }
        public ListIterator<String> listIterator(int index) { return null; }
        public List<String> subList(int fromIndex, int toIndex) { return null; }
    }

    private static class RawTypeClass {
        String field;
    }

    private static class ParameterizedTypeString {
        List<String> list;
    }

    @Before
    public void setUp() {}

    @After
    public void tearDown() {}

    @Test
    public void testNewParameterizedTypeWithOwner_NoOwner() {
        ParameterizedType type = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        assertNull(type.getOwnerType());
        assertEquals(List.class, type.getRawType());
        assertEquals(1, type.getActualTypeArguments().length);
        assertEquals(String.class, type.getActualTypeArguments()[0]);
    }

    @Test
    public void testNewParameterizedTypeWithOwner_WithOwner() {
        ParameterizedType type = $Gson$Types.newParameterizedTypeWithOwner(
            Map.class, Map.Entry.class, String.class, Integer.class);
        assertEquals(Map.class, type.getOwnerType());
        assertEquals(Map.Entry.class, type.getRawType());
        assertEquals(2, type.getActualTypeArguments().length);
    }

    @Test
    public void testArrayOf() {
        GenericArrayType arrayType = $Gson$Types.arrayOf(String.class);
        assertEquals(String.class, arrayType.getGenericComponentType());
    }

    @Test
    public void testArrayOf_NestedArray() {
        GenericArrayType arrayType = $Gson$Types.arrayOf($Gson$Types.arrayOf(String.class));
        assertNotNull(arrayType.getGenericComponentType());
        assertTrue(arrayType.getGenericComponentType() instanceof GenericArrayType);
    }

    @Test
    public void testSubtypeOf_WildcardInput() {
        WildcardType upper = new WildcardTypeImpl(new Type[]{Number.class}, new Type[]{});
        WildcardType wildcard = (WildcardType) $Gson$Types.subtypeOf(upper);
        assertEquals(1, wildcard.getUpperBounds().length);
        assertEquals(Number.class, wildcard.getUpperBounds()[0]);
        assertEquals(0, wildcard.getLowerBounds().length);
    }

    @Test
    public void testSubtypeOf_ClassInput() {
        WildcardType wildcard = (WildcardType) $Gson$Types.subtypeOf(String.class);
        assertEquals(String.class, wildcard.getUpperBounds()[0]);
    }

    @Test
    public void testSupertypeOf_WildcardInput() {
        WildcardType lower = new WildcardTypeImpl(new Type[]{Object.class}, new Type[]{Number.class});
        WildcardType wildcard = (WildcardType) $Gson$Types.supertypeOf(lower);
        assertEquals(Object.class, wildcard.getUpperBounds()[0]);
        assertEquals(1, wildcard.getLowerBounds().length);
        assertEquals(Number.class, wildcard.getLowerBounds()[0]);
    }

    @Test
    public void testSupertypeOf_ClassInput() {
        WildcardType wildcard = (WildcardType) $Gson$Types.supertypeOf(String.class);
        assertTrue(wildcard.getLowerBounds().length > 0);
        assertEquals(String.class, wildcard.getLowerBounds()[0]);
    }

    @Test
    public void testCanonicalize_Class() {
        assertEquals(String.class, $Gson$Types.canonicalize(String.class));
    }

    @Test
    public void testCanonicalize_ArrayClass() {
        Type type = $Gson$Types.canonicalize(String[].class);
        assertTrue(type instanceof GenericArrayType);
        assertEquals(String.class, ((GenericArrayType) type).getGenericComponentType());
    }

    @Test
    public void testCanonicalize_ParameterizedType() {
        ParameterizedType input = new ParameterizedTypeImpl(null, List.class, String.class);
        Type result = $Gson$Types.canonicalize(input);
        assertTrue(result instanceof ParameterizedType);
        assertEquals(List.class, ((ParameterizedType) result).getRawType());
    }

    @Test
    public void testCanonicalize_UnchangedType() {
        Type input = String.class;
        Type result = $Gson$Types.canonicalize(input);
        assertSame(input, result);
    }

    @Test
    public void testGetRawType_Class() {
        assertEquals(String.class, $Gson$Types.getRawType(String.class));
    }

    @Test
    public void testGetRawType_ParameterizedType() {
        ParameterizedType type = new ParameterizedTypeImpl(null, List.class, String.class);
        assertEquals(List.class, $Gson$Types.getRawType(type));
    }

    @Test
    public void testGetRawType_GenericArrayType() {
        GenericArrayType arrayType = $Gson$Types.arrayOf(String.class);
        assertEquals(String[].class, $Gson$Types.getRawType(arrayType));
    }

    @Test
    public void testGetRawType_WildcardWithUpperBound() {
        WildcardType wildcard = new WildcardTypeImpl(new Type[]{Number.class}, new Type[]{});
        assertEquals(Number.class, $Gson$Types.getRawType(wildcard));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRawType_InvalidType() {
        $Gson$Types.getRawType(new TypeVariable<String>() {
            public String getName() { return "T"; }
            public Type[] getBounds() { return new Type[]{Object.class}; }
            public GenericDeclaration getGenericDeclaration() { return null; }
        });
    }

    @Test
    public void testEquals_SameReference() {
        assertTrue($Gson$Types.equals(String.class, String.class));
    }

    @Test
    public void testEquals_NullFirstArg() {
        assertFalse($Gson$Types.equals(null, String.class));
    }

    @Test
    public void testEquals_ClassEquality() {
        assertTrue($Gson$Types.equals(String.class, String.class));
    }

    @Test
    public void testEquals_ParameterizedTypeEqual() {
        ParameterizedType a = new ParameterizedTypeImpl(null, List.class, String.class);
        ParameterizedType b = new ParameterizedTypeImpl(null, ArrayList.class, String.class);
        assertFalse($Gson$Types.equals(a, b));
    }

    @Test
    public void testEquals_ParameterizedTypeSame() {
        ParameterizedType a = new ParameterizedTypeImpl(null, List.class, String.class);
        ParameterizedType aCopy = new ParameterizedTypeImpl(null, List.class, String.class);
        assertTrue($Gson$Types.equals(a, aCopy));
    }

    @Test
    public void testEquals_GenericArrayTypeEqual() {
        GenericArrayType a = $Gson$Types.arrayOf(String.class);
        GenericArrayType b = $Gson$Types.arrayOf(String.class);
        assertTrue($Gson$Types.equals(a, b));
    }

    @Test
    public void testEquals_GenericArrayTypeNotEqual() {
        GenericArrayType a = $Gson$Types.arrayOf(String.class);
        GenericArrayType b = $Gson$Types.arrayOf(Integer.class);
        assertFalse($Gson$Types.equals(a, b));
    }

    @Test
    public void testTypeToString_Class() {
        assertEquals("java.lang.String", $Gson$Types.typeToString(String.class));
    }

    @Test
    public void testTypeToString_ParameterizedType() {
        ParameterizedType type = new ParameterizedTypeImpl(null, List.class, String.class);
        assertEquals("java.util.List<java.lang.String>", $Gson$Types.typeToString(type));
    }

    @Test
    public void testGetSupertype_DirectSuperclass() {
        Type result = $Gson$Types.getGenericSupertype(StringGenericClass.class, StringGenericClass.class, GenericClass.class);
        assertNotNull(result);
    }

    @Test
    public void testGetSupertype_Interface() {
        Type result = $Gson$Types.getSupertype(StringListClass.class, StringListClass.class, List.class);
        assertTrue(result instanceof ParameterizedType);
        assertEquals(String.class, ((ParameterizedType) result).getActualTypeArguments()[0]);
    }

    @Test
    public void testGetArrayComponentType_GenericArray() {
        GenericArrayType arrayType = $Gson$Types.arrayOf(String.class);
        assertEquals(String.class, $Gson$Types.getArrayComponentType(arrayType));
    }

    @Test
    public void testGetCollectionElementType_List() {
        Type collectionType = new ParameterizedTypeImpl(null, List.class, String.class);
        assertEquals(String.class, $Gson$Types.getCollectionElementType(collectionType, List.class));
    }

    @Test
    public void testGetCollectionElementType_NonParameterized() {
        assertEquals(Object.class, $Gson$Types.getCollectionElementType(Collection.class, Collection.class));
    }

    @Test
    public void testGetMapKeyAndValueTypes_PropertyClass() {
        Type[] result = $Gson$Types.getMapKeyAndValueTypes(Properties.class, Properties.class);
        assertEquals(2, result.length);
        assertEquals(String.class, result[0]);
        assertEquals(String.class, result[1]);
    }

    @Test
    public void testGetMapKeyAndValueTypes_RegularMap() {
        ParameterizedType mapType = new ParameterizedTypeImpl(null, Map.class, Integer.class, String.class);
        Type[] result = $Gson$Types.getMapKeyAndValueTypes(mapType, Map.class);
        assertEquals(2, result.length);
        assertEquals(Integer.class, result[0]);
        assertEquals(String.class, result[1]);
    }

    @Test
    public void testResolve_SameType() {
        Type result = $Gson$Types.resolve(String.class, String.class, String.class);
        assertEquals(String.class, result);
    }

    @Test
    public void testResolve_TypeVariable() {
        class MyClass<T> {
            Type resolveType() {
                return $Gson$Types.resolve(MyClass.class, MyClass.class, 
                    ((ParameterizedType) MyClass.class.getGenericSuperclass()).getActualTypeArguments()[0]);
            }
        }
    }

    @Test
    public void testParameterizedTypeImpl_GetActualTypeArguments() {
        ParameterizedType type = new ParameterizedTypeImpl(null, List.class, String.class);
        assertArrayEquals(new Type[]{String.class}, type.getActualTypeArguments());
    }

    @Test
    public void testWildcardTypeImpl_GetUpperBounds() {
        WildcardType wildcard = new WildcardTypeImpl(new Type[]{String.class}, new Type[]{});
        assertArrayEquals(new Type[]{String.class}, wildcard.getUpperBounds());
    }

    @Test
    public void testWildcardTypeImpl_GetLowerBounds() {
        WildcardType wildcard = new WildcardTypeImpl(new Type[]{Object.class}, new Type[]{String.class});
        assertArrayEquals(new Type[]{String.class}, wildcard.getLowerBounds());
    }

    @Test
    public void testWildcardTypeImpl_ToString() {
        WildcardType wildcard = new WildcardTypeImpl(new Type[]{Object.class}, new Type[]{});
        assertEquals("?", wildcard.toString());
    }

    @Test
    public void testGenericArrayTypeImpl_ToString() {
        GenericArrayType arrayType = new GenericArrayTypeImpl(String.class);
        assertEquals("java.lang.String[]", arrayType.toString());
    }

    @Test
    public void testParameterizedTypeImpl_ToString_EmptyArgs() {
        ParameterizedType type = new ParameterizedTypeImpl(null, List.class);
        assertNotNull(type.toString());
    }

    @Test
    public void testResolve_ClassArray() throws Exception {
        Type resolved = $Gson$Types.resolve(GenericClass.class, GenericClass.class, 
            String[].class);
        assertNotNull(resolved);
    }

    @Test
    public void testGetSupertype_NonInterface() {
        Type result = $Gson$Types.getSupertype(StringGenericClass.class, StringGenericClass.class, GenericClass.class);
        assertNotNull(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSupertype_Primitive() {
        $Gson$Types.getSupertype(int.class, int.class, Integer.class);
    }

    @Test
    public void testHashCode_Null() {
        assertEquals(0, $Gson$Types.hashCodeOrZero(null));
    }
}