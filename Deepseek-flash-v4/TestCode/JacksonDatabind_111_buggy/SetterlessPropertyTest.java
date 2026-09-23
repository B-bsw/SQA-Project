package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.*;
import org.junit.Test;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.PropertyName;
import java.io.IOException;

public class SetterlessPropertyTest {

    private static class TestBean {
        private java.util.List<String> _list = new java.util.ArrayList<>();
        public java.util.List<String> getList() { return _list; }
        public void setList(java.util.List<String> list) { _list = list; }
    }

    private SetterlessProperty createProperty() throws Exception {
        BeanPropertyDefinition propDef = mockPropDef();
        JavaType type = mockJavaType();
        AnnotatedMethod method = mockAnnotatedMethod();
        return new SetterlessProperty(propDef, type, null, null, method);
    }

    private BeanPropertyDefinition mockPropDef() {
        return new BeanPropertyDefinition() {
            @Override public String getName() { return "list"; }
            @Override public PropertyName getFullName() { return PropertyName.construct("list"); }
            @Override public boolean hasGetter() { return true; }
            @Override public AnnotatedMethod getGetter() { return mockAnnotatedMethod(); }
            @Override public boolean isExplicitlyIncluded() { return false; }
            @Override public boolean isExplicitlyNamed() { return false; }
            @Override public boolean isExplicitlyIncludedInAny() { return false; }
            @Override public boolean isExplicitlyIncludedInAnyInclusion() { return false; }
            @Override public boolean hasSetter() { return false; }
            @Override public AnnotatedMethod getSetter() { return null; }
            @Override public boolean hasField() { return false; }
            @Override public com.fasterxml.jackson.databind.introspect.AnnotatedField getField() { return null; }
            @Override public boolean hasConstructorParameter() { return false; }
            @Override public com.fasterxml.jackson.databind.introspect.AnnotatedParameter getConstructorParameter() { return null; }
            @Override public boolean hasGetterDescriptor() { return false; }
            @Override public AnnotatedMethod getGetterDescriptor() { return null; }
            @Override public Object getValue() { return null; }
        };
    }

    private JavaType mockJavaType() {
        return new JavaType(java.util.List.class, null, null, 0) {
            @Override public JavaType withTypeHandler(com.fasterxml.jackson.databind.type.TypeHandler<?> h) { return this; }
            @Override public JavaType withContentTypeHandler(com.fasterxml.jackson.databind.type.TypeHandler<?> h) { return this; }
            @Override public JavaType withValueHandler(com.fasterxml.jackson.databind.util.LinkedNode<?> h) { return this; }
            @Override public JavaType withContentValueHandler(com.fasterxml.jackson.databind.util.LinkedNode<?> h) { return this; }
            @Override public JavaType withStaticTyping() { return this; }
            @Override public JavaType withContentType(JavaType contentType) { return this; }
            @Override public JavaType narrowBy(Class<?> subclass) { return this; }
            @Override public JavaType strengthenSubType() { return this; }
            @Override public JavaType forcedNarrowBy(Class<?> subclass) { return this; }
            @Override public JavaType narrowContentsBy(Class<?> contentClass) { return this; }
            @Override public JavaType forcedNarrowContentsBy(Class<?> contentClass) { return this; }
            @Override public String buildCanonicalName() { return "java.util.List"; }
            @Override protected String buildCanonicalName(int i) { return "java.util.List"; }
            @Override public boolean isContainerType() { return true; }
            @Override public boolean isCollectionLikeType() { return true; }
            @Override public boolean isMapLikeType() { return false; }
            @Override public boolean isTrueCollectionType() { return false; }
            @Override public boolean isTrueMapType() { return false; }
            @Override public int containedTypeCount() { return 0; }
            @Override public Class<?> getParameterSource() { return java.util.List.class; }
            @Override public boolean isObjectId() { return false; }
            @Override public Object getContentTypeHandler() { return null; }
            @Override public Object getValueHandler() { return null; }
            @Override public Object getTypeHandler() { return null; }
            @Override public boolean hasGenericTypes() { return false; }
            @Override public boolean isFinal() { return false; }
            @Override public boolean hasContentType() { return false; }
        };
    }

