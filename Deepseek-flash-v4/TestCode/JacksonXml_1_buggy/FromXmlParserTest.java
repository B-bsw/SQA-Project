package com.fasterxml.jackson.dataformat.xml.deser;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;

public class FromXmlParserTest {
    private FromXmlParser parser;

    @Before
    public void setUp() throws IOException {
        XMLStreamReaderStub xmlReader = new XMLStreamReaderStub();
        IOContextStub ioContext = new IOContextStub();
        parser = new FromXmlParser(ioContext, 0, 0, null, xmlReader);
    }

    @Test
    public void testVersion() {
        assertNotNull(parser.version());
        assertEquals("2.0.0", parser.version().toString());
    }

    @Test
    public void testGetCodecAndSetCodec() {
        ObjectCodec codec = new ObjectCodecStub();
        assertNull(parser.getCodec());
        parser.setCodec(codec);
        assertSame(codec, parser.getCodec());
    }

    @Test
    public void testSetXMLTextElementName() {
        parser.setXMLTextElementName("customText");
        assertEquals("customText", parser._cfgNameForTextElement);
    }

    @Test
    public void testRequiresCustomCodec() {
        assertTrue(parser.requiresCustomCodec());
    }

    @Test
    public void testEnableDisableIsEnabled() {
        FromXmlParser.Feature feature = FromXmlParser.Feature.WRITE_XML_DECLARATION;
        parser.enable(feature);
        assertTrue(parser.isEnabled(feature));
        assertFalse(parser.isEnabled(FromXmlParser.Feature.EMPTY_ELEMENT_AS_NULL));
        parser.disable(feature);
        assertFalse(parser.isEnabled(feature));
    }

    @Test
    public void testConfigure() {
        FromXmlParser.Feature feature = FromXmlParser.Feature.WRITE_XML_DECLARATION;
        parser.configure(feature, true);
        assertTrue(parser.isEnabled(feature));
        parser.configure(feature, false);
        assertFalse(parser.isEnabled(feature));
    }

    @Test
    public void testGetFormatFeatures() {
        FromXmlParser.Feature f1 = FromXmlParser.Feature.WRITE_XML_DECLARATION;
        FromXmlParser.Feature f2 = FromXmlParser.Feature.EMPTY_ELEMENT_AS_NULL;
        parser.enable(f1);
        parser.enable(f2);
        int expected = f1.getMask() | f2.getMask();
        assertEquals(expected, parser.getFormatFeatures());
    }

    @Test
    public void testOverrideFormatFeatures() {
        FromXmlParser.Feature f1 = FromXmlParser.Feature.WRITE_XML_DECLARATION;
        parser.overrideFormatFeatures(f1.getMask(), f1.getMask());
        assertTrue(parser.isEnabled(f1));
    }

    @Test
    public void testGetStaxReader() {
        assertNotNull(parser.getStaxReader());
    }

    @Test
    public void testCollectDefaults() {
        int defaults = FromXmlParser.Feature.collectDefaults();
        assertTrue(defaults > 0);
    }

    @Test
    public void testGetCurrentNameNullToken() throws IOException {
        assertNull(parser.getCurrentName());
    }

    @Test
    public void testIsClosed() {
        assertFalse(parser.isClosed());
        try {
            parser.close();
        } catch (IOException e) {
            fail("Unexpected exception");
        }
        assertTrue(parser.isClosed());
    }

    @Test
    public void testGetParsingContext() {
        assertNotNull(parser.getParsingContext());
    }

    @Test
    public void testGetTokenLocation() {
        assertNotNull(parser.getTokenLocation());
    }

    @Test
    public void testGetCurrentLocation() {
        assertNotNull(parser.getCurrentLocation());
    }

    @Test
    public void testIsExpectedStartArrayTokenWithStartObject() throws IOException {
        parser._currToken = JsonToken.START_OBJECT;
        assertFalse(parser.isExpectedStartArrayToken());
    }

    @Test
    public void testIsExpectedStartArrayTokenWithStartArray() throws IOException {
        parser._currToken = JsonToken.START_ARRAY;
        assertTrue(parser.isExpectedStartArrayToken());
    }

