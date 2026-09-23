package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;

import static org.junit.Assert.*;

public class SerializerProviderTest {

    private SerializerProvider provider;

    @Before
    public void setUp() {
        provider = new SerializerProvider() {
            @Override
            public WritableObjectId findObjectId(Object forPojo, ObjectIdGenerator<?> generatorType) {
                return null;
            }

            @Override
            public JsonSerializer<Object> serializerInstance(Annotated annotated, Object serDef) throws JsonMappingException {
                return null;
            }

            @Override
            public Object includeFilterInstance(BeanPropertyDefinition forProperty, Class<?> filterClass) {
                return null;
            }

            @Override
            public boolean includeFilterSuppressNulls(Object filter) {
                return false;
            }

            @Override
            public JsonSerializer<Object> findValueSerializer(Class<?> valueType, BeanProperty property) throws JsonMappingException {
                return findValueSerializer(TypeFactory.defaultInstance().constructType(valueType), property);
            }

            @Override
            public JsonSerializer<Object> findValueSerializer(JavaType valueType, BeanProperty property) throws JsonMappingException {
                JsonSerializer<Object> ser = findValueSerializer(valueType);
                if (ser == null) {
                    ser = getUnknownTypeSerializer(valueType.getRawClass());
                }
                return ser;
            }

            @Override
            public JsonSerializer<Object> findPrimaryPropertySerializer(JavaType valueType, BeanProperty property) throws JsonMappingException {
                return findValueSerializer(valueType, property);
            }

            @Override
            public JsonSerializer<Object> findPrimaryPropertySerializer(Class<?> valueType, BeanProperty property) throws JsonMappingException {
                return findValueSerializer(valueType, property);
            }

            @Override
            public JsonSerializer<Object> findTypedValueSerializer(Class<?> valueType, boolean cache, BeanProperty property) throws JsonMappingException {
                JsonSerializer<Object> ser = findValueSerializer(valueType, property);
                return ser;
            }

            @Override
            public JsonSerializer<Object> findTypedValueSerializer(JavaType valueType, boolean cache, BeanProperty property) throws JsonMappingException {
                JsonSerializer<Object> ser = findValueSerializer(valueType, property);
                return ser;
            }
        };
    }

    @Test
    public void testDefaultSerializeNullValue() throws IOException {
        provider._stdNullValueSerializer = true;
        provider._nullValueSerializer = new SerializerProviderTest.TestNullSerializer();
        final boolean[] writeNullCalled = {false};
        JsonGenerator gen = new JsonGenerator() {
            @Override
            public void writeNull() throws IOException {
                writeNullCalled[0] = true;
            }
        };
        provider.defaultSerializeNull(gen);
        assertTrue(writeNullCalled[0]);
    }

