package com.google.gson.internal;

import static org.junit.Assert.*;
import org.junit.Test;
import java.lang.reflect.*;
import java.util.*;

public class $Gson$TypesTest {

    @Test
    public void testNewParameterizedTypeWithOwner() {
        ParameterizedType type = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        assertEquals(List.class, type.getRawType());
        assertEquals(String.class, type.getActualTypeArguments()[0]);
        assertNull(type.getOwnerType());
    }

    @Test
    public void testNewParameterizedTypeWithOwnerAndOwnerType() {
        ParameterizedType type = $Gson$Types.newParameterizedTypeWithOwner(Map.class, Map.Entry.class, String.class);
        assertEquals(Map.class, type.getOwnerType());
        assertEquals(Map.Entry.class, type.getRawType());
        assertEquals(String.class, type.getActualTypeArguments()[0]);
    }

    @Test
    public void testArrayOf() {
        GenericArrayType type = $Gson$Types.arrayOf(String.class);
        assertEquals(String.class, type.getGenericComponentType());
    }

    @Test
    public void testSubtypeOfWithClass() {
        WildcardType type = $Gson$Types.subtypeOf(String.class);
        assertEquals(String.class, type.getUpperBounds()[0]);
        assertEquals(0, type.getLowerBounds().length);
    }

    @Test
    public void testSubtypeOfWithWildcard() {
        WildcardType wildcard = $Gson$Types.subtypeOf(Number.class);
        WildcardType type = $Gson$Types.subtypeOf(wildcard);
        assertEquals(Number.class, type.getUpperBounds()[0]);
    }

    @Test
    public void testSupertypeOfWithClass() {
        WildcardType type = $Gson$Types.supertypeOf(String.class);
        assertEquals(0, type.getUpperBounds().length);
        assertEquals(String.class, type.getLowerBounds()[0]);
    }

    @Test
    public void testSupertypeOfWithWildcard() {
        WildcardType wildcard = $Gson$Types.supertypeOf(Number.class);
        WildcardType type = $Gson$Types.supertypeOf(wildcard);
        assertEquals(Number.class, type.getLowerBounds()[0]);
    }

    @Test
    public void testCanonicalizeClass() {
        assertEquals(String.class, $Gson$Types.canonicalize(String.class));
    }

    @Test
    public void testCanonicalizeArrayClass() {
        Type type = $Gson$Types.canonicalize(String[].class);
        assertTrue(type instanceof GenericArrayType);
        assertEquals(String.class, ((GenericArrayType) type).getGenericComponentType());
    }

    @Test
    public void testCanonicalizeParameterizedType() {
        ParameterizedType original = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        Type canonical = $Gson$Types.canonicalize(original);
        assertNotSame(original, canonical);
        assertTrue(canonical instanceof ParameterizedType);
        ParameterizedType param = (ParameterizedType) canonical;
        assertEquals(List.class, param.getRawType());
        assertEquals(String.class, param.getActualTypeArguments()[0]);
    }

    @Test
    public void testCanonicalizeGenericArrayType() {
        GenericArrayType original = $Gson$Types.arrayOf(String.class);
        Type canonical = $Gson$Types.canonicalize(original);
        assertNotSame(original, canonical);
        assertTrue(canonical instanceof GenericArrayType);
    }

    @Test
    public void testGetRawTypeClass() {
        assertEquals(String.class, $Gson$Types.getRawType(String.class));
    }

    @Test
    public void testGetRawTypeParameterizedType() {
        ParameterizedType type = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        assertEquals(List.class, $Gson$Types.getRawType(type));
    }

    @Test
    public void testGetRawTypeGenericArrayType() {
        GenericArrayType type = $Gson$Types.arrayOf(String.class);
        assertEquals(String[].class, $Gson$Types.getRawType(type));
    }

    @Test
    public void testGetRawTypeWildcardType() {
        WildcardType type = $Gson$Types.subtypeOf(CharSequence.class);
        assertEquals(CharSequence.class, $Gson$Types.getRawType(type));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRawTypeInvalid() {
        $Gson$Types.getRawType(new TypeVariable<String>() {
            @Override
            public String getName() { return "T"; }
            @Override
            public Type[] getBounds() { return new Type[] { Object.class }; }
            @Override
            public GenericDeclaration getGenericDeclaration() { return null; }
        });
    }

    @Test
    public void testEqualsClass() {
        assertTrue($Gson$Types.equals(String.class, String.class));
        assertFalse($Gson$Types.equals(String.class, Integer.class));
    }

    @Test
    public void testEqualsParameterizedType() {
        ParameterizedType type1 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        ParameterizedType type2 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        assertTrue($Gson$Types.equals(type1, type2));
    }

    @Test
    public void testEqualsParameterizedTypeDifferent() {
        ParameterizedType type1 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        ParameterizedType type2 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, Integer.class);
        assertFalse($Gson$Types.equals(type1, type2));
    }

    @Test
    public void testEqualsGenericArrayType() {
        GenericArrayType type1 = $Gson$Types.arrayOf(String.class);
        GenericArrayType type2 = $Gson$Types.arrayOf(String.class);
        assertTrue($Gson$Types.equals(type1, type2));
    }

