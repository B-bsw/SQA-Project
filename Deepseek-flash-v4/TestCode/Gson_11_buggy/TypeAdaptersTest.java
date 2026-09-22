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
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.internal.LazilyParsedNumber;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.sql.Timestamp;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

import static org.junit.Assert.*;

public class TypeAdaptersTest {

    private Gson gson;
    private TypeAdapter<Class<?>> classAdapter;
    private TypeAdapter<BitSet> bitSetAdapter;
    private TypeAdapter<Boolean> booleanAdapter;
    private TypeAdapter<Number> numberAdapter;
    private TypeAdapter<String> stringAdapter;
    private TypeAdapter<UUID> uuidAdapter;
    private TypeAdapter<Currency> currencyAdapter;
    private TypeAdapter<Calendar> calendarAdapter;
    private TypeAdapter<Locale> localeAdapter;
    private TypeAdapter<JsonElement> jsonElementAdapter;
    private TypeAdapter<URL> urlAdapter;
    private TypeAdapter<URI> uriAdapter;
    private TypeAdapter<InetAddress> inetAddressAdapter;
    private TypeAdapter<StringBuilder> stringBuilderAdapter;
    private TypeAdapter<StringBuffer> stringBufferAdapter;
    private TypeAdapter<Timestamp> timestampAdapter;

    @Before
    public void setUp() {
        gson = new Gson();
        classAdapter = TypeAdapters.CLASS;
        bitSetAdapter = TypeAdapters.BIT_SET;
        booleanAdapter = TypeAdapters.BOOLEAN;
        numberAdapter = TypeAdapters.NUMBER;
        stringAdapter = TypeAdapters.STRING;
        uuidAdapter = TypeAdapters.UUID;
        currencyAdapter = TypeAdapters.CURRENCY;
        calendarAdapter = TypeAdapters.CALENDAR;
        localeAdapter = TypeAdapters.LOCALE;
        jsonElementAdapter = TypeAdapters.JSON_ELEMENT;
        urlAdapter = TypeAdapters.URL;
        uriAdapter = TypeAdapters.URI;
        inetAddressAdapter = TypeAdapters.INET_ADDRESS;
        stringBuilderAdapter = TypeAdapters.STRING_BUILDER;
        stringBufferAdapter = TypeAdapters.STRING_BUFFER;
        timestampAdapter = TypeAdapters.TIMESTAMP;
    }

