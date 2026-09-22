package org.apache.commons.lang3.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class TypeUtilsTest<T extends Number & Serializable> {

    // Test fields for extracting reflection Types
    List<String> listString;
    List<Number> listNumber;
    List<Integer> listInteger;
    List<? extends Number> listExtendsNumber;
    List<? extends Integer> listExtendsInteger;
    List<? super Number> listSuperNumber;
    List<? super Integer> listSuperInteger;
    List<?> listWildcard;
    List<String>[] genericArrayOfListString;
    T[] genericArrayOfT;
    String[] stringArray;
    Integer[] integerArray;
    Object[] objectArray;
    int[] primitiveIntArray;
    List rawList;
    Map<String, Integer> mapStringInteger;

    // Hierarchy classes for complex inheritance testing
    interface BaseInterface<E> {}
    interface SubInterface<E> extends BaseInterface<E> {}
    static class GrandParentClass<G> {}
    static class ParentClass<P> extends GrandParentClass<P> implements SubInterface<P> {}
    static class ChildClass extends ParentClass<String> {}
    static class GenericChildClass<C> extends ParentClass<List<C>> {}
    static class NonGenericClass {}

    // Dummy custom Type for throwing IllegalStateException branches
    static class UnknownType implements Type {}

    private static class StubParameterizedType implements ParameterizedType {
        private final Type rawType;
        private final Type ownerType;
        private final Type[] actualTypeArguments;

        StubParameterizedType(Type rawType, Type ownerType, Type[] actualTypeArguments) {
            this.rawType = rawType;
            this.ownerType = ownerType;
            this.actualTypeArguments = actualTypeArguments;
        }

        public Type[] getActualTypeArguments() {
            return actualTypeArguments;
        }

        public Type getRawType() {
            return rawType;
        }

        public Type getOwnerType() {
            return ownerType;
        }
    }

    private static class StubGenericArrayType implements GenericArrayType {
        private final Type componentType;

        StubGenericArrayType(Type componentType) {
            this.componentType = componentType;
        }

        public Type getGenericComponentType() {
            return componentType;
        }
    }

    private static class StubWildcardType implements WildcardType {
        private final Type[] upperBounds;
        private final Type[] lowerBounds;

        StubWildcardType(Type[] upperBounds, Type[] lowerBounds) {
            this.upperBounds = upperBounds != null ? upperBounds : new Type[0];
            this.lowerBounds = lowerBounds != null ? lowerBounds : new Type[0];
        }

        public Type[] getUpperBounds() {
            return upperBounds;
        }

        public Type[] getLowerBounds() {
            return lowerBounds;
        }
    }

    private Type getFieldType(String fieldName) throws NoSuchFieldException {
        return getClass().getDeclaredField(fieldName).getGenericType();
    }

    private WildcardType getWildcardArgument(String fieldName) throws NoSuchFieldException {
        ParameterizedType pt = (ParameterizedType) getFieldType(fieldName);
        return (WildcardType) pt.getActualTypeArguments()[0];
    }

    @Test
    public void constructor_shouldInstantiateSuccessfully() {
        TypeUtils utils = new TypeUtils();
        Assert.assertNotNull(utils);
    }

    @Test
    public void isAssignable_nullAndPrimitiveTypes_shouldHandleProperly() {
        Assert.assertTrue(TypeUtils.isAssignable(null, Object.class));
        Assert.assertTrue(TypeUtils.isAssignable(null, String.class));
        Assert.assertFalse(TypeUtils.isAssignable(null, int.class));
        Assert.assertTrue(TypeUtils.isAssignable(null, (Type) null));
        Assert.assertFalse(TypeUtils.isAssignable(String.class, (Class<?>) null));
        Assert.assertFalse(TypeUtils.isAssignable(String.class, (Type) null));
    }

    @Test
    public void isAssignable_classToClass_shouldCheckClassAssignability() {
        Assert.assertTrue(TypeUtils.isAssignable(String.class, Object.class));
        Assert.assertTrue(TypeUtils.isAssignable(Integer.class, Number.class));
        Assert.assertTrue(TypeUtils.isAssignable(int.class, Integer.class));
        Assert.assertTrue(TypeUtils.isAssignable(Integer.class, int.class));
        Assert.assertFalse(TypeUtils.isAssignable(Object.class, String.class));
    }

    @Test
    public void isAssignable_parameterizedTypeToClass_shouldUseRawType() throws Exception {
        Type listOfStringType = getFieldType("listString");
        Assert.assertTrue(TypeUtils.isAssignable(listOfStringType, List.class));
        Assert.assertTrue(TypeUtils.isAssignable(listOfStringType, Collection.class));
        Assert.assertTrue(TypeUtils.isAssignable(listOfStringType, Object.class));
        Assert.assertFalse(TypeUtils.isAssignable(listOfStringType, Set.class));
    }

    @Test
    public void isAssignable_typeVariableToClass_shouldCheckBounds() throws Exception {
        TypeVariable<?>[] typeVariables = getClass().getTypeParameters();
        TypeVariable<?> tVar = typeVariables[0];

        Assert.assertTrue(TypeUtils.isAssignable(tVar, Number.class));
        Assert.assertTrue(TypeUtils.isAssignable(tVar, Serializable.class));
        Assert.assertTrue(TypeUtils.isAssignable(tVar, Object.class));
        Assert.assertFalse(TypeUtils.isAssignable(tVar, String.class));
    }

    @Test
    public void isAssignable_genericArrayToClass_shouldCheckArrays() throws Exception {
        Type genericArrayT = getFieldType("genericArrayOfT");
        Assert.assertTrue(TypeUtils.isAssignable(genericArrayT, Object.class));
        Assert.assertTrue(TypeUtils.isAssignable(genericArrayT, Number[].class));
        Assert.assertTrue(TypeUtils.isAssignable(genericArrayT, Serializable[].class));
        Assert.assertFalse(TypeUtils.isAssignable(genericArrayT, String[].class));
        Assert.assertFalse(TypeUtils.isAssignable(genericArrayT, Integer.class));
    }

    @Test
    public void isAssignable_wildcardToClass_shouldReturnFalse() throws Exception {
        WildcardType wildcardType = getWildcardArgument("listWildcard");
        Assert.assertFalse(TypeUtils.isAssignable(wildcardType, Object.class));
    }

    @Test(expected = IllegalStateException.class)
    public void isAssignable_unhandledTypeToClass_shouldThrowIllegalStateException() {
        TypeUtils.isAssignable(new UnknownType(), Object.class);
    }

    @Test(expected = IllegalStateException.class)
    public void isAssignable_unhandledToType_shouldThrowIllegalStateException() {
        TypeUtils.isAssignable(String.class, new UnknownType());
    }

    @Test
    public void isAssignable_toParameterizedType_shouldHandleEqualityAndSubtypes() throws Exception {
        Type listOfStringType = getFieldType("listString");
        Type listOfNumberType = getFieldType("listNumber");
        Type listOfIntegerType = getFieldType("listInteger");
        Type listOfExtendsNumberType = getFieldType("listExtendsNumber");
        Type mapStringIntegerType = getFieldType("mapStringInteger");

        Assert.assertTrue(TypeUtils.isAssignable(null, listOfStringType));
        Assert.assertTrue(TypeUtils.isAssignable(listOfStringType, listOfStringType));
        Assert.assertFalse(TypeUtils.isAssignable(listOfIntegerType, listOfNumberType));
        Assert.assertTrue(TypeUtils.isAssignable(listOfIntegerType, listOfExtendsNumberType));
        Assert.assertFalse(TypeUtils.isAssignable(listOfStringType, listOfExtendsNumberType));
        Assert.assertFalse(TypeUtils.isAssignable(listOfStringType, mapStringIntegerType));
    }

    @Test
    public void isAssignable_rawClassToParameterizedType_shouldEvaluateArgs() throws Exception {
        Type listOfStringType = getFieldType("listString");
        Assert.assertTrue(TypeUtils.isAssignable(ArrayList.class, listOfStringType));
    }

    @Test
    public void isAssignable_toGenericArrayType_shouldHandleComponentTypes() throws Exception {
        Type genericArrayT = getFieldType("genericArrayOfT");
        Type genericArrayListOfString = getFieldType("genericArrayOfListString");

        Assert.assertTrue(TypeUtils.isAssignable(null, genericArrayT));
        Assert.assertTrue(TypeUtils.isAssignable(genericArrayT, genericArrayT));

        Assert.assertTrue(TypeUtils.isAssignable(Number[].class, genericArrayT));
        Assert.assertFalse(TypeUtils.isAssignable(String[].class, genericArrayT));
        Assert.assertFalse(TypeUtils.isAssignable(String.class, genericArrayT));

        Type stubGenericArrayNumber = new StubGenericArrayType(Number.class);
        Assert.assertTrue(TypeUtils.isAssignable(stubGenericArrayNumber, genericArrayT));

        TypeVariable<?> tVar = getClass().getTypeParameters()[0];
        Assert.assertFalse(TypeUtils.isAssignable(tVar, (GenericArrayType) genericArrayT));

        Type listOfStringType = getFieldType("listString");
        Assert.assertFalse(TypeUtils.isAssignable(listOfStringType, (GenericArrayType) genericArrayT));
    }

    @Test
    public void isAssignable_wildcardToGenericArray_shouldCheckUpperBounds() throws Exception {
        Type genericArrayT = getFieldType("genericArrayOfT");
        WildcardType wildcardArray = new StubWildcardType(new Type[] { Number[].class }, new Type[0]);
        Assert.assertTrue(TypeUtils.isAssignable(wildcardArray, genericArrayT));

        WildcardType wildcardNonArray = new StubWildcardType(new Type[] { String.class }, new Type[0]);
        Assert.assertFalse(TypeUtils.isAssignable(wildcardNonArray, genericArrayT));
    }

    @Test(expected = IllegalStateException.class)
    public void isAssignable_unhandledTypeToGenericArrayType_shouldThrowException() throws Exception {
        Type genericArrayT = getFieldType("genericArrayOfT");
        TypeUtils.isAssignable(new UnknownType(), genericArrayT);
    }

    @Test
    public void isAssignable_toWildcardType_shouldHandleUpperAndLowerBounds() throws Exception {
        WildcardType extendsNumber = getWildcardArgument("listExtendsNumber");
        WildcardType extendsInteger = getWildcardArgument("listExtendsInteger");
        WildcardType superNumber = getWildcardArgument("listSuperNumber");
        WildcardType superInteger = getWildcardArgument("listSuperInteger");
        WildcardType unbounded = getWildcardArgument("listWildcard");

        Assert.assertTrue(TypeUtils.isAssignable(null, extendsNumber));
        Assert.assertTrue(TypeUtils.isAssignable(extendsNumber, extendsNumber));

        Assert.assertTrue(TypeUtils.isAssignable(Integer.class, extendsNumber));
        Assert.assertFalse(TypeUtils.isAssignable(String.class, extendsNumber));

        Assert.assertTrue(TypeUtils.isAssignable(Number.class, superInteger));
        Assert.assertTrue(TypeUtils.isAssignable(Object.class, superInteger));
        Assert.assertFalse(TypeUtils.isAssignable(Integer.class, superNumber));

        Assert.assertTrue(TypeUtils.isAssignable(extendsInteger, extendsNumber));
        Assert.assertFalse(TypeUtils.isAssignable(extendsNumber, extendsInteger));

        Assert.assertTrue(TypeUtils.isAssignable(superNumber, superInteger));
        Assert.assertFalse(TypeUtils.isAssignable(superInteger, superNumber));

        Assert.assertTrue(TypeUtils.isAssignable(String.class, unbounded));
    }

    @Test
    public void isAssignable_toTypeVariable_shouldHandleBounds() throws Exception {
        TypeVariable<?> tVar = getClass().getTypeParameters()[0];

        Assert.assertTrue(TypeUtils.isAssignable(null, tVar));
        Assert.assertTrue(TypeUtils.isAssignable(tVar, tVar));

        Assert.assertFalse(TypeUtils.isAssignable(Integer.class, tVar));
        Assert.assertFalse(TypeUtils.isAssignable(getFieldType("listString"), tVar));
        Assert.assertFalse(TypeUtils.isAssignable(getFieldType("genericArrayOfT"), tVar));
        Assert.assertFalse(TypeUtils.isAssignable(getWildcardArgument("listWildcard"), tVar));
    }

    @Test(expected = IllegalStateException.class)
    public void isAssignable_unhandledTypeToTypeVariable_shouldThrowException() {
        TypeVariable<?> tVar = getClass().getTypeParameters()[0];
        TypeUtils.isAssignable(new UnknownType(), tVar);
    }

    @Test
    public void isInstance_shouldCheckAssignableObjectInstance() throws Exception {
        Assert.assertFalse(TypeUtils.isInstance("hello", null));
        Assert.assertTrue(TypeUtils.isInstance(null, Object.class));
        Assert.assertFalse(TypeUtils.isInstance(null, int.class));
        Assert.assertTrue(TypeUtils.isInstance(null, getFieldType("listString")));

        Assert.assertTrue(TypeUtils.isInstance("test", String.class));
        Assert.assertTrue(TypeUtils.isInstance(new Integer(1), Number.class));
        Assert.assertFalse(TypeUtils.isInstance("test", Integer.class));

        List<String> list = new ArrayList<String>();
        Assert.assertTrue(TypeUtils.isInstance(list, getFieldType("listString")));
    }

    @Test
    public void normalizeUpperBounds_variousBoundsArrays_shouldNormalize() {
        Assert.assertEquals(0, TypeUtils.normalizeUpperBounds(new Type[0]).length);
        Type[] singleBound = new Type[] { Object.class };
        Assert.assertSame(singleBound, TypeUtils.normalizeUpperBounds(singleBound));

        Type[] bounds = new Type[] { Number.class, Integer.class, Object.class };
        Type[] normalized = TypeUtils.normalizeUpperBounds(bounds);
        Assert.assertEquals(1, normalized.length);
        Assert.assertEquals(Integer.class, normalized[0]);

        Type[] independentBounds = new Type[] { Comparable.class, Serializable.class };
        Type[] normalizedIndependent = TypeUtils.normalizeUpperBounds(independentBounds);
        Assert.assertEquals(2, normalizedIndependent.length);
    }

    @Test
    public void getImplicitBounds_andUpperLowerBounds_shouldHandleDefaults() throws Exception {
        TypeVariable<?> tVar = getClass().getTypeParameters()[0];
        Type[] bounds = TypeUtils.getImplicitBounds(tVar);
        Assert.assertTrue(bounds.length >= 1);

        WildcardType emptyWildcard = new StubWildcardType(new Type[0], new Type[0]);
        Type[] upperBounds = TypeUtils.getImplicitUpperBounds(emptyWildcard);
        Assert.assertEquals(1, upperBounds.length);
        Assert.assertEquals(Object.class, upperBounds[0]);

        Type[] lowerBounds = TypeUtils.getImplicitLowerBounds(emptyWildcard);
        Assert.assertEquals(1, lowerBounds.length);
        Assert.assertNull(lowerBounds[0]);

        WildcardType regularWildcard = getWildcardArgument("listExtendsNumber");
        Type[] regularUpper = TypeUtils.getImplicitUpperBounds(regularWildcard);
        Assert.assertEquals(1, regularUpper.length);
        Assert.assertEquals(Number.class, regularUpper[0]);

        WildcardType regularSuper = getWildcardArgument("listSuperInteger");
        Type[] regularLower = TypeUtils.getImplicitLowerBounds(regularSuper);
        Assert.assertEquals(1, regularLower.length);
        Assert.assertEquals(Integer.class, regularLower[0]);
    }

    @Test
    public void typesSatisfyVariables_validAndInvalidAssignments_shouldEvaluate() throws Exception {
        TypeVariable<?> tVar = getClass().getTypeParameters()[0];
        Map<TypeVariable<?>, Type> typeVarAssigns = new HashMap<TypeVariable<?>, Type>();

        typeVarAssigns.put(tVar, Integer.class);
        Assert.assertTrue(TypeUtils.typesSatisfyVariables(typeVarAssigns));

        typeVarAssigns.put(tVar, Object.class);
        Assert.assertFalse(TypeUtils.typesSatisfyVariables(typeVarAssigns));
    }

    @Test(expected = IllegalArgumentException.class)
    public void typesSatisfyVariables_missingTypeVariableAssignment_shouldThrowException() throws Exception {
        class UnassignedContainer<X extends List<Y>, Y> {}
        TypeVariable<?>[] typeParams = UnassignedContainer.class.getTypeParameters();
        Map<TypeVariable<?>, Type> typeVarAssigns = new HashMap<TypeVariable<?>, Type>();
        typeVarAssigns.put(typeParams[0], ArrayList.class); // missing Y
        TypeUtils.typesSatisfyVariables(typeVarAssigns);
    }

    @Test
    public void getRawType_variousTypes_shouldExtractRawClass() throws Exception {
        Assert.assertEquals(String.class, TypeUtils.getRawType(String.class, null));

        Type listOfStringType = getFieldType("listString");
        Assert.assertEquals(List.class, TypeUtils.getRawType(listOfStringType, null));

        Type genericArrayT = getFieldType("genericArrayOfT");
        Assert.assertEquals(Number[].class, TypeUtils.getRawType(genericArrayT, TypeUtilsTest.class));

        WildcardType wildcardType = getWildcardArgument("listWildcard");
        Assert.assertNull(TypeUtils.getRawType(wildcardType, null));

        TypeVariable<?> tVar = getClass().getTypeParameters()[0];
        Assert.assertNull(TypeUtils.getRawType(tVar, null));
        Assert.assertNull(TypeUtils.getRawType(tVar, String.class));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getRawType_unknownType_shouldThrowIllegalArgumentException() {
        TypeUtils.getRawType(new UnknownType(), null);
    }

    @Test(expected = IllegalStateException.class)
    public void getRawType_invalidParameterizedRawType_shouldThrowIllegalStateException() {
        ParameterizedType badPt = new StubParameterizedType(new UnknownType(), null, new Type[0]);
        TypeUtils.getRawType(badPt, null);
    }

    @Test
    public void isArrayType_andGetArrayComponentType_shouldWorkForArrayAndNonArray() throws Exception {
        Assert.assertTrue(TypeUtils.isArrayType(String[].class));
        Assert.assertTrue(TypeUtils.isArrayType(int[].class));
        Assert.assertTrue(TypeUtils.isArrayType(getFieldType("genericArrayOfT")));
        Assert.assertFalse(TypeUtils.isArrayType(String.class));
        Assert.assertFalse(TypeUtils.isArrayType(getFieldType("listString")));

        Assert.assertEquals(String.class, TypeUtils.getArrayComponentType(String[].class));
        Assert.assertEquals(int.class, TypeUtils.getArrayComponentType(int[].class));
        Assert.assertNull(TypeUtils.getArrayComponentType(String.class));
        Assert.assertNull(TypeUtils.getArrayComponentType(getFieldType("listString")));

        Type genericArrayT = getFieldType("genericArrayOfT");
        Assert.assertEquals(getClass().getTypeParameters()[0], TypeUtils.getArrayComponentType(genericArrayT));
    }

    @Test
    public void getTypeArguments_parameterizedAndClass_shouldMapTypeVariables() throws Exception {
        Type listOfStringType = getFieldType("listString");
        Map<TypeVariable<?>, Type> typeArgs = TypeUtils.getTypeArguments((ParameterizedType) listOfStringType);
        Assert.assertEquals(1, typeArgs.size());
        TypeVariable<?> listT = List.class.getTypeParameters()[0];
        Assert.assertEquals(String.class, typeArgs.get(listT));

        Map<TypeVariable<?>, Type> childTypeArgs = TypeUtils.getTypeArguments(ChildClass.class, GrandParentClass.class);
        Assert.assertNotNull(childTypeArgs);
        TypeVariable<?> gpT = GrandParentClass.class.getTypeParameters()[0];
        Assert.assertEquals(String.class, childTypeArgs.get(gpT));

        Assert.assertNull(TypeUtils.getTypeArguments(String.class, List.class));

        Map<TypeVariable<?>, Type> primitiveArgs = TypeUtils.getTypeArguments(int.class, int.class);
        Assert.assertTrue(primitiveArgs.isEmpty());

        Map<TypeVariable<?>, Type> primitiveWrapperArgs = TypeUtils.getTypeArguments(int.class, Number.class);
        Assert.assertNotNull(primitiveWrapperArgs);
    }

    @Test
    public void getTypeArguments_genericArrayAndWildcard_shouldExtractTypes() throws Exception {
        Type genericArrayListOfString = getFieldType("genericArrayOfListString");
        Map<TypeVariable<?>, Type> arrayArgs = TypeUtils.getTypeArguments(genericArrayListOfString, List[].class);
        Assert.assertNotNull(arrayArgs);
        TypeVariable<?> listT = List.class.getTypeParameters()[0];
        Assert.assertEquals(String.class, arrayArgs.get(listT));

        WildcardType wildcardList = new StubWildcardType(new Type[] { getFieldType("listString") }, new Type[0]);
        Map<TypeVariable<?>, Type> wildcardArgs = TypeUtils.getTypeArguments(wildcardList, Collection.class);
        Assert.assertNotNull(wildcardArgs);

        WildcardType wildcardUnassignable = new StubWildcardType(new Type[] { String.class }, new Type[0]);
        Assert.assertNull(TypeUtils.getTypeArguments(wildcardUnassignable, Collection.class));

        TypeVariable<?> tVar = getClass().getTypeParameters()[0];
        Map<TypeVariable<?>, Type> tVarArgs = TypeUtils.getTypeArguments(tVar, Object.class);
        Assert.assertNotNull(tVarArgs);

        Assert.assertNull(TypeUtils.getTypeArguments(tVar, String.class));
    }

    @Test(expected = IllegalStateException.class)
    public void getTypeArguments_unhandledType_shouldThrowException() {
        TypeUtils.getTypeArguments(new UnknownType(), Object.class);
    }

    @Test
    public void determineTypeArguments_complexInheritance_shouldResolveArguments() throws Exception {
        ParameterizedType parentStringPt = (ParameterizedType) ChildClass.class.getGenericSuperclass();
        Map<TypeVariable<?>, Type> result = TypeUtils.determineTypeArguments(ChildClass.class, parentStringPt);
        Assert.assertNotNull(result);

        Assert.assertNull(TypeUtils.determineTypeArguments(String.class, parentStringPt));

        Map<TypeVariable<?>, Type> sameClassResult = TypeUtils.determineTypeArguments(ParentClass.class, parentStringPt);
        Assert.assertNotNull(sameClassResult);

        Method m = GenericChildClass.class.getMethod("hashCode");
        ParameterizedType superPt = (ParameterizedType) GenericChildClass.class.getGenericSuperclass();
        Map<TypeVariable<?>, Type> genericChildResult = TypeUtils.determineTypeArguments(GenericChildClass.class, superPt);
        Assert.assertNotNull(genericChildResult);
    }

    @Test
    public void determineTypeArguments_interfaceHierarchy_shouldTraverseInterfaces() throws Exception {
        ParameterizedType baseInterfacePt = (ParameterizedType) SubInterface.class.getGenericInterfaces()[0];
        Map<TypeVariable<?>, Type> args = TypeUtils.determineTypeArguments(ParentClass.class, baseInterfacePt);
        Assert.assertNotNull(args);
    }

    @Test
    public void isAssignable_parameterizedWithOwner_shouldHandleOwnerType() {
        class Enclosing<E> {
            class Inner<I> {}
        }
        Type enclosingString = new StubParameterizedType(Enclosing.class, null, new Type[] { String.class });
        Type inner1 = new StubParameterizedType(Enclosing.Inner.class, enclosingString, new Type[] { Integer.class });
        Type inner2 = new StubParameterizedType(Enclosing.Inner.class, enclosingString, new Type[] { Integer.class });
        Type inner3 = new StubParameterizedType(Enclosing.Inner.class, enclosingString, new Type[] { Number.class });

        Assert.assertTrue(TypeUtils.isAssignable(inner1, inner2));
        Assert.assertFalse(TypeUtils.isAssignable(inner1, inner3));
    }
}