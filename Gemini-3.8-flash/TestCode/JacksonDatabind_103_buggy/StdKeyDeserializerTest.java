package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.*;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.EnumResolver;

public class StdKeyDeserializerTest {

    private DeserializationContext ctxt;
    private DeserializationConfig config;

    @Before
    public void setUp() {
        ctxt = mock(DeserializationContext.class);
        config = new DeserializationConfig.Builder(null, null, null, null, null, null).build();
        when(ctxt.getConfig()).thenReturn(config);
    }

    @After
    public void tearDown() {
        // No cleanup needed
    }

    @Test
    public void testForTypeString() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(String.class);
        assertNotNull(kd);
        assertTrue(kd instanceof StdKeyDeserializer.StringKD);
        assertEquals(String.class, kd.getKeyClass());
    }

    @Test
    public void testForTypeObject() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Object.class);
        assertNotNull(kd);
        assertTrue(kd instanceof StdKeyDeserializer.StringKD);
        assertEquals(Object.class, kd.getKeyClass());
    }

    @Test
    public void testForTypeInteger() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Integer.class);
        assertNotNull(kd);
        assertEquals(Integer.class, kd.getKeyClass());
    }

    @Test
    public void testForTypeLong() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Long.class);
        assertNotNull(kd);
        assertEquals(Long.class, kd.getKeyClass());
    }

    @Test
    public void testForTypeDate() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Date.class);
        assertNotNull(kd);
        assertEquals(Date.class, kd.getKeyClass());
    }

    @Test
    public void testForTypeCalendar() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Calendar.class);
        assertNotNull(kd);
        assertEquals(Calendar.class, kd.getKeyClass());
    }

    @Test
    public void testForTypeBoolean() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Boolean.class);
        assertNotNull(kd);
        assertEquals(Boolean.class, kd.getKeyClass());
    }

    @Test
    public void testForTypeByte() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Byte.class);
        assertNotNull(kd);
        assertEquals(Byte.class, kd.getKeyClass());
    }

    @Test
    public void testForTypeCharacter() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Character.class);
        assertNotNull(kd);
        assertEquals(Character.class, kd.getKeyClass());
    }

    @Test
    public void testForTypeShort() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Short.class);
        assertNotNull(kd);
        assertEquals(Short.class, kd.getKeyClass());
    }

    @Test
    public void testForTypeFloat() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Float.class);
        assertNotNull(kd);
        assertEquals(Float.class, kd.getKeyClass());
    }

    @Test
    public void testForTypeDouble() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Double.class);
        assertNotNull(kd);
        assertEquals(Double.class, kd.getKeyClass());
    }

    @Test
    public void testForTypeURI() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(URI.class);
        assertNotNull(kd);
        assertEquals(URI.class, kd.getKeyClass());
    }

    @Test
    public void testForTypeURL() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(URL.class);
        assertNotNull(kd);
        assertEquals(URL.class, kd.getKeyClass());
    }

    @Test
    public void testForTypeClass() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Class.class);
        assertNotNull(kd);
        assertEquals(Class.class, kd.getKeyClass());
    }

    @Test
    public void testForTypeLocale() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Locale.class);
        assertNotNull(kd);
        assertEquals(Locale.class, kd.getKeyClass());
    }

    @Test
    public void testForTypeCurrency() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Currency.class);
        assertNotNull(kd);
        assertEquals(Currency.class, kd.getKeyClass());
    }

    @Test
    public void testForTypeByteArray() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(byte[].class);
        assertNotNull(kd);
        assertEquals(byte[].class, kd.getKeyClass());
    }

    @Test
    public void testForTypeUnsupported() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(StringBuilder.class);
        assertNull(kd);
    }

    @Test
    public void testDeserializeKeyNull() throws IOException {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(String.class);
        Object result = kd.deserializeKey(null, ctxt);
        assertNull(result);
    }

    @Test
    public void testDeserializeKeyString() throws IOException {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(String.class);
        Object result = kd.deserializeKey("testKey", ctxt);
        assertEquals("testKey", result);
    }

    @Test
    public void testDeserializeKeyBooleanTrue() throws IOException {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Boolean.class);
        Object result = kd.deserializeKey("true", ctxt);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testDeserializeKeyBooleanFalse() throws IOException {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Boolean.class);
        Object result = kd.deserializeKey("false", ctxt);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testDeserializeKeyBooleanInvalid() throws IOException {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Boolean.class);
        when(ctxt.handleWeirdKey(eq(Boolean.class), eq("invalid"), anyString(), any(Object[].class)))
            .thenThrow(new IOException("Invalid boolean"));
        try {
            kd.deserializeKey("invalid", ctxt);
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("Invalid boolean", e.getMessage());
        }
    }

    @Test
    public void testDeserializeKeyByteNormal() throws IOException {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Byte.class);
        Object result = kd.deserializeKey("123", ctxt);
        assertEquals(Byte.valueOf((byte) 123), result);
    }

    @Test
    public void testDeserializeKeyByteOverflow() throws IOException {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Byte.class);
        when(ctxt.handleWeirdKey(eq(Byte.class), eq("256"), anyString(), any(Object[].class)))
            .thenThrow(new IOException("Overflow"));
        try {
            kd.deserializeKey("256", ctxt);
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("Overflow", e.getMessage());
        }
    }

    @Test
    public void testDeserializeKeyShortNormal() throws IOException {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Short.class);
        Object result = kd.deserializeKey("1000", ctxt);
        assertEquals(Short.valueOf((short) 1000), result);
    }

    @Test
    public void testDeserializeKeyShortOverflow() throws IOException {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Short.class);
        when(ctxt.handleWeirdKey(eq(Short.class), eq("65536"), anyString(), any(Object[].class)))
            .thenThrow(new IOException("Overflow"));
        try {
            kd.deserializeKey("65536", ctxt);
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("Overflow", e.getMessage());
        }
    }

    @Test
    public void testDeserializeKeyCharNormal() throws IOException {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Character.class);
        Object result = kd.deserializeKey("A", ctxt);
        assertEquals(Character.valueOf('A'), result);
    }

    @Test
    public void testDeserializeKeyCharInvalidLength() throws IOException {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Character.class);
        when(ctxt.handleWeirdKey(eq(Character.class), eq("AB"), anyString(), any(Object[].class)))
            .thenThrow(new IOException("Invalid char"));
        try {
            kd.deserializeKey("AB", ctxt);
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("Invalid char", e.getMessage());
        }
    }

    @Test
    public void testDeserializeKeyIntNormal() throws IOException {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Integer.class);
        Object result = kd.deserializeKey("12345", ctxt);
        assertEquals(Integer.valueOf(12345), result);
    }

    @Test
    public void testDeserializeKeyLongNormal() throws IOException {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Long.class);
        Object result = kd.deserializeKey("1234567890123", ctxt);
        assertEquals(Long.valueOf(1234567890123L), result);
    }

    @Test
    public void testDeserializeKeyDoubleNormal() throws IOException {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Double.class);
        Object result = kd.deserializeKey("3.14", ctxt);
        assertEquals(Double.valueOf(3.14), result);
    }

    @Test
    public void testDeserializeKeyFloatNormal() throws IOException {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Float.class);
        Object result = kd.deserializeKey("2.5", ctxt);
        assertEquals(Float.valueOf(2.5f), result);
    }

    @Test
    public void testDeserializeKeyURINormal() throws IOException {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(URI.class);
        Object result = kd.deserializeKey("http://example.com", ctxt);
        assertEquals(URI.create("http://example.com"), result);
    }

    @Test
    public void testDeserializeKeyURLNormal() throws IOException {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(URL.class);
        Object result = kd.deserializeKey("http://example.com", ctxt);
        assertEquals(new URL("http://example.com"), result);
    }

    @Test
    public void testDeserializeKeyURLInvalid() throws IOException {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(URL.class);
        when(ctxt.handleWeirdKey(eq(URL.class), eq("invalid-url"), anyString(), any(Object[].class)))
            .thenThrow(new IOException("Invalid URL"));
        try {
            kd.deserializeKey("invalid-url", ctxt);
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("Invalid URL", e.getMessage());
        }
    }

    @Test
    public void testDeserializeKeyClassNormal() throws IOException {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Class.class);
        when(ctxt.findClass("java.lang.String")).thenReturn(String.class);
        Object result = kd.deserializeKey("java.lang.String", ctxt);
        assertEquals(String.class, result);
    }

    @Test
    public void testDeserializeKeyLocaleNormal() throws IOException {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Locale.class);
        Object result = kd.deserializeKey("en-US", ctxt);
        assertNotNull(result);
    }

    @Test
    public void testDeserializeKeyCurrencyNormal() throws IOException {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Currency.class);
        Object result = kd.deserializeKey("USD", ctxt);
        assertEquals(Currency.getInstance("USD"), result);
    }

    @Test
    public void testDeserializeKeyByteArrayNormal() throws IOException {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(byte[].class);
        when(ctxt.getConfig().getBase64Variant()).thenReturn(new Base64Variant("test", "test", 0, (byte) 0, 0));
        byte[] expected = {1, 2, 3};
        Object result = kd.deserializeKey("AQID", ctxt);
        assertArrayEquals(expected, (byte[]) result);
    }

    @Test
    public void testStringKDDeserialize() {
        StdKeyDeserializer.StringKD kd = StdKeyDeserializer.StringKD.forType(String.class);
        try {
            assertEquals("test", kd.deserializeKey("test", ctxt));
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testStringKDForTypeObject() {
        StdKeyDeserializer.StringKD kd = StdKeyDeserializer.StringKD.forType(Object.class);
        assertNotNull(kd);
    }

    @Test
    public void testStringKDForTypeCustom() {
        StdKeyDeserializer.StringKD kd = StdKeyDeserializer.StringKD.forType(CharSequence.class);
        assertNotNull(kd);
    }

    @Test
    public void testEnumKDParse() throws Exception {
        EnumResolver resolver = EnumResolver.constructUnsafeUsingToString(TestEnum.class);
        StdKeyDeserializer.EnumKD kd = new StdKeyDeserializer.EnumKD(resolver, null);
        Object result = kd.deserializeKey("VALUE1", ctxt);
        assertEquals(TestEnum.VALUE1, result);
    }

    @Test
    public void testEnumKDParseWithFactory() throws Exception {
        EnumResolver resolver = EnumResolver.constructUnsafeUsingToString(TestEnum.class);
        AnnotatedMethod factory = mock(AnnotatedMethod.class);
        when(factory.call1(any(String.class))).thenReturn(TestEnum.VALUE2);
        StdKeyDeserializer.EnumKD kd = new StdKeyDeserializer.EnumKD(resolver, factory);
        Object result = kd.deserializeKey("anything", ctxt);
        assertEquals(TestEnum.VALUE2, result);
    }

    @Test
    public void testEnumKDParseUnknownWithDefault() throws Exception {
        EnumResolver resolver = EnumResolver.constructUnsafeUsingToString(TestEnum.class);
        StdKeyDeserializer.EnumKD kd = new StdKeyDeserializer.EnumKD(resolver, null);
        when(ctxt.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)).thenReturn(true);
        Object result = kd.deserializeKey("UNKNOWN", ctxt);
        assertEquals(TestEnum.VALUE1, result);
    }

    @Test
    public void testEnumKDParseUnknownAsNull() throws Exception {
        EnumResolver resolver = EnumResolver.constructUnsafeUsingToString(TestEnum.class);
        StdKeyDeserializer.EnumKD kd = new StdKeyDeserializer.EnumKD(resolver, null);
        when(ctxt.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)).thenReturn(false);
        when(ctxt.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)).thenReturn(false);
        when(ctxt.handleWeirdKey(any(Class.class), any(String.class), any(String.class), any(Object[].class)))
            .thenReturn(null);
        Object result = kd.deserializeKey("UNKNOWN", ctxt);
        assertNull(result);
    }

    @Test
    public void testStringCtorKeyDeserializer() throws Exception {
        Constructor<?> ctor = TestCtorClass.class.getConstructor(String.class);
        StdKeyDeserializer.StringCtorKeyDeserializer kd = new StdKeyDeserializer.StringCtorKeyDeserializer(ctor);
        Object result = kd.deserializeKey("test", ctxt);
        assertTrue(result instanceof TestCtorClass);
        assertEquals("test", ((TestCtorClass) result).value);
    }

    @Test
    public void testStringFactoryKeyDeserializer() throws Exception {
        Method factory = TestFactoryClass.class.getMethod("fromString", String.class);
        StdKeyDeserializer.StringFactoryKeyDeserializer kd = new StdKeyDeserializer.StringFactoryKeyDeserializer(factory);
        Object result = kd.deserializeKey("test", ctxt);
        assertTrue(result instanceof TestFactoryClass);
        assertEquals("test", ((TestFactoryClass) result).value);
    }

    @Test
    public void testGetKeyClass() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Integer.class);
        assertEquals(Integer.class, kd.getKeyClass());
    }

    @Test
    public void testDeserializeKeyWeirdKeyHandling() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Integer.class);
        when(ctxt.handleWeirdKey(eq(Integer.class), eq("abc"), anyString(), any(Object[].class)))
            .thenThrow(new IOException("Weird key"));
        try {
            kd.deserializeKey("abc", ctxt);
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("Weird key", e.getMessage());
        }
    }

    @Test
    public void testDeserializeKeyWithGenericException() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Integer.class);
        when(ctxt.handleWeirdKey(any(Class.class), any(String.class), any(String.class), any(Object[].class)))
            .thenThrow(new RuntimeException("Custom exception"));
        try {
            kd.deserializeKey("abc", ctxt);
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            assertEquals("Custom exception", e.getMessage());
        }
    }

    @Test
    public void testParseInt() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Integer.class);
        try {
            assertEquals(123, kd._parseInt("123"));
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testParseLong() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Long.class);
        try {
            assertEquals(123456789L, kd._parseLong("123456789"));
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testParseDouble() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Double.class);
        try {
            assertEquals(3.14, kd._parseDouble("3.14"), 0.001);
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testStringKDForTypeReturnsSingletonString() {
        StdKeyDeserializer.StringKD kd1 = StdKeyDeserializer.StringKD.forType(String.class);
        StdKeyDeserializer.StringKD kd2 = StdKeyDeserializer.StringKD.forType(String.class);
        assertSame(kd1, kd2);
    }

    @Test
    public void testStringKDForTypeReturnsSingletonObject() {
        StdKeyDeserializer.StringKD kd1 = StdKeyDeserializer.StringKD.forType(Object.class);
        StdKeyDeserializer.StringKD kd2 = StdKeyDeserializer.StringKD.forType(Object.class);
        assertSame(kd1, kd2);
    }

    private enum TestEnum {
        VALUE1, VALUE2
    }

    private static class TestCtorClass {
        public String value;
        public TestCtorClass(String value) {
            this.value = value;
        }
    }

    private static class TestFactoryClass {
        public String value;
        private TestFactoryClass(String value) {
            this.value = value;
        }
        public static TestFactoryClass fromString(String value) {
            return new TestFactoryClass(value);
        }
    }

    // Mock helper methods
    private DeserializationContext mock(Class<DeserializationContext> c) {
        return java.lang.reflect.Proxy.newProxyInstance(
            getClass().getClassLoader(),
            new Class<?>[]{c},
            (proxy, method, args) -> {
                if (method.getName().equals("getConfig")) {
                    return mockConfig();
                }
                if (method.getName().equals("handleWeirdKey")) {
                    throw (Exception) args[2];
                }
                if (method.getName().equals("isEnabled")) {
                    return false;
                }
                if (method.getName().equals("getBase64Variant")) {
                    return new Base64Variant("test", "test", 0, (byte) 0, 0);
                }
                if (method.getName().equals("findClass")) {
                    return Class.forName((String) args[0]);
                }
                if (method.getName().equals("parseDate")) {
                    return new Date(0);
                }
                if (method.getName().equals("constructCalendar")) {
                    return Calendar.getInstance();
                }
                if (method.getName().equals("getParser")) {
                    return mock(JsonParser.class);
                }
                if (method.getName().equals("handleWeirdStringValue")) {
                    return null;
                }
                return null;
            });
    }

    private DeserializationConfig mockConfig() {
        return java.lang.reflect.Proxy.newProxyInstance(
            getClass().getClassLoader(),
            new Class<?>[]{DeserializationConfig.class},
            (proxy, method, args) -> {
                if (method.getName().equals("getBase64Variant")) {
                    return new Base64Variant("test", "test", 0, (byte) 0, 0);
                }
                if (method.getName().equals("isEnabled")) {
                    return false;
                }
                return null;
            });
    }
}