    @Test
    public void testNextTokenSwitchCases() throws IOException {
        parser._nextToken = JsonToken.FIELD_NAME;
        parser._currToken = JsonToken.FIELD_NAME;
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        parser._nextToken = JsonToken.START_OBJECT;
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        parser._nextToken = JsonToken.END_OBJECT;
        parser._currToken = JsonToken.END_OBJECT;
        parser._nextToken = JsonToken.FIELD_NAME;
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        parser._nextToken = JsonToken.VALUE_STRING;
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
    }

    @Test
    public void testNextTokenWithXmlStartElement() throws IOException {
        XMLStreamReaderStub xmlReader = (XMLStreamReaderStub) parser._xmlTokens.getXmlReader();
        xmlReader.setNextTokenType(XMLStreamReaderStub.XML_START_ELEMENT);
        xmlReader.setLocalName("test");
        parser._mayBeLeaf = true;
        parser._nextToken = null;
        parser._parsingContext = XmlReadContext.createRootContext(-1, -1);
        JsonToken token = parser.nextToken();
        assertNotNull(token);
    }

    @Test
    public void testNextTokenWithXmlEndElement() throws IOException {
        XMLStreamReaderStub xmlReader = (XMLStreamReaderStub) parser._xmlTokens.getXmlReader();
        xmlReader.setNextTokenType(XMLStreamReaderStub.XML_END_ELEMENT);
        parser._mayBeLeaf = false;
        parser._currToken = JsonToken.FIELD_NAME;
        JsonToken token = parser.nextToken();
        assertEquals(JsonToken.VALUE_NULL, token);
    }

    @Test
    public void testNextTextValueWithStringToken() throws IOException {
        parser._currToken = JsonToken.VALUE_STRING;
        parser._currText = "testText";
        assertEquals("testText", parser.nextTextValue());
    }

    @Test
    public void testGetTextNullToken() throws IOException {
        parser._currToken = null;
        assertEquals(null, parser.getText());
    }

    @Test
    public void testGetTextFieldName() throws IOException {
        parser._currToken = JsonToken.FIELD_NAME;
        parser._parsingContext.setCurrentName("field");
        assertEquals("field", parser.getText());
    }

    @Test
    public void testGetTextValueString() throws IOException {
        parser._currToken = JsonToken.VALUE_STRING;
        parser._currText = "value";
        assertEquals("value", parser.getText());
    }

    @Test
    public void testGetValueAsStringScalarWithNull() throws IOException {
        parser._currToken = JsonToken.VALUE_NUMBER_INT;
        assertEquals("123", parser.getValueAsString("123"));
    }

    @Test
    public void testGetValueAsStringNonScalar() throws IOException {
        parser._currToken = JsonToken.START_OBJECT;
        assertEquals("default", parser.getValueAsString("default"));
    }

    @Test
    public void testGetTextCharactersNull() throws IOException {
        parser._currToken = null;
        assertNull(parser.getTextCharacters());
    }

    @Test
    public void testGetTextCharactersNotNull() throws IOException {
        parser._currToken = JsonToken.VALUE_STRING;
        parser._currText = "hello";
        assertNotNull(parser.getTextCharacters());
    }

    @Test
 public void testGetTextLengthNotNull() throws IOException {
        parser._currToken = JsonToken.VALUE_STRING;
        parser._currText = "length10";
        assertEquals(8, parser.getTextLength());
    }

    @Test
    public void testGetTextOffset() throws IOException {
        parser._currToken = JsonToken.VALUE_STRING;
        parser._currText = "test";
        assertEquals(0, parser.getTextOffset());
    }

    @Test
    public void testHasTextCharacters() {
        assertFalse(parser.hasTextCharacters());
    }

    @Test
    public void testGetEmbeddedObject() throws IOException {
        assertNull(parser.getEmbeddedObject());
    }

