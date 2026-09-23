package com.fasterxml.jackson.databind;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.exc.*;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import com.fasterxml.jackson.databind.util.RootValueDeserializer;

public class DeserializationContextTest extends DeserializationContext {

    private DeserializationContext ctx;
    private JsonParser parser;
    private DeserializationConfig config;
    private DeserializerFactory factory;
    private ContextAttributes attributes;
    private JsonInjectableValues injectableValues;
    private DeserializationCache cache;
    private AnnotationIntrospector annotationIntrospector;
    private TypeFactory typeFactory;
    private ObjectReadContext readContext;

    public DeserializationContextTest() {
        super(null, null, null, null, null, null, null);
    }

    @Before
    public void setUp() {
        parser = mockParser();
        config = mockConfig();
        factory = mockFactory();
        attributes = ContextAttributes.getEmpty();
        injectableValues = new JsonInjectableValues.Std();
        cache = new DeserializationCache();
        annotationIntrospector = new JacksonAnnotationIntrospector();
        typeFactory = TypeFactory.defaultInstance();
        readContext = mockReadContext();
        ctx = new DeserializationContextTest.Impl(parser, config, factory, attributes, injectableValues, cache, annotationIntrospector, typeFactory);
    }

    private JsonParser mockParser() {
        return new JsonParser() {
            @Override public ObjectCodec getCodec() { return null; }
            @Override public void setCodec(ObjectCodec c) {}
            @Override public void close() throws IOException {}
            @Override public boolean isClosed() { return false; }
            @Override public JsonToken nextToken() throws IOException { return null; }
            @Override public JsonToken nextValue() throws IOException { return null; }
            @Override public void finishRecursiveParsing() throws IOException {}
            @Override public JsonLocation getCurrentLocation() { return null; }
            @Override public JsonLocation getTokenLocation() { return null; }
            @Override public JsonStreamContext getParsingContext() { return null; }
            @Override public String getCurrentName() throws IOException { return null; }
            @Override public JsonToken getCurrentToken() { return null; }
            @Override public boolean hasCurrentToken() { return false; }
            @Override public void clearCurrentToken() {}
            @Override public int getCurrentTokenId() { return 0; }
            @Override public String getText() throws IOException { return null; }
            @Override public byte[] getBinaryValue(Base64Variant b64variant) throws IOException { return new byte[0]; }
            @Override public int getValueAsInt(int def) throws IOException { return 0; }
            @Override public long getValueAsLong(long def) throws IOException { return 0; }
            @Override public double getValueAsDouble(double def) throws IOException { return 0; }
            @Override public boolean getValueAsBoolean(boolean def) throws IOException { return false; }
            @Override public String getValueAsString(String def) throws IOException { return null; }
            @Override public int getValueAsInt() throws IOException { return 0; }
            @Override public long getValueAsLong() throws IOException { return 0; }
            @Override public double getValueAsDouble() throws IOException { return 0; }
            @Override public boolean getValueAsBoolean() throws IOException { return false; }
            @Override public String getValueAsString() throws IOException { return null; }
            @Override public boolean canReadObjectId() { return false; }
            @Override public boolean canReadTypeId() { return false; }
        };
    }

    private DeserializationConfig mockConfig() {
        return new DeserializationConfig(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null) {
            @Override
            public boolean isEnabled(DeserializationFeature f) {
                if (f == DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES) return true;
                return false;
            }
        };
    }

