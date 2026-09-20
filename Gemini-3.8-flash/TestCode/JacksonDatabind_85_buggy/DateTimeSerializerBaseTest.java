package com.fasterxml.jackson.databind.ser.std;

import java.io.IOException;
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
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.StdDateFormat;

public class DateTimeSerializerBaseTest {

    private static class ConcreteDateTimeSerializer extends DateTimeSerializerBase<Date> {
        private static final long serialVersionUID = 1L;
        private JsonFormat.Value _overrideFormat;

        public ConcreteDateTimeSerializer() {
            this(null, null);
        }

        public ConcreteDateTimeSerializer(Boolean useTimestamp, DateFormat customFormat) {
            super(Date.class, useTimestamp, customFormat);
        }

        public void setOverrideFormat(JsonFormat.Value format) {
            this._overrideFormat = format;
        }

        @Override
        protected JsonFormat.Value findFormatOverrides(SerializerProvider serializers,
                BeanProperty property, Class<?> handledType) {
            if (_overrideFormat != null) {
                return _overrideFormat;
            }
            return super.findFormatOverrides(serializers, property, handledType);
        }

        @Override
        public DateTimeSerializerBase<Date> withFormat(Boolean timestamp, DateFormat customFormat) {
            ConcreteDateTimeSerializer ser = new ConcreteDateTimeSerializer(timestamp, customFormat);
            ser.setOverrideFormat(this._overrideFormat);
            return ser;
        }

        @Override
        protected long _timestamp(Date value) {
            return (value == null) ? 0L : value.getTime();
        }

        @Override
        public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        }

        public Boolean getUseTimestamp() {
            return _useTimestamp;
        }

        public DateFormat getCustomFormat() {
            return _customFormat;
        }

        public boolean callAsTimestamp(SerializerProvider serializers) {
            return _asTimestamp(serializers);
        }

