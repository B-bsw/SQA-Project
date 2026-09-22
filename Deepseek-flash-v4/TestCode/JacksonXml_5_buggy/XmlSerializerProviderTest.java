package com.fasterxml.jackson.dataformat.xml.ser;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.io.StringWriter;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerFactory;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup;

public class XmlSerializerProviderTest {
    private XmlSerializerProvider provider;
    private XmlRootNameLookup rootNameLookup;
    private SerializationConfig config;
    private SerializerFactory serializerFactory;
    private ToXmlGenerator xmlGenerator;
    private StringWriter stringWriter;
    private XMLStreamWriter staxWriter;

    @Before
    public void setUp() throws Exception {
        rootNameLookup = new XmlRootNameLookup();
        config = new XmlMapper().getSerializationConfig();
        serializerFactory = new XmlMapper().getSerializerFactory();
        provider = new XmlSerializerProvider(rootNameLookup);
        provider.initialize(config, serializerFactory);
        stringWriter = new StringWriter();
        staxWriter = mock(XMLStreamWriter.class);
        xmlGenerator = mock(ToXmlGenerator.class);
        when(xmlGenerator.getStaxWriter()).thenReturn(staxWriter);
    }

    @Test
    public void testCopy() {
        XmlSerializerProvider copied = (XmlSerializerProvider) provider.copy();
        assertNotNull(copied);
        assertNotSame(provider, copied);
        assertSame(rootNameLookup, copied._rootNameLookup);
    }

    @Test
    public void testCreateInstance() {
        DefaultSerializerProvider instance = provider.createInstance(config, serializerFactory);
        assertNotNull(instance);
        assertTrue(instance instanceof XmlSerializerProvider);
        XmlSerializerProvider xmlInstance = (XmlSerializerProvider) instance;
        assertSame(rootNameLookup, xmlInstance._rootNameLookup);
    }

    @Test
    public void testSerializeValueNullWithToXmlGenerator() throws IOException {
        when(xmlGenerator.inRoot()).thenReturn(true);
        when(xmlGenerator.setNextNameIfMissing(any(QName.class))).thenReturn(false);
        
        provider.serializeValue(xmlGenerator, null);
        
        verify(xmlGenerator).initGenerator();
        verify(xmlGenerator).setNextNameIfMissing(ROOT_NAME_FOR_NULL);
    }

    @Test
    public void testSerializeValueNullWithNonXmlGenerator() throws IOException {
        JsonGenerator gen = mock(JsonGenerator.class);
        provider.serializeValue(gen, null);
        
        // Verify no interaction with ToXmlGenerator methods
        verify(xmlGenerator, never()).initGenerator();
        verify(xmlGenerator, never()).setNextName(any(QName.class));
    }

    @Test
    public void testSerializeValueWithTokenBuffer() throws IOException {
        TokenBuffer tokenBuffer = new TokenBuffer(new ObjectMapper(), false);
        JsonGenerator gen = tokenBuffer.asParser().getCodec().createGenerator(new StringWriter());
        
        provider.serializeValue(gen, "test");
        
        // No exception should be thrown
    }

    @Test(expected = JsonMappingException.class)
    public void testSerializeValueWithUnsupportedGenerator() throws IOException {
        JsonGenerator gen = mock(JsonGenerator.class);
        when(gen.getCodec()).thenReturn(null);
        provider.serializeValue(gen, "test");
    }

    @Test
    public void testSerializeValueWithRootNameFromConfig() throws IOException {
        config = config.withRootName(new PropertyName("customRoot", "http://example.com"));
        
        XmlSerializerProvider customProvider = new XmlSerializerProvider(rootNameLookup);
        customProvider.initialize(config, serializerFactory);
        
        when(xmlGenerator.inRoot()).thenReturn(false);
        when(xmlGenerator.setNextNameIfMissing(any(QName.class))).thenReturn(true);
        
        customProvider.serializeValue(xmlGenerator, new Object());
        
        verify(xmlGenerator).setNextNameIfMissing(new QName("http://example.com", "customRoot"));
    }

