package com.google.gson.internal.bind;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
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

import org.junit.Assert;
import org.junit.Test;

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
import com.google.gson.stream.JsonWriter;

public class TypeAdaptersTest {

  private static <T> String write(TypeAdapter<T> adapter, T value) throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.setLenient(true);
    adapter.write(writer, value);
    writer.close();
    return out.toString();
  }

  private static <T> T read(TypeAdapter<T> adapter, String json) throws IOException {
    JsonReader reader = new JsonReader(new StringReader(json));
    reader.setLenient(true);
    return adapter.read(reader);
  }

  // =========================================================================
  // Constructor & Reflection Tests
  // =========================================================================

  @Test
  public void constructor_invokedViaReflection_shouldThrowUnsupportedOperationException() throws Exception {
    Constructor<TypeAdapters> constructor = TypeAdapters.class.getDeclaredConstructor(new Class[0]);
    constructor.setAccessible(true);
    try {
      constructor.newInstance(new Object[0]);
      Assert.fail("Expected InvocationTargetException");
    } catch (InvocationTargetException e) {
      Assert.assertTrue(e.getCause() instanceof UnsupportedOperationException);
    }
  }

  // =========================================================================
  // Class Adapter Tests
  // =========================================================================

  @Test
  public void classAdapter_givenNull_shouldWriteNull() throws IOException {
    String json = write(TypeAdapters.CLASS, null);
    Assert.assertEquals("null", json);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void classAdapter_givenClassInstance_shouldThrowUnsupportedOperation() throws IOException {
    write(TypeAdapters.CLASS, String.class);
  }

  @Test
  public void classAdapter_givenJsonNull_shouldReadNull() throws IOException {
    Class<?> result = read(TypeAdapters.CLASS, "null");
    Assert.assertNull(result);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void classAdapter_givenStringToken_shouldThrowUnsupportedOperation() throws IOException {
    read(TypeAdapters.CLASS, "\"java.lang.String\"");
  }

  @Test
  public void classFactory_givenClassType_shouldCreateAdapter() {
    TypeAdapter<Class> adapter = TypeAdapters.CLASS_FACTORY.create(new Gson(), TypeToken.get(Class.class));
    Assert.assertNotNull(adapter);
    TypeAdapter<String> other = TypeAdapters.CLASS_FACTORY.create(new Gson(), TypeToken.get(String.class));
    Assert.assertNull(other);
  }

  // =========================================================================
  // BitSet Adapter Tests
  // =========================================================================

  @Test
  public void bitSetAdapter_givenNull_shouldSerializeAndDeserializeNull() throws IOException {
    Assert.assertEquals("null", write(TypeAdapters.BIT_SET, null));
    Assert.assertNull(read(TypeAdapters.BIT_SET, "null"));
  }

  @Test
  public void bitSetAdapter_givenValidBitSet_shouldSerializeCorrectly() throws IOException {
    BitSet bitSet = new BitSet();
    bitSet.set(0);
    bitSet.set(2);
    String json = write(TypeAdapters.BIT_SET, bitSet);
    Assert.assertEquals("[1,0,1]", json);
  }

  @Test
  public void bitSetAdapter_givenEmptyBitSet_shouldSerializeToEmptyArray() throws IOException {
    BitSet bitSet = new BitSet();
    Assert.assertEquals("[]", write(TypeAdapters.BIT_SET, bitSet));
  }

  @Test
  public void bitSetAdapter_givenNumbers_shouldDeserializeCorrectly() throws IOException {
    BitSet bitSet = read(TypeAdapters.BIT_SET, "[1, 0, 2]");
    Assert.assertTrue(bitSet.get(0));
    Assert.assertFalse(bitSet.get(1));
    Assert.assertTrue(bitSet.get(2));
  }

  @Test
  public void bitSetAdapter_givenBooleans_shouldDeserializeCorrectly() throws IOException {
    BitSet bitSet = read(TypeAdapters.BIT_SET, "[true, false, true]");
    Assert.assertTrue(bitSet.get(0));
    Assert.assertFalse(bitSet.get(1));
    Assert.assertTrue(bitSet.get(2));
  }

  @Test
  public void bitSetAdapter_givenNumericStrings_shouldDeserializeCorrectly() throws IOException {
    BitSet bitSet = read(TypeAdapters.BIT_SET, "[\"1\", \"0\"]");
    Assert.assertTrue(bitSet.get(0));
    Assert.assertFalse(bitSet.get(1));
  }

  @Test(expected = JsonSyntaxException.class)
  public void bitSetAdapter_givenInvalidString_shouldThrowJsonSyntaxException() throws IOException {
    read(TypeAdapters.BIT_SET, "[\"invalid\"]");
  }

  @Test(expected = JsonSyntaxException.class)
  public void bitSetAdapter_givenUnexpectedTokenType_shouldThrowJsonSyntaxException() throws IOException {
    read(TypeAdapters.BIT_SET, "[{}]");
  }

  // =========================================================================
  // Boolean & Boolean As String Adapter Tests
  // =========================================================================

  @Test
  public void booleanAdapter_givenNull_shouldWriteAndReadNull() throws IOException {
    Assert.assertEquals("null", write(TypeAdapters.BOOLEAN, null));
    Assert.assertNull(read(TypeAdapters.BOOLEAN, "null"));
  }

  @Test
  public void booleanAdapter_givenBooleanLiterals_shouldReadCorrectly() throws IOException {
    Assert.assertEquals(Boolean.TRUE, read(TypeAdapters.BOOLEAN, "true"));
    Assert.assertEquals(Boolean.FALSE, read(TypeAdapters.BOOLEAN, "false"));
  }

  @Test
  public void booleanAdapter_givenBooleanStrings_shouldReadCorrectly() throws IOException {
    Assert.assertEquals(Boolean.TRUE, read(TypeAdapters.BOOLEAN, "\"true\""));
    Assert.assertEquals(Boolean.FALSE, read(TypeAdapters.BOOLEAN, "\"false\""));
    Assert.assertEquals(Boolean.FALSE, read(TypeAdapters.BOOLEAN, "\"not_a_bool\""));
  }

  @Test
  public void booleanAdapter_givenBoolean_shouldWriteCorrectly() throws IOException {
    Assert.assertEquals("true", write(TypeAdapters.BOOLEAN, Boolean.TRUE));
  }

  @Test
  public void booleanAsStringAdapter_givenValues_shouldWriteAndRead() throws IOException {
    Assert.assertEquals("\"true\"", write(TypeAdapters.BOOLEAN_AS_STRING, Boolean.TRUE));
    Assert.assertEquals("\"null\"", write(TypeAdapters.BOOLEAN_AS_STRING, null));
    Assert.assertNull(read(TypeAdapters.BOOLEAN_AS_STRING, "null"));
    Assert.assertEquals(Boolean.TRUE, read(TypeAdapters.BOOLEAN_AS_STRING, "\"true\""));
    Assert.assertEquals(Boolean.FALSE, read(TypeAdapters.BOOLEAN_AS_STRING, "\"xyz\""));
  }

  // =========================================================================
  // Number Adapters: Byte, Short, Integer, Long, Float, Double, Number
  // =========================================================================

  @Test
  public void byteAdapter_givenValidInput_shouldReadAndWrite() throws IOException {
    Assert.assertEquals("12", write(TypeAdapters.BYTE, Byte.valueOf((byte) 12)));
    Assert.assertEquals(Byte.valueOf((byte) 12), read(TypeAdapters.BYTE, "12"));
    Assert.assertNull(read(TypeAdapters.BYTE, "null"));
  }

  @Test(expected = JsonSyntaxException.class)
  public void byteAdapter_givenInvalidNumber_shouldThrowJsonSyntaxException() throws IOException {
    read(TypeAdapters.BYTE, "\"not_a_number\"");
  }

  @Test
  public void shortAdapter_givenValidInput_shouldReadAndWrite() throws IOException {
    Assert.assertEquals("300", write(TypeAdapters.SHORT, Short.valueOf((short) 300)));
    Assert.assertEquals(Short.valueOf((short) 300), read(TypeAdapters.SHORT, "300"));
    Assert.assertNull(read(TypeAdapters.SHORT, "null"));
  }

  @Test(expected = JsonSyntaxException.class)
  public void shortAdapter_givenInvalidNumber_shouldThrowJsonSyntaxException() throws IOException {
    read(TypeAdapters.SHORT, "\"not_a_number\"");
  }

  @Test
  public void integerAdapter_givenValidInput_shouldReadAndWrite() throws IOException {
    Assert.assertEquals("42", write(TypeAdapters.INTEGER, Integer.valueOf(42)));
    Assert.assertEquals(Integer.valueOf(42), read(TypeAdapters.INTEGER, "42"));
    Assert.assertNull(read(TypeAdapters.INTEGER, "null"));
  }

  @Test(expected = JsonSyntaxException.class)
  public void integerAdapter_givenInvalidNumber_shouldThrowJsonSyntaxException() throws IOException {
    read(TypeAdapters.INTEGER, "\"not_a_number\"");
  }

  @Test
  public void longAdapter_givenValidInput_shouldReadAndWrite() throws IOException {
    Assert.assertEquals("1234567890123", write(TypeAdapters.LONG, Long.valueOf(1234567890123L)));
    Assert.assertEquals(Long.valueOf(1234567890123L), read(TypeAdapters.LONG, "1234567890123"));
    Assert.assertNull(read(TypeAdapters.LONG, "null"));
  }

  @Test(expected = JsonSyntaxException.class)
  public void longAdapter_givenInvalidNumber_shouldThrowJsonSyntaxException() throws IOException {
    read(TypeAdapters.LONG, "\"not_a_number\"");
  }

  @Test
  public void floatAdapter_givenValidInput_shouldReadAndWrite() throws IOException {
    Assert.assertEquals("12.5", write(TypeAdapters.FLOAT, Float.valueOf(12.5f)));
    Assert.assertEquals(Float.valueOf(12.5f), read(TypeAdapters.FLOAT, "12.5"));
    Assert.assertNull(read(TypeAdapters.FLOAT, "null"));
  }

  @Test
  public void doubleAdapter_givenValidInput_shouldReadAndWrite() throws IOException {
    Assert.assertEquals("12.5", write(TypeAdapters.DOUBLE, Double.valueOf(12.5d)));
    Assert.assertEquals(Double.valueOf(12.5d), read(TypeAdapters.DOUBLE, "12.5"));
    Assert.assertNull(read(TypeAdapters.DOUBLE, "null"));
  }

  @Test
  public void numberAdapter_givenValidInput_shouldReadAndWrite() throws IOException {
    Assert.assertEquals("42", write(TypeAdapters.NUMBER, Integer.valueOf(42)));
    Number parsed = read(TypeAdapters.NUMBER, "42");
    Assert.assertTrue(parsed instanceof LazilyParsedNumber);
    Assert.assertEquals(42, parsed.intValue());
    Assert.assertNull(read(TypeAdapters.NUMBER, "null"));
  }

  @Test(expected = JsonSyntaxException.class)
  public void numberAdapter_givenInvalidTokenType_shouldThrowJsonSyntaxException() throws IOException {
    read(TypeAdapters.NUMBER, "true");
  }

  // =========================================================================
  // Atomic Adapters: AtomicInteger, AtomicBoolean, AtomicIntegerArray
  // =========================================================================

  @Test
  public void atomicIntegerAdapter_givenValidInput_shouldReadAndWrite() throws IOException {
    Assert.assertEquals("100", write(TypeAdapters.ATOMIC_INTEGER, new AtomicInteger(100)));
    Assert.assertEquals("null", write(TypeAdapters.ATOMIC_INTEGER, null));
    Assert.assertEquals(100, read(TypeAdapters.ATOMIC_INTEGER, "100").get());
    Assert.assertNull(read(TypeAdapters.ATOMIC_INTEGER, "null"));
  }

  @Test(expected = JsonSyntaxException.class)
  public void atomicIntegerAdapter_givenInvalidNumber_shouldThrowJsonSyntaxException() throws IOException {
    read(TypeAdapters.ATOMIC_INTEGER, "\"invalid\"");
  }

  @Test
  public void atomicBooleanAdapter_givenValidInput_shouldReadAndWrite() throws IOException {
    Assert.assertEquals("true", write(TypeAdapters.ATOMIC_BOOLEAN, new AtomicBoolean(true)));
    Assert.assertEquals("null", write(TypeAdapters.ATOMIC_BOOLEAN, null));
    Assert.assertTrue(read(TypeAdapters.ATOMIC_BOOLEAN, "true").get());
    Assert.assertNull(read(TypeAdapters.ATOMIC_BOOLEAN, "null"));
  }

  @Test
  public void atomicIntegerArrayAdapter_givenValidInput_shouldReadAndWrite() throws IOException {
    AtomicIntegerArray array = new AtomicIntegerArray(new int[] { 1, 2, 3 });
    Assert.assertEquals("[1,2,3]", write(TypeAdapters.ATOMIC_INTEGER_ARRAY, array));
    Assert.assertEquals("null", write(TypeAdapters.ATOMIC_INTEGER_ARRAY, null));

    AtomicIntegerArray parsed = read(TypeAdapters.ATOMIC_INTEGER_ARRAY, "[10, 20]");
    Assert.assertEquals(2, parsed.length());
    Assert.assertEquals(10, parsed.get(0));
    Assert.assertEquals(20, parsed.get(1));
    Assert.assertNull(read(TypeAdapters.ATOMIC_INTEGER_ARRAY, "null"));
  }

  @Test(expected = JsonSyntaxException.class)
  public void atomicIntegerArrayAdapter_givenInvalidItem_shouldThrowJsonSyntaxException() throws IOException {
    read(TypeAdapters.ATOMIC_INTEGER_ARRAY, "[1, \"xyz\"]");
  }

  // =========================================================================
  // Character, String, BigDecimal, BigInteger, StringBuilder, StringBuffer
  // =========================================================================

  @Test
  public void characterAdapter_givenValidInput_shouldReadAndWrite() throws IOException {
    Assert.assertEquals("\"a\"", write(TypeAdapters.CHARACTER, Character.valueOf('a')));
    Assert.assertEquals("null", write(TypeAdapters.CHARACTER, null));
    Assert.assertEquals(Character.valueOf('a'), read(TypeAdapters.CHARACTER, "\"a\""));
    Assert.assertNull(read(TypeAdapters.CHARACTER, "null"));
  }

  @Test(expected = JsonSyntaxException.class)
  public void characterAdapter_givenMultipleChars_shouldThrowJsonSyntaxException() throws IOException {
    read(TypeAdapters.CHARACTER, "\"abc\"");
  }

  @Test
  public void stringAdapter_givenValidInput_shouldReadAndWrite() throws IOException {
    Assert.assertEquals("\"hello\"", write(TypeAdapters.STRING, "hello"));
    Assert.assertEquals("null", write(TypeAdapters.STRING, null));
    Assert.assertEquals("hello", read(TypeAdapters.STRING, "\"hello\""));
    Assert.assertEquals("true", read(TypeAdapters.STRING, "true"));
    Assert.assertNull(read(TypeAdapters.STRING, "null"));
  }

  @Test
  public void bigDecimalAdapter_givenValidInput_shouldReadAndWrite() throws IOException {
    BigDecimal bd = new BigDecimal("123.456");
    Assert.assertEquals("123.456", write(TypeAdapters.BIG_DECIMAL, bd));
    Assert.assertEquals(bd, read(TypeAdapters.BIG_DECIMAL, "\"123.456\""));
    Assert.assertNull(read(TypeAdapters.BIG_DECIMAL, "null"));
  }

  @Test(expected = JsonSyntaxException.class)
  public void bigDecimalAdapter_givenInvalidInput_shouldThrowJsonSyntaxException() throws IOException {
    read(TypeAdapters.BIG_DECIMAL, "\"xyz\"");
  }

  @Test
  public void bigIntegerAdapter_givenValidInput_shouldReadAndWrite() throws IOException {
    BigInteger bi = new BigInteger("12345678901234567890");
    Assert.assertEquals("12345678901234567890", write(TypeAdapters.BIG_INTEGER, bi));
    Assert.assertEquals(bi, read(TypeAdapters.BIG_INTEGER, "\"12345678901234567890\""));
    Assert.assertNull(read(TypeAdapters.BIG_INTEGER, "null"));
  }

  @Test(expected = JsonSyntaxException.class)
  public void bigIntegerAdapter_givenInvalidInput_shouldThrowJsonSyntaxException() throws IOException {
    read(TypeAdapters.BIG_INTEGER, "\"xyz\"");
  }

  @Test
  public void stringBuilderAdapter_givenValidInput_shouldReadAndWrite() throws IOException {
    Assert.assertEquals("\"test\"", write(TypeAdapters.STRING_BUILDER, new StringBuilder("test")));
    Assert.assertEquals("null", write(TypeAdapters.STRING_BUILDER, null));
    Assert.assertEquals("test", read(TypeAdapters.STRING_BUILDER, "\"test\"").toString());
    Assert.assertNull(read(TypeAdapters.STRING_BUILDER, "null"));
  }

  @Test
  public void stringBufferAdapter_givenValidInput_shouldReadAndWrite() throws IOException {
    Assert.assertEquals("\"buf\"", write(TypeAdapters.STRING_BUFFER, new StringBuffer("buf")));
    Assert.assertEquals("null", write(TypeAdapters.STRING_BUFFER, null));
    Assert.assertEquals("buf", read(TypeAdapters.STRING_BUFFER, "\"buf\"").toString());
    Assert.assertNull(read(TypeAdapters.STRING_BUFFER, "null"));
  }

  // =========================================================================
  // URL, URI, InetAddress, UUID, Currency
  // =========================================================================

  @Test
  public void urlAdapter_givenValidInput_shouldReadAndWrite() throws IOException {
    URL url = new URL("http://example.com");
    Assert.assertEquals("\"http://example.com\"", write(TypeAdapters.URL, url));
    Assert.assertEquals("null", write(TypeAdapters.URL, null));
    Assert.assertEquals(url, read(TypeAdapters.URL, "\"http://example.com\""));
    Assert.assertNull(read(TypeAdapters.URL, "null"));
    Assert.assertNull(read(TypeAdapters.URL, "\"null\""));
  }

  @Test
  public void uriAdapter_givenValidInput_shouldReadAndWrite() throws Exception {
    URI uri = new URI("http://example.com");
    Assert.assertEquals("\"http://example.com\"", write(TypeAdapters.URI, uri));
    Assert.assertEquals("null", write(TypeAdapters.URI, null));
    Assert.assertEquals(uri, read(TypeAdapters.URI, "\"http://example.com\""));
    Assert.assertNull(read(TypeAdapters.URI, "null"));
    Assert.assertNull(read(TypeAdapters.URI, "\"null\""));
  }

  @Test(expected = JsonIOException.class)
  public void uriAdapter_givenInvalidUri_shouldThrowJsonIOException() throws IOException {
    read(TypeAdapters.URI, "\"http://invalid uri\"");
  }

  @Test
  public void inetAddressAdapter_givenValidInput_shouldReadAndWrite() throws IOException {
    InetAddress address = InetAddress.getByName("127.0.0.1");
    Assert.assertEquals("\"127.0.0.1\"", write(TypeAdapters.INET_ADDRESS, address));
    Assert.assertEquals("null", write(TypeAdapters.INET_ADDRESS, null));
    Assert.assertEquals(address, read(TypeAdapters.INET_ADDRESS, "\"127.0.0.1\""));
    Assert.assertNull(read(TypeAdapters.INET_ADDRESS, "null"));
  }

  @Test
  public void uuidAdapter_givenValidInput_shouldReadAndWrite() throws IOException {
    UUID uuid = UUID.randomUUID();
    Assert.assertEquals("\"" + uuid.toString() + "\"", write(TypeAdapters.UUID, uuid));
    Assert.assertEquals("null", write(TypeAdapters.UUID, null));
    Assert.assertEquals(uuid, read(TypeAdapters.UUID, "\"" + uuid.toString() + "\""));
    Assert.assertNull(read(TypeAdapters.UUID, "null"));
  }

  @Test
  public void currencyAdapter_givenValidInput_shouldReadAndWrite() throws IOException {
    Currency currency = Currency.getInstance("USD");
    Assert.assertEquals("\"USD\"", write(TypeAdapters.CURRENCY, currency));
    Assert.assertEquals("null", write(TypeAdapters.CURRENCY, null));
    Assert.assertEquals(currency, read(TypeAdapters.CURRENCY, "\"USD\""));
    Assert.assertNull(read(TypeAdapters.CURRENCY, "null"));
  }

  // =========================================================================
  // Timestamp Adapter & Factory Tests
  // =========================================================================

  @Test
  public void timestampFactory_givenTimestampType_shouldCreateAdapter() throws IOException {
    Gson gson = new Gson();
    TypeAdapter<Timestamp> adapter = TypeAdapters.TIMESTAMP_FACTORY.create(gson, TypeToken.get(Timestamp.class));
    Assert.assertNotNull(adapter);

    long time = 1500000000000L;
    Timestamp timestamp = new Timestamp(time);
    String json = write(adapter, timestamp);
    Timestamp readTimestamp = read(adapter, json);
    Assert.assertNotNull(readTimestamp);

    Assert.assertNull(write(adapter, null));
    Assert.assertNull(read(adapter, "null"));
  }

  @Test
  public void timestampFactory_givenNonTimestampType_shouldReturnNull() {
    TypeAdapter<String> adapter = TypeAdapters.TIMESTAMP_FACTORY.create(new Gson(), TypeToken.get(String.class));
    Assert.assertNull(adapter);
  }

  // =========================================================================
  // Calendar Adapter Tests
  // =========================================================================

  @Test
  public void calendarAdapter_givenValidInput_shouldReadAndWrite() throws IOException {
    Calendar cal = new GregorianCalendar();
    cal.set(2023, Calendar.MARCH, 15, 10, 20, 30);
    String json = write(TypeAdapters.CALENDAR, cal);
    Assert.assertTrue(json.contains("\"year\":2023"));
    Assert.assertTrue(json.contains("\"month\":" + Calendar.MARCH));
    Assert.assertTrue(json.contains("\"dayOfMonth\":15"));
    Assert.assertTrue(json.contains("\"hourOfDay\":10"));
    Assert.assertTrue(json.contains("\"minute\":20"));
    Assert.assertTrue(json.contains("\"second\":30"));

    Calendar readCal = read(TypeAdapters.CALENDAR, json);
    Assert.assertEquals(2023, readCal.get(Calendar.YEAR));
    Assert.assertEquals(Calendar.MARCH, readCal.get(Calendar.MONTH));
    Assert.assertEquals(15, readCal.get(Calendar.DAY_OF_MONTH));
    Assert.assertEquals(10, readCal.get(Calendar.HOUR_OF_DAY));
    Assert.assertEquals(20, readCal.get(Calendar.MINUTE));
    Assert.assertEquals(30, readCal.get(Calendar.SECOND));

    Assert.assertEquals("null", write(TypeAdapters.CALENDAR, null));
    Assert.assertNull(read(TypeAdapters.CALENDAR, "null"));
  }

  // =========================================================================
  // Locale Adapter Tests
  // =========================================================================

  @Test
  public void localeAdapter_givenVariousFormats_shouldReadCorrectly() throws IOException {
    Assert.assertEquals(new Locale("en"), read(TypeAdapters.LOCALE, "\"en\""));
    Assert.assertEquals(new Locale("en", "US"), read(TypeAdapters.LOCALE, "\"en_US\""));
    Assert.assertEquals(new Locale("en", "US", "WIN"), read(TypeAdapters.LOCALE, "\"en_US_WIN\""));
    Assert.assertNull(read(TypeAdapters.LOCALE, "null"));
    Assert.assertEquals("null", write(TypeAdapters.LOCALE, null));
    Assert.assertEquals("\"en_US\"", write(TypeAdapters.LOCALE, new Locale("en", "US")));
  }

  // =========================================================================
  // JsonElement Adapter Tests
  // =========================================================================

  @Test
  public void jsonElementAdapter_givenPrimitiveValues_shouldReadAndWrite() throws IOException {
    Assert.assertEquals(new JsonPrimitive("test"), read(TypeAdapters.JSON_ELEMENT, "\"test\""));
    Assert.assertEquals(new JsonPrimitive(123), read(TypeAdapters.JSON_ELEMENT, "123"));
    Assert.assertEquals(new JsonPrimitive(true), read(TypeAdapters.JSON_ELEMENT, "true"));
    Assert.assertEquals(JsonNull.INSTANCE, read(TypeAdapters.JSON_ELEMENT, "null"));

    Assert.assertEquals("\"test\"", write(TypeAdapters.JSON_ELEMENT, new JsonPrimitive("test")));
    Assert.assertEquals("123", write(TypeAdapters.JSON_ELEMENT, new JsonPrimitive(123)));
    Assert.assertEquals("true", write(TypeAdapters.JSON_ELEMENT, new JsonPrimitive(true)));
    Assert.assertEquals("null", write(TypeAdapters.JSON_ELEMENT, JsonNull.INSTANCE));
    Assert.assertEquals("null", write(TypeAdapters.JSON_ELEMENT, null));
  }

  @Test
  public void jsonElementAdapter_givenArrayAndObject_shouldReadAndWrite() throws IOException {
    String json = "{\"key\":[1,true,\"abc\",null]}";
    JsonElement element = read(TypeAdapters.JSON_ELEMENT, json);
    Assert.assertTrue(element.isJsonObject());
    JsonObject obj = element.getAsJsonObject();
    Assert.assertTrue(obj.has("key"));
    JsonArray arr = obj.getAsJsonArray("key");
    Assert.assertEquals(4, arr.size());

    String serialized = write(TypeAdapters.JSON_ELEMENT, element);
    Assert.assertTrue(serialized.contains("\"key\":[1,true,\"abc\",null]"));
  }

  private static class CustomJsonElement extends JsonElement {
    @Override
    public JsonElement deepCopy() {
      return this;
    }
  }

  @Test(expected = IllegalArgumentException.class)
  public void jsonElementAdapter_givenUnsupportedJsonElement_shouldThrowIllegalArgumentException() throws IOException {
    write(TypeAdapters.JSON_ELEMENT, new CustomJsonElement());
  }

  @Test(expected = IllegalArgumentException.class)
  public void jsonElementAdapter_givenEndOfDocumentToken_shouldThrowIllegalArgumentException() throws IOException {
    read(TypeAdapters.JSON_ELEMENT, "");
  }

  // =========================================================================
  // Enum Adapter & Factory Tests