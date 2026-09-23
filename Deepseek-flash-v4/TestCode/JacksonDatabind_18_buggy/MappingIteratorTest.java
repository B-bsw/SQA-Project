package com.fasterxml.jackson.databind;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import static org.junit.Assert.*;

public class MappingIteratorTest {

    private JsonFactory jsonFactory;
    private JavaType javaType;

    @Before
    public void setUp() {
        jsonFactory = new JsonFactory();
        javaType = new SimpleType();
    }
    
    @Test
    public void testReadAllFromScratchWithWrappedArray() throws IOException {
        String json = "[1,2,3,4,5]";
        JsonParser jp = jsonFactory.createParser(json);
        MappingIterator<Integer> iterator = new MappingIterator<>(javaType, jp, null, new IntDeserializer(), true, null);
        List<Integer> list = iterator.readAll();
        assertEquals(5, list.size());
        assertEquals(Integer.valueOf(1), list.get(0));
        assertEquals(Integer.valueOf(5), list.get(4));
    }
    
    @Test
    public void testReadAllWithEmptyArray() throws IOException {
        String json = "[]";
        JsonParser jp = jsonFactory.createParser(json);
        MappingIterator<Integer> iterator = new MappingIterator<>(javaType, jp, null, new IntDeserializer(), true, null);
        List<Integer> list = iterator.readAll();
        assertEquals(0, list.size());
    }
    
