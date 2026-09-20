package com.fasterxml.jackson.databind.module;

import java.util.*;

import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class SimpleAbstractTypeResolverTest
{
    // Helper concrete class extending a concrete superclass, used to test
    // the "superType not abstract" exception path.
    static class MyArrayList extends ArrayList<Object> {
        private static final long serialVersionUID = 1L;
    }

    private final ObjectMapper mapper = new ObjectMapper();
    private final DeserializationConfig config = mapper.getDeserializationConfig();
    private final TypeFactory tf = TypeFactory.defaultInstance();

    // ---------------------------------------------------------------
    // addMapping tests
    // ---------------------------------------------------------------

    @Test
    public void testAddMappingNormalCase()
    {
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        SimpleAbstractTypeResolver returned = resolver.addMapping(List.class, LinkedList.class);
        // Should return same instance to allow chaining
        assertSame(resolver, returned);
        assertEquals(1, resolver._mappings.size());
    }

    @Test
    public void testAddMappingChaining()
    {
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        SimpleAbstractTypeResolver returned = resolver
                .addMapping(List.class, LinkedList.class)
                .addMapping(Collection.class, ArrayList.class);
        assertSame(resolver, returned);
        assertEquals(2, resolver._mappings.size());
    }

    @Test
    public void testAddMappingThrowsWhenSameClass()
    {
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        try {
            resolver.addMapping(List.class, List.class);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Can not add mapping from class to itself"));
        }
    }

    @Test
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public void testAddMappingThrowsWhenNotSubtype()
    {
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        Class rawSubType = HashMap.class; // Not a subtype of List
        try {
            resolver.addMapping(List.class, rawSubType);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("is not a subtype of former"));
        }
    }

    @Test
    public void testAddMappingThrowsWhenSuperTypeNotAbstract()
    {
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        try {