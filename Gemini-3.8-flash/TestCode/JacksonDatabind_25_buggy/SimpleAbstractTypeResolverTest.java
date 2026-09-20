package com.fasterxml.jackson.databind.module;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class SimpleAbstractTypeResolverTest {

    private SimpleAbstractTypeResolver resolver;

    public static abstract class CustomAbstractBase {
    }

    public static class CustomConcreteImpl extends CustomAbstractBase {
    }

    public static class NonAbstractBase {
    }

    public static class ConcreteSubclass extends NonAbstractBase {
    }

    @Before
    public void setUp() {
        resolver = new SimpleAbstractTypeResolver();
    }

    @Test
    public void addMapping_givenSelfClassMapping_shouldThrowIllegalArgumentException() {
        // Arrange
        Class<CustomAbstractBase> selfClass = CustomAbstractBase.class;

        // Act & Assert
        try {
            resolver.addMapping(selfClass, selfClass);
            Assert.fail("Expected IllegalArgumentException when mapping class to itself");
        } catch (IllegalArgumentException ex) {
            Assert.assertEquals("Can not add mapping from class to itself", ex.getMessage());
        }
    }

    @Test
    @SuppressWarnings("unchecked")
    public void addMapping_givenUnrelatedTypes_shouldThrowIllegalArgumentException() {
        // Arrange
        Class<List> superType = List.class;
        Class<Map> notASubType = Map.class;

        // Act & Assert
        try {
            resolver.addMapping((Class<Object>) (Class<?>) superType, (Class<Object>) (Class<?>) notASubType);
            Assert.fail("Expected IllegalArgumentException when subType is not assignable to superType");
        } catch (IllegalArgumentException ex) {
            String expectedMessage = "Can not add mapping from class " + superType.getName()
                    + " to " + notASubType.getName() + ", as latter is not a subtype of former";
            Assert.assertEquals(expectedMessage, ex.getMessage());
        }
    }

    @Test
    @SuppressWarnings("unchecked")
    public void addMapping_givenConcreteSuperType_shouldThrowIllegalArgumentException() {
        // Arrange
        Class<NonAbstractBase> concreteSuper = NonAbstractBase.class;
        Class<ConcreteSubclass> concreteSub = ConcreteSubclass.class;

        // Act & Assert
        try {
            resolver.addMapping((Class<NonAbstractBase>) concreteSuper, concreteSub);
            Assert.fail("Expected IllegalArgumentException when superType is not abstract");
        } catch (IllegalArgumentException ex) {
            String expectedMessage = "Can not add mapping from class " + concreteSuper.getName()
                    + " since it is not abstract";
            Assert.assertEquals(expectedMessage, ex.getMessage());
        }
    }

    @Test
    public void addMapping_givenValidAbstractInterfaceAndConcreteClass_shouldReturnSameResolverInstance() {
        // Arrange
        Class<List> interfaceType = List.class;
        Class<ArrayList> concreteType = ArrayList.class;

        // Act
        SimpleAbstractTypeResolver result = resolver.addMapping(interfaceType, concreteType);

        // Assert
        Assert.assertSame("addMapping should return this instance for chaining", resolver, result);
    }

    @Test
    public void addMapping_givenValidAbstractClassAndConcreteClass_shouldMapSuccessfully() {
        // Arrange
        Class<CustomAbstractBase> abstractBase = CustomAbstractBase.class;
        Class<CustomConcreteImpl> concreteImpl = CustomConcreteImpl.class;

        // Act
        SimpleAbstractTypeResolver result = resolver.addMapping(abstractBase, concreteImpl);

        // Assert
        Assert.assertNotNull(result);
        JavaType baseType = TypeFactory.defaultInstance().constructType(abstractBase);
        JavaType mappedType = resolver.findTypeMapping(null, baseType);
        Assert.assertNotNull(mappedType);
        Assert.assertEquals(concreteImpl, mappedType.getRawClass());
    }

    @Test
    public void findTypeMapping_givenUnmappedType_shouldReturnNull() {
        // Arrange
        JavaType unmappedType = TypeFactory.defaultInstance().constructType(Map.class);

        // Act
        JavaType result = resolver.findTypeMapping(null, unmappedType);

        // Assert
        Assert.assertNull("Unmapped type must resolve to null", result);
    }

    @Test
    public void findTypeMapping_givenMappedAbstractType_shouldReturnNarrowedJavaType() {
        // Arrange
        resolver.addMapping(Collection.class, ArrayList.class);
        JavaType collectionType = TypeFactory.defaultInstance().constructType(Collection.class);

        // Act
        JavaType mappedType = resolver.findTypeMapping(null, collectionType);

        // Assert
        Assert.assertNotNull("Mapped type should not be null", mappedType);
        Assert.assertEquals(ArrayList.class, mappedType.getRawClass());
    }

    @Test
    public void resolveAbstractType_givenAnyType_shouldAlwaysReturnNull() {
        // Arrange
        JavaType abstractType = TypeFactory.defaultInstance().constructType(CustomAbstractBase.class);

        // Act
        JavaType result = resolver.resolveAbstractType(null, abstractType);

        // Assert
        Assert.assertNull("resolveAbstractType must always return null", result);
    }

    @Test
    public void serialization_givenConfiguredResolver_shouldPreserveMappingsAcrossSerialization() throws Exception {
        // Arrange
        resolver.addMapping(Collection.class, ArrayList.class);
        resolver.addMapping(Map.class, HashMap.class);

        // Act: Serialize
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(byteOut);
        out.writeObject(resolver);
        out.close();

        // Act: Deserialize
        ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
        ObjectInputStream in = new ObjectInputStream(byteIn);
        SimpleAbstractTypeResolver deserializedResolver = (SimpleAbstractTypeResolver) in.readObject();
        in.close();

        // Assert
        Assert.assertNotNull(deserializedResolver);
        JavaType colType = TypeFactory.defaultInstance().constructType(Collection.class);
        JavaType mapType = TypeFactory.defaultInstance().constructType(Map.class);

        JavaType resolvedCol = deserializedResolver.findTypeMapping(null, colType);
        JavaType resolvedMap = deserializedResolver.findTypeMapping(null, mapType);

        Assert.assertNotNull(resolvedCol);
        Assert.assertEquals(ArrayList.class, resolvedCol.getRawClass());
        Assert.assertNotNull(resolvedMap);
        Assert.assertEquals(HashMap.class, resolvedMap.getRawClass());
    }
}