    private DeserializerFactory mockFactory() {
        return new DeserializerFactory(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    private ObjectReadContext mockReadContext() {
        return new ObjectReadContext() {
            @Override
            public DeserializationConfig getConfig() { return config; }
            @Override
            public Object getAttribute(Object key) { return null; }
            @Override
            public ObjectReadContext withAttrs(ObjectReadContext parent) { return null; }
            @Override
            public ObjectReadContext withAttributes(Map<?, ?> attrs) { return null; }
            @Override
            public ObjectReadContext withAttribute(Object key, Object value) { return null; }
            @Override
            public ObjectReadContext withoutAttribute(Object key) { return null; }
            @Override
            public ContextAttributes getAttributes() { return null; }
            @Override
            public JsonParser getParser() { return ctx.getParser(); }
            @Override
            public <T> T readValue(JsonParser p, Class<T> type) throws IOException { return ctx.readValue(p, type); }
            @Override
            public <T> T readValue(JsonParser p, JavaType type) throws IOException { return ctx.readValue(p, type); }
            @Override
            public <T> T readValue(JsonParser p, TypeReference<T> typeRef) throws IOException { return ctx.readValue(p, typeRef); }
            @Override
            public <T> T readValue(byte[] src, Class<T> type) throws IOException { return null; }
            @Override
            public <T> T readValue(byte[] src, int offset, int len, Class<T> valueType) throws IOException { return null; }
            @Override
            public <T> T readValue(byte[] src, int offset, int len, TypeReference<T> valueTypeRef) throws IOException { return null; }
        };
    }

    @Test
    public void testGetConfig() {
        assertSame(config, ctx.getConfig());
    }

    @Test
    public void testGetActiveView_NonNull() {
        ctx.setActiveView(String.class);
        assertEquals(String.class, ctx.getActiveView());
    }

    @Test
    public void testGetActiveView_Null() {
        ctx.setActiveView(null);
        assertNull(ctx.getActiveView());
    }

    @Test
    public void testCanOverrideAccessModifiers() {
        assertTrue(ctx.canOverrideAccessModifiers());
    }

    @Test
    public void testHasDeserializationFeatures() {
        assertTrue(ctx.hasDeserializationFeatures(config.getDeserializationFeatures()));
    }

    @Test
    public void testHasSomeOfFeatures() {
        assertTrue(ctx.hasSomeOfFeatures(config.getDeserializationFeatures()));
    }

    @Test
    public void testIsEnabled_True() {
        assertTrue(ctx.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testIsEnabled_False() {
        assertFalse(ctx.isEnabled(DeserializationFeature.FAIL_ON_READING_DUP_TREE_VALUE));
    }

    @Test
    public void testGetParser() {
        assertSame(parser, ctx.getParser());
    }

    @Test
    public void testFindInjectableValue_WhenNull() {
        ctx.setInjectableValues(null);
        try {
            ctx.findInjectableValue("id", null, null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("No 'injectableValues' configured, cannot inject value with id [id]", e.getMessage());
        }
    }

    @Test
    public void testFindInjectableValue_NonNull() {
        ctx.setInjectableValues(injectableValues);
        Object value = ctx.findInjectableValue("id", null, null);
        assertNull(value);
    }

    @Test
    public void testGetBase64Variant() {
        assertNotNull(ctx.getBase64Variant());
    }

    @Test
    public void testGetNodeFactory() {
        assertEquals(JsonNodeFactory.instance, ctx.getNodeFactory());
    }

    @Test
    public void testHasValueDeserializerFor_FalseDueToException() {
        DeserializationCache c = new DeserializationCache() {
            @Override
            public boolean hasValueDeserializerFor(DeserializationContext ctxt, DeserializerFactory f, JavaType type) throws JsonMappingException {
                throw new JsonMappingException(null, "test exception");
            }
        };
        ctx.setCache(c);
        assertFalse(ctx.hasValueDeserializerFor(TypeFactory.unknownType(), null));
    }

    @Test
    public void testHasValueDeserializerFor_RuntimeException() {
        DeserializationCache c = new DeserializationCache() {
            @Override
            public boolean hasValueDeserializerFor(DeserializationContext ctxt, DeserializerFactory f, JavaType type) throws JsonMappingException {
                throw new RuntimeException();
            }
        };
        ctx.setCache(c);
        try {
            ctx.hasValueDeserializerFor(TypeFactory.unknownType(), null);
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // expected
        }
    }

    @Test
    public void testFindRootValueDeserializer_WhenDeserNull() throws Exception {
        DeserializationCache c = new DeserializationCache() {
            @Override
            public JsonDeserializer<Object> findValueDeserializer(DeserializationContext ctxt, DeserializerFactory f, JavaType type) throws JsonMappingException {
                return null;
            }
        };
        ctx.setCache(c);
        assertNull(ctx.findRootValueDeserializer(TypeFactory.unknownType()));
    }

    @Test
    public void testFindRootValueDeserializer_WhenTypeDeser() throws Exception {
        DeserializationCache c = new DeserializationCache() {
            @Override
            public JsonDeserializer<Object> findValueDeserializer(DeserializationContext ctxt, DeserializerFactory f, JavaType type) throws JsonMappingException {
                return new JsonDeserializer<Object>() {
                    @Override
                    public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                        return null;
                    }
                };
            }
        };
        ctx.setCache(c);
        JsonDeserializer<Object> deser = ctx.findRootValueDeserializer(TypeFactory.unknownType());
        assertNotNull(deser);
    }

    @Test
    public void testCheckUnresolvedObjectId_Null() {
        try {
            ctx.checkUnresolvedObjectId();
        } catch (Exception e) {
            fail("Unexpected exception");
        }
    }

    @Test
    public void testConstructType_Null() {
        assertNull(ctx.constructType(null));
    }

    @Test
    public void testConstructType_NonNull() {
        JavaType type = ctx.constructType(String.class);
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testFindClass_Null() throws ClassNotFoundException {
        try {
            ctx.findClass(null);
            fail("Expected ClassNotFoundException");
        } catch (ClassNotFoundException e) {
            // expected
        }
    }

    @Test
    public void testFindClass_Valid() throws ClassNotFoundException {
        Class<?> cls = ctx.findClass("java.lang.String");
        assertEquals(String.class, cls);
    }

    @Test
    public void testLeaseObjectBuffer_WhenNull() {
        ObjectBuffer buf = ctx.leaseObjectBuffer();
        assertNotNull(buf);
    }

    @Test
    public void testLeaseObjectBuffer_SecondCall() {
        ObjectBuffer buf1 = ctx.leaseObjectBuffer();
        ctx.returnObjectBuffer(buf1);
        ObjectBuffer buf2 = ctx.leaseObjectBuffer();
        assertSame(buf1, buf2);
    }

    @Test
    public void testGetArrayBuilders_WhenNull() {
        ArrayBuilders builders = ctx.getArrayBuilders();
        assertNotNull(builders);
    }

    @Test
    public void testGetArrayBuilders_SecondCall() {
        ArrayBuilders b1 = ctx.getArrayBuilders();
        ArrayBuilders b2 = ctx.getArrayBuilders();
        assertSame(b1, b2);
    }

    @Test
    public void testParseDate_Valid() throws ParseException {
        Date date = ctx.parseDate("2021-01-01");
        assertNotNull(date);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal.setTime(date);
        assertEquals(2021, cal.get(Calendar.YEAR));
    }

    @Test
    public void testParseDate_Invalid() {
        try {
            ctx.parseDate("invalid-date");
            fail("Expected InvalidFormatException");
        } catch (InvalidFormatException e) {
            assertTrue(e.getMessage().contains("Failed to parse Date value"));
        }
    }

    @Test
    public void testConstructCalendar() {
        Date date = new Date(123456789L);
        Calendar cal = ctx.constructCalendar(date);
        assertEquals(date, cal.getTime());
    }

    @Test
    public void testReadValue_ClassType() throws IOException {
        DeserializationContext ctxMock = new Impl(parser, config, factory, attributes, injectableValues, cache, annotationIntrospector, typeFactory) {
            @Override
            public <T> T readValue(JsonParser p, Class<T> type) throws IOException {
                return null;
            }
        };
        assertNull(ctxMock.readValue(parser, String.class));
    }

    @Test
    public void testHandleUnknownProperty_WithUnknownPropertiesDisabled() throws IOException {
        DeserializationFeature f = DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
        boolean original = ctx.isEnabled(f);
        ctx.setConfig(config.with(f, false));
        assertFalse(ctx.handleUnknownProperty(parser, null, null, "prop"));
        ctx.setConfig(config.with(f, original));
    }

    @Test
    public void testHandleWeirdKey_WhenHandlerReturnsNull() throws IOException {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {
            @Override
            public Object handleWeirdKey(DeserializationContext ctxt, Class<?> keyClass, String keyValue, String msg) throws IOException {
                return null;
            }
        };
        ctx.addProblemHandler(h);
        assertNull(ctx.handleWeirdKey(String.class, "k", "msg"));
    }

    @Test
    public void testHandleWeirdKey_Incompatible() throws IOException {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {
            @Override
            public Object handleWeirdKey(DeserializationContext ctxt, Class<?> keyClass, String keyValue, String msg) throws IOException {
                return "value";
            }
        };
        ctx.addProblemHandler(h);
        try {
            ctx.handleWeirdKey(Integer.class, "k", "msg");
            fail("Expected InvalidFormatException");
        } catch (InvalidFormatException e) {
            // expected
        }
    }

    @Test
    public void testHandleWeirdStringValue_Incompatible() throws IOException {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {
            @Override
            public Object handleWeirdStringValue(DeserializationContext ctxt, Class<?> targetClass, String value, String msg) throws IOException {
                return "not-integer";
            }
        };
        ctx.addProblemHandler(h);
        try {
            ctx.handleWeirdStringValue(Integer.class, "abc", "msg");
            fail("Expected InvalidFormatException");
        } catch (InvalidFormatException e) {
            // expected
        }
    }

    @Test
    public void testHandleWeirdNumberValue_Incompatible() throws IOException {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {
            @Override
            public Object handleWeirdNumberValue(DeserializationContext ctxt, Class<?> targetClass, Number value, String msg) throws IOException {
                return "not-integer";
            }
        };
        ctx.addProblemHandler(h);
        try {
            ctx.handleWeirdNumberValue(Integer.class, 5, "msg");
            fail("Expected InvalidFormatException");
        } catch (InvalidFormatException e) {
            // expected
        }
    }

    @Test
    public void testHandleMissingInstantiator_NotHandled() throws IOException {
        assertNotNull(ctx.handleMissingInstantiator(String.class, null, parser, null));
    }

    @Test
    public void testHandleMissingInstantiator_HandledIncompatible() throws IOException {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {
            @Override
            public Object handleMissingInstantiator(DeserializationContext ctxt, Class<?> instClass, ValueInstantiator valueInst, JsonParser p, String msg) throws IOException {
                return "not-string";
            }
        };
        ctx.addProblemHandler(h);
        try {
            ctx.handleMissingInstantiator(String.class, null, parser, null);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testHandleInstantiationProblem_HandledIncompatible() throws IOException {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {
            @Override
            public Object handleInstantiationProblem(DeserializationContext ctxt, Class<?> instClass, Object argument, Throwable t) throws IOException {
                return "not-integer";
            }
        };
        ctx.addProblemHandler(h);
        try {
            ctx.handleInstantiationProblem(Integer.class, null, new RuntimeException());
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testHandleUnexpectedToken_HandledNull() throws IOException {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {
            @Override
            public Object handleUnexpectedToken(DeserializationContext ctxt, Class<?> instClass, JsonToken t, JsonParser p, String msg) throws IOException {
                return null;
            }
        };
        ctx.addProblemHandler(h);
        // Should just return null
        assertNull(ctx.handleUnexpectedToken(String.class, JsonToken.VALUE_STRING, parser, null));
    }

    @Test
    public void testHandleUnexpectedToken_HandledIncompatible() throws IOException {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {
            @Override
            public Object handleUnexpectedToken(DeserializationContext ctxt, Class<?> instClass, JsonToken t, JsonParser p, String msg) throws IOException {
                return "not-integer";
            }
        };
        ctx.addProblemHandler(h);
        try {
            ctx.handleUnexpectedToken(Integer.class, JsonToken.VALUE_STRING, parser, null);
            fail("Expected MismatchedInputException");
        } catch (MismatchedInputException e) {
            // expected
        }
    }

    @Test
    public void testHandleUnknownTypeId_HandledIncompatible() throws IOException {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {
            @Override
            public JavaType handleUnknownTypeId(DeserializationContext ctxt, JavaType baseType, String id, TypeIdResolver idResolver, String extraDesc) throws IOException {
                return TypeFactory.unknownType();
            }
        };
        ctx.addProblemHandler(h);
        try {
            ctx.handleUnknownTypeId(TypeFactory.unknownType(), "id", null, null);
            fail("Expected InvalidTypeIdException");
        } catch (InvalidTypeIdException e) {
            // expected
        }
    }

    @Test
    public void testHandleUnknownTypeId_Handled() throws IOException {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {
            @Override
            public JavaType handleUnknownTypeId(DeserializationContext ctxt, JavaType baseType, String id, TypeIdResolver idResolver, String extraDesc) throws IOException {
                return TypeFactory.defaultInstance().constructType(String.class);
            }
        };
        ctx.addProblemHandler(h);
        assertEquals(String.class, ctx.handleUnknownTypeId(TypeFactory.defaultInstance().constructType(Number.class), "id", null, null).getRawClass());
    }

    @Test
    public void testHandleMissingTypeId_Handled() throws IOException {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {
            @Override
            public JavaType handleMissingTypeId(DeserializationContext ctxt, JavaType baseType, TypeIdResolver idResolver, String extraDesc) throws IOException {
                return TypeFactory.defaultInstance().constructType(String.class);
            }
        };
        ctx.addProblemHandler(h);
        assertEquals(String.class, ctx.handleMissingTypeId(TypeFactory.defaultInstance().constructType(Number.class), null, null).getRawClass());
    }

    @Test
    public void testIsCompatible_NullAndPrimitive() {
        assertTrue(ctx._isCompatible(Integer.TYPE, 5));
        assertFalse(ctx._isCompatible(Integer.class, null));
    }

    @Test
    public void testReportWrongTokenException() {
        try {
            ctx.reportWrongTokenException(String.class, JsonToken.VALUE_NUMBER_INT, "msg", new Object[0]);
            fail("Expected MismatchedInputException");
        } catch (MismatchedInputException e) {
            // expected
        }
    }

    @Test
    public void testReportBadTypeDefinition_Ignored() {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {
            @Override
            public Object handleUnexpectedToken(DeserializationContext ctxt, Class<?> instClass, JsonToken t, JsonParser p, String msg) throws IOException {
                return null;
            }
        };
        ctx.addProblemHandler(h);
        assertNull(ctx.reportBadTypeDefinition(null, "msg"));
    }

    @Test
    public void testReportBadTypeDefinition_Throws() {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {
            @Override
            public Object handleUnexpectedToken(DeserializationContext ctxt, Class<?> instClass, JsonToken t, JsonParser p, String msg) throws IOException {
                return DeserializationProblemHandler.NOT_HANDLED;
            }
        };
        ctx.addProblemHandler(h);
        try {
            ctx.reportBadTypeDefinition(ApplicationException.class, "msg");
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testReportWrongTokenException_WithJavaType() {
        try {
            ctx.reportWrongTokenException(TypeFactory.unknownType(), JsonToken.VALUE_STRING, "msg");
            fail("Expected MismatchedInputException");
        } catch (MismatchedInputException e) {
            // expected
        }
    }

    @Test
    public void testReportWrongTokenException_WithHandler() {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {
            @Override
            public Object handleWrongToken(DeserializationContext ctxt, JsonToken expected, JsonToken actual, JsonParser p, String msg) throws IOException {
                return "handled";
            }
        };
        ctx.addProblemHandler(h);
        assertEquals("handled", ctx.reportWrongTokenException(String.class, JsonToken.VALUE_STRING, parser, "msg"));
    }

    @Test
    public void testReportWrongTokenException_NullHandler() {
        try {
            ctx.reportWrongTokenException(String.class, JsonToken.VALUE_NUMBER_INT, parser, "msg");
            fail("Expected MismatchedInputException");
        } catch (MismatchedInputException e) {
            // expected
        }
    }

    @Test
    public void testReportInputMismatch_WithHandler() {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {
            @Override
            public Object handleUnexpectedToken(DeserializationContext ctxt, Class<?> instClass, JsonToken t, JsonParser p, String msg) throws IOException {
                return "handled";
            }
        };
        ctx.addProblemHandler(h);
        assertEquals("handled", ctx.reportInputMismatch(String.class, JsonToken.VALUE_STRING, "msg"));
    }

    @Test
    public void testHandleTrailingTokens_WithHandler() {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {
            @Override
            public Object handleUnexpectedToken(DeserializationContext ctxt, Class<?> instClass, JsonToken t, JsonParser p, String msg) throws IOException {
                return "handled";
            }
        };
        ctx.addProblemHandler(h);
        try {
            ctx.reportTrailingTokens(String.class, parser, JsonToken.VALUE_STRING);
            fail("Expected MismatchedInputException");
        } catch (MismatchedInputException e) {
            // expected
        }
    }

    @Test
    public void testHandleTrailingTokens_NoHandler() {
        try {
            ctx.reportTrailingTokens(String.class, parser, JsonToken.VALUE_STRING);
            fail("Expected MismatchedInputException");
        } catch (MismatchedInputException e) {
            // expected
        }
    }

    @Test
    public void testReportMissingContent_Throws() {
        try {
            ctx.reportMissingContent("msg", new Object[0]);
            fail("Expected MismatchedInputException");
        } catch (MismatchedInputException e) {
            // expected
        }
    }

    @Test
    public void testReportBadDefinition_Message() {
        try {
            ctx.reportBadDefinition(TypeFactory.unknownType(), "bad def");
            fail("Expected InvalidDefinitionException");
        } catch (InvalidDefinitionException e) {
            // expected
        }
    }

    @Test
    public void testReportBadPropertyValue_WithHandler() {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {
            @Override
            public Object handleBadProperty(DeserializationContext ctxt, JavaType type, Object instance, String propName, Object value, String msg) throws IOException {
                return "handled";
            }
        };
        ctx.addProblemHandler(h);
        assertEquals("handled", ctx.reportBadPropertyValue(String.class, null, "prop", "msg"));
    }

    @Test
    public void testHandleWeirdNativeValue_Incompatible() throws IOException {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {
            @Override
            public Object handleWeirdNativeValue(DeserializationContext ctxt, JavaType targetType, Object badValue, JsonParser p) throws IOException {
                return "not-integer";
            }
        };
        ctx.addProblemHandler(h);
        try {
            ctx.handleWeirdNativeValue(TypeFactory.unknownType(), "bad", parser);
            fail("Expected InvalidFormatException");
        } catch (InvalidFormatException e) {
            // expected
        }
    }

    @Test
    public void testHandleWeirdNativeValue_Handled() throws IOException {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {
            @Override
            public Object handleWeirdNativeValue(DeserializationContext ctxt, JavaType targetType, Object badValue, JsonParser p) throws IOException {
                return "good";
            }
        };
        ctx.addProblemHandler(h);
        assertEquals("good", ctx.handleWeirdNativeValue(TypeFactory.unknownType().withValueHandler(h), "bad", parser));
    }

    @Test
    public void testReportPropertyInputMismatch_WithHandler() throws IOException {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {
            @Override
            public Object handlePropertyInputMismatch(DeserializationContext ctxt, JavaType type, Object instance, String propName, Object value, String msg) throws IOException {
                return "handled";
            }
        };
        ctx.addProblemHandler(h);
        assertEquals("handled", ctx.reportPropertyInputMismatch(String.class, null, "prop", "msg"));
    }

    @Test
    public void testBadTokenException() {
        assertNotNull(ctx.badTokenException(String.class, JsonToken.VALUE_STRING, "msg"));
    }

    @Test
    public void testWrongTokenException() {
        assertNotNull(ctx.wrongTokenException(String.class, JsonToken.VALUE_STRING, "msg"));
    }

    @Test
    public void testWeirdStringException() {
        assertNotNull(ctx.weirdStringException("value", String.class, "msg"));
    }

    @Test
    public void testWeirdNumberException() {
        assertNotNull(ctx.weirdNumberException(5, Integer.class, "msg"));
    }

    @Test
    public void testWeirdNativeValueException() {
        assertNotNull(ctx.weirdNativeValueException("value", String.class));
    }

    @Test
    public void testInstantiationException_WithCause() {
        Throwable cause = new RuntimeException();
        JsonMappingException e = ctx.instantiationException(String.class, cause);
        assertNotNull(e);
    }

    @Test
    public void testEndOfInputException() {
        assertNotNull(ctx.endOfInputException(String.class));
    }

    @Test
    public void testMappingException_WithArgs() {
        assertNotNull(ctx.mappingException("msg %s", "arg"));
    }

    @Test
    public void testMappingException_Class() {
        assertNotNull(ctx.mappingException(String.class));
    }

    @Test
    public void testMappingException_ClassToken() {
        assertNotNull(ctx.mappingException(String.class, JsonToken.VALUE_STRING));
    }

    @Test
    public void testGetDateFormat_Null() {
        assertNotNull(ctx.getDateFormat());
    }

    static class Impl extends DeserializationContext {
        public Impl(JsonParser p, DeserializationConfig config, DeserializerFactory factory,
                    ContextAttributes attributes, JsonInjectableValues injectableValues,
                    DeserializationCache cache, AnnotationIntrospector annotationIntrospector,
                    TypeFactory typeFactory) {
            super(p, config, factory, attributes, injectableValues, cache, annotationIntrospector, typeFactory);
        }

        @Override
        public DeserializationContext copy() {
            return null;
        }

        @Override
        public Object getAttribute(Object key) {
            return null;
        }

        @Override
        public DeserializationContext setAttribute(Object key, Object value) {
            return this;
        }
    }
}