    @Test
    public void testSerializeValueWithRootNameDefault() throws IOException {
        when(xmlGenerator.inRoot()).thenReturn(false);
        when(xmlGenerator.setNextNameIfMissing(any(QName.class))).thenReturn(true);
        
        provider.serializeValue(xmlGenerator, new Object());
        
        verify(xmlGenerator).setNextNameIfMissing(any(QName.class));
        verify(rootNameLookup).findRootName(any(Class.class), any(SerializationConfig.class));
    }

    @Test
    public void testSerializeValueArrayStart() throws IOException {
        when(xmlGenerator.inRoot()).thenReturn(false);
        when(xmlGenerator.setNextNameIfMissing(any(QName.class))).thenReturn(true);
        
        String[] array = new String[] {"a", "b"};
        provider.serializeValue(xmlGenerator, array);
        
        verify(xmlGenerator).writeStartObject();
        verify(xmlGenerator).writeFieldName("item");
        verify(xmlGenerator).writeEndObject();
    }

    @Test
    public void testSerializeValueWithRootTypeAndNullValue() throws IOException {
        JavaType rootType = new XmlMapper().getTypeFactory().constructType(String.class);
        provider.serializeValue(xmlGenerator, null, rootType, null);
        
        verify(xmlGenerator).initGenerator();
        verify(xmlGenerator).setNextNameIfMissing(ROOT_NAME_FOR_NULL);
    }

    @Test
    public void testSerializeValueWithRootTypeAndNonNullValue() throws IOException {
        JavaType rootType = new XmlMapper().getTypeFactory().constructType(String.class);
        
        when(xmlGenerator.inRoot()).thenReturn(false);
        when(xmlGenerator.setNextNameIfMissing(any(QName.class))).thenReturn(true);
        
        provider.serializeValue(xmlGenerator, "hello", rootType, null);
        
        verify(xmlGenerator).writeString("hello");
    }

    @Test
    public void testSerializeValueWithRootTypeAndArray() throws IOException {
        JavaType rootType = new XmlMapper().getTypeFactory().constructArrayType(String.class);
        
        when(xmlGenerator.inRoot()).thenReturn(false);
        when(xmlGenerator.setNextNameIfMissing(any(QName.class))).thenReturn(true);
        
        String[] array = new String[] {"x"};
        provider.serializeValue(xmlGenerator, array, rootType, null);
        
        verify(xmlGenerator).writeStartObject();
        verify(xmlGenerator).writeFieldName("item");
        verify(xmlGenerator).writeEndObject();
    }

    @Test
    public void testRootNameFromConfigWithNullName() {
        SerializationConfig config = mock(SerializationConfig.class);
        when(config.getFullRootName()).thenReturn(null);
        XmlSerializerProvider p = new XmlSerializerProvider(rootNameLookup);
        p.initialize(config, null);
        
        QName qname = p._rootNameFromConfig();
        assertNull(qname);
    }

    @Test
    public void testRootNameFromConfigWithEmptyNamespace() {
        SerializationConfig config = mock(SerializationConfig.class);
        when(config.getFullRootName()).thenReturn(new PropertyName("root", ""));
        XmlSerializerProvider p = new XmlSerializerProvider(rootNameLookup);
        p.initialize(config, null);
        
        QName qname = p._rootNameFromConfig();
        assertEquals(new QName("root"), qname);
    }

    @Test
    public void testRootNameFromConfigWithNamespace() {
        SerializationConfig config = mock(SerializationConfig.class);
        when(config.getFullRootName()).thenReturn(new PropertyName("root", "ns"));
        XmlSerializerProvider p = new XmlSerializerProvider(rootNameLookup);
        p.initialize(config, null);
        
        QName qname = p._rootNameFromConfig();
        assertEquals(new QName("ns", "root"), qname);
    }

    @Test
    public void testAsXmlGeneratorWithValidToXmlGenerator() throws JsonMappingException {
        ToXmlGenerator gen = mock(ToXmlGenerator.class);
        assertEquals(gen, provider._asXmlGenerator(gen));
    }

