package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonTokenId;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.impl.NullsAsEmptyProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsFailProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

import static org.junit.Assert.*;

public class StdDeserializerTest {

    private static class TestDeserializer extends StdDeserializer<Object> {
        public TestDeserializer() { super(Object.class); }
        public TestDeserializer(Class<?> vc) { super(vc); }
        public TestDeserializer(JavaType valueType) { super(valueType); }

        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }

        public boolean callIsEmptyOrTextualNull(String value) { return _isEmptyOrTextualNull(value); }
        public boolean callIsEmptyString(String value) { return _isEmptyString(value); }
        public boolean callHasTextualNull(String value) { return _hasTextualNull(value); }
        public boolean callByteOverflow(int value) { return _byteOverflow(value); }
        public boolean callShortOverflow(int value) { return _shortOverflow(value); }
        public boolean callIntOverflow(long value) { return _intOverflow(value); }
        public boolean callIsPosInf(String text) { return _isPosInf(text); }
        public boolean callIsNaN(String text) { return _isNaN(text); }
        public boolean callIsNegInf(String text) { return _isNegInf(text); }
        public boolean callIsPrimitive(Class<?> cls) { return cls.isPrimitive(); }
        public Object callNonNullNumber(Number n) { return _nonNullNumber(n); }
        public Object callGetNullValue(DeserializationContext ctxt) { return getNullValue(ctxt); }
        public String callGetTypeDesc() { return getTypeDescription(); }
        public void callReportFailedNullCoerce(DeserializationContext ctxt, boolean isPrimitive, DeserializationFeature feat, String str) {
            _reportFailedNullCoerce(ctxt, isPrimitive, feat, str);
        }
        public void callReportUnexpectedNumber(JsonParser p, DeserializationContext ctxt, String msg) {
            _reportUnexpectedNumber(p, ctxt, msg);
        }
        public void callReportUnexpectedString(JsonParser p, DeserializationContext ctxt, String msg) {
            _reportUnexpectedString(p, ctxt, msg);
        }
        public JsonFormat.Value callFindFormatOverrides(DeserializationContext ctxt, BeanProperty prop, Class<?> type) {
            return findFormatOverrides(ctxt, prop, type);
        }
        public Boolean callFindFormatFeature(DeserializationContext ctxt, BeanProperty prop, Class<?> type, JsonFormat.Feature feat) {
            return findFormatFeature(ctxt, prop, type, feat);
        }
        public String callGetNullValueName() { return null; }
    }

    private TestDeserializer deser;
    private DeserializationContext ctxt;
    private JsonParser parser;

    @Before
    public void setUp() {
        deser = new TestDeserializer();
        ObjectMapper mapper = new ObjectMapper();
        ctxt = mapper.getDeserializationContext();
        parser = mapper.getFactory().createParser("{}");
        try {
            parser.nextToken();
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @After
    public void tearDown() {
        try {
            parser.close();
        } catch (IOException e) {
            // ignore
        }
    }

    @Test
    public void testConstructors() {
        assertNotNull(new TestDeserializer());
        assertEquals(Object.class, new TestDeserializer(String.class).handledType());
        assertEquals(String.class, new TestDeserializer(String.class).handledType());
    }

    @Test
    public void testHandledTypeAndGetters() {
        assertEquals(Object.class, deser.handledType());
        assertEquals(Object.class, deser.getValueClass());
        assertNull(deser.getValueType());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetNullValueThrows() {
        deser.getNullValue(ctxt);
    }

    @Test
    public void testGetNullValueType() {
        assertNull(deser.getNullValueType());
    }

    @Test
    public void testIsEmptyString() {
        assertTrue(deser.callIsEmptyString(""));
        assertFalse(deser.callIsEmptyString("abc"));
        assertFalse(deser.callIsEmptyString(null));
    }

    @Test
    public void testHasTextualNull() {
        assertTrue(deser.callHasTextualNull("null"));
        assertFalse(deser.callHasTextualNull(""));
        assertFalse(deser.callHasTextualNull("abc"));
    }

    @Test
    public void testIsEmptyOrTextualNull() {
        assertTrue(deser.callIsEmptyOrTextualNull(""));
        assertTrue(deser.callIsEmptyOrTextualNull("null"));
        assertFalse(deser.callIsEmptyOrTextualNull("abc"));
    }

    @Test
    public void testByteOverflow() {
        assertTrue(deser.callByteOverflow(-129));
        assertFalse(deser.callByteOverflow(-128));
        assertFalse(deser.callByteOverflow(255));
        assertFalse(deser.callByteOverflow(127));
        assertTrue(deser.callByteOverflow(256));
    }

    @Test
    public void testShortOverflow() {
        assertTrue(deser.callShortOverflow(-32769));
        assertFalse(deser.callShortOverflow(-32768));
        assertFalse(deser.callShortOverflow(32767));
        assertTrue(deser.callShortOverflow(32768));
        assertFalse(deser.callShortOverflow(255));
    }

    @Test
    public void testIntOverflow() {
        assertTrue(deser.callIntOverflow(Integer.MIN_VALUE - 1L));
        assertFalse(deser.callIntOverflow(Integer.MIN_VALUE));
        assertFalse(deser.callIntOverflow(Integer.MAX_VALUE));
        assertTrue(deser.callIntOverflow(Integer.MAX_VALUE + 1L));
    }

    @Test
    public void testIsPosInf() {
        assertTrue(deser.callIsPosInf("Infinity"));
        assertTrue(deser.callIsPosInf("INF"));
        assertFalse(deser.callIsPosInf("-Infinity"));
        assertFalse(deser.callIsPosInf("NaN"));
    }

    @Test
    public void testIsNaN() {
        assertTrue(deser.callIsNaN("NaN"));
        assertFalse(deser.callIsNaN("Infinity"));
    }

    @Test
    public void testIsNegInf() {
        assertTrue(deser.callIsNegInf("-Infinity"));
        assertTrue(deser.callIsNegInf("-INF"));
        assertFalse(deser.callIsNegInf("Infinity"));
    }

    @Test
    public void testIsPrimitiveClass() {
        assertTrue(deser.callIsPrimitive(int.class));
        assertTrue(deser.callIsPrimitive(boolean.class));
        assertFalse(deser.callIsPrimitive(String.class));
        assertFalse(deser.callIsPrimitive(Integer.class));
    }

    @Test
    public void testNonNullNumber() {
        assertEquals(1, deser.callNonNullNumber(1));
        assertEquals(1.0, deser.callNonNullNumber(1.0));
        assertEquals(null, deser.callNonNullNumber(null));
    }

    @Test
    public void testGetTypeDescription() {
        assertNotNull(deser.callGetTypeDesc());
        assertTrue(deser.callGetTypeDesc().contains("Object"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReportFailedNullCoerceWithoutFeatures() {
        DeserializationContext ctx = new ObjectMapper().getDeserializationContext();
        deser.callReportFailedNullCoerce(ctx, false, DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES, "test");
    }

    @Test
    public void testFindFormatOverridesNullProp() {
        DeserializationContext ctx = new ObjectMapper().getDeserializationContext();
        JsonFormat.Value v = deser.callFindFormatOverrides(ctx, null, String.class);
        assertNotNull(v);
    }

    @Test
    public void testFindFormatFeatureNoFormat() {
        DeserializationContext ctx = new ObjectMapper().getDeserializationContext();
        assertNull(deser.callFindFormatFeature(ctx, null, String.class, JsonFormat.Feature.READ_DATE_TIMESTAMPS));
    }

    @Test
    public void testFindValueDeserializer() throws Exception {
        DeserializationContext ctx = new ObjectMapper().getDeserializationContext();
        JavaType type = ctx.getTypeFactory().constructType(String.class);
        JsonDeserializer<Object> d = deser.findValueDeserializer(ctx, type, null, null);
        assertNotNull(d);
    }

    @Test
    public void testFindContextualValueDeserializer() {
        DeserializationContext ctx = new ObjectMapper().getDeserializationContext();
        JavaType type = ctx.getTypeFactory().constructType(String.class);
        JsonDeserializer<Object> d = deser.findContextualValueDeserializer(ctx, type, null);
        assertNotNull(d);
    }

    @Test(expected = NullPointerException.class)
    public void testFindValueDeserializerNullContext() {
        deser.findValueDeserializer(null, null, null, null);
    }

    @Test(expected = NullPointerException.class)
    public void testFindContextualValueDeserializerNullContext() {
        deser.findContextualValueDeserializer(null, null, null);
    }

    @Test
    public void testDeserializeWithType() throws IOException {
        JsonParser p = new ObjectMapper().getFactory().createParser("{}");
        p.nextToken();
        Object result = deser.deserializeWithType(p, ctxt, null);
        assertNull(result);
        p.close();
    }

    @Test
    public void testDeserializeWithTypeNullTypeDeser() throws IOException {
        JsonParser p = new ObjectMapper().getFactory().createParser("{}");
        p.nextToken();
        try {
            deser.deserializeWithType(p, ctxt, null);
        } catch (Exception e) {
            // expected NPE
        }
        p.close();
    }

    @Test
    public void testParseBooleanCases() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = mapper.getFactory().createParser("true");
        p.nextToken();
        assertEquals(Boolean.TRUE, deser._parseBoolean(p, ctxt));
        p.close();

        p = mapper.getFactory().createParser("false");
        p.nextToken();
        assertEquals(Boolean.FALSE, deser._parseBoolean(p, ctxt));
        p.close();
    }

    @Test
    public void testParseBooleanNull() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = mapper.getFactory().createParser("null");
        p.nextToken();
        DeserializationContext ctx = mapper.getDeserializationContext();
        assertFalse(deser._parseBoolean(p, ctx));
        p.close();
    }

    @Test
    public void testParseBooleanInt() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = mapper.getFactory().createParser("1");
        p.nextToken();
        assertTrue(deser._parseBoolean(p, ctxt));
        p.close();

        p = mapper.getFactory().createParser("0");
        p.nextToken();
        assertFalse(deser._parseBoolean(p, ctxt));
        p.close();
    }

    @Test
    public void testParseBooleanStringTrue() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = mapper.getFactory().createParser("\"true\"");
        p.nextToken();
        assertTrue(deser._parseBoolean(p, ctxt));
        p.close();
    }

    @Test
    public void testParseBooleanStringFalse() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = mapper.getFactory().createParser("\"false\"");
        p.nextToken();
        assertFalse(deser._parseBoolean(p, ctxt));
        p.close();
    }

    @Test
    public void testParseBooleanStringOther() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = mapper.getFactory().createParser("\"other\"");
        p.nextToken();
        assertFalse(deser._parseBoolean(p, ctxt));
        p.close();
    }

    @Test
    public void testParseBooleanEmptyString() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = mapper.getFactory().createParser("\"\"");
        p.nextToken();
        try {
            deser._parseBoolean(p, ctxt);
            fail();
        } catch (Exception e) {
            // expected
        }
        p.close();
    }

    @Test
    public void testParseBooleanArray() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = mapper.getFactory().createParser("[true]");
        p.nextToken();
        p.nextToken();
        assertTrue(deser._parseBoolean(p, ctxt));
        p.close();
    }

    @Test
    public void testParseBooleanArrayMoreThanOne() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = mapper.getFactory().createParser("[true, false]");
        p.nextToken();
        try {
            deser._parseBoolean(p, ctxt);
            fail();
        } catch (Exception e) {
            // expected
        }
        p.close();
    }

    @Test
    public void testParseBooleanWeird() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = mapper.getFactory().createParser("1.5");
        p.nextToken();
        try {
            deser._parseBoolean(p, ctxt);
            fail();
        } catch (Exception e) {
            // expected
        }
        p.close();
    }

    @Test
    public void testParseIntPrimitive() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = mapper.getFactory().createParser("42");
        p.nextToken();
        assertEquals(42, deser._parseIntPrimitive(p, ctxt));
        p.close();
    }

    @Test
    public void testParseIntPrimitiveNull() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = mapper.getFactory().createParser("null");
        p.nextToken();
        assertEquals(0, deser._parseIntPrimitive(p, ctxt));
        p.close();
    }

    @Test
    public void testParseIntPrimitiveString() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = mapper.getFactory().createParser("\"123\"");
        p.nextToken();
        assertEquals(123, deser._parseIntPrimitive(p, ctxt));
        p.close();
    }

    @Test
    public void testParseIntPrimitiveFloat() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = mapper.getFactory().createParser("1.5");
        p.nextToken();
        try {
            deser._parseIntPrimitive(p, ctxt);
            fail();
        } catch (Exception e) {
            // expected
        }
        p.close();
    }

    @Test
    public void testParseIntPrimitiveArray() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = mapper.getFactory().createParser("[5]");
        p.nextToken();
        p.nextToken();
        assertEquals(5, deser._parseIntPrimitive(p, ctxt));
        p.close();
    }

    @Test
    public void testParseIntPrimitiveArrayMultiple() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = mapper.getFactory().createParser("[1,2]");
        p.nextToken();
        try {
            deser._parseIntPrimitive(p, ctxt);
            fail();
        } catch (Exception e) {
            // expected
        }
        p.close();
    }

    @Test
    public void testParseLongPrimitive() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = mapper.getFactory().createParser("42L");
        p.nextToken();
        assertEquals(42L, deser._parseLongPrimitive(p, ctxt));
        p.close();
    }

    @Test
    public void testParseFloatPrimitiveInfinity() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = mapper.getFactory().createParser("\"Infinity\"");
        p.nextToken();
        assertEquals(Float.POSITIVE_INFINITY, deser._parseFloatPrimitive(p, ctxt), 0.0f);
        p.close();
    }

    @Test
    public void testParseFloatPrimitiveNaN() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = mapper.getFactory().createParser("\"NaN\"");
        p.nextToken();
        assertTrue(Float.isNaN(deser._parseFloatPrimitive(p, ctxt)));
        p.close();
    }

    @Test
    public void testParseDoublePrimitiveInfinity() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = mapper.getFactory().createParser("\"Infinity\"");
        p.nextToken();
        assertEquals(Double.POSITIVE_INFINITY, deser._parseDoublePrimitive(p, ctxt), 0.0);
        p.close();
    }

    @Test
    public void testParseDate() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String dateStr = "2023-01-01T00:00:00Z";
        JsonParser p = mapper.getFactory().createParser("\"" + dateStr + "\"");
        p.nextToken();
        java.util.Date d = deser._parseDate(p, ctxt);
        assertNotNull(d);
        p.close();
    }

    @Test
    public void testParseDateEmptyArray() throws IOException {
        DeserializationConfig config = ctxt.getConfig().with(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
        DeserializationContext ctx = ctxt.copyAsView(config, null);
        JsonParser p = new ObjectMapper().getFactory().createParser("[]");
        p.nextToken();
        assertNull(deser._parseDate(p, ctx));
        p.close();
    }

    @Test
    public void testParseDateArray() throws IOException {
        JsonParser p = new ObjectMapper().getFactory().createParser("[1234567890123]");
        p.nextToken();
        p.nextToken();
        java.util.Date d = deser._parseDate(p, ctxt);
        assertNotNull(d);
        assertEquals(1234567890123L, d.getTime());
        p.close();
    }

    @Test
    public void testParseDoubleWeird() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = mapper.getFactory().createParser("1.2.3");
        p.nextToken();
        try {
            deser._parseDoublePrimitive(p, ctxt);
            fail();
        } catch (Exception e) {
            // expected
        }
        p.close();
    }

    @Test
    public void testParseFloatWeird() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = mapper.getFactory().createParser("1.2.3");
        p.nextToken();
        try {
            deser._parseFloatPrimitive(p, ctxt);
            fail();
        } catch (Exception e) {
            // expected
        }
        p.close();
    }

    @Test
    public void testIsEmptyStringProtection() {
        assertFalse(deser.callIsEmptyString(null));
    }

    @Test
    public void testGetNullValueReturnNull() {
        TestDeserializer d = new TestDeserializer() {
            @Override
            public Object getNullValue(DeserializationContext ctxt) {
                return null;
            }
        };
        assertNull(d.getNullValue(ctxt));
    }

    @Test
    public void testReportUnexpectedNumber() {
        try {
            deser.callReportUnexpectedNumber(parser, ctxt, "test");
            fail();
        } catch (Exception e) {
            // expected
        }
    }

    @Test
    public void testReportUnexpectedString() {
        try {
            deser.callReportUnexpectedString(parser, ctxt, "test");
            fail();
        } catch (Exception e) {
            // expected
        }
    }
}