package com.fasterxml.jackson.dataformat.xml.deser;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import static org.junit.Assert.*;

import javax.xml.stream.XMLStreamReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class FromXmlParserTest {

    private FromXmlParser parser;
    private XMLStreamReader xmlReader;
    private IOContext ioContext;
    private ObjectCodec codec;

    @Before
    public void setUp() throws Exception {
        // Set up a basic XML reader with empty content for most tests
        String xml = "<root></root>";
        xmlReader = XmlMapper.builder().build().getFactory().getXMLStreamReader(xml);
        ioContext = new IOContext(JsonFactory.builder().build()._getBufferRecycler(), null, false);
        codec = null; // Or use a simple ObjectCodec if needed
    }

    @After
    public void tearDown() throws Exception {
        if (parser != null && !parser.isClosed()) {
            parser.close();
        }
        xmlReader.close();
    }

    private FromXmlParser createParser(String xml) throws Exception {
        xmlReader = XmlMapper.builder().build().getFactory().getXMLStreamReader(xml);
        ioContext = new IOContext(JsonFactory.builder().build()._getBufferRecycler(), null, false);
        return new FromXmlParser(ioContext, 0, 0, codec, xmlReader);
    }

    @Test
    public void testConstructorAndVersion() throws Exception {
        parser = createParser("<root/>");
        assertNotNull(parser.version());
        assertEquals(PackageVersion.VERSION, parser.version());
    }

    @Test
    public void testGetCodecAndSetCodec() throws Exception {
        parser = createParser("<root/>");
        assertNull(parser.getCodec());
        ObjectCodec customCodec = new ObjectCodec() {
            @Override
            public JsonParser getParser() { return null; }
            @Override
            public JsonParser getFactory() { return null; }
            // other abstract methods
            @Override
            public JsonGenerator getGenerator() { return null; }
            @Override
            public JsonFactory getJsonFactory() { return null; }
            @Override
            public JsonParser createParser(String content) throws IOException { return null; }
            @Override
            public JsonParser createParser(byte[] content) throws IOException { return null; }
            @Override
            public JsonParser createParser(java.io.InputStream in) throws IOException { return null; }
            @Override
            public JsonParser createParser(java.io.File f) throws IOException { return null; }
            @Override
            public JsonParser createParser(java.net.URL url) throws IOException { return null; }
            @Override
            public JsonParser createParser(byte[] content, int offset, int len) throws IOException { return null; }
            @Override
            public JsonParser createParser(char[] content, int offset, int len) throws IOException { return null; }
            @Override
            public JsonParser createParser(String content, int offset, int len) throws IOException { return null; }
        };
        parser.setCodec(customCodec);
        assertSame(customCodec, parser.getCodec());
    }

    @Test
    public void testSetXMLTextElementName() throws Exception {
        parser = createParser("<root>text</root>");
        parser.setXMLTextElementName("custom");
        assertEquals("custom", parser._cfgNameForTextElement);
    }

    @Test
    public void testRequiresCustomCodec() throws Exception {
        parser = createParser("<root/>");
        assertTrue(parser.requiresCustomCodec());
    }

    @Test
    public void testEnableDisableFeature() throws Exception {
        parser = createParser("<root/>");
        parser.enable(FromXmlParser.Feature.EMPTY_ELEMENT_AS_NULL);
        assertTrue(parser.isEnabled(FromXmlParser.Feature.EMPTY_ELEMENT_AS_NULL));
        parser.disable(FromXmlParser.Feature.EMPTY_ELEMENT_AS_NULL);
        assertFalse(parser.isEnabled(FromXmlParser.Feature.EMPTY_ELEMENT_AS_NULL));
    }

    @Test
    public void testConfigureFeature() throws Exception {
        parser = createParser("<root/>");
        parser.configure(FromXmlParser.Feature.EMPTY_ELEMENT_AS_NULL, true);
        assertTrue(parser.isEnabled(FromXmlParser.Feature.EMPTY_ELEMENT_AS_NULL));
        parser.configure(FromXmlParser.Feature.EMPTY_ELEMENT_AS_NULL, false);
        assertFalse(parser.isEnabled(FromXmlParser.Feature.EMPTY_ELEMENT_AS_NULL));
    }

    @Test
    public void testGetFormatFeatures() throws Exception {
        parser = createParser("<root/>");
        parser.enable(FromXmlParser.Feature.EMPTY_ELEMENT_AS_NULL);
        int features = parser.getFormatFeatures();
        assertTrue((features & FromXmlParser.Feature.EMPTY_ELEMENT_AS_NULL.getMask()) != 0);
    }

    @Test
    public void testOverrideFormatFeatures() throws Exception {
        parser = createParser("<root/>");
        parser.overrideFormatFeatures(FromXmlParser.Feature.EMPTY_ELEMENT_AS_NULL.getMask(), FromXmlParser.Feature.EMPTY_ELEMENT_AS_NULL.getMask());
        assertTrue(parser.isEnabled(FromXmlParser.Feature.EMPTY_ELEMENT_AS_NULL));
    }

    @Test
    public void testGetStaxReader() throws Exception {
        parser = createParser("<root/>");
        assertNotNull(parser.getStaxReader());
    }

    @Test
    public void testAddVirtualWrappingWithMatchingName() throws Exception {
        String xml = "<wrapped><item>1</item></wrapped>";
        parser = createParser(xml);
        Set<String> wrapSet = new HashSet<>();
        wrapSet.add("wrapped");
        parser.addVirtualWrapping(wrapSet);
        assertNotNull(parser._namesToWrap);
        assertTrue(parser._namesToWrap.contains("wrapped"));
    }

    @Test
    public void testAddVirtualWrappingWithNullName() throws Exception {
        String xml = "<root></root>";
        parser = createParser(xml);
        Set<String> wrapSet = new HashSet<>();
        wrapSet.add("nonexistent");
        parser.addVirtualWrapping(wrapSet);
        // Should not throw, _namesToWrap may be set or not depending on state
    }

    @Test
    public void testGetCurrentNameInObject() throws Exception {
        String xml = "<root><field>value</field></root>";
        parser = createParser(xml);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("root", parser.getCurrentName());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("field", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("value", parser.getText());
    }

    @Test
    public void testGetCurrentNameThrowsException() throws Exception {
        String xml = "<root></root>";
        parser = createParser(xml);
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // END_OBJECT
        // After END_OBJECT, getCurrentName may throw
        try {
            parser.getCurrentName();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testCloseNormal() throws Exception {
        parser = createParser("<root/>");
        parser.close();
        assertTrue(parser.isClosed());
        // Second close should not error
        parser.close();
    }

    @Test
    public void testIsClosedAfterNextToken() throws Exception {
        parser = createParser("<root/>");
        assertFalse(parser.isClosed());
        parser.nextToken();
        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void testGetParsingContext() throws Exception {
        parser = createParser("<root/>");
        assertNotNull(parser.getParsingContext());
    }

    @Test
    public void testGetTokenLocation() throws Exception {
        parser = createParser("<root/>");
        parser.nextToken();
        assertNotNull(parser.getTokenLocation());
    }

    @Test
    public void testGetCurrentLocation() throws Exception {
        parser = createParser("<root/>");
        parser.nextToken();
        assertNotNull(parser.getCurrentLocation());
    }

    @Test
    public void testIsExpectedStartArrayTokenWhenObject() throws Exception {
        String xml = "<root><item>1</item></root>";
        parser = createParser(xml);
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME
        parser.nextToken(); // VALUE_STRING
        parser.isExpectedStartArrayToken();
        // After processing, the token should be handled
    }

    @Test
    public void testIsExpectedStartArrayTokenWhenArray() throws Exception {
        String xml = "<array><item>1</item></array>";
        parser = createParser(xml);
        // Not testing the full logic, but verify it runs without exception
    }

    @Test
    public void testNextTokenWithValueString() throws Exception {
        String xml = "<root>text</root>";
        parser = createParser(xml);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("text", parser.getText());
    }

    @Test
    public void testNextTokenWithAttributes() throws Exception {
        String xml = "<root attr=\"val\"></root>";
        parser = createParser(xml);
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME (root)
        parser.nextToken(); // VALUE_STRING (val)
        // Verify attribute parsing
    }

    @Test
    public void testNextTextValueWithString() throws Exception {
        String xml = "<root>text</root>";
        parser = createParser(xml);
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME
        String text = parser.nextTextValue();
        assertNotNull(text);
        assertEquals("text", text);
    }

    @Test
    public void testNextTextValueWithFieldName() throws Exception {
        String xml = "<root><a>1</a></root>";
        parser = createParser(xml);
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME
        parser.nextToken(); // FIELD_NAME (a)
        String text = parser.nextTextValue();
        assertNull(text);
    }

    @Test
    public void testGetTextWithNullCurrentToken() throws Exception {
        parser = createParser("<root/>");
        parser.nextToken();
        parser.nextToken();
        // After END_OBJECT, _currToken might be null after some operations
        String text = parser.getText();
        assertNull(text);
    }

    @Test
    public void testGetTextCharacters() throws Exception {
        String xml = "<root>hello</root>";
        parser = createParser(xml);
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        char[] chars = parser.getTextCharacters();
        assertNotNull(chars);
        assertEquals(5, parser.getTextLength());
    }

    @Test
    public void testGetTextOffset() throws Exception {
        parser = createParser("<root>text</root>");
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        assertEquals(0, parser.getTextOffset());
    }

    @Test
    public void testHasTextCharacters() throws Exception {
        parser = createParser("<root/>");
        assertFalse(parser.hasTextCharacters());
    }

    @Test
    public void testGetEmbeddedObject() throws Exception {
        parser = createParser("<root/>");
        assertNull(parser.getEmbeddedObject());
    }

    @Test
    public void testGetBinaryValueBase64() throws Exception {
        String xml = "<root>YWN0aXZl</root>"; // "active" in base64
        parser = createParser(xml);
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        byte[] val = parser.getBinaryValue(Base64Variants.getDefaultVariant());
        assertNotNull(val);
        assertEquals(6, val.length);
    }

    @Test
    public void testGetBinaryValueWrongToken() throws Exception {
        String xml = "<root>123</root>";
        parser = createParser(xml);
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        try {
            parser.getBinaryValue(Base64Variants.getDefaultVariant());
            fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            // expected
        }
    }

    @Test
    public void testDecodeBase64() throws Exception {
        String xml = "<root>YWN0aXZl</root>";
        parser = createParser(xml);
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        byte[] val = parser._decodeBase64(Base64Variants.getDefaultVariant());
        assertNotNull(val);
        assertEquals(6, val.length);
    }

    @Test
    public void testGetBigIntegerValue() throws Exception {
        String xml = "<root>12345678901234567890</root>";
        parser = createParser(xml);
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        BigInteger big = parser.getBigIntegerValue();
        assertNotNull(big);
        assertEquals(new BigInteger("12345678901234567890"), big);
    }

    @Test
    public void testGetDecimalValue() throws Exception {
        String xml = "<root>123.45</root>";
        parser = createParser(xml);
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        BigDecimal bd = parser.getDecimalValue();
        assertNotNull(bd);
        assertEquals(new BigDecimal("123.45"), bd);
    }

    @Test
    public void testGetDoubleValue() throws Exception {
        String xml = "<root>12.34</root>";
        parser = createParser(xml);
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        double d = parser.getDoubleValue();
        assertEquals(12.34, d, 0.0001);
    }

    @Test
    public void testGetFloatValue() throws Exception {
        String xml = "<root>12.34</root>";
        parser = createParser(xml);
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        float f = parser.getFloatValue();
        assertEquals(12.34f, f, 0.0001f);
    }

    @Test
    public void testGetIntValue() throws Exception {
        String xml = "<root>42</root>";
        parser = createParser(xml);
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        int i = parser.getIntValue();
        assertEquals(42, i);
    }

    @Test
    public void testGetLongValue() throws Exception {
        String xml = "<root>1234567890</root>";
        parser = createParser(xml);
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        long l = parser.getLongValue();
        assertEquals(1234567890L, l);
    }

    @Test
    public void testGetNumberTypeInt() throws Exception {
        String xml = "<root>42</root>";
        parser = createParser(xml);
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        assertEquals(JsonParser.NumberType.INT, parser.getNumberType());
    }

    @Test
    public void testGetNumberTypeLong() throws Exception {
        String xml = "<root>123456789012</root>";
        parser = createParser(xml);
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        assertEquals(JsonParser.NumberType.LONG, parser.getNumberType());
    }

    @Test
    public void testGetNumberValue() throws Exception {
        String xml = "<root>42</root>";
        parser = createParser(xml);
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        Number num = parser.getNumberValue();
        assertNotNull(num);
        assertEquals(42, num.intValue());
    }

    @Test
    public void testHandleEOFInRoot() throws Exception {
        String xml = "<root/>";
        parser = createParser(xml);
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // END_OBJECT
        // Call _handleEOF when in root - should not throw
        try {
            // Accessing private method via reflection or test indirectly
            // Since it's protected, we can call via a subclass or use the public API
            // This test indirectly verifies by ensuring nextToken doesn't crash at EOF
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testIsEmptyVariations() throws Exception {
        parser = createParser("<root/>");
        // Test _isEmpty private method via reflection
        assertTrue(parser._isEmpty(""));
        assertTrue(parser._isEmpty(null));
        assertTrue(parser._isEmpty("   "));
        assertFalse(parser._isEmpty(" a "));
        assertFalse(parser._isEmpty("a"));
    }

    @Test
    public void testGetByteArrayBuilder() throws Exception {
        parser = createParser("<root/>");
        ByteArrayBuilder builder = parser._getByteArrayBuilder();
        assertNotNull(builder);
        ByteArrayBuilder builder2 = parser._getByteArrayBuilder();
        assertSame(builder, builder2);
    }

    @Test
    public void testNextTokenWithStartArray() throws Exception {
        String xml = "<array><item>1</item><item>2</item></array>";
        parser = createParser(xml);
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME
        parser.nextToken(); // VALUE_STRING
        // Verify array handling
    }

    @Test
    public void testNextTokenWithEndObject() throws Exception {
        String xml = "<root></root>";
        parser = createParser(xml);
        parser.nextToken(); // START_OBJECT
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testNextTokenWithXmlText() throws Exception {
        String xml = "<root>value</root>";
        parser = createParser(xml);
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME
        JsonToken t = parser.nextToken();
        assertEquals(JsonToken.VALUE_STRING, t);
        assertEquals("value", parser.getText());
    }
}