    @Test
    public void testAsXmlGeneratorWithTokenBuffer() throws JsonMappingException {
        TokenBuffer tokenBuffer = new TokenBuffer(new ObjectMapper(), false);
        try {
            assertNull(provider._asXmlGenerator(tokenBuffer));
        } catch (JsonMappingException e) {
            fail("Should not throw JsonMappingException for TokenBuffer");
        }
    }

    @Test(expected = JsonMappingException.class)
    public void testAsXmlGeneratorWithUnsupportedGenerator() throws JsonMappingException {
        JsonGenerator gen = mock(JsonGenerator.class);
        provider._asXmlGenerator(gen);
    }

    @Test
    public void testWrapAsIOEWithIOException() {
        IOException original = new IOException("test");
        IOException result = provider._wrapAsIOE(null, original);
        assertSame(original, result);
    }

    @Test
    public void testWrapAsIOEWithJsonMappingException() {
        JsonMappingException original = new JsonMappingException("test");
        IOException result = provider._wrapAsIOE(null, original);
        assertSame(original, result);
    }

    @Test
    public void testWrapAsIOEWithRuntimeException() {
        RuntimeException re = new RuntimeException("runtime exception");
        IOException result = provider._wrapAsIOE(null, re);
        assertTrue(result instanceof JsonMappingException);
        assertEquals("runtime exception", result.getMessage());
    }

    @Test
    public void testWrapAsIOEWithExceptionNoMessage() {
        Exception e = new Exception() {{
            getMessage(); // override to return null
        }};
        IOException result = provider._wrapAsIOE(null, e);
        assertNotNull(result.getMessage());
        assertTrue(result.getMessage().contains("[no message for"));
    }

    @Test
    public void testInitWithRootNameSetsDefaultNamespace() throws IOException, XMLStreamException {
        QName rootName = new QName("http://example.com", "root", "prefix");
        
        when(staxWriter.getNamespaceContext()).thenReturn(mock(NamespaceContext.class));
        
        provider._initWithRootName(xmlGenerator, rootName);
        
        verify(staxWriter).setDefaultNamespace("http://example.com");
    }

    @Test
    public void testInitWithRootNameNoNamespace() throws IOException, XMLStreamException {
        QName rootName = new QName("root");
        
        provider._initWithRootName(xmlGenerator, rootName);
        
        // Should not call setDefaultNamespace when namespace is empty
        verify(staxWriter, never()).setDefaultNamespace(anyString());
    }

    @Test
    public void testInitWithRootNameWhenSetNameFails() throws IOException {
        when(xmlGenerator.setNextNameIfMissing(any(QName.class))).thenReturn(false);
        when(xmlGenerator.inRoot()).thenReturn(true);
        
        QName rootName = new QName("root");
        provider._initWithRootName(xmlGenerator, rootName);
        
        verify(xmlGenerator).setNextName(rootName);
    }

    @Test
    public void testInitWithRootNameWhenSetNameSucceeds() throws IOException {
        when(xmlGenerator.setNextNameIfMissing(any(QName.class))).thenReturn(true);
        when(xmlGenerator.inRoot()).thenReturn(false);
        
        QName rootName = new QName("root");
        provider._initWithRootName(xmlGenerator, rootName);
        
        verify(xmlGenerator, never()).setNextName(any(QName.class));
    }

    @Test
    public void testStartRootArray() throws IOException {
        when(xmlGenerator.writeStartObject()).thenReturn(null);
        when(xmlGenerator.writeFieldName(anyString())).thenReturn(null);
        
        QName rootName = new QName("root");
        provider._startRootArray(xmlGenerator, rootName);
        
        verify(xmlGenerator).writeStartObject();
        verify(xmlGenerator).writeFieldName("item");
    }

