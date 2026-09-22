package com.google.gson.internal;

import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Unit tests for {@link $Gson$Types}.
 * Fully compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class $Gson$TypesTest {

    // Helper classes for testing type resolution and inheritance
    private static class GenericSuper<T> {
        T field;
    }

    private static class SubString extends GenericSuper<String> {
    }

    private static class GenericTwo<K, V> {
    }

    private static class SubTwo<V> extends GenericTwo<Number, V> {
    }

    @Test
    public void constructor_givenPrivateAccess_shouldThrowUnsupportedOperationException() throws Exception {
        // Arrange
        Constructor<$Gson$Types> constructor = $Gson$Types.class.getDeclaredConstructor();
        constructor.setAccessible(true);

        // Act & Assert
        try {
            constructor.newInstance();
            fail("Expected InvocationTargetException wrapping UnsupportedOperationException");
        } catch (InvocationTargetException e) {
            assertTrue(e.getCause() instanceof UnsupportedOperationException);
        }
    }

    @Test
    public void newParameterizedTypeWithOwner_givenValidArguments_shouldCreateParameterizedType() {
        // Arrange
        Type rawType = List.class;
        Type arg = String.class;

        // Act
        ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, rawType, arg);

        // Assert
        assertNotNull(pt);
        assertNull(pt.getOwnerType());
        assertEquals(rawType, pt.getRawType());
        assertArrayEquals(new Type[] { arg }, pt.getActualTypeArguments());
    }

    @Test
    public void newParameterizedTypeWithOwner_givenOwnerType_shouldRetainOwner() {
        // Arrange
        Type owner = Map.class;
        Type rawType = Map.Entry.class;
        Type keyArg = String.class;
        Type valArg = Integer.class;

        // Act
        ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(owner, rawType, keyArg, valArg);

        // Assert
        assertNotNull(pt);
        assertEquals(owner, pt.getOwnerType());
        assertEquals(rawType, pt.getRawType());
        assertArrayEquals(new Type[] { keyArg, valArg }, pt.getActualTypeArguments());
    }

    @Test(expected = IllegalArgumentException.class)
    public void newParameterizedTypeWithOwner_givenPrimitiveTypeArgument_shouldThrowIllegalArgumentException() {
        // Arrange & Act
        $Gson$Types.newParameterizedTypeWithOwner(null, List.class, int.class);
    }

    @Test
    public void arrayOf_givenComponentType_shouldCreateGenericArrayType() {
        // Arrange
        Type componentType = String.class;

        // Act
        GenericArrayType arrayType = $Gson$Types.arrayOf(componentType);

        // Assert
        assertNotNull(arrayType);
        assertEquals(componentType, arrayType.getGenericComponentType());
        assertEquals("java.lang.String[]", arrayType.toString());
    }

    @Test
    public void subtypeOf_givenBound_shouldCreateWildcardTypeWithUpperBounds() {
        // Arrange
        Type bound = CharSequence.class;

        // Act
        WildcardType wildcard = $Gson$Types.subtypeOf(bound);

        // Assert
        assertNotNull(wildcard);
        assertArrayEquals(new Type[] { CharSequence.class }, wildcard.getUpperBounds());
        assertArrayEquals(new Type[0], wildcard.getLowerBounds());
        assertEquals("? extends java.lang.CharSequence", wildcard.toString());
    }

    @Test
    public void subtypeOf_givenObjectBound_shouldPrintSingleQuestionMark() {
        // Arrange
        Type bound = Object.class;

        // Act
        WildcardType wildcard = $Gson$Types.subtypeOf(bound);

        // Assert
        assertEquals("?", wildcard.toString());
    }

    @Test
    public void subtypeOf_givenExistingWildcard_shouldUnwrapUpperBounds() {
        // Arrange
        WildcardType existing = $Gson$Types.subtypeOf(Number.class);

        // Act
        WildcardType result = $Gson$Types.subtypeOf(existing);

        // Assert
        assertArrayEquals(new Type[] { Number.class }, result.getUpperBounds());
    }

    @Test
    public void supertypeOf_givenBound_shouldCreateWildcardTypeWithLowerBounds() {
        // Arrange
        Type bound = String.class;

        // Act
        WildcardType wildcard = $Gson$Types.supertypeOf(bound);

        // Assert
        assertNotNull(wildcard);
        assertArrayEquals(new Type[] { Object.class }, wildcard.getUpperBounds());
        assertArrayEquals(new Type[] { String.class }, wildcard.getLowerBounds());
        assertEquals("? super java.lang.String", wildcard.toString());
    }

    @Test
    public void supertypeOf_givenExistingWildcard_shouldUnwrapLowerBounds() {
        // Arrange
        WildcardType existing = $Gson$Types.supertypeOf(Integer.class);

        // Act
        WildcardType result = $Gson$Types.supertypeOf(existing);

        // Assert
        assertArrayEquals(new Type[] { Integer.class }, result.getLowerBounds());
    }

    @Test
    public void canonicalize_givenDifferentTypes_shouldCanonicalizeProperly() {
        // Arrange
        Type classType = String.class;
        Type arrayType = String[].class;
        ParameterizedType paramType = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        GenericArrayType genArrayType = $Gson$Types.arrayOf(paramType);
        WildcardType wildcard = $Gson$Types.subtypeOf(Number.class);

        // Act & Assert
        assertEquals(classType, $Gson$Types.canonicalize(classType));
        assertTrue($Gson$Types.canonicalize(arrayType) instanceof GenericArrayType);
        assertEquals(paramType, $Gson$Types.canonicalize(paramType));
        assertEquals(genArrayType, $Gson$Types.canonicalize(genArrayType));
        assertEquals(wildcard, $Gson$Types.canonicalize(wildcard));
    }

    @Test
    public void getRawType_givenClass_shouldReturnClass() {
        // Arrange & Act
        Class<?> raw = $Gson$Types.getRawType(String.class);

        // Assert
        assertEquals(String.class, raw);
    }

    @Test
    public void getRawType_givenParameterizedType_shouldReturnRawClass() {
        // Arrange
        ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);

        // Act
        Class<?> raw = $Gson$Types.getRawType(pt);

        // Assert
        assertEquals(List.class, raw);
    }

    @Test
    public void getRawType_givenGenericArrayType_shouldReturnArrayClass() {
        // Arrange
        GenericArrayType gat = $Gson$Types.arrayOf(String.class);

        // Act
        Class<?> raw = $Gson$Types.getRawType(gat);

        // Assert
        assertEquals(String[].class, raw);
    }

    @Test
    public void getRawType_givenWildcardType_shouldReturnUpperBoundRawClass() {
        // Arrange
        WildcardType wt = $Gson$Types.subtypeOf(Number.class);

        // Act
        Class<?> raw = $Gson$Types.getRawType(wt);

        // Assert
        assertEquals(Number.class, raw);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getRawType_givenNull_shouldThrowIllegalArgumentException() {
        // Arrange & Act
        $Gson$Types.getRawType(null);
    }

    @Test
    public void equals_givenIdenticalAndDifferentTypes_shouldReturnCorrectBoolean() {
        // Arrange
        Type t1 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        Type t2 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        Type t3 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, Integer.class);
        Type t4 = $Gson$Types.newParameterizedTypeWithOwner(null, Set.class, String.class);

        // Act & Assert
        assertTrue($Gson$Types.equals(t1, t1));
        assertTrue($Gson$Types.equals(t1, t2));
        assertTrue($Gson$Types.equals(t2, t1));
        assertFalse($Gson$Types.equals(t1, t3));
        assertFalse($Gson$Types.equals(t1, t4));
        assertFalse($Gson$Types.equals(t1, null));
        assertFalse($Gson$Types.equals(null, t1));
        assertTrue($Gson$Types.equals(null, null));
    }

    @Test
    public void equals_givenGenericArrayTypes_shouldCompareProperly() {
        // Arrange
        GenericArrayType gat1 = $Gson$Types.arrayOf(String.class);
        GenericArrayType gat2 = $Gson$Types.arrayOf(String.class);
        GenericArrayType gat3 = $Gson$Types.arrayOf(Integer.class);

        // Act & Assert
        assertTrue($Gson$Types.equals(gat1, gat2));
        assertFalse($Gson$Types.equals(gat1, gat3));
        assertFalse($Gson$Types.equals(gat1, String[].class));
    }

    @Test
    public void equals_givenWildcardTypes_shouldCompareProperly() {
        // Arrange
        WildcardType w1 = $Gson$Types.subtypeOf(Number.class);
        WildcardType w2 = $Gson$Types.subtypeOf(Number.class);
        WildcardType w3 = $Gson$Types.supertypeOf(Number.class);

        // Act & Assert
        assertTrue($Gson$Types.equals(w1, w2));
        assertFalse($Gson$Types.equals(w1, w3));
    }

    @Test
    public void typeToString_givenClassAndTypes_shouldReturnFormattedString() {
        // Arrange
        Type classType = String.class;
        ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);

        // Act & Assert
        assertEquals("java.lang.String", $Gson$Types.typeToString(classType));
        assertEquals("java.util.List<java.lang.String>", $Gson$Types.typeToString(pt));
    }

    @Test
    public void getArrayComponentType_givenClassArrayAndGenericArray_shouldReturnComponent() {
        // Arrange
        Type stringArrayClass = String[].class;
        GenericArrayType genericArray = $Gson$Types.arrayOf(Integer.class);

        // Act
        Type c1 = $Gson$Types.getArrayComponentType(stringArrayClass);
        Type c2 = $Gson$Types.getArrayComponentType(genericArray);

        // Assert
        assertEquals(String.class, c1);
        assertEquals(Integer.class, c2);
    }

    @Test
    public void getCollectionElementType_givenListAndCollectionSubclass_shouldExtractType() {
        // Arrange
        Type stringList = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        Type rawList = List.class;

        // Act
        Type elem1 = $Gson$Types.getCollectionElementType(stringList, List.class);
        Type elem2 = $Gson$Types.getCollectionElementType(rawList, List.class);

        // Assert
        assertEquals(String.class, elem1);
        assertEquals(Object.class, elem2);
    }

    @Test
    public void getMapKeyAndValueTypes_givenMapAndProperties_shouldExtractKeyAndValueTypes() {
        // Arrange
        Type mapType = $Gson$Types.newParameterizedTypeWithOwner(null, Map.class, String.class, Integer.class);

        // Act
        Type[] mapTypes = $Gson$Types.getMapKeyAndValueTypes(mapType, Map.class);
        Type[] propTypes = $Gson$Types.getMapKeyAndValueTypes(Properties.class, Properties.class);
        Type[] rawMapTypes = $Gson$Types.getMapKeyAndValueTypes(Map.class, Map.class);

        // Assert
        assertArrayEquals(new Type[] { String.class, Integer.class }, mapTypes);
        assertArrayEquals(new Type[] { String.class, String.class }, propTypes);
        assertArrayEquals(new Type[] { Object.class, Object.class }, rawMapTypes);
    }

    @Test
    public void resolve_givenSubclassWithTypeArgument_shouldResolveTypeVariable() throws Exception {
        // Arrange
        Type fieldType = GenericSuper.class.getDeclaredField("field").getGenericType();

        // Act
        Type resolved = $Gson$Types.resolve(SubString.class, SubString.class, fieldType);

        // Assert
        assertEquals(String.class, resolved);
    }

    @Test
    public void resolve_givenGenericArrayComponent_shouldResolveComponent() throws Exception {
        // Arrange
        Type fieldType = GenericSuper.class.getDeclaredField("field").getGenericType();
        GenericArrayType arrayType = $Gson$Types.arrayOf(fieldType);

        // Act
        Type resolved = $Gson$Types.resolve(SubString.class, SubString.class, arrayType);

        // Assert
        assertTrue(resolved instanceof GenericArrayType);
        assertEquals(String.class, ((GenericArrayType) resolved).getGenericComponentType());
    }

    @Test
    public void resolve_givenWildcardType_shouldResolveBounds() throws Exception {
        // Arrange
        Type fieldType = GenericSuper.class.getDeclaredField("field").getGenericType();
        WildcardType wildcardType = $Gson$Types.subtypeOf(fieldType);

        // Act
        Type resolved = $Gson$Types.resolve(SubString.class, SubString.class, wildcardType);

        // Assert
        assertTrue(resolved instanceof WildcardType);
        assertArrayEquals(new Type[] { String.class }, ((WildcardType) resolved).getUpperBounds());
    }

    @Test
    public void parameterizedTypeImpl_equalsAndHashCode_shouldBeConsistent() {
        // Arrange
        ParameterizedType pt1 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        ParameterizedType pt2 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);

        // Act & Assert
        assertEquals(pt1, pt2);
        assertEquals(pt1.hashCode(), pt2.hashCode());
        assertEquals("java.util.List<java.lang.String>", pt1.toString());
    }

    @Test
    public void genericArrayTypeImpl_equalsAndHashCode_shouldBeConsistent() {
        // Arrange
        GenericArrayType gat1 = $Gson$Types.arrayOf(String.class);
        GenericArrayType gat2 = $Gson$Types.arrayOf(String.class);

        // Act & Assert
        assertEquals(gat1, gat2);
        assertEquals(gat1.hashCode(), gat2.hashCode());
        assertEquals("java.lang.String[]", gat1.toString());
    }

    @Test
    public void wildcardTypeImpl_equalsAndHashCode_shouldBeConsistent() {
        // Arrange
        WildcardType w1 = $Gson$Types.subtypeOf(Number.class);
        WildcardType w2 = $Gson$Types.subtypeOf(Number.class);

        // Act & Assert
        assertEquals(w1, w2);
        assertEquals(w1.hashCode(), w2.hashCode());
    }
}
