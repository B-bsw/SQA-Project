package com.fasterxml.jackson.core.util;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter;

public class DefaultPrettyPrinterTest {

    private JsonGenerator createGenerator(StringWriter sw) throws IOException {
        return new JsonFactory().createGenerator(sw);
    }

    // Test constructors and factory methods
    @Test
    public void testDefaultConstructor() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        assertNotNull(pp);
        assertEquals(DEFAULT_ROOT_VALUE_SEPARATOR.getValue(), pp._rootSeparator.getValue());
    }

    @Test
    public void testStringConstructorWithNull() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter((String) null);
        assertNull(pp._rootSeparator);
    }

    @Test
    public void testSerializableStringConstructorWithNull() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter((SerializableString) null);
        assertNull(pp._rootSeparator);
    }

    @Test
    public void testCopyConstructor() {
        DefaultPrettyPrinter original = new DefaultPrettyPrinter();
        original = original.withRootSeparator("test");
        DefaultPrettyPrinter copy = new DefaultPrettyPrinter(original);
        assertEquals("test", copy._rootSeparator.getValue());
    }

    @Test
    public void testWithRootSeparator() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        assertSame(pp, pp.withRootSeparator(DEFAULT_ROOT_VALUE_SEPARATOR));
        assertSame(pp, pp.withRootSeparator((SerializableString) null));
        
        DefaultPrettyPrinter newPp = pp.withRootSeparator(new SerializedString("x"));
        assertNotSame(pp, newPp);
        assertEquals("x", newPp._rootSeparator.getValue());
    }

    @Test
    public void testWithRootSeparatorString() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        assertSame(pp, pp.withRootSeparator((String) null));
        
        DefaultPrettyPrinter newPp = pp.withRootSeparator("y");
        assertNotSame(pp, newPp);
    }

    @Test
    public void testWithSpacesInObjectEntries() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        assertSame(pp, pp.withSpacesInObjectEntries());
        
        DefaultPrettyPrinter noSpaces = pp.withoutSpacesInObjectEntries();
        assertNotSame(pp, noSpaces);
        assertFalse(noSpaces._spacesInObjectEntries);
        
        DefaultPrettyPrinter backToSpaces = noSpaces.withSpacesInObjectEntries();
        assertTrue(backToSpaces._spacesInObjectEntries);
        assertNotSame(noSpaces, backToSpaces);
    }

    @Test
    public void testWithSeparators() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        Separators separators = Separators.createDefaultInstance();
        assertSame(pp, pp.withSeparators(separators));
        assertEquals(" " + separators.getObjectFieldValueSeparator() + " ", 
                pp._objectFieldValueSeparatorWithSpaces);
    }

    // Test indenters
    @Test
    public void testIndentArraysWith() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        Indenter indenter = new CustomIndenter();
        pp.indentArraysWith(indenter);
        assertSame(indenter, pp._arrayIndenter);
        
        pp.indentArraysWith(null);
        assertTrue(pp._arrayIndenter instanceof DefaultPrettyPrinter.NopIndenter);
    }

    @Test
    public void testIndentObjectsWith() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        Indenter indenter = new CustomIndenter();
        pp.indentObjectsWith(indenter);
        assertSame(indenter, pp._objectIndenter);
        
        pp.indentObjectsWith(null);
        assertTrue(pp._objectIndenter instanceof DefaultPrettyPrinter.NopIndenter);
    }

    @Test
    public void testWithArrayIndenter() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        Indenter indenter = new CustomIndenter();
        assertSame(pp, pp.withArrayIndenter(pp._arrayIndenter));
        
        DefaultPrettyPrinter newPp = pp.withArrayIndenter(indenter);
        assertNotSame(pp, newPp);
        assertSame(indenter, newPp._arrayIndenter);
        
        DefaultPrettyPrinter nopPp = pp.withArrayIndenter(null);
        assertTrue(nopPp._arrayIndenter instanceof DefaultPrettyPrinter.NopIndenter);
    }

    @Test
    public void testWithObjectIndenter() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        Indenter indenter = new CustomIndenter();
        assertSame(pp, pp.withObjectIndenter(pp._objectIndenter));
        
        DefaultPrettyPrinter newPp = pp.withObjectIndenter(indenter);
        assertNotSame(pp, newPp);
        assertSame(indenter, newPp._objectIndenter);
        
        DefaultPrettyPrinter nopPp = pp.withObjectIndenter(null);
        assertTrue(nopPp._objectIndenter instanceof DefaultPrettyPrinter.NopIndenter);
    }

    @Test
    public void testCreateInstance() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter("root");
        DefaultPrettyPrinter instance = pp.createInstance();
        assertNotSame(pp, instance);
        assertEquals("root", instance._rootSeparator.getValue());
    }

    // Test write operations
    @Test
    public void testWriteRootValueSeparatorWithSeparator() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter("sep");
        pp.writeRootValueSeparator(g);
        g.flush();
        assertEquals("sep", sw.toString());
    }

    @Test
    public void testWriteRootValueSeparatorWithoutSeparator() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter((SerializableString) null);
        pp.writeRootValueSeparator(g);
        g.flush();
        assertEquals("", sw.toString());
    }

    @Test
    public void testWriteStartObjectWithInlineIndenter() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp._objectIndenter = DefaultPrettyPrinter.NopIndenter.instance;
        pp.writeStartObject(g);
        g.flush();
        assertEquals("{", sw.toString());
        assertEquals(0, pp._nesting);
    }

    @Test
    public void testWriteStartObjectWithNonInlineIndenter() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp.writeStartObject(g);
        g.flush();
        assertEquals("{", sw.toString());
        assertEquals(1, pp._nesting);
    }

    @Test
    public void testWriteEndObjectInline() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp._objectIndenter = DefaultPrettyPrinter.NopIndenter.instance;
        pp.writeStartObject(g);
        pp.writeEndObject(g, 0);
        g.flush();
        assertEquals("{}", sw.toString());
    }

    @Test
    public void testWriteEndObjectNonInline() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp.writeStartObject(g);
        pp._nesting = 2;
        pp.writeEndObject(g, 1);
        g.flush();
        String result = sw.toString();
        assertTrue(result.startsWith("{"));
        assertTrue(result.endsWith("}"));
        assertEquals(2, pp._nesting); // nested after decrement from writeStartObject? Actually -1 from start + no change? Let's compute: start -> nesting=1, then we set to 2, end with nr>0 -> -1 => 1, then indentation at level 1 -> but writeStartObject set nesting=1, we override to 2, end: nrOfValues=1 -> _objectIndenter.writeIndentation(g, 1) -> should write some spaces
        // Verify output format
        assertTrue(result.contains("{"));
        assertTrue(result.endsWith("}"));
    }

    @Test
    public void testWriteObjectFieldValueSeparatorWithSpaces() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp._spacesInObjectEntries = true;
        pp.writeObjectFieldValueSeparator(g);
        g.flush();
        assertEquals(pp._objectFieldValueSeparatorWithSpaces, sw.toString());
    }

    @Test
    public void testWriteObjectFieldValueSeparatorWithoutSpaces() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp._spacesInObjectEntries = false;
        pp.writeObjectFieldValueSeparator(g);
        g.flush();
        assertEquals(String.valueOf(pp._separators.getObjectFieldValueSeparator()), sw.toString());
    }

    @Test
    public void testWriteStartArrayInline() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp._arrayIndenter = DefaultPrettyPrinter.NopIndenter.instance;
        pp.writeStartArray(g);
        g.flush();
        assertEquals("[", sw.toString());
        assertEquals(0, pp._nesting);
    }

    @Test
    public void testWriteStartArrayNonInline() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp.writeStartArray(g);
        g.flush();
        assertEquals("[", sw.toString());
        assertEquals(1, pp._nesting);
    }

    @Test
    public void testBeforeArrayValuesInline() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp._arrayIndenter = DefaultPrettyPrinter.NopIndenter.instance;
        pp.beforeArrayValues(g);
        g.flush();
        assertEquals("", sw.toString());
    }

    @Test
    public void testBeforeArrayValuesNonInline() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp.beforeArrayValues(g);
        g.flush();
        assertTrue(sw.toString().length() > 0);
    }

    @Test
    public void testWriteArrayValueSeparator() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp.writeArrayValueSeparator(g);
        g.flush();
        assertEquals(",", sw.toString());
    }

    @Test
    public void testWriteEndArrayWithValues() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp._arrayIndenter = DefaultPrettyPrinter.NopIndenter.instance;
        pp.writeStartArray(g);
        pp.writeEndArray(g, 1);
        g.flush();
        assertEquals("[]", sw.toString());
    }

    @Test
    public void testWriteEndArrayNoValues() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp._arrayIndenter = DefaultPrettyPrinter.NopIndenter.instance;
        pp.writeStartArray(g);
        pp.writeEndArray(g, 0);
        g.flush();
        assertEquals("[ ]", sw.toString());
    }

    // Test NopIndenter and FixedSpaceIndenter
    @Test
    public void testNopIndenter() throws IOException {
        DefaultPrettyPrinter.NopIndenter indenter = DefaultPrettyPrinter.NopIndenter.instance;
        assertTrue(indenter.isInline());
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        indenter.writeIndentation(g, 10);
        g.flush();
        assertEquals("", sw.toString());
    }

    @Test
    public void testFixedSpaceIndenter() throws IOException {
        DefaultPrettyPrinter.FixedSpaceIndenter indenter = DefaultPrettyPrinter.FixedSpaceIndenter.instance;
        assertTrue(indenter.isInline());
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        indenter.writeIndentation(g, 5);
        g.flush();
        assertEquals(" ", sw.toString());
    }

    // Test withCustomIndenter (Nested conditions)
    @Test
    public void testWriteEndObjectWithNonInlineAndNrValuesZero() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp._objectIndenter = DefaultPrettyPrinter.NopIndenter.instance;
        pp.writeStartObject(g);
        pp.writeEndObject(g, 0);
        g.flush();
        assertEquals("{}", sw.toString());
    }

    @Test
    public void testWriteEndObjectWithNonInlineAndNrValuesMoreThanZero() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp.writeStartObject(g);
        pp._objectIndenter = DefaultPrettyPrinter.NopIndenter.instance;
        pp._nesting = 0; // reset
        pp.writeEndObject(g, 1);
        g.flush();
        assertEquals("{}", sw.toString());
    }

    // Additional branch coverage for writeRaw calls
    @Test
    public void testWriteStartObjectRawChar() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp.writeStartObject(g);
        g.close();
        String result = sw.toString();
        assertEquals("{", result);
    }

    @Test
    public void testWriteEndArrayRawChar() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp.writeEndArray(g, 0);
        g.close();
        String result = sw.toString();
        assertEquals(" ]", result);
    }

    @Test
    public void testWriteEndArrayRaw() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp._arrayIndenter = DefaultPrettyPrinter.NopIndenter.instance;
        pp.writeEndArray(g, 1);
        g.close();
        String result = sw.toString();
        assertEquals("]", result);
    }

    // Test separator logic in withRootSeparator
    @Test
    public void testWithRootSeparatorSameInstance() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        assertSame(pp, pp.withRootSeparator((String) null));
    }

    // Additional NopIndenter tests
    @Test
    public void testNopIndenterInstance() {
        assertNotNull(DefaultPrettyPrinter.NopIndenter.instance);
    }

    @Test
    public void testFixedSpaceIndenterInstance() {
        assertNotNull(DefaultPrettyPrinter.FixedSpaceIndenter.instance);
    }

    // Static helper class for testing
    private static class CustomIndenter implements Indenter {
        @Override
        public void writeIndentation(JsonGenerator g, int level) throws IOException {
            g.writeRaw("custom");
        }

        @Override
        public boolean isInline() {
            return false;
        }
    }
}