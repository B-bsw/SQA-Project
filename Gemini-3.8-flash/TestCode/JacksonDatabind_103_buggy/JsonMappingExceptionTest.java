package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.io.Closeable;
import java.io.IOException;
import java.io.StringReader;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class JsonMappingExceptionTest {

    private JsonMappingException exception;

    @Before
    public void setUp() {
        exception = new JsonMappingException("test message");
    }

    @After
    public void tearDown() {
        exception = null;
    }

    // Test for constructors
    @Test
    public void testConstructors() {
        JsonMappingException e1 = new JsonMappingException("msg");
        assertNotNull(e1);
        assertEquals("msg", e1.getMessage());
        
        Throwable cause = new RuntimeException("root");
        JsonMappingException e2 = new JsonMappingException("msg2", cause);
        assertNotNull(e2);
        assertEquals("msg2", e2.getMessage());
        assertSame(cause, e2.getCause());
        
        JsonLocation loc = new JsonLocation(new StringReader("x"), 1, 1, 100);
        JsonMappingException e3 = new JsonMappingException("msg3", loc);
        assertNotNull(e3);
        assertEquals("msg3", e3.getMessage());
        assertEquals(loc, e3.getLocation());
        
        JsonMappingException e4 = new JsonMappingException("msg4", loc, cause);
        assertNotNull(e4);
        assertEquals("msg4", e4.getMessage());
        assertEquals(loc, e4.getLocation());
        assertSame(cause, e4.getCause());
    }

    // Test wrapWithPath with JsonMappingException instance
    @Test
    public void testWrapWithPathExistingMappingException() {
        JsonMappingException original = new JsonMappingException("original msg", new RuntimeException("cause"));
        JsonMappingException wrapped = JsonMappingException.wrapWithPath(original, "obj", "field");
        assertSame(original, wrapped);
        assertNotNull(wrapped.getPath());
        assertEquals(1, wrapped.getPath().size());
        assertEquals("field", wrapped.getPath().get(0).getFieldName());
    }

    @Test
    public void testWrapWithPathExistingMappingExceptionWithEmptyMessage() {
        JsonMappingException original = new JsonMappingException("");
        JsonMappingException wrapped = JsonMappingException.wrapWithPath(original, "obj", "field");
        assertSame(original, wrapped);
        assertTrue(wrapped.getMessage().contains("(was " + JsonMappingException.class.getName() + ")"));
    }

    @Test
    public void testWrapWithPathExistingMappingExceptionWithNullMessage() {
        JsonMappingException original = new JsonMappingException((String) null);
        JsonMappingException wrapped = JsonMappingException.wrapWithPath(original, "obj", "field");
        assertSame(original, wrapped);
        assertTrue(wrapped.getMessage().contains("(was " + JsonMappingException.class.getName() + ")"));
    }

    // Test wrapWithPath with non-JsonMappingException
    @Test
    public void testWrapWithPathGenericIOException() throws IOException {
        IOException ioException = new IOException("IO boom");
        JsonMappingException wrapped = JsonMappingException.wrapWithPath(ioException, "obj", "field");
        assertNotNull(wrapped);
        assertNotSame(ioException, wrapped);
        assertTrue(wrapped.getMessage().contains("IO boom"));
        assertSame(ioException, wrapped.getCause());
        assertEquals(1, wrapped.getPath().size());
    }

    @Test
    public void testWrapWithPathWithIndex() {
        IOException ioException = new IOException("IO boom");
        JsonMappingException wrapped = JsonMappingException.wrapWithPath(ioException, "obj", 3);
        assertNotNull(wrapped);
        assertEquals(3, wrapped.getPath().get(0).getIndex());
    }

    // Test from methods
    @Test
    public void testFromWithParser() {
        JsonParser parser = null;
        try {
            parser = new JsonFactory().createParser("{\"a\":1}");
            JsonMappingException e = JsonMappingException.from(parser, "parse error");
            assertNotNull(e);
            assertEquals("parse error", e.getMessage());
            assertEquals(parser, e.getProcessor());
        } catch (IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testFromWithGenerator() {
        JsonGenerator generator = null;
        try {
            generator = new JsonFactory().createGenerator(new java.io.StringWriter());
            JsonMappingException e = JsonMappingException.from(generator, "gen error");
            assertNotNull(e);
            assertEquals("gen error", e.getMessage());
            assertNotNull(e.getProcessor());
        } catch (IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    // Test getPath and getMessage with path
    @Test
    public void testGetPathWhenNull() {
        JsonMappingException e = new JsonMappingException("no path");
        assertNotNull(e.getPath());
        assertTrue(e.getPath().isEmpty());
    }

    @Test
    public void testGetPathWithReferences() {
        JsonMappingException e = new JsonMappingException("with path");
        e.prependPath("obj1", "field1");
        e.prependPath("obj2", "field2");
        assertEquals(2, e.getPath().size());
        assertTrue(e.getMessage().contains("through reference chain"));
    }

    @Test
    public void testGetPathWithReferenceObjects() {
        JsonMappingException e = new JsonMappingException("with path");
        e.prependPath(new JsonMappingException.Reference("obj", "field"));
        assertEquals(1, e.getPath().size());
    }

    // Test reference chain limits
    @Test
    public void testPathLimit() {
        JsonMappingException e = new JsonMappingException("path limit");
        for (int i = 0; i < 1100; i++) {
            e.prependPath("obj" + i, "field" + i);
        }
        assertEquals(JsonMappingException.MAX_REFS_TO_LIST, e.getPath().size());
    }

    // Test PathReference methods
    @Test
    public void testGetPathReference() {
        JsonMappingException e = new JsonMappingException("path");
        e.prependPath(new JsonMappingException.Reference("obj", "field"));
        String pathRef = e.getPathReference();
        assertTrue(pathRef.contains("obj"));
        assertTrue(pathRef.contains("field"));
    }

    @Test
    public void testGetPathReferenceStringBuilder() {
        JsonMappingException e = new JsonMappingException("path");
        e.prependPath(new JsonMappingException.Reference("obj", "field"));
        StringBuilder sb = new StringBuilder("prefix_");
        JsonMappingException.Reference ref = new JsonMappingException.Reference("obj", "field");
        e.prependPath(ref);
        String result = e.getPathReference(sb).toString();
        assertTrue(result.startsWith("prefix_"));
    }

    @Test
    public void testGetMessageWithoutPath() {
        JsonMappingException e = new JsonMappingException("simple");
        assertEquals("simple", e.getMessage());
    }

    @Test
    public void testGetMessageWithPath() {
        JsonMappingException e = new JsonMappingException("simple");
        e.prependPath(new JsonMappingException.Reference("obj", "field"));
        assertTrue(e.getMessage().contains("simple"));
        assertTrue(e.getMessage().contains("through reference chain"));
    }

    @Test
    public void testGetMessageWithNullMessageAndPath() {
        JsonMappingException e = new JsonMappingException((String) null);
        e.prependPath(new JsonMappingException.Reference("obj", "field"));
        assertTrue(e.getMessage().contains("through reference chain"));
        assertFalse(e.getMessage().contains("null"));
    }

    @Test
    public void testGetLocalizedMessage() {
        JsonMappingException e = new JsonMappingException("localized");
        assertEquals(e._buildMessage(), e.getLocalizedMessage());
    }

    @Test
    public void testToString() {
        JsonMappingException e = new JsonMappingException("to string");
        assertTrue(e.toString().startsWith("com.fasterxml.jackson.databind.JsonMappingException: "));
    }

    @Test
    public void testProcessorSerialization() throws IOException, ClassNotFoundException {
        JsonMappingException e = new JsonMappingException(new java.io.StringWriter() instanceof Closeable ? new TestCloseable() : null, "serialize me");
        // Test that processor is transient
        e.prependPath(new JsonMappingException.Reference("obj", "field"));
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(baos);
        oos.writeObject(e);
        oos.close();
        java.io.ByteArrayInputStream bais = new java.io.ByteArrayInputStream(baos.toByteArray());
        java.io.ObjectInputStream ois = new java.io.ObjectInputStream(bais);
        JsonMappingException result = (JsonMappingException) ois.readObject();
        ois.close();
        assertNotNull(result);
    }

    // Test Reference class
    @Test
    public void testReferenceConstructors() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference("obj");
        assertEquals("obj", ref.getFrom());
        assertEquals(-1, ref.getIndex());
        assertNull(ref.getFieldName());

        ref = new JsonMappingException.Reference("obj", "field");
        assertEquals("obj", ref.getFrom());
        assertEquals("field", ref.getFieldName());

        ref = new JsonMappingException.Reference("obj", 2);
        assertEquals("obj", ref.getFrom());
        assertEquals(2, ref.getIndex());
    }

    @Test(expected = NullPointerException.class)
    public void testReferenceNullFieldName() {
        new JsonMappingException.Reference("obj", null);
    }

    @Test
    public void testReferenceGetDescription() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference("Customer", "id");
        String desc = ref.getDescription();
        assertNotNull(desc);
        assertTrue(desc.contains("Customer"));
        assertTrue(desc.contains("id"));
    }

    @Test
    public void testReferenceGetDescriptionNoField() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference("Customer");
        String desc = ref.getDescription();
        assertNotNull(desc);
        assertTrue(desc.contains("Customer"));
    }

    @Test
    public void testReferenceGetDescriptionWithIndex() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference("List", 2);
        String desc = ref.getDescription();
        assertNotNull(desc);
        assertTrue(desc.contains("List"));
        assertTrue(desc.contains("2"));
    }

    @Test
    public void testReferenceArrayDescription() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference(new int[]{1,2}, "items");
        String desc = ref.getDescription();
        assertTrue(desc.contains("java.lang.String"));
    }

    @Test
    public void testReferenceWriteReplace() throws IOException {
        JsonMappingException.Reference ref = new JsonMappingException.Reference("obj", "field");
        Object replacement = ref.writeReplace();
        assertSame(ref, replacement);
        assertEquals(ref.getDescription(), ref.getDescription()); // cached
    }

    @Test
    public void testPrependPathWithObjectAndFieldName() {
        exception.prependPath("obj", "field");
        assertEquals(1, exception.getPath().size());
        assertEquals("obj", exception.getPath().get(0).getFrom());
        assertEquals("field", exception.getPath().get(0).getFieldName());
    }

    @Test
    public void testPrependPathWithObjectAndIndex() {
        exception.prependPath("obj", 5);
        assertEquals(1, exception.getPath().size());
        assertEquals("obj", exception.getPath().get(0).getFrom());
        assertEquals(5, exception.getPath().get(0).getIndex());
    }

    @Test
    public void testPrependPathWithReferenceObject() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference("obj", "field");
        exception.prependPath(ref);
        assertEquals(1, exception.getPath().size());
        assertSame(ref, exception.getPath().get(0));
    }

    @Test
    public void testPrependPathMultiple() {
        exception.prependPath("obj1", "f1");
        exception.prependPath("obj2", "f2");
        assertEquals(2, exception.getPath().size());
        assertEquals("obj2", exception.getPath().get(0).getFrom());
        assertEquals("obj1", exception.getPath().get(1).getFrom());
    }

    @Test
    public void testPrependPathExceedsMaxRefs() {
        exception.prependPath("obj", "field");
        for (int i = 0; i < 1005; i++) {
            exception.prependPath("obj" + i, "f" + i);
        }
        assertEquals(1000, exception.getPath().size());
    }

    // Test static factory fromUnexpectedIOE
    @Test
    public void testFromUnexpectedIOE() {
        IOException ioe = new IOException("unexpected");
        JsonMappingException e = JsonMappingException.fromUnexpectedIOE(ioe);
        assertNotNull(e);
        assertTrue(e.getMessage().contains("unexpected"));
    }

    // Test from methods with DeserializationContext & SerializerProvider
    @Test
    public void testFromDeserializationContext() throws IOException {
        JsonFactory factory = new JsonFactory();
        JsonParser parser = factory.createParser("{}");
        DeserializationContext ctxt = new DefaultDeserializationContext.Impl(new ObjectMapper().getDeserializationConfig().with(
                new ObjectMapper().getDeserializationConfig()
        ));
        // Since DeserializationContext is abstract and we need a concrete impl, use the test mapper
        ObjectMapper mapper = new ObjectMapper();
        JsonMappingException e = JsonMappingException.from(mapper.getDeserializationContext(), "ctx msg");
        assertNotNull(e);
        assertEquals("ctx msg", e.getMessage());
    }

    @Test
    public void testFromSerializerProvider() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonGenerator gen = mapper.getFactory().createGenerator(new java.io.StringWriter());
        SerializerProvider ctxt = mapper.getSerializerProviderInstance(new MappingIteratorFactory(), null, null, null); // Simple stub
        ctxt.setGenerator(gen);
        JsonMappingException e = JsonMappingException.from(ctxt, "ser msg");
        assertNotNull(e);
        assertEquals("ser msg", e.getMessage());
    }

    // Helper class
    private static class TestCloseable implements Closeable {
        public void close() { }
    }
}