package com.fasterxml.jackson.databind.jsontype.impl;

import static org.junit.Assert.*;
import java.io.IOException;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import org.junit.Before;
import org.junit.Test;

public class TypeDeserializerBaseTest {

    static class MockTypeIdResolver extends TypeIdResolverBase {
        private final Map<String, JavaType> mappings = new HashMap<String, JavaType>();
        private final String desc;

        MockTypeIdResolver(String desc) { this.desc = desc; }

        @Override
        public JavaType typeFromId(DeserializationContext ctxt, String id) throws IOException {
            return mappings.get(id);
        }

        @Override
        public String getDescForKnownTypeIds() { return desc; }

        @Override public String idFromValue(Object value) { return null; }
        @Override public String idFromValueAndType(Object value, Class<?> type) { return null; }
        @Override public String idFromBaseType() { return null; }
        @Override public void init(JavaType baseType) { }
        @Override public JsonTypeInfo.Id getMechanism() { return null; }
    }

    static class PlainTypeIdResolver implements TypeIdResolver {
        @Override public JavaType typeFromId(DeserializationContext ctxt, String id) throws IOException { return null; }
        @Override public String idFromValue(Object value) { return null; }
        @Override public String idFromValueAndType(Object value, Class<?> type) { return null; }
        @Override public String idFromBaseType() { return null; }
        @Override public void init(JavaType baseType) { }
        @Override public JsonTypeInfo.Id getMechanism() { return null; }
    }

    static class MockDeserializationContext extends DeserializationContext {
        private final boolean failOnInvalidSubtype;
        private final Map<String, JsonDeserializer<?>> desers = new HashMap<String, JsonDeserializer<?>>();
        private final TypeFactory typeFactory = TypeFactory.defaultInstance();

        MockDeserializationContext(boolean failOnInvalidSubtype) {
            super(null, null, null, null);
            this.failOnInvalidSubtype = failOnInvalidSubtype;
        }

        @Override
        public boolean isEnabled(DeserializationFeature feature) {
            return feature == DeserializationFeature.FAIL_ON_INVALID_SUBTYPE && failOnInvalidSubtype;
        }

        @Override
        @SuppressWarnings("unchecked")
        public JsonDeserializer<Object> findContextualValueDeserializer(JavaType type, BeanProperty prop) throws JsonMappingException {
            JsonDeserializer<?> cached = desers.get(type.getRawClass().getName());
            if (cached != null) return (JsonDeserializer<Object>) cached;
            JsonDeserializer<Object> d = new JsonDeserializer<Object>() {
                @Override
                public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                    return null;
                }
            };
            return d;
        }

        @Override
        public TypeFactory getTypeFactory() { return typeFactory; }

        @Override
        public JavaType handleUnknownTypeId(JavaType baseType, String typeId, TypeIdResolver idResolver, String extraDesc) throws IOException {
            if (failOnInvalidSubtype) {
                throw new JsonMappingException(this, "Unknown type id " + typeId);
            }
            return null;
        }

        @Override
        public void reportMappingException(String msg, Object... args) throws JsonMappingException {
            throw new JsonMappingException(this, msg);
        }

