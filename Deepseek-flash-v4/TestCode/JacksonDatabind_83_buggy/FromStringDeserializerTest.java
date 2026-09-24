package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import java.io.File;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FromStringDeserializerTest {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    @Test
    public void testTypesReturnsAllSupportedTypes() {
        Class<?>[] types = FromStringDeserializer.types();
        assertEquals(13, types.length);
        assertEquals(File.class, types[0]);
        assertEquals(URL.class, types[1]);
        assertEquals(URI.class, types[2]);
        assertEquals(Class.class, types[3]);
        assertEquals(JavaType.class, types[4]);
        assertEquals(Currency.class, types[5]);
        assertEquals(Pattern.class, types[6]);
        assertEquals(Locale.class, types[7]);
        assertEquals(Charset.class, types[8]);
        assertEquals(TimeZone.class, types[9]);
        assertEquals(InetAddress.class, types[10]);
        assertEquals(InetSocketAddress.class, types[11]);
        assertEquals(StringBuilder.class, types[12]);
    }

    @Test
    public void testFindDeserializerMapsAllKnownTypes() {
        assertKind(File.class, FromStringDeserializer.Std.STD_FILE);
        assertKind(URL.class, FromStringDeserializer.Std.STD_URL);
        assertKind(URI.class, FromStringDeserializer.Std.STD_URI);
        assertKind(Class.class, FromStringDeserializer.Std.STD_CLASS);
        assertKind(JavaType.class, FromStringDeserializer.Std.STD_JAVA_TYPE);
        assertKind(Currency.class, FromStringDeserializer.Std.STD_CURRENCY);
        assertKind(Pattern.class, FromStringDeserializer.Std.STD_PATTERN);
        assertKind(Locale.class, FromStringDeserializer.Std.STD_LOCALE);
        assertKind(Charset.class, FromStringDeserializer.Std.STD_CHARSET);
        assertKind(TimeZone.class, FromStringDeserializer.Std.STD_TIME_ZONE);
        assertKind(InetAddress.class, FromStringDeserializer.Std.STD_INET_ADDRESS);
        assertKind(InetSocketAddress.class, FromStringDeserializer.Std.STD_INET_SOCKET_ADDRESS);
        assertKind(StringBuilder.class, FromStringDeserializer.Std.STD_STRING_BUILDER);
    }

    private void assertKind(Class<?> rawType, int expectedKind) {
        FromStringDeserializer.Std deser = FromStringDeserializer.findDeserializer(rawType);
        assertNotNull("No deserializer for " + rawType, deser);
        assertEquals("Kind mismatch for " + rawType, expectedKind, deser._kind);
    }

    @Test
    public void testFindDeserializerRejectsUnsupportedType() {
        assertNull(FromStringDeserializer.findDeserializer(Object.class));
        assertNull(FromStringDeserializer.findDeserializer(null));
    }

    @Test
    public void testDeserializeSupportedTypes() throws Exception {
        assertEquals(new File("test.txt"), MAPPER.readValue("\"test.txt\"", File.class));
        assertEquals("http://localhost/test", MAPPER.readValue("\"http://localhost/test\"", URL.class).toString());
        assertEquals(URI.create("http://localhost/test"), MAPPER.readValue("\"http://localhost/test\"", URI.class));
        assertSame(String.class, MAPPER.readValue("\"java.lang.String\"", Class.class));
        assertEquals(String.class, MAPPER.readValue("\"java.lang.String\"", JavaType.class).getRawClass());
        assertEquals(Currency.getInstance("USD"), MAPPER.readValue("\"USD\"", Currency.class));
        assertEquals("a*b", MAPPER.readValue("\"a*b\"", Pattern.class).pattern());
        assertEquals(new Locale("en", "US"), MAPPER.readValue("\"en_US\"", Locale.class));
        assertEquals(Charset.forName("UTF-8"), MAPPER.readValue("\"UTF-8\"", Charset.class));
        assertEquals("America/New_York", MAPPER.readValue("\"America/New_York\"", TimeZone.class).getID());
        assertEquals(InetAddress.getByName("127.0.0.1"), MAPPER.readValue("\"127.0.0.1\"", InetAddress.class));
        assertEquals("abc", MAPPER.readValue("\"abc\"", StringBuilder.class).toString());
    }

    @Test
    public void testDeserializeLocaleVariants() throws Exception {
        assertEquals(new Locale("en"), MAPPER.readValue("\"en\"", Locale.class));
        assertEquals(new Locale("en", "US"), MAPPER.readValue("\"en-US\"", Locale.class));
        assertEquals(new Locale("en", "US", "WIN"), MAPPER.readValue("\"en_US_WIN\"", Locale.class));
        assertEquals(Locale.ROOT, MAPPER.readValue("\"\"", Locale.class));
        assertEquals(Locale.ROOT, MAPPER.readValue("\"   \"", Locale.class));
    }

    @Test
    public void testDeserializeInetSocketAddressVariants() throws Exception {
        InetSocketAddress hostPort = MAPPER.readValue("\"127.0.0.1:8080\"", InetSocketAddress.class);
        assertEquals(8080, hostPort.getPort());
        assertEquals("127.0.0.1", hostPort.getAddress().getHostAddress());

        InetSocketAddress ipv6NoPort = MAPPER.readValue("\"::1\"", InetSocketAddress.class);
        assertEquals(0, ipv6NoPort.getPort());
        assertEquals("::1", ipv6NoPort.getHostString());

        InetSocketAddress bracketedIpv6 = MAPPER.readValue("\"[::1]:8080\"", InetSocketAddress.class);
        assertEquals(8080, bracketedIpv6.getPort());
        assertEquals("[::1]", bracketedIpv6.getHostString());
    }

    @Test
    public void testDeserializeEmptyString() throws Exception {
        assertNull(MAPPER.readValue("\"\"", File.class));
        assertEquals(URI.create(""), MAPPER.readValue("\"\"", URI.class));
        assertEquals("", MAPPER.readValue("\"\"", StringBuilder.class).toString());
    }

    @Test(expected = JsonMappingException.class)
    public void testInvalidUrlIsWrapped() throws Exception {
        MAPPER.readValue("\"not a valid url\"", URL.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testInvalidCurrencyIsWrapped() throws Exception {
        MAPPER.readValue("\"NOT_A_CURRENCY\"", Currency.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testInvalidClassIsWrapped() throws Exception {
        MAPPER.readValue("\"no.such.Class\"", Class.class);
    }
}