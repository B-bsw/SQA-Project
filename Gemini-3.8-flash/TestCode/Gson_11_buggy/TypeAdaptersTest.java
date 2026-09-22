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
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class TypeAdaptersTest {

  private static <T> String toJson(TypeAdapter<T> adapter, T value) throws IOException {
    StringWriter writer = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(writer);
    jsonWriter.setLenient(true);
    adapter.write(jsonWriter, value);
    return writer.toString();
  }

  private static <T> T fromJson(TypeAdapter<T> adapter, String json) throws IOException {
    JsonReader reader = new JsonReader(new StringReader(json));
    reader.setLenient(true);
    return adapter.read(reader);
  }

  private enum TestEnum {
    @SerializedName(value = "custom_first", alternate = {"first_alt", "first_alt2"})
    FIRST,
    SECOND {
      @Override
      public String toString() {
        return "second_subclass";
      }
    }
  }

  private static class CustomJsonElement extends JsonElement {
    @Override
    public JsonElement deepCopy() {
      return this;
    }
  }

  @Test(expected = UnsupportedOperationException.class)
  public void privateConstructor_givenReflectionAccess_shouldThrowUnsupportedOperationException() throws Exception {
    Constructor<TypeAdapters> constructor = TypeAdapters.class.getDeclaredConstructor(new Class[0]);
    constructor.setAccessible(true);
    try {
      constructor.newInstance(new Object[0]);
    } catch (InvocationTargetException e) {
      throw (UnsupportedOperationException) e.getCause();
    }
  }

  @Test
  public void classAdapter_givenNull_shouldWriteAndReadNull() throws Exception {
    String json = toJson(TypeAdapters.CLASS, null);
    Assert.assertEquals("null", json);

    Class<?> readValue = fromJson(TypeAdapters.CLASS, "null");
    Assert.assertNull(readValue);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void classAdapter_givenNonNullClass_shouldThrowOnWrite() throws Exception {
    toJson(TypeAdapters.CLASS, String.class);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void classAdapter_givenNonNullClass_shouldThrowOnRead() throws Exception {
    fromJson(TypeAdapters.CLASS, "\"java.lang.String\"");
  }

  @Test
  public void classFactory_givenClassToken_shouldCreateAdapter() {
    TypeAdapter<Class> adapter = TypeAdapters.CLASS_FACTORY.create(new Gson(), TypeToken.get(Class.class));
    Assert.assertSame(TypeAdapters.CLASS, adapter);

    TypeAdapter<String> nullAdapter = TypeAdapters.CLASS_FACTORY.create(new Gson(), TypeToken.get(String.class));
    Assert.assertNull(nullAdapter);
  }

  @Test
  public void bitSetAdapter_givenValidBitSet_shouldWriteCorrectArray() throws Exception {
    BitSet bitSet = new BitSet();
    bitSet.set(0);
    bitSet.set(2);
    String json = toJson(TypeAdapters.BIT_SET, bitSet);
    Assert.assertEquals("[1,0,1]", json);

    String nullJson = toJson(TypeAdapters.BIT_SET, null);
    Assert.assertEquals("null", nullJson);
  }

  @Test
  public void bitSetAdapter_givenValidInputs_shouldReadBitSet() throws Exception {
    BitSet nullResult = fromJson(TypeAdapters.BIT_SET, "null");
    Assert.assertNull(nullResult);

    BitSet parsed = fromJson(TypeAdapters.BIT_SET, "[1, 0, true, false, \"1\", \"0\"]");
    Assert.assertTrue(parsed.get(0));
    Assert.assertFalse(parsed.get(1));
    Assert.assertTrue(parsed.get(2));
    Assert.assertFalse(parsed.get(3));
    Assert.assertTrue(parsed.get(4));
    Assert.assertFalse(parsed.get(5));
  }

  @Test(expected = JsonSyntaxException.class)
  public void bitSetAdapter_givenInvalidString_shouldThrowJsonSyntaxException() throws Exception {
    fromJson(TypeAdapters.BIT_SET, "[\"invalid\"]");
  }

  @Test(expected = JsonSyntaxException.class)
  public void bitSetAdapter_givenInvalidToken_shouldThrowJsonSyntaxException() throws Exception {
    fromJson(TypeAdapters.BIT_SET, "[{}]");
  }

  @Test
  public void booleanAdapter_givenBooleansAndStrings_shouldWriteAndRead() throws Exception {
    Assert.assertEquals("true", toJson(TypeAdapters.BOOLEAN, Boolean.TRUE));
    Assert.assertEquals("null", toJson(TypeAdapters.BOOLEAN, null));

    Assert.assertNull(fromJson(TypeAdapters.BOOLEAN, "null"));
    Assert.assertEquals(Boolean.TRUE, fromJson(TypeAdapters.BOOLEAN, "true"));
    Assert.assertEquals(Boolean.TRUE, fromJson(TypeAdapters.BOOLEAN, "\"true\""));
    Assert.assertEquals(Boolean.FALSE, fromJson(TypeAdapters.BOOLEAN, "\"false\""));
  }

  @Test
  public void booleanAsStringAdapter_givenBooleans_shouldWriteAndRead() throws Exception {
    Assert.assertEquals("\"true\"", toJson(TypeAdapters.BOOLEAN_AS_STRING, Boolean.TRUE));
    Assert.assertEquals("\"null\"", toJson(TypeAdapters.BOOLEAN_AS_STRING, null));

    Assert.assertNull(fromJson(TypeAdapters.BOOLEAN_AS_STRING, "null"));
    Assert.assertEquals(Boolean.TRUE, fromJson(TypeAdapters.BOOLEAN_AS_STRING, "\"true\""));
  }

  @Test
  public void byteAdapter_givenNumbers_shouldWriteAndRead() throws Exception {
    Assert.assertEquals("12", toJson(TypeAdapters.BYTE, Byte.valueOf((byte) 12)));
    Assert.assertNull(fromJson(TypeAdapters.BYTE, "null"));
    Assert.assertEquals(Byte.valueOf((byte) 12), fromJson(TypeAdapters.BYTE, "12"));
  }

  @Test(expected = JsonSyntaxException.class)
  public void byteAdapter_givenInvalidNumber_shouldThrowException() throws Exception {
    fromJson(TypeAdapters.BYTE, "\"not_a_byte\"");
  }

  @Test
  public void shortAdapter_givenNumbers_shouldWriteAndRead() throws Exception {
    Assert.assertEquals("300", toJson(TypeAdapters.SHORT, Short.valueOf((short) 300)));
    Assert.assertNull(fromJson(TypeAdapters.SHORT, "null"));
    Assert.assertEquals(Short.valueOf((short) 300), fromJson(TypeAdapters.SHORT, "300"));
  }

  @Test(expected = JsonSyntaxException.class)
  public void shortAdapter_givenInvalidNumber_shouldThrowException() throws Exception {
    fromJson(TypeAdapters.SHORT, "\"not_a_short\"");
  }

  @Test
  public void integerAdapter_givenNumbers_shouldWriteAndRead() throws Exception {
    Assert.assertEquals("12345", toJson(TypeAdapters.INTEGER, Integer.valueOf(12345)));
    Assert.assertNull(fromJson(TypeAdapters.INTEGER, "null"));
    Assert.assertEquals(Integer.valueOf(12345), fromJson(TypeAdapters.INTEGER, "12345"));
  }

  @Test(expected = JsonSyntaxException.class)
  public void integerAdapter_givenInvalidNumber_shouldThrowException() throws Exception {
    fromJson(TypeAdapters.INTEGER, "\"not_an_int\"");
  }

  @Test
  public void atomicIntegerAdapter_givenNumbers_shouldWriteAndRead() throws Exception {
    Assert.assertEquals("42", toJson(TypeAdapters.ATOMIC_INTEGER, new AtomicInteger(42)));
    Assert.assertNull(fromJson(TypeAdapters.ATOMIC_INTEGER, "null"));
    AtomicInteger result = fromJson(TypeAdapters.ATOMIC_INTEGER, "42");
    Assert.assertNotNull(result);
    Assert.assertEquals(42, result.get());
  }

  @Test(expected = JsonSyntaxException.class)
  public void atomicIntegerAdapter_givenInvalidFormat_shouldThrowException() throws Exception {
    fromJson(TypeAdapters.ATOMIC_INTEGER, "\"not_an_int\"");
  }

  @Test
  public void atomicBooleanAdapter_givenBooleans_shouldWriteAndRead() throws Exception {
    Assert.assertEquals("true", toJson(TypeAdapters.ATOMIC_BOOLEAN, new AtomicBoolean(true)));
    Assert.assertNull(fromJson(TypeAdapters.ATOMIC_BOOLEAN, "null"));
    AtomicBoolean result = fromJson(TypeAdapters.ATOMIC_BOOLEAN, "true");
    Assert.assertNotNull(result);
    Assert.assertTrue(result.get());
  }

  @Test
  public void atomicIntegerArrayAdapter_givenArrays_shouldWriteAndRead() throws Exception {
    AtomicIntegerArray array = new AtomicIntegerArray(2);
    array.set(0, 10);
    array.set(1, 20);
    Assert.assertEquals("[10,20]", toJson(TypeAdapters.ATOMIC_INTEGER_ARRAY, array));

    Assert.assertNull(fromJson(TypeAdapters.ATOMIC_INTEGER_ARRAY, "null"));
    AtomicIntegerArray parsed = fromJson(TypeAdapters.ATOMIC_INTEGER_ARRAY, "[10, 20]");
    Assert.assertEquals(2, parsed.length());
    Assert.assertEquals(10, parsed.get(0));
    Assert.assertEquals(20, parsed.get(1));
  }

  @Test(expected = JsonSyntaxException.class)
  public void atomicIntegerArrayAdapter_givenInvalidElement_shouldThrowException() throws Exception {
    fromJson(TypeAdapters.ATOMIC_INTEGER_ARRAY, "[10, \"invalid\"]");
  }

  @Test
  public void longAdapter_givenNumbers_shouldWriteAndRead() throws Exception {
    Assert.assertEquals("1234567890123", toJson(TypeAdapters.LONG, Long.valueOf(1234567890123L)));
    Assert.assertNull(fromJson(TypeAdapters.LONG, "null"));
    Assert.assertEquals(Long.valueOf(1234567890123L), fromJson(TypeAdapters.LONG, "1234567890123"));
  }

  @Test(expected = JsonSyntaxException.class)
  public void longAdapter_givenInvalidNumber_shouldThrowException() throws Exception {
    fromJson(TypeAdapters.LONG, "\"invalid_long\"");
  }

  @Test
  public void floatAdapter_givenNumbers_shouldWriteAndRead() throws Exception {
    Assert.assertEquals("1.5", toJson(TypeAdapters.FLOAT, Float.valueOf(1.5f)));
    Assert.assertNull(fromJson(TypeAdapters.FLOAT, "null"));
    Assert.assertEquals(Float.valueOf(1.5f), fromJson(TypeAdapters.FLOAT, "1.5"));
  }

  @Test
  public void doubleAdapter_givenNumbers_shouldWriteAndRead() throws Exception {
    Assert.assertEquals("2.75", toJson(TypeAdapters.DOUBLE, Double.valueOf(2.75d)));
    Assert.assertNull(fromJson(TypeAdapters.DOUBLE, "null"));
    Assert.assertEquals(Double.valueOf(2.75d), fromJson(TypeAdapters.DOUBLE, "2.75"));
  }

  @Test
  public void numberAdapter_givenNumbers_shouldWriteAndRead() throws Exception {
    Assert.assertEquals("100", toJson(TypeAdapters.NUMBER, Integer.valueOf(100)));
    Assert.assertNull(fromJson(TypeAdapters.NUMBER, "null"));
    Number num = fromJson(TypeAdapters.NUMBER, "100.5");
    Assert.assertEquals(100.5d, num.doubleValue(), 0.0001);
  }

  @Test(expected = JsonSyntaxException.class)
  public void numberAdapter_givenNonNumber_shouldThrowException() throws Exception {
    fromJson(TypeAdapters.NUMBER, "true");
  }

  @Test
  public void characterAdapter_givenCharacters_shouldWriteAndRead() throws Exception {
    Assert.assertEquals("\"a\"", toJson(TypeAdapters.CHARACTER, Character.valueOf('a')));
    Assert.assertEquals("null", toJson(TypeAdapters.CHARACTER, null));
    Assert.assertNull(fromJson(TypeAdapters.CHARACTER, "null"));
    Assert.assertEquals(Character.valueOf('z'), fromJson(TypeAdapters.CHARACTER, "\"z\""));
  }

  @Test(expected = JsonSyntaxException.class)
  public void characterAdapter_givenMultipleChars_shouldThrowException() throws Exception {
    fromJson(TypeAdapters.CHARACTER, "\"abc\"");
  }

  @Test
  public void stringAdapter_givenStringsAndBooleans_shouldWriteAndRead() throws Exception {
    Assert.assertEquals("\"hello\"", toJson(TypeAdapters.STRING, "hello"));
    Assert.assertNull(fromJson(TypeAdapters.STRING, "null"));
    Assert.assertEquals("world", fromJson(TypeAdapters.STRING, "\"world\""));
    Assert.assertEquals("true", fromJson(TypeAdapters.STRING, "true"));
  }

  @Test
  public void bigDecimalAdapter_givenBigDecimal_shouldWriteAndRead() throws Exception {
    BigDecimal decimal = new BigDecimal("123.4567890123456789");
    Assert.assertEquals("123.4567890123456789", toJson(TypeAdapters.BIG_DECIMAL, decimal));
    Assert.assertNull(fromJson(TypeAdapters.BIG_DECIMAL, "null"));
    Assert.assertEquals(decimal, fromJson(TypeAdapters.BIG_DECIMAL, "\"123.4567890123456789\""));
  }

  @Test(expected = JsonSyntaxException.class)
  public void bigDecimalAdapter_givenInvalidNumber_shouldThrowException() throws Exception {
    fromJson(TypeAdapters.BIG_DECIMAL, "\"abc\"");
  }

  @Test
  public void bigIntegerAdapter_givenBigInteger_shouldWriteAndRead() throws Exception {
    BigInteger integer = new BigInteger("12345678901234567890");
    Assert.assertEquals("12345678901234567890", toJson(TypeAdapters.BIG_INTEGER, integer));
    Assert.assertNull(fromJson(TypeAdapters.BIG_INTEGER, "null"));
    Assert.assertEquals(integer, fromJson(TypeAdapters.BIG_INTEGER, "\"12345678901234567890\""));
  }

  @Test(expected = JsonSyntaxException.class)
  public void bigIntegerAdapter_givenInvalidInteger_shouldThrowException() throws Exception {
    fromJson(TypeAdapters.BIG_INTEGER, "\"abc\"");
  }

  @Test
  public void stringBuilderAdapter_givenStringBuilder_shouldWriteAndRead() throws Exception {
    Assert.assertEquals("\"test\"", toJson(TypeAdapters.STRING_BUILDER, new StringBuilder("test")));
    Assert.assertEquals("null", toJson(TypeAdapters.STRING_BUILDER, null));
    Assert.assertNull(fromJson(TypeAdapters.STRING_BUILDER, "null"));
    StringBuilder sb = fromJson(TypeAdapters.STRING_BUILDER, "\"test\"");
    Assert.assertEquals("test", sb.toString());
  }

  @Test
  public void stringBufferAdapter_givenStringBuffer_shouldWriteAndRead() throws Exception {
    Assert.assertEquals("\"test\"", toJson(TypeAdapters.STRING_BUFFER, new StringBuffer("test")));
    Assert.assertEquals("null", toJson(TypeAdapters.STRING_BUFFER, null));
    Assert.assertNull(fromJson(TypeAdapters.STRING_BUFFER, "null"));
    StringBuffer sb = fromJson(TypeAdapters.STRING_BUFFER, "\"test\"");
    Assert.assertEquals("test", sb.toString());
  }

  @Test
  public void urlAdapter_givenURL_shouldWriteAndRead() throws Exception {
    URL url = new URL("http://example.com");
    Assert.assertEquals("\"http://example.com\"", toJson(TypeAdapters.URL, url));
    Assert.assertEquals("null", toJson(TypeAdapters.URL, null));
    Assert.assertNull(fromJson(TypeAdapters.URL, "null"));
    Assert.assertNull(fromJson(TypeAdapters.URL, "\"null\""));
    Assert.assertEquals(url, fromJson(TypeAdapters.URL, "\"http://example.com\""));
  }

  @Test
  public void uriAdapter_givenURI_shouldWriteAndRead() throws Exception {
    URI uri = new URI("http://example.com");
    Assert.assertEquals("\"http://example.com\"", toJson(TypeAdapters.URI, uri));
    Assert.assertEquals("null", toJson(TypeAdapters.URI, null));
    Assert.assertNull(fromJson(TypeAdapters.URI, "null"));
    Assert.assertNull(fromJson(TypeAdapters.URI, "\"null\""));
    Assert.assertEquals(uri, fromJson(TypeAdapters.URI, "\"http://example.com\""));
  }

  @Test(expected = JsonIOException.class)
  public void uriAdapter_givenInvalidURI_shouldThrowJsonIOException() throws Exception {
    fromJson(TypeAdapters.URI, "\"http://invalid uri\"");
  }

  @Test
  public void inetAddressAdapter_givenInetAddress_shouldWriteAndRead() throws Exception {
    InetAddress address = InetAddress.getByName("127.0.0.1");
    Assert.assertEquals("\"127.0.0.1\"", toJson(TypeAdapters.INET_ADDRESS, address));
    Assert.assertEquals("null", toJson(TypeAdapters.INET_ADDRESS, null));
    Assert.assertNull(fromJson(TypeAdapters.INET_ADDRESS, "null"));
    Assert.assertEquals(address, fromJson(TypeAdapters.INET_ADDRESS, "\"127.0.0.1\""));
  }

  @Test
  public void uuidAdapter_givenUUID_shouldWriteAndRead() throws Exception {
    UUID uuid = UUID.randomUUID();
    Assert.assertEquals("\"" + uuid.toString() + "\"", toJson(TypeAdapters.UUID, uuid));
    Assert.assertEquals("null", toJson(TypeAdapters.UUID, null));
    Assert.assertNull(fromJson(TypeAdapters.UUID, "null"));
    Assert.assertEquals(uuid, fromJson(TypeAdapters.UUID, "\"" + uuid.toString() + "\""));
  }

  @Test
  public void currencyAdapter_givenCurrency_shouldWriteAndRead() throws Exception {
    Currency currency = Currency.getInstance("USD");
    Assert.assertEquals("\"USD\"", toJson(TypeAdapters.CURRENCY, currency));
    Assert.assertNull(fromJson(TypeAdapters.CURRENCY, "null"));
    Assert.assertEquals(currency, fromJson(TypeAdapters.CURRENCY, "\"USD\""));
  }

  @Test
  public void timestampAdapter_givenTimestamp_shouldWriteAndRead() throws Exception {
    Gson gson = new Gson();
    TypeAdapter<Timestamp> adapter = TypeAdapters.TIMESTAMP_FACTORY.create(gson, TypeToken.get(Timestamp.class));
    Assert.assertNotNull(adapter);

    Timestamp timestamp = new Timestamp(1000000L);
    String json = toJson(adapter, timestamp);
    Timestamp readTimestamp = fromJson(adapter, json);
    Assert.assertEquals(timestamp.getTime(), readTimestamp.getTime());

    Assert.assertNull(fromJson(adapter, "null"));

    TypeAdapter<String> nonTimestamp = TypeAdapters.TIMESTAMP_FACTORY.create(gson, TypeToken.get(String.class));
    Assert.assertNull(nonTimestamp);
  }

  @Test
  public void calendarAdapter_givenCalendar_shouldWriteAndRead() throws Exception {
    Calendar cal = new GregorianCalendar(2020, 0, 15, 10, 30, 45);
    String json = toJson(TypeAdapters.CALENDAR, cal);
    Assert.assertTrue(json.contains("\"year\":2020"));
    Assert.assertTrue(json.contains("\"month\":0"));
    Assert.assertTrue(json.contains("\"dayOfMonth\":15"));
    Assert.assertTrue(json.contains("\"hourOfDay\":10"));
    Assert.assertTrue(json.contains("\"minute\":30"));
    Assert.assertTrue(json.contains("\"second\":45"));

    Assert.assertEquals("null", toJson(TypeAdapters.CALENDAR, null));
    Assert.assertNull(fromJson(TypeAdapters.CALENDAR, "null"));

    Calendar parsed = fromJson(TypeAdapters.CALENDAR, json);
    Assert.assertEquals(2020, parsed.get(Calendar.YEAR));
    Assert.assertEquals(0, parsed.get(Calendar.MONTH));
    Assert.assertEquals(15, parsed.get(Calendar.DAY_OF_MONTH));
    Assert.assertEquals(10, parsed.get(Calendar.HOUR_OF_DAY));
    Assert.assertEquals(30, parsed.get(Calendar.MINUTE));
    Assert.assertEquals(45, parsed.get(Calendar.SECOND));
  }

  @Test
  public void localeAdapter_givenVariousLocales_shouldWriteAndRead() throws Exception {
    Assert.assertEquals("\"en\"", toJson(TypeAdapters.LOCALE, new Locale("en")));
    Assert.assertEquals("\"en_US\"", toJson(TypeAdapters.LOCALE, new Locale("en", "US")));
    Assert.assertEquals("\"en_US_WIN\"", toJson(TypeAdapters.LOCALE, new Locale("en", "US", "WIN")));
    Assert.assertEquals("null", toJson(TypeAdapters.LOCALE, null));

    Assert.assertNull(fromJson(TypeAdapters.LOCALE, "null"));
    Assert.assertEquals(new Locale("en"), fromJson(TypeAdapters.LOCALE, "\"en\""));
    Assert.assertEquals(new Locale("en", "US"), fromJson(TypeAdapters.LOCALE, "\"en_US\""));
    Assert.assertEquals(new Locale("en", "US", "WIN"), fromJson(TypeAdapters.LOCALE, "\"en_US_WIN\""));
  }

  @Test
  public void jsonElementAdapter_givenAllJsonTypes_shouldWriteAndRead() throws Exception {
    Assert.assertEquals("null", toJson(TypeAdapters.JSON_ELEMENT, JsonNull.INSTANCE));
    Assert.assertEquals("null", toJson(TypeAdapters.JSON_ELEMENT, null));
    Assert.assertEquals("\"test\"", toJson(TypeAdapters.JSON_ELEMENT, new JsonPrimitive("test")));
    Assert.assertEquals("123", toJson(TypeAdapters.JSON_ELEMENT, new JsonPrimitive(Integer.valueOf(123))));
    Assert.assertEquals("true", toJson(TypeAdapters.JSON_ELEMENT, new JsonPrimitive(Boolean.TRUE)));

    JsonArray array = new JsonArray();
    array.add(new JsonPrimitive(1));
    Assert.assertEquals("[1]", toJson(TypeAdapters.JSON_ELEMENT, array));

    JsonObject object = new JsonObject();
    object.addProperty("key", "val");
    Assert.assertEquals("{\"key\":\"val\"}", toJson(TypeAdapters.JSON_ELEMENT, object));

    Assert.assertEquals(JsonNull.INSTANCE, fromJson(TypeAdapters.JSON_ELEMENT, "null"));
    Assert.assertEquals(new JsonPrimitive("test"), fromJson(TypeAdapters.JSON_ELEMENT, "\"test\""));
    Assert.assertEquals(new JsonPrimitive(Integer.valueOf(123)), fromJson(TypeAdapters.JSON_ELEMENT, "123"));
    Assert.assertEquals(new JsonPrimitive(Boolean.TRUE), fromJson(TypeAdapters.JSON_ELEMENT, "true"));
    Assert.assertEquals(array, fromJson(TypeAdapters.JSON_ELEMENT, "[1]"));
    Assert.assertEquals(object, fromJson(TypeAdapters.JSON_ELEMENT, "{\"key\":\"val\"}"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void jsonElementAdapter_givenCustomJsonElement_shouldThrowOnWrite() throws Exception {
    toJson(TypeAdapters.JSON_ELEMENT, new CustomJsonElement());
  }

  @Test
  public void enumAdapter_givenEnumWithSerializedNames_shouldWriteAndRead() throws Exception {
    TypeAdapter<TestEnum> adapter = TypeAdapters.ENUM_FACTORY.create(new Gson(), TypeToken.get(TestEnum.class));
    Assert.assertNotNull(adapter);

    Assert.assertEquals("\"custom_first\"", toJson(adapter, TestEnum.FIRST));
    Assert.assertEquals("\"SECOND\"", toJson(adapter, TestEnum.SECOND));
    Assert.assertEquals("null", toJson(adapter, null));

    Assert.assertNull(fromJson(adapter, "null"));
    Assert.assertEquals(TestEnum.FIRST, fromJson(adapter, "\"custom_first\""));
    Assert.assertEquals(TestEnum.FIRST, fromJson(adapter, "\"first_alt\""));
    Assert.assertEquals(TestEnum.FIRST, fromJson(adapter, "\"first_alt2\""));
    Assert.assertEquals(TestEnum.SECOND, fromJson(adapter, "\"SECOND\""));
  }

  @Test
  public void enumAdapter_givenSubclassEnumConstant_shouldCreateAdapter() {
    TypeAdapter<?> adapter = TypeAdapters.ENUM_FACTORY.create(new Gson(), TypeToken.get(TestEnum.SECOND.getClass()));
    Assert.assertNotNull(adapter);

    TypeAdapter<?> nonEnum = TypeAdapters.ENUM_FACTORY.create(new Gson(), TypeToken.get(String.class));
    Assert.assertNull(nonEnum);

    TypeAdapter<?> rawEnum = TypeAdapters.ENUM_FACTORY.create(new Gson(), TypeToken.get(Enum.class));
    Assert.assertNull(rawEnum);
  }

  @Test
  public void factories_givenFactories_shouldHandleToStringAndTypes() throws Exception {
    TypeToken<String> token = TypeToken.get(String.class);
    TypeAdapterFactory typeTokenFactory = TypeAdapters.newFactory(token, TypeAdapters.STRING);
    Assert.assertSame(TypeAdapters.STRING, typeTokenFactory.create(new Gson(), token));
    Assert.assertNull(typeTokenFactory.create(new Gson(), TypeToken.get(Integer.class)));

    Assert.assertTrue(TypeAdapters.STRING_FACTORY.toString().contains("Factory[type="));
    Assert.assertTrue(TypeAdapters.BOOLEAN_FACTORY.toString().contains("Factory[type="));
    Assert.assertTrue(TypeAdapters.CALENDAR_FACTORY.toString().contains("Factory[type="));
    Assert.assertTrue(TypeAdapters.INET_ADDRESS_FACTORY.toString().contains("Factory[typeHierarchy="));
  }

  @Test(expected = JsonSyntaxException.class)
  public void typeHierarchyFactory_givenIncompatibleTypeReturned_shouldThrowJsonSyntaxException() throws Exception {
    TypeAdapter<Number> fakeAdapter = new TypeAdapter<Number>() {
      @Override
      public void write(JsonWriter out, Number value) throws IOException {
        out.value(value);
      }

      @Override
      public Number read(JsonReader in) throws IOException {
        in.nextString();
        return Double.valueOf(1.0);
      }
    };

    TypeAdapterFactory factory = TypeAdapters.newTypeHierarchyFactory(Number.class, fakeAdapter);
    TypeAdapter<Integer> intAdapter = factory.create(new Gson(), TypeToken.get(Integer.class));
    Assert.assertNotNull(intAdapter);
    fromJson(intAdapter, "\"1.0\"");
  }

  @Test
  public void typeHierarchyFactory_givenNullValue_shouldPassThrough() throws Exception {
    TypeAdapter<Number> fakeAdapter = new TypeAdapter<Number>() {
      @Override
      public void write(JsonWriter out, Number value) throws IOException {
        out.nullValue();
      }

      @Override
      public Number read(JsonReader in) throws IOException {
        in.nextNull();
        return null;
      }
    };

    TypeAdapterFactory factory = TypeAdapters.newTypeHierarchyFactory(Number.class, fakeAdapter);
    TypeAdapter<Integer> intAdapter = factory.create(new Gson(), TypeToken.get(Integer.class));
    Integer result = fromJson(intAdapter, "null");
    Assert.assertNull(result);
  }
}