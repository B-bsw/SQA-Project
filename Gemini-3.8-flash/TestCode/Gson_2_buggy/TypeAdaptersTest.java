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
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.junit.Assert;
import org.junit.Test;

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
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;

public class TypeAdaptersTest {

    private enum TestSampleEnum {
        @SerializedName(value = "FIRST", alternate = {"first_alt", "1st"})
        FIRST,
        @SerializedName("SECOND")
        SECOND,
        THIRD
    }

    private enum TestCustomSubEnum {
        VALUE_A {
            @Override
            public String customMethod() {
                return "A";
            }
        };

        public abstract String customMethod();
    }

    private static class CustomJsonElement extends JsonElement {
        @Override
        public JsonElement deepCopy() {
            return this;
        }
    }

    private <T> String toJson(TypeAdapter<T> adapter, T value) throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setLenient(true);
        adapter.write(jsonWriter, value);
        return stringWriter.toString();
    }

    private <T> T fromJson(TypeAdapter<T> adapter, String json) throws IOException {
        JsonReader jsonReader = new JsonReader(new StringReader(json));
        jsonReader.setLenient(true);
        return adapter.read(jsonReader);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void constructor_givenReflectionCall_shouldThrowUnsupportedOperationException() throws Throwable {
        Constructor<TypeAdapters> constructor = TypeAdapters.class.getDeclaredConstructor(new Class[0]);
        constructor.setAccessible(true);
        try {
            constructor.newInstance(new Object[0]);
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }

    @Test
    public void classAdapter_givenNull_shouldSerializeAndDeserializeNull() throws IOException {
        String json = toJson(TypeAdapters.CLASS, null);
        Assert.assertEquals("null", json);

        Class<?> result = fromJson(TypeAdapters.CLASS, "null");
        Assert.assertNull(result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void classAdapter_givenNonNullValueOnWrite_shouldThrowUnsupportedOperationException() throws IOException {
        toJson(TypeAdapters.CLASS, String.class);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void classAdapter_givenNonNullValueOnRead_shouldThrowUnsupportedOperationException() throws IOException {
        fromJson(TypeAdapters.CLASS, "\"java.lang.String\"");
    }

    @Test
    public void bitSetAdapter_givenValidValues_shouldSerializeAndDeserialize() throws IOException {
        BitSet bitSet = new BitSet();
        bitSet.set(0);
        bitSet.set(2);
        bitSet.set(3);

        String json = toJson(TypeAdapters.BIT_SET, bitSet);
        Assert.assertEquals("[1,0,1,1]", json);

        BitSet readBitSet = fromJson(TypeAdapters.BIT_SET, "[1, 0, 1, 1]");
        Assert.assertEquals(bitSet, readBitSet);

        BitSet booleanBitSet = fromJson(TypeAdapters.BIT_SET, "[true, false, true, true]");
        Assert.assertEquals(bitSet, booleanBitSet);

        BitSet stringBitSet = fromJson(TypeAdapters.BIT_SET, "[\"1\", \"0\", \"1\", \"1\"]");
        Assert.assertEquals(bitSet, stringBitSet);
    }

    @Test
    public void bitSetAdapter_givenNull_shouldSerializeAndDeserializeNull() throws IOException {
        String json = toJson(TypeAdapters.BIT_SET, null);
        Assert.assertEquals("null", json);

        BitSet bitSet = fromJson(TypeAdapters.BIT_SET, "null");
        Assert.assertNull(bitSet);
    }

    @Test(expected = JsonSyntaxException.class)
    public void bitSetAdapter_givenInvalidStringNumber_shouldThrowJsonSyntaxException() throws IOException {
        fromJson(TypeAdapters.BIT_SET, "[\"invalid\"]");
    }

    @Test(expected = JsonSyntaxException.class)
    public void bitSetAdapter_givenInvalidToken_shouldThrowJsonSyntaxException() throws IOException {
        fromJson(TypeAdapters.BIT_SET, "[{}]");
    }

    @Test
    public void booleanAdapter_givenValues_shouldSerializeAndDeserialize() throws IOException {
        Assert.assertEquals("true", toJson(TypeAdapters.BOOLEAN, Boolean.TRUE));
        Assert.assertEquals("false", toJson(TypeAdapters.BOOLEAN, Boolean.FALSE));
        Assert.assertEquals("null", toJson(TypeAdapters.BOOLEAN, null));

        Assert.assertEquals(Boolean.TRUE, fromJson(TypeAdapters.BOOLEAN, "true"));
        Assert.assertEquals(Boolean.FALSE, fromJson(TypeAdapters.BOOLEAN, "false"));
        Assert.assertEquals(Boolean.TRUE, fromJson(TypeAdapters.BOOLEAN, "\"true\""));
        Assert.assertNull(fromJson(TypeAdapters.BOOLEAN, "null"));
    }

    @Test
    public void booleanAsStringAdapter_givenValues_shouldSerializeAndDeserialize() throws IOException {
        Assert.assertEquals("\"true\"", toJson(TypeAdapters.BOOLEAN_AS_STRING, Boolean.TRUE));
        Assert.assertEquals("\"null\"", toJson(TypeAdapters.BOOLEAN_AS_STRING, null));

        Assert.assertEquals(Boolean.TRUE, fromJson(TypeAdapters.BOOLEAN_AS_STRING, "\"true\""));
        Assert.assertEquals(Boolean.FALSE, fromJson(TypeAdapters.BOOLEAN_AS_STRING, "\"false\""));
        Assert.assertNull(fromJson(TypeAdapters.BOOLEAN_AS_STRING, "null"));
    }

    @Test
    public void byteAdapter_givenValues_shouldSerializeAndDeserialize() throws IOException {
        Assert.assertEquals("12", toJson(TypeAdapters.BYTE, Byte.valueOf((byte) 12)));
        Assert.assertEquals(Byte.valueOf((byte) 12), fromJson(TypeAdapters.BYTE, "12"));
        Assert.assertNull(fromJson(TypeAdapters.BYTE, "null"));
    }

    @Test(expected = JsonSyntaxException.class)
    public void byteAdapter_givenInvalidNumber_shouldThrowJsonSyntaxException() throws IOException {
        fromJson(TypeAdapters.BYTE, "\"not-a-number\"");
    }

    @Test
    public void shortAdapter_givenValues_shouldSerializeAndDeserialize() throws IOException {
        Assert.assertEquals("123", toJson(TypeAdapters.SHORT, Short.valueOf((short) 123)));
        Assert.assertEquals(Short.valueOf((short) 123), fromJson(TypeAdapters.SHORT, "123"));
        Assert.assertNull(fromJson(TypeAdapters.SHORT, "null"));
    }

    @Test(expected = JsonSyntaxException.class)
    public void shortAdapter_givenInvalidNumber_shouldThrowJsonSyntaxException() throws IOException {
        fromJson(TypeAdapters.SHORT, "\"not-a-short\"");
    }

    @Test
    public void integerAdapter_givenValues_shouldSerializeAndDeserialize() throws IOException {
        Assert.assertEquals("12345", toJson(TypeAdapters.INTEGER, Integer.valueOf(12345)));
        Assert.assertEquals(Integer.valueOf(12345), fromJson(TypeAdapters.INTEGER, "12345"));
        Assert.assertNull(fromJson(TypeAdapters.INTEGER, "null"));
    }

    @Test(expected = JsonSyntaxException.class)
    public void integerAdapter_givenInvalidNumber_shouldThrowJsonSyntaxException() throws IOException {
        fromJson(TypeAdapters.INTEGER, "\"invalid\"");
    }

    @Test
    public void longAdapter_givenValues_shouldSerializeAndDeserialize() throws IOException {
        Assert.assertEquals("1234567890123", toJson(TypeAdapters.LONG, Long.valueOf(1234567890123L)));
        Assert.assertEquals(Long.valueOf(1234567890123L), fromJson(TypeAdapters.LONG, "1234567890123"));
        Assert.assertNull(fromJson(TypeAdapters.LONG, "null"));
    }

    @Test(expected = JsonSyntaxException.class)
    public void longAdapter_givenInvalidNumber_shouldThrowJsonSyntaxException() throws IOException {
        fromJson(TypeAdapters.LONG, "\"invalid_long\"");
    }

    @Test
    public void floatAdapter_givenValues_shouldSerializeAndDeserialize() throws IOException {
        Assert.assertEquals("12.5", toJson(TypeAdapters.FLOAT, Float.valueOf(12.5f)));
        Assert.assertEquals(Float.valueOf(12.5f), fromJson(TypeAdapters.FLOAT, "12.5"));
        Assert.assertNull(fromJson(TypeAdapters.FLOAT, "null"));
    }

    @Test
    public void doubleAdapter_givenValues_shouldSerializeAndDeserialize() throws IOException {
        Assert.assertEquals("12.5", toJson(TypeAdapters.DOUBLE, Double.valueOf(12.5d)));
        Assert.assertEquals(Double.valueOf(12.5d), fromJson(TypeAdapters.DOUBLE, "12.5"));
        Assert.assertNull(fromJson(TypeAdapters.DOUBLE, "null"));
    }

    @Test
    public void numberAdapter_givenValues_shouldSerializeAndDeserialize() throws IOException {
        Assert.assertEquals("123", toJson(TypeAdapters.NUMBER, Integer.valueOf(123)));
        Assert.assertNull(fromJson(TypeAdapters.NUMBER, "null"));
        Number number = fromJson(TypeAdapters.NUMBER, "123.456");
        Assert.assertEquals("123.456", number.toString());
    }

    @Test(expected = JsonSyntaxException.class)
    public void numberAdapter_givenInvalidToken_shouldThrowJsonSyntaxException() throws IOException {
        fromJson(TypeAdapters.NUMBER, "true");
    }

    @Test
    public void characterAdapter_givenValues_shouldSerializeAndDeserialize() throws IOException {
        Assert.assertEquals("\"a\"", toJson(TypeAdapters.CHARACTER, Character.valueOf('a')));
        Assert.assertEquals("null", toJson(TypeAdapters.CHARACTER, null));
        Assert.assertEquals(Character.valueOf('a'), fromJson(TypeAdapters.CHARACTER, "\"a\""));
        Assert.assertNull(fromJson(TypeAdapters.CHARACTER, "null"));
    }

    @Test(expected = JsonSyntaxException.class)
    public void characterAdapter_givenMultiCharString_shouldThrowJsonSyntaxException() throws IOException {
        fromJson(TypeAdapters.CHARACTER, "\"multiple\"");
    }

    @Test
    public void stringAdapter_givenValues_shouldSerializeAndDeserialize() throws IOException {
        Assert.assertEquals("\"hello\"", toJson(TypeAdapters.STRING, "hello"));
        Assert.assertEquals("hello", fromJson(TypeAdapters.STRING, "\"hello\""));
        Assert.assertEquals("true", fromJson(TypeAdapters.STRING, "true"));
        Assert.assertNull(fromJson(TypeAdapters.STRING, "null"));
    }

    @Test
    public void bigDecimalAdapter_givenValues_shouldSerializeAndDeserialize() throws IOException {
        BigDecimal bigDecimal = new BigDecimal("123456789.987654321");
        Assert.assertEquals("123456789.987654321", toJson(TypeAdapters.BIG_DECIMAL, bigDecimal));
        Assert.assertEquals(bigDecimal, fromJson(TypeAdapters.BIG_DECIMAL, "\"123456789.987654321\""));
        Assert.assertNull(fromJson(TypeAdapters.BIG_DECIMAL, "null"));
    }

    @Test(expected = JsonSyntaxException.class)
    public void bigDecimalAdapter_givenInvalidString_shouldThrowJsonSyntaxException() throws IOException {
        fromJson(TypeAdapters.BIG_DECIMAL, "\"invalid-decimal\"");
    }

    @Test
    public void bigIntegerAdapter_givenValues_shouldSerializeAndDeserialize() throws IOException {
        BigInteger bigInteger = new BigInteger("12345678901234567890");
        Assert.assertEquals("12345678901234567890", toJson(TypeAdapters.BIG_INTEGER, bigInteger));
        Assert.assertEquals(bigInteger, fromJson(TypeAdapters.BIG_INTEGER, "\"12345678901234567890\""));
        Assert.assertNull(fromJson(TypeAdapters.BIG_INTEGER, "null"));
    }

    @Test(expected = JsonSyntaxException.class)
    public void bigIntegerAdapter_givenInvalidString_shouldThrowJsonSyntaxException() throws IOException {
        fromJson(TypeAdapters.BIG_INTEGER, "\"invalid-int\"");
    }

    @Test
    public void stringBuilderAdapter_givenValues_shouldSerializeAndDeserialize() throws IOException {
        Assert.assertEquals("\"test\"", toJson(TypeAdapters.STRING_BUILDER, new StringBuilder("test")));
        Assert.assertEquals("null", toJson(TypeAdapters.STRING_BUILDER, null));
        StringBuilder sb = fromJson(TypeAdapters.STRING_BUILDER, "\"test\"");
        Assert.assertEquals("test", sb.toString());
        Assert.assertNull(fromJson(TypeAdapters.STRING_BUILDER, "null"));
    }

    @Test
    public void stringBufferAdapter_givenValues_shouldSerializeAndDeserialize() throws IOException {
        Assert.assertEquals("\"buffer\"", toJson(TypeAdapters.STRING_BUFFER, new StringBuffer("buffer")));
        Assert.assertEquals("null", toJson(TypeAdapters.STRING_BUFFER, null));
        StringBuffer sb = fromJson(TypeAdapters.STRING_BUFFER, "\"buffer\"");
        Assert.assertEquals("buffer", sb.toString());
        Assert.assertNull(fromJson(TypeAdapters.STRING_BUFFER, "null"));
    }

    @Test
    public void urlAdapter_givenValues_shouldSerializeAndDeserialize() throws IOException {
        URL url = new URL("http://example.com");
        Assert.assertEquals("\"http://example.com\"", toJson(TypeAdapters.URL, url));
        Assert.assertEquals("null", toJson(TypeAdapters.URL, null));
        Assert.assertEquals(url, fromJson(TypeAdapters.URL, "\"http://example.com\""));
        Assert.assertNull(fromJson(TypeAdapters.URL, "\"null\""));
        Assert.assertNull(fromJson(TypeAdapters.URL, "null"));
    }

    @Test
    public void uriAdapter_givenValues_shouldSerializeAndDeserialize() throws IOException {
        URI uri = URI.create("http://example.com");
        Assert.assertEquals("\"http://example.com\"", toJson(TypeAdapters.URI, uri));
        Assert.assertEquals("null", toJson(TypeAdapters.URI, null));
        Assert.assertEquals(uri, fromJson(TypeAdapters.URI, "\"http://example.com\""));
        Assert.assertNull(fromJson(TypeAdapters.URI, "\"null\""));
        Assert.assertNull(fromJson(TypeAdapters.URI, "null"));
    }

    @Test(expected = JsonIOException.class)
    public void uriAdapter_givenInvalidUriSyntax_shouldThrowJsonIOException() throws IOException {
        fromJson(TypeAdapters.URI, "\":\"");
    }

    @Test
    public void inetAddressAdapter_givenValues_shouldSerializeAndDeserialize() throws IOException {
        InetAddress address = InetAddress.getByName("127.0.0.1");
        Assert.assertEquals("\"127.0.0.1\"", toJson(TypeAdapters.INET_ADDRESS, address));
        Assert.assertEquals("null", toJson(TypeAdapters.INET_ADDRESS, null));
        Assert.assertEquals(address, fromJson(TypeAdapters.INET_ADDRESS, "\"127.0.0.1\""));
        Assert.assertNull(fromJson(TypeAdapters.INET_ADDRESS, "null"));
    }

    @Test
    public void uuidAdapter_givenValues_shouldSerializeAndDeserialize() throws IOException {
        UUID uuid = UUID.randomUUID();
        Assert.assertEquals("\"" + uuid.toString() + "\"", toJson(TypeAdapters.UUID, uuid));
        Assert.assertEquals("null", toJson(TypeAdapters.UUID, null));
        Assert.assertEquals(uuid, fromJson(TypeAdapters.UUID, "\"" + uuid.toString() + "\""));
        Assert.assertNull(fromJson(TypeAdapters.UUID, "null"));
    }

    @Test
    public void timestampFactory_givenTimestampType_shouldCreateAdapterAndSerializeDeserialize() throws IOException {
        Gson gson = new Gson();
        TypeAdapter<Timestamp> adapter = TypeAdapters.TIMESTAMP_FACTORY.create(gson, TypeToken.get(Timestamp.class));
        Assert.assertNotNull(adapter);

        long currentTime = 1600000000000L;
        Timestamp timestamp = new Timestamp(currentTime);
        Date date = new Date(currentTime);

        TypeAdapter<Date> dateAdapter = gson.getAdapter(Date.class);
        String expectedJson = toJson(dateAdapter, date);

        String actualJson = toJson(adapter, timestamp);
        Assert.assertEquals(expectedJson, actualJson);

        Timestamp readTimestamp = fromJson(adapter, actualJson);
        Assert.assertEquals(date.getTime(), readTimestamp.getTime());

        Assert.assertNull(fromJson(adapter, "null"));

        TypeAdapter<String> nonMatchingAdapter = TypeAdapters.TIMESTAMP_FACTORY.create(gson, TypeToken.get(String.class));
        Assert.assertNull(nonMatchingAdapter);
    }

    @Test
    public void calendarAdapter_givenValues_shouldSerializeAndDeserialize() throws IOException {
        Calendar calendar = new GregorianCalendar(2023, Calendar.MARCH, 15, 10, 20, 30);
        String json = toJson(TypeAdapters.CALENDAR, calendar);
        Assert.assertTrue(json.contains("\"year\":2023"));
        Assert.assertTrue(json.contains("\"month\":" + Calendar.MARCH));
        Assert.assertTrue(json.contains("\"dayOfMonth\":15"));
        Assert.assertTrue(json.contains("\"hourOfDay\":10"));
        Assert.assertTrue(json.contains("\"minute\":20"));
        Assert.assertTrue(json.contains("\"second\":30"));

        Calendar readCalendar = fromJson(TypeAdapters.CALENDAR, json);
        Assert.assertEquals(2023, readCalendar.get(Calendar.YEAR));
        Assert.assertEquals(Calendar.MARCH, readCalendar.get(Calendar.MONTH));
        Assert.assertEquals(15, readCalendar.get(Calendar.DAY_OF_MONTH));
        Assert.assertEquals(10, readCalendar.get(Calendar.HOUR_OF_DAY));
        Assert.assertEquals(20, readCalendar.get(Calendar.MINUTE));
        Assert.assertEquals(30, readCalendar.get(Calendar.SECOND));

        Assert.assertEquals("null", toJson(TypeAdapters.CALENDAR, null));
        Assert.assertNull(fromJson(TypeAdapters.CALENDAR, "null"));
    }

    @Test
    public void localeAdapter_givenValues_shouldSerializeAndDeserialize() throws IOException {
        Locale localeLangOnly = new Locale("th");
        Locale localeLangCountry = new Locale("th", "TH");
        Locale localeFull = new Locale("th", "TH", "traditional");

        Assert.assertEquals("\"th\"", toJson(TypeAdapters.LOCALE, localeLangOnly));
        Assert.assertEquals("\"th_TH\"", toJson(TypeAdapters.LOCALE, localeLangCountry));
        Assert.assertEquals("\"th_TH_traditional\"", toJson(TypeAdapters.LOCALE, localeFull));
        Assert.assertEquals("null", toJson(TypeAdapters.LOCALE, null));

        Assert.assertEquals(localeLangOnly, fromJson(TypeAdapters.LOCALE, "\"th\""));
        Assert.assertEquals(localeLangCountry, fromJson(TypeAdapters.LOCALE, "\"th_TH\""));
        Assert.assertEquals(localeFull, fromJson(TypeAdapters.LOCALE, "\"th_TH_traditional\""));
        Assert.assertNull(fromJson(TypeAdapters.LOCALE, "null"));
    }

    @Test
    public void jsonElementAdapter_givenPrimitiveAndCompositeValues_shouldSerializeAndDeserialize() throws IOException {
        Assert.assertEquals("null", toJson(TypeAdapters.JSON_ELEMENT, null));
        Assert.assertEquals("null", toJson(TypeAdapters.JSON_ELEMENT, JsonNull.INSTANCE));
        Assert.assertEquals(JsonNull.INSTANCE, fromJson(TypeAdapters.JSON_ELEMENT, "null"));

        JsonPrimitive primitiveStr = new JsonPrimitive("text");
        Assert.assertEquals("\"text\"", toJson(TypeAdapters.JSON_ELEMENT, primitiveStr));
        Assert.assertEquals(primitiveStr, fromJson(TypeAdapters.JSON_ELEMENT, "\"text\""));

        JsonPrimitive primitiveNum = new JsonPrimitive(Integer.valueOf(123));
        Assert.assertEquals("123", toJson(TypeAdapters.JSON_ELEMENT, primitiveNum));
        Assert.assertEquals(primitiveNum, fromJson(TypeAdapters.JSON_ELEMENT, "123"));

        JsonPrimitive primitiveBool = new JsonPrimitive(Boolean.TRUE);
        Assert.assertEquals("true", toJson(TypeAdapters.JSON_ELEMENT, primitiveBool));
        Assert.assertEquals(primitiveBool, fromJson(TypeAdapters.JSON_ELEMENT, "true"));

        JsonArray array = new JsonArray();
        array.add(new JsonPrimitive(1));
        array.add(new JsonPrimitive("a"));
        Assert.assertEquals("[1,\"a\"]", toJson(TypeAdapters.JSON_ELEMENT, array));
        Assert.assertEquals(array, fromJson(TypeAdapters.JSON_ELEMENT, "[1,\"a\"]"));

        JsonObject object = new JsonObject();
        object.addProperty("key", "value");
        Assert.assertEquals("{\"key\":\"value\"}", toJson(TypeAdapters.JSON_ELEMENT, object));
        Assert.assertEquals(object, fromJson(TypeAdapters.JSON_ELEMENT, "{\"key\":\"value\"}"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void jsonElementAdapter_givenUnknownJsonElementOnWrite_shouldThrowIllegalArgumentException() throws IOException {
        toJson(TypeAdapters.JSON_ELEMENT, new CustomJsonElement());
    }

    @Test(expected = IllegalArgumentException.class)
    public void jsonElementAdapter_givenPrematureEndOfDocumentOnRead_shouldThrowIllegalArgumentException() throws IOException {
        fromJson(TypeAdapters.JSON_ELEMENT, "");
    }

    @Test
    public void enumAdapter_givenEnumAndAlternates_shouldSerializeAndDeserialize() throws IOException {
        Gson gson = new Gson();
        TypeAdapter<TestSampleEnum> adapter = TypeAdapters.ENUM_FACTORY.create(gson, TypeToken.get(TestSampleEnum.class));
        Assert.assertNotNull(adapter);

        Assert.assertEquals("\"FIRST\"", toJson(adapter, TestSampleEnum.FIRST));
        Assert.assertEquals("\"SECOND\"", toJson(adapter, TestSampleEnum.SECOND));
        Assert.assertEquals("\"THIRD\"", toJson(adapter, TestSampleEnum.THIRD));
        Assert.assertEquals("null", toJson(adapter, null));

        Assert.assertEquals(TestSampleEnum.FIRST, fromJson(adapter, "\"FIRST\""));
        Assert.assertEquals(TestSampleEnum.FIRST, fromJson(adapter, "\"first_alt\""));
        Assert.assertEquals(TestSampleEnum.FIRST, fromJson(adapter, "\"1st\""));
        Assert.assertEquals(TestSampleEnum.SECOND, fromJson(adapter, "\"SECOND\""));
        Assert.assertEquals(TestSampleEnum.THIRD, fromJson(adapter, "\"THIRD\""));
        Assert.assertNull(fromJson(adapter, "null"));
    }

    @Test
    public void enumAdapter_givenEnumSubClass_shouldResolveParentEnumType() throws IOException {
        Gson gson = new Gson();
        TypeAdapter<TestCustomSubEnum> adapter = TypeAdapters.ENUM_FACTORY.create(
                gson,
                TypeToken.get(TestCustomSubEnum.VALUE_A.getClass())
        );
        Assert.assertNotNull(adapter);

        Assert.assertEquals("\"VALUE_A\"", toJson(adapter, TestCustomSubEnum.VALUE_A));
        Assert.assertEquals(TestCustomSubEnum.VALUE_A, fromJson(adapter, "\"VALUE_A\""));
    }

    @Test
    public void enumFactory_givenNonEnumType_shouldReturnNull() {
        Gson gson = new Gson();
        TypeAdapter<String> adapter = TypeAdapters.ENUM_FACTORY.create(gson, TypeToken.get(String.class));
        Assert.assertNull(adapter);

        @SuppressWarnings("rawtypes")
        TypeAdapter<Enum> rawEnumAdapter = TypeAdapters.ENUM_FACTORY.create(gson, TypeToken.get(Enum.class));
        Assert.assertNull(rawEnumAdapter);
    }

    @Test
    public void factoryHelper_newFactoryWithTypeToken_shouldCreateMatchingFactory() {
        TypeToken<String> token = TypeToken.get(String.class);
        TypeAdapterFactory factory = TypeAdapters.newFactory(token, TypeAdapters.STRING);
        Gson gson = new Gson();

        Assert.assertNotNull(factory.create(gson, token));
        Assert.assertNull(factory.create(gson, TypeToken.get(Integer.class)));
    }

    @Test
    public void factoryHelper_newFactoryWithClass_shouldCreateMatchingFactoryAndToString() {
        TypeAdapterFactory factory = TypeAdapters.newFactory(String.class, TypeAdapters.STRING);
        Gson gson = new Gson();

        Assert.assertNotNull(factory.create(gson, TypeToken.get(String.class)));
        Assert.assertNull(factory.create(gson, TypeToken.get(Integer.class)));
        Assert.assertTrue(factory.toString().contains("Factory[type=java.lang.String,adapter="));
    }

    @Test
    public void factoryHelper_newFactoryWithUnboxedAndBoxed_shouldMatchBothAndToString() {
        TypeAdapterFactory factory = TypeAdapters.newFactory(int.class, Integer.class, TypeAdapters.INTEGER);
        Gson gson = new Gson();

        Assert.assertNotNull(factory.create(gson, TypeToken.get(int.class)));
        Assert.assertNotNull(factory.create(gson, TypeToken.get(Integer.class)));
        Assert.assertNull(factory.create(gson, TypeToken.get(String.class)));
        Assert.assertTrue(factory.toString().contains("Factory[type=java.lang.Integer+int,adapter="));
    }

    @Test
    public void factoryHelper_newFactoryForMultipleTypes_shouldMatchBaseAndSubTypesAndToString() {
        TypeAdapterFactory factory = TypeAdapters.newFactoryForMultipleTypes(Calendar.class, GregorianCalendar.class, TypeAdapters.CALENDAR);
        Gson gson = new Gson();

        Assert.assertNotNull(factory.create(gson, TypeToken.get(Calendar.class)));
        Assert.assertNotNull(factory.create(gson, TypeToken.get(GregorianCalendar.class)));
        Assert.assertNull(factory.create(gson, TypeToken.get(String.class)));
        Assert.assertTrue(factory.toString().contains("Factory[type=java.util.Calendar+java.util.GregorianCalendar,adapter="));
    }

    @Test
    public void factoryHelper_newTypeHierarchyFactory_shouldMatchSubclassesAndToString() {
        TypeAdapterFactory factory = TypeAdapters.newTypeHierarchyFactory(InetAddress.class, TypeAdapters.INET_ADDRESS);
        Gson gson = new Gson();

        Assert.assertNotNull(factory.create(gson, TypeToken.get(InetAddress.class)));
        Assert.assertNull(factory.create(gson, TypeToken.get(String.class)));
        Assert.assertTrue(factory.toString().contains("Factory[typeHierarchy=java.net.InetAddress,adapter="));
    }

    @Test
    public void preconfiguredFactories_givenMatchingTypes_shouldProvideNonNullAdapters() {
        Gson gson = new Gson();

        Assert.assertNotNull(TypeAdapters.CLASS_FACTORY.create(gson, TypeToken.get(Class.class)));
        Assert.assertNotNull(TypeAdapters.BIT_SET_FACTORY.create(gson, TypeToken.get(BitSet.class)));
        Assert.assertNotNull(TypeAdapters.BOOLEAN_FACTORY.create(gson, TypeToken.get(boolean.class)));
        Assert.assertNotNull(TypeAdapters.BOOLEAN_FACTORY.create(gson, TypeToken.get(Boolean.class)));
        Assert.assertNotNull(TypeAdapters.BYTE_FACTORY.create(gson, TypeToken.get(byte.class)));
        Assert.assertNotNull(TypeAdapters.BYTE_FACTORY.create(gson, TypeToken.get(Byte.class)));
        Assert.assertNotNull(TypeAdapters.SHORT_FACTORY.create(gson, TypeToken.get(short.class)));
        Assert.assertNotNull(TypeAdapters.SHORT_FACTORY.create(gson, TypeToken.get(Short.class)));
        Assert.assertNotNull(TypeAdapters.INTEGER_FACTORY.create(gson, TypeToken.get(int.class)));
        Assert.assertNotNull(TypeAdapters.INTEGER_FACTORY.create(gson, TypeToken.get(Integer.class)));
        Assert.assertNotNull(TypeAdapters.NUMBER_FACTORY.create(gson, TypeToken.get(Number.class)));
        Assert.assertNotNull(TypeAdapters.CHARACTER_FACTORY.create(gson, TypeToken.get(char.class)));
        Assert.assertNotNull(TypeAdapters.CHARACTER_FACTORY.create(gson, TypeToken.get(Character.class)));
        Assert.assertNotNull(TypeAdapters.STRING_FACTORY.create(gson, TypeToken.get(String.class)));
        Assert.assertNotNull(TypeAdapters.STRING_BUILDER_FACTORY.create(gson, TypeToken.get(StringBuilder.class)));
        Assert.assertNotNull(TypeAdapters.STRING_BUFFER_FACTORY.create(gson, TypeToken.get(StringBuffer.class)));
        Assert.assertNotNull(TypeAdapters.URL_FACTORY.create(gson, TypeToken.get(URL.class)));
        Assert.assertNotNull(TypeAdapters.URI_FACTORY.create(gson, TypeToken.get(URI.class)));
        Assert.assertNotNull(TypeAdapters.INET_ADDRESS_FACTORY.create(gson, TypeToken.get(InetAddress.class)));
        Assert.assertNotNull(TypeAdapters.UUID_FACTORY.create(gson, TypeToken.get(UUID.class)));
        Assert.assertNotNull(TypeAdapters.CALENDAR_FACTORY.create(gson, TypeToken.get(Calendar.class)));
        Assert.assertNotNull(TypeAdapters.CALENDAR_FACTORY.create(gson, TypeToken.get(GregorianCalendar.class)));
        Assert.assertNotNull(TypeAdapters.LOCALE_FACTORY.create(gson, TypeToken.get(Locale.class)));
        Assert.assertNotNull(TypeAdapters.JSON_ELEMENT_FACTORY.create(gson, TypeToken.get(JsonElement.class)));
    }
}