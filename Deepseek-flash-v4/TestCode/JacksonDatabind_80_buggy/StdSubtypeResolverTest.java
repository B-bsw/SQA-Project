package com.fasterxml.jackson.databind.jsontype.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import org.junit.Before;
import org.junit.Test;

public class StdSubtypeResolverTest {

    private StdSubtypeResolver resolver;
    private ObjectMapper mapper;
    private MapperConfig<?> config;

    @Before
    public void setUp() {
        resolver = new StdSubtypeResolver();
        mapper = new ObjectMapper();
        config = mapper.getSerializationConfig();
    }

    static class Animal {}
    static class Dog extends Animal {}
    static class Cat extends Animal {}
    @JsonTypeName("rex")
    static class Rex extends Animal {}

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
    @JsonSubTypes({
        @JsonSubTypes.Type(value = AnnotatedDog.class, name = "dog"),
        @JsonSubTypes.Type(value = AnnotatedCat.class, name = "cat")
    })
    abstract static class AnnotatedMammal {}

    @JsonTypeName("dog")
    static class AnnotatedDog extends AnnotatedMammal {}

    @JsonTypeName("cat")
    static class AnnotatedCat extends AnnotatedMammal {}

    static class Container {
        @JsonSubTypes({
            @JsonSubTypes.Type(value = Dog.class, name = "dog"),
            @JsonSubTypes.Type(value = Cat.class, name = "cat")
        })
        public Animal pet;
    }

    @Test
    public void testRegisterSubtypesWithNamedTypes() {
        resolver.registerSubtypes(new NamedType(Dog.class, "dog"), new NamedType(Cat.class, "cat"));
        Collection<NamedType> registered = getRegisteredSubtypes();
        assertEquals(2, registered.size());
        assertTrue(registered.contains(new NamedType(Dog.class, "dog")));
        assertTrue(registered.contains(new NamedType(Cat.class, "cat")));
    }

    @Test
    public void testRegisterSubtypesWithClasses() {
        resolver.registerSubtypes(Dog.class, Cat.class, Rex.class);
        Collection<NamedType> registered = getRegisteredSubtypes();
        assertEquals(3, registered.size());
        assertTrue(registered.contains(new NamedType(Dog.class)));
        assertTrue(registered.contains(new NamedType(Cat.class)));
        assertTrue(registered.contains(new NamedType(Rex.class)));
    }

    @Test
    public void testRegisterSubtypesWithEmptyNamedTypeArrayInitializesSet() {
        resolver.registerSubtypes(new NamedType[0]);
        assertNotNull(getRegisteredSubtypes());
        assertEquals(0, getRegisteredSubtypes().size());
    }

    @Test(expected = NullPointerException.class)
    public void testRegisterSubtypesNullNamedTypeArrayThrowsNPE() {
        resolver.registerSubtypes((NamedType[]) null);
    }

    @Test(expected = NullPointerException.class)
    public void testRegisterSubtypesNullClassArrayThrowsNPE() {
        resolver.registerSubtypes((Class<?>[]) null);
    }

    @Test
    public void testCollectAndResolveSubtypesByClassNoRegistered() {
        AnnotatedClass animalClass = annotatedClass(Animal.class);
        Collection<NamedType> result = resolver.collectAndResolveSubtypesByClass(config, animalClass);
        assertEquals(1, result.size());
        assertSame(Animal.class, result.iterator().next().getType());
    }

    @Test
    public void testCollectAndResolveSubtypesByClassWithRegisteredAndTypeNames() {
        resolver.registerSubtypes(new NamedType(Dog.class, "dog"), new NamedType(Cat.class, "cat"),
                new NamedType(Rex.class), new NamedType(String.class, "string"));
        AnnotatedClass animalClass = annotatedClass(Animal.class);
        Collection<NamedType> result = resolver.collectAndResolveSubtypesByClass(config, animalClass);
        assertEquals(4, result.size());
        assertContainsType(result, Animal.class);
        assertContainsNamed(result, "dog");
        assertContainsNamed(result, "cat");
        assertContainsNamed(result, "rex");
        assertNotContainsType(result, String.class);
    }

    @Test
    public void testCollectAndResolveSubtypesByClassUsesAnnotatedSubtypes() {
        AnnotatedClass mammalClass = annotatedClass(AnnotatedMammal.class);
        Collection<NamedType> result = resolver.collectAndResolveSubtypesByClass(config, mammalClass);
        assertEquals(3, result.size());
        assertContainsType(result, AnnotatedMammal.class);
        assertContainsNamed(result, "dog");
        assertContainsNamed(result, "cat");
    }

