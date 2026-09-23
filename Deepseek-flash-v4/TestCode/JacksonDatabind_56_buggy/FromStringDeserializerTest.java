package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.util.TokenBuffer;

public class FromStringDeserializerTest {

    @Test
    public void testTypesReturnsAllSupportedTypes() {
        Class<?>[] expected = new Class<?>[] {
            File.class,
            URL.class,
            URI.class,
            Class.class,
            JavaType.class,
            Currency.class,
            Pattern.class,
            Locale.class,
            Charset.class,
            TimeZone.class,
            InetAddress.class,
            InetSocketAddress.class
        };
        assertArrayEquals(expected, FromStringDeserializer.types());
    }

    @Test
    public void testFindDeserializerFindsAllAndReturnsNullForUnknown() {
        for (Class<?> cls : FromStringDeserializer.types()) {
            assertNotNull("No deserializer for " + cls.getName(),
                    FromStringDeserializer.findDeserializer(cls));
        }
        assertNull(FromStringDeserializer.findDeserializer(String.class));
    }

    @Test
    public void testDeserializeTextValues() throws Exception {
        ObjectMapper mapper = mapperWithAllDeserializers();

        assertEquals(new File("/tmp/foo"), mapper.readValue("\"/tmp/foo\"", File.class));
        assertEquals(new URL("http://example.com"), mapper.readValue("\"http://example.com\"", URL.class));
        assertEquals(URI.create("http://example.com"), mapper.readValue("\"http://example.com\"", URI.class));

        Class<?> cls = mapper.readValue("\"java.lang.String\"", Class.class);
        assertEquals(String.class, cls);

        JavaType javaType = mapper.readValue("\"java.lang.String\"", JavaType.class);
        assertEquals(String.class, javaType.getRawClass());

        assertEquals("USD", mapper.readValue("\"USD\"", Currency.class).getCurrencyCode());
        assertEquals("a*b", mapper.readValue("\"a*b\"", Pattern.class).pattern());

        assertEquals(new Locale("en"), mapper.readValue("\"en\"", Locale.class));
        assertEquals(new Locale("en", "US"), mapper.readValue("\"en_US\"", Locale.class));
        assertEquals(new Locale("en", "US", "POSIX"), mapper.readValue("\"en_US_POSIX\"", Locale.class));

        assertEquals(Charset.forName("UTF-8"), mapper.readValue("\"UTF-8\"", Charset.class));

        assertEquals("GMT", mapper.readValue("\"GMT\"", TimeZone.class).getID());
        assertEquals(InetAddress.getByName("127.0.0.1"), mapper.readValue("\"127.0.0.1\"", InetAddress.class));

        InetSocketAddress socketAddress = mapper.readValue("\"127.0.0.1:8080\"", InetSocketAddress.class);
        assertEquals(8080, socketAddress.getPort());
        assertEquals("127.0.0.1", socketAddress.getHostString());

        InetSocketAddress socketWithoutPort = mapper.readValue("\"127.0.0.1\"", InetSocketAddress.class);
        assertEquals(0, socketWithoutPort.getPort());
    }

    @Test
    public void testDeserializeEmptyString() throws Exception {
        ObjectMapper mapper = mapperWithAllDeserializers();

        assertNull(mapper.readValue("\"\"", File.class));
        assertNull(mapper.readValue("\"   \"", File.class));
        assertEquals(URI.create(""), mapper.readValue("\"\"", URI.class));
        assertEquals(Locale.ROOT, mapper.readValue("\"\"", Locale.class));
        assertNull(mapper.readValue("\"\"", Currency.class));
    }

    @Test
    public void testInvalidTextThrowsInvalidFormatException() throws Exception {
        ObjectMapper mapper = mapperWithAllDeserializers();

        try {
            mapper.readValue("\"NOT_A_CURRENCY\"", Currency.class);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("not a valid textual representation"));
            assertTrue(e.getCause() instanceof IllegalArgumentException);
        }
    }

    @Test
    public void testNullResultFromDeserializeThrows() throws Exception {
        SimpleModule module = new SimpleModule();
        module.addDeserializer(String.class, new NullReturningDeser());
        ObjectMapper mapper = new ObjectMapper().registerModule(module);

        try {
            mapper.readValue("\"abc\"", String.class);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("not a valid textual representation"));
            assertNull(e.getCause());
        }
    }

    @Test
    public void testUnwrapSingleValueArray() throws Exception {
        ObjectMapper mapper = mapperWithAllDeserializers();
        mapper.enable(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);

        File result = mapper.readValue("[\"/tmp/foo\"]", File.class);
        assertEquals(new File("/tmp/foo"), result);
    }

    @Test
    public void testUnwrapSingleValueArrayWithExtraElementThrows() throws Exception {
        ObjectMapper mapper = mapperWithAllDeserializers();
        mapper.enable(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);

        try {
            mapper.readValue("[\"/tmp/a\",\"/tmp/b\"]", File.class);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Attempted to unwrap single value array"));
        }
    }

    @Test
    public void testArrayWithoutUnwrapThrowsMappingException() throws Exception {
        ObjectMapper mapper = mapperWithAllDeserializers();

        try {
            mapper.readValue("[\"/tmp/a\"]", File.class);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testEmbeddedObjectSameTypeReturned() throws Exception {
        ObjectMapper mapper = mapperWithFileDeserializer();
        TokenBuffer buffer = new TokenBuffer(mapper, false);
        File file = new File("/tmp/embedded");
        buffer.writeEmbeddedObject(file);
        JsonParser p = buffer.asParser();

        try {
            File result = mapper.readValue(p, File.class);
            assertEquals(file, result);
        } finally {
            p.close();
            buffer.close();
        }
    }

    @Test
    public void testEmbeddedObjectUnsupportedTypeThrows() throws Exception {
        ObjectMapper mapper = mapperWithFileDeserializer();
        TokenBuffer buffer = new TokenBuffer(mapper, false);
        buffer.writeEmbeddedObject("not a file");
        JsonParser p = buffer.asParser();

        try {
            mapper.readValue(p, File.class);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Don't know how to convert embedded Object"));
        } finally {
            p.close();
            buffer.close();
        }
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    private ObjectMapper mapperWithAllDeserializers() {
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();

        addDeser(module, File.class);
        addDeser(module, URL.class);
        addDeser(module, URI.class);
        addDeser(module, Class.class);
        addDeser(module, JavaType.class);
        addDeser(module, Currency.class);
        addDeser(module, Pattern.class);
        addDeser(module, Locale.class);
        addDeser(module, Charset.class);
        addDeser(module, TimeZone.class);
        addDeser(module, InetAddress.class);
        addDeser(module, InetSocketAddress.class);

        return mapper.registerModule(module);
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    private ObjectMapper mapperWithFileDeserializer() {
        SimpleModule module = new SimpleModule();
        addDeser(module, File.class);
        return new ObjectMapper().registerModule(module);
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    private void addDeser(SimpleModule module, Class<?> rawType) {
        module.addDeserializer((Class) rawType,
                (JsonDeserializer) FromStringDeserializer.findDeserializer(rawType));
    }

    @SuppressWarnings("serial")
    private static class NullReturningDeser extends FromStringDeserializer<String> {

        NullReturningDeser() {
            super(String.class);
        }

        @Override
        protected String _deserialize(String value, DeserializationContext ctxt) throws IOException {
            return null;
        }
    }
}