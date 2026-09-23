package com.fasterxml.jackson.databind.module;

import static org.junit.Assert.*;
import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.util.*;

public class SimpleAbstractTypeResolverTest {

    private static class TestAbstractClass extends AbstractList<String> {
        @Override
        public String get(int index) { return null; }
        @Override
        public int size() { return 0; }
    }

    private static class TestConcreteClass extends TestAbstractClass {}

    private static class TestUnrelatedClass {}

    private static class TestConcreteSubclass extends TestConcreteClass {}

    private final SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
    private final DeserializationConfig config = null; // Not used in methods under test

    @Test
    public void testAddMappingAndFindTypeMappingNormal() {
        resolver.addMapping(AbstractList.class, LinkedList.class);
        JavaType abstractType = TypeFactory.defaultInstance().constructType(AbstractList.class);
        JavaType result = resolver.findTypeMapping(config, abstractType);
        assertNotNull(result);
        assertEquals(LinkedList.class, result.getRawClass());
    }

    @Test
    public void testAddMappingWithInterface() {
        resolver.addMapping(List.class, LinkedList.class);
        JavaType abstractType = TypeFactory.defaultInstance().constructType(List.class);
        JavaType result = resolver.findTypeMapping(config, abstractType);
        assertNotNull(result);
        assertEquals(LinkedList.class, result.getRawClass());
    }

    @Test
    public void testAddMappingBoundaryWithDirectSubclass() {
        resolver.addMapping(TestAbstractClass.class, TestConcreteClass.class);
        JavaType abstractType = TypeFactory.defaultInstance().constructType(TestAbstractClass.class);
        JavaType result = resolver.findTypeMapping(config, abstractType);
        assertNotNull(result);
        assertEquals(TestConcreteClass.class, result.getRawClass());
    }

    @Test
    public void testAddMappingWithDeepSubclass() {
        resolver.addMapping(TestAbstractClass.class, TestConcreteSubclass.class);
        JavaType abstractType = TypeFactory.defaultInstance().constructType(TestAbstractClass.class);
        JavaType result = resolver.findTypeMapping(config, abstractType);
        assertNotNull(result);
        assertEquals(TestConcreteSubclass.class, result.getRawClass());
    }

    @Test
    public void testFindTypeMappingNoMapping() {
        JavaType abstractType = TypeFactory.defaultInstance().constructType(TestAbstractClass.class);
        JavaType result = resolver.findTypeMapping(config, abstractType);
        assertNull(result);
    }

    @Test
    public void testFindTypeMappingNullInput() {
        assertNull(resolver.findTypeMapping(config, null));
    }

    @Test
    public void testFindTypeMappingWithNullRawClass() {
        JavaType nullType = TypeFactory.defaultInstance().constructType(Void.class);
        assertNull(resolver.findTypeMapping(config, nullType));
    }

    @Test
    public void testFindTypeMappingWithUnrelatedType() {
        resolver.addMapping(TestAbstractClass.class, TestConcreteClass.class);
        JavaType unrelatedType = TypeFactory.defaultInstance().constructType(TestUnrelatedClass.class);
        assertNull(resolver.findTypeMapping(config, unrelatedType));
    }

    @Test
    public void testAddMappingSameClassThrows() {
        try {
            resolver.addMapping(TestAbstractClass.class, TestAbstractClass.class);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAddMappingNonSubtypeThrows() {
        try {
            resolver.addMapping(TestAbstractClass.class, TestUnrelatedClass.class);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAddMappingNonAbstractSuperTypeThrows() {
        try {
            resolver.addMapping(String.class, String.class);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAddMappingStringToObjectThrows() {
        try {
            resolver.addMapping(String.class, Object.class);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAddMappingInterfaceToImpl() {
        resolver.addMapping(Collection.class, ArrayList.class);
        JavaType type = TypeFactory.defaultInstance().constructType(Collection.class);
        JavaType result = resolver.findTypeMapping(config, type);
        assertNotNull(result);
        assertEquals(ArrayList.class, result.getRawClass());
    }

    @Test
    public void testAddMultipleMappings() {
        resolver.addMapping(List.class, LinkedList.class);
        resolver.addMapping(Collection.class, ArrayList.class);
        resolver.addMapping(AbstractList.class, Vector.class);

        JavaType listType = TypeFactory.defaultInstance().constructType(List.class);
        JavaType collType = TypeFactory.defaultInstance().constructType(Collection.class);
        JavaType abstractListType = TypeFactory.defaultInstance().constructType(AbstractList.class);

        assertEquals(LinkedList.class, resolver.findTypeMapping(config, listType).getRawClass());
        assertEquals(ArrayList.class, resolver.findTypeMapping(config, collType).getRawClass());
        assertEquals(Vector.class, resolver.findTypeMapping(config, abstractListType).getRawClass());
    }

    @Test
    public void testOverrideMapping() {
        resolver.addMapping(List.class, LinkedList.class);
        resolver.addMapping(List.class, ArrayList.class);
        JavaType listType = TypeFactory.defaultInstance().constructType(List.class);
        JavaType result = resolver.findTypeMapping(config, listType);
        assertNotNull(result);
        assertEquals(ArrayList.class, result.getRawClass());
    }

    @Test
    public void testFindTypeMappingWithGenericType() {
        resolver.addMapping(List.class, LinkedList.class);
        JavaType genericType = TypeFactory.defaultInstance().constructCollectionType(List.class, String.class);
        JavaType result = resolver.findTypeMapping(config, genericType);
        assertNotNull(result);
        assertEquals(LinkedList.class, result.getRawClass());
    }

    @Test
    public void testFindTypeMappingTypeParameterRetained() {
        resolver.addMapping(List.class, LinkedList.class);
        JavaType genericType = TypeFactory.defaultInstance().constructCollectionType(List.class, Integer.class);
        JavaType result = resolver.findTypeMapping(config, genericType);
        assertNotNull(result);
        assertEquals(LinkedList.class, result.getRawClass());
    }

    @Test
    public void testResolveAbstractTypeReturnsNull() {
        JavaType type = TypeFactory.defaultInstance().constructType(TestAbstractClass.class);
        assertNull(resolver.resolveAbstractType(config, type));
    }

    @Test
    public void testResolveAbstractTypeWithNullReturnsNull() {
        assertNull(resolver.resolveAbstractType(config, null));
    }

    @Test
    public void testFindTypeMappingWithAbstractSuper() {
        resolver.addMapping(AbstractList.class, LinkedList.class);
        JavaType listType = TypeFactory.defaultInstance().constructType(AbstractList.class);
        JavaType result = resolver.findTypeMapping(config, listType);
        assertNotNull(result);
        assertEquals(LinkedList.class, result.getRawClass());
    }

    @Test
    public void testAddMappingWithPublicConcreteSubclass() {
        resolver.addMapping(AbstractCollection.class, HashSet.class);
        JavaType type = TypeFactory.defaultInstance().constructType(AbstractCollection.class);
        JavaType result = resolver.findTypeMapping(config, type);
        assertNotNull(result);
        assertEquals(HashSet.class, result.getRawClass());
    }

    @Test
    public void testAddMappingWithNonPublicConcrete() {
        resolver.addMapping(AbstractList.class, TestConcreteClass.class);
        JavaType type = TypeFactory.defaultInstance().constructType(AbstractList.class);
        JavaType result = resolver.findTypeMapping(config, type);
        assertNotNull(result);
        assertEquals(TestConcreteClass.class, result.getRawClass());
    }
}