    @Test
    public void testGetBinaryValueNotString() throws IOException {
        parser._currToken = JsonToken.START_OBJECT;
        try {
            parser.getBinaryValue(Base64Variant.STD_BASE64);
            fail("Expected IOException");
        } catch (IOException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testGetBinaryValueWithValidBase64() throws IOException {
        parser._currToken = JsonToken.VALUE_STRING;
        parser._currText = "aGVsbG8=";
        byte[] result = parser.getBinaryValue(Base64Variant.STD_BASE64);
        assertEquals("hello", new String(result));
    }

    @Test
    public void test_decodeBase64() throws IOException {
        byte[] result = parser._decodeBase64(Base64Variant.STD_BASE64);
        assertNotNull(result);
    }

    @Test
    public void testGetBigIntegerValue() throws IOException {
        parser._currToken = JsonToken.VALUE_STRING;
        parser._currText = "12345";
        assertEquals(new BigInteger("12345"), parser.getBigIntegerValue());
    }

    @Test
    public void testGetDecimalValue() throws IOException {
        parser._currToken = JsonToken.VALUE_STRING;
        parser._currText = "123.45";
        assertEquals(new BigDecimal("123.45"), parser.getDecimalValue());
    }

    @Test
    public void testGetDoubleValueAsDouble() throws IOException {
        parser._currToken = JsonToken.VALUE_STRING;
        parser._currText = "12.34";
        assertEquals(12.34, parser.getDoubleValue(), 0.0001);
    }

    @Test
    public void testGetFloatValueAsFloat() throws IOException {
        parser._currToken = JsonToken.VALUE_STRING;
        parser._currText = "9.87";
        assertEquals(9.87f, parser.getFloatValue(), 0.0001f);
    }

    @Test
    public void testGetIntValueAsInt() throws IOException {
        parser._currToken = JsonToken.VALUE_STRING;
        parser._currText = "456";
        assertEquals(456, parser.getIntValue());
    }

    @Test
    public void testGetLongValueAsLong() throws IOException {
        parser._currToken = JsonToken.VALUE_STRING;
        parser._currText = "123456789";
        assertEquals(123456789L, parser.getLongValue());
    }

    @Test
    public void testGetNumberTypeInteger() throws IOException {
        parser._currToken = JsonToken.VALUE_STRING;
        parser._currText = "123";
        assertEquals(JsonParser.NumberType.INT, parser.getNumberType());
    }

    @Test
    public void testGetNumberValueAsInt() throws IOException {
        parser._currToken = JsonToken.VALUE_STRING;
        parser._currText = "123";
        assertEquals(123, parser.getNumberValue());
    }

    @Test
    public void testHandleEOFInNonRoot() {
        parser._parsingContext = XmlReadContext.createRootContext(-1, -1).createChildObjectContext(-1, -1);
        try {
            parser._handleEOF();
            fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testHandleEOFInRoot() throws IOException {
        parser._parsingContext = XmlReadContext.createRootContext(-1, -1);
        parser._handleEOF();
    }

    @Test
    public void testIsEmptyWithNull() {
        assertTrue(parser._isEmpty(null));
    }

    @Test
    public void testIsEmptyWithWhitespace() {
        assertTrue(parser._isEmpty("   "));
    }

    @Test
    public void testIsEmptyWithNonWhitespace() {
        assertFalse(parser._isEmpty(" a "));
    }

    @Test
    public void testGetByteArrayBuilder() {
        assertNotNull(parser._getByteArrayBuilder());
    }

    @Test
    public void testCloseNotClosed() throws IOException {
        parser._ioContextStub = new IOContextStub();
        parser._ioContextStub.setResourceManaged(false);
        parser._closed = false;
        parser.close();
        assertTrue(parser._closed);
    }

    private static class ObjectCodecStub extends ObjectCodec {
        @Override
        public JsonParser getFactory() { return null; }
        @Override
        public JsonParser createParser(String src) { return null; }
        @Override
        public JsonParser treeAsTokens(TreeNode n) { return null; }
        @Override
        public TreeNode readTree(JsonParser p) { return null; }
        @Override
        public void writeValue(com.fasterxml.jackson.core.JsonGenerator g, Object value) {}
        @Override
        public JsonParser.NumberType numberType() { return null; }
    }
}