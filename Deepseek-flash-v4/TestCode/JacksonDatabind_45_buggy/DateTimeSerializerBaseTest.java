package com.fasterxml.jackson.databind.ser.std;

import static org.junit.Assert.*;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospector;

public class DateTimeSerializerBaseTest {

    private static class TestDateTimeSerializer extends DateTimeSerializerBase<Date> {

        TestDateTimeSerializer(Boolean useTimestamp, DateFormat customFormat) {
            super(Date.class, useTimestamp, customFormat);
        }

        @Override
        public TestDateTimeSerializer withFormat(Boolean timestamp, DateFormat customFormat) {
            return new TestDateTimeSerializer(timestamp, customFormat);
        }

        @Override
        protected long _timestamp(Date value) {
            return value == null ? 0L : value.getTime();
        }

        @Override
        public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            gen.writeNumber(_timestamp(value));
        }
    }

    private static class TestAnnotationIntrospector extends AnnotationIntrospector {
        private final JsonFormat.Value value;

        TestAnnotationIntrospector(JsonFormat.Value value) {
            this.value = value;
        }

        @Override
        public JsonFormat.Value findFormat(Annotated member) {
            return value;
        }

        @Override
        public Version version() {
            return Version.unknownVersion();
        }
    }

    private static class TestBeanProperty implements BeanProperty {
        @Override
        public String getName() {
            return "test";
        }

        @Override
        public PropertyName getFullName() {
            return PropertyName.construct("test");
        }

        @Override
        public JavaType getType() {
            return null;
        }

        @Override
        public PropertyName getWrapperName() {
            return null;
        }

        @Override
        public boolean isRequired() {
            return false;
        }

        @Override
        public PropertyMetadata getMetadata() {
            return null;
        }

        @Override
        public AnnotatedMember getMember() {
            return null;
        }

        @Override
        public <A extends java.lang.annotation.Annotation> A getAnnotation(Class<A> annotationType) {
            return null;
        }

        @Override
        public <A extends java.lang.annotation.Annotation> A getContextAnnotation(Class<A> annotationType) {
            return null;
        }
    }

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    private SerializerProvider providerFor(JsonFormat.Value format) {
        ObjectMapper providerMapper = new ObjectMapper();
        providerMapper.setAnnotationIntrospector(new TestAnnotationIntrospector(format));
        return providerMapper.getSerializerProvider();
    }

    @Test
    public void testCreateContextualNullPropertyIsNoOp() {
        TestDateTimeSerializer serializer = new TestDateTimeSerializer(null, null);
        SerializerProvider provider = providerFor(JsonFormat.Value.fromString("shape=NUMBER"));
        assertSame(serializer, serializer.createContextual(provider, null));
    }

    @Test
    public void testCreateContextualNullFormatIsNoOp() {
        TestDateTimeSerializer serializer = new TestDateTimeSerializer(null, null);
        SerializerProvider provider = providerFor(null);
        assertSame(serializer, serializer.createContextual(provider, new TestBeanProperty()));
    }

    @Test
    public void testCreateContextualNumericShapeUsesTimestamp() {
        TestDateTimeSerializer serializer = new TestDateTimeSerializer(null, null);
        SerializerProvider provider = providerFor(JsonFormat.Value.fromString("shape=NUMBER"));
        DateTimeSerializerBase<Date> result = serializer.createContextual(provider, new TestBeanProperty());

        assertNotNull(result);
        assertEquals(Boolean.TRUE, result._useTimestamp);
        assertNull(result._customFormat);
    }

    @Test
    public void testCreateContextualStringShapeUsesFormat() {
        TestDateTimeSerializer serializer = new TestDateTimeSerializer(Boolean.TRUE, null);
        SerializerProvider provider = providerFor(
                JsonFormat.Value.fromString("shape=STRING,pattern=yyyy-MM-dd,timezone=UTC"));
        DateTimeSerializerBase<Date> result = serializer.createContextual(provider, new TestBeanProperty());

        assertNotNull(result);
        assertEquals(Boolean.FALSE, result._useTimestamp);
        assertNotNull(result._customFormat);
        assertTrue(result._customFormat instanceof SimpleDateFormat);

        SimpleDateFormat dateFormat = (SimpleDateFormat) result._customFormat;
        assertEquals("yyyy-MM-dd", dateFormat.toPattern());
        assertEquals("UTC", dateFormat.getTimeZone().getID());
    }

    @Test
    public void testAsTimestampExplicitTrueFalse() {
        assertTrue(new TestDateTimeSerializer(Boolean.TRUE, null)._asTimestamp(null));
        assertFalse(new TestDateTimeSerializer(Boolean.FALSE, null)._asTimestamp(null));
    }

    @Test
    public void testAsTimestampCustomFormatMeansString() {
        TestDateTimeSerializer serializer = new TestDateTimeSerializer(null, new SimpleDateFormat("yyyy"));
        assertFalse(serializer._asTimestamp(null));
    }

    @Test
    public void testAsTimestampUsesSerializationFeature() {
        TestDateTimeSerializer serializer = new TestDateTimeSerializer(null, null);

        mapper.enable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        assertTrue(serializer._asTimestamp(mapper.getSerializerProvider()));

        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        assertFalse(serializer._asTimestamp(mapper.getSerializerProvider()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAsTimestampWithoutProviderFails() {
        new TestDateTimeSerializer(null, null)._asTimestamp(null);
    }

    @Test
    public void testIsEmptyValue() {
        TestDateTimeSerializer serializer = new TestDateTimeSerializer(null, null);

        assertTrue(serializer.isEmpty((Date) null));
        assertTrue(serializer.isEmpty(new Date(0L)));
        assertFalse(serializer.isEmpty(new Date(1L)));
    }

    @Test
    public void testIsEmptyWithProvider() {
        TestDateTimeSerializer serializer = new TestDateTimeSerializer(null, null);

        assertTrue(serializer.isEmpty((SerializerProvider) null, (Date) null));
        assertTrue(serializer.isEmpty(null, new Date(0L)));
        assertFalse(serializer.isEmpty(null, new Date(1L)));
    }

    @Test
    public void testGetSchemaNumberWhenUsingTimestamp() {
        JsonNode node = new TestDateTimeSerializer(Boolean.TRUE, null).getSchema(null, null);
        assertNotNull(node);
        assertEquals("number", node.asText());
    }

    @Test
    public void testGetSchemaStringWhenNotUsingTimestamp() {
        JsonNode node = new TestDateTimeSerializer(Boolean.FALSE, null).getSchema(null, null);
        assertNotNull(node);
        assertEquals("string", node.asText());
    }

    @Test
    public void testGetSchemaStringWhenCustomFormatGiven() {
        JsonNode node = new TestDateTimeSerializer(null, new SimpleDateFormat("yyyy-MM-dd")).getSchema(null, null);
        assertNotNull(node);
        assertEquals("string", node.asText());
    }
}