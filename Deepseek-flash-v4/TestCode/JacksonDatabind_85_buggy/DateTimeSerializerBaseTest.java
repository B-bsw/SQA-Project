package com.fasterxml.jackson.databind.ser.std;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.jsonFormatVisitors.*;
import com.fasterxml.jackson.databind.type.TypeFactory;

import org.junit.Test;
import static org.junit.Assert.*;

public class DateTimeSerializerBaseTest {

    static class TestDateSerializer extends DateTimeSerializerBase<Date> {
        TestDateSerializer(Boolean useTimestamp, DateFormat customFormat) {
            super(Date.class, useTimestamp, customFormat);
        }

        @Override
        public DateTimeSerializerBase<Date> withFormat(Boolean timestamp, DateFormat customFormat) {
            return new TestDateSerializer(timestamp, customFormat);
        }

        @Override
        protected long _timestamp(Date value) {
            return value == null ? 0L : value.getTime();
        }

        @Override
        public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            gen.writeNumber(_timestamp(value));
        }

        boolean asTimestamp(SerializerProvider serializers) {
            return _asTimestamp(serializers);
        }
    }

    static class DateBean {
        public Date noFormat;

        @JsonFormat(shape = JsonFormat.Shape.NUMBER)
        public Date numericDate;

        @JsonFormat(shape = JsonFormat.Shape.STRING)
        public Date stringDate;

        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
        public Date patternDate;

        @JsonFormat
        public Date emptyFormat;
    }

    static class SimpleBeanProperty implements BeanProperty {
        private final AnnotatedMember member;

        SimpleBeanProperty(AnnotatedMember member) {
            this.member = member;
        }

        public String getName() {
            return "date";
        }

        public PropertyName getFullName() {
            return new PropertyName("date");
        }

        public JavaType getType() {
            return TypeFactory.defaultInstance().constructType(Date.class);
        }

        public PropertyName getWrapperName() {
            return null;
        }

        public PropertyMetadata getMetadata() {
            return null;
        }

        public AnnotatedMember getMember() {
            return member;
        }

        public <A extends Annotation> A getAnnotation(Class<A> cls) {
            return member == null ? null : member.getAnnotation(cls);
        }

        public <A extends Annotation> A getContextAnnotation(Class<A> cls) {
            return null;
        }

        public boolean isRequired() {
            return false;
        }
    }

    static class RecordingIntegerVisitor implements JsonIntegerFormatVisitor {
        JsonParser.NumberType numberType;
        JsonValueFormat format;

        public void numberType(JsonParser.NumberType numberType) {
            this.numberType = numberType;
        }

        public void format(JsonValueFormat format) {
            this.format = format;
        }
    }

    static class RecordingStringVisitor implements JsonStringFormatVisitor {
        JsonValueFormat format;

        public void format(JsonValueFormat format) {
            this.format = format;
        }
    }

    static class RecordingFormatVisitor implements JsonFormatVisitorWrapper {
        final RecordingIntegerVisitor integerVisitor = new RecordingIntegerVisitor();
        final RecordingStringVisitor stringVisitor = new RecordingStringVisitor();
        private SerializerProvider provider;

        RecordingFormatVisitor(SerializerProvider provider) {
            this.provider = provider;
        }

        public SerializerProvider getProvider() {
            return provider;
        }

        public void setProvider(SerializerProvider provider) {
            this.provider = provider;
        }

        public JsonIntegerFormatVisitor expectIntegerFormat(JavaType type) {
            return integerVisitor;
        }

        public JsonStringFormatVisitor expectStringFormat(JavaType type) {
            return stringVisitor;
        }

        public JsonNumberFormatVisitor expectNumberFormat(JavaType type) {
            return null;
        }

        public JsonBooleanFormatVisitor expectBooleanFormat(JavaType type) {
            return null;
        }

        public JsonArrayFormatVisitor expectArrayFormat(JavaType type) {
            return null;
        }

        public JsonObjectFormatVisitor expectObjectFormat(JavaType type) {
            return null;
        }

        public JsonMapFormatVisitor expectMapFormat(JavaType type) {
            return null;
        }

        public JsonNullFormatVisitor expectNullFormat(JavaType type) {
            return null;
        }

        public JsonAnyFormatVisitor expectAnyFormat(JavaType type) {
            return null;
        }
    }

    private BeanProperty propertyFor(String fieldName) throws Exception {
        Field field = DateBean.class.getField(fieldName);
        AnnotationMap annotations = new AnnotationMap();
        for (Annotation ann : field.getAnnotations()) {
            annotations.add(ann);
        }
        AnnotatedField member = new AnnotatedField(null, field, annotations);
        return new SimpleBeanProperty(member);
    }

    private SerializerProvider providerWithTimestamps(boolean enabled) {
        ObjectMapper mapper = new ObjectMapper();
        SerializationConfig config = mapper.getSerializationConfig();
        config = enabled
                ? config.with(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
                : config.without(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        mapper.setConfig(config);
        return mapper.getSerializerProvider();
    }

    private JavaType dateType() {
        return TypeFactory.defaultInstance().constructType(Date.class);
    }

    @Test
    public void testCreateContextualNullProperty() throws Exception {
        TestDateSerializer serializer = new TestDateSerializer(null, null);
        assertSame(serializer, serializer.createContextual(null, null));
    }

    @Test
    public void testCreateContextualNoFormat() throws Exception {
        TestDateSerializer serializer = new TestDateSerializer(null, null);
        assertSame(serializer, serializer.createContextual(providerWithTimestamps(true), propertyFor("noFormat")));
    }

    @Test
    public void testCreateContextualNumericShape() throws Exception {
        TestDateSerializer serializer = new TestDateSerializer(null, null);
        TestDateSerializer result = (TestDateSerializer) serializer.createContextual(
                providerWithTimestamps(true), propertyFor("numericDate"));
        assertEquals(Boolean.TRUE, result._useTimestamp);
        assertNull(result._customFormat);
    }

    @Test
    public void testCreateContextualStringShape() throws Exception {
        TestDateSerializer serializer = new TestDateSerializer(null, null);
        TestDateSerializer result = (TestDateSerializer) serializer.createContextual(
                providerWithTimestamps(true), propertyFor("stringDate"));
        assertEquals(Boolean.FALSE, result._useTimestamp);
        assertNotNull(result._customFormat);
    }

    @Test
    public void testCreateContextualPattern() throws Exception {
        TestDateSerializer serializer = new TestDateSerializer(null, null);
        TestDateSerializer result = (TestDateSerializer) serializer.createContextual(
                providerWithTimestamps(true), propertyFor("patternDate"));
        assertEquals(Boolean.FALSE, result._useTimestamp);
        assertNotNull(result._customFormat);
        SimpleDateFormat df = (SimpleDateFormat) result._customFormat;
        assertEquals("yyyy-MM-dd HH:mm:ss", df.toPattern());
        assertEquals("UTC", df.getTimeZone().getID());
    }

    @Test
    public void testCreateContextualEmptyFormat() throws Exception {
        TestDateSerializer serializer = new TestDateSerializer(null, null);
        assertSame(serializer, serializer.createContextual(providerWithTimestamps(true), propertyFor("emptyFormat")));
    }

    @Test
    public void testIsEmpty() {
        TestDateSerializer serializer = new TestDateSerializer(null, null);
        assertTrue(serializer.isEmpty(null));
        assertTrue(serializer.isEmpty(new Date(0L)));
        assertFalse(serializer.isEmpty(new Date(1L)));

        assertTrue(serializer.isEmpty(null, null));
        assertTrue(serializer.isEmpty(null, new Date(0L)));
        assertFalse(serializer.isEmpty(null, new Date(1L)));
    }

    @Test
    public void testAsTimestamp() {
        assertTrue(new TestDateSerializer(Boolean.TRUE, null).asTimestamp(null));
        assertFalse(new TestDateSerializer(Boolean.FALSE, null).asTimestamp(null));
        assertFalse(new TestDateSerializer(null, new SimpleDateFormat()).asTimestamp(null));
        assertTrue(new TestDateSerializer(null, null).asTimestamp(providerWithTimestamps(true)));
        assertFalse(new TestDateSerializer(null, null).asTimestamp(providerWithTimestamps(false)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAsTimestampRejectsNullProvider() {
        new TestDateSerializer(null, null).asTimestamp(null);
    }

    @Test
    public void testGetSchema() {
        assertEquals("number", new TestDateSerializer(Boolean.TRUE, null).getSchema(null, null).get("type").asText());
        assertEquals("string", new TestDateSerializer(Boolean.FALSE, null).getSchema(null, null).get("type").asText());
        assertEquals("string", new TestDateSerializer(null, new SimpleDateFormat()).getSchema(null, null).get("type").asText());
        assertEquals("number", new TestDateSerializer(null, null).getSchema(providerWithTimestamps(true), null).get("type").asText());
        assertEquals("string", new TestDateSerializer(null, null).getSchema(providerWithTimestamps(false), null).get("type").asText());
    }

    @Test
    public void testAcceptJsonFormatVisitorNumber() throws Exception {
        TestDateSerializer serializer = new TestDateSerializer(Boolean.TRUE, null);
        RecordingFormatVisitor visitor = new RecordingFormatVisitor(null);
        serializer.acceptJsonFormatVisitor(visitor, dateType());
        assertEquals(JsonParser.NumberType.LONG, visitor.integerVisitor.numberType);
        assertEquals(JsonValueFormat.UTC_MILLISEC, visitor.integerVisitor.format);
    }

    @Test
    public void testAcceptJsonFormatVisitorString() throws Exception {
        TestDateSerializer serializer = new TestDateSerializer(Boolean.FALSE, null);
        RecordingFormatVisitor visitor = new RecordingFormatVisitor(null);
        serializer.acceptJsonFormatVisitor(visitor, dateType());
        assertEquals(JsonValueFormat.DATE_TIME, visitor.stringVisitor.format);
    }

    @Test
    public void testAcceptJsonFormatVisitorUsesProvider() throws Exception {
        TestDateSerializer serializer = new TestDateSerializer(null, null);
        RecordingFormatVisitor visitor = new RecordingFormatVisitor(providerWithTimestamps(true));
        serializer.acceptJsonFormatVisitor(visitor, dateType());
        assertEquals(JsonParser.NumberType.LONG, visitor.integerVisitor.numberType);
    }
}