        public void callAcceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint, boolean asNumber)
                throws JsonMappingException {
            _acceptJsonFormatVisitor(visitor, typeHint, asNumber);
        }
    }

    private static class StubSerializerProvider extends DefaultSerializerProvider.Impl {
        private static final long serialVersionUID = 1L;
        private boolean _writeDatesAsTimestamps = true;
        private Locale _locale = Locale.US;
        private TimeZone _timeZone = TimeZone.getTimeZone("UTC");

        public StubSerializerProvider() {
            super();
        }

        public StubSerializerProvider(StubSerializerProvider src) {
            super(src);
        }

        @Override
        public DefaultSerializerProvider copy() {
            return new StubSerializerProvider(this);
        }

        @Override
        public DefaultSerializerProvider createInstance(SerializationConfig config, SerializerFactory jsf) {
            return new StubSerializerProvider(this);
        }

        @Override
        public boolean isEnabled(SerializationFeature feature) {
            if (feature == SerializationFeature.WRITE_DATES_AS_TIMESTAMPS) {
                return _writeDatesAsTimestamps;
            }
            return super.isEnabled(feature);
        }

        public void setWriteDatesAsTimestamps(boolean b) {
            this._writeDatesAsTimestamps = b;
        }

        @Override
        public Locale getLocale() {
            return _locale;
        }

        public void setLocale(Locale l) {
            this._locale = l;
        }

        @Override
        public TimeZone getTimeZone() {
            return _timeZone;
        }

        public void setTimeZone(TimeZone tz) {
            this._timeZone = tz;
        }
    }

    private static class StubVisitor extends JsonFormatVisitorWrapper.Base {
        private boolean _visitedInt = false;
        private boolean _visitedString = false;
        private JsonParser.NumberType _intNumberType;
        private JsonValueFormat _intValueFormat;
        private JsonValueFormat _stringValueFormat;
        private final boolean _returnNullSubVisitors;

        public StubVisitor(SerializerProvider provider) {
            this(provider, false);
        }

        public StubVisitor(SerializerProvider provider, boolean returnNullSubVisitors) {
            super(provider);
            this._returnNullSubVisitors = returnNullSubVisitors;
        }

        @Override
        public JsonIntegerFormatVisitor expectIntegerFormat(JavaType type) {
            _visitedInt = true;
            if (_returnNullSubVisitors) {
                return null;
            }
            return new JsonIntegerFormatVisitor.Base() {
                @Override
                public void numberType(JsonParser.NumberType type) {
                    _intNumberType = type;
                }

                @Override
                public void format(JsonValueFormat format) {
                    _intValueFormat = format;
                }
            };
        }

        @Override
        public JsonStringFormatVisitor expectStringFormat(JavaType type) {
            _visitedString = true;
            if (_returnNullSubVisitors) {
                return null;
            }
            return new JsonStringFormatVisitor.Base() {
                @Override
                public void format(JsonValueFormat format) {
                    _stringValueFormat = format;
                }
            };
        }

        public boolean isVisitedInt() {
            return _visitedInt;
        }

        public boolean isVisitedString() {
            return _visitedString;
        }

        public JsonParser.NumberType getIntNumberType() {
            return _intNumberType;
        }

        public JsonValueFormat getIntValueFormat() {
            return _intValueFormat;
        }

        public JsonValueFormat getStringValueFormat() {
            return _stringValueFormat;
        }
    }

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
        Date date = new Date(0L);

        // Act
        boolean result = serializer.isEmpty(date);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void isEmpty_givenNonZeroTimestamp_shouldReturnFalse() {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer();
        Date date = new Date(123456789L);

        // Act
        boolean result = serializer.isEmpty(date);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void isEmpty_withSerializerProvider_givenNullValue_shouldReturnTrue() {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer();
        StubSerializerProvider provider = new StubSerializerProvider();

        // Act
        boolean result = serializer.isEmpty(provider, null);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void isEmpty_withSerializerProvider_givenZeroTimestamp_shouldReturnTrue() {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer();
        StubSerializerProvider provider = new StubSerializerProvider();
        Date date = new Date(0L);

        // Act
        boolean result = serializer.isEmpty(provider, date);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void isEmpty_withSerializerProvider_givenNonZeroTimestamp_shouldReturnFalse() {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer();
        StubSerializerProvider provider = new StubSerializerProvider();
        Date date = new Date(123456789L);

        // Act
        boolean result = serializer.isEmpty(provider, date);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void asTimestamp_givenUseTimestampTrue_shouldReturnTrue() {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(Boolean.TRUE, null);

        // Act
        boolean result = serializer.callAsTimestamp(null);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void asTimestamp_givenUseTimestampFalse_shouldReturnFalse() {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(Boolean.FALSE, null);

        // Act
        boolean result = serializer.callAsTimestamp(null);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void asTimestamp_givenNullUseTimestampAndNullCustomFormatAndProviderTimestampEnabled_shouldReturnTrue() {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, null);
        StubSerializerProvider provider = new StubSerializerProvider();
        provider.setWriteDatesAsTimestamps(true);

        // Act
        boolean result = serializer.callAsTimestamp(provider);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void asTimestamp_givenNullUseTimestampAndNullCustomFormatAndProviderTimestampDisabled_shouldReturnFalse() {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, null);
        StubSerializerProvider provider = new StubSerializerProvider();
        provider.setWriteDatesAsTimestamps(false);

        // Act
        boolean result = serializer.callAsTimestamp(provider);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void asTimestamp_givenNullUseTimestampAndNullCustomFormatAndNullProvider_shouldThrowIllegalArgumentException() {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, null);

        // Act & Assert
        try {
            serializer.callAsTimestamp(null);
            Assert.fail("Expected IllegalArgumentException when SerializerProvider is null");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().indexOf("Null SerializerProvider passed for") >= 0);
        }
    }

    @Test
    public void asTimestamp_givenNullUseTimestampAndNonNullCustomFormat_shouldReturnFalse() {
        // Arrange
        SimpleDateFormat customFormat = new SimpleDateFormat("yyyy-MM-dd");
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(null, customFormat);
        StubSerializerProvider provider = new StubSerializerProvider();

        // Act
        boolean result = serializer.callAsTimestamp(provider);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void createContextual_givenNullProperty_shouldReturnSameInstance() throws JsonMappingException {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer();
        StubSerializerProvider provider = new StubSerializerProvider();

        // Act
        JsonSerializer<?> result = serializer.createContextual(provider, null);

        // Assert
        Assert.assertSame(serializer, result);
    }

    @Test
    public void createContextual_givenNullFormat_shouldReturnSameInstance() throws JsonMappingException {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer() {
            private static final long serialVersionUID = 1L;

            @Override
            protected JsonFormat.Value findFormatOverrides(SerializerProvider serializers,
                    BeanProperty property, Class<?> handledType) {
                return null;
            }
        };
        StubSerializerProvider provider = new StubSerializerProvider();
        BeanProperty property = new BeanProperty.Bogus();

        // Act
        JsonSerializer<?> result = serializer.createContextual(provider, property);

        // Assert
        Assert.assertSame(serializer, result);
    }

    @Test
    public void createContextual_givenNumericShape_shouldReturnWithTimestampTrue() throws JsonMappingException {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer();
        JsonFormat.Value format = new JsonFormat.Value().withShape(JsonFormat.Shape.NUMBER);
        serializer.setOverrideFormat(format);
        StubSerializerProvider provider = new StubSerializerProvider();
        BeanProperty property = new BeanProperty.Bogus();

        // Act
        JsonSerializer<?> result = serializer.createContextual(provider, property);

        // Assert
        Assert.assertNotSame(serializer, result);
        Assert.assertTrue(result instanceof ConcreteDateTimeSerializer);
        ConcreteDateTimeSerializer concreteResult = (ConcreteDateTimeSerializer) result;
        Assert.assertEquals(Boolean.TRUE, concreteResult.getUseTimestamp());
        Assert.assertNull(concreteResult.getCustomFormat());
    }

    @Test
    public void createContextual_givenStringShapeWithoutPatternLocaleTz_shouldUseDefaults() throws JsonMappingException {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer();
        JsonFormat.Value format = new JsonFormat.Value().withShape(JsonFormat.Shape.STRING);
        serializer.setOverrideFormat(format);
        StubSerializerProvider provider = new StubSerializerProvider();
        provider.setLocale(Locale.GERMANY);
        TimeZone providerTz = TimeZone.getTimeZone("GMT+3");
        provider.setTimeZone(providerTz);
        BeanProperty property = new BeanProperty.Bogus();

        // Act
        JsonSerializer<?> result = serializer.createContextual(provider, property);

        // Assert
        Assert.assertTrue(result instanceof ConcreteDateTimeSerializer);
        ConcreteDateTimeSerializer concreteResult = (ConcreteDateTimeSerializer) result;
        Assert.assertEquals(Boolean.FALSE, concreteResult.getUseTimestamp());
        DateFormat df = concreteResult.getCustomFormat();
        Assert.assertTrue(df instanceof SimpleDateFormat);
        SimpleDateFormat sdf = (SimpleDateFormat) df;
        Assert.assertEquals(StdDateFormat.DATE_FORMAT_STR_ISO8601, sdf.toPattern());
        Assert.assertEquals(providerTz.getID(), sdf.getTimeZone().getID());
    }

    @Test
    public void createContextual_givenCustomPatternAndTzAndLocale_shouldApplyThem() throws JsonMappingException {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer();
        TimeZone customTz = TimeZone.getTimeZone("GMT+5");
        JsonFormat.Value format = new JsonFormat.Value()
                .withPattern("yyyy/MM/dd HH:mm:ss")
                .withLocale(Locale.JAPAN)
                .withTimeZone(customTz);
        serializer.setOverrideFormat(format);
        StubSerializerProvider provider = new StubSerializerProvider();
        BeanProperty property = new BeanProperty.Bogus();

        // Act
        JsonSerializer<?> result = serializer.createContextual(provider, property);

        // Assert
        Assert.assertTrue(result instanceof ConcreteDateTimeSerializer);
        ConcreteDateTimeSerializer concreteResult = (ConcreteDateTimeSerializer) result;
        Assert.assertEquals(Boolean.FALSE, concreteResult.getUseTimestamp());
        DateFormat df = concreteResult.getCustomFormat();
        Assert.assertTrue(df instanceof SimpleDateFormat);
        SimpleDateFormat sdf = (SimpleDateFormat) df;
        Assert.assertEquals("yyyy/MM/dd HH:mm:ss", sdf.toPattern());
        Assert.assertEquals(customTz.getID(), sdf.getTimeZone().getID());
    }

    @Test
    public void createContextual_givenOnlyPattern_shouldUseDefaultsForLocaleAndTz() throws JsonMappingException {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer();
        JsonFormat.Value format = new JsonFormat.Value().withPattern("dd-MM-yyyy");
        serializer.setOverrideFormat(format);
        StubSerializerProvider provider = new StubSerializerProvider();
        provider.setLocale(Locale.FRANCE);
        TimeZone providerTz = TimeZone.getTimeZone("GMT-5");
        provider.setTimeZone(providerTz);
        BeanProperty property = new BeanProperty.Bogus();

        // Act
        JsonSerializer<?> result = serializer.createContextual(provider, property);

        // Assert
        Assert.assertTrue(result instanceof ConcreteDateTimeSerializer);
        ConcreteDateTimeSerializer concreteResult = (ConcreteDateTimeSerializer) result;
        Assert.assertEquals(Boolean.FALSE, concreteResult.getUseTimestamp());
        DateFormat df = concreteResult.getCustomFormat();
        Assert.assertTrue(df instanceof SimpleDateFormat);
        SimpleDateFormat sdf = (SimpleDateFormat) df;
        Assert.assertEquals("dd-MM-yyyy", sdf.toPattern());
        Assert.assertEquals(providerTz.getID(), sdf.getTimeZone().getID());
    }

    @Test
    public void createContextual_givenOnlyLocale_shouldUseDefaultPatternAndTz() throws JsonMappingException {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer();
        JsonFormat.Value format = new JsonFormat.Value().withLocale(Locale.ITALY);
        serializer.setOverrideFormat(format);
        StubSerializerProvider provider = new StubSerializerProvider();
        TimeZone providerTz = TimeZone.getTimeZone("GMT-8");
        provider.setTimeZone(providerTz);
        BeanProperty property = new BeanProperty.Bogus();

        // Act
        JsonSerializer<?> result = serializer.createContextual(provider, property);

        // Assert
        Assert.assertTrue(result instanceof ConcreteDateTimeSerializer);
        ConcreteDateTimeSerializer concreteResult = (ConcreteDateTimeSerializer) result;
        Assert.assertEquals(Boolean.FALSE, concreteResult.getUseTimestamp());
        DateFormat df = concreteResult.getCustomFormat();
        Assert.assertTrue(df instanceof SimpleDateFormat);
        SimpleDateFormat sdf = (SimpleDateFormat) df;
        Assert.assertEquals(StdDateFormat.DATE_FORMAT_STR_ISO8601, sdf.toPattern());
        Assert.assertEquals(providerTz.getID(), sdf.getTimeZone().getID());
    }

    @Test
    public void createContextual_givenOnlyTimeZone_shouldUseDefaultPatternAndLocale() throws JsonMappingException {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer();
        TimeZone customTz = TimeZone.getTimeZone("GMT+9");
        JsonFormat.Value format = new JsonFormat.Value().withTimeZone(customTz);
        serializer.setOverrideFormat(format);
        StubSerializerProvider provider = new StubSerializerProvider();
        BeanProperty property = new BeanProperty.Bogus();

        // Act
        JsonSerializer<?> result = serializer.createContextual(provider, property);

        // Assert
        Assert.assertTrue(result instanceof ConcreteDateTimeSerializer);
        ConcreteDateTimeSerializer concreteResult = (ConcreteDateTimeSerializer) result;
        Assert.assertEquals(Boolean.FALSE, concreteResult.getUseTimestamp());
        DateFormat df = concreteResult.getCustomFormat();
        Assert.assertTrue(df instanceof SimpleDateFormat);
        SimpleDateFormat sdf = (SimpleDateFormat) df;
        Assert.assertEquals(StdDateFormat.DATE_FORMAT_STR_ISO8601, sdf.toPattern());
        Assert.assertEquals(customTz.getID(), sdf.getTimeZone().getID());
    }

    @Test
    public void createContextual_givenNonStringNonNumericShapeWithoutOverrides_shouldReturnSameInstance()
            throws JsonMappingException {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer();
        JsonFormat.Value format = new JsonFormat.Value().withShape(JsonFormat.Shape.OBJECT);
        serializer.setOverrideFormat(format);
        StubSerializerProvider provider = new StubSerializerProvider();
        BeanProperty property = new BeanProperty.Bogus();

        // Act
        JsonSerializer<?> result = serializer.createContextual(provider, property);

        // Assert
        Assert.assertSame(serializer, result);
    }

    @Test
    public void getSchema_givenAsTimestampTrue_shouldReturnNumberTypeNode() {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(Boolean.TRUE, null);
        StubSerializerProvider provider = new StubSerializerProvider();

        // Act
        JsonNode node = serializer.getSchema(provider, (Type) Date.class);

        // Assert
        Assert.assertNotNull(node);
        Assert.assertEquals("number", node.get("type").asText());
        Assert.assertTrue(node.get("optional").asBoolean());
    }

    @Test
    public void getSchema_givenAsTimestampFalse_shouldReturnStringTypeNode() {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(Boolean.FALSE, null);
        StubSerializerProvider provider = new StubSerializerProvider();

        // Act
        JsonNode node = serializer.getSchema(provider, (Type) Date.class);

        // Assert
        Assert.assertNotNull(node);
        Assert.assertEquals("string", node.get("type").asText());
        Assert.assertTrue(node.get("optional").asBoolean());
    }

    @Test
    public void acceptJsonFormatVisitor_givenTimestampEnabled_shouldVisitIntFormat() throws JsonMappingException {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(Boolean.TRUE, null);
        StubSerializerProvider provider = new StubSerializerProvider();
        StubVisitor visitor = new StubVisitor(provider);
        JavaType typeHint = TypeFactory.defaultInstance().constructType(Date.class);

        // Act
        serializer.acceptJsonFormatVisitor(visitor, typeHint);

        // Assert
        Assert.assertTrue(visitor.isVisitedInt());
        Assert.assertFalse(visitor.isVisitedString());
        Assert.assertEquals(JsonParser.NumberType.LONG, visitor.getIntNumberType());
        Assert.assertEquals(JsonValueFormat.UTC_MILLISEC, visitor.getIntValueFormat());
    }

    @Test
    public void acceptJsonFormatVisitor_givenTimestampDisabled_shouldVisitStringFormat() throws JsonMappingException {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer(Boolean.FALSE, null);
        StubSerializerProvider provider = new StubSerializerProvider();
        StubVisitor visitor = new StubVisitor(provider);
        JavaType typeHint = TypeFactory.defaultInstance().constructType(Date.class);

        // Act
        serializer.acceptJsonFormatVisitor(visitor, typeHint);

        // Assert
        Assert.assertFalse(visitor.isVisitedInt());
        Assert.assertTrue(visitor.isVisitedString());
        Assert.assertEquals(JsonValueFormat.DATE_TIME, visitor.getStringValueFormat());
    }

    @Test
    public void acceptJsonFormatVisitor_directCallWithAsNumberTrue_givenNullIntVisitor_shouldNotThrowException()
            throws JsonMappingException {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer();
        StubSerializerProvider provider = new StubSerializerProvider();
        StubVisitor visitor = new StubVisitor(provider, true);
        JavaType typeHint = TypeFactory.defaultInstance().constructType(Date.class);

        // Act
        serializer.callAcceptJsonFormatVisitor(visitor, typeHint, true);

        // Assert
        Assert.assertTrue(visitor.isVisitedInt());
    }

    @Test
    public void acceptJsonFormatVisitor_directCallWithAsNumberFalse_givenNullStringVisitor_shouldNotThrowException()
            throws JsonMappingException {
        // Arrange
        ConcreteDateTimeSerializer serializer = new ConcreteDateTimeSerializer();
        StubSerializerProvider provider = new StubSerializerProvider();
        StubVisitor visitor = new StubVisitor(provider, true);
        JavaType typeHint = TypeFactory.defaultInstance().constructType(Date.class);

        // Act
        serializer.callAcceptJsonFormatVisitor(visitor, typeHint, false);

        // Assert
        Assert.assertTrue(visitor.isVisitedString());
    }
}