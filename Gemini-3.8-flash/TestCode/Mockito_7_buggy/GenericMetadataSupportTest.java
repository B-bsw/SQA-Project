package org.mockito.internal.util.reflection;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoException;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GenericMetadataSupportTest {

    // Helper Interfaces & Classes for Type Reflection
    private interface SimpleInterface {
        String nonGenericMethod();
        List<String> parameterizedMethod();
        <T> T methodLevelTypeVariableMethod();
        String[] genericArrayMethod();
    }

    private interface GenericInterface<T, K> {
        T getFirst();
        K getSecond();
    }

    private interface MultiBoundInterface<T extends Number & Comparable<T> & Serializable> {
        T getBoundItem();
    }

    private static class BaseClass<E> {
        public E baseFieldMethod() {
            return null;
        }
    }

    private static class SubClassWithConcreteSuper extends BaseClass<Integer> implements GenericInterface<String, Long> {
        public String nonGenericMethod() {
            return "test";
        }

        public String getFirst() {
            return "first";
        }

        public Long getSecond() {
            return 2L;
        }
    }

    private static class GenericSubClass<X> extends BaseClass<X> {
    }

    private static class NestedBoundClass<A extends B, B extends Number> {
        public A getNested() {
            return null;
        }
    }

    private static class WildcardContainer<W> {
        public List<? extends Number> getUpperWildcardList() {
            return null;
        }

        public List<? super Integer> getLowerWildcardList() {
            return null;
        }

        public <T extends Comparable<T>> List<? extends T> getNestedWildcardList() {
            return null;
        }
    }

    private static class TypeVariableWithBoundsContainer<T extends Number & Serializable> {
        public T getTypeVariableBound() {
            return null;
        }
    }

    private static class DummyCustomType implements Type {
    }

    private static class CustomConcreteMetadataSupport extends GenericMetadataSupport {
        private final Class<?> clazz;

        public CustomConcreteMetadataSupport(Class<?> clazz) {
            this.clazz = clazz;
        }

        public Class<?> rawType() {
            return this.clazz;
        }

        public void testRegisterTypeVariablesOn(Type type) {
            registerTypeVariablesOn(type);
        }

        public void testRegisterTypeParametersOn(TypeVariable[] typeVariables) {
            registerTypeParametersOn(typeVariables);
        }

        public Map<TypeVariable, Type> getContextualActualTypeParameters() {
            return this.contextualActualTypeParameters;
        }
    }

    // --- inferFrom tests ---

    @Test
    public void inferFrom_givenClassType_shouldReturnFromClassGenericMetadataSupport() {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SubClassWithConcreteSuper.class);
        Assert.assertNotNull(metadata);
        Assert.assertEquals(SubClassWithConcreteSuper.class, metadata.rawType());
    }

    @Test
    public void inferFrom_givenParameterizedType_shouldReturnFromParameterizedTypeGenericMetadataSupport() throws Exception {
        Method method = SimpleInterface.class.getMethod("parameterizedMethod", new Class[0]);
        Type returnType = method.getGenericReturnType();

        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(returnType);
        Assert.assertNotNull(metadata);
        Assert.assertEquals(List.class, metadata.rawType());
    }

    @Test(expected = RuntimeException.class)
    public void inferFrom_givenNullType_shouldThrowException() {
        GenericMetadataSupport.inferFrom(null);
    }

    @Test(expected = MockitoException.class)
    public void inferFrom_givenUnsupportedType_shouldThrowMockitoException() {
        GenericMetadataSupport.inferFrom(new DummyCustomType());
    }

    // --- resolveGenericReturnType tests ---

    @Test
    public void resolveGenericReturnType_givenNonGenericMethod_shouldReturnNotGenericReturnTypeSupport() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SimpleInterface.class);
        Method method = SimpleInterface.class.getMethod("nonGenericMethod", new Class[0]);

        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        Assert.assertNotNull(returnMetadata);
        Assert.assertEquals(String.class, returnMetadata.rawType());
        Assert.assertEquals(0, returnMetadata.rawExtraInterfaces().length);
        Assert.assertFalse(returnMetadata.hasRawExtraInterfaces());
        Assert.assertEquals(Collections.EMPTY_LIST, returnMetadata.extraInterfaces());
    }

    @Test
    public void resolveGenericReturnType_givenParameterizedMethod_shouldReturnParameterizedReturnType() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SimpleInterface.class);
        Method method = SimpleInterface.class.getMethod("parameterizedMethod", new Class[0]);

        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        Assert.assertNotNull(returnMetadata);
        Assert.assertEquals(List.class, returnMetadata.rawType());
    }

    @Test
    public void resolveGenericReturnType_givenMethodLevelTypeVariable_shouldResolveRawType() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SimpleInterface.class);
        Method method = SimpleInterface.class.getMethod("methodLevelTypeVariableMethod", new Class[0]);

        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        Assert.assertNotNull(returnMetadata);
        Assert.assertEquals(Object.class, returnMetadata.rawType());
    }

    @Test
    public void resolveGenericReturnType_givenClassTypeVariable_shouldResolveConcreteTypeFromHierarchy() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SubClassWithConcreteSuper.class);
        Method baseMethod = BaseClass.class.getMethod("baseFieldMethod", new Class[0]);

        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(baseMethod);
        Assert.assertNotNull(returnMetadata);
        Assert.assertEquals(Integer.class, returnMetadata.rawType());
    }

    @Test
    public void resolveGenericReturnType_givenInterfaceTypeVariable_shouldResolveConcreteType() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SubClassWithConcreteSuper.class);
        Method getFirstMethod = GenericInterface.class.getMethod("getFirst", new Class[0]);
        Method getSecondMethod = GenericInterface.class.getMethod("getSecond", new Class[0]);

        GenericMetadataSupport firstReturn = metadata.resolveGenericReturnType(getFirstMethod);
        GenericMetadataSupport secondReturn = metadata.resolveGenericReturnType(getSecondMethod);

        Assert.assertEquals(String.class, firstReturn.rawType());
        Assert.assertEquals(Long.class, secondReturn.rawType());
    }

    @Test(expected = MockitoException.class)
    public void resolveGenericReturnType_givenGenericArrayType_shouldThrowMockitoException() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SimpleInterface.class);
        Method arrayMethod = SimpleInterface.class.getMethod("genericArrayMethod", new Class[0]);

        // Method returns String[], which is a Class in this case, let's use a class that actually returns GenericArrayType:
        class GenericArrayContainer<T> {
            public T[] arrayMethod() {
                return null;
            }
        }
        Method genericArrayMethod = GenericArrayContainer.class.getMethod("arrayMethod", new Class[0]);
        metadata.resolveGenericReturnType(genericArrayMethod);
    }

    // --- TypeVariableReturnType & Bound Extraction tests ---

    @Test
    public void resolveGenericReturnType_givenMultiBoundedTypeVariable_shouldExtractRawTypeAndExtraInterfaces() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(MultiBoundInterface.class);
        Method method = MultiBoundInterface.class.getMethod("getBoundItem", new Class[0]);

        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        Assert.assertEquals(Number.class, returnMetadata.rawType());

        Class<?>[] extraInterfaces = returnMetadata.rawExtraInterfaces();
        Assert.assertTrue(returnMetadata.hasRawExtraInterfaces());
        Assert.assertEquals(2, extraInterfaces.length);
        Assert.assertEquals(Comparable.class, extraInterfaces[0]);
        Assert.assertEquals(Serializable.class, extraInterfaces[1]);

        List<Type> extraTypeList = returnMetadata.extraInterfaces();
        Assert.assertEquals(2, extraTypeList.size());
    }

    @Test
    public void resolveGenericReturnType_givenNestedBoundedTypeVariable_shouldExtractRecursively() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(NestedBoundClass.class);
        Method method = NestedBoundClass.class.getMethod("getNested", new Class[0]);

        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        Assert.assertEquals(Number.class, returnMetadata.rawType());
    }

    @Test
    public void resolveGenericReturnType_givenTypeVariableWithExtraInterfaces_whenRawTypeMatchesInterface_shouldFilterRawType() throws Exception {
        interface InterfaceOnlyBound<T extends Serializable & Cloneable> {
            T getItem();
        }

        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(InterfaceOnlyBound.class);
        Method method = InterfaceOnlyBound.class.getMethod("getItem", new Class[0]);
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);

        // When bounds are interfaces, firstBound is Serializable (rawType = Serializable)
        Assert.assertEquals(Serializable.class, returnMetadata.rawType());
        Class<?>[] rawExtras = returnMetadata.rawExtraInterfaces();
        Assert.assertEquals(1, rawExtras.length);
        Assert.assertEquals(Cloneable.class, rawExtras[0]);
    }

    // --- actualTypeArguments tests ---

    @Test
    public void actualTypeArguments_givenClassWithSuperAndInterfaceMapping_shouldContainMappedTypes() {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SubClassWithConcreteSuper.class);
        Map<TypeVariable, Type> args = metadata.actualTypeArguments();
        Assert.assertNotNull(args);
        // SubClassWithConcreteSuper has no TypeParameters of its own
        Assert.assertEquals(0, args.size());

        GenericMetadataSupport baseMetadata = GenericMetadataSupport.inferFrom(GenericSubClass.class);
        Map<TypeVariable, Type> genericArgs = baseMetadata.actualTypeArguments();
        Assert.assertEquals(1, genericArgs.size());
    }

    @Test
    public void actualTypeArguments_givenNestedTypeVariables_shouldChainLookup() {
        CustomConcreteMetadataSupport support = new CustomConcreteMetadataSupport(GenericSubClass.class);
        TypeVariable<?>[] subParams = GenericSubClass.class.getTypeParameters();
        TypeVariable<?>[] baseParams = BaseClass.class.getTypeParameters();

        // subParams[0] points to baseParams[0]
        support.getContextualActualTypeParameters().put(subParams[0], baseParams[0]);
        support.getContextualActualTypeParameters().put(baseParams[0], String.class);

        Type resolved = support.getActualTypeArgumentFor(subParams[0]);
        Assert.assertEquals(String.class, resolved);
    }

    // --- registerTypeVariablesOn with Wildcards and Edge Cases ---

    @Test
    public void registerTypeVariablesOn_givenWildcardUpperBounds_shouldRegisterBoundedType() throws Exception {
        Method method = WildcardContainer.class.getMethod("getUpperWildcardList", new Class[0]);
        ParameterizedType pType = (ParameterizedType) method.getGenericReturnType();

        CustomConcreteMetadataSupport support = new CustomConcreteMetadataSupport(WildcardContainer.class);
        support.testRegisterTypeVariablesOn(pType);

        Map<TypeVariable, Type> map = support.getContextualActualTypeParameters();
        Assert.assertEquals(1, map.size());
        Type registeredType = map.values().iterator().next();
        Assert.assertTrue(registeredType instanceof GenericMetadataSupport.BoundedType);
        GenericMetadataSupport.BoundedType boundedType = (GenericMetadataSupport.BoundedType) registeredType;
        Assert.assertEquals(Number.class, boundedType.firstBound());
    }

    @Test
    public void registerTypeVariablesOn_givenWildcardLowerBounds_shouldRegisterBoundedType() throws Exception {
        Method method = WildcardContainer.class.getMethod("getLowerWildcardList", new Class[0]);
        ParameterizedType pType = (ParameterizedType) method.getGenericReturnType();

        CustomConcreteMetadataSupport support = new CustomConcreteMetadataSupport(WildcardContainer.class);
        support.testRegisterTypeVariablesOn(pType);

        Map<TypeVariable, Type> map = support.getContextualActualTypeParameters();
        Assert.assertEquals(1, map.size());
        Type registeredType = map.values().iterator().next();
        Assert.assertTrue(registeredType instanceof GenericMetadataSupport.BoundedType);
        GenericMetadataSupport.BoundedType boundedType = (GenericMetadataSupport.BoundedType) registeredType;
        Assert.assertEquals(Integer.class, boundedType.firstBound());
    }

    @Test
    public void registerTypeVariablesOn_givenNestedWildcardBoundToTypeVariable_shouldResolveFirstBound() throws Exception {
        Method method = WildcardContainer.class.getMethod("getNestedWildcardList", new Class[0]);
        ParameterizedType pType = (ParameterizedType) method.getGenericReturnType();

        CustomConcreteMetadataSupport support = new CustomConcreteMetadataSupport(WildcardContainer.class);
        support.testRegisterTypeVariablesOn(pType);

        Map<TypeVariable, Type> map = support.getContextualActualTypeParameters();
        Assert.assertEquals(1, map.size());
        Type registeredType = map.values().iterator().next();
        Assert.assertTrue(registeredType instanceof GenericMetadataSupport.BoundedType);
        GenericMetadataSupport.BoundedType boundedType = (GenericMetadataSupport.BoundedType) registeredType;
        Assert.assertEquals(Comparable.class, boundedType.firstBound());
    }

    @Test
    public void registerTypeVariablesOn_givenNonParameterizedType_shouldDoNothing() {
        CustomConcreteMetadataSupport support = new CustomConcreteMetadataSupport(String.class);
        support.testRegisterTypeVariablesOn(String.class);
        Assert.assertTrue(support.getContextualActualTypeParameters().isEmpty());
    }

    @Test
    public void registerTypeVariablesOn_givenSameTypeParameterAndArgument_shouldNotRegister() {
        // e.g. Class Container<T> has method Container<T> where typeParameter == actualTypeArgument
        TypeVariable<?>[] typeParameters = BaseClass.class.getTypeParameters();
        ParameterizedType mockType = new ParameterizedType() {
            public Type[] getActualTypeArguments() {
                return new Type[] { BaseClass.class.getTypeParameters()[0] };
            }

            public Type getRawType() {
                return BaseClass.class;
            }

            public Type getOwnerType() {
                return null;
            }
        };

        CustomConcreteMetadataSupport support = new CustomConcreteMetadataSupport(BaseClass.class);
        support.testRegisterTypeVariablesOn(mockType);
        Assert.assertTrue(support.getContextualActualTypeParameters().isEmpty());
    }

    @Test
    public void registerTypeParametersOn_givenDuplicateCalls_shouldNotOverwrite() {
        TypeVariable<?>[] typeParameters = BaseClass.class.getTypeParameters();
        CustomConcreteMetadataSupport support = new CustomConcreteMetadataSupport(BaseClass.class);

        support.getContextualActualTypeParameters().put(typeParameters[0], String.class);
        support.testRegisterTypeParametersOn(typeParameters);

        Assert.assertEquals(String.class, support.getContextualActualTypeParameters().get(typeParameters[0]));
    }

    // --- TypeVarBoundedType tests ---

    @Test
    public void typeVarBoundedType_testMethodsAndEqualsHashCodeToString() {
        TypeVariable<?> typeVar1 = MultiBoundInterface.class.getTypeParameters()[0];
        TypeVariable<?> typeVar2 = GenericInterface.class.getTypeParameters()[0];

        GenericMetadataSupport.TypeVarBoundedType bounded1 = new GenericMetadataSupport.TypeVarBoundedType(typeVar1);
        GenericMetadataSupport.TypeVarBoundedType bounded1Duplicate = new GenericMetadataSupport.TypeVarBoundedType(typeVar1);
        GenericMetadataSupport.TypeVarBoundedType bounded2 = new GenericMetadataSupport.TypeVarBoundedType(typeVar2);

        Assert.assertEquals(Number.class, bounded1.firstBound());
        Type[] interfaces = bounded1.interfaceBounds();
        Assert.assertEquals(2, interfaces.length);
        Assert.assertEquals(typeVar1, bounded1.typeVariable());

        // Equals & HashCode
        Assert.assertTrue(bounded1.equals(bounded1));
        Assert.assertTrue(bounded1.equals(bounded1Duplicate));
        Assert.assertFalse(bounded1.equals(bounded2));
        Assert.assertFalse(bounded1.equals(null));
        Assert.assertFalse(bounded1.equals("NotABoundedType"));
        Assert.assertEquals(bounded1.hashCode(), bounded1Duplicate.hashCode());

        // toString
        String str = bounded1.toString();
        Assert.assertTrue(str.startsWith("{firstBound="));
        Assert.assertTrue(str.contains("interfaceBounds="));
    }

    // --- WildCardBoundedType tests ---

    @Test
    public void wildCardBoundedType_testMethodsAndEqualsHashCodeToString() throws Exception {
        Method upperMethod = WildcardContainer.class.getMethod("getUpperWildcardList", new Class[0]);
        ParameterizedType upperPType = (ParameterizedType) upperMethod.getGenericReturnType();
        WildcardType upperWildcard = (WildcardType) upperPType.getActualTypeArguments()[0];

        Method lowerMethod = WildcardContainer.class.getMethod("getLowerWildcardList", new Class[0]);
        ParameterizedType lowerPType = (ParameterizedType) lowerMethod.getGenericReturnType();
        WildcardType lowerWildcard = (WildcardType) lowerPType.getActualTypeArguments()[0];

        GenericMetadataSupport.WildCardBoundedType boundedUpper = new GenericMetadataSupport.WildCardBoundedType(upperWildcard);
        GenericMetadataSupport.WildCardBoundedType boundedUpperDup = new GenericMetadataSupport.WildCardBoundedType(upperWildcard);
        GenericMetadataSupport.WildCardBoundedType boundedLower = new GenericMetadataSupport.WildCardBoundedType(lowerWildcard);

        Assert.assertEquals(Number.class, boundedUpper.firstBound());
        Assert.assertEquals(Integer.class, boundedLower.firstBound());
        Assert.assertEquals(0, boundedUpper.interfaceBounds().length);
        Assert.assertEquals(upperWildcard, boundedUpper.wildCard());

        // Equals & HashCode
        Assert.assertTrue(boundedUpper.equals(boundedUpper));
        Assert.assertFalse(boundedUpper.equals(boundedLower));
        Assert.assertFalse(boundedUpper.equals(null));
        Assert.assertFalse(boundedUpper.equals("NotAWildcard"));
        Assert.assertEquals(boundedUpper.hashCode(), boundedUpperDup.hashCode());

        // toString
        String str = boundedUpper.toString();
        Assert.assertTrue(str.startsWith("{firstBound="));
        Assert.assertTrue(str.contains("interfaceBounds=[]"));
    }

    // --- Error Branches in TypeVariableReturnType ---

    @Test
    public void typeVariableReturnType_unsupportedRawTypeExtraction_shouldThrowMockitoException() throws Exception {
        Method method = SimpleInterface.class.getMethod("methodLevelTypeVariableMethod", new Class[0]);
        TypeVariable<?> typeVar = (TypeVariable<?>) method.getGenericReturnType();

        CustomConcreteMetadataSupport support = new CustomConcreteMetadataSupport(Object.class);
        // Map type variable to an unsupported custom type
        support.getContextualActualTypeParameters().put(typeVar, new DummyCustomType());

        GenericMetadataSupport returnMetadata = support.resolveGenericReturnType(method);
        try {
            returnMetadata.rawType();
            Assert.fail("Expected MockitoException when extracting raw type of unsupported type");
        } catch (MockitoException e) {
            Assert.assertTrue(e.getMessage().contains("Raw extraction not supported"));
        }
    }

    @Test
    public void typeVariableReturnType_unsupportedExtraInterfaces_shouldThrowMockitoException() throws Exception {
        Method method = SimpleInterface.class.getMethod("methodLevelTypeVariableMethod", new Class[0]);
        TypeVariable<?> typeVar = (TypeVariable<?>) method.getGenericReturnType();

        CustomConcreteMetadataSupport support = new CustomConcreteMetadataSupport(Object.class);
        support.getContextualActualTypeParameters().put(typeVar, new DummyCustomType());

        GenericMetadataSupport returnMetadata = support.resolveGenericReturnType(method);
        try {
            returnMetadata.extraInterfaces();
            Assert.fail("Expected MockitoException when extracting extra interfaces of unsupported type");
        } catch (MockitoException e) {
            Assert.assertTrue(e.getMessage().contains("Cannot extract extra-interfaces"));
        }
    }

    @Test
    public void typeVariableReturnType_extraInterfacesWhenTypeVariableIsClass_shouldReturnEmpty() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SubClassWithConcreteSuper.class);
        Method baseMethod = BaseClass.class.getMethod("baseFieldMethod", new Class[0]);

        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(baseMethod);
        Assert.assertEquals(Integer.class, returnMetadata.rawType());
        Assert.assertEquals(Collections.EMPTY_LIST, returnMetadata.extraInterfaces());
        Assert.assertEquals(0, returnMetadata.rawExtraInterfaces().length);
        Assert.assertFalse(returnMetadata.hasRawExtraInterfaces());
    }

    @Test
    public void typeVariableReturnType_extraInterfacesWhenTypeVariableIsParameterizedType_shouldReturnSingleItemList() throws Exception {
        class ParameterizedHolder<T> {
            public T getItem() {
                return null;
            }
        }
        class ConcreteHolder extends ParameterizedHolder<List<String>> {
        }

        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ConcreteHolder.class);
        Method method = ParameterizedHolder.class.getMethod("getItem", new Class[0]);

        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        Assert.assertEquals(List.class, returnMetadata.rawType());
        List<Type> extraInterfaces = returnMetadata.extraInterfaces();
        Assert.assertEquals(1, extraInterfaces.size());
        Assert.assertTrue(extraInterfaces.get(0) instanceof ParameterizedType);
    }
}