        @Override public final boolean handleUnknownProperty(JsonParser p, JsonDeserializer<?> deser, Object instanceOrClass, String propName) throws IOException { return false; }
        @Override public JsonParser getParser() { return null; }
        @Override public Object findValue(DeserializationConfig config, JsonParser p, BeanProperty prop, Class<?> valueClass) { return null; }
        @Override public Object handleMissingInstantiator(JavaType valueType, ValueInstantiator inst, JsonParser p, String msg, Object... args) throws IOException { return null; }
        @Override public Object handleInstantiationProblem(Class<?> instClass, Object argument, Throwable t) throws IOException { return null; }
        @Override public Object handleUnexpectedToken(JavaType targetType, JsonToken token, JsonParser p, String msg, Object... args) throws IOException { return null; }
        @Override public JsonDeserializer<Object> findRootValueDeserializer(JavaType type) throws JsonMappingException { return null; }
        @Override public JsonDeserializer<Object> findNonContextualValueDeserializer(JavaType type) throws JsonMappingException { return null; }
        @Override public JsonDeserializer<?> findKeyDeserializer(JavaType type, BeanProperty prop) throws JsonMappingException { return null; }
        @Override public int getAnnotationIntrospector() { return 0; }
        @Override public Object getAttribute(Object key) { return null; }
        @Override public DeserializationContext setAttribute(Object key, Object value) { return this; }
        @Override public JavaType constructType(Class<?> cls) { return typeFactory.constructType(cls); }
        @Override public Class<?> getActiveView() { return null; }
        @Override public Object getHandlerInstantiator() { return null; }
    }

    static class TestTypeDeserializerBase extends TypeDeserializerBase {
        TestTypeDeserializerBase(JavaType baseType, TypeIdResolver idRes,
                String typePropertyName, boolean typeIdVisible, JavaType defaultImpl) {
            super(baseType, idRes, typePropertyName, typeIdVisible, defaultImpl);
        }

        @Override
        public TypeDeserializer forProperty(BeanProperty prop) {
            return new TestTypeDeserializerBase(_baseType, _idResolver, _typePropertyName, _typeIdVisible, _defaultImpl);
        }

        @Override
        public JsonTypeInfo.As getTypeInclusion() {
            return JsonTypeInfo.As.PROPERTY;
        }
    }

    private TestTypeDeserializerBase deser;
    private JavaType stringType;
    private MockTypeIdResolver idResolver;
    private MockDeserializationContext ctxt;

    @Before
    public void setUp() {
        stringType = SimpleType.construct(String.class);
        idResolver = new MockTypeIdResolver("known ids: [a,b]");
        ctxt = new MockDeserializationContext(false);
        deser = new TestTypeDeserializerBase(stringType, idResolver, "type", false, null);
    }

    @Test
    public void testConstructorNullPropertyName() {
        TestTypeDeserializerBase d = new TestTypeDeserializerBase(stringType, idResolver, null, false, null);
        assertEquals("", d.getPropertyName());
    }

    @Test
    public void testGetPropertyName() {
        assertEquals("type", deser.getPropertyName());
    }

    @Test
    public void testBaseTypeName() {
        assertEquals("java.lang.String", deser.baseTypeName());
    }

    @Test
    public void testGetTypeIdResolver() {
        assertSame(idResolver, deser.getTypeIdResolver());
    }

    @Test
    public void testGetDefaultImplNull() {
        assertNull(deser.getDefaultImpl());
    }

    @Test
    public void testGetDefaultImplNonNull() {
        JavaType defaultImpl = SimpleType.construct(Integer.class);
        TestTypeDeserializerBase d = new TestTypeDeserializerBase(stringType, idResolver, "type", false, defaultImpl);
        assertEquals(Integer.class, d.getDefaultImpl());
    }

    @Test
    public void testToString() {
        String s = deser.toString();
        assertTrue(s.contains("TypeDeserializerBaseTest$TestTypeDeserializerBase"));
        assertTrue(s.contains("base-type:"));
        assertTrue(s.contains("java.lang.String"));
    }

    @Test
    public void testFindDeserializerFromCache() throws Exception {
        idResolver.mappings.put("X", SimpleType.construct(Integer.class));
        JsonDeserializer<Object> first = deser._findDeserializer(ctxt, "X");
        assertNotNull(first);
        assertSame(first, deser._findDeserializer(ctxt, "X"));
    }

    @Test
    public void testFindDeserializerTypeIdResolvesNullThenDefaultImpl() throws Exception {
        assertSame(NullifyingDeserializer.instance, deser._findDeserializer(ctxt, "unknown"));
    }

    @Test
    public void testFindDeserializerTypeIdResolvesNullThenDefaultImplBogus() throws Exception {
        JavaType voidType = SimpleType.construct(Void.class);
        TestTypeDeserializerBase d = new TestTypeDeserializerBase(stringType, idResolver, "type", false, voidType);
        assertSame(NullifyingDeserializer.instance, d._findDeserializer(ctxt, "unknown"));
    }

    @Test
    public void testFindDeserializerTypeIdResolvesNullThenDefaultImplReal() throws Exception {
        JavaType intType = SimpleType.construct(Integer.class);
        TestTypeDeserializerBase d = new TestTypeDeserializerBase(stringType, idResolver, "type", false, intType);
        assertNotNull(d._findDeserializer(ctxt, "unknown"));
    }

    @Test(expected = JsonMappingException.class)
    public void testFindDeserializerHandleUnknownTypeId() throws Exception {
        MockDeserializationContext failCtxt = new MockDeserializationContext(true);
        deser._findDeserializer(failCtxt, "unknown");
    }

    @Test
    public void testFindDefaultImplDeserializerNullCase() throws Exception {
        assertSame(NullifyingDeserializer.instance, deser._findDefaultImplDeserializer(ctxt));
    }

    @Test
    public void testFindDefaultImplDeserializerNullCaseFail() throws Exception {
        MockDeserializationContext failCtxt = new MockDeserializationContext(true);
        assertNull(deser._findDefaultImplDeserializer(failCtxt));
    }

    @Test
    public void testFindDefaultImplDeserializerBogusClass() throws Exception {
        JavaType voidType = SimpleType.construct(Void.class);
        TestTypeDeserializerBase d = new TestTypeDeserializerBase(stringType, idResolver, "type", false, voidType);
        assertSame(NullifyingDeserializer.instance, d._findDefaultImplDeserializer(ctxt));
    }

    @Test
    public void testFindDefaultImplDeserializerReal() throws Exception {
        JavaType intType = SimpleType.construct(Integer.class);
        TestTypeDeserializerBase d = new TestTypeDeserializerBase(stringType, idResolver, "type", false, intType);
        JsonDeserializer<Object> deserResult = d._findDefaultImplDeserializer(ctxt);
        assertNotNull(deserResult);
        assertSame(deserResult, d._findDefaultImplDeserializer(ctxt));
    }

    @Test
    public void testDeserializeWithNativeTypeIdNullTypeId() throws Exception {
        assertNull(deser._deserializeWithNativeTypeId(null, ctxt, (Object) null));
    }

    @Test
    public void testDeserializeWithNativeTypeIdNonNullTypeId() throws Exception {
        idResolver.mappings.put("Y", SimpleType.construct(String.class));
        assertNull(deser._deserializeWithNativeTypeId(null, ctxt, "Y"));
    }

    @Test
    public void testDeserializeWithNativeTypeIdNonStringTypeId() throws Exception {
        idResolver.mappings.put("123", SimpleType.construct(String.class));
        assertNull(deser._deserializeWithNativeTypeId(null, ctxt, 123));
    }

    @Test
    public void testHandleUnknownTypeIdWithTypeIdResolverBase() throws Exception {
        assertNull(deser._handleUnknownTypeId(ctxt, "unknown", idResolver, stringType));
    }

    @Test
    public void testHandleUnknownTypeIdWithNullDescription() throws Exception {
        MockTypeIdResolver idResolverNoDesc = new MockTypeIdResolver(null);
        assertNull(deser._handleUnknownTypeId(ctxt, "unknown", idResolverNoDesc, stringType));
    }

    @Test
    public void testHandleUnknownTypeIdNotTypeIdResolverBase() throws Exception {
        PlainTypeIdResolver plainIdResolver = new PlainTypeIdResolver();
        TestTypeDeserializerBase d = new TestTypeDeserializerBase(stringType, plainIdResolver, "type", false, null);
        assertNull(d._handleUnknownTypeId(ctxt, "unknown", plainIdResolver, stringType));
    }
}