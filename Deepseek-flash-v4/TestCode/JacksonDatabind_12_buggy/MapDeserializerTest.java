package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.*;
import java.io.IOException;
import java.util.*;
import org.junit.Before;
import org.junit.Test;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

public class MapDeserializerTest {

    private MapDeserializer defaultDeserializer;
    private JavaType mockMapType;
    private ValueInstantiator mockInstantiator;
    private KeyDeserializer mockKeyDeser;
    private JsonDeserializer<Object> mockValueDeser;
    private TypeDeserializer mockTypeDeser;
    private JsonParser mockParser;
    private DeserializationContext mockCtxt;
    private PropertyBasedCreator mockCreator;

    @Before
    public void setUp() throws Exception {
        mockMapType = new MockJavaType();
        mockInstantiator = new MockValueInstantiator();
        mockKeyDeser = new MockKeyDeserializer();
        mockValueDeser = new MockValueDeserializer();
        mockTypeDeser = new MockTypeDeserializer();
        mockParser = new MockJsonParser();
        mockCtxt = new MockDeserializationContext();
        defaultDeserializer = new MapDeserializer(mockMapType, mockInstantiator, mockKeyDeser, mockValueDeser, mockTypeDeser);
    }

    @Test
    public void testConstructorInitializesFields() {
        assertNotNull(defaultDeserializer._mapType);
        assertNotNull(defaultDeserializer._keyDeserializer);
        assertNotNull(defaultDeserializer._valueDeserializer);
        assertNotNull(defaultDeserializer._valueTypeDeserializer);
        assertNotNull(defaultDeserializer._valueInstantiator);
        assertFalse(defaultDeserializer._hasDefaultCreator);
        assertNull(defaultDeserializer._delegateDeserializer);
        assertNull(defaultDeserializer._propertyBasedCreator);
        assertTrue(defaultDeserializer._standardStringKey);
    }

    @Test
    public void testIsCachableReturnsTrueWhenNoTypeDeserAndNoIgnorable() {
        MapDeserializer deser = new MapDeserializer(mockMapType, mockInstantiator, mockKeyDeser, mockValueDeser, null);
        assertTrue(deser.isCachable());
    }

    @Test
    public void testIsCachableReturnsFalseWhenTypeDeserPresent() {
        assertFalse(defaultDeserializer.isCachable());
    }

    @Test
    public void testIsCachableReturnsFalseWhenIgnorablePresent() {
        MapDeserializer deser = new MapDeserializer(mockMapType, mockInstantiator, mockKeyDeser, mockValueDeser, null);
        deser.setIgnorableProperties(new String[]{"a"});
        assertFalse(deser.isCachable());
    }

    @Test
    public void testSetIgnorablePropertiesNull() {
        defaultDeserializer.setIgnorableProperties(null);
        assertNull(defaultDeserializer._ignorableProperties);
    }

    @Test
    public void testSetIgnorablePropertiesEmpty() {
        defaultDeserializer.setIgnorableProperties(new String[0]);
        assertNull(defaultDeserializer._ignorableProperties);
    }

    @Test
    public void testSetIgnorablePropertiesNonEmpty() {
        defaultDeserializer.setIgnorableProperties(new String[]{"x", "y"});
        assertNotNull(defaultDeserializer._ignorableProperties);
        assertEquals(2, defaultDeserializer._ignorableProperties.size());
    }

    @Test
    public void testDeserializePropertyBasedCreatorPath() throws Exception {
        mockInstantiator = new MockValueInstantiator(true, false, false, false);
        mockKeyDeser = new MockKeyDeserializer();
        mockValueDeser = new MockValueDeserializer();
        mockTypeDeser = null;
        MapDeserializer deser = new MapDeserializer(mockMapType, mockInstantiator, mockKeyDeser, mockValueDeser, mockTypeDeser);
        deser._propertyBasedCreator = mockCreator = new MockPropertyBasedCreator();

        mockParser.token = JsonToken.START_OBJECT;
        Map<Object, Object> result = deser.deserialize(mockParser, mockCtxt);
        assertNotNull(result);
    }

    @Test
    public void testDeserializeDelegatePath() throws Exception {
        mockInstantiator = new MockValueInstantiator(false, true, false, false);
        MapDeserializer deser = new MapDeserializer(mockMapType, mockInstantiator, mockKeyDeser, mockValueDeser, null);
        deser._delegateDeserializer = new MockJsonDeserializer();
        mockParser.token = JsonToken.START_OBJECT;
        Map<Object, Object> result = deser.deserialize(mockParser, mockCtxt);
        assertNotNull(result);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeNoDefaultCreatorThrowsException() throws Exception {
        mockInstantiator = new MockValueInstantiator(false, false, false, false);
        MapDeserializer deser = new MapDeserializer(mockMapType, mockInstantiator, mockKeyDeser, mockValueDeser, null);
        mockParser.token = JsonToken.START_OBJECT;
        deser.deserialize(mockParser, mockCtxt);
    }

    @Test
    public void testDeserializeStringTokenCallsCreateFromString() throws Exception {
        mockInstantiator = new MockValueInstantiator(false, false, true, false);
        MapDeserializer deser = new MapDeserializer(mockMapType, mockInstantiator, mockKeyDeser, mockValueDeser, null);
        mockParser.token = JsonToken.VALUE_STRING;
        mockParser.text = "test";
        Map<Object, Object> result = deser.deserialize(mockParser, mockCtxt);
        assertNotNull(result);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeInvalidTokenMappingException() throws Exception {
        mockInstantiator = new MockValueInstantiator(false, false, true, true);
        MapDeserializer deser = new MapDeserializer(mockMapType, mockInstantiator, mockKeyDeser, mockValueDeser, null);
        mockParser.token = JsonToken.VALUE_NUMBER_INT;
        deser.deserialize(mockParser, mockCtxt);
    }

    @Test
    public void testDeserializeWithStandardStringKey() throws Exception {
        mockInstantiator = new MockValueInstantiator(false, false, true, true);
        MapDeserializer deser = new MapDeserializer(mockMapType, mockInstantiator, mockKeyDeser, mockValueDeser, null);
        deser._standardStringKey = true;
        mockParser.token = JsonToken.START_OBJECT;
        mockParser.nextTokenReturn = JsonToken.FIELD_NAME;
        mockParser.fieldName = "key1";
        mockParser.nextTokenAfterField = JsonToken.VALUE_STRING;
        Map<Object, Object> result = deser.deserialize(mockParser, mockCtxt);
        assertNotNull(result);
        assertTrue(result.containsKey("key1"));
    }

    @Test
    public void testDeserializeWithNonStandardStringKey() throws Exception {
        mockInstantiator = new MockValueInstantiator(false, false, true, true);
        MapDeserializer deser = new MapDeserializer(mockMapType, mockInstantiator, mockKeyDeser, mockValueDeser, null);
        deser._standardStringKey = false;
        mockParser.token = JsonToken.START_OBJECT;
        mockParser.nextTokenReturn = JsonToken.FIELD_NAME;
        mockParser.fieldName = "key1";
        mockParser.nextTokenAfterField = JsonToken.VALUE_STRING;
        Map<Object, Object> result = deser.deserialize(mockParser, mockCtxt);
        assertNotNull(result);
        assertTrue(result.containsKey("key1"));
    }

    @Test
    public void testDeserializeOverloadedWithGivenMap() throws Exception {
        MapDeserializer deser = new MapDeserializer(mockMapType, mockInstantiator, mockKeyDeser, mockValueDeser, null);
        deser._standardStringKey = true;
        mockParser.token = JsonToken.START_OBJECT;
        mockParser.nextTokenReturn = JsonToken.FIELD_NAME;
        mockParser.fieldName = "a";
        mockParser.nextTokenAfterField = JsonToken.VALUE_STRING;
        Map<Object, Object> existing = new HashMap<Object, Object>();
        Map<Object, Object> result = deser.deserialize(mockParser, mockCtxt, existing);
        assertSame(existing, result);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeOverloadedInvalidToken() throws Exception {
        MapDeserializer deser = new MapDeserializer(mockMapType, mockInstantiator, mockKeyDeser, mockValueDeser, null);
        mockParser.token = JsonToken.VALUE_NULL;
        deser.deserialize(mockParser, mockCtxt, new HashMap<Object, Object>());
    }

    @Test
    public void testDeserializeWithTypeDelegatesToTypeDeserializer() throws Exception {
        Object result = defaultDeserializer.deserializeWithType(mockParser, mockCtxt, mockTypeDeser);
        assertEquals("typed", result);
    }

    @Test
    public void testResolveSetsDelegateDeserializerAndCreator() throws Exception {
        mockInstantiator = new MockValueInstantiator(false, true, true, true);
        MapDeserializer deser = new MapDeserializer(mockMapType, mockInstantiator, mockKeyDeser, mockValueDeser, null);
        deser.resolve(mockCtxt);
        assertNotNull(deser._delegateDeserializer);
        assertNotNull(deser._propertyBasedCreator);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testResolveDelegateNullTypeThrowsException() throws Exception {
        mockInstantiator = new MockValueInstantiator(false, true, false, false);
        MapDeserializer deser = new MapDeserializer(mockMapType, mockInstantiator, mockKeyDeser, mockValueDeser, null);
        deser.resolve(mockCtxt);
    }

    @Test
    public void testCreateContextualWithNullKeyDeserializer() throws Exception {
        MapDeserializer deser = new MapDeserializer(mockMapType, mockInstantiator, null, mockValueDeser, mockTypeDeser);
        JsonDeserializer<?> result = deser.createContextual(mockCtxt, null);
        assertNotNull(result);
    }

    @Test
    public void testGetContentType() {
        assertNotNull(defaultDeserializer.getContentType());
    }

    @Test
    public void testGetContentDeserializer() {
        assertSame(mockValueDeser, defaultDeserializer.getContentDeserializer());
    }

    @Test
    public void testGetMapClass() {
        assertEquals(Map.class, defaultDeserializer.getMapClass());
    }

    @Test
    public void testGetValueType() {
        assertSame(mockMapType, defaultDeserializer.getValueType());
    }

    @Test
    public void testWithResolvedSameInstancesReturnsThis() {
        MapDeserializer deser = new MapDeserializer(mockMapType, mockInstantiator, mockKeyDeser, mockValueDeser, mockTypeDeser);
        HashSet<String> ignorable = new HashSet<String>();
        deser._ignorableProperties = ignorable;
        MapDeserializer result = deser.withResolved(mockKeyDeser, mockTypeDeser, mockValueDeser, ignorable);
        assertSame(deser, result);
    }

    @Test
    public void testWithResolvedDifferentInstancesReturnsNew() {
        MapDeserializer deser = new MapDeserializer(mockMapType, mockInstantiator, mockKeyDeser, mockValueDeser, mockTypeDeser);
        MapDeserializer result = deser.withResolved(new MockKeyDeserializer(), mockTypeDeser, new MockValueDeserializer(), new HashSet<String>());
        assertNotSame(deser, result);
    }

    @Test
    public void testReadAndBindSkipsIgnorableProperties() throws Exception {
        MapDeserializer deser = new MapDeserializer(mockMapType, mockInstantiator, mockKeyDeser, mockValueDeser, null);
        HashSet<String> ignorable = new HashSet<String>();
        ignorable.add("skip");
        deser._ignorableProperties = ignorable;
        deser._standardStringKey = false;
        Map<Object, Object> result = new HashMap<Object, Object>();
        mockParser.token = JsonToken.START_OBJECT;
        mockParser.nextTokenReturn = JsonToken.FIELD_NAME;
        mockParser.fieldName = "skip";
        mockParser.nextTokenAfterField = JsonToken.VALUE_STRING;
        deser._readAndBind(mockParser, mockCtxt, result);
        assertFalse(result.containsKey("skip"));
    }

    @Test
    public void testReadAndBindStringMapSkipsIgnorableProperties() throws Exception {
        MapDeserializer deser = new MapDeserializer(mockMapType, mockInstantiator, mockKeyDeser, mockValueDeser, null);
        HashSet<String> ignorable = new HashSet<String>();
        ignorable.add("skip");
        deser._ignorableProperties = ignorable;
        deser._standardStringKey = true;
        Map<Object, Object> result = new HashMap<Object, Object>();
        mockParser.token = JsonToken.START_OBJECT;
        mockParser.nextTokenReturn = JsonToken.FIELD_NAME;
        mockParser.fieldName = "skip";
        mockParser.nextTokenAfterField = JsonToken.VALUE_STRING;
        deser._readAndBindStringMap(mockParser, mockCtxt, result);
        assertFalse(result.containsKey("skip"));
    }

    @Test
    public void testReadAndBindNullValue() throws Exception {
        MapDeserializer deser = new MapDeserializer(mockMapType, mockInstantiator, mockKeyDeser, mockValueDeser, null);
        deser._standardStringKey = false;
        Map<Object, Object> result = new HashMap<Object, Object>();
        mockParser.token = JsonToken.START_OBJECT;
        mockParser.nextTokenReturn = JsonToken.FIELD_NAME;
        mockParser.fieldName = "nullkey";
        mockParser.nextTokenAfterField = JsonToken.VALUE_NULL;
        mockValueDeser.nullValue = "nullPlaceholder";
        deser._readAndBind(mockParser, mockCtxt, result);
        assertEquals("nullPlaceholder", result.get("nullkey"));
    }

    @Test
    public void testDeserializeUsingCreatorCompletesSuccessfully() throws Exception {
        mockInstantiator = new MockValueInstantiator(true, false, true, true);
        MapDeserializer deser = new MapDeserializer(mockMapType, mockInstantiator, mockKeyDeser, mockValueDeser, null);
        deser._propertyBasedCreator = new MockPropertyBasedCreator();
        mockParser.token = JsonToken.START_OBJECT;
        mockParser.nextTokenReturn = JsonToken.FIELD_NAME;
        mockParser.fieldName = "creatorProp";
        mockParser.nextTokenAfterField = JsonToken.VALUE_STRING;
        Map<Object, Object> result = deser._deserializeUsingCreator(mockParser, mockCtxt);
        assertNotNull(result);
    }

    @Test(expected = NullPointerException.class)
    public void testHandleUnresolvedReferenceThrowsWithoutAccumulator() throws Exception {
        MapDeserializer deser = new MapDeserializer(mockMapType, mockInstantiator, mockKeyDeser, mockValueDeser, null);
        deser.handleUnresolvedReference(mockParser, null, "key", new UnresolvedForwardReference("test"));
    }

    // ------------------------------------------------------------
    // Static inner mock classes (Plain Java, no external mocking lib)
    // ------------------------------------------------------------

    static class MockJavaType extends JavaType {
        private static final long serialVersionUID = 1L;
        MockJavaType() { super(Object.class, 0, null, null); }
        @Override public JavaType withTypeHandler(Object h) { return this; }
        @Override public JavaType withContentTypeHandler(Object h) { return this; }
        @Override public JavaType withValueHandler(Object h) { return this; }
        @Override public JavaType withContentValueHandler(Object h) { return this; }
        @Override public JavaType narrowContentsBy(Class<?> contentClass) { return this; }
        @Override public JavaType widenContentsBy(Class<?> contentClass) { return this; }
        @Override public JavaType narrowBy(Class<?> subclass) { return this; }
        @Override public JavaType widenBy(Class<?> subclass) { return this; }
        @Override public boolean isAbstract() { return false; }
        @Override public boolean isCollectionLike() { return false; }
        @Override public boolean isMapLike() { return true; }
        @Override public boolean hasGenericTypes() { return false; }
        @Override public String containedTypeName(int index) { return null; }
        @Override public JavaType getKeyType() { return new MockJavaType(); }
        @Override public JavaType getContentType() { return new MockJavaType(); }
        @Override public int containedTypeCount() { return 0; }
        @Override public JavaType containedType(int index) { return null; }
        @Override public StringBuilder getGenericSignature(StringBuilder sb) { return sb; }
        @Override public StringBuilder getErasedSignature(StringBuilder sb) { return sb; }
        @Override public String toString() { return "MockJavaType"; }
        @Override public boolean equals(Object o) { return o == this; }
        @Override public int hashCode() { return 0; }
        @Override public Class<?> getRawClass() { return HashMap.class; }
    }

    static class MockValueInstantiator extends ValueInstantiator {
        private boolean canCreateDefault;
        private boolean canCreateDelegate;
        private boolean canCreateFromString;
        private boolean canCreateFromObjectWith;
        private JavaType delegateType;

        MockValueInstantiator() {
            this(false, false, false, false);
        }

        MockValueInstantiator(boolean canDefault, boolean canDelegate, boolean canString, boolean canObjectWith) {
            this.canCreateDefault = canDefault;
            this.canCreateDelegate = canDelegate;
            this.canCreateFromString = canString;
            this.canCreateFromObjectWith = canObjectWith;
            this.delegateType = canDelegate ? new MockJavaType() : null;
        }

        @Override
        public boolean canCreateUsingDefault() { return canCreateDefault; }

        @Override
        public boolean canCreateUsingDelegate() { return canCreateDelegate; }

        @Override
        public boolean canCreateFromString() { return canCreateFromString; }

        @Override
        public boolean canCreateFromObjectWith() { return canCreateFromObjectWith; }

        @Override
        public JavaType getDelegateType(DeserializationConfig config) {
            return delegateType;
        }

        @Override
        public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig config) {
            return new SettableBeanProperty[0];
        }

        @Override
        public Object createUsingDefault(DeserializationContext ctxt) {
            return new HashMap<Object, Object>();
        }

        @Override
        public Object createUsingDelegate(DeserializationContext ctxt, Object delegate) {
            return new HashMap<Object, Object>();
        }

        @Override
        public Object createFromString(DeserializationContext ctxt, String value) {
            return new HashMap<Object, Object>();
        }
    }

    static class MockKeyDeserializer extends KeyDeserializer {
        @Override
        public Object deserializeKey(String key, DeserializationContext ctxt) {
            return key;
        }
    }

    static class MockValueDeserializer extends JsonDeserializer<Object> {
        Object nullValue = null;
        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) {
            return "deserialized";
        }
        @Override
        public Object getNullValue() {
            return nullValue != null ? nullValue : super.getNullValue();
        }
        @Override
        public Object getNullValue(DeserializationContext ctxt) {
            return getNullValue();
        }
        @Override
        public ObjectIdReader getObjectIdReader() {
            return null;
        }
    }

    static class MockJsonDeserializer extends JsonDeserializer<Object> {
        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) {
            return "delegateResult";
        }
    }

    static class MockTypeDeserializer extends TypeDeserializer {
        @Override
        public TypeDeserializer forProperty(BeanProperty prop) {
            return this;
        }
        @Override
        public Object deserializeTypedFromObject(JsonParser jp, DeserializationContext ctxt) {
            return "typed";
        }
        @Override
        public Object deserializeTypedFromArray(JsonParser jp, DeserializationContext ctxt) { return null; }
        @Override
        public Object deserializeTypedFromScalar(JsonParser jp, DeserializationContext ctxt) { return null; }
        @Override
        public Object deserializeTypedFromAny(JsonParser jp, DeserializationContext ctxt) { return null; }
        @Override public Class<?> getDefaultImpl() { return null; }
        @Override public String getTypeIdResolver() { return null; }
        @Override public String getPropertyName() { return null; }
        @Override public TypeIdResolver getTypeIdResolverInstance() { return null; }
    }

    static class MockJsonParser extends JsonParser {
        JsonToken token;
        JsonToken nextTokenReturn;
        String fieldName;
        JsonToken nextTokenAfterField;
        String text = "";

        @Override public ObjectCodec getCodec() { return null; }
        @Override public void setCodec(ObjectCodec c) {}
        @Override public void close() throws IOException {}
        @Override public JsonToken nextToken() throws IOException {
            if (token == JsonToken.START_OBJECT && nextTokenReturn != null) {
                token = nextTokenReturn;
                return token;
            }
            if (token == JsonToken.FIELD_NAME && nextTokenAfterField != null) {
                token = nextTokenAfterField;
                return token;
            }
            return token;
        }
        @Override public JsonToken getCurrentToken() { return token; }
        @Override public String getCurrentName() throws IOException { return fieldName; }
        @Override public String getText() throws IOException { return text; }
        @Override public boolean hasCurrentToken() { return token != null; }
        @Override public JsonStreamContext getParsingContext() { return null; }
        @Override public JsonLocation getCurrentLocation() { return null; }
        @Override public JsonLocation getTokenLocation() { return null; }
        @Override public void skipChildren() throws IOException {}
        @Override public int getCurrentTokenId() { return 0; }
        @Override public boolean isExpectedStartArrayToken() { return false; }
        @Override public boolean isExpectedStartObjectToken() { return false; }
        @Override public boolean hasToken(JsonToken t) { return token == t; }
        @Override public boolean hasTokenId(int id) { return false; }
        @Override public void clearCurrentToken() {}
        @Override public JsonToken getLastClearedToken() { return null; }
        @Override public void overrideCurrentName(String name) {}
        @Override public boolean hasTextCharacters() { return false; }
        @Override public byte getByteValue() throws IOException { return 0; }
        @Override public short getShortValue() throws IOException { return 0; }
        @Override public int getIntValue() throws IOException { return 0; }
        @Override public long getLongValue() throws IOException { return 0; }
        @Override public float getFloatValue() throws IOException { return 0; }
        @Override public double getDoubleValue() throws IOException { return 0; }
        @Override public BigInteger getBigIntegerValue() throws IOException { return BigInteger.ZERO; }
        @Override public BigDecimal getDecimalValue() throws IOException { return BigDecimal.ZERO; }
        @Override public byte[] getBinaryValue(Base64Variant b64variant) throws IOException { return new byte[0]; }
        @Override public String getValueAsString() throws IOException { return ""; }
        @Override public String getValueAsString(String def) throws IOException { return def; }
        @Override public boolean getValueAsBoolean(boolean def) throws IOException { return def; }
        @Override public int getValueAsInt(int def) throws IOException { return def; }
        @Override public long getValueAsLong(long def) throws IOException { return def; }
        @Override public double getValueAsDouble(double def) throws IOException { return def; }
        @Override public Number getNumberValue() throws IOException { return 0; }
        @Override public NumberType getNumberType() throws IOException { return NumberType.INT; }
        @Override public int getTextLength() throws IOException { return 0; }
        @Override public char[] getTextCharacters() throws IOException { return new char[0]; }
        @Override public int getTextOffset() throws IOException { return 0; }
        @Override public Object getEmbeddedObject() throws IOException { return null; }
    }

    static class MockDeserializationContext extends DeserializationContext {
        protected MockDeserializationContext() {
            super(new DeserializerFactory() {
                @Override public JavaType mapAbstractType(DeserializationConfig config, JavaType type) { return type; }
                @Override public ValueInstantiator findValueInstantiator(DeserializationContext ctxt, JavaType type) { return null; }
                @Override public JsonDeserializer<Object> createBeanDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc) { return null; }
                @Override public JsonDeserializer<Object> buildBeanDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc) { return null; }
                @Override public JsonDeserializer<Object> createArrayDeserializer(DeserializationContext ctxt, ArrayType type, BeanDescription beanDesc) { return null; }
                @Override public JsonDeserializer<Object> createCollectionDeserializer(DeserializationContext ctxt, CollectionType type, BeanDescription beanDesc) { return null; }
                @Override public JsonDeserializer<Object> createMapDeserializer(DeserializationContext ctxt, MapType type, BeanDescription beanDesc) { return null; }
                @Override public JsonDeserializer<Object> createEnumDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc) { return null; }
                @Override public JsonDeserializer<Object> createTreeDeserializer(DeserializationConfig config, JavaType type, BeanDescription beanDesc) { return null; }
                @Override public JsonDeserializer<Object> createReferenceDeserializer(DeserializationContext ctxt, ReferenceType type, BeanDescription beanDesc) { return null; }
                @Override public TypeDeserializer findTypeDeserializer(DeserializationConfig config, JavaType baseType) { return null; }
            });
        }

        @Override
        public KeyDeserializer findKeyDeserializer(JavaType keyType, BeanProperty prop) {
            return new MockKeyDeserializer();
        }

        @Override
        public JsonDeserializer<Object> findContextualValueDeserializer(JavaType type, BeanProperty prop) {
            return new MockValueDeserializer();
        }

        @Override
        public JsonDeserializer<Object> handleSecondaryContextualization(JsonDeserializer<?> deser, BeanProperty prop) {
            return (JsonDeserializer<Object>) deser;
        }

        @Override
        public JsonMappingException mappingException(Class<?> cls) {
            return new JsonMappingException("mapping");
        }

        @Override
        public JsonMappingException instantiationException(Class<?> cls, String msg) {
            return new JsonMappingException("instantiation: " + msg);
        }

        @Override
        public AnnotationIntrospector getAnnotationIntrospector() {
            return null;
        }

        @Override
        public DeserializationConfig getConfig() {
            return null;
        }

        @Override
        public Object findInjectableValue(Object valueId, BeanProperty forProperty, Object beanInstance) {
            return null;
        }

        @Override
        public Class<?> getActiveView() { return null; }
        @Override public boolean canOverrideAccessModifiers() { return false; }
        @Override public boolean isEnabled(DeserializationFeature feature) { return false; }
        @Override public boolean hasValueDeserializerFor(JavaType type, AtomicReference<Throwable> cause) { return false; }
        @Override public JsonParser getParser() { return null; }
        @Override public int getAttribute(Object key) { return 0; }
        @Override public JsonDeserializer<?> findRootValueDeserializer(JavaType type) { return null; }
        @Override public JsonDeserializer<?> findNonContextualValueDeserializer(JavaType type) { return null; }
    }

    static class MockPropertyBasedCreator extends PropertyBasedCreator {
        MockPropertyBasedCreator() {
            super(null, null, null);
        }

        @Override
        public PropertyValueBuffer startBuilding(JsonParser jp, DeserializationContext ctxt, ObjectIdReader oir) {
            return new PropertyValueBuffer(jp, ctxt, 0, null);
        }

        @Override
        public SettableBeanProperty findCreatorProperty(String name) {
            return null; // not found in test
        }

        @Override
        public Object build(DeserializationContext ctxt, PropertyValueBuffer buffer) {
            return new HashMap<Object, Object>();
        }
    }

    static class UnresolvedForwardReference extends Exception {
        private static final long serialVersionUID = 1L;
        UnresolvedForwardReference(String msg) { super(msg); }
        public ReadableObjectId getRoid() { return new ReadableObjectId(null); }
    }
}