    @Test
    public void testDefaultSerializeNullValueWithCustomSerializer() throws IOException {
        provider._stdNullValueSerializer = false;
        final boolean[] serializeCalled = {false};
        provider._nullValueSerializer = new JsonSerializer<Object>() {
            @Override
            public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) throws IOException {
                serializeCalled[0] = true;
            }
        };
        provider.defaultSerializeNull(new JsonGenerator() {
            @Override
            public void writeNull() throws IOException {
                fail("Expected custom serializer to be called");
            }
        });
        assertTrue(serializeCalled[0]);
    }

    @Test
    public void testFindTypedValueSerializerNullValueType() throws JsonMappingException {
        assertThrows(JsonMappingException.class, () -> provider.findTypedValueSerializer(JavaType.class, false, null));
    }

    @Test
    public void testFindValueSerializerNullValueType() throws JsonMappingException {
        assertThrows(JsonMappingException.class, () -> provider.findValueSerializer(JavaType.class, null));
    }

    @Test
    public void testSetDefaultKeySerializerNull() {
        try {
            provider.setDefaultKeySerializer(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Cannot pass null JsonSerializer", e.getMessage());
        }
    }

    @Test
    public void testSetDefaultKeySerializerValid() {
        JsonSerializer<Object> ser = new JsonSerializer<Object>() {
            @Override
            public void serialize(Object value, JsonGenerator gen, SerializerProvider serializerProvider) {
            }
        };
        provider.setDefaultKeySerializer(ser);
        assertEquals(ser, provider._keySerializer);
    }

    @Test
    public void testSetNullValueSerializerNull() {
        provider.setNullValueSerializer(null);
        assertEquals(NullSerializer.instance, provider._nullValueSerializer);
    }

    @Test
    public void testSetNullKeySerializerNull() {
        provider.setNullKeySerializer(null);
        assertEquals(SerializerProvider.DEFAULT_NULL_KEY_SERIALIZER, provider._nullKeySerializer);
    }

    @Test
    public void testGetDefaultNullKeySerializer() {
        assertNotNull(provider.getDefaultNullKeySerializer());
    }

    @Test
    public void testGetDefaultNullValueSerializer() {
        assertNotNull(provider.getDefaultNullValueSerializer());
    }

    @Test
    public void testHandlePrimaryContextualization() throws JsonMappingException {
        JsonSerializer<?> ser = new JsonSerializer<Object>() {
            @Override
            public void serialize(Object value, JsonGenerator gen, SerializerProvider serializerProvider) {
            }
        };
        JsonSerializer<?> contextualized = provider.handlePrimaryContextualization(ser, null);
        assertNotNull(contextualized);
    }

    @Test
    public void testHandleSecondaryContextualization() throws JsonMappingException {
        JsonSerializer<?> ser = new JsonSerializer<Object>() {
            @Override
            public void serialize(Object value, JsonGenerator gen, SerializerProvider serializerProvider) {
            }
        };
        JsonSerializer<?> contextualized = provider.handleSecondaryContextualization(ser, null);
        assertNotNull(contextualized);
    }

    @Test
    public void testDefaultSerializeDateValue() throws IOException {
        provider._config = new SerializationConfig();
        final boolean[] writeNumberCalled = {false};
        JsonGenerator gen = new JsonGenerator() {
            @Override
            public void writeNumber(long v) {
                writeNumberCalled[0] = true;
            }
        };
        provider.defaultSerializeDateValue(new Date(1000L), gen);
        assertTrue(writeNumberCalled[0]);
    }

    @Test
    public void testDefaultSerializeDateKey() throws IOException {
        provider._config = new SerializationConfig();
        final boolean[] writeFieldNameCalled = {false};
        JsonGenerator gen = new JsonGenerator() {
            @Override
            public void writeFieldName(String name) {
                writeFieldNameCalled[0] = true;
            }
        };
        provider.defaultSerializeDateKey(1000L, gen);
        assertTrue(writeFieldNameCalled[0]);
    }

    @Test
    public void testReportBadDefinition() {
        try {
            provider.reportBadDefinition(TypeFactory.defaultInstance().constructType(String.class), "Test message");
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testIsUnknownTypeSerializer() {
        JsonSerializer<Object> ser = new UnknownSerializer(Object.class);
        assertTrue(provider.isUnknownTypeSerializer(ser));
        assertTrue(provider.isUnknownTypeSerializer(null));
    }

    @Test
    public void testGetUnknownTypeSerializer() {
        JsonSerializer<Object> ser = provider.getUnknownTypeSerializer(Object.class);
        assertEquals(SerializerProvider.DEFAULT_UNKNOWN_SERIALIZER, ser);
    }

    @Test
    public void testGetUnknownTypeSerializerForNonObject() {
        JsonSerializer<Object> ser = provider.getUnknownTypeSerializer(String.class);
        assertEquals(UnknownSerializer.class, ser.getClass());
    }

    @Test
    public void testGetConfig() {
        assertNull(provider.getConfig());
    }

    @Test
    public void testGetActiveView() {
        assertNull(provider.getActiveView());
    }

    @Test
    public void testIsEnabledMapperFeature() {
        provider._config = new SerializationConfig();
        assertFalse(provider.isEnabled(MapperFeature.USE_STATIC_TYPING));
    }

    @Test
    public void testGetLocale() {
        provider._config = new SerializationConfig();
        assertNotNull(provider.getLocale());
    }

    @Test
    public void testGetTimeZone() {
        provider._config = new SerializationConfig();
        assertNotNull(provider.getTimeZone());
    }
}