    @Test
    public void testReadAllWithNullList() throws IOException {
        String json = "[1,2]";
        JsonParser jp = jsonFactory.createParser(json);
        MappingIterator<Integer> iterator = new MappingIterator<>(javaType, jp, null, new IntDeserializer(), true, null);
        try {
            iterator.readAll((List<Integer>) null);
            fail("Should throw NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }
    
    @Test
    public void testHasNextValueWithBoolean() throws IOException {
        // Test with boolean values to check different deserializer path
        JsonParser jp = jsonFactory.createParser("true false");
        JavaType boolType = new SimpleType(Boolean.class);
        MappingIterator<Boolean> iterator = new MappingIterator<>(boolType, jp, null, new BooleanDeserializer(), true, null);
        assertTrue(iterator.hasNextValue());
        assertEquals(Boolean.TRUE, iterator.nextValue());
        assertTrue(iterator.hasNextValue());
        assertEquals(Boolean.FALSE, iterator.nextValue());
        assertFalse(iterator.hasNextValue());
    }
    
    @Test
    public void testReadAllWithProvidedList() throws IOException {
        String json = "[1,2,3]";
        JsonParser jp = jsonFactory.createParser(json);
        MappingIterator<Integer> iterator = new MappingIterator<>(javaType, jp, null, new IntDeserializer(), true, null);
        List<Integer> results = new ArrayList<>();
        List<Integer> returned = iterator.readAll(results);
        assertSame(results, returned);
        assertEquals(3, results.size());
    }
    
    @Test
    public void testReadAllWithProvidedCollection() throws IOException {
        String json = "[10,20]";
        JsonParser jp = jsonFactory.createParser(json);
        MappingIterator<Integer> iterator = new MappingIterator<>(javaType, jp, null, new IntDeserializer(), true, null);
        Collection<Integer> results = new ArrayList<>();
        Collection<Integer> returned = iterator.readAll(results);
        assertSame(results, returned);
        assertEquals(2, results.size());
        assertTrue(results.contains(10));
        assertTrue(results.contains(20));
    }
    
    @Test
    public void testNextValueWithUpdatedValue() throws IOException {
        String json = "[1,2,3]";
        JsonParser jp = jsonFactory.createParser(json);
        Integer updatedValue = 0;
        MappingIterator<Integer> iterator = new MappingIterator<>(javaType, jp, null, new IntDeserializer(), false, updatedValue);
        assertTrue(iterator.hasNextValue());
        Integer result = iterator.nextValue();
        assertEquals(Integer.valueOf(0), result); // updatedValue is set to parsed value, which will overwrite
        assertTrue(iterator.hasNextValue());
        iterator.nextValue();
        assertTrue(iterator.hasNextValue());
        iterator.nextValue();
    }
    
    @Test
    public void testNextValueWhenNoMoreElements() throws IOException {
        JsonParser jp = jsonFactory.createParser("[]");
        MappingIterator<Integer> iterator = new MappingIterator<>(javaType, jp, null, new IntDeserializer(), true, null);
        assertFalse(iterator.hasNextValue());
        try {
            iterator.nextValue();
            fail("Should throw NoSuchElementException");
        } catch (NoSuchElementException e) {
            // expected
        }
    }
    
    @Test
    public void testNextValueWithNullUpdatedValue() throws IOException {
        String json = "[5]";
        JsonParser jp = jsonFactory.createParser(json);
        MappingIterator<Integer> iterator = new MappingIterator<>(javaType, jp, null, new IntDeserializer(), true, null);
        assertTrue(iterator.hasNextValue());
        assertEquals(Integer.valueOf(5), iterator.nextValue());
    }
    
    @Test
    public void testHasNextValueWithClearedToken() throws IOException {
        String json = "[1,2,3]";
        JsonParser jp = jsonFactory.createParser(json);
        MappingIterator<Integer> iterator = new MappingIterator<>(javaType, jp, null, new IntDeserializer(), true, null);
        assertEquals(JsonToken.START_ARRAY, jp.getCurrentToken()); // Position at start array
        iterator.hasNextValue(); // Should move to first value
        assertNotNull(jp.getCurrentToken());
        iterator.nextValue();
        assertNull(jp.getCurrentToken()); // After next, token should be cleared
    }

    @Test
    public void testGetParser() throws IOException {
        JsonParser jp = jsonFactory.createParser("[1,2]");
        MappingIterator<Integer> iterator = new MappingIterator<>(javaType, jp, null, new IntDeserializer(), true, null);
        assertSame(jp, iterator.getParser());
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testRemoveThrowsUnsupportedOperation() throws IOException {
        JsonParser jp = jsonFactory.createParser("[1,2]");
        MappingIterator<Integer> iterator = new MappingIterator<>(javaType, jp, null, new IntDeserializer(), true, null);
        iterator.remove();
    }
    
    @Test
    public void testClose() throws IOException {
        JsonParser jp = jsonFactory.createParser("[1,2]");
        MappingIterator<Integer> iterator = new MappingIterator<>(javaType, jp, null, new IntDeserializer(), true, null);
        iterator.close();
        // After close, parser should be null? Actually close doesn't set to null but closes parser
        assertFalse(iterator.hasNextValue()); // Should return false since parser is closed
    }
    
    @Test
    public void testEmptyIterator() throws IOException {
        MappingIterator<Integer> empty = MappingIterator.emptyIterator();
        assertFalse(empty.hasNextValue());
        try {
            empty.nextValue();
            fail("Should throw NoSuchElementException");
        } catch (NoSuchElementException e) {
            // expected
        }
    }
    
    @Test
    public void testHasNextWithIOException() {
        // Create parser that throws IOException
        JsonParser parser = new ThrowingJsonParser(jsonFactory);
        MappingIterator<Integer> iterator = new MappingIterator<>(javaType, parser, null, new IntDeserializer(), false, null);
        assertFalse(iterator.hasNext()); // IOException is caught and returns false
    }
    
    @Test
    public void testNextWithJsonMappingException() throws IOException {
        JsonParser jp = jsonFactory.createParser("[1, not_int]");
        MappingIterator<Integer> iterator = new MappingIterator<>(javaType, jp, null, new IntDeserializer(), true, null);
        try {
            iterator.next(); // Should throw runtime exception
            fail("Expected RuntimeException");
        } catch (RuntimeJsonMappingException e) {
            // expected
        }
    }
    
    @Test
    public void testReadAllCollectionWithNull() throws IOException {
        String json = "[1]";
        JsonParser jp = jsonFactory.createParser(json);
        MappingIterator<Integer> iterator = new MappingIterator<>(javaType, jp, null, new IntDeserializer(), true, null);
        try {
            iterator.readAll((Collection<Integer>) null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }
    
    @Test
    public void testGetParserSchema() throws IOException {
        JsonParser jp = jsonFactory.createParser("[1]");
        MappingIterator<Integer> iterator = new MappingIterator<>(javaType, jp, null, new IntDeserializer(), true, null);
        // The schema is typically null for JSON
        assertNull(iterator.getParserSchema());
    }
    
    @Test
    public void testGetCurrentLocation() throws IOException {
        String json = "[1]";
        JsonParser jp = jsonFactory.createParser(json);
        MappingIterator<Integer> iterator = new MappingIterator<>(javaType, jp, null, new IntDeserializer(), true, null);
        JsonLocation location = iterator.getCurrentLocation();
        assertNotNull(location);
    }
    
    @Test
    public void testHasNextValueWithNullParser() throws IOException {
        MappingIterator<Integer> empty = MappingIterator.emptyIterator();
        assertFalse(empty.hasNextValue());
    }
    
    private static class IntDeserializer extends JsonDeserializer<Integer> {
        @Override
        public Integer deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            return p.getValueAsInt();
        }
    }
    
    private static class BooleanDeserializer extends JsonDeserializer<Boolean> {
        @Override
        public Boolean deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            return p.getValueAsBoolean();
        }
    }
    
    private static class SimpleType extends JavaType {
        private static final long serialVersionUID = 1L;
        
        public SimpleType() { super(Integer.class); }
        public SimpleType(Class<?> rawType) { super(rawType); }
        
        // implement abstract methods (from a minimal JavaType)
        @Override
        public String toCanonical() { return getRawClass().getName(); }
        @Override
        public boolean isContainerType() { return false; }
        @Override
        public int containedTypeCount() { return 0; }
        @Override
        public JavaType containedType(int index) { return null; }
        @Override
        public String containedTypeName(int index) { return null; }
        @Override
        protected JavaType _narrow(Class<?> subclass) { return new SimpleType(subclass); }
        
        @Override
        public boolean equals(Object o) {
            return o instanceof SimpleType;
        }
        @Override
        public int hashCode() { return 0; }
    }
    
    private static class ThrowingJsonParser extends JsonParser {
        @Override
        public JsonToken nextToken() throws IOException {
            throw new IOException("Forced error");
        }
        @Override
        public JsonToken getCurrentToken() { return null; }
        
        @Override
        public JsonLocation getCurrentLocation() { return JsonLocation.NA; }
        @Override
        public JsonLocation getTokenLocation() { return JsonLocation.NA; }
        @Override
        public String getCurrentName() throws IOException { return null; }
        @Override
        public void close() throws IOException {}
        @Override
        public boolean isClosed() { return false; }
        
        @Override
        public boolean hasCurrentToken() { return false; }
        @Override
        public void clearCurrentToken() {}
        @Override
        public JsonParser skipChildren() throws IOException { return this; }
        @Override
        public Object getEmbeddedObject() { return null; }
        @Override
        public int getText(Writer writer) throws IOException { return 0; }
        @Override
        public String getText() throws IOException { return ""; }
        @Override
        public char[] getTextCharacters() throws IOException { return new char[0]; }
        @Override
        public int getTextLength() throws IOException { return 0; }
        @Override
        public int getTextOffset() throws IOException { return 0; }
        @Override
        public Number getNumberValue() throws IOException { return null; }
        @Override
        public int getIntValue() throws IOException { return 0; }
        @Override
        public long getLongValue() throws IOException { return 0; }
        @Override
        public double getDoubleValue() throws IOException { return 0; }
        @Override
        public float getFloatValue() throws IOException { return 0; }
        @Override
        public Object getNumberValueExact() throws IOException { return null; }
        @Override
        public int getValueAsInt() throws IOException { return 0; }
        @Override
        public String getValueAsString() throws IOException { return null; }
        @Override
        public String getValueAsString(String defaultValue) throws IOException { return defaultValue; }
        @Override
        public boolean getValueAsBoolean() throws IOException { return false; }
        @Override
        public boolean getValueAsBoolean(boolean defaultValue) throws IOException { return defaultValue; }
        @Override
        public String getValueAsText() throws IOException { return null; }
        @Override
        public Exception getCodec() { return null; }
        @Override
        public void setCodec(Exception c) {}
        @Override
        public void setCodec(JsonFactory c) {}
        @Override
        public Object readValueAs(Class<?> valueType) throws IOException { return null; }
        @Override
        public boolean nextIsStartArray() { return false; }
        @Override
        public boolean nextIsEndArray() { return false; }
        @Override
        public FormatSchema getSchema() { return null; }
    }
}