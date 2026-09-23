package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Test;
import org.junit.Before;

import java.util.*;

import static org.junit.Assert.*;

public class JavaUtilCollectionsDeserializersTest {

    private DeserializationContext ctxt;

    @Before
    public void setUp() {
        ctxt = null; // Not used in these methods
    }

    @Test
    public void testFindForCollection_AsArraysList() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(List.class);
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForCollection(ctxt, type);
        assertNotNull(deser);
    }

    @Test
    public void testFindForCollection_SingletonList() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(List.class);
        // Simulate singleton list class
        List<?> singletonList = Collections.singletonList("a");
        JavaType singletonType = TypeFactory.defaultInstance().constructType(singletonList.getClass());
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForCollection(ctxt, singletonType);
        assertNotNull(deser);
    }

    @Test
    public void testFindForCollection_SingletonSet() throws Exception {
        Set<?> singletonSet = Collections.singleton("a");
        JavaType singletonType = TypeFactory.defaultInstance().constructType(singletonSet.getClass());
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForCollection(ctxt, singletonType);
        assertNotNull(deser);
    }

    @Test
    public void testFindForCollection_UnmodifiableList() throws Exception {
        List<?> unmodList = Collections.unmodifiableList(new ArrayList<Object>());
        JavaType unmodType = TypeFactory.defaultInstance().constructType(unmodList.getClass());
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForCollection(ctxt, unmodType);
        assertNotNull(deser);
    }

    @Test
    public void testFindForCollection_UnmodifiableSet() throws Exception {
        Set<?> unmodSet = Collections.unmodifiableSet(new HashSet<Object>());
        JavaType unmodType = TypeFactory.defaultInstance().constructType(unmodSet.getClass());
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForCollection(ctxt, unmodType);
        assertNotNull(deser);
    }

    @Test
    public void testFindForCollection_UnknownType() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(ArrayList.class);
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForCollection(ctxt, type);
        assertNull(deser);
    }

    @Test
    public void testFindForMap_SingletonMap() throws Exception {
        Map<?,?> singletonMap = Collections.singletonMap("key", "value");
        JavaType mapType = TypeFactory.defaultInstance().constructType(singletonMap.getClass());
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForMap(ctxt, mapType);
        assertNotNull(deser);
    }

    @Test
    public void testFindForMap_UnmodifiableMap() throws Exception {
        Map<?,?> unmodMap = Collections.unmodifiableMap(new HashMap<Object, Object>());
        JavaType mapType = TypeFactory.defaultInstance().constructType(unmodMap.getClass());
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForMap(ctxt, mapType);
        assertNotNull(deser);
    }

    @Test
    public void testFindForMap_UnknownType() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(HashMap.class);
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForMap(ctxt, type);
        assertNull(deser);
    }

    @Test
    public void testConverter_SingletonSet() throws Exception {
        Set<String> input = new HashSet<>();
        input.add("value");
        JavaType inputType = TypeFactory.defaultInstance().constructType(input.getClass());
        JavaUtilCollectionsDeserializers.JavaUtilCollectionsConverter conv =
                JavaUtilCollectionsDeserializers.converter(1, inputType, Set.class);
        
        Object result = conv.convert(input);
        assertTrue(result instanceof Set);
        assertEquals(1, ((Set<?>) result).size());
        assertEquals("value", ((Set<?>) result).iterator().next());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConverter_SingletonSet_InvalidSize() throws Exception {
        Set<String> input = new HashSet<>();
        input.add("a");
        input.add("b");
        JavaType inputType = TypeFactory.defaultInstance().constructType(input.getClass());
        JavaUtilCollectionsDeserializers.JavaUtilCollectionsConverter conv =
                JavaUtilCollectionsDeserializers.converter(1, inputType, Set.class);
        
        conv.convert(input);
    }

    @Test
    public void testConverter_SingletonList() throws Exception {
        List<String> input = Collections.singletonList("value");
        JavaType inputType = TypeFactory.defaultInstance().constructType(input.getClass());
        JavaUtilCollectionsDeserializers.JavaUtilCollectionsConverter conv =
                JavaUtilCollectionsDeserializers.converter(2, inputType, List.class);
        
        Object result = conv.convert(input);
        assertTrue(result instanceof List);
        assertEquals(1, ((List<?>) result).size());
        assertEquals("value", ((List<?>) result).get(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConverter_SingletonList_InvalidSize() throws Exception {
        List<String> input = new ArrayList<>();
        input.add("a");
        input.add("b");
        JavaType inputType = TypeFactory.defaultInstance().constructType(input.getClass());
        JavaUtilCollectionsDeserializers.JavaUtilCollectionsConverter conv =
                JavaUtilCollectionsDeserializers.converter(2, inputType, List.class);
        
        conv.convert(input);
    }

    @Test
    public void testConverter_SingletonMap() throws Exception {
        Map<String, String> input = Collections.singletonMap("key", "value");
        JavaType inputType = TypeFactory.defaultInstance().constructType(input.getClass());
        JavaUtilCollectionsDeserializers.JavaUtilCollectionsConverter conv =
                JavaUtilCollectionsDeserializers.converter(3, inputType, Map.class);
        
        Object result = conv.convert(input);
        assertTrue(result instanceof Map);
        assertEquals(1, ((Map<?,?>) result).size());
        assertEquals("value", ((Map<?,?>) result).get("key"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConverter_SingletonMap_InvalidSize() throws Exception {
        Map<String, String> input = new HashMap<>();
        input.put("a", "1");
        input.put("b", "2");
        JavaType inputType = TypeFactory.defaultInstance().constructType(input.getClass());
        JavaUtilCollectionsDeserializers.JavaUtilCollectionsConverter conv =
                JavaUtilCollectionsDeserializers.converter(3, inputType, Map.class);
        
        conv.convert(input);
    }

    @Test
    public void testConverter_UnmodifiableSet() throws Exception {
        Set<String> input = new HashSet<>();
        input.add("value");
        JavaType inputType = TypeFactory.defaultInstance().constructType(input.getClass());
        JavaUtilCollectionsDeserializers.JavaUtilCollectionsConverter conv =
                JavaUtilCollectionsDeserializers.converter(4, inputType, Set.class);
        
        Object result = conv.convert(input);
        assertTrue(result instanceof Set);
        assertEquals(1, ((Set<?>) result).size());
        assertEquals("value", ((Set<?>) result).iterator().next());
    }

    @Test
    public void testConverter_UnmodifiableList() throws Exception {
        List<String> input = new ArrayList<>();
        input.add("value");
        JavaType inputType = TypeFactory.defaultInstance().constructType(input.getClass());
        JavaUtilCollectionsDeserializers.JavaUtilCollectionsConverter conv =
                JavaUtilCollectionsDeserializers.converter(5, inputType, List.class);
        
        Object result = conv.convert(input);
        assertTrue(result instanceof List);
        assertEquals(1, ((List<?>) result).size());
        assertEquals("value", ((List<?>) result).get(0));
    }

    @Test
    public void testConverter_UnmodifiableMap() throws Exception {
        Map<String, String> input = new HashMap<>();
        input.put("key", "value");
        JavaType inputType = TypeFactory.defaultInstance().constructType(input.getClass());
        JavaUtilCollectionsDeserializers.JavaUtilCollectionsConverter conv =
                JavaUtilCollectionsDeserializers.converter(6, inputType, Map.class);
        
        Object result = conv.convert(input);
        assertTrue(result instanceof Map);
        assertEquals(1, ((Map<?,?>) result).size());
        assertEquals("value", ((Map<?,?>) result).get("key"));
    }

    @Test
    public void testConverter_AsList() throws Exception {
        List<String> input = new ArrayList<>();
        input.add("value");
        JavaType inputType = TypeFactory.defaultInstance().constructType(input.getClass());
        JavaUtilCollectionsDeserializers.JavaUtilCollectionsConverter conv =
                JavaUtilCollectionsDeserializers.converter(7, inputType, List.class);
        
        Object result = conv.convert(input);
        assertSame(input, result);
    }

    @Test
    public void testConverter_DefaultCase() throws Exception {
        List<String> input = new ArrayList<>();
        input.add("value");
        JavaType inputType = TypeFactory.defaultInstance().constructType(input.getClass());
        JavaUtilCollectionsDeserializers.JavaUtilCollectionsConverter conv =
                JavaUtilCollectionsDeserializers.converter(99, inputType, List.class);
        
        Object result = conv.convert(input);
        assertSame(input, result);
    }

    @Test
    public void testConverter_NullValue() throws Exception {
        JavaType inputType = TypeFactory.defaultInstance().constructType(Object.class);
        JavaUtilCollectionsDeserializers.JavaUtilCollectionsConverter conv =
                JavaUtilCollectionsDeserializers.converter(1, inputType, Object.class);
        
        Object result = conv.convert(null);
        assertNull(result);
    }

    @Test
    public void testConverter_GetInputType() throws Exception {
        JavaType inputType = TypeFactory.defaultInstance().constructType(List.class);
        JavaUtilCollectionsDeserializers.JavaUtilCollectionsConverter conv =
                JavaUtilCollectionsDeserializers.converter(1, inputType, List.class);
        
        assertSame(inputType, conv.getInputType(TypeFactory.defaultInstance()));
    }

    @Test
    public void testConverter_GetOutputType() throws Exception {
        JavaType inputType = TypeFactory.defaultInstance().constructType(List.class);
        JavaUtilCollectionsDeserializers.JavaUtilCollectionsConverter conv =
                JavaUtilCollectionsDeserializers.converter(1, inputType, List.class);
        
        assertSame(inputType, conv.getOutputType(TypeFactory.defaultInstance()));
    }
}