package com.fasterxml.jackson.databind;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;

@SuppressWarnings("deprecation")
public class JsonMappingExceptionTest {

    @Test
    public void testMessageWithoutPath() {
        JsonMappingException e = new JsonMappingException("plain");
        assertEquals("plain", e.getMessage());
        assertEquals("plain", e.getLocalizedMessage());
        assertEquals("com.fasterxml.jackson.databind.JsonMappingException: plain", e.toString());
    }

    @Test
    public void testNullMessageWithoutPath() {
        JsonMappingException e = new JsonMappingException((String) null);
        assertNull(e.getMessage());
        assertNull(e.getLocalizedMessage());
    }

    @Test
    public void testGetPathIsEmptyWhenNoReferences() {
        JsonMappingException e = new JsonMappingException("none");
        assertEquals(0, e.getPath().size());
        assertEquals("", e.getPathReference());
    }

    @Test
    public void testPathAndMessageAfterPrepend() {
        JsonMappingException e = new JsonMappingException("problem");
        e.prependPath("root", "field");
        e.prependPath("root", 2);

        List<JsonMappingException.Reference> path = e.getPath();
        assertEquals(2, path.size());
        assertEquals(2, path.get(0).getIndex());
        assertEquals("field", path.get(1).getFieldName());
        assertEquals("java.lang.String[2]->java.lang.String[\"field\"]", e.getPathReference());
        assertEquals("problem (through reference chain: java.lang.String[2]->java.lang.String[\"field\"])", e.getMessage());

        try {
            path.add(new JsonMappingException.Reference("x"));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
    }

    @Test
    public void testGetPathReferenceAppendsToGivenBuilder() {
        JsonMappingException e = new JsonMappingException("x");
        e.prependPath("root", "a");
        StringBuilder sb = new StringBuilder("prefix:");
        assertSame(sb, e.getPathReference(sb));
        assertEquals("prefix:java.lang.String[\"a\"]", sb.toString());
    }

    @Test
    public void testReferenceConstructorsAndDescription() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference("root");
        assertEquals("root", ref.getFrom());
        assertNull(ref.getFieldName());
        assertEquals(-1, ref.getIndex());
        assertEquals("java.lang.String[?]", ref.getDescription());
        assertEquals("java.lang.String[?]", ref.toString());

        JsonMappingException.Reference refField = new JsonMappingException.Reference("root", "field");
        assertEquals("field", refField.getFieldName());
        assertEquals(-1, refField.getIndex());
        assertEquals("java.lang.String[\"field\"]", refField.getDescription());

        JsonMappingException.Reference refIndex = new JsonMappingException.Reference("root", 3);
        assertNull(refIndex.getFieldName());
        assertEquals(3, refIndex.getIndex());
        assertEquals("java.lang.String[3]", refIndex.getDescription());

        JsonMappingException.Reference refNull = new JsonMappingException.Reference(null);
        assertNull(refNull.getFrom());
        assertEquals("UNKNOWN[?]", refNull.getDescription());
    }

    @Test(expected = NullPointerException.class)
    public void testReferenceRejectsNullFieldName() {
        new JsonMappingException.Reference("root", null);
    }

    @Test
    public void testFromWithNullParserAndGenerator() {
        JsonMappingException fromParser = JsonMappingException.from((JsonParser) null, "parser msg");
        assertEquals("parser msg", fromParser.getMessage());
        assertNull(fromParser.getProcessor());

        JsonMappingException fromGenerator = JsonMappingException.from((JsonGenerator) null, "generator msg");
        assertEquals("generator msg", fromGenerator.getMessage());
        assertNull(fromGenerator.getProcessor());

        Throwable cause = new RuntimeException("cause");
        JsonMappingException withCause = JsonMappingException.from((JsonParser) null, "with cause", cause);
        assertSame(cause, withCause.getCause());
    }

    @Test
    public void testFromUnexpectedIOE() {
        IOException ioe = new IOException("io boom");
        JsonMappingException e = JsonMappingException.fromUnexpectedIOE(ioe);
        assertEquals("Unexpected IOException (of type java.io.IOException): io boom", e.getMessage());
        assertNull(e.getCause());
    }

    @Test
    public void testWrapWithPathCreatesNewForIOException() {
        IOException ioe = new IOException("boom");
        JsonMappingException e = JsonMappingException.wrapWithPath(ioe, "root", "field");
        assertSame(ioe, e.getCause());
        assertEquals(1, e.getPath().size());
        assertEquals("field", e.getPath().get(0).getFieldName());
        assertTrue(e.getMessage().contains("boom"));
        assertTrue(e.getMessage().contains("through reference chain"));
    }

    @Test
    public void testWrapWithPathCreatesNewForIndexReference() {
        IllegalStateException problem = new IllegalStateException("bad");
        JsonMappingException e = JsonMappingException.wrapWithPath(problem, "root", 7);
        assertSame(problem, e.getCause());
        assertEquals(7, e.getPath().get(0).getIndex());
    }

    @Test
    public void testWrapWithPathReusesExistingMappingException() {
        JsonMappingException original = new JsonMappingException((Closeable) null, "original");
        JsonMappingException result = JsonMappingException.wrapWithPath(original,
                new JsonMappingException.Reference("root", "field"));
        assertSame(original, result);
        assertEquals(1, result.getPath().size());
        assertEquals("field", result.getPath().get(0).getFieldName());
        assertTrue(result.getMessage().contains("original"));
    }

    @Test
    public void testWrapWithPathUsesPlaceholderWhenMessageEmpty() {
        JsonMappingException e = JsonMappingException.wrapWithPath(new IOException(), "root", "field");
        assertTrue(e.getMessage().startsWith("(was java.io.IOException)"));
    }

    @Test
    public void testPrependPathRespectsMaxReferences() {
        JsonMappingException e = new JsonMappingException("m");
        for (int i = 0; i < JsonMappingException.MAX_REFS_TO_LIST + 10; i++) {
            e.prependPath("root", i);
        }
        assertEquals(JsonMappingException.MAX_REFS_TO_LIST, e.getPath().size());
    }
}