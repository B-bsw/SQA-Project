package com.google.gson.internal;

import org.junit.Assert;
import org.junit.Test;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class $Gson$TypesTest {

    private static class NonStaticInner<T> {
    }

    private static class GenericHolder<T> {
        T field;
        List<T> listField;
        T[] arrayField;
    }

    private static class ConcreteHolder extends GenericHolder<String> {
    }

    private static class SubConcreteHolder extends ConcreteHolder {
    }

    private interface CustomStringList extends List<String> {
    }

    private static class CustomStringListImpl implements CustomStringList {
        public int size() { return 0; }
        public boolean isEmpty() { return true; }
        public boolean contains(Object o) { return false; }
        public java.util.Iterator<String> iterator() { return null; }
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
        public int indexOf(Object o) { return -1; }
        public int lastIndexOf(Object o) { return -1; }
        public java.util.ListIterator<String> listIterator() { return null; }
        public java.util.ListIterator<String> listIterator(int index) { return null; }
        public List<String> subList(int fromIndex, int toIndex) { return null; }
    }

    private static class CustomMap extends java.util.HashMap<String, Integer> {
    }

    private static class CustomRawMap extends java.util.HashMap {
    }

    private static class CustomRawList extends java.util.ArrayList {
    }

    private static class UnrelatedType implements Type {
    }

    @Test
    public void constructor_reflectionInvocation_shouldThrowUnsupportedOperationException() throws Exception {
        Constructor<$Gson$Types> constructor = $Gson$Types.class.getDeclaredConstructor(new Class[0]);
        constructor.setAccessible(true);
        try {
            constructor.newInstance(new Object[0]);
            Assert.fail("Expected InvocationTargetException wrapping UnsupportedOperationException");
        } catch (InvocationTargetException e) {
            Assert.assertTrue(e.getCause() instanceof UnsupportedOperationException);
        }
    }

    @Test
    public void newParameterizedTypeWithOwner_givenStaticClassAndNullOwner_shouldInstantiate() {
        ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, new Type[] { String.class });
        Assert.assertNull(pt.getOwnerType());
        Assert.assertEquals(List.class, pt.getRawType());
        Assert.assertEquals(1, pt.getActualTypeArguments().length);
        Assert.assertEquals(String.class, pt.getActualTypeArguments()[0]);
    }

    @Test
    public void newParameterizedTypeWithOwner_givenNonStaticInnerClassAndOwner_shouldInstantiate() {
        ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner($Gson$TypesTest.class, NonStaticInner.class, new Type[] { String.class });
        Assert.assertEquals($Gson$TypesTest.class, pt.getOwnerType());
        Assert.assertEquals(NonStaticInner.class, pt.getRawType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void newParameterizedTypeWithOwner_givenNonStaticInnerClassAndNullOwner_shouldThrowIllegalArgumentException() {
        $Gson$Types.newParameterizedTypeWithOwner(null, NonStaticInner.class, new Type[] { String.class });
    }

    @Test(expected = IllegalArgumentException.class)
    public void newParameterizedTypeWithOwner_givenPrimitiveArgument_shouldThrowIllegalArgumentException() {
        $Gson$Types.newParameterizedTypeWithOwner(null, List.class, new Type[] { int.class });
    }

    @Test(expected = NullPointerException.class)
    public void newParameterizedTypeWithOwner_givenNullArgument_shouldThrowNullPointerException() {
        $Gson$Types.newParameterizedTypeWithOwner(null, List.class, new Type[] { null });
    }

    @Test
    public void arrayOf_givenClassType_shouldCreateGenericArrayType() {
        GenericArrayType arrayType = $Gson$Types.arrayOf(String.class);
        Assert.assertEquals(String.class, arrayType.getGenericComponentType());
    }

    @Test
    public void arrayOf_givenParameterizedType_shouldCreateGenericArrayType() {
        ParameterizedType listType = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, new Type[] { String.class });
        GenericArrayType arrayType = $Gson$Types.arrayOf(listType);
        Assert.assertEquals(listType, arrayType.getGenericComponentType());
    }

    @Test
    public void subtypeOf_givenClassBound_shouldCreateWildcardWithUpperBound() {
        WildcardType wildcard = $Gson$Types.subtypeOf(Number.class);
        Assert.assertEquals(1, wildcard.getUpperBounds().length);
        Assert.assertEquals(Number.class, wildcard.getUpperBounds()[0]);
        Assert.assertEquals(0, wildcard.getLowerBounds().length);
        Assert.assertEquals("? extends java.lang.Number", wildcard.toString());
    }

    @Test
    public void subtypeOf_givenObjectBound_shouldFormatToStringAsQuestionMark() {
        WildcardType wildcard = $Gson$Types.subtypeOf(Object.class);
        Assert.assertEquals("?", wildcard.toString());
    }

    @Test
    public void subtypeOf_givenExistingWildcard_shouldExtractUpperBounds() {
        WildcardType original = $Gson$Types.subtypeOf(Number.class);
        WildcardType wrapped = $Gson$Types.subtypeOf(original);
        Assert.assertEquals(Number.class, wrapped.getUpperBounds()[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void subtypeOf_givenPrimitiveBound_shouldThrowIllegalArgumentException() {
        $Gson$Types.subtypeOf(int.class);
    }

    @Test(expected = NullPointerException.class)
    public void subtypeOf_givenNullBound_shouldThrowNullPointerException() {
        $Gson$Types.subtypeOf(null);
    }

    @Test
    public void supertypeOf_givenClassBound_shouldCreateWildcardWithLowerBound() {
        WildcardType wildcard = $Gson$Types.supertypeOf(Number.class);
        Assert.assertEquals(1, wildcard.getUpperBounds().length);
        Assert.assertEquals(Object.class, wildcard.getUpperBounds()[0]);
        Assert.assertEquals(1, wildcard.getLowerBounds().length);
        Assert.assertEquals(Number.class, wildcard.getLowerBounds()[0]);
        Assert.assertEquals("? super java.lang.Number", wildcard.toString());
    }

    @Test
    public void supertypeOf_givenExistingWildcard_shouldExtractLowerBounds() {
        WildcardType original = $Gson$Types.supertypeOf(Number.class);
        WildcardType wrapped = $Gson$Types.supertypeOf(original);
        Assert.assertEquals(Number.class, wrapped.getLowerBounds()[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void supertypeOf_givenPrimitiveBound_shouldThrowIllegalArgumentException() {
        $Gson$Types.supertypeOf(int.class);
    }

    @Test(expected = NullPointerException.class)
    public void supertypeOf_givenNullBound_shouldThrowNullPointerException() {
        $Gson$Types.supertypeOf(null);
    }

    @Test
    public void canonicalize_givenClassArray_shouldReturnGenericArrayType() {
        Type canonical = $Gson$Types.canonicalize(String[].class);
        Assert.assertTrue(canonical instanceof GenericArrayType);
        Assert.assertEquals(String.class, ((GenericArrayType) canonical).getGenericComponentType());
    }

    @Test
    public void canonicalize_givenClassNonArray_shouldReturnSameClass() {
        Type canonical = $Gson$Types.canonicalize(String.class);
        Assert.assertEquals(String.class, canonical);
    }

    @Test
    public void canonicalize_givenParameterizedType_shouldReturnCanonicalParameterizedType() {
        ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, new Type[] { String.class });
        Type canonical = $Gson$Types.canonicalize(pt);
        Assert.assertEquals(pt, canonical);
    }

    @Test
    public void canonicalize_givenGenericArrayType_shouldReturnGenericArrayType() {
        GenericArrayType gat = $Gson$Types.arrayOf(String.class);
        Type canonical = $Gson$Types.canonicalize(gat);
        Assert.assertEquals(gat, canonical);
    }

    @Test
    public void canonicalize_givenWildcardType_shouldReturnCanonicalWildcard() {
        WildcardType wt = $Gson$Types.subtypeOf(Number.class);
        Type canonical = $Gson$Types.canonicalize(wt);
        Assert.assertEquals(wt, canonical);
    }

    @Test
    public void canonicalize_givenCustomType_shouldReturnSameInstance() {
        Type custom = new UnrelatedType();
        Type canonical = $Gson$Types.canonicalize(custom);
        Assert.assertSame(custom, canonical);
    }

    @Test
    public void getRawType_givenClass_shouldReturnSameClass() {
        Class<?> clazz = $Gson$Types.getRawType(String.class);
        Assert.assertEquals(String.class, clazz);
    }

    @Test
    public void getRawType_givenParameterizedType_shouldReturnRawClass() {
        ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, new Type[] { String.class });
        Class<?> clazz = $Gson$Types.getRawType(pt);
        Assert.assertEquals(List.class, clazz);
    }

    @Test
    public void getRawType_givenGenericArrayType_shouldReturnArrayClass() {
        GenericArrayType gat = $Gson$Types.arrayOf(String.class);
        Class<?> clazz = $Gson$Types.getRawType(gat);
        Assert.assertEquals(String[].class, clazz);
    }

    @Test
    public void getRawType_givenTypeVariable_shouldReturnObjectClass() throws Exception {
        Field field = GenericHolder.class.getDeclaredField("field");
        TypeVariable<?> tv = (TypeVariable<?>) field.getGenericType();
        Class<?> clazz = $Gson$Types.getRawType(tv);
        Assert.assertEquals(Object.class, clazz);
    }

    @Test
    public void getRawType_givenWildcardType_shouldReturnUpperBoundRawClass() {
        WildcardType wt = $Gson$Types.subtypeOf(Number.class);
        Class<?> clazz = $Gson$Types.getRawType(wt);
        Assert.assertEquals(Number.class, clazz);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getRawType_givenNull_shouldThrowIllegalArgumentException() {
        $Gson$Types.getRawType(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getRawType_givenUnsupportedType_shouldThrowIllegalArgumentException() {
        $Gson$Types.getRawType(new UnrelatedType());
    }

    @Test
    public void equal_givenVariousScenarios_shouldCheckEqualityAccurately() {
        Assert.assertTrue($Gson$Types.equal(null, null));
        Assert.assertTrue($Gson$Types.equal("test", "test"));
        Assert.assertFalse($Gson$Types.equal("test", null));
        Assert.assertFalse($Gson$Types.equal(null, "test"));
        Assert.assertFalse($Gson$Types.equal("test", "other"));
    }

    @Test
    public void equals_givenSameInstance_shouldReturnTrue() {
        ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, new Type[] { String.class });
        Assert.assertTrue($Gson$Types.equals(pt, pt));
    }

    @Test
    public void equals_givenNullComparisons_shouldReturnExpected() {
        Assert.assertFalse($Gson$Types.equals(String.class, null));
        Assert.assertFalse($Gson$Types.equals(null, String.class));
        Assert.assertTrue($Gson$Types.equals((Type) null, (Type) null));
    }

    @Test
    public void equals_givenDifferentKindsOfTypes_shouldReturnFalse() {
        ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, new Type[] { String.class });
        GenericArrayType gat = $Gson$Types.arrayOf(String.class);
        WildcardType wt = $Gson$Types.subtypeOf(String.class);

        Assert.assertFalse($Gson$Types.equals(pt, gat));
        Assert.assertFalse($Gson$Types.equals(pt, wt));
        Assert.assertFalse($Gson$Types.equals(gat, wt));
        Assert.assertFalse($Gson$Types.equals(pt, String.class));
        Assert.assertFalse($Gson$Types.equals(new UnrelatedType(), new UnrelatedType()));
    }

    @Test
    public void equals_givenParameterizedTypes_shouldMatchProperly() {
        ParameterizedType pt1 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, new Type[] { String.class });
        ParameterizedType pt2 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, new Type[] { String.class });
        ParameterizedType pt3 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, new Type[] { Integer.class });
        ParameterizedType pt4 = $Gson$Types.newParameterizedTypeWithOwner(null, Set.class, new Type[] { String.class });
        ParameterizedType ptOwner = $Gson$Types.newParameterizedTypeWithOwner(String.class, List.class, new Type[] { String.class });

        Assert.assertTrue($Gson$Types.equals(pt1, pt2));
        Assert.assertFalse($Gson$Types.equals(pt1, pt3));
        Assert.assertFalse($Gson$Types.equals(pt1, pt4));
        Assert.assertFalse($Gson$Types.equals(pt1, ptOwner));
    }

    @Test
    public void equals_givenGenericArrayTypes_shouldMatchProperly() {
        GenericArrayType gat1 = $Gson$Types.arrayOf(String.class);
        GenericArrayType gat2 = $Gson$Types.arrayOf(String.class);
        GenericArrayType gat3 = $Gson$Types.arrayOf(Integer.class);

        Assert.assertTrue($Gson$Types.equals(gat1, gat2));
        Assert.assertFalse($Gson$Types.equals(gat1, gat3));
        Assert.assertFalse($Gson$Types.equals(gat1, String.class));
    }

    @Test
    public void equals_givenWildcardTypes_shouldMatchProperly() {
        WildcardType wt1 = $Gson$Types.subtypeOf(Number.class);
        WildcardType wt2 = $Gson$Types.subtypeOf(Number.class);
        WildcardType wt3 = $Gson$Types.subtypeOf(Integer.class);
        WildcardType wt4 = $Gson$Types.supertypeOf(Number.class);
        WildcardType wt5 = $Gson$Types.supertypeOf(Number.class);

        Assert.assertTrue($Gson$Types.equals(wt1, wt2));
        Assert.assertFalse($Gson$Types.equals(wt1, wt3));
        Assert.assertFalse($Gson$Types.equals(wt1, wt4));
        Assert.assertTrue($Gson$Types.equals(wt4, wt5));
    }

    @Test
    public void equals_givenTypeVariables_shouldMatchProperly() throws Exception {
        Field field1 = GenericHolder.class.getDeclaredField("field");
        Field field2 = GenericHolder.class.getDeclaredField("arrayField");
        TypeVariable<?> tv1 = (TypeVariable<?>) field1.getGenericType();
        TypeVariable<?> tv2 = (TypeVariable<?>) ((GenericArrayType) field2.getGenericType()).getGenericComponentType();

        Assert.assertTrue($Gson$Types.equals(tv1, tv2));
        Assert.assertFalse($Gson$Types.equals(tv1, String.class));
    }

    @Test
    public void hashCodeOrZero_givenNullAndNonNull_shouldReturnConsistentValues() {
        Assert.assertEquals(0, $Gson$Types.hashCodeOrZero(null));
        Assert.assertEquals("abc".hashCode(), $Gson$Types.hashCodeOrZero("abc"));
    }

    @Test
    public void typeToString_givenClassAndGenericTypes_shouldReturnStringFormat() {
        Assert.assertEquals(String.class.getName(), $Gson$Types.typeToString(String.class));
        ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, new Type[] { String.class });
        Assert.assertEquals(pt.toString(), $Gson$Types.typeToString(pt));
    }

    @Test
    public void getGenericSupertype_givenExactMatch_shouldReturnContext() {
        Type result = $Gson$Types.getGenericSupertype(String.class, String.class, String.class);
        Assert.assertEquals(String.class, result);
    }

    @Test
    public void getGenericSupertype_givenSuperclassHierarchy_shouldTraverseHierarchy() {
        Type result = $Gson$Types.getGenericSupertype(ConcreteHolder.class, ConcreteHolder.class, GenericHolder.class);
        Assert.assertTrue(result instanceof ParameterizedType);
        ParameterizedType pt = (ParameterizedType) result;
        Assert.assertEquals(GenericHolder.class, pt.getRawType());
        Assert.assertEquals(String.class, pt.getActualTypeArguments()[0]);
    }

    @Test
    public void getGenericSupertype_givenTransitiveSuperclass_shouldResolve() {
        Type result = $Gson$Types.getGenericSupertype(SubConcreteHolder.class, SubConcreteHolder.class, GenericHolder.class);
        Assert.assertTrue(result instanceof ParameterizedType);
        ParameterizedType pt = (ParameterizedType) result;
        Assert.assertEquals(String.class, pt.getActualTypeArguments()[0]);
    }

    @Test
    public void getGenericSupertype_givenInterfaceHierarchy_shouldResolveInterface() {
        Type result = $Gson$Types.getGenericSupertype(CustomStringListImpl.class, CustomStringListImpl.class, Collection.class);
        Assert.assertTrue(result instanceof ParameterizedType);
        ParameterizedType pt = (ParameterizedType) result;
        Assert.assertEquals(Collection.class, pt.getRawType());
    }

    @Test
    public void getGenericSupertype_givenUnrelatedClass_shouldReturnToResolve() {
        Type result = $Gson$Types.getGenericSupertype(String.class, String.class, List.class);
        Assert.assertEquals(List.class, result);
    }

    @Test
    public void getArrayComponentType_givenGenericArrayAndClassArray_shouldExtractComponent() {
        Assert.assertEquals(String.class, $Gson$Types.getArrayComponentType(String[].class));
        GenericArrayType gat = $Gson$Types.arrayOf(Integer.class);
        Assert.assertEquals(Integer.class, $Gson$Types.getArrayComponentType(gat));
    }

    @Test
    public void getCollectionElementType_givenWildcardCollection_shouldExtractElementType() {
        ParameterizedType collectionOfWildcard = $Gson$Types.newParameterizedTypeWithOwner(null, Collection.class, new Type[] { String.class });
        WildcardType wildcardCollection = $Gson$Types.subtypeOf(collectionOfWildcard);
        Type elementType = $Gson$Types.getCollectionElementType(wildcardCollection, Collection.class);
        Assert.assertEquals(String.class, elementType);
    }

    @Test
    public void getCollectionElementType_givenRawList_shouldReturnObject() {
        Type elementType = $Gson$Types.getCollectionElementType(CustomRawList.class, CustomRawList.class);
        Assert.assertEquals(Object.class, elementType);
    }

    @Test
    public void getMapKeyAndValueTypes_givenProperties_shouldReturnStringTypes() {
        Type[] kv = $Gson$Types.getMapKeyAndValueTypes(Properties.class, Properties.class);
        Assert.assertEquals(2, kv.length);
        Assert.assertEquals(String.class, kv[0]);
        Assert.assertEquals(String.class, kv[1]);
    }

    @Test
    public void getMapKeyAndValueTypes_givenParameterizedMap_shouldReturnKeyAndValueTypes() {
        Type[] kv = $Gson$Types.getMapKeyAndValueTypes(CustomMap.class, CustomMap.class);
        Assert.assertEquals(2, kv.length);
        Assert.assertEquals(String.class, kv[0]);
        Assert.assertEquals(Integer.class, kv[1]);
    }

    @Test
    public void getMapKeyAndValueTypes_givenRawMap_shouldReturnObjectTypes() {
        Type[] kv = $Gson$Types.getMapKeyAndValueTypes(CustomRawMap.class, CustomRawMap.class);
        Assert.assertEquals(2, kv.length);
        Assert.assertEquals(Object.class, kv[0]);
        Assert.assertEquals(Object.class, kv[1]);
    }

    @Test
    public void resolve_givenGenericArrayType_shouldResolveComponentType() throws Exception {
        Field field = GenericHolder.class.getDeclaredField("arrayField");
        Type resolved = $Gson$Types.resolve(ConcreteHolder.class, ConcreteHolder.class, field.getGenericType());
        Assert.assertTrue(resolved instanceof GenericArrayType);
        Assert.assertEquals(String.class, ((GenericArrayType) resolved).getGenericComponentType());
    }

    @Test
    public void resolve_givenClassArrayContainingTypeVariable_shouldReturnResolvedArray() throws Exception {
        Type toResolve = String[].class;
        Type resolved = $Gson$Types.resolve(ConcreteHolder.class, ConcreteHolder.class, toResolve);
        Assert.assertSame(toResolve, resolved);
    }

    @Test
    public void resolve_givenParameterizedTypeContainingTypeVariable_shouldResolve() throws Exception {
        Field field = GenericHolder.class.getDeclaredField("listField");
        Type resolved = $Gson$Types.resolve(ConcreteHolder.class, ConcreteHolder.class, field.getGenericType());
        Assert.assertTrue(resolved instanceof ParameterizedType);
        ParameterizedType pt = (ParameterizedType) resolved;
        Assert.assertEquals(String.class, pt.getActualTypeArguments()[0]);
    }

    @Test
    public void resolve_givenParameterizedTypeWithNoTypeVariable_shouldReturnSameInstance() {
        ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, new Type[] { String.class });
        Type resolved = $Gson$Types.resolve(Object.class, Object.class, pt);
        Assert.assertSame(pt, resolved);
    }

    @Test
    public void resolve_givenWildcardWithUpperBoundTypeVariable_shouldResolve() throws Exception {
        Field field = GenericHolder.class.getDeclaredField("field");
        WildcardType wt = $Gson$Types.subtypeOf(field.getGenericType());
        Type resolved = $Gson$Types.resolve(ConcreteHolder.class, ConcreteHolder.class, wt);
        Assert.assertTrue(resolved instanceof WildcardType);
        Assert.assertEquals(String.class, ((WildcardType) resolved).getUpperBounds()[0]);
    }

    @Test
    public void resolve_givenWildcardWithLowerBoundTypeVariable_shouldResolve() throws Exception {
        Field field = GenericHolder.class.getDeclaredField("field");
        WildcardType wt = $Gson$Types.supertypeOf(field.getGenericType());
        Type resolved = $Gson$Types.resolve(ConcreteHolder.class, ConcreteHolder.class, wt);
        Assert.assertTrue(resolved instanceof WildcardType);
        Assert.assertEquals(String.class, ((WildcardType) resolved).getLowerBounds()[0]);
    }

    @Test
    public void resolve_givenWildcardWithoutChange_shouldReturnSameWildcard() {
        WildcardType wtUpper = $Gson$Types.subtypeOf(String.class);
        Assert.assertSame(wtUpper, $Gson$Types.resolve(Object.class, Object.class, wtUpper));

        WildcardType wtLower = $Gson$Types.supertypeOf(String.class);
        Assert.assertSame(wtLower, $Gson$Types.resolve(Object.class, Object.class, wtLower));
    }

    @Test
    public void resolve_givenUnresolvableTypeVariable_shouldReturnSameTypeVariable() throws Exception {
        Field field = GenericHolder.class.getDeclaredField("field");
        TypeVariable<?> tv = (TypeVariable<?>) field.getGenericType();
        Type resolved = $Gson$Types.resolve(Object.class, Object.class, tv);
        Assert.assertSame(tv, resolved);
    }

    @Test
    public void resolve_givenMethodTypeVariable_shouldReturnSameTypeVariable() throws Exception {
        Method method = CustomStringListImpl.class.getDeclaredMethod("toArray", new Class[] { Object[].class });
        TypeVariable<?> tv = method.getTypeParameters()[0];
        Type resolved = $Gson$Types.resolve(Object.class, Object.class, tv);
        Assert.assertSame(tv, resolved);
    }

    @Test
    public void parameterizedTypeImpl_equalsAndHashCode_shouldBehaveConsistently() {
        ParameterizedType pt1 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, new Type[] { String.class });
        ParameterizedType pt2 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, new Type[] { String.class });
        ParameterizedType pt3 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, new Type[] { Integer.class });

        Assert.assertTrue(pt1.equals(pt1));
        Assert.assertTrue(pt1.equals(pt2));
        Assert.assertFalse(pt1.equals(pt3));
        Assert.assertFalse(pt1.equals(null));
        Assert.assertFalse(pt1.equals("string"));
        Assert.assertEquals(pt1.hashCode(), pt2.hashCode());
    }

    @Test
    public void parameterizedTypeImpl_toString_shouldIncludeOwnerAndTypeArguments() {
        ParameterizedType ptNoArgs = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, new Type[0]);
        Assert.assertEquals(List.class.getName(), ptNoArgs.toString());

        ParameterizedType ptMultipleArgs = $Gson$Types.newParameterizedTypeWithOwner(null, Map.class, new Type[] { String.class, Integer.class });
        Assert.assertEquals(Map.class.getName() + "<java.lang.String, java.lang.Integer>", ptMultipleArgs.toString());
    }

    @Test
    public void genericArrayTypeImpl_equalsAndHashCodeAndToString_shouldBehaveConsistently() {
        GenericArrayType gat1 = $Gson$Types.arrayOf(String.class);
        GenericArrayType gat2 = $Gson$Types.arrayOf(String.class);
        GenericArrayType gat3 = $Gson$Types.arrayOf(Integer.class);

        Assert.assertTrue(gat1.equals(gat1));
        Assert.assertTrue(gat1.equals(gat2));
        Assert.assertFalse(gat1.equals(gat3));
        Assert.assertFalse(gat1.equals(null));
        Assert.assertFalse(gat1.equals("string"));
        Assert.assertEquals(gat1.hashCode(), gat2.hashCode());
        Assert.assertEquals(String.class.getName() + "[]", gat1.toString());
    }

    @Test
    public void wildcardTypeImpl_equalsAndHashCode_shouldBehaveConsistently() {
        WildcardType wt1 = $Gson$Types.subtypeOf(Number.class);
        WildcardType wt2 = $Gson$Types.subtypeOf(Number.class);
        WildcardType wt3 = $Gson$Types.supertypeOf(Number.class);
        WildcardType wt4 = $Gson$Types.supertypeOf(Number.class);

        Assert.assertTrue(wt1.equals(wt1));
        Assert.assertTrue(wt1.equals(wt2));
        Assert.assertTrue(wt3.equals(wt4));
        Assert.assertFalse(wt1.equals(wt3));
        Assert.assertFalse(wt1.equals(null));
        Assert.assertFalse(wt1.equals("string"));
        Assert.assertEquals(wt1.hashCode(), wt2.hashCode());
        Assert.assertEquals(wt3.hashCode(), wt4.hashCode());
    }
}