    @Test
    public void testSerializeValueWithException() throws IOException {
        when(xmlGenerator.inRoot()).thenReturn(false);
        when(xmlGenerator.setNextNameIfMissing(any(QName.class))).thenReturn(true);
        doThrow(new RuntimeException("serialization error")).when(xmlGenerator).writeString(anyString());
        
        try {
            provider.serializeValue(xmlGenerator, "test");
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testSerializeValueWithNullValueAndConfigRootName() throws IOException {
        config = config.withRootName(new PropertyName("root"));
        
        XmlSerializerProvider p = new XmlSerializerProvider(rootNameLookup);
        p.initialize(config, serializerFactory);
        
        when(xmlGenerator.inRoot()).thenReturn(true);
        when(xmlGenerator.setNextNameIfMissing(any(QName.class))).thenReturn(false);
        
        p.serializeValue(xmlGenerator, null);
        
        verify(xmlGenerator).setNextNameIfMissing(new QName("root"));
    }

    @Test
    public void testSerializeValueWithRootNameFromConfigAndIndexedType() throws IOException {
        config = config.withRootName(new PropertyName("root"));
        
        XmlSerializerProvider p = new XmlSerializerProvider(rootNameLookup);
        p.initialize(config, serializerFactory);
        
        when(xmlGenerator.inRoot()).thenReturn(false);
        when(xmlGenerator.setNextNameIfMissing(any(QName.class))).thenReturn(true);
        
        String[] array = new String[] {"a"};
        p.serializeValue(xmlGenerator, array);
        
        verify(xmlGenerator).writeStartObject();
        verify(xmlGenerator).writeFieldName("item");
        verify(xmlGenerator).writeEndObject();
    }

    @Test
    public void testSerializeValueWithRootTypeAndNonXmlGenerator() throws IOException {
        JsonGenerator gen = mock(JsonGenerator.class);
        JavaType rootType = new XmlMapper().getTypeFactory().constructType(String.class);
        
        provider.serializeValue(gen, "value", rootType, null);
        
        verify(gen).writeString("value");
    }

    @Test
    public void testConstructorWithConfig() {
        XmlSerializerProvider p = new XmlSerializerProvider(rootNameLookup);
        assertEquals(rootNameLookup, p._rootNameLookup);
    }

    @Test
    public void testConstructorWithProviderAndConfig() {
        SerializationConfig newConfig = mock(SerializationConfig.class);
        XmlSerializerProvider src = new XmlSerializerProvider(rootNameLookup);
        XmlSerializerProvider copy = new XmlSerializerProvider(src, newConfig, null);
        
        assertEquals(newConfig, copy._config);
    }

    @Test
    public void testConstructorWithProviderOnly() {
        XmlSerializerProvider src = new XmlSerializerProvider(rootNameLookup);
        XmlSerializerProvider copy = new XmlSerializerProvider(src);
        
        assertEquals(rootNameLookup, copy._rootNameLookup);
    }

    @Test
    public void testRootNameFromConfigWithNullSimpleName() {
        SerializationConfig config = mock(SerializationConfig.class);
        when(config.getFullRootName()).thenReturn(new PropertyName(null, "ns"));
        
        XmlSerializerProvider p = new XmlSerializerProvider(rootNameLookup);
        p.initialize(config, null);
        
        QName qname = p._rootNameFromConfig();
        assertEquals(new QName("ns", ""), qname);
    }

    @Test
    public void testRootNameFromConfigWithEmptySimpleName() {
        SerializationConfig config = mock(SerializationConfig.class);
        when(config.getFullRootName()).thenReturn(new PropertyName("", "ns"));
        
        XmlSerializerProvider p = new XmlSerializerProvider(rootNameLookup);
        p.initialize(config, null);
        
        QName qname = p._rootNameFromConfig();
        assertEquals(new QName("ns", ""), qname);
    }

    @Test
    public void testSerializeValueWithRootTypeAndNullValueNoConfig() throws IOException {
        JavaType rootType = new XmlMapper().getTypeFactory().constructType(String.class);
        
        provider.serializeValue(xmlGenerator, null, rootType, null);
        
        verify(xmlGenerator).initGenerator();
        verify(xmlGenerator).setNextNameIfMissing(ROOT_NAME_FOR_NULL);
    }
}