    @Test
    public void testEqualsGenericArrayTypeDifferent() {
        GenericArrayType type1 = $Gson$Types.arrayOf(String.class);
        GenericArrayType type2 = $Gson$Types.arrayOf(Integer.class);
        assertFalse($Gson$Types.equals(type1, type2));
    }

    @Test
    public void testEqualsWildcardType() {
        WildcardType type1 = $Gson$Types.subtypeOf(CharSequence.class);
        WildcardType type2 = $Gson$Types.subtypeOf(CharSequence.class);
        assertTrue($Gson$Types.equals(type1, type2));
    }

    @Test
    public void testTypeToStringClass() {
        assertEquals("java.lang.String", $Gson$Types.typeToString(String.class));
    }

    @Test
    public void testTypeToStringNonClass() {
        ParameterizedType type = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        assertNotNull($Gson$Types.typeToString(type));
    }

    @Test
    public void testGetGenericSupertypeInterface() {
        Type result = $Gson$Types.getGenericSupertype(String.class, String.class, Comparable.class);
        assertNotNull(result);
    }

    @Test
    public void testGetSupertypeWithMap() {
        Type[] types = $Gson$Types.getMapKeyAndValueTypes(HashMap.class, HashMap.class);
        assertEquals(2, types.length);
        assertEquals(Object.class, types[0]);
        assertEquals(Object.class, types[1]);
    }

    @Test
    public void testGetMapKeyAndValueTypesWithProperties() {
        Type[] types = $Gson$Types.getMapKeyAndValueTypes(Properties.class, Properties.class);
        assertEquals(String.class, types[0]);
        assertEquals(String.class, types[1]);
    }

    @Test
    public void testGetMapKeyAndValueTypesWithParameterizedMap() {
        Type mapType = $Gson$Types.newParameterizedTypeWithOwner(null, HashMap.class, String.class, Integer.class);
        Type[] types = $Gson$Types.getMapKeyAndValueTypes(mapType, HashMap.class);
        assertEquals(String.class, types[0]);
        assertEquals(Integer.class, types[1]);
    }

    @Test
    public void testGetCollectionElementType() {
        ParameterizedType listType = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        assertEquals(String.class, $Gson$Types.getCollectionElementType(listType, List.class));
    }

    @Test
    public void testResolveTypeVariableWithGenericContext() {
        Type context = $Gson$Types.newParameterizedTypeWithOwner(null, LinkedList.class, String.class);
        TypeVariable<?> typeVariable = LinkedList.class.getTypeParameters()[0];
        assertEquals(String.class, $Gson$Types.resolve(context, LinkedList.class, typeVariable));
    }

    @Test
    public void testParameterizedTypeEqualsDifferentOwner() {
        ParameterizedType type1 = $Gson$Types.newParameterizedTypeWithOwner(Map.class, Map.Entry.class, String.class);
        ParameterizedType type2 = $Gson$Types.newParameterizedTypeWithOwner(null, Map.Entry.class, String.class);
        assertFalse($Gson$Types.equals(type1, type2));
    }

    @Test
    public void testParameterizedTypeToString() {
        ParameterizedType type = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        assertEquals("java.util.List<java.lang.String>", type.toString());
    }

    @Test
    public void testParameterizedTypeToStringMultipleArgs() {
        ParameterizedType type = $Gson$Types.newParameterizedTypeWithOwner(null, Map.class, String.class, Integer.class);
        assertEquals("java.util.Map<java.lang.String, java.lang.Integer>", type.toString());
    }

    @Test
    public void testParameterizedTypeToStringZeroArgs() {
        ParameterizedType type = $Gson$Types.newParameterizedTypeWithOwner(null, String.class);
        assertEquals("class java.lang.String", type.toString());
    }

    @Test
    public void testGetSupertypeWithSubclass() {
        Type result = $Gson$Types.getSupertype(ArrayList.class, ArrayList.class, List.class);
        assertNotNull(result);
    }

    @Test
    public void testResolveParameterizedType() {
        Type context = $Gson$Types.newParameterizedTypeWithOwner(null, ArrayList.class, String.class);
        Type result = $Gson$Types.resolve(context, ArrayList.class, ArrayList.class.getGenericSuperclass());
        assertEquals(String.class, ((ParameterizedType) result).getActualTypeArguments()[0]);
    }

    @Test
    public void testGetArrayComponentTypeClass() {
        assertEquals(String.class, $Gson$Types.getArrayComponentType(String[].class));
    }

    @Test
    public void testGetGenericSupertypeWithClass() {
        Type result = $Gson$Types.getGenericSupertype(String.class, String.class, Comparable.class);
        assertEquals(Comparable.class, result);
    }

    @Test
    public void testGetGenericSupertypeWithParameterizedInterface() {
        ParameterizedType type = $Gson$Types.newParameterizedTypeWithOwner(null, ArrayList.class, String.class);
        Type result = $Gson$Types.getGenericSupertype(type, ArrayList.class, List.class);
        assertEquals(List.class, result);
    }
}

class TypesTestHelper {
    static class SimpleCollection extends AbstractCollection<String> {
        @Override
        public Iterator<String> iterator() { return null; }
        @Override
        public int size() { return 0; }
    }
}

class CustomMap<K, V> extends HashMap<K, V> {
    private static final long serialVersionUID = 1L;
}