package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import java.io.IOException;
import java.util.*;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

public class StringCollectionDeserializerTest {

    private static class TestValueInstantiator extends ValueInstantiator {
        @Override
        public String getValueTypeDesc() { return "TestCollection"; }
        @Override
        public Collection<String> createUsingDefault(DeserializationContext ctxt) throws IOException {
            return new ArrayList<String>();
        }
        @Override
        public Collection<String> createUsingDelegate(DeserializationContext ctxt, Object delegate) throws IOException {
            return (Collection<String>) delegate;
        }
        @Override
        public AnnotatedWithParams getDelegateCreator() { return null; }
        @Override
        public JavaType getDelegateType(DeserializationConfig config) { return null; }
    }

    private static class StringDeser extends JsonDeserializer<String> {
        @Override
        public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return "custom:" + p.getText();
        }
    }

    private static class NullDeser extends JsonDeserializer<String> {
        @Override
        public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }
        @Override
        public String getNullValue(DeserializationContext ctxt) { return "null-string"; }
    }

    private static class TestNullProvider implements NullValueProvider {
        @Override
        public Object getNullValue(DeserializationContext ctxt) { return "null-provider"; }
    }

    private JsonFactory factory;
    private DeserializationContext ctxt;
    private JavaType collectionType;
    private TestValueInstantiator instantiator;

    @Before
    public void setUp() throws Exception {
        factory = new JsonFactory();
        ctxt = new DefaultDeserializationContext.Impl(new ObjectMapper().getDeserializationConfig());
        collectionType = TypeFactory.defaultInstance().constructCollectionType(ArrayList.class, String.class);
        instantiator = new TestValueInstantiator();
    }

    @After
    public void tearDown() { factory = null; ctxt = null; collectionType = null; instantiator = null; }

    private JsonParser createParser(String json) throws IOException {
        return factory.createParser(json.getBytes());
    }

    // Test constructor with custom value deserializer
    @Test
    public void testConstructorWithCustomValueDeserializer() {
        JsonDeserializer<String> valueDeser = new StringDeser();
        StringCollectionDeserializer deser = new StringCollectionDeserializer(collectionType, valueDeser, instantiator);
        assertNotNull(deser.getContentDeserializer());
        assertEquals(valueDeser, deser.getContentDeserializer());
    }

    // Test constructor with null value deserializer
    @Test
    public void testConstructorWithNullValueDeserializer() {
        StringCollectionDeserializer deser = new StringCollectionDeserializer(collectionType, null, instantiator);
        assertNull(deser.getContentDeserializer());
    }

    // Test isCachable returns true when both deserializers are null
    @Test
    public void testIsCachableWhenBothDeserializersNull() {
        StringCollectionDeserializer deser = new StringCollectionDeserializer(collectionType, null, instantiator);
        assertTrue(deser.isCachable());
    }

    // Test isCachable returns false when value deserializer is present
    @Test
    public void testIsCachableWithValueDeserializer() {
        StringCollectionDeserializer deser = new StringCollectionDeserializer(collectionType, new StringDeser(), instantiator);
        assertFalse(deser.isCachable());
    }

    // Test isCachable returns false when delegate deserializer is present
    @Test
    public void testIsCachableWithDelegateDeserializer() {
        StringCollectionDeserializer deser = new StringCollectionDeserializer(collectionType, instantiator, 
                new StringDeser(), null, null, null);
        assertFalse(deser.isCachable());
    }

    // Test getContentDeserializer with custom deserializer
    @Test
    public void testGetContentDeserializerWithCustom() {
        JsonDeserializer<String> valueDeser = new StringDeser();
        StringCollectionDeserializer deser = new StringCollectionDeserializer(collectionType, valueDeser, instantiator);
        assertEquals(valueDeser, deser.getContentDeserializer());
    }

    // Test getValueInstantiator returns correct instantiator
    @Test
    public void testGetValueInstantiator() {
        StringCollectionDeserializer deser = new StringCollectionDeserializer(collectionType, instantiator, 
                null, new StringDeser(), null, null);
        assertEquals(instantiator, deser.getValueInstantiator());
    }

    // Test deserialize with standard value deserializer (null in constructor)
    @Test
    public void testDeserializeStandard() throws IOException {
        StringCollectionDeserializer deser = new StringCollectionDeserializer(collectionType, instantiator);
        JsonParser p = createParser("[\"a\",\"b\",\"c\"]");
        p.nextToken(); // move to START_ARRAY
        Collection<String> result = deser.deserialize(p, ctxt);
        assertEquals(Arrays.asList("a","b","c"), result);
    }

    // Test deserialize with custom value deserializer
    @Test
    public void testDeserializeWithCustomValueDeserializer() throws IOException {
        StringCollectionDeserializer deser = new StringCollectionDeserializer(collectionType, instantiator);
        JsonDeserializer<String> valueDeser = new StringDeser();
        StringCollectionDeserializer custom = deser.withResolved(null, valueDeser, null, null);
        JsonParser p = createParser("[\"x\",\"y\"]");
        p.nextToken();
        Collection<String> result = custom.deserialize(p, ctxt);
        assertEquals(Arrays.asList("custom:x","custom:y"), result);
    }

    // Test deserialize with null in array and skipping null values
    @Test
    public void testDeserializeWithNullSkip() throws IOException {
        StringCollectionDeserializer deser = new StringCollectionDeserializer(collectionType, instantiator);
        StringCollectionDeserializer custom = deser.withResolved(null, null, new TestNullProvider(), null);
        JsonParser p = createParser("[\"a\",null,\"b\"]");
        p.nextToken();
        Collection<String> result = custom.deserialize(p, ctxt);
        assertEquals(Arrays.asList("a","b"), result);
    }

    // Test deserialize with null and no skip (should add null)
    @Test
    public void testDeserializeWithNullNoSkip() throws IOException {
        StringCollectionDeserializer deser = new StringCollectionDeserializer(collectionType, instantiator);
        StringCollectionDeserializer custom = deser.withResolved(null, null, new TestNullProvider(), null);
        JsonParser p = createParser("[\"a\",null,\"b\"]");
        p.nextToken();
        Collection<String> result = custom.deserialize(p, ctxt);
        assertEquals(Arrays.asList("a","null-provider","b"), result);
    }

    // Test deserialize with empty array
    @Test
    public void testDeserializeEmptyArray() throws IOException {
        StringCollectionDeserializer deser = new StringCollectionDeserializer(collectionType, instantiator);
        JsonParser p = createParser("[]");
        p.nextToken();
        Collection<String> result = deser.deserialize(p, ctxt);
        assertTrue(result.isEmpty());
    }

    // Test deserialize with single value (non-array) when ACCEPT_SINGLE_VALUE_AS_ARRAY disabled
    @Test(expected = JsonMappingException.class)
    public void testDeserializeSingleValueNotAccepted() throws IOException {
        StringCollectionDeserializer deser = new StringCollectionDeserializer(collectionType, instantiator);
        JsonParser p = createParser("\"single\"");
        p.nextToken(); // VALUE_STRING
        deser.deserialize(p, ctxt);
    }

    // Test deserialize with single value when ACCEPT_SINGLE_VALUE_AS_ARRAY enabled via constructor
    @Test
    public void testDeserializeSingleValueAccepted() throws IOException {
        StringCollectionDeserializer deser = new StringCollectionDeserializer(collectionType, instantiator);
        StringCollectionDeserializer custom = deser.withResolved(null, null, null, Boolean.TRUE);
        JsonParser p = createParser("\"single\"");
        p.nextToken();
        Collection<String> result = custom.deserialize(p, ctxt);
        assertEquals(Collections.singletonList("single"), result);
    }

    // Test deserializeWithType delegates to typeDeserializer
    @Test
    public void testDeserializeWithType() throws IOException {
        TypeDeserializer typeDeserializer = new TypeDeserializer() {
            @Override
            public Object deserializeTypedFromArray(JsonParser p, DeserializationContext ctxt) throws IOException {
                return "typed";
            }
            // Other abstract methods - minimal stubs
            @Override public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) { return null; }
            @Override public Object deserializeTypedFromScalar(JsonParser p, DeserializationContext ctxt) { return null; }
            @Override public Object deserializeTypedFromAny(JsonParser p, DeserializationContext ctxt) { return null; }
            @Override public TypeDeserializer forProperty(BeanProperty prop) { return this; }
            @Override public JavaType getTypeIdResolver(DeserializationConfig config) { return null; }
            @Override public Class<?> getDefaultImpl() { return null; }
            @Override public String getTypeIdResolutionId() { return null; }
        };
        StringCollectionDeserializer deser = new StringCollectionDeserializer(collectionType, instantiator);
        JsonParser p = createParser("[1]");
        p.nextToken(); // START_ARRAY
        StringCollectionDeserializer.this = deser; // can't do this - just call via instance
        Object result = deser.deserializeWithType(p, ctxt, typeDeserializer);
        assertEquals("typed", result);
    }

    // Test handleNonArray with single value that is a string
    @Test
    public void testHandleNonArrayStringValue() throws IOException {
        StringCollectionDeserializer deser = new StringCollectionDeserializer(collectionType, instantiator);
        StringCollectionDeserializer custom = deser.withResolved(null, null, null, Boolean.TRUE);
        JsonParser p = createParser("\"hello\"");
        p.nextToken(); // VALUE_STRING
        Collection<String> result = custom.deserialize(p, ctxt);
        assertEquals(Collections.singletonList("hello"), result);
    }

    // Test handleNonArray with single null value
    @Test
    public void testHandleNonArrayNullValue() throws IOException {
        StringCollectionDeserializer deser = new StringCollectionDeserializer(collectionType, instantiator);
        StringCollectionDeserializer custom = deser.withResolved(null, null, new TestNullProvider(), null);
        JsonParser p = createParser("null");
        p.nextToken(); // VALUE_NULL
        Collection<String> result = custom.deserialize(p, ctxt);
        assertEquals(Collections.singletonList("null-provider"), result);
    }

    // Test handleNonArray with null and skip nulls
    @Test
    public void testHandleNonArrayNullSkip() throws IOException {
        StringCollectionDeserializer deser = new StringCollectionDeserializer(collectionType, instantiator);
        StringCollectionDeserializer custom = deser.withResolved(null, null, new TestNullProvider(), null);
        JsonParser p = createParser("null");
        p.nextToken(); // VALUE_NULL
        Collection<String> result = custom.deserialize(p, ctxt);
        assertEquals(Collections.singletonList("null-provider"), result);
    }

    // Test deserializeUsingCustom with mixed tokens
    @Test
    public void testDeserializeUsingCustomMixedTokens() throws IOException {
        StringCollectionDeserializer deser = new StringCollectionDeserializer(collectionType, instantiator);
        StringCollectionDeserializer custom = deser.withResolved(null, new StringDeser(), null, null);
        JsonParser p = createParser("[\"a\",\"b\"]");
        p.nextToken(); // START_ARRAY
        p.nextToken(); // VALUE_STRING "a"
        Collection<String> result = custom.deserialize(p, ctxt);
        assertEquals(Arrays.asList("custom:a","custom:b"), result);
    }

    // Test withResolved returns same instance when arguments are equal
    @Test
    public void testWithResolvedSameInstance() {
        StringCollectionDeserializer deser = new StringCollectionDeserializer(collectionType, instantiator);
        assertSame(deser, deser.withResolved(null, null, null, null));
    }

    // Test withResolved creates new instance when arguments differ
    @Test
    public void testWithResolvedDifferentInstance() {
        StringCollectionDeserializer deser = new StringCollectionDeserializer(collectionType, instantiator);
        assertNotSame(deser, deser.withResolved(new StringDeser(), null, null, null));
    }

    // Test createContextual with custom value deserializer
    @Test
    public void testCreateContextualWithCustomValueDeser() throws JsonMappingException {
        JsonDeserializer<String> valueDeser = new StringDeser();
        StringCollectionDeserializer deser = new StringCollectionDeserializer(collectionType, valueDeser, instantiator);
        StringCollectionDeserializer contextual = deser.createContextual(ctxt, null);
        assertNotNull(contextual);
        assertNotSame(deser, contextual);
        assertEquals(valueDeser, contextual.getContentDeserializer());
    }

    // Test createContextual with null value deserializer (should resolve from ctxt)
    @Test
    public void testCreateContextualWithNullValueDeser() throws JsonMappingException {
        StringCollectionDeserializer deser = new StringCollectionDeserializer(collectionType, null, instantiator);
        StringCollectionDeserializer contextual = deser.createContextual(ctxt, null);
        assertNotNull(contextual);
        assertNull(contextual.getContentDeserializer());
    }
}