package com.fasterxml.jackson.databind.ser.std;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.StdDateFormat;

public class DateTimeSerializerBaseTest {

    private static class ConcreteDateTimeSerializer extends DateTimeSerializerBase<Date> {
        private static final long serialVersionUID = 1L;

        public ConcreteDateTimeSerializer() {
            this(null, null);
        }

        public ConcreteDateTimeSerializer(Boolean useTimestamp, DateFormat customFormat) {
            super(Date.class, useTimestamp, customFormat);
        }

        @Override
        public DateTimeSerializerBase<Date> withFormat(Boolean timestamp, DateFormat customFormat) {
            return new ConcreteDateTimeSerializer(timestamp, customFormat);
        }

        @Override
        protected long _timestamp(Date value) {
            return (value == null) ? 0L : value.getTime();
        }

        @Override
        public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            // no-op for contextual / configuration test coverage
        }

        public Boolean getUseTimestamp() {
            return this._useTimestamp;
        }

        public DateFormat getCustomFormat() {
            return this._customFormat;
        }

        @Override
        public boolean _asTimestamp(SerializerProvider serializers) {
            return super._asTimestamp(serializers);
        }

        @Override
        public void _acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint, boolean asNumber)
                throws JsonMappingException {
            super._acceptJsonFormatVisitor(visitor, typeHint, asNumber);
        }
    }

    private static class MockSerializerProvider extends SerializerProvider {
        private final AnnotationIntrospector _introspector;
        private final boolean _writeDatesAsTimestamps;
        private final Locale _locale;
        private final TimeZone _timeZone;

        public MockSerializerProvider(AnnotationIntrospector introspector, boolean writeDatesAsTimestamps,
                                      Locale locale, TimeZone timeZone) {
            super();
            this._introspector = introspector;
            this._writeDatesAsTimestamps = writeDatesAsTimestamps;
            this._locale = (locale == null) ? Locale.getDefault() : locale;
            this._timeZone = (timeZone == null) ? TimeZone.getDefault() : timeZone;
        }

        @Override
        public AnnotationIntrospector getAnnotationIntrospector() {
            return this._introspector;
        }

        @Override
        public boolean isEnabled(SerializationFeature feature) {
            if (feature == SerializationFeature.WRITE_DATES_AS_TIMESTAMPS) {
                return this._writeDatesAsTimestamps;
            }
            return false;
        }

        @Override
        public Locale getLocale() {
            return this._locale;
        }

        @Override
        public TimeZone getTimeZone() {
            return this._timeZone;
        }

        @Override
        public SerializationConfig getConfig() {
            return null;
        }

        @Override
        public JsonNodeFactory getNodeFactory() {
            return JsonNodeFactory.instance;
        }

        @Override
        public Object findFilterId(Object filterId, Object toFilter) {
            return null;
        }

        @Override
        public com.fasterxml.jackson.databind.ser.SerializerFactory getSerializerFactory() {
            return null;
        }

        @Override
        public void serializeValue(JsonGenerator jgen, Object value) throws IOException {
        }

        @Override
        public void serializeValue(JsonGenerator jgen, Object value, JavaType rootType) throws IOException {
        }

        @Override
        public void serializeValue(JsonGenerator jgen, Object value, JavaType rootType, JsonSerializer<Object> ser)
                throws IOException {
        }
    }

    private static class MockBeanProperty implements BeanProperty {
        private final AnnotatedMember _member;

        public MockBeanProperty(AnnotatedMember member) {
            this._member = member;
        }

        @Override
        public String getName() {
            return "mockProperty";
        }

        @Override
        public PropertyName getFullName() {
            return new PropertyName("mockProperty");
        }

        @Override
        public JavaType getType() {
            return TypeFactory.defaultInstance().constructType(Date.class);
        }

        @Override
        public PropertyName getWrapperName() {
            return null;
        }

        @Override
        public <A extends Annotation> A getAnnotation(Class<A> acls) {
            return null;
        }

        @Override
        public <A extends Annotation> A getContextAnnotation(Class<A> acls) {
            return null;
        }

        @Override
        public AnnotatedMember getMember() {
            return this._member;
        }

        @Override
        public boolean isRequired() {
            return false;
        }

        @Override
        public void depositSchemaProperty(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor objectVisitor) {
        }
    }

    private static class MockAnnotatedMember extends AnnotatedMember {
        private static final long serialVersionUID = 1L;

        public MockAnnotatedMember() {
            super(null, null);
        }

        @Override
        public AnnotatedElement getAnnotated() {
            return null;
        }

        @Override
        public int getModifiers() {
            return 0;
        }

        @Override
        public String getName() {
            return "mockMember";
        }

        @Override
        public Type getGenericType() {
            return Date.class;
        }

        @Override
        public Class<?> getRawType() {
            return Date.class;
        }

        @Override
        public Class<?> getDeclaringClass() {
            return Date.class;
        }

        @Override
        public Annotated withAnnotations(Annotations fallback) {
            return this;
        }

        @Override
        public Object getValue(Object pojo) throws UnsupportedOperationException, IllegalArgumentException {
            return null;
        }

        @Override
        public void setValue(Object pojo, Object value) throws UnsupportedOperationException, IllegalArgumentException {
        }
    }

    private static class MockAnnotationIntrospector extends AnnotationIntrospector {
        private static final long serialVersionUID = 1L;
        private final JsonFormat.Value _formatValue;

        public MockAnnotationIntrospector(JsonFormat.Value formatValue) {
            this._formatValue = formatValue;
        }

        @Override
        public com.fasterxml.jackson.core.Version version() {
            return com.fasterxml.jackson.core.Version.unknownVersion();
        }

        @Override
        public JsonFormat.Value findFormat(Annotated memberOrClass) {
            return this._formatValue;
        }
    }

    private static class MockJsonFormatVisitorWrapper implements JsonFormatVisitorWrapper {
        private final SerializerProvider _provider;
        public boolean intVisitorCalled = false;
        public boolean stringVisitorCalled = false;
        public JsonParser.NumberType capturedNumberType = null;
        public JsonValueFormat capturedNumberFormat = null;
        public JsonValueFormat capturedStringFormat = null;

        public MockJsonFormatVisitorWrapper(SerializerProvider provider) {
            this._provider = provider;
        }

        @Override
        public SerializerProvider getProvider() {
            return this._provider;
        }

        @Override
        public void setProvider(SerializerProvider provider) {
        }

        @Override
        public JsonIntegerFormatVisitor expectIntegerFormat(JavaType type) throws JsonMappingException {
            this.intVisitorCalled = true;
            return new JsonIntegerFormatVisitor.Base() {
                @Override
                public void numberType(JsonParser.NumberType type) {
                    capturedNumberType = type;
                }

                @Override
                public void format(JsonValueFormat format) {
                    capturedNumberFormat = format;
                }
            };
        }

        @Override
        public JsonStringFormatVisitor expectStringFormat(JavaType type) throws JsonMappingException {
            this.stringVisitorCalled = true;
            return new JsonStringFormatVisitor.Base() {
                @Override
                public void format(JsonValueFormat format) {
                    capturedStringFormat = format;
                }
            };
        }

        @Override
        public com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor expectObjectFormat(JavaType type) {
            return null;
        }

        @Override
        public com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor expectArrayFormat(JavaType type) {
            return null;
        }

        @Override
        public com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNullFormatVisitor expectNullFormat(JavaType type) {
            return null;
        }

        @Override
        public com.fasterxml.jackson.databind.jsonFormatVisitors.JsonBooleanFormatVisitor expectBooleanFormat(JavaType type) {
            return null;
        }

        @Override
        public com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor expectNumberFormat(JavaType type) {
            return null;
        }

        @Override
        public com.fasterxml.jackson.databind.jsonFormatVisitors.JsonAnyFormatVisitor expectAnyFormat(JavaType type) {
            return null;
        }

        @Override
        public com.fasterxml.jackson.databind.jsonFormatVisitors.JsonMapFormatVisitor expectMapFormat(JavaType type) {
            return null;
        }
    }

    // =========================================================================
    // isEmpty Tests
    // =========================================================================

    @Test
    public void isEmpty_givenNullValue_shouldReturnTrue() {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer();

        // Act
        boolean result = serializer.isEmpty(null);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void isEmpty_givenZeroTimestamp_shouldReturnTrue() {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer();
        Date zeroDate = new Date(0L);

        // Act
        boolean result = serializer.isEmpty(zeroDate);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void isEmpty_givenNonZeroTimestamp_shouldReturnFalse() {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer();
        Date nonZeroDate = new Date(1500000000000L);

        // Act
        boolean result = serializer.isEmpty(nonZeroDate);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void isEmptyWithProvider_givenNullValue_shouldReturnTrue() {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer();

        // Act
        boolean result = serializer.isEmpty((SerializerProvider) null, null);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void isEmptyWithProvider_givenZeroTimestamp_shouldReturnTrue() {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer();
        Date zeroDate = new Date(0L);

        // Act
        boolean result = serializer.isEmpty((SerializerProvider) null, zeroDate);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void isEmptyWithProvider_givenNonZeroTimestamp_shouldReturnFalse() {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer();
        Date nonZeroDate = new Date(1500000000000L);

        // Act
        boolean result = serializer.isEmpty((SerializerProvider) null, nonZeroDate);

        // Assert
        Assert.assertFalse(result);
    }

    // =========================================================================
    // _asTimestamp Tests
    // =========================================================================

    @Test
    public void asTimestamp_givenExplicitUseTimestampTrue_shouldReturnTrue() {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(Boolean.TRUE, null);

        // Act
        boolean result = serializer._asTimestamp(null);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void asTimestamp_givenExplicitUseTimestampFalse_shouldReturnFalse() {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(Boolean.FALSE, null);

        // Act
        boolean result = serializer._asTimestamp(null);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void asTimestamp_givenCustomFormatNonNull_shouldReturnFalse() {
        // Arrange
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, format);

        // Act
        boolean result = serializer._asTimestamp(null);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void asTimestamp_givenNullTimestampNullFormatAndProviderFeatureEnabled_shouldReturnTrue() {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, null);
        MockSerializerProvider provider = new MockSerializerProvider(null, true, null, null);

        // Act
        boolean result = serializer._asTimestamp(provider);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void asTimestamp_givenNullTimestampNullFormatAndProviderFeatureDisabled_shouldReturnFalse() {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, null);
        MockSerializerProvider provider = new MockSerializerProvider(null, false, null, null);

        // Act
        boolean result = serializer._asTimestamp(provider);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void asTimestamp_givenNullTimestampNullFormatAndNullProvider_shouldThrowIllegalArgumentException() {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, null);

        // Act & Assert
        try {
            serializer._asTimestamp(null);
            Assert.fail("Expected IllegalArgumentException when SerializerProvider is null");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().contains("Null SerializerProvider passed for"));
        }
    }

    // =========================================================================
    // createContextual Tests
    // =========================================================================

    @Test
    public void createContextual_givenNullProperty_shouldReturnSameInstance() throws JsonMappingException {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer();

        // Act
        JsonSerializer<?> result = serializer.createContextual(null, null);

        // Assert
        Assert.assertSame(serializer, result);
    }

    @Test
    public void createContextual_givenPropertyWithNullFormat_shouldReturnSameInstance() throws JsonMappingException {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer();
        MockAnnotationIntrospector introspector = new MockAnnotationIntrospector(null);
        MockSerializerProvider provider = new MockSerializerProvider(introspector, true, null, null);
        MockBeanProperty property = new MockBeanProperty(new MockAnnotatedMember());

        // Act
        JsonSerializer<?> result = serializer.createContextual(provider, property);

        // Assert
        Assert.assertSame(serializer, result);
    }

    @Test
    public void createContextual_givenNumericShape_shouldReturnWithTimestampTrueAndNullFormat()
            throws JsonMappingException {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer();
        JsonFormat.Value formatValue = new JsonFormat.Value("", JsonFormat.Shape.NUMBER_INT, (String) null, (String) null);
        MockAnnotationIntrospector introspector = new MockAnnotationIntrospector(formatValue);
        MockSerializerProvider provider = new MockSerializerProvider(introspector, false, null, null);
        MockBeanProperty property = new MockBeanProperty(new MockAnnotatedMember());

        // Act
        JsonSerializer<?> result = serializer.createContextual(provider, property);

        // Assert
        Assert.assertNotSame(serializer, result);
        Assert.assertTrue(result instanceof ConcreteDateTimeSerializer);
        ConcreteDateTimeSerializer contextual = (ConcreteDateTimeSerializer) result;
        Assert.assertEquals(Boolean.TRUE, contextual.getUseTimestamp());
        Assert.assertNull(contextual.getCustomFormat());
    }

    @Test
    public void createContextual_givenStringShapeWithExplicitPatternLocaleAndTimeZone_shouldApplyThem()
            throws JsonMappingException {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer();
        String pattern = "yyyy/MM/dd HH:mm:ss";
        Locale locale = Locale.GERMANY;
        TimeZone timeZone = TimeZone.getTimeZone("GMT+2");

        JsonFormat.Value formatValue = new JsonFormat.Value(pattern, JsonFormat.Shape.STRING, locale, timeZone);
        MockAnnotationIntrospector introspector = new MockAnnotationIntrospector(formatValue);
        MockSerializerProvider provider = new MockSerializerProvider(introspector, false, Locale.US, TimeZone.getTimeZone("UTC"));
        MockBeanProperty property = new MockBeanProperty(new MockAnnotatedMember());

        // Act
        JsonSerializer<?> result = serializer.createContextual(provider, property);

        // Assert
        Assert.assertTrue(result instanceof ConcreteDateTimeSerializer);
        ConcreteDateTimeSerializer contextual = (ConcreteDateTimeSerializer) result;
        Assert.assertEquals(Boolean.FALSE, contextual.getUseTimestamp());
        Assert.assertNotNull(contextual.getCustomFormat());
        Assert.assertTrue(contextual.getCustomFormat() instanceof SimpleDateFormat);

        SimpleDateFormat sdf = (SimpleDateFormat) contextual.getCustomFormat();
        Assert.assertEquals(pattern, sdf.toPattern());
        Assert.assertEquals(timeZone, sdf.getTimeZone());
    }

    @Test
    public void createContextual_givenStringShapeWithoutPatternLocaleAndTimeZone_shouldUseDefaultsFromProvider()
            throws JsonMappingException {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer();
        Locale providerLocale = Locale.FRANCE;
        TimeZone providerTimeZone = TimeZone.getTimeZone("America/New_York");

        JsonFormat.Value formatValue = new JsonFormat.Value("", JsonFormat.Shape.STRING, (String) null, (String) null);
        MockAnnotationIntrospector introspector = new MockAnnotationIntrospector(formatValue);
        MockSerializerProvider provider = new MockSerializerProvider(introspector, false, providerLocale, providerTimeZone);
        MockBeanProperty property = new MockBeanProperty(new MockAnnotatedMember());

        // Act
        JsonSerializer<?> result = serializer.createContextual(provider, property);

        // Assert
        Assert.assertTrue(result instanceof ConcreteDateTimeSerializer);
        ConcreteDateTimeSerializer contextual = (ConcreteDateTimeSerializer) result;
        Assert.assertEquals(Boolean.FALSE, contextual.getUseTimestamp());
        Assert.assertNotNull(contextual.getCustomFormat());
        Assert.assertTrue(contextual.getCustomFormat() instanceof SimpleDateFormat);

        SimpleDateFormat sdf = (SimpleDateFormat) contextual.getCustomFormat();
        Assert.assertEquals(StdDateFormat.DATE_FORMAT_STR_ISO8601, sdf.toPattern());
        Assert.assertEquals(providerTimeZone, sdf.getTimeZone());
    }

    @Test
    public void createContextual_givenOtherShape_shouldReturnSameInstance() throws JsonMappingException {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer();
        JsonFormat.Value formatValue = new JsonFormat.Value("", JsonFormat.Shape.BOOLEAN, (String) null, (String) null);
        MockAnnotationIntrospector introspector = new MockAnnotationIntrospector(formatValue);
        MockSerializerProvider provider = new MockSerializerProvider(introspector, false, null, null);
        MockBeanProperty property = new MockBeanProperty(new MockAnnotatedMember());

        // Act
        JsonSerializer<?> result = serializer.createContextual(provider, property);

        // Assert
        Assert.assertSame(serializer, result);
    }

    // =========================================================================
    // getSchema Tests
    // =========================================================================

    @Test
    public void getSchema_givenTimestampTrue_shouldReturnNumberSchema() {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(Boolean.TRUE, null);

        // Act
        JsonNode schemaNode = serializer.getSchema(null, Date.class);

        // Assert
        Assert.assertNotNull(schemaNode);
        Assert.assertEquals("number", schemaNode.get("type").asText());
        Assert.assertTrue(schemaNode.get("required").asBoolean());
    }

    @Test
    public void getSchema_givenTimestampFalse_shouldReturnStringSchema() {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(Boolean.FALSE, null);

        // Act
        JsonNode schemaNode = serializer.getSchema(null, Date.class);

        // Assert
        Assert.assertNotNull(schemaNode);
        Assert.assertEquals("string", schemaNode.get("type").asText());
        Assert.assertTrue(schemaNode.get("required").asBoolean());
    }

    // =========================================================================
    // acceptJsonFormatVisitor Tests
    // =========================================================================

    @Test
    public void acceptJsonFormatVisitor_givenAsTimestampTrue_shouldVisitIntFormat() throws JsonMappingException {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(Boolean.TRUE, null);
        MockSerializerProvider provider = new MockSerializerProvider(null, true, null, null);
        MockJsonFormatVisitorWrapper visitor = new MockJsonFormatVisitorWrapper(provider);
        JavaType javaType = TypeFactory.defaultInstance().constructType(Date.class);

        // Act
        serializer.acceptJsonFormatVisitor(visitor, javaType);

        // Assert
        Assert.assertTrue(visitor.intVisitorCalled);
        Assert.assertFalse(visitor.stringVisitorCalled);
        Assert.assertEquals(JsonParser.NumberType.LONG, visitor.capturedNumberType);
        Assert.assertEquals(JsonValueFormat.UTC_MILLISEC, visitor.capturedNumberFormat);
    }

    @Test
    public void acceptJsonFormatVisitor_givenAsTimestampFalse_shouldVisitStringFormat() throws JsonMappingException {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(Boolean.FALSE, null);
        MockSerializerProvider provider = new MockSerializerProvider(null, false, null, null);
        MockJsonFormatVisitorWrapper visitor = new MockJsonFormatVisitorWrapper(provider);
        JavaType javaType = TypeFactory.defaultInstance().constructType(Date.class);

        // Act
        serializer.acceptJsonFormatVisitor(visitor, javaType);

        // Assert
        Assert.assertFalse(visitor.intVisitorCalled);
        Assert.assertTrue(visitor.stringVisitorCalled);
        Assert.assertEquals(JsonValueFormat.DATE_TIME, visitor.capturedStringFormat);
    }

    @Test
    public void acceptJsonFormatVisitorHelper_givenAsNumberTrue_shouldVisitIntFormat() throws JsonMappingException {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer();
        MockJsonFormatVisitorWrapper visitor = new MockJsonFormatVisitorWrapper(null);
        JavaType javaType = TypeFactory.defaultInstance().constructType(Date.class);

        // Act
        serializer._acceptJsonFormatVisitor(visitor, javaType, true);

        // Assert
        Assert.assertTrue(visitor.intVisitorCalled);
        Assert.assertFalse(visitor.stringVisitorCalled);
        Assert.assertEquals(JsonParser.NumberType.LONG, visitor.capturedNumberType);
        Assert.assertEquals(JsonValueFormat.UTC_MILLISEC, visitor.capturedNumberFormat);
    }

    @Test
    public void acceptJsonFormatVisitorHelper_givenAsNumberFalse_shouldVisitStringFormat() throws JsonMappingException {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer();
        MockJsonFormatVisitorWrapper visitor = new MockJsonFormatVisitorWrapper(null);
        JavaType javaType = TypeFactory.defaultInstance().constructType(Date.class);

        // Act
        serializer._acceptJsonFormatVisitor(visitor, javaType, false);

        // Assert
        Assert.assertFalse(visitor.intVisitorCalled);
        Assert.assertTrue(visitor.stringVisitorCalled);
        Assert.assertEquals(JsonValueFormat.DATE_TIME, visitor.capturedStringFormat);
    }
}