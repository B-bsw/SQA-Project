package com.fasterxml.jackson.databind.ser.std;

import static org.junit.Assert.*;

import java.io.StringWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer;

@SuppressWarnings("deprecation")
public class StdKeySerializersTest {

    private enum TestEnum {
        VALUE {
            @Override
            public String toString() {
                return "value";
            }
        }
    }

    private static class ToStringKey {
        @Override
        public String toString() {
            return "custom-key";
        }
    }

    private ObjectMapper mapper;
    private SerializerProvider provider;
    private StringWriter writer;
    private JsonGenerator generator;

    @Before
    public void setUp() throws Exception {
        mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        provider = mapper.getSerializerProvider();
        writer = new StringWriter();
        generator = mapper.getFactory().createGenerator(writer);
    }

    @After
    public void tearDown() throws Exception {
        if (generator != null) {
            generator.close();
        }
    }

    private String writeField(JsonSerializer<Object> serializer, Object value,
            SerializerProvider serializationProvider) throws Exception {
        generator.writeStartObject();
        serializer.serialize(value, generator, serializationProvider);
        generator.writeString("v");
        generator.writeEndObject();
        generator.flush();
        return writer.toString();
    }

    @Test
    public void testGetStdKeySerializerDynamicAndString() {
        assertTrue(StdKeySerializers.getStdKeySerializer(null, null, false) instanceof Dynamic);
        assertTrue(StdKeySerializers.getStdKeySerializer(null, Object.class, false) instanceof Dynamic);
        assertTrue(StdKeySerializers.getStdKeySerializer(null, String.class, false) instanceof StringKeySerializer);
    }

    @Test
    public void testGetStdKeySerializerForKnownJdkTypes() {
        JsonSerializer<Object> defaultSer = StdKeySerializers.getDefault();

        assertSame(defaultSer, StdKeySerializers.getStdKeySerializer(null, Integer.TYPE, false));
        assertSame(defaultSer, StdKeySerializers.getStdKeySerializer(null, Number.class, false));
        assertSame(defaultSer, StdKeySerializers.getStdKeySerializer(null, Integer.class, false));

        Default classSer = (Default) StdKeySerializers.getStdKeySerializer(null, Class.class, false);
        assertEquals(Default.TYPE_CLASS, classSer._typeId);

        Default dateSer = (Default) StdKeySerializers.getStdKeySerializer(null, Date.class, false);
        assertEquals(Default.TYPE_DATE, dateSer._typeId);

        Default calSer = (Default) StdKeySerializers.getStdKeySerializer(null, Calendar.class, false);
        assertEquals(Default.TYPE_CALENDAR, calSer._typeId);

        Default uuidSer = (Default) StdKeySerializers.getStdKeySerializer(null, java.util.UUID.class, false);
        assertEquals(Default.TYPE_TO_STRING, uuidSer._typeId);
    }

    @Test
    public void testGetStdKeySerializerForUnrecognizedType() {
        assertNull(StdKeySerializers.getStdKeySerializer(null, StringBuilder.class, false));
        assertSame(StdKeySerializers.getDefault(),
                StdKeySerializers.getStdKeySerializer(null, StringBuilder.class, true));
    }

    @Test
    public void testGetFallbackKeySerializer() {
        JsonSerializer<Object> defaultSer = StdKeySerializers.getDefault();

        assertSame(defaultSer, StdKeySerializers.getFallbackKeySerializer(null, null));
        assertSame(defaultSer, StdKeySerializers.getFallbackKeySerializer(null, String.class));
        assertTrue(StdKeySerializers.getFallbackKeySerializer(null, Enum.class) instanceof Dynamic);

        Default enumSer = (Default) StdKeySerializers.getFallbackKeySerializer(null, TestEnum.class);
        assertEquals(Default.TYPE_ENUM, enumSer._typeId);
    }

    @Test
    public void testGetDefault() {
        assertNotNull(StdKeySerializers.getDefault());
        assertSame(StdKeySerializers.getDefault(), StdKeySerializers.getDefault());
    }

    @Test
    public void testStringKeySerializerSerializesFieldName() throws Exception {
        StringKeySerializer ser = new StringKeySerializer();
        assertEquals("{\"foo\":\"v\"}", writeField(ser, "foo", provider));
    }

    @Test
    public void testDefaultDateKeySerializer() throws Exception {
        Default ser = new Default(Default.TYPE_DATE, Date.class);
        assertEquals("{\"123456789\":\"v\"}", writeField(ser, new Date(123456789L), provider));
    }

    @Test
    public void testDefaultCalendarKeySerializer() throws Exception {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.setTimeInMillis(123456789L);
        Default ser = new Default(Default.TYPE_CALENDAR, Calendar.class);
        assertEquals("{\"123456789\":\"v\"}", writeField(ser, cal, provider));
    }

    @Test
    public void testDefaultClassKeySerializer() throws Exception {
        Default ser = new Default(Default.TYPE_CLASS, Class.class);
        assertEquals("{\"java.lang.String\":\"v\"}", writeField(ser, String.class, provider));
    }

    @Test
    public void testDefaultEnumKeySerializerName() throws Exception {
        Default ser = new Default(Default.TYPE_ENUM, TestEnum.class);
        assertEquals("{\"VALUE\":\"v\"}", writeField(ser, TestEnum.VALUE, provider));
    }

    @Test
    public void testDefaultEnumKeySerializerToString() throws Exception {
        ObjectMapper enumMapper = new ObjectMapper();
        enumMapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
        StringWriter enumWriter = new StringWriter();
        JsonGenerator enumGen = enumMapper.getFactory().createGenerator(enumWriter);
        try {
            Default ser = new Default(Default.TYPE_ENUM, TestEnum.class);
            enumGen.writeStartObject();
            ser.serialize(TestEnum.VALUE, enumGen, enumMapper.getSerializerProvider());
            enumGen.writeString("v");
            enumGen.writeEndObject();
            enumGen.flush();
            assertEquals("{\"value\":\"v\"}", enumWriter.toString());
        } finally {
            enumGen.close();
        }
    }

    @Test
    public void testDefaultToStringKeySerializer() throws Exception {
        Default ser = new Default(Default.TYPE_TO_STRING, ToStringKey.class);
        assertEquals("{\"custom-key\":\"v\"}", writeField(ser, new ToStringKey(), provider));
    }

    @Test
    public void testDefaultUnknownTypeIdUsesToString() throws Exception {
        Default ser = new Default(Default.TYPE_TO_STRING + 100, ToStringKey.class);
        assertEquals("{\"custom-key\":\"v\"}", writeField(ser, new ToStringKey(), provider));
    }

    @Test
    public void testDynamicSerializerFindsAndCachesKeySerializer() throws Exception {
        Dynamic ser = new Dynamic();
        generator.writeStartObject();
        ser.serialize("a", generator, provider);
        generator.writeString("1");
        ser.serialize("b", generator, provider);
        generator.writeString("2");
        generator.writeEndObject();
        generator.flush();
        assertEquals("{\"a\":\"1\",\"b\":\"2\"}", writer.toString());
    }
}