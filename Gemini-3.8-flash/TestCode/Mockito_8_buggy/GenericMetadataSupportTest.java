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
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GenericMetadataSupportTest {

    interface SimpleInterface {
        String nonGenericMethod();
    }

    interface GenericContainer<T> {
        T getValue();
        List<T> getList();
        <K> K genericMethod(K param);
        T[] getArray();
    }

    static class BaseType<A, B extends Number> {
        public A getA() { return null; }
        public B getB() { return null; }
    }

    static class MiddleType<M> extends BaseType<M, Integer> implements GenericContainer<M> {
        public M getValue() { return null; }
        public List<M> getList() { return null; }
        public <K> K genericMethod(K param) { return null; }
        public M[] getArray() { return null; }
    }

    static class ConcreteType extends MiddleType<String> implements SimpleInterface {
        public String nonGenericMethod() { return "test"; }
    }

    interface MultiBoundInterface<T extends Number & Comparable<T> & Serializable> {
        T getMulti();
    }

    interface NestedTypeVarInterface<X extends Y, Y extends Number> {
        X getX();
    }

    interface WildcardContainer {
        List<? extends Number> getExtendsWildcard();
        List<? super Integer> getSuperWildcard();
        List<?> getUnboundedWildcard();
        Map<String, ? extends Comparable<?>> getComplexWildcard();
    }

    interface WildcardBoundToTypeVar<W extends List<? extends Number>> {
        W getW();
    }

    static class RecursiveBound<T extends RecursiveBound<T>> {
        public T getSelf() { return null; }
    }

    private static class DummyGenericArrayType implements GenericArrayType {
        private final Type componentType;

        public DummyGenericArrayType(Type componentType) {
            this.componentType = componentType;
        }

        public Type getGenericComponentType() {
            return componentType;
        }
    }

    private static class DummyGenericMetadata extends GenericMetadataSupport {
        private final Class<?> raw;

        public DummyGenericMetadata(Class<?> raw) {
            this.raw = raw;
        }

        public Class<?> rawType() {
            return raw;
        }

        public void callRegisterTypeVariablesOn(Type type) {
            registerTypeVariablesOn(type);
        }

        public void callRegisterTypeParametersOn(TypeVariable[] typeVariables) {
            registerTypeParametersOn(typeVariables);
        }

        public Map<TypeVariable, Type> getContextualActualTypeParameters() {
            return contextualActualTypeParameters;
        }
    }

    @Test
    public void inferFrom_givenClassType_shouldReturnFromClassGenericMetadataSupport() {
        // Arrange
        Class<?> targetClass = ConcreteType.class;

        // Act
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(targetClass);

        // Assert
        Assert.assertNotNull(metadata);
        Assert.assertEquals(ConcreteType.class, metadata.rawType());
        Assert.assertFalse(metadata.hasRawExtraInterfaces());
        Assert.assertEquals(0, metadata.rawExtraInterfaces().length);
        Assert.assertEquals(0, metadata.extraInterfaces().size());
    }

    @Test
    public void inferFrom_givenParameterizedType_shouldReturnFromParameterizedTypeGenericMetadataSupport() throws Exception {
        // Arrange
        Method method = MiddleType.class.getMethod("getList");
        Type returnType = method.getGenericReturnType();
        Assert.assertTrue(returnType instanceof ParameterizedType);

        // Act
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(returnType);

        // Assert
        Assert.assertNotNull(metadata);
        Assert.assertEquals(List.class, metadata.rawType());
    }

    @Test
    public void inferFrom_givenNullType_shouldThrowException() {
        // Arrange & Act & Assert
        try {
            GenericMetadataSupport.inferFrom(null);
            Assert.fail("Expected exception when type is null");
        } catch (RuntimeException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void inferFrom_givenUnsupportedType_shouldThrowMockitoException() {
        // Arrange
        Type unsupportedType = new DummyGenericArrayType(String.class);

        // Act & Assert
        try {
            GenericMetadataSupport.inferFrom(unsupportedType);
            Assert.fail("Expected MockitoException for unsupported GenericArrayType");
        } catch (MockitoException e) {
            Assert.assertTrue(e.getMessage().indexOf("Type meta-data for this Type") != -1);
        }
    }

    @Test
    public void resolveGenericReturnType_givenNonGenericMethod_shouldReturnNotGenericReturnTypeSupport() throws Exception {
        // Arrange
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ConcreteType.class);
        Method method = SimpleInterface.class.getMethod("nonGenericMethod");

        // Act
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);

        // Assert
        Assert.assertNotNull(returnMetadata);
        Assert.assertEquals(String.class, returnMetadata.rawType());
        Assert.assertFalse(returnMetadata.hasRawExtraInterfaces());
        Assert.assertEquals(0, returnMetadata.rawExtraInterfaces().length);
    }

    @Test
    public void resolveGenericReturnType_givenParameterizedReturnType_shouldResolveProperly() throws Exception {
        // Arrange
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ConcreteType.class);
        Method method = MiddleType.class.getMethod("getList");

        // Act
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);

        // Assert
        Assert.assertNotNull(returnMetadata);
        Assert.assertEquals(List.class, returnMetadata.rawType());
        Assert.assertFalse(returnMetadata.hasRawExtraInterfaces());
    }

    @Test
    public void resolveGenericReturnType_givenTypeVariableReturnType_shouldResolveToActualType() throws Exception {
        // Arrange
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ConcreteType.class);
        Method method = BaseType.class.getMethod("getB");

        // Act
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);

        // Assert
        Assert.assertNotNull(returnMetadata);
        Assert.assertEquals(Integer.class, returnMetadata.rawType());
    }

    @Test
    public void resolveGenericReturnType_givenResolvedSubClassTypeVariable_shouldResolveToConcreteArgument() throws Exception {
        // Arrange
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ConcreteType.class);
        Method method = MiddleType.class.getMethod("getValue");

        // Act
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);

        // Assert
        Assert.assertNotNull(returnMetadata);
        Assert.assertEquals(String.class, returnMetadata.rawType());
    }

    @Test
    public void resolveGenericReturnType_givenUnsupportedReturnType_shouldThrowMockitoException() throws Exception {
        // Arrange
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ConcreteType.class);
        Method method = MiddleType.class.getMethod("getArray");

        // Act & Assert
        try {
            metadata.resolveGenericReturnType(method);
            Assert.fail("Expected MockitoException for generic array return type");
        } catch (MockitoException e) {
            Assert.assertTrue(e.getMessage().indexOf("Ouch, it shouldn't happen") != -1);
        }
    }

    @Test
    public void resolveGenericReturnType_givenMethodWithTypeParameters_shouldRegisterMethodTypeParameters() throws Exception {
        // Arrange
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ConcreteType.class);
        Method method = MiddleType.class.getMethod("genericMethod", Object.class);

        // Act
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);

        // Assert
        Assert.assertNotNull(returnMetadata);
        Assert.assertEquals(Object.class, returnMetadata.rawType());
    }

    @Test
    public void resolveGenericReturnType_givenMultiBoundedTypeVariable_shouldExtractExtraInterfaces() throws Exception {
        // Arrange
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(MultiBoundInterface.class);
        Method method = MultiBoundInterface.class.getMethod("getMulti");

        // Act
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);

        // Assert
        Assert.assertNotNull(returnMetadata);
        Assert.assertEquals(Number.class, returnMetadata.rawType());
        Assert.assertTrue(returnMetadata.hasRawExtraInterfaces());
        Class<?>[] extraInterfaces = returnMetadata.rawExtraInterfaces();
        Assert.assertEquals(2, extraInterfaces.length);
        Assert.assertEquals(Comparable.class, extraInterfaces[0]);
        Assert.assertEquals(Serializable.class, extraInterfaces[1]);

        List<Type> extraTypes = returnMetadata.extraInterfaces();
        Assert.assertEquals(2, extraTypes.size());
    }

    @Test
    public void resolveGenericReturnType_givenNestedTypeVariables_shouldResolveRecursively() throws Exception {
        // Arrange
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(NestedTypeVarInterface.class);
        Method method = NestedTypeVarInterface.class.getMethod("getX");

        // Act
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);

        // Assert
        Assert.assertNotNull(returnMetadata);
        Assert.assertEquals(Number.class, returnMetadata.rawType());
    }

    @Test
    public void actualTypeArguments_givenClassWithGenerics_shouldMapAllTypeVariables() {
        // Arrange
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(MiddleType.class);

        // Act
        Map<TypeVariable, Type> typeArgs = metadata.actualTypeArguments();

        // Assert
        Assert.assertNotNull(typeArgs);
        Assert.assertEquals(1, typeArgs.size());
    }

    @Test
    public void actualTypeArguments_givenClassWithoutGenerics_shouldReturnEmptyMap() {
        // Arrange
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ConcreteType.class);

        // Act
        Map<TypeVariable, Type> typeArgs = metadata.actualTypeArguments();

        // Assert
        Assert.assertNotNull(typeArgs);
        Assert.assertEquals(0, typeArgs.size());
    }

    @Test
    public void registerTypeVariablesOn_givenWildcardsInParameterizedType_shouldHandleBounds() throws Exception {
        // Arrange
        DummyGenericMetadata metadata = new DummyGenericMetadata(WildcardContainer.class);
        Method methodExtends = WildcardContainer.class.getMethod("getExtendsWildcard");
        Method methodSuper = WildcardContainer.class.getMethod("getSuperWildcard");
        Method methodUnbounded = WildcardContainer.class.getMethod("getUnboundedWildcard");

        // Act
        metadata.callRegisterTypeVariablesOn(methodExtends.getGenericReturnType());
        metadata.callRegisterTypeVariablesOn(methodSuper.getGenericReturnType());
        metadata.callRegisterTypeVariablesOn(methodUnbounded.getGenericReturnType());

        // Assert
        TypeVariable listTypeVar = List.class.getTypeParameters()[0];
        Assert.assertTrue(metadata.getContextualActualTypeParameters().containsKey(listTypeVar));
        Type registeredBound = metadata.getContextualActualTypeParameters().get(listTypeVar);
        Assert.assertTrue(registeredBound instanceof GenericMetadataSupport.BoundedType);
    }

    @Test
    public void registerTypeVariablesOn_givenNonParameterizedType_shouldDoNothing() {
        // Arrange
        DummyGenericMetadata metadata = new DummyGenericMetadata(String.class);

        // Act
        metadata.callRegisterTypeVariablesOn(String.class);

        // Assert
        Assert.assertEquals(0, metadata.getContextualActualTypeParameters().size());
    }

    @Test
    public void registerTypeParametersOn_givenDuplicateTypeVariable_shouldNotOverwrite() {
        // Arrange
        DummyGenericMetadata metadata = new DummyGenericMetadata(MiddleType.class);
        TypeVariable[] typeVariables = MiddleType.class.getTypeParameters();

        // Act
        metadata.callRegisterTypeParametersOn(typeVariables);
        Type firstStored = metadata.getContextualActualTypeParameters().get(typeVariables[0]);
        metadata.callRegisterTypeParametersOn(typeVariables);
        Type secondStored = metadata.getContextualActualTypeParameters().get(typeVariables[0]);

        // Assert
        Assert.assertSame(firstStored, secondStored);
    }

    @Test
    public void typeVarBoundedType_testContractAndMethods() {
        // Arrange
        TypeVariable typeVariable = BaseType.class.getTypeParameters()[1]; // B extends Number
        GenericMetadataSupport.TypeVarBoundedType boundedType = new GenericMetadataSupport.TypeVarBoundedType(typeVariable);

        // Act & Assert
        Assert.assertEquals(Number.class, boundedType.firstBound());
        Assert.assertEquals(0, boundedType.interfaceBounds().length);
        Assert.assertSame(typeVariable, boundedType.typeVariable());

        // equals & hashCode
        Assert.assertTrue(boundedType.equals(boundedType));
        Assert.assertFalse(boundedType.equals(null));
        Assert.assertFalse(boundedType.equals("NotABoundedType"));
        GenericMetadataSupport.TypeVarBoundedType sameType = new GenericMetadataSupport.TypeVarBoundedType(typeVariable);
        Assert.assertTrue(boundedType.equals(sameType));
        Assert.assertEquals(boundedType.hashCode(), sameType.hashCode());

        // toString
        String stringRepresentation = boundedType.toString();
        Assert.assertTrue(stringRepresentation.indexOf("firstBound") != -1);
        Assert.assertTrue(stringRepresentation.indexOf("interfaceBounds") != -1);
    }

    @Test
    public void wildCardBoundedType_testUpperBoundsContractAndMethods() throws Exception {
        // Arrange
        Method method = WildcardContainer.class.getMethod("getExtendsWildcard");
        ParameterizedType pType = (ParameterizedType) method.getGenericReturnType();
        WildcardType wildcardType = (WildcardType) pType.getActualTypeArguments()[0];
        GenericMetadataSupport.WildCardBoundedType boundedType = new GenericMetadataSupport.WildCardBoundedType(wildcardType);

        // Act & Assert
        Assert.assertEquals(Number.class, boundedType.firstBound());
        Assert.assertEquals(0, boundedType.interfaceBounds().length);
        Assert.assertSame(wildcardType, boundedType.wildCard());

        // equals & hashCode
        Assert.assertTrue(boundedType.equals(boundedType));
        Assert.assertFalse(boundedType.equals(null));
        Assert.assertFalse(boundedType.equals("StringObj"));
        Assert.assertEquals(wildcardType.hashCode(), boundedType.hashCode());

        // toString
        String stringRepresentation = boundedType.toString();
        Assert.assertTrue(stringRepresentation.indexOf("firstBound") != -1);
    }

    @Test
    public void wildCardBoundedType_testLowerBoundsContract() throws Exception {
        // Arrange
        Method method = WildcardContainer.class.getMethod("getSuperWildcard");
        ParameterizedType pType = (ParameterizedType) method.getGenericReturnType();
        WildcardType wildcardType = (WildcardType) pType.getActualTypeArguments()[0];
        GenericMetadataSupport.WildCardBoundedType boundedType = new GenericMetadataSupport.WildCardBoundedType(wildcardType);

        // Act & Assert
        Assert.assertEquals(Integer.class, boundedType.firstBound());
    }

    @Test
    public void resolveGenericReturnType_givenRecursiveTypeVariable_shouldResolveRawTypeProperly() throws Exception {
        // Arrange
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(RecursiveBound.class);
        Method method = RecursiveBound.class.getMethod("getSelf");

        // Act
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);

        // Assert
        Assert.assertNotNull(returnMetadata);
        Assert.assertEquals(RecursiveBound.class, returnMetadata.rawType());
    }

    @Test
    public void resolveGenericReturnType_givenWildcardBoundedTypeVariable_shouldResolveProperly() throws Exception {
        // Arrange
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(WildcardBoundToTypeVar.class);
        Method method = WildcardBoundToTypeVar.class.getMethod("getW");

        // Act
        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);

        // Assert
        Assert.assertNotNull(returnMetadata);
        Assert.assertEquals(List.class, returnMetadata.rawType());
    }

    @Test
    public void extraInterfaces_givenClassWithoutExtraInterfaces_shouldReturnEmpty() {
        // Arrange
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ConcreteType.class);

        // Act & Assert
        Assert.assertEquals(0, metadata.extraInterfaces().size());
        Assert.assertFalse(metadata.hasRawExtraInterfaces());
        Assert.assertEquals(0, metadata.rawExtraInterfaces().length);
    }
}