    // CLASS adapter tests
    @Test
    public void testClassWriteNull() throws IOException {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        classAdapter.write(jsonWriter, null);
        jsonWriter.flush();
        assertEquals("null", writer.toString());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testClassWriteNonNull() throws IOException {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        classAdapter.write(jsonWriter, String.class);
    }

    @Test
    public void testClassReadNull() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("null"));
        assertNull(classAdapter.read(reader));
    }

    @Test(expected = JsonSyntaxException.class)
    public void testClassReadNonNull() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"java.lang.String\""));
        classAdapter.read(reader);
    }

    // BitSet adapter tests
    @Test
    public void testBitSetWrite() throws IOException {
        BitSet bitSet = new BitSet();
        bitSet.set(0);
        bitSet.set(3);
        bitSet.set(5);
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        bitSetAdapter.write(jsonWriter, bitSet);
        jsonWriter.flush();
        assertTrue(writer.toString().contains("1"));
        assertTrue(writer.toString().contains("0"));
    }

    @Test
    public void testBitSetWriteNull() throws IOException {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        bitSetAdapter.write(jsonWriter, null);
        jsonWriter.flush();
        assertEquals("null", writer.toString());
    }

    @Test
    public void testBitSetReadNumber() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("10101"));
        BitSet bitSet = bitSetAdapter.read(reader);
        assertNotNull(bitSet);
        assertFalse(bitSet.get(0));
        assertFalse(bitSet.get(1));
    }

    @Test
    public void testBitSetReadBoolean() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("true"));
        BitSet bitSet = bitSetAdapter.read(reader);
        assertNotNull(bitSet);
        assertTrue(bitSet.get(1));
    }

    @Test(expected = JsonSyntaxException.class)
    public void testBitSetReadInvalidString() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"abc\""));
        bitSetAdapter.read(reader);
    }

    @Test(expected = JsonSyntaxException.class)
    public void testBitSetReadInvalidType() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("{}"));
        bitSetAdapter.read(reader);
    }

    // Boolean adapter tests
    @Test
    public void testBooleanReadFromBooleanValue() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("true"));
        assertTrue(booleanAdapter.read(reader));
    }

    @Test
    public void testBooleanReadFromString() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"false\""));
        assertFalse(booleanAdapter.read(reader));
    }

    @Test
    public void testBooleanWriteNull() throws IOException {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        booleanAdapter.write(jsonWriter, null);
        jsonWriter.flush();
        assertEquals("null", writer.toString());
    }

    @Test
    public void testBooleanWriteNonNull() throws IOException {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        booleanAdapter.write(jsonWriter, Boolean.TRUE);
        jsonWriter.flush();
        assertEquals("true", writer.toString());
    }

    // Number adapter tests
    @Test
    public void testNumberReadByte() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("5"));
        Number number = numberAdapter.read(reader);
        assertEquals(Byte.valueOf((byte) 5), number.byteValue());
    }

    @Test
    public void testNumberReadInteger() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("42"));
        Number number = numberAdapter.read(reader);
        assertEquals(42, number.intValue());
    }

    @Test
    public void testNumberReadLazilyParsedNumber() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("3.14"));
        Number number = numberAdapter.read(reader);
        assertTrue(number instanceof LazilyParsedNumber);
    }

    @Test
    public void testNumberReadNull() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("null"));
        assertNull(numberAdapter.read(reader));
    }

    @Test
    public void testNumberWriteWithLazilyParsedNumber() throws IOException {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        numberAdapter.write(jsonWriter, new LazilyParsedNumber("123"));
        jsonWriter.flush();
        assertEquals("123", writer.toString());
    }

    // String adapter tests
    @Test
    public void testStringReadNull() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("null"));
        assertNull(stringAdapter.read(reader));
    }

    @Test
    public void testStringReadBoolean() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("true"));
        assertEquals("true", stringAdapter.read(reader));
    }

    @Test
    public void testStringReadString() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"hello\""));
        assertEquals("hello", stringAdapter.read(reader));
    }

    @Test
    public void testStringWriteNull() throws IOException {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        stringAdapter.write(jsonWriter, (String) null);
        jsonWriter.flush();
        assertEquals("null", writer.toString());
    }

    @Test
    public void testStringWriteNonNull() throws IOException {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        stringAdapter.write(jsonWriter, "hello");
        jsonWriter.flush();
        assertEquals("\"hello\"", writer.toString());
    }

    // UUID adapter tests
    @Test
    public void testUUIDReadValid() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"123e4567-e89b-12d3-a456-426614174000\""));
        UUID uuid = uuidAdapter.read(reader);
        assertNotNull(uuid);
        assertEquals("123e4567-e89b-12d3-a456-426614174000", uuid.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUUIDReadInvalid() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"invalid\""));
        uuidAdapter.read(reader);
    }

    @Test
    public void testUUIDWriteNull() throws IOException {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        uuidAdapter.write(jsonWriter, null);
        jsonWriter.flush();
        assertEquals("null", writer.toString());
    }

    @Test
    public void testUUIDWriteNonNull() throws IOException {
        UUID uuid = UUID.randomUUID();
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        uuidAdapter.write(jsonWriter, uuid);
        jsonWriter.flush();
        assertEquals("\"" + uuid.toString() + "\"", writer.toString());
    }

    // Currency adapter tests
    @Test
    public void testCurrencyReadValid() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"USD\""));
        Currency currency = currencyAdapter.read(reader);
        assertNotNull(currency);
        assertEquals("USD", currency.getCurrencyCode());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCurrencyReadInvalid() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"INVALID\""));
        currencyAdapter.read(reader);
    }

    @Test
    public void testCurrencyWriteNull() throws IOException {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        currencyAdapter.write(jsonWriter, null);
        jsonWriter.flush();
        assertEquals("null", writer.toString());
    }

    @Test
    public void testCurrencyWriteNonNull() throws IOException {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        currencyAdapter.write(jsonWriter, Currency.getInstance("EUR"));
        jsonWriter.flush();
        assertEquals("\"EUR\"", writer.toString());
    }

    // Calendar adapter tests
    @Test
    public void testCalendarReadNull() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("null"));
        assertNull(calendarAdapter.read(reader));
    }

    @Test
    public void testCalendarReadValid() throws IOException {
        String json = "{\"year\":2024,\"month\":11,\"dayOfMonth\":25,\"hourOfDay\":10,\"minute\":30,\"second\":45}";
        JsonReader reader = new JsonReader(new StringReader(json));
        Calendar calendar = calendarAdapter.read(reader);
        assertNotNull(calendar);
        assertEquals(2024, calendar.get(Calendar.YEAR));
        assertEquals(11, calendar.get(Calendar.MONTH));
        assertEquals(25, calendar.get(Calendar.DAY_OF_MONTH));
        assertEquals(10, calendar.get(Calendar.HOUR_OF_DAY));
        assertEquals(30, calendar.get(Calendar.MINUTE));
        assertEquals(45, calendar.get(Calendar.SECOND));
    }

    @Test
    public void testCalendarWrite() throws IOException {
        Calendar calendar = new GregorianCalendar(2024, 11, 24, 12, 34, 56);
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        calendarAdapter.write(jsonWriter, calendar);
        jsonWriter.flush();
        String result = writer.toString();
        assertTrue(result.contains("\"year\":2024"));
        assertTrue(result.contains("\"month\":11"));
        assertTrue(result.contains("\"dayOfMonth\":24"));
    }

    // Locale adapter tests
    @Test
    public void testLocaleRead() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"en\""));
        Locale locale = localeAdapter.read(reader);
        assertNotNull(locale);
        assertEquals("en", locale.getLanguage());
    }

    @Test
    public void testLocaleReadWithCountry() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"en_US\""));
        Locale locale = localeAdapter.read(reader);
        assertNotNull(locale);
        assertEquals("en", locale.getLanguage());
        assertEquals("US", locale.getCountry());
    }

    @Test
    public void testLocaleReadWithVariant() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"en_US_WIN\""));
        Locale locale = localeAdapter.read(reader);
        assertNotNull(locale);
        assertEquals("en", locale.getLanguage());
        assertEquals("US", locale.getCountry());
        assertEquals("WIN", locale.getVariant());
    }

    @Test
    public void testLocaleWriteNull() throws IOException {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        localeAdapter.write(jsonWriter, null);
        jsonWriter.flush();
        assertEquals("null", writer.toString());
    }

    @Test
    public void testLocaleWriteNonNull() throws IOException {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        localeAdapter.write(jsonWriter, Locale.US);
        jsonWriter.flush();
        assertTrue(writer.toString().contains("en"));
        assertTrue(writer.toString().contains("US"));
    }

    // JsonElement adapter tests
    @Test
    public void testJsonElementReadString() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"test\""));
        JsonElement element = jsonElementAdapter.read(reader);
        assertTrue(element.isJsonPrimitive());
        assertEquals("test", element.getAsString());
    }

    @Test
    public void testJsonElementReadNumber() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("123"));
        JsonElement element = jsonElementAdapter.read(reader);
        assertTrue(element.isJsonPrimitive());
        assertEquals(123, element.getAsInt());
    }

    @Test
    public void testJsonElementReadBoolean() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("true"));
        JsonElement element = jsonElementAdapter.read(reader);
        assertTrue(element.isJsonPrimitive());
        assertTrue(element.getAsBoolean());
    }

    @Test
    public void testJsonElementReadNull() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("null"));
        JsonElement element = jsonElementAdapter.read(reader);
        assertTrue(element.isJsonNull());
    }

    @Test
    public void testJsonElementReadArray() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("[1,2,3]"));
        JsonElement element = jsonElementAdapter.read(reader);
        assertTrue(element.isJsonArray());
        assertEquals(3, element.getAsJsonArray().size());
    }

    @Test
    public void testJsonElementReadObject() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1}"));
        JsonElement element = jsonElementAdapter.read(reader);
        assertTrue(element.isJsonObject());
        assertTrue(element.getAsJsonObject().has("a"));
    }

    @Test
    public void testJsonElementWriteNull() throws IOException {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        jsonElementAdapter.write(jsonWriter, null);
        jsonWriter.flush();
        assertEquals("null", writer.toString());
    }

    @Test
    public void testJsonElementWriteJsonPrimitive() throws IOException {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        jsonElementAdapter.write(jsonWriter, new JsonPrimitive("test"));
        jsonWriter.flush();
        assertEquals("\"test\"", writer.toString());
    }

    @Test
    public void testJsonElementWriteJsonNull() throws IOException {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        jsonElementAdapter.write(jsonWriter, JsonNull.INSTANCE);
        jsonWriter.flush();
        assertEquals("null", writer.toString());
    }

    @Test
    public void testJsonElementWriteJsonArray() throws IOException {
        JsonArray array = new JsonArray();
        array.add(1);
        array.add("two");
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        jsonElementAdapter.write(jsonWriter, array);
        jsonWriter.flush();
        assertTrue(writer.toString().contains("[1,\"two\"]") || writer.toString().contains("[1,\"two\"]"));
    }

    @Test
    public void testJsonElementWriteJsonObject() throws IOException {
        JsonObject obj = new JsonObject();
        obj.addProperty("key", "value");
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        jsonElementAdapter.write(jsonWriter, obj);
        jsonWriter.flush();
        assertTrue(writer.toString().contains("\"key\""));
        assertTrue(writer.toString().contains("\"value\""));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testJsonElementWriteInvalidType() throws IOException {
        JsonAdapter2Adapter customAdapter = new JsonAdapter2Adapter();
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        jsonElementAdapter.write(jsonWriter, new CustomJsonElement());
    }

    // Inner class for testing invalid JsonElement write
    private static class CustomJsonElement extends JsonElement {
        @Override
        public JsonElement deepCopy() {
            throw new UnsupportedOperationException();
        }
    }

    // URL adapter tests
    @Test
    public void testURLReadValid() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"https://example.com\""));
        URL url = urlAdapter.read(reader);
        assertNotNull(url);
        assertEquals("https://example.com", url.toString());
    }

    @Test
    public void testURLReadNullString() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"null\""));
        URL url = urlAdapter.read(reader);
        assertNull(url);
    }

    @Test
    public void testURLWriteNull() throws IOException {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        urlAdapter.write(jsonWriter, null);
        jsonWriter.flush();
        assertEquals("null", writer.toString());
    }

    @Test
    public void testURLWriteNonNull() throws IOException {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        URL url = new URL("https://example.com");
        urlAdapter.write(jsonWriter, url);
        jsonWriter.flush();
        assertEquals("\"https://example.com\"", writer.toString());
    }

    // URI adapter tests
    @Test
    public void testURIReadValid() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"/path\""));
        URI uri = uriAdapter.read(reader);
        assertNotNull(uri);
        assertEquals("/path", uri.getPath());
    }

    @Test
    public void testURIReadInvalid() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"http://[\""));
        try {
            uriAdapter.read(reader);
            fail("Expected URISyntaxException");
        } catch (JsonSyntaxException e) {
            // Expected
        }
    }

    @Test
    public void testURIWriteNull() throws IOException {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        uriAdapter.write(jsonWriter, null);
        jsonWriter.flush();
        assertEquals("null", writer.toString());
    }

    @Test
    public void testURIWriteNonNull() throws IOException {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        URI uri = new URI("/path");
        uriAdapter.write(jsonWriter, uri);
        jsonWriter.flush();
        assertEquals("\"/path\"", writer.toString());
    }

    // InetAddress adapter tests
    @Test
    public void testInetAddressReadValid() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"127.0.0.1\""));
        InetAddress address = inetAddressAdapter.read(reader);
        assertNotNull(address);
        assertEquals("127.0.0.1", address.getHostAddress());
    }

    @Test
    public void testInetAddressWriteNull() throws IOException {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        inetAddressAdapter.write(jsonWriter, null);
        jsonWriter.flush();
        assertEquals("null", writer.toString());
    }

    @Test
    public void testInetAddressWriteNonNull() throws IOException {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        InetAddress address = InetAddress.getByName("127.0.0.1");
        inetAddressAdapter.write(jsonWriter, address);
        jsonWriter.flush();
        assertEquals("\"127.0.0.1\"", writer.toString());
    }

    // StringBuilder adapter tests
    @Test
    public void testStringBuilderRead() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"hello\""));
        StringBuilder sb = stringBuilderAdapter.read(reader);
        assertNotNull(sb);
        assertEquals("hello", sb.toString());
    }

    @Test
    public void testStringBuilderWriteNull() throws IOException {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        stringBuilderAdapter.write(jsonWriter, null);
        jsonWriter.flush();
        assertEquals("null", writer.toString());
    }

    @Test
    public void testStringBuilderWriteNonNull() throws IOException {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        stringBuilderAdapter.write(jsonWriter, new StringBuilder("hello"));
        jsonWriter.flush();
        assertEquals("\"hello\"", writer.toString());
    }

    // StringBuffer adapter tests
    @Test
    public void testStringBufferRead() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"hello\""));
        StringBuffer sb = stringBufferAdapter.read(reader);
        assertNotNull(sb);
        assertEquals("hello", sb.toString());
    }

    @Test
    public void testStringBufferWriteNull() throws IOException {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        stringBufferAdapter.write(jsonWriter, null);
        jsonWriter.flush();
        assertEquals("null", writer.toString());
    }

    @Test
    public void testStringBufferWriteNonNull() throws IOException {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        stringBufferAdapter.write(jsonWriter, new StringBuffer("hello"));
        jsonWriter.flush();
        assertEquals("\"hello\"", writer.toString());
    }

    // Timestamp adapter tests
    @Test
    public void testTimestampRead() throws IOException {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        JsonReader reader = new JsonReader(new StringReader("[" + timestamp.getTime() + "]"));
        timestampAdapter = TypeAdapters.TIMESTAMP;
        Timestamp result = timestampAdapter.read(reader);
        assertNotNull(result);
        assertEquals(timestamp.getTime(), result.getTime());
    }

    @Test
    public void testTimestampWrite() throws IOException {
        Timestamp timestamp = new Timestamp(123456789L);
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        timestampAdapter.write(jsonWriter, timestamp);
        jsonWriter.flush();
        assertEquals("[123456789]", writer.toString());
    }

    // BigInteger adapter tests (via numberAdapter)
    @Test
    public void testBigIntegerRead() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("12345678901234567890"));
        BigInteger value = gson.getAdapter(BigInteger.class).read(reader);
        assertNotNull(value);
        assertEquals(new BigInteger("12345678901234567890"), value);
    }

    @Test
    public void testBigIntegerWrite() throws IOException {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        gson.getAdapter(BigInteger.class).write(jsonWriter, new BigInteger("12345678901234567890"));
        jsonWriter.flush();
        assertTrue(writer.toString().contains("12345678901234567890"));
    }

    // BigDecimal adapter tests
    @Test
    public void testBigDecimalRead() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("123.45"));
        BigDecimal value = gson.getAdapter(BigDecimal.class).read(reader);
        assertNotNull(value);
        assertEquals(new BigDecimal("123.45"), value);
    }

    @Test
    public void testBigDecimalWrite() throws IOException {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        gson.getAdapter(BigDecimal.class).write(jsonWriter, new BigDecimal("123.45"));
        jsonWriter.flush();
        assertTrue(writer.toString().contains("123.45"));
    }
}