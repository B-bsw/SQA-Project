package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

import static org.junit.Assert.*;

public class TypeAdaptersTest {

    private Gson gson;
    private JsonWriter jsonWriter;
    private JsonReader jsonReader;

    @Before
    public void setUp() throws Exception {
        gson = new Gson();
    }

    @After
    public void tearDown() throws Exception {
        // cleanup if needed
    }

    @Test
    public void testClassAdapterWriteNull() throws IOException {
        TypeAdapter<Class> adapter = TypeAdapters.CLASS;
        StringWriter out = new StringWriter();
        JsonWriter writer = new JsonWriter(out);
        adapter.write(writer, null);
        writer.flush();
        assertEquals("null", out.toString());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testClassAdapterWriteNonNull() throws IOException {
        TypeAdapter<Class> adapter = TypeAdapters.CLASS;
        JsonWriter writer = new JsonWriter(new StringWriter());
        adapter.write(writer, String.class);
    }

    @Test
    public void testClassAdapterReadNull() throws IOException {
        TypeAdapter<Class> adapter = TypeAdapters.CLASS;
        JsonReader reader = new JsonReader(new StringReader("null"));
        assertNull(adapter.read(reader));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testClassAdapterReadNonNull() throws IOException {
        TypeAdapter<Class> adapter = TypeAdapters.CLASS;
        JsonReader reader = new JsonReader(new StringReader("\"java.lang.String\""));
        adapter.read(reader);
    }

    @Test
    public void testBitSetAdapterWrite() throws IOException {
        TypeAdapter<BitSet> adapter = TypeAdapters.BIT_SET;
        BitSet original = new BitSet();
        original.set(0);
        original.set(2);
        original.set(5);
        StringWriter out = new StringWriter();
        JsonWriter writer = new JsonWriter(out);
        adapter.write(writer, original);
        writer.flush();
        assertEquals("[1,0,1,0,0,1]", out.toString());
    }

    @Test
    public void testBitSetAdapterWriteNull() throws IOException {
        TypeAdapter<BitSet> adapter = TypeAdapters.BIT_SET;
        StringWriter out = new StringWriter();
        JsonWriter writer = new JsonWriter(out);
        adapter.write(writer, null);
        writer.flush();
        assertEquals("null", out.toString());
    }

    @Test
    public void testBitSetAdapterReadNumberArray() throws IOException {
        TypeAdapter<BitSet> adapter = TypeAdapters.BIT_SET;
        JsonReader reader = new JsonReader(new StringReader("[1,0,1,1,0]"));
        BitSet result = adapter.read(reader);
        assertNotNull(result);
        assertTrue(result.get(0));
        assertFalse(result.get(1));
        assertTrue(result.get(2));
        assertTrue(result.get(3));
        assertFalse(result.get(4));
    }

    @Test(expected = JsonSyntaxException.class)
    public void testBitSetAdapterReadInvalidString() throws IOException {
        TypeAdapter<BitSet> adapter = TypeAdapters.BIT_SET;
        JsonReader reader = new JsonReader(new StringReader("[\"invalid\"]"));
        adapter.read(reader);
    }

    @Test
    public void testBooleanAdapterRead() throws IOException {
        TypeAdapter<Boolean> adapter = TypeAdapters.BOOLEAN;
        assertEquals(Boolean.TRUE, adapter.read(new JsonReader(new StringReader("true"))));
        assertEquals(Boolean.FALSE, adapter.read(new JsonReader(new StringReader("false"))));
    }

    @Test
    public void testBooleanAdapterReadString() throws IOException {
        TypeAdapter<Boolean> adapter = TypeAdapters.BOOLEAN;
        JsonReader reader = new JsonReader(new StringReader("\"true\""));
        Boolean result = adapter.read(reader);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testBooleanAdapterReadNull() throws IOException {
        TypeAdapter<Boolean> adapter = TypeAdapters.BOOLEAN;
        assertNull(adapter.read(new JsonReader(new StringReader("null"))));
    }

    @Test
    public void testBooleanAdapterWrite() throws IOException {
        TypeAdapter<Boolean> adapter = TypeAdapters.BOOLEAN;
        StringWriter out = new StringWriter();
        JsonWriter writer = new JsonWriter(out);
        adapter.write(writer, Boolean.TRUE);
        writer.flush();
        assertEquals("true", out.toString());
    }

    @Test
    public void testBooleanAdapterWriteNull() throws IOException {
        TypeAdapter<Boolean> adapter = TypeAdapters.BOOLEAN;
        StringWriter out = new StringWriter();
        JsonWriter writer = new JsonWriter(out);
        adapter.write(writer, null);
        writer.flush();
        assertEquals("null", out.toString());
    }

    @Test
    public void testByteAdapterRead() throws IOException {
        TypeAdapter<Number> adapter = (TypeAdapter<Number>) (TypeAdapter<?>) TypeAdapters.BYTE;
        assertEquals((byte) 5, adapter.read(new JsonReader(new StringReader("5"))).byteValue());
    }

    @Test
    public void testByteAdapterWrite() throws IOException {
        TypeAdapter<Number> adapter = (TypeAdapter<Number>) (TypeAdapter<?>) TypeAdapters.BYTE;
        StringWriter out = new StringWriter();
        JsonWriter writer = new JsonWriter(out);
        adapter.write(writer, (byte) 7);
        writer.flush();
        assertEquals("7", out.toString());
    }

    @Test
    public void testShortAdapterRead() throws IOException {
        TypeAdapter<Number> adapter = (TypeAdapter<Number>) (TypeAdapter<?>) TypeAdapters.SHORT;
        assertEquals((short) 100, adapter.read(new JsonReader(new StringReader("100"))).shortValue());
    }

    @Test
    public void testShortAdapterWrite() throws IOException {
        TypeAdapter<Number> adapter = (TypeAdapter<Number>) (TypeAdapter<?>) TypeAdapters.SHORT;
        StringWriter out = new StringWriter();
        JsonWriter writer = new JsonWriter(out);
        adapter.write(writer, (short) -5);
        writer.flush();
        assertEquals("-5", out.toString());
    }

    @Test
    public void testIntegerAdapterRead() throws IOException {
        TypeAdapter<Number> adapter = (TypeAdapter<Number>) (TypeAdapter<?>) TypeAdapters.INTEGER;
        assertEquals(42, adapter.read(new JsonReader(new StringReader("42"))).intValue());
    }

    @Test
    public void testIntegerAdapterWrite() throws IOException {
        TypeAdapter<Number> adapter = (TypeAdapter<Number>) (TypeAdapter<?>) TypeAdapters.INTEGER;
        StringWriter out = new StringWriter();
        JsonWriter writer = new JsonWriter(out);
        adapter.write(writer, 123);
        writer.flush();
        assertEquals("123", out.toString());
    }

    @Test
    public void testAtomicIntegerAdapterRead() throws IOException {
        TypeAdapter<AtomicInteger> adapter = TypeAdapters.ATOMIC_INTEGER;
        AtomicInteger result = adapter.read(new JsonReader(new StringReader("10")));
        assertEquals(10, result.get());
    }

    @Test
    public void testAtomicIntegerAdapterWrite() throws IOException {
        TypeAdapter<AtomicInteger> adapter = TypeAdapters.ATOMIC_INTEGER;
        StringWriter out = new StringWriter();
        JsonWriter writer = new JsonWriter(out);
        adapter.write(writer, new AtomicInteger(15));
        writer.flush();
        assertEquals("15", out.toString());
    }

    @Test
    public void testAtomicBooleanAdapterRead() throws IOException {
        TypeAdapter<AtomicBoolean> adapter = TypeAdapters.ATOMIC_BOOLEAN;
        AtomicBoolean result = adapter.read(new JsonReader(new StringReader("true")));
        assertTrue(result.get());
    }

    @Test
    public void testAtomicBooleanAdapterWrite() throws IOException {
        TypeAdapter<AtomicBoolean> adapter = TypeAdapters.ATOMIC_BOOLEAN;
        StringWriter out = new StringWriter();
        JsonWriter writer = new JsonWriter(out);
        adapter.write(writer, new AtomicBoolean(false));
        writer.flush();
        assertEquals("false", out.toString());
    }

    @Test
    public void testAtomicIntegerArrayAdapterRead() throws IOException {
        TypeAdapter<AtomicIntegerArray> adapter = TypeAdapters.ATOMIC_INTEGER_ARRAY;
        AtomicIntegerArray result = adapter.read(new JsonReader(new StringReader("[1,2,3]")));
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
    }

    @Test
    public void testAtomicIntegerArrayAdapterWrite() throws IOException {
        TypeAdapter<AtomicIntegerArray> adapter = TypeAdapters.ATOMIC_INTEGER_ARRAY;
        AtomicIntegerArray arr = new AtomicIntegerArray(3);
        arr.set(0, 5);
        arr.set(1, 6);
        arr.set(2, 7);
        StringWriter out = new StringWriter();
        JsonWriter writer = new JsonWriter(out);
        adapter.write(writer, arr);
        writer.flush();
        assertEquals("[5,6,7]", out.toString());
    }

    @Test
    public void testLongAdapterRead() throws IOException {
        TypeAdapter<Number> adapter = (TypeAdapter<Number>) (TypeAdapter<?>) TypeAdapters.LONG;
        assertEquals(10000000000L, adapter.read(new JsonReader(new StringReader("10000000000"))).longValue());
    }

    @Test
    public void testLongAdapterWrite() throws IOException {
        TypeAdapter<Number> adapter = (TypeAdapter<Number>) (TypeAdapter<?>) TypeAdapters.LONG;
        StringWriter out = new StringWriter();
        JsonWriter writer = new JsonWriter(out);
        adapter.write(writer, (long) 2147483648L);
        writer.flush();
        assertEquals("2147483648", out.toString());
    }

    @Test
    public void testFloatAdapterRead() throws IOException {
        TypeAdapter<Number> adapter = (TypeAdapter<Number>) (TypeAdapter<?>) TypeAdapters.FLOAT;
        assertEquals(3.14f, adapter.read(new JsonReader(new StringReader("3.14"))).floatValue(), 0.001f);
    }

    @Test
    public void testFloatAdapterWrite() throws IOException {
        TypeAdapter<Number> adapter = (TypeAdapter<Number>) (TypeAdapter<?>) TypeAdapters.FLOAT;
        StringWriter out = new StringWriter();
        JsonWriter writer = new JsonWriter(out);
        adapter.write(writer, 2.5f);
        writer.flush();
        assertEquals("2.5", out.toString());
    }

    @Test
    public void testDoubleAdapterRead() throws IOException {
        TypeAdapter<Number> adapter = (TypeAdapter<Number>) (TypeAdapter<?>) TypeAdapters.DOUBLE;
        assertEquals(1.23, adapter.read(new JsonReader(new StringReader("1.23"))).doubleValue(), 0.001);
    }

    @Test
    public void testDoubleAdapterWrite() throws IOException {
        TypeAdapter<Number> adapter = (TypeAdapter<Number>) (TypeAdapter<?>) TypeAdapters.DOUBLE;
        StringWriter out = new StringWriter();
        JsonWriter writer = new JsonWriter(out);
        adapter.write(writer, 9.99);
        writer.flush();
        assertEquals("9.99", out.toString());
    }

    @Test
    public void testNumberAdapterRead() throws IOException {
        TypeAdapter<Number> adapter = TypeAdapters.NUMBER;
        assertEquals(5, adapter.read(new JsonReader(new StringReader("5"))).intValue());
        assertEquals(5.5, adapter.read(new JsonReader(new StringReader("5.5"))).doubleValue(), 0.001);
    }

    @Test
    public void testNumberAdapterReadNull() throws IOException {
        TypeAdapter<Number> adapter = TypeAdapters.NUMBER;
        assertNull(adapter.read(new JsonReader(new StringReader("null"))));
    }

    @Test
    public void testCharacterAdapterRead() throws IOException {
        TypeAdapter<Character> adapter = TypeAdapters.CHARACTER;
        assertEquals('a', adapter.read(new JsonReader(new StringReader("\"a\""))).charValue());
    }

    @Test
    public void testCharacterAdapterReadInvalid() throws IOException {
        TypeAdapter<Character> adapter = TypeAdapters.CHARACTER;
        try {
            adapter.read(new JsonReader(new StringReader("\"ab\"")));
            fail("Expected JsonSyntaxException");
        } catch (JsonSyntaxException e) {
            // expected
        }
    }

    @Test
    public void testCharacterAdapterWrite() throws IOException {
        TypeAdapter<Character> adapter = TypeAdapters.CHARACTER;
        StringWriter out = new StringWriter();
        JsonWriter writer = new JsonWriter(out);
        adapter.write(writer, 'x');
        writer.flush();
        assertEquals("\"x\"", out.toString());
    }

    @Test
    public void testStringAdapterRead() throws IOException {
        TypeAdapter<String> adapter = TypeAdapters.STRING;
        assertEquals("hello", adapter.read(new JsonReader(new StringReader("\"hello\""))));
        assertEquals("true", adapter.read(new JsonReader(new StringReader("true"))));
    }

    @Test
    public void testStringAdapterReadNull() throws IOException {
        TypeAdapter<String> adapter = TypeAdapters.STRING;
        assertNull(adapter.read(new JsonReader(new StringReader("null"))));
    }

    @Test
    public void testStringAdapterWrite() throws IOException {
        TypeAdapter<String> adapter = TypeAdapters.STRING;
        StringWriter out = new StringWriter();
        JsonWriter writer = new JsonWriter(out);
        adapter.write(writer, "test");
        writer.flush();
        assertEquals("\"test\"", out.toString());
    }

    @Test
    public void testBigDecimalAdapterRead() throws IOException {
        TypeAdapter<BigDecimal> adapter = TypeAdapters.BIG_DECIMAL;
        assertEquals(new BigDecimal("123.456"), adapter.read(new JsonReader(new StringReader("123.456"))));
    }

    @Test
    public void testBigDecimalAdapterWrite() throws IOException {
        TypeAdapter<BigDecimal> adapter = TypeAdapters.BIG_DECIMAL;
        StringWriter out = new StringWriter();
        JsonWriter writer = new JsonWriter(out);
        adapter.write(writer, new BigDecimal("789.123"));
        writer.flush();
        assertEquals("789.123", out.toString());
    }

    @Test
    public void testBigIntegerAdapterRead() throws IOException {
        TypeAdapter<BigInteger> adapter = TypeAdapters.BIG_INTEGER;
        assertEquals(new BigInteger("123456789"), adapter.read(new JsonReader(new StringReader("123456789"))));
    }

    @Test
    public void testBigIntegerAdapterWrite() throws IOException {
        TypeAdapter<BigInteger> adapter = TypeAdapters.BIG_INTEGER;
        StringWriter out = new StringWriter();
        JsonWriter writer = new JsonWriter(out);
        adapter.write(writer, new BigInteger("987654321"));
        writer.flush();
        assertEquals("987654321", out.toString());
    }

    @Test
    public void testStringBuilderAdapterRead() throws IOException {
        TypeAdapter<StringBuilder> adapter = TypeAdapters.STRING_BUILDER;
        assertEquals("test", adapter.read(new JsonReader(new StringReader("\"test\""))).toString());
    }

    @Test
    public void testStringBuilderAdapterWrite() throws IOException {
        TypeAdapter<StringBuilder> adapter = TypeAdapters.STRING_BUILDER;
        StringWriter out = new StringWriter();
        JsonWriter writer = new JsonWriter(out);
        adapter.write(writer, new StringBuilder("sample"));
        writer.flush();
        assertEquals("\"sample\"", out.toString());
    }

    @Test
    public void testStringBufferAdapterRead() throws IOException {
        TypeAdapter<StringBuffer> adapter = TypeAdapters.STRING_BUFFER;
        assertEquals("test", adapter.read(new JsonReader(new StringReader("\"test\""))).toString());
    }

    @Test
    public void testStringBufferAdapterWrite() throws IOException {
        TypeAdapter<StringBuffer> adapter = TypeAdapters.STRING_BUFFER;
        StringWriter out = new StringWriter();
        JsonWriter writer = new JsonWriter(out);
        adapter.write(writer, new StringBuffer("buffer"));
        writer.flush();
        assertEquals("\"buffer\"", out.toString());
    }

    @Test
    public void testUrlAdapterRead() throws Exception {
        TypeAdapter<URL> adapter = TypeAdapters.URL;
        URL expected = new URL("http://example.com");
        assertEquals(expected.toString(), adapter.read(new JsonReader(new StringReader("\"http://example.com\""))).toString());
    }

    @Test
    public void testUrlAdapterReadNull() throws Exception {
        TypeAdapter<URL> adapter = TypeAdapters.URL;
        assertNull(adapter.read(new JsonReader(new StringReader("\"null\""))));
    }

    @Test
    public void testUrlAdapterWrite() throws Exception {
        TypeAdapter<URL> adapter = TypeAdapters.URL;
        URL url = new URL("https://test.com/path");
        StringWriter out = new StringWriter();
        JsonWriter writer = new JsonWriter(out);
        adapter.write(writer, url);
        writer.flush();
        assertEquals("\"https://test.com/path\"", out.toString());
    }

    @Test
    public void testUriAdapterRead() throws Exception {
        TypeAdapter<URI> adapter = TypeAdapters.URI;
        URI uri = adapter.read(new JsonReader(new StringReader("\"http://example.org\"")));
        assertEquals("http://example.org", uri.toString());
    }

    @Test
    public void testUriAdapterReadInvalid() throws Exception {
        TypeAdapter<URI> adapter = TypeAdapters.URI;
        try {
            adapter.read(new JsonReader(new StringReader("invalid")));
            fail("Expected JsonSyntaxException");
        } catch (JsonSyntaxException e) {
            // expected
        }
    }

    @Test
    public void testUriAdapterWrite() throws Exception {
        TypeAdapter<URI> adapter = TypeAdapters.URI;
        URI uri = new URI("https://test.com/resource");
        StringWriter out = new StringWriter();
        JsonWriter writer = new JsonWriter(out);
        adapter.write(writer, uri);
        writer.flush();
        assertEquals("\"https://test.com/resource\"", out.toString());
    }

    @Test
    public void testInetAddressAdapterRead() throws Exception {
        TypeAdapter<InetAddress> adapter = TypeAdapters.INET_ADDRESS;
        InetAddress result = adapter.read(new JsonReader(new StringReader("\"127.0.0.1\"")));
        assertEquals("127.0.0.1", result.getHostAddress());
    }

    @Test
    public void testInetAddressAdapterWrite() throws Exception {
        TypeAdapter<InetAddress> adapter = TypeAdapters.INET_ADDRESS;
        InetAddress address = InetAddress.getByName("192.168.1.1");
        StringWriter out = new StringWriter();
        JsonWriter writer = new JsonWriter(out);
        adapter.write(writer, address);
        writer.flush();
        assertEquals("\"192.168.1.1\"", out.toString());
    }

    @Test
    public void testUuidAdapterRead() throws Exception {
        TypeAdapter<UUID> adapter = TypeAdapters.UUID;
        UUID expected = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");
        UUID result = adapter.read(new JsonReader(new StringReader("\"123e4567-e89b-12d3-a456-426614174000\"")));
        assertEquals(expected, result);
    }

    @Test
    public void testUuidAdapterWrite() throws Exception {
        TypeAdapter<UUID> adapter = TypeAdapters.UUID;
        UUID uuid = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");
        StringWriter out = new StringWriter();
        JsonWriter writer = new JsonWriter(out);
        adapter.write(writer, uuid);
        writer.flush();
        assertEquals("\"123e4567-e89b-12d3-a456-426614174000\"", out.toString());
    }

    @Test
    public void testCurrencyAdapterRead() throws Exception {
        TypeAdapter<Currency> adapter = TypeAdapters.CURRENCY;
        assertEquals("USD", adapter.read(new JsonReader(new StringReader("\"USD\""))).getCurrencyCode());
    }

    @Test
    public void testCurrencyAdapterWrite() throws Exception {
        TypeAdapter<Currency> adapter = TypeAdapters.CURRENCY;
        StringWriter out = new StringWriter();
        JsonWriter writer = new JsonWriter(out);
        adapter.write(writer, Currency.getInstance("EUR"));
        writer.flush();
        assertEquals("\"EUR\"", out.toString());
    }

    @Test
    public void testTimestampAdapterRead() throws Exception {
        TypeAdapter<Timestamp> adapter = TypeAdapters.TIMESTAMP_FACTORY.create(gson, TypeToken.get(Timestamp.class));
        assertNotNull(adapter);
    }

    @Test
    public void testLocaleAdapterRead() throws Exception {
        TypeAdapter<Locale> adapter = TypeAdapters.LOCALE;
        assertEquals(new Locale("en"), adapter.read(new JsonReader(new StringReader("\"en\""))));
        assertEquals(new Locale("en", "US"), adapter.read(new JsonReader(new StringReader("\"en_US\""))));
        assertEquals(new Locale("en", "US", "WIN"), adapter.read(new JsonReader(new StringReader("\"en_US_WIN\""))));
    }

    @Test
    public void testLocaleAdapterReadInvalid() throws Exception {
        TypeAdapter<Locale> adapter = TypeAdapters.LOCALE;
        try {
            adapter.read(new JsonReader(new StringReader("\"invalid_locale\"")));
            fail("Expected JsonSyntaxException");
        } catch (JsonSyntaxException e) {
            // expected
        }
    }

    @Test
    public void testLocaleAdapterWrite() throws Exception {
        TypeAdapter<Locale> adapter = TypeAdapters.LOCALE;
        StringWriter out = new StringWriter();
        JsonWriter writer = new JsonWriter(out);
        adapter.write(writer, new Locale("fr", "FR"));
        writer.flush();
        assertTrue(out.toString().contains("fr"));
        assertTrue(out.toString().contains("FR"));
    }

    @Test
    public void testJsonElementAdapterReadNull() throws Exception {
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        JsonElement result = adapter.read(new JsonReader(new StringReader("null")));
        assertTrue(result instanceof JsonNull);
    }

    @Test
    public void testJsonElementAdapterReadString() throws Exception {
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        JsonElement result = adapter.read(new JsonReader(new StringReader("\"test\"")));
        assertTrue(result instanceof JsonPrimitive);
        assertEquals("test", result.getAsString());
    }

    @Test
    public void testJsonElementAdapterReadNumber() throws Exception {
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        JsonElement result = adapter.read(new JsonReader(new StringReader("123")));
        assertTrue(result instanceof JsonPrimitive);
        assertEquals(123, result.getAsInt());
    }

    @Test
    public void testJsonElementAdapterReadBoolean() throws Exception {
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        JsonElement result = adapter.read(new JsonReader(new StringReader("true")));
        assertTrue(result instanceof JsonPrimitive);
        assertTrue(result.getAsBoolean());
    }

    @Test
    public void testJsonElementAdapterReadArray() throws Exception {
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        JsonElement result = adapter.read(new JsonReader(new StringReader("[1,2,3]")));
        assertTrue(result instanceof JsonArray);
        assertEquals(3, result.getAsJsonArray().size());
    }

    @Test
    public void testJsonElementAdapterReadObject() throws Exception {
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        JsonElement result = adapter.read(new JsonReader(new StringReader("{\"key\":\"value\"}")));
        assertTrue(result instanceof JsonObject);
        assertEquals("value", result.getAsJsonObject().get("key").getAsString());
    }

    @Test
    public void testJsonElementAdapterWriteNull() throws Exception {
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        StringWriter out = new StringWriter();
        JsonWriter writer = new JsonWriter(out);
        adapter.write(writer, null);
        writer.flush();
        assertEquals("null", out.toString());
    }

    @Test
    public void testJsonElementAdapterWritePrimitive() throws Exception {
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        StringWriter out = new StringWriter();
        JsonWriter writer = new JsonWriter(out);
        adapter.write(writer, new JsonPrimitive(42));
        writer.flush();
        assertEquals("42", out.toString());
    }

    @Test
    public void testJsonElementAdapterWriteObject() throws Exception {
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        StringWriter out = new StringWriter();
        JsonWriter writer = new JsonWriter(out);
        JsonObject obj = new JsonObject();
        obj.addProperty("key", "value");
        adapter.write(writer, obj);
        writer.flush();
        assertTrue(out.toString().contains("\"key\""));
        assertTrue(out.toString().contains("\"value\""));
    }

    @Test
    public void testJsonElementAdapterWriteInvalid() throws Exception {
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        JsonWriter writer = new JsonWriter(new StringWriter());
        try {
            adapter.write(writer, new JsonElement() {});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testNewFactory() {
        TypeAdapterFactory factory = TypeAdapters.newFactory(String.class, TypeAdapters.STRING);
        assertNotNull(factory);
        assertFalse(factory.create(gson, TypeToken.get(String.class)) == null);
        assertNull(factory.create(gson, TypeToken.get(Integer.class)));
    }

    @Test
    public void testNewFactoryMultipleTypes() {
        TypeAdapterFactory factory = TypeAdapters.newFactory(Number.class, Integer.class, TypeAdapters.INTEGER);
        assertNotNull(factory);
        assertNotNull(factory.create(gson, TypeToken.get(Integer.class)));
        assertNull(factory.create(gson, TypeToken.get(Double.class)));
    }

    @Test
    public void testNewTypeHierarchyFactory() {
        TypeAdapterFactory factory = TypeAdapters.newTypeHierarchyFactory(Number.class, TypeAdapters.NUMBER);
        assertNotNull(factory);
        assertNotNull(factory.create(gson, TypeToken.get(Integer.class)));
        assertNotNull(factory.create(gson, TypeToken.get(Double.class)));
        assertNull(factory.create(gson, TypeToken.get(String.class)));
    }

    @Test
    public void testEnumTypeAdapter() throws Exception {
        TypeAdapter<TestEnum> adapter = TypeAdapters.newTypeHierarchyFactory(Enum.class, new TestEnumTypeAdapter()).create(gson, TypeToken.get(TestEnum.class));
        assertNotNull(adapter);
        TestEnum result = adapter.read(new JsonReader(new StringReader("\"A\"")));
        assertEquals(TestEnum.A, result);
        result = adapter.read(new JsonReader(new StringReader("\"B\"")));
        assertEquals(TestEnum.B, result);
    }

    @Test
    public void testEnumTypeAdapterWrite() throws Exception {
        TypeAdapter<TestEnum> adapter = TypeAdapters.newTypeHierarchyFactory(Enum.class, new TestEnumTypeAdapter()).create(gson, TypeToken.get(TestEnum.class));
        StringWriter out = new StringWriter();
        JsonWriter writer = new JsonWriter(out);
        adapter.write(writer, TestEnum.A);
        writer.flush();
        assertEquals("\"A\"", out.toString());
    }

    @Test
    public void testCalendarAdapterRead() throws Exception {
        TypeAdapter<Calendar> adapter = TypeAdapters.CALENDAR_FACTORY.create(gson, TypeToken.get(Calendar.class));
        JsonReader reader = new JsonReader(new StringReader("{\"year\":2023,\"month\":12,\"dayOfMonth\":25,\"hourOfDay\":10,\"minute\":30,\"second\":45}"));
        Calendar result = adapter.read(reader);
        assertNotNull(result);
        assertEquals(2023, result.get(Calendar.YEAR));
        assertEquals(12, result.get(Calendar.MONTH));
        assertEquals(25, result.get(Calendar.DAY_OF_MONTH));
        assertEquals(10, result.get(Calendar.HOUR_OF_DAY));
        assertEquals(30, result.get(Calendar.MINUTE));
        assertEquals(45, result.get(Calendar.SECOND));
    }

    @Test
    public void testCalendarAdapterWrite() throws Exception {
        TypeAdapter<Calendar> adapter = TypeAdapters.CALENDAR_FACTORY.create(gson, TypeToken.get(Calendar.class));
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.JANUARY, 15, 8, 30, 45);
        StringWriter out = new StringWriter();
        JsonWriter writer = new JsonWriter(out);
        adapter.write(writer, cal);
        writer.flush();
        assertTrue(out.toString().contains("2023"));
        assertTrue(out.toString().contains("0"));
    }

    @Test
    public void testTimestampFactory() {
        TypeAdapterFactory factory = TypeAdapters.newFactory(Timestamp.class, Timestamp.class, new TypeAdapter<Timestamp>() {
            @Override
            public void write(JsonWriter out, Timestamp value) throws IOException {
                out.value(value.getTime());
            }

            @Override
            public Timestamp read(JsonReader in) throws IOException {
                return new Timestamp(in.nextLong());
            }
        });
        assertNotNull(factory.create(gson, TypeToken.get(Timestamp.class)));
    }

    private static class TestEnumTypeAdapter extends TypeAdapter<TestEnum> {
        @Override
        public void write(JsonWriter out, TestEnum value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(value.name());
            }
        }

        @Override
        public TestEnum read(JsonReader in) throws IOException {
            return TestEnum.valueOf(in.nextString());
        }
    }

    private enum TestEnum {
        A, B, C
    }
}