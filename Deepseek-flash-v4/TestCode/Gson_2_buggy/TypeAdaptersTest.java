package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.internal.LazilyParsedNumber;
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
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TypeAdaptersTest {
    private JsonWriter writer;
    private StringWriter stringWriter;

    @Before
    public void setUp() throws Exception {
        stringWriter = new StringWriter();
        writer = new JsonWriter(stringWriter);
    }

    @After
    public void tearDown() throws Exception {
        writer.close();
    }

    @Test
    public void testClassAdapterWriteNull() throws IOException {
        TypeAdapters.CLASS.write(writer, null);
        writer.flush();
        assertEquals("null", stringWriter.toString());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testClassAdapterWriteNonNull() throws IOException {
        TypeAdapters.CLASS.write(writer, String.class);
    }

    @Test
    public void testClassAdapterReadNull() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("null"));
        reader.setLenient(true);
        assertEquals(null, TypeAdapters.CLASS.read(reader));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testClassAdapterReadNonNull() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"java.lang.String\""));
        reader.setLenient(true);
        TypeAdapters.CLASS.read(reader);
    }

    @Test
    public void testBitSetReadNumber() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("[1,0,1,0]"));
        reader.setLenient(true);
        BitSet bitset = TypeAdapters.BIT_SET.read(reader);
        assertEquals(4, bitset.length());
        assertTrue(bitset.get(0));
        assertFalse(bitset.get(1));
    }

    @Test
    public void testBitSetReadBoolean() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("[true,false,true]"));
        reader.setLenient(true);
        BitSet bitset = TypeAdapters.BIT_SET.read(reader);
        assertEquals(3, bitset.length());
        assertTrue(bitset.get(0));
        assertFalse(bitset.get(1));
    }

    @Test
    public void testBitSetReadString() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("[\"1\",\"0\",\"1\"]"));
        reader.setLenient(true);
        BitSet bitset = TypeAdapters.BIT_SET.read(reader);
        assertEquals(3, bitset.length());
        assertTrue(bitset.get(0));
        assertTrue(bitset.get(2));
    }

    @Test(expected = com.google.gson.JsonSyntaxException.class)
    public void testBitSetReadInvalidString() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("[\"abc\"]"));
        reader.setLenient(true);
        TypeAdapters.BIT_SET.read(reader);
    }

    @Test
    public void testBitSetReadInvalidType() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("[null]"));
        reader.setLenient(true);
        try {
            TypeAdapters.BIT_SET.read(reader);
            fail("Expected JsonSyntaxException");
        } catch (com.google.gson.JsonSyntaxException e) {
            // expected
        }
    }

    @Test
    public void testBitSetWriteNull() throws IOException {
        TypeAdapters.BIT_SET.write(writer, null);
        writer.flush();
        assertEquals("null", stringWriter.toString());
    }

    @Test
    public void testBitSetWriteNonNull() throws IOException {
        BitSet bitset = new BitSet();
        bitset.set(0);
        bitset.set(2);
        TypeAdapters.BIT_SET.write(writer, bitset);
        writer.flush();
        assertEquals("[1,0,1]", stringWriter.toString());
    }

    @Test
    public void testBooleanAdapter() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("true"));
        reader.setLenient(true);
        assertEquals(Boolean.TRUE, TypeAdapters.BOOLEAN.read(reader));
        
        reader = new JsonReader(new StringReader("false"));
        reader.setLenient(true);
        assertEquals(Boolean.FALSE, TypeAdapters.BOOLEAN.read(reader));
    }

    @Test
    public void testBooleanAdapterString() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"true\""));
        reader.setLenient(true);
        assertEquals(Boolean.TRUE, TypeAdapters.BOOLEAN.read(reader));
    }

    @Test
    public void testBooleanAsString() throws IOException {
        TypeAdapters.BOOLEAN_AS_STRING.write(writer, true);
        assertEquals("\"true\"", stringWriter.toString());
    }

    @Test
    public void testByteAdapter() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("10"));
        reader.setLenient(true);
        assertEquals(Byte.valueOf((byte) 10), TypeAdapters.BYTE.read(reader));
    }

    @Test(expected = NumberFormatException.class)
    public void testByteAdapterOverflow() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("200"));
        reader.setLenient(true);
        TypeAdapters.BYTE.read(reader);
    }

    @Test
    public void testShortAdapter() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("1000"));
        reader.setLenient(true);
        assertEquals(Short.valueOf((short) 1000), TypeAdapters.SHORT.read(reader));
    }

    @Test
    public void testIntegerAdapter() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("100000"));
        reader.setLenient(true);
        assertEquals(Integer.valueOf(100000), TypeAdapters.INTEGER.read(reader));
    }

    @Test
    public void testLongAdapter() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("10000000000"));
        reader.setLenient(true);
        assertEquals(Long.valueOf(10000000000L), TypeAdapters.LONG.read(reader));
    }

    @Test
    public void testFloatAdapter() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("1.5"));
        reader.setLenient(true);
        assertEquals(Float.valueOf(1.5f), TypeAdapters.FLOAT.read(reader));
    }

    @Test
    public void testFloatAdapterNull() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("null"));
        reader.setLenient(true);
        assertEquals(null, TypeAdapters.FLOAT.read(reader));
    }

    @Test
    public void testNumberAdapter() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("123.5"));
        reader.setLenient(true);
        Number num = TypeAdapters.NUMBER.read(reader);
        assertTrue(num instanceof LazilyParsedNumber);
    }

    @Test
    public void testCharacterAdapter() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"a\""));
        reader.setLenient(true);
        assertEquals(Character.valueOf('a'), TypeAdapters.CHARACTER.read(reader));
    }

    @Test(expected = com.google.gson.JsonSyntaxException.class)
    public void testCharacterAdapterInvalid() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"ab\""));
        reader.setLenient(true);
        TypeAdapters.CHARACTER.read(reader);
    }

    @Test
    public void testCharacterWrite() throws IOException {
        TypeAdapters.CHARACTER.write(writer, 'x');
        writer.flush();
        assertEquals("\"x\"", stringWriter.toString());
    }

    @Test
    public void testStringAdapter() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"hello\""));
        reader.setLenient(true);
        assertEquals("hello", TypeAdapters.STRING.read(reader));
    }

    @Test
    public void testStringAdapterNull() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("null"));
        reader.setLenient(true);
        assertEquals(null, TypeAdapters.STRING.read(reader));
    }

    @Test
    public void testStringAdapterBoolean() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("true"));
        reader.setLenient(true);
        assertEquals("true", TypeAdapters.STRING.read(reader));
    }

    @Test
    public void testBigDecimalAdapter() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("123.45"));
        reader.setLenient(true);
        assertEquals(new BigDecimal("123.45"), TypeAdapters.BIG_DECIMAL.read(reader));
    }

    @Test
    public void testBigIntegerAdapter() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("12345678901234567890"));
        reader.setLenient(true);
        assertEquals(new BigInteger("12345678901234567890"), TypeAdapters.BIG_INTEGER.read(reader));
    }

    @Test
    public void testStringBuilderAdapter() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"test\""));
        reader.setLenient(true);
        assertEquals("test", TypeAdapters.STRING_BUILDER.read(reader).toString());
    }

    @Test
    public void testStringBufferAdapter() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"test\""));
        reader.setLenient(true);
        assertEquals("test", TypeAdapters.STRING_BUFFER.read(reader).toString());
    }

    @Test
    public void testUrlAdapter() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"http://example.com\""));
        reader.setLenient(true);
        assertEquals(new URL("http://example.com"), TypeAdapters.URL.read(reader));
    }

    @Test
    public void testUrlAdapterNull() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("null"));
        reader.setLenient(true);
        assertEquals(null, TypeAdapters.URL.read(reader));
    }

    @Test
    public void testUriAdapter() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"https://example.com/path\""));
        reader.setLenient(true);
        assertEquals(new URI("https://example.com/path"), TypeAdapters.URI.read(reader));
    }

    @Test(expected = com.google.gson.JsonSyntaxException.class)
    public void testUriAdapterInvalid() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"invalid uri\""));
        reader.setLenient(true);
        TypeAdapters.URI.read(reader);
    }

    @Test
    public void testInetAddressAdapter() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"127.0.0.1\""));
        reader.setLenient(true);
        assertEquals(InetAddress.getByName("127.0.0.1"), TypeAdapters.INET_ADDRESS.read(reader));
    }

    @Test
    public void testUuidAdapter() throws IOException {
        String uuidStr = "123e4567-e89b-12d3-a456-426614174000";
        JsonReader reader = new JsonReader(new StringReader("\"" + uuidStr + "\""));
        reader.setLenient(true);
        assertEquals(UUID.fromString(uuidStr), TypeAdapters.UUID.read(reader));
    }

    @Test
    public void testLocaleAdapter() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"en_US\""));
        reader.setLenient(true);
        assertEquals(Locale.US, TypeAdapters.LOCALE.read(reader));
    }

    @Test
    public void testLocaleAdapterLanguageOnly() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"en\""));
        reader.setLenient(true);
        assertEquals(new Locale("en"), TypeAdapters.LOCALE.read(reader));
    }

    @Test
    public void testLocaleAdapterLanguageCountry() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"en_US\""));
        reader.setLenient(true);
        assertEquals(new Locale("en", "US"), TypeAdapters.LOCALE.read(reader));
    }

    @Test
    public void testLocaleWrite() throws IOException {
        TypeAdapters.LOCALE.write(writer, Locale.US);
        writer.flush();
        assertEquals("\"en_US\"", stringWriter.toString());
    }

    @Test
    public void testJsonElementRead() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"test\""));
        reader.setLenient(true);
        assertEquals(new JsonPrimitive("test"), TypeAdapters.JSON_ELEMENT.read(reader));
    }

    @Test
    public void testJsonElementReadNumber() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("123"));
        reader.setLenient(true);
        JsonElement element = TypeAdapters.JSON_ELEMENT.read(reader);
        assertTrue(element.isJsonPrimitive());
        assertTrue(element.getAsJsonPrimitive().isNumber());
    }

    @Test
    public void testJsonElementReadBoolean() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("true"));
        reader.setLenient(true);
        JsonElement element = TypeAdapters.JSON_ELEMENT.read(reader);
        assertTrue(element.isJsonPrimitive());
        assertTrue(element.getAsJsonPrimitive().isBoolean());
    }

    @Test
    public void testJsonElementReadNull() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("null"));
        reader.setLenient(true);
        assertEquals(JsonNull.INSTANCE, TypeAdapters.JSON_ELEMENT.read(reader));
    }

    @Test
    public void testJsonElementReadArray() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("[1,2,3]"));
        reader.setLenient(true);
        JsonElement element = TypeAdapters.JSON_ELEMENT.read(reader);
        assertTrue(element.isJsonArray());
        assertEquals(3, element.getAsJsonArray().size());
    }

    @Test
    public void testJsonElementReadObject() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("{\"key\":\"value\"}"));
        reader.setLenient(true);
        JsonElement element = TypeAdapters.JSON_ELEMENT.read(reader);
        assertTrue(element.isJsonObject());
        assertEquals("value", element.getAsJsonObject().get("key").getAsString());
    }

    @Test(expected = com.google.gson.JsonSyntaxException.class)
    public void testJsonElementReadInvalid() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("invalid"));
        reader.setLenient(false);
        TypeAdapters.JSON_ELEMENT.read(reader);
    }

    @Test
    public void testJsonElementWriteNull() throws IOException {
        TypeAdapters.JSON_ELEMENT.write(writer, null);
        writer.flush();
        assertEquals("null", stringWriter.toString());
    }

    @Test
    public void testJsonElementWritePrimitiveNumber() throws IOException {
        TypeAdapters.JSON_ELEMENT.write(writer, new JsonPrimitive(123));
        writer.flush();
        assertEquals("123", stringWriter.toString());
    }

    @Test
    public void testJsonElementWritePrimitiveBoolean() throws IOException {
        TypeAdapters.JSON_ELEMENT.write(writer, new JsonPrimitive(true));
        writer.flush();
        assertEquals("true", stringWriter.toString());
    }

    @Test
    public void testJsonElementWritePrimitiveString() throws IOException {
        TypeAdapters.JSON_ELEMENT.write(writer, new JsonPrimitive("test"));
        writer.flush();
        assertEquals("\"test\"", stringWriter.toString());
    }

    @Test
    public void testJsonElementWriteArray() throws IOException {
        JsonArray array = new JsonArray();
        array.add(1);
        array.add("two");
        array.add(true);
        TypeAdapters.JSON_ELEMENT.write(writer, array);
        writer.flush();
        assertEquals("[1,\"two\",true]", stringWriter.toString());
    }

    @Test
    public void testJsonElementWriteObject() throws IOException {
        JsonObject object = new JsonObject();
        object.addProperty("key", "value");
        TypeAdapters.JSON_ELEMENT.write(writer, object);
        writer.flush();
        assertEquals("{\"key\":\"value\"}", stringWriter.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testJsonElementWriteInvalid() throws IOException {
        TypeAdapters.JSON_ELEMENT.write(writer, new JsonElement() {
            @Override
            public JsonElement deepCopy() { return this; }
        });
    }

    @Test
    public void testEnumAdapter() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"VALUE1\""));
        reader.setLenient(true);
        TypeAdapter<TestEnum> adapter = new TypeAdapters.EnumTypeAdapter<TestEnum>(TestEnum.class);
        assertEquals(TestEnum.VALUE1, adapter.read(reader));
    }

    @Test
    public void testEnumAdapterSerializedName() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"value2_serialized\""));
        reader.setLenient(true);
        TypeAdapter<TestEnum> adapter = new TypeAdapters.EnumTypeAdapter<TestEnum>(TestEnum.class);
        assertEquals(TestEnum.VALUE2, adapter.read(reader));
    }

    @Test
    public void testEnumWrite() throws IOException {
        TypeAdapter<TestEnum> adapter = new TypeAdapters.EnumTypeAdapter<TestEnum>(TestEnum.class);
        adapter.write(writer, TestEnum.VALUE1);
        writer.flush();
        assertEquals("\"VALUE1\"", stringWriter.toString());
    }

    @Test
    public void testEnumWriteSerializedName() throws IOException {
        TypeAdapter<TestEnum> adapter = new TypeAdapters.EnumTypeAdapter<TestEnum>(TestEnum.class);
        adapter.write(writer, TestEnum.VALUE2);
        writer.flush();
        assertEquals("\"value2_serialized\"", stringWriter.toString());
    }

    @Test
    public void testNewFactory() {
        TypeAdapterFactory factory = TypeAdapters.newFactory(TestEnum.class, new TypeAdapter<TestEnum>() {
            @Override
            public void write(JsonWriter out, TestEnum value) throws IOException {}
            @Override
            public TestEnum read(JsonReader in) throws IOException { return TestEnum.VALUE1; }
        });
        assertNotNull(factory);
        assertEquals("Factory[type=class " + TestEnum.class.getName() + ",adapter=" + factory + "]", factory.toString());
    }

    @Test
    public void testNewFactoryMultipleTypes() {
        TypeAdapterFactory factory = TypeAdapters.newFactoryForMultipleTypes(TestEnum.class, TestEnum.class, new TypeAdapter<TestEnum>() {
            @Override
            public void write(JsonWriter out, TestEnum value) throws IOException {}
            @Override
            public TestEnum read(JsonReader in) throws IOException { return TestEnum.VALUE1; }
        });
        assertNotNull(factory);
    }

    @Test
    public void testClassFactory() {
        assertNotNull(TypeAdapters.CLASS_FACTORY);
    }

    @Test
    public void testBitSetFactory() {
        assertNotNull(TypeAdapters.BIT_SET_FACTORY);
    }

    @Test
    public void testBooleanFactory() {
        assertNotNull(TypeAdapters.BOOLEAN_FACTORY);
    }

    @Test
    public void testByteFactory() {
        assertNotNull(TypeAdapters.BYTE_FACTORY);
    }

    @Test
    public void testShortFactory() {
        assertNotNull(TypeAdapters.SHORT_FACTORY);
    }

    @Test
    public void testIntegerFactory() {
        assertNotNull(TypeAdapters.INTEGER_FACTORY);
    }

    @Test
    public void testLongFactory() {
        assertNotNull(TypeAdapters.LONG_FACTORY);
    }

    @Test
    public void testFloatFactory() {
        assertNotNull(TypeAdapters.FLOAT_FACTORY);
    }

    @Test
    public void testNumberFactory() {
        assertNotNull(TypeAdapters.NUMBER_FACTORY);
    }

    @Test
    public void testCharacterFactory() {
        assertNotNull(TypeAdapters.CHARACTER_FACTORY);
    }

    @Test
    public void testStringFactory() {
        assertNotNull(TypeAdapters.STRING_FACTORY);
    }

    @Test
    public void testUrlFactory() {
        assertNotNull(TypeAdapters.URL_FACTORY);
    }

    @Test
    public void testUriFactory() {
        assertNotNull(TypeAdapters.URI_FACTORY);
    }

    @Test
    public void testUuidFactory() {
        assertNotNull(TypeAdapters.UUID_FACTORY);
    }

    @Test
    public void testLocaleFactory() {
        assertNotNull(TypeAdapters.LOCALE_FACTORY);
    }

    @Test
    public void testTimestampFactory() throws IOException {
        TypeAdapterFactory factory = TypeAdapters.TIMESTAMP_FACTORY;
        assertNotNull(factory);
    }

    @Test
    public void testTimestampRead() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("\"2023-01-01T00:00:00.000Z\""));
        reader.setLenient(true);
        Gson gson = new Gson();
        TypeAdapter<Timestamp> adapter = (TypeAdapter<Timestamp>) TypeAdapters.TIMESTAMP_FACTORY.create(gson, TypeToken.get(Timestamp.class));
        assertNull(adapter.read(reader));
    }

    @Test
    public void testCalendarFactory() throws IOException {
        TypeAdapterFactory factory = TypeAdapters.CALENDAR_FACTORY;
        assertNotNull(factory);
    }

    @Test
    public void testCalendarWrite() throws IOException {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        calendar.set(2023, 0, 15, 12, 30, 45);
        TypeAdapters.CALENDAR.write(writer, calendar);
        writer.flush();
        String json = stringWriter.toString();
        assertTrue(json.contains("\"year\":2023"));
        assertTrue(json.contains("\"month\":0"));
    }

    @Test
    public void testCalendarRead() throws IOException {
        String json = "{\"year\":2023,\"month\":0,\"dayOfMonth\":15,\"hourOfDay\":12,\"minute\":30,\"second\":45}";
        JsonReader reader = new JsonReader(new StringReader(json));
        reader.setLenient(true);
        Calendar calendar = TypeAdapters.CALENDAR.read(reader);
        assertEquals(2023, calendar.get(Calendar.YEAR));
        assertEquals(0, calendar.get(Calendar.MONTH));
        assertEquals(15, calendar.get(Calendar.DAY_OF_MONTH));
        assertEquals(12, calendar.get(Calendar.HOUR_OF_DAY));
        assertEquals(30, calendar.get(Calendar.MINUTE));
        assertEquals(45, calendar.get(Calendar.SECOND));
    }

    @Test
    public void testCalendarReadNull() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("null"));
        reader.setLenient(true);
        assertNull(TypeAdapters.CALENDAR.read(reader));
    }

    @Test
    public void testInetAddressFactory() {
        assertNotNull(TypeAdapters.INET_ADDRESS_FACTORY);
    }

    @Test
    public void testJsonElementFactory() {
        assertNotNull(TypeAdapters.JSON_ELEMENT_FACTORY);
    }

    @Test
    public void testStringBuilderFactory() {
        assertNotNull(TypeAdapters.STRING_BUILDER_FACTORY);
    }

    @Test
    public void testStringBufferFactory() {
        assertNotNull(TypeAdapters.STRING_BUFFER_FACTORY);
    }

    private enum TestEnum {
        VALUE1,
        @com.google.gson.annotations.SerializedName("value2_serialized")
        VALUE2
    }
}