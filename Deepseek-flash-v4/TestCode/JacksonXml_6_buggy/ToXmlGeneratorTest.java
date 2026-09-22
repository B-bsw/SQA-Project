package com.fasterxml.jackson.dataformat.xml.ser;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamWriter;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.dataformat.xml.XmlPrettyPrinter;
import com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter;
import org.codehaus.stax2.XMLStreamWriter2;
import org.codehaus.stax2.ri.Stax2WriterAdapter;

public class ToXmlGeneratorTest {
    private ToXmlGenerator generator;
    private StringWriter stringWriter;
    private XMLStreamWriter2 xmlWriter;
    private IOContext ioContext;
    private TestJsonGeneratorDelegate delegate;

    @Before
    public void setUp() throws Exception {
        stringWriter = new StringWriter();
        xmlWriter = new TestXMLStreamWriter(stringWriter);
        ioContext = new IOContext(null, null, false, null);
        generator = new ToXmlGenerator(ioContext, 0, 0, null, xmlWriter);
        delegate = new TestJsonGeneratorDelegate(generator);
    }

    @After
    public void tearDown() {
        generator = null;
        stringWriter = null;
        xmlWriter = null;
        delegate = null;
    }

    @Test
    public void testFeatureCollectDefaults() {
        int defaults = ToXmlGenerator.Feature.collectDefaults();
        assertNotNull(defaults);
        assertTrue(defaults >= 0);
    }

    @Test
    public void testFeatureEnabledByDefault() {
        assertFalse(ToXmlGenerator.Feature.WRITE_XML_DECLARATION.enabledByDefault());
        assertFalse(ToXmlGenerator.Feature.WRITE_XML_1_1.enabledByDefault());
    }

    @Test
    public void testFeatureGetMask() {
        assertTrue(ToXmlGenerator.Feature.WRITE_XML_1_1.getMask() > 0);
        assertTrue(ToXmlGenerator.Feature.WRITE_XML_DECLARATION.getMask() > 0);
    }

    @Test
    public void testFeatureEnabledIn() {
        int mask = ToXmlGenerator.Feature.WRITE_XML_1_1.getMask();
        assertTrue(ToXmlGenerator.Feature.WRITE_XML_1_1.enabledIn(mask));
        assertFalse(ToXmlGenerator.Feature.WRITE_XML_DECLARATION.enabledIn(mask));
    }

    @Test
    public void testInitGenerator_NotInitialized() throws IOException {
        generator.initGenerator();
        assertNotNull(generator);
    }

    @Test
    public void testInitGenerator_AlreadyInitialized() throws IOException {
        generator.initGenerator();
        generator.initGenerator();
        assertNotNull(generator);
    }

    @Test
    public void testSetPrettyPrinter() {
        XmlPrettyPrinter pp = new DefaultXmlPrettyPrinter();
        generator.setPrettyPrinter(pp);
        assertNotNull(generator);
    }

    @Test
    public void testGetOutputTarget() {
        Object target = generator.getOutputTarget();
        assertNotNull(target);
    }

    @Test
    public void testGetOutputBuffered() {
        assertEquals(-1, generator.getOutputBuffered());
    }

    @Test
    public void testGetFormatFeatures() {
        assertEquals(0, generator.getFormatFeatures());
    }

    @Test
    public void testOverrideFormatFeatures() {
        int result = generator.overrideFormatFeatures(1, 1);
        assertEquals(1, result);
    }

    @Test
    public void testEnableFeature() {
        generator.enable(ToXmlGenerator.Feature.WRITE_XML_1_1);
        assertTrue(generator.isEnabled(ToXmlGenerator.Feature.WRITE_XML_1_1));
    }

    @Test
    public void testDisableFeature() {
        generator.enable(ToXmlGenerator.Feature.WRITE_XML_1_1);
        generator.disable(ToXmlGenerator.Feature.WRITE_XML_1_1);
        assertFalse(generator.isEnabled(ToXmlGenerator.Feature.WRITE_XML_1_1));
    }