    @Test
    public void testCollectAndResolveSubtypesByClassUsesPropertyAnnotationsWithNullBaseType() {
        AnnotatedClass containerClass = annotatedClass(Container.class);
        AnnotatedField petField = findField(containerClass, "pet");
        Collection<NamedType> result = resolver.collectAndResolveSubtypesByClass(config, petField, null);
        assertEquals(3, result.size());
        assertContainsType(result, Animal.class);
        assertContainsNamed(result, "dog");
        assertContainsNamed(result, "cat");
    }

    @Test
    public void testCollectAndResolveSubtypesByTypeIdAnnotatedBase() {
        AnnotatedClass mammalClass = annotatedClass(AnnotatedMammal.class);
        Collection<NamedType> result = resolver.collectAndResolveSubtypesByTypeId(config, mammalClass);
        assertEquals(2, result.size());
        assertContainsNamed(result, "dog");
        assertContainsNamed(result, "cat");
        assertNotContainsType(result, AnnotatedMammal.class);
    }

    @Test
    public void testCollectAndResolveSubtypesByTypeIdConcreteBaseIncludesItself() {
        AnnotatedClass dogClass = annotatedClass(Dog.class);
        Collection<NamedType> result = resolver.collectAndResolveSubtypesByTypeId(config, dogClass);
        assertEquals(1, result.size());
        assertSame(Dog.class, result.iterator().next().getType());
    }

    @Test
    public void testCollectAndResolveSubtypesByTypeIdUsesPropertyAnnotations() {
        AnnotatedClass containerClass = annotatedClass(Container.class);
        AnnotatedField petField = findField(containerClass, "pet");
        JavaType baseType = mapper.getTypeFactory().constructType(Animal.class);
        Collection<NamedType> result = resolver.collectAndResolveSubtypesByTypeId(config, petField, baseType);
        assertEquals(3, result.size());
        assertContainsType(result, Animal.class);
        assertContainsNamed(result, "dog");
        assertContainsNamed(result, "cat");
    }

    @Test
    public void testCollectAndResolveSubtypesByTypeIdUsesRegisteredTypeName() {
        resolver.registerSubtypes(new NamedType(Rex.class));
        AnnotatedClass animalClass = annotatedClass(Animal.class);
        Collection<NamedType> result = resolver.collectAndResolveSubtypesByTypeId(config, animalClass);
        assertEquals(2, result.size());
        assertContainsType(result, Animal.class);
        assertContainsNamed(result, "rex");
    }

    @Test(expected = NullPointerException.class)
    public void testCollectAndResolveSubtypesByClassNullConfigThrowsNPE() {
        AnnotatedClass animalClass = annotatedClass(Animal.class);
        resolver.collectAndResolveSubtypesByClass(null, animalClass);
    }

    private Collection<NamedType> getRegisteredSubtypes() {
        return resolver._registeredSubtypes;
    }

    private AnnotatedClass annotatedClass(Class<?> cls) {
        return config.introspectClassAnnotations(mapper.getTypeFactory().constructType(cls));
    }

    private AnnotatedField findField(AnnotatedClass annotatedClass, String fieldName) {
        for (AnnotatedField f : annotatedClass.fields()) {
            if (fieldName.equals(((java.lang.reflect.Field) f.getAnnotated()).getName())) {
                return f;
            }
        }
        fail("Could not find field '" + fieldName + "' in " + annotatedClass.getRawType().getName());
        return null;
    }

    private static void assertContainsType(Collection<NamedType> types, Class<?> type) {
        for (NamedType nt : types) {
            if (type.equals(nt.getType())) {
                return;
            }
        }
        fail("Expected type " + type.getName() + " not found in " + types);
    }

    private static void assertNotContainsType(Collection<NamedType> types, Class<?> type) {
        for (NamedType nt : types) {
            if (type.equals(nt.getType())) {
                fail("Unexpected type " + type.getName() + " found in " + types);
            }
        }
    }

    private static void assertContainsNamed(Collection<NamedType> types, String name) {
        for (NamedType nt : types) {
            if (name.equals(nt.getName())) {
                return;
            }
        }
        fail("Expected name '" + name + "' not found in " + types);
    }
}