    private AnnotatedMethod mockAnnotatedMethod() throws Exception {
        return new AnnotatedMethod(TestBean.class.getMethod("getList"), null, null, null, null);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetThrowsUnsupportedOperationException() throws Exception {
        SetterlessProperty prop = createProperty();
        prop.set(new TestBean(), new java.util.ArrayList<>());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturnThrowsUnsupportedOperationException() throws Exception {
        SetterlessProperty prop = createProperty();
        prop.setAndReturn(new TestBean(), new java.util.ArrayList<>());
    }

    @Test
    public void testDeserializeSetAndReturnReturnsInstance() throws Exception {
        SetterlessProperty prop = createProperty();
        TestBean bean = new TestBean();
        JsonParser p = mockParser(JsonToken.VALUE_NULL);
        DeserializationContext ctxt = mockDeserializationContext();
        Object result = prop.deserializeSetAndReturn(p, ctxt, bean);
        assertSame(bean, result);
    }

    @Test
    public void testDeserializeAndSetWithNullTokenDoesNothing() throws Exception {
        SetterlessProperty prop = createProperty();
        TestBean bean = new TestBean();
        JsonParser p = mockParser(JsonToken.VALUE_NULL);
        DeserializationContext ctxt = mockDeserializationContext();
        prop.deserializeAndSet(p, ctxt, bean);
    }

    @Test
    public void testWithNameReturnsNewInstance() throws Exception {
        SetterlessProperty prop = createProperty();
        PropertyName newName = PropertyName.construct("newName");
        SettableBeanProperty result = prop.withName(newName);
        assertNotNull(result);
        assertNotSame(prop, result);
    }

    @Test
    public void testWithValueDeserializerSameDeserializerReturnsSame() throws Exception {
        SetterlessProperty prop = createProperty();
        JsonDeserializer<?> deser = mockJsonDeserializer();
        settableValueDeserializer(prop, deser);
        SettableBeanProperty result = prop.withValueDeserializer(deser);
        assertSame(prop, result);
    }

    @Test
    public void testWithValueDeserializerNewDeserializerReturnsNewInstance() throws Exception {
        SetterlessProperty prop = createProperty();
        JsonDeserializer<?> deser1 = mockJsonDeserializer();
        JsonDeserializer<?> deser2 = mockJsonDeserializer();
        settableValueDeserializer(prop, deser1);
        SettableBeanProperty result = prop.withValueDeserializer(deser2);
        assertNotNull(result);
        assertNotSame(prop, result);
    }

    @Test
    public void testWithNullProviderReturnsNewInstance() throws Exception {
        SetterlessProperty prop = createProperty();
        NullValueProvider nva = mockNullValueProvider();
        SettableBeanProperty result = prop.withNullProvider(nva);
        assertNotNull(result);
        assertNotSame(prop, result);
    }

    private JsonParser mockParser(JsonToken token) {
        return new JsonParser() {
            @Override public Object getCodec() { return null; }
            @Override public void setCodec(Object c) {}
            @Override public Object getInputSource() { return null; }
            @Override public void clearCurrentToken() {}
            @Override public JsonToken getLastToken() { return token; }
            @Override public JsonToken getCurrentToken() { return token; }
            @Override public int getCurrentTokenId() { return token == null ? 0 : token.id(); }
            @Override public boolean hasCurrentToken() { return token != null; }
            @Override public boolean hasToken(JsonToken t) { return token == t; }
            @Override public boolean hasTokenId(int id) { return false; }
            @Override public JsonLocation getCurrentLocation() { return null; }
            @Override public JsonLocation getTokenLocation() { return null; }
            @Override public String getCurrentName() { return "list"; }
            @Override public String nextFieldName() { return null; }
            @Override public boolean nextFieldName(String s) { return false; }
            @Override public String nextTextValue() { return null; }
            @Override public int nextIntValue(int i) { return 0; }
            @Override public long nextLongValue(long l) { return 0; }
            @Override public Boolean nextBooleanValue() { return null; }
            @Override public JsonToken nextToken() { return token; }
            @Override public JsonToken nextValue() { return token; }
            @Override public com.fasterxml.jackson.core.Version version() { return null; }
            @Override public int releaseBuffered(java.io.OutputStream out) { return 0; }
            @Override public int releaseBuffered(java.io.Writer w) { return 0; }
            @Override public JsonParser skipChildren() { return this; }
            @Override public JsonParser setCurrentValue(Object v) { return this; }
            @Override public Object getCurrentValue() { return null; }
            @Override public void close() {}
            @Override public boolean isClosed() { return false; }
            @Override public boolean isExpectedStartArrayToken() { return false; }
            @Override public boolean isExpectedStartObjectToken() { return false; }
            @Override public boolean isExpectedNumberIntToken() { return false; }
            @Override public boolean isNaN() { return false; }
            @Override public void finishRecursive() {}
            @Override public boolean isUnwrapping() { return false; }
            @Override public void assignCurrentValue(Object v) {}
            @Override public String getText() { return null; }
            @Override public char[] getTextCharacters() { return null; }
            @Override public int getTextLength() { return 0; }
            @Override public int getTextOffset() { return 0; }
            @Override public boolean hasTextCharacters() { return false; }
            @Override public byte[] getBinaryValue(com.fasterxml.jackson.core.Base64Variant b64) { return null; }
            @Override public byte[] getBinaryValue() { return null; }
            @Override public int readBinaryValue(com.fasterxml.jackson.core.Base64Variant b64, java.io.OutputStream out) { return 0; }
            @Override public int readBinaryValue(java.io.OutputStream out) { return 0; }
            @Override public int readBinaryValue(com.fasterxml.jackson.core.Base64Variant b64, java.io.DataOutput out) { return 0; }
            @Override public int readBinaryValue(java.io.DataOutput out) { return 0; }
            @Override public com.fasterxml.jackson.core.type.TypeReference<?> getTypeId() { return null; }
            @Override public Object getEmbeddedObject() { return null; }
            @Override public com.fasterxml.jackson.core.util.ByteArrayBuilder getBinaryValue(java.nio.ByteBuffer buffer) { return null; }
            @Override public void closeCompletely() {}
            @Override public String getValueAsString(String defaultValue) { return null; }
            @Override public String getValueAsString() { return null; }
            @Override public Object getValueAs(Object defaultValue) { return null; }
            @Override public int getValueAsInt() { return 0; }
            @Override public int getValueAsInt(int defaultValue) { return 0; }
            @Override public long getValueAsLong() { return 0; }
            @Override public long getValueAsLong(long defaultValue) { return 0; }
            @Override public double getValueAsDouble() { return 0; }
            @Override public double getValueAsDouble(double defaultValue) { return 0; }
            @Override public boolean getValueAsBoolean() { return false; }
            @Override public boolean getValueAsBoolean(boolean defaultValue) { return false; }
            @Override public boolean getValueAsByte() { return false; }
            @Override public byte getValueAsByte(byte defaultValue) { return 0; }
            @Override public short getValueAsShort() { return 0; }
            @Override public short getValueAsShort(short defaultValue) { return 0; }
            @Override public char getValueAsChar() { return 0; }
            @Override public char getValueAsChar(char defaultValue) { return 0; }
            @Override public float getValueAsFloat() { return 0; }
            @Override public float getValueAsFloat(float defaultValue) { return 0; }
            @Override public boolean isClosed() { return false; }
            @Override public Number getNumberValue() { return null; }
            @Override public com.fasterxml.jackson.core.JsonParser.NumberType getNumberType() { return null; }
            @Override public com.fasterxml.jackson.core.JsonLocation getCurrentLocation() { return null; }
            @Override public JsonToken currentToken() { return token; }
            @Override public int currentTokenId() { return token == null ? 0 : token.id(); }
            @Override public String currentName() { return "list"; }
            @Override public String text() { return null; }
            @Override public String currentNameOrNull() { return "list"; }
            @Override public String currentValueAsString() { return null; }
            @Override public String currentValueAsString(String defaultValue) { return null; }
            @Override public int currentIntValue() { return 0; }
            @Override public int currentIntValue(int defaultValue) { return 0; }
            @Override public long currentLongValue() { return 0; }
            @Override public long currentLongValue(long defaultValue) { return 0; }
            @Override public double currentDoubleValue() { return 0; }
            @Override public double currentDoubleValue(double defaultValue) { return 0; }
            @Override public boolean currentBooleanValue() { return false; }
            @Override public boolean currentBooleanValue(boolean defaultValue) { return false; }
            @Override public com.fasterxml.jackson.core.JsonParser skipChildren() { return this; }
            @Override public com.fasterxml.jackson.core.JsonParser setCurrentValue(Object v) { return this; }
            @Override public Object getCurrentValue() { return null; }
            @Override public void setCurrentValue(Object v) {}
            @Override public void close() {}
            @Override public boolean isClosed() { return false; }
            @Override public com.fasterxml.jackson.core.JsonToken nextToken() { return token; }
            @Override public com.fasterxml.jackson.core.JsonToken nextValue() { return token; }
            @Override public String getText() { return null; }
            @Override public char[] getTextCharacters() { return null; }
            @Override public int getTextLength() { return 0; }
            @Override public int getTextOffset() { return 0; }
            @Override public boolean hasTextCharacters() { return false; }
            @Override public com.fasterxml.jackson.core.JsonParser.NumberType getNumberType() { return null; }
            @Override public Number getNumberValue() { return null; }
            @Override public com.fasterxml.jackson.core.JsonLocation getCurrentLocation() { return null; }
            @Override public com.fasterxml.jackson.core.JsonLocation getTokenLocation() { return null; }
            @Override public String getCurrentNameOrNull() { return "list"; }
            @Override public String getValueAsString(String defaultValue) { return null; }
            @Override public String getValueAsString() { return null; }
            @Override public Object getValueAs(Object defaultValue) { return null; }
            @Override public int getValueAsInt() { return 0; }
            @Override public int getValueAsInt(int defaultValue) { return 0; }
            @Override public long getValueAsLong() { return 0; }
            @Override public long getValueAsLong(long defaultValue) { return 0; }
            @Override public double getValueAsDouble() { return 0; }
            @Override public double getValueAsDouble(double defaultValue) { return 0; }
            @Override public boolean getValueAsBoolean() { return false; }
            @Override public boolean getValueAsBoolean(boolean defaultValue) { return false; }
            @Override public byte getValueAsByte() { return 0; }
            @Override public byte getValueAsByte(byte defaultValue) { return 0; }
            @Override public short getValueAsShort() { return 0; }
            @Override public short getValueAsShort(short defaultValue) { return 0; }
            @Override public char getValueAsChar() { return 0; }
            @Override public char getValueAsChar(char defaultValue) { return 0; }
            @Override public float getValueAsFloat() { return 0; }
            @Override public float getValueAsFloat(float defaultValue) { return 0; }
            @Override public boolean isClosed() { return false; }
            @Override public com.fasterxml.jackson.core.JsonParser setCodec(Object c) { return this; }
            @Override public Object getCodec() { return null; }
            @Override public com.fasterxml.jackson.core.Version version() { return null; }
            @Override public int releaseBuffered(java.io.OutputStream out) { return 0; }
            @Override public int releaseBuffered(java.io.Writer w) { return 0; }
            @Override public void finishRecursive() {}
            @Override public boolean isUnwrapping() { return false; }
            @Override public void assignCurrentValue(Object v) {}
            @Override public com.fasterxml.jackson.core.type.TypeReference<?> getTypeId() { return null; }
            @Override public Object getEmbeddedObject() { return null; }
            @Override public com.fasterxml.jackson.core.util.ByteArrayBuilder getBinaryValue(java.nio.ByteBuffer buffer) { return null; }
            @Override public void closeCompletely() {}
            @Override public int currentTokenId() { return token == null ? 0 : token.id(); }
            @Override public String currentName() { return "list"; }
            @Override public String text() { return null; }
            @Override public String currentNameOrNull() { return "list"; }
            @Override public String currentValueAsString() { return null; }
            @Override public String currentValueAsString(String defaultValue) { return null; }
            @Override public int currentIntValue() { return 0; }
            @Override public int currentIntValue(int defaultValue) { return 0; }
            @Override public long currentLongValue() { return 0; }
            @Override public long currentLongValue(long defaultValue) { return 0; }
            @Override public double currentDoubleValue() { return 0; }
            @Override public double currentDoubleValue(double defaultValue) { return 0; }
            @Override public boolean currentBooleanValue() { return false; }
            @Override public boolean currentBooleanValue(boolean defaultValue) { return false; }
            @Override public com.fasterxml.jackson.core.JsonParser skipChildren() { return this; }
            @Override public com.fasterxml.jackson.core.JsonParser setCurrentValue(Object v) { return this; }
            @Override public Object getCurrentValue() { return null; }
            @Override public void setCurrentValue(Object v) {}
            @Override public void close() {}
            @Override public boolean isClosed() { return false; }
            @Override public com.fasterxml.jackson.core.JsonToken nextToken() { return token; }
            @Override public com.fasterxml.jackson.core.JsonToken nextValue() { return token; }
            @Override public String getText() { return null; }
            @Override public char[] getTextCharacters() { return null; }
            @Override public int getTextLength() { return 0; }
            @Override public int getTextOffset() { return 0; }
            @Override public boolean hasTextCharacters() { return false; }
            @Override public com.fasterxml.jackson.core.JsonParser.NumberType getNumberType() { return null; }
            @Override public Number getNumberValue() { return null; }
            @Override public com.fasterxml.jackson.core.JsonLocation getCurrentLocation() { return null; }
            @Override public com.fasterxml.jackson.core.JsonLocation getTokenLocation() { return null; }
            @Override public String getCurrentNameOrNull() { return "list"; }
            @Override public String getValueAsString(String defaultValue) { return null; }
            @Override public String getValueAsString() { return null; }
            @Override public Object getValueAs(Object defaultValue) { return null; }
            @Override public int getValueAsInt() { return 0; }
            @Override public int getValueAsInt(int defaultValue) { return 0; }
            @Override public long getValueAsLong() { return 0; }
            @Override public long getValueAsLong(long defaultValue) { return 0; }
            @Override public double getValueAsDouble() { return 0; }
            @Override public double getValueAsDouble(double defaultValue) { return 0; }
            @Override public boolean getValueAsBoolean() { return false; }
            @Override public boolean getValueAsBoolean(boolean defaultValue) { return false; }
            @Override public byte getValueAsByte() { return 0; }
            @Override public byte getValueAsByte(byte defaultValue) { return 0; }
            @Override public short getValueAsShort() { return 0; }
            @Override public short getValueAsShort(short defaultValue) { return 0; }
            @Override public char getValueAsChar() { return 0; }
            @Override public char getValueAsChar(char defaultValue) { return 0; }
            @Override public float getValueAsFloat() { return 0; }
            @Override public float getValueAsFloat(float defaultValue) { return 0; }
            @Override public boolean isClosed() { return false; }
        };
    }

    private DeserializationContext mockDeserializationContext() {
        return new DeserializationContext(null, null, null, null) {
            @Override public void reportBadDefinition(JavaType type, String msg) throws IOException {
                throw new IOException(msg);
            }
            @Override public Object getAttribute(Object key) { return null; }
            @Override public void setAttribute(Object key, Object value) {}
            @Override public Class<?> getActiveView() { return null; }
            @Override public int getParserFormatFeatures() { return 0; }
            @Override public int getGeneratorFormatFeatures() { return 0; }
            @Override public JsonDeserializer<Object> findRootValueDeserializer(JavaType type) { return null; }
            @Override public JsonDeserializer<Object> findNonRootValueDeserializer(JavaType type) { return null; }
            @Override public java.util.Iterator<com.fasterxml.jackson.databind.type.TypeDeserializer> findTypeDeserializer(JavaType type) { return null; }
            @Override public com.fasterxml.jackson.databind.BeanDescription configAndForType(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config, JavaType type, Class<?> mixInTarget) { return null; }
            @Override public Object handleUnexpectedToken(Class<?> inst, JsonParser p, com.fasterxml.jackson.databind.JavaType type, String msg, Object... args) throws IOException { return null; }
            @Override public Object handleUnexpectedToken(Class<?> inst, JsonParser p, String msg, Object... args) throws IOException { return null; }
            @Override public Object handleUnknownProperty(JsonParser p, Object bean, Class<?> objectClass, String propertyName) throws IOException { return null; }
            @Override public Object handleUnknownTypeId(JsonParser p, Class<?> targetType, String typeId, Object idGenerator) throws IOException { return null; }
            @Override public Object handleMissingInstantiator(Class<?> inst, JsonParser p, String msg, Object... args) throws IOException { return null; }
        };
    }

    private JsonDeserializer<?> mockJsonDeserializer() {
        return new JsonDeserializer<Object>() {
            @Override public Object deserialize(JsonParser p, DeserializationContext ctxt) { return null; }
            @Override public Object deserialize(JsonParser p, DeserializationContext ctxt, Object intoValue) { return null; }
        };
    }

    private NullValueProvider mockNullValueProvider() {
        return new NullValueProvider() {
            @Override public Object getNullValue(DeserializationContext ctxt) { return null; }
            @Override public Object getNullValue(DeserializationContext ctxt, JsonParser p) { return null; }
        };
    }

    private void settableValueDeserializer(SetterlessProperty prop, JsonDeserializer<?> deser) throws Exception {
        java.lang.reflect.Field field = SettableBeanProperty.class.getDeclaredField("_valueDeserializer");
        field.setAccessible(true);
        field.set(prop, deser);
    }
}