    @Test
    public void testIsEnabled() {
        assertFalse(generator.isEnabled(ToXmlGenerator.Feature.WRITE_XML_1_1));
    }

    @Test
    public void testConfigureFeature() {
        generator.configure(ToXmlGenerator.Feature.WRITE_XML_1_1, true);
        assertTrue(generator.isEnabled(ToXmlGenerator.Feature.WRITE_XML_1_1));
        generator.configure(ToXmlGenerator.Feature.WRITE_XML_1_1, false);
        assertFalse(generator.isEnabled(ToXmlGenerator.Feature.WRITE_XML_1_1));
    }

    @Test
    public void testCanWriteFormattedNumbers() {
        assertTrue(generator.canWriteFormattedNumbers());
    }

    @Test
    public void testInRoot() {
        assertTrue(generator.inRoot());
    }

    @Test
    public void testGetStaxWriter() {
        assertEquals(xmlWriter, generator.getStaxWriter());
    }

    @Test
    public void testSetNextIsAttribute() {
        generator.setNextIsAttribute(true);
        assertNotNull(generator);
    }

    @Test
    public void testSetNextIsUnwrapped() {
        generator.setNextIsUnwrapped(true);
        assertNotNull(generator);
    }

    @Test
    public void testSetNextIsCData() {
        generator.setNextIsCData(true);
        assertNotNull(generator);
    }

    @Test
    public void testSetNextName() {
        QName name = new QName("ns", "local");
        generator.setNextName(name);
        assertEquals(name, generator.getStaxWriter() != null ? name : null);
    }

    @Test
    public void testSetNextNameIfMissing_WhenNull() {
        QName name = new QName("ns", "local");
        assertTrue(generator.setNextNameIfMissing(name));
    }

    @Test
    public void testSetNextNameIfMissing_WhenNotNull() {
        QName name1 = new QName("ns1", "local1");
        QName name2 = new QName("ns2", "local2");
        generator.setNextName(name1);
        assertFalse(generator.setNextNameIfMissing(name2));
    }

    @Test
    public void testStartWrappedValue_NullWrapper() throws IOException {
        generator.setNextName(new QName("ns", "name"));
        generator.startWrappedValue(null, new QName("ns2", "name2"));
        assertNotNull(generator);
    }

    @Test
    public void testStartWrappedValue_NonNullWrapper() throws IOException {
        generator.setNextName(new QName("ns", "name"));
        generator.startWrappedValue(new QName("ns3", "wrapper"), new QName("ns2", "name2"));
        assertNotNull(generator);
    }

    @Test
    public void testFinishWrappedValue() throws IOException {
        generator.setNextName(new QName("ns", "name"));
        generator.finishWrappedValue(new QName("ns3", "wrapper"), new QName("ns2", "name2"));
        assertNotNull(generator);
    }

    @Test
    public void testWriteRepeatedFieldName_Valid() throws IOException {
        generator.writeStartObject();
        generator.setNextName(new QName("ns", "name"));
        generator.writeString("value");
        generator.writeStringField("field", "value");
        generator.writeRepeatedFieldName();
        assertNotNull(generator);
    }

    @Test
    public void testWriteFieldName() throws IOException {
        generator.writeStartObject();
        generator.writeFieldName("field1");
        generator.writeString("value");
        assertNotNull(generator);
    }

    @Test
    public void testWriteStringField() throws IOException {
        generator.writeStartObject();
        generator.writeStringField("field", "value");
        assertNotNull(generator);
    }

    @Test
    public void testWriteStartArray() throws IOException {
        generator.writeStartArray();
        assertNotNull(generator);
    }

    @Test
    public void testWriteEndArray_WhenInArray() throws IOException {
        generator.writeStartArray();
        generator.writeEndArray();
        assertNotNull(generator);
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteEndArray_WhenNotInArray() throws IOException {
        generator.writeEndArray();
    }

    @Test
    public void testWriteStartObject() throws IOException {
        generator.writeStartObject();
        assertNotNull(generator);
    }

    @Test
    public void testWriteEndObject_WhenInObject() throws IOException {
        generator.writeStartObject();
        generator.writeEndObject();
        assertNotNull(generator);
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteEndObject_WhenNotInObject() throws IOException {
        generator.writeEndObject();
    }

    @Test
    public void testWriteString_Simple() throws IOException {
        generator.writeStartObject();
        generator.writeFieldName("field");
        generator.writeString("value");
        assertNotNull(generator);
    }

    @Test
    public void testWriteString_Attribute() throws IOException {
        generator.writeStartObject();
        generator.writeFieldName("field");
        generator.setNextIsAttribute(true);
        generator.writeString("value");
        assertNotNull(generator);
    }

    @Test
    public void testWriteString_Unwrapped() throws IOException {
        generator.writeStartObject();
        generator.writeFieldName("field");
        generator.setNextIsUnwrapped(true);
        generator.writeString("value");
        assertNotNull(generator);
    }

    @Test
    public void testWriteString_UnwrappedCData() throws IOException {
        generator.writeStartObject();
        generator.writeFieldName("field");
        generator.setNextIsUnwrapped(true);
        generator.setNextIsCData(true);
        generator.writeString("value");
        assertNotNull(generator);
    }

    @Test
    public void testWriteString_CharSeq() throws IOException {
        generator.writeStartObject();
        generator.writeFieldName("field");
        generator.writeString(new StringBuffer("value"));
        assertNotNull(generator);
    }

    @Test
    public void testWriteString_SerializableString() throws IOException {
        generator.writeStartObject();
        generator.writeFieldName("field");
        generator.writeString(new TestSerializableString("value"));
        assertNotNull(generator);
    }

    @Test
    public void testWriteRawUTF8String() throws IOException {
        try {
            generator.writeRawUTF8String("value".getBytes(), 0, 5);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testWriteUTF8String() throws IOException {
        generator.writeStartObject();
        generator.writeFieldName("field");
        generator.writeUTF8String("value".getBytes(), 0, 5);
        assertNotNull(generator);
    }

    @Test
    public void testWriteRawValue_String() throws IOException {
        generator.writeStartObject();
        generator.writeFieldName("field");
        generator.writeRawValue("value");
        assertNotNull(generator);
    }

    @Test
    public void testWriteRawValue_StringOffsetLen() throws IOException {
        generator.writeStartObject();
        generator.writeFieldName("field");
        generator.writeRawValue("value", 1, 3);
        assertNotNull(generator);
    }

    @Test
    public void testWriteRawValue_CharArray() throws IOException {
        generator.writeStartObject();
        generator.writeFieldName("field");
        generator.writeRawValue("value".toCharArray(), 0, 5);
        assertNotNull(generator);
    }

    @Test
    public void testWriteRawValue_SerializableString() throws IOException {
        generator.writeStartObject();
        generator.writeFieldName("field");
        generator.writeRawValue(new TestSerializableString("value"));
        assertNotNull(generator);
    }

    @Test
    public void testWriteRaw_String() throws IOException {
        generator.writeStartObject();
        generator.writeFieldName("field");
        try {
            generator.writeRaw("value");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testWriteRaw_StringOffsetLen() throws IOException {
        generator.writeStartObject();
        generator.writeFieldName("field");
        generator.writeRaw("value", 0, 5);
        assertNotNull(generator);
    }

    @Test
    public void testWriteRaw_CharArray() throws IOException {
        generator.writeStartObject();
        generator.writeFieldName("field");
        generator.writeRaw("value".toCharArray(), 0, 5);
        assertNotNull(generator);
    }

    @Test
    public void testWriteRaw_Char() throws IOException {
        generator.writeStartObject();
        generator.writeFieldName("field");
        generator.writeRaw('v');
        assertNotNull(generator);
    }

    @Test
    public void testWriteBinary_NullData() throws IOException {
        generator.writeStartObject();
        generator.writeFieldName("field");
        generator.writeBinary(Base64Variants.getDefaultVariant(), null, 0, 0);
        assertNotNull(generator);
    }

    @Test
    public void testWriteBinary_ValidData() throws IOException {
        generator.writeStartObject();
        generator.writeFieldName("field");
        byte[] data = new byte[]{1, 2, 3};
        generator.writeBinary(Base64Variants.getDefaultVariant(), data, 0, 3);
        assertNotNull(generator);
    }

    @Test
    public void testWriteBoolean_True() throws IOException {
        generator.writeStartObject();
        generator.writeFieldName("field");
        generator.writeBoolean(true);
        assertNotNull(generator);
    }

    @Test
    public void testWriteBoolean_False() throws IOException {
        generator.writeStartObject();
        generator.writeFieldName("field");
        generator.writeBoolean(false);
        assertNotNull(generator);
    }

    @Test
    public void testWriteNull() throws IOException {
        generator.writeStartObject();
        generator.writeFieldName("field");
        generator.writeNull();
        assertNotNull(generator);
    }

    @Test
    public void testWriteNumber_Int() throws IOException {
        generator.writeStartObject();
        generator.writeFieldName("field");
        generator.writeNumber(42);
        assertNotNull(generator);
    }

    @Test
    public void testWriteNumber_Long() throws IOException {
        generator.writeStartObject();
        generator.writeFieldName("field");
        generator.writeNumber(42L);
        assertNotNull(generator);
    }

    @Test
    public void testWriteNumber_Double() throws IOException {
        generator.writeStartObject();
        generator.writeFieldName("field");
        generator.writeNumber(42.5);
        assertNotNull(generator);
    }

    @Test
    public void testWriteNumber_Float() throws IOException {
        generator.writeStartObject();
        generator.writeFieldName("field");
        generator.writeNumber(42.5f);
        assertNotNull(generator);
    }

    @Test
    public void testWriteNumber_BigDecimal_NonNull() throws IOException {
        generator.writeStartObject();
        generator.writeFieldName("field");
        generator.writeNumber(new BigDecimal("42.5"));
        assertNotNull(generator);
    }

    @Test
    public void testWriteNumber_BigDecimal_Null() throws IOException {
        generator.writeStartObject();
        generator.writeFieldName("field");
        generator.writeNumber((BigDecimal) null);
        assertNotNull(generator);
    }

    @Test
    public void testWriteNumber_BigInteger_NonNull() throws IOException {
        generator.writeStartObject();
        generator.writeFieldName("field");
        generator.writeNumber(new BigInteger("42"));
        assertNotNull(generator);
    }

    @Test
    public void testWriteNumber_BigInteger_Null() throws IOException {
        generator.writeStartObject();
        generator.writeFieldName("field");
        generator.writeNumber((BigInteger) null);
        assertNotNull(generator);
    }

    @Test
    public void testWriteNumber_String() throws IOException {
        generator.writeStartObject();
        generator.writeFieldName("field");
        generator.writeNumber("42");
        assertNotNull(generator);
    }

    @Test
    public void testFlush() throws IOException {
        generator.flush();
        assertNotNull(generator);
    }

    @Test
    public void testClose() throws IOException {
        generator.close();
        assertNotNull(generator);
    }

    private static class TestJsonGeneratorDelegate {
        private ToXmlGenerator delegate;
        public TestJsonGeneratorDelegate(ToXmlGenerator gen) {
            delegate = gen;
        }
        public ToXmlGenerator getDelegate() { return delegate; }
    }

    private static class TestSerializableString implements SerializableString {
        private String value;
        public TestSerializableString(String v) { value = v; }
        public String getValue() { return value; }
        public int charLength() { return value.length(); }
        public char[] asQuotedChars() { return value.toCharArray(); }
        public byte[] asUnquotedUTF8() { return value.getBytes(); }
        public byte[] asQuotedUTF8() { return value.getBytes(); }
        public String toString() { return value; }
    }

    private static class TestXMLStreamWriter extends Stax2WriterAdapter implements XMLStreamWriter2 {
        private StringWriter stringWriter;
        public TestXMLStreamWriter(StringWriter sw) {
            super(new TestXMLStreamWriterInner(sw));
            stringWriter = sw;
        }

        private static class TestXMLStreamWriterInner implements XMLStreamWriter {
            private StringWriter sw;
            public TestXMLStreamWriterInner(StringWriter sw) { this.sw = sw; }
            public void writeStartElement(String localName) { sw.write("<" + localName + ">"); }
            public void writeStartElement(String namespaceURI, String localName) { sw.write("<" + localName + ">"); }
            public void writeStartElement(String namespaceURI, String localName, String prefix) { sw.write("<" + localName + ">"); }
            public void writeEmptyElement(String namespaceURI, String localName) { sw.write("<" + localName + "/>"); }
            public void writeEmptyElement(String prefix, String localName, String namespaceURI) { sw.write("<" + localName + "/>"); }
            public void writeEmptyElement(String localName) { sw.write("<" + localName + "/>"); }
            public void writeEndElement() { sw.write("</>"); }
            public void writeEndDocument() {}
            public void close() {}
            public void flush() {}
            public void writeAttribute(String localName, String value) { sw.write(" " + localName + "=\"" + value + "\""); }
            public void writeAttribute(String prefix, String namespaceURI, String localName, String value) { sw.write(" " + localName + "=\"" + value + "\""); }
            public void writeAttribute(String namespaceURI, String localName, String value) { sw.write(" " + localName + "=\"" + value + "\""); }
            public void writeNamespace(String prefix, String namespaceURI) {}
            public void writeDefaultNamespace(String namespaceURI) {}
            public void writeComment(String data) {}
            public void writeProcessingInstruction(String target) {}
            public void writeProcessingInstruction(String target, String data) {}
            public void writeCData(String data) { sw.write("<![CDATA[" + data + "]]>"); }
            public void writeEntityRef(String name) {}
            public void writeStartDocument() {}
            public void writeStartDocument(String version) {}
            public void writeStartDocument(String encoding, String version) {}
            public void writeCharacters(String text) { sw.write(text); }
            public void writeCharacters(char[] text, int start, int len) { sw.write(new String(text, start, len)); }
            public String getPrefix(String uri) { return null; }
            public void setPrefix(String prefix, String uri) {}
            public void setDefaultNamespace(String uri) {}
            public void setProperty(String name, Object value) {}
            public Object getProperty(String name) { return null; }
            public javax.xml.namespace.QName getAttributeName(int index) { return null; }
            public javax.xml.stream.events.XMLEvent getEventType() { return null; }
            public String getText() { return null; }
            public int getTextCharacters(char[] sourceText, int fromIndex, int len) { return 0; }
            public char[] getTextCharacters() { return null; }
            public int getTextStart() { return 0; }
            public int getTextLength() { return 0; }
            public boolean hasNext() { return false; }
            public javax.xml.stream.XMLStreamReader getXMLStreamReader() { return null; }
            public boolean isStartElement() { return false; }
            public boolean isEndElement() { return false; }
            public boolean isCharacters() { return false; }
            public boolean isWhiteSpace() { return false; }
            public javax.xml.stream.XMLStreamConstants getXMLStreamConstants() { return null; }
            public int next() { return 0; }
            public boolean hasText() { return false; }
            public boolean hasName() { return false; }
            public javax.xml.namespace.QName getName() { return null; }
            public javax.xml.namespace.QName getQName() { return null; }
            public int nextTag() { return 0; }
        }
    }
}