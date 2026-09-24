package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.net.URI;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

public class StdKeyDeserializerTest {

    enum TestEnum { A, B }

    static class StringFactoryTestHelper {
        public static String create(String value) {
            return value;
        }
    }

    @Test
    public void testForType() {
        assertNull(StdKeyDeserializer.forType(BigDecimal.class));
        assertEquals(String.class, StdKeyDeserializer.forType(String.class).getKeyClass());
        assertEquals(Object.class, StdKeyDeserializer.forType(Object.class).getKeyClass());
        assertEquals(Integer.class, StdKeyDeserializer.forType(Integer.class).getKeyClass());
        assertEquals(URI.class, StdKeyDeserializer.forType(URI.class).getKeyClass());
        assertEquals(URL.class, StdKeyDeserializer.forType(URL.class).getKeyClass());
        assertEquals(Locale.class, StdKeyDeserializer.forType(Locale.class).getKeyClass());
        assertEquals(Currency.class, StdKeyDeserializer.forType(Currency.class).getKeyClass());
    }

    @Test
    public void testNullKeyReturnsNull() throws Exception {
        assertNull(StdKeyDeserializer.forType(Integer.class).deserializeKey(null, null));
        assertNull(StdKeyDeserializer.forType(String.class).deserializeKey(null, null));
    }

    @Test
    public void testSimpleParsing() throws Exception {
        assertEquals("foo", StdKeyDeserializer.forType(String.class).deserializeKey("foo", null));
        assertEquals(Boolean.TRUE, StdKeyDeserializer.forType(Boolean.class).deserializeKey("true", null));
        assertEquals(Boolean.FALSE, StdKeyDeserializer.forType(Boolean.class).deserializeKey("false", null));
        assertEquals(Byte.valueOf((byte) 127), StdKeyDeserializer.forType(Byte.class).deserializeKey("127", null));
        assertEquals(Short.valueOf((short) -32768), StdKeyDeserializer.forType(Short.class).deserializeKey("-32768", null));
        assertEquals(Character.valueOf('x'), StdKeyDeserializer.forType(Character.class).deserializeKey("x", null));
        assertEquals(Integer.valueOf(42), StdKeyDeserializer.forType(Integer.class).deserializeKey("42", null));
        assertEquals(Long.valueOf(-99L), StdKeyDeserializer.forType(Long.class).deserializeKey("-99", null));
        assertEquals(Float.valueOf(1.25f), StdKeyDeserializer.forType(Float.class).deserializeKey("1.25", null));
        assertEquals(Double.valueOf("-2.5"), StdKeyDeserializer.forType(Double.class).deserializeKey("-2.5", null));
    }

    @Test
    public void testUriUrlUuid() throws Exception {
        UUID uuid = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");
        assertEquals(uuid, StdKeyDeserializer.forType(UUID.class).deserializeKey(uuid.toString(), null));
        assertEquals(URI.create("http://example.com"), StdKeyDeserializer.forType(URI.class).deserializeKey("http://example.com", null));
        assertEquals(new URL("http://example.com"), StdKeyDeserializer.forType(URL.class).deserializeKey("http://example.com", null));
    }

    @Test
    public void testInvalidKeyThrows() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.readValue("{\"\":\"v\"}", new TypeReference<Map<Integer, String>>() {});
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("not a valid representation"));
        }
    }

    @Test
    public void testUnknownEnumKeyAsNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL);
        Map<TestEnum, String> map = mapper.readValue("{\"UNKNOWN\":\"v\"}", new TypeReference<Map<TestEnum, String>>() {});
        assertTrue(map.containsKey(null));
        assertNull(map.get(null));
    }

    @Test(expected = JsonMappingException.class)
    public void testUnknownEnumKeyFailsWithoutFeature() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue("{\"UNKNOWN\":\"v\"}", new TypeReference<Map<TestEnum, String>>() {});
    }

    @Test
    public void testEnumKeyUsingToString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
        Map<TestEnum, String> map = mapper.readValue("{\"A\":\"v\"}", new TypeReference<Map<TestEnum, String>>() {});
        assertEquals(TestEnum.A, map.keySet().iterator().next());
    }

    @SuppressWarnings("rawtypes")
    @Test
    public void testContextualKeyDeserializers() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        Map<Locale, String> locales = mapper.readValue("{\"en_US\":\"v\"}", new TypeReference<Map<Locale, String>>() {});
        assertEquals(Locale.US, locales.keySet().iterator().next());

        Map<Currency, String> currencies = mapper.readValue("{\"USD\":\"v\"}", new TypeReference<Map<Currency, String>>() {});
        assertEquals(Currency.getInstance("USD"), currencies.keySet().iterator().next());

        Map<Class, String> classes = mapper.readValue("{\"java.lang.String\":\"v\"}", new TypeReference<Map<Class, String>>() {});
        assertEquals(String.class, classes.keySet().iterator().next());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        mapper.setDateFormat(sdf);

        Map<Date, String> dates = mapper.readValue("{\"1970-01-01\":\"v\"}", new TypeReference<Map<Date, String>>() {});
        assertTrue(dates.containsKey(sdf.parse("1970-01-01")));

        Map<Calendar, String> calendars = mapper.readValue("{\"1970-01-01\":\"v\"}", new TypeReference<Map<Calendar, String>>() {});
        Calendar expected = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        expected.setTime(sdf.parse("1970-01-01"));
        assertEquals(expected.getTimeInMillis(), calendars.keySet().iterator().next().getTimeInMillis());
    }

    @Test
    public void testStringCtorAndFactoryKeyDeserializers() throws Exception {
        Constructor<StringBuilder> ctor = StringBuilder.class.getConstructor(String.class);
        StdKeyDeserializer dk = new StdKeyDeserializer.StringCtorKeyDeserializer(ctor);
        assertEquals("abc", dk.deserializeKey("abc", null).toString());

        Method factory = StringFactoryTestHelper.class.getMethod("create", String.class);
        dk = new StdKeyDeserializer.StringFactoryKeyDeserializer(factory);
        assertEquals("xyz", dk.deserializeKey("xyz", null));
    }

    @Test
    public void testUnknownKindReturnsNull() throws Exception {
        StdKeyDeserializer dk = new StdKeyDeserializer(999, String.class);
        assertNull(dk._parse("anything", null));
        assertEquals(String.class, dk.getKeyClass());
    }
}