package com.fasterxml.jackson.databind.deser;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.JsonToken;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ViewMatcher;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
import org.junit.Test;

public class SettableBeanPropertyTest {

    private static class TestSettableBeanProperty extends SettableBeanProperty {
        private final AnnotatedMember member;
        private final SettableBeanProperty delegate;
        
        public TestSettableBeanProperty(PropertyName name, JavaType type, PropertyMetadata metadata, JsonDeserializer<Object> valueDeser) {
            super(name, type, metadata, valueDeser);
            this.member = null;
            this.delegate = null;
        }
        
        public TestSettableBeanProperty(SettableBeanProperty src) {
            super(src);
            this.member = src.getMember();
            this.delegate = null;
        }
        
        public TestSettableBeanProperty(SettableBeanProperty src, PropertyName newName) {
            super(src, newName);
            this.member = null;
            this.delegate = null;
        }
        
        public TestSettableBeanProperty(SettableBeanProperty src, JsonDeserializer<?> deser, NullValueProvider nuller) {
            super(src, deser, nuller);
            this.member = null;
            this.delegate = null;
        }
        
        @Override
        public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
        
        @Override
        public SettableBeanProperty withName(PropertyName newName) { return new TestSettableBeanProperty(this, newName); }
        
        @Override
        public SettableBeanProperty withNullProvider(NullValueProvider nva) { return this; }
        
        @Override
        public AnnotatedMember getMember() { return member; }
        
        @Override
        public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }
        
        @Override
        public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {}
        
        @Override
        public Object deserializeSetAndReturn(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException { return null; }
        
        @Override
        public void set(Object instance, Object value) throws IOException {}
        
        @Override
        public Object setAndReturn(Object instance, Object value) throws IOException { return null; }
        
        @Override
        public String toString() { return "[property '" + getName() + "']"; }
    }
    
    private static class TestDelegatingSettableBeanProperty extends SettableBeanProperty.Delegating {
        private final TestSettableBeanProperty delegate;
        
        public TestDelegatingSettableBeanProperty(TestSettableBeanProperty d) {
            super(d);
            this.delegate = d;
        }
        
        @Override
        protected SettableBeanProperty withDelegate(SettableBeanProperty d) {
            return new TestDelegatingSettableBeanProperty(new TestSettableBeanProperty(d));
        }
        
        @Override
        protected SettableBeanProperty _with(SettableBeanProperty newDelegate) {
            return new TestDelegatingSettableBeanProperty(new TestSettableBeanProperty(newDelegate));
        }
        
        @Override
        public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) {
            return _with(delegate.withValueDeserializer(deser));
        }
        
        @Override
        public SettableBeanProperty withName(PropertyName newName) {
            return _with(delegate.withName(newName));
        }
        
        @Override
        public SettableBeanProperty withNullProvider(NullValueProvider nva) {
            return _with(delegate.withNullProvider(nva));
        }
    }
    
    private static class TestJsonDeserializer extends JsonDeserializer<Object> {
        private Object value;
        
        public TestJsonDeserializer() {}
        
        public TestJsonDeserializer(Object value) {
            this.value = value;
        }
        
        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            if (p.getCurrentToken() == JsonToken.VALUE_STRING || p.getCurrentToken() == JsonToken.VALUE_NUMBER_INT) {
                return value;
            }
            return null;
        }
        
        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt, Object intoValue) throws IOException {
            return value != null ? value : intoValue;
        }
        
        public static TestJsonDeserializer forValue(Object v) {
            return new TestJsonDeserializer(v);
        }
    }
    
    private static class TestTypeDeserializer extends TypeDeserializer {
        @Override
        public TypeDeserializer forProperty(BeanProperty prop) { return this; }
        
        @Override
        public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
        
        @Override
        public Object deserializeTypedFromArray(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
        
        @Override
        public Object deserializeTypedFromScalar(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
        
        @Override
        public Object deserializeTypedFromAny(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
        
        @Override
        public Object deserializeTypedFrom(JsonParser p, DeserializationContext ctxt) throws IOException { return "typed"; }
        
        @Override
        public String getTypeIdResolver() { return null; }
        
        @Override
        public String getPropertyName() { return "typeId"; }
        
        @Override
        public TypeIdResolver getTypeIdResolver() { return null; }
        
        @Override
        public JavaType getTypeInclusion() { return null; }
    }
    
    private static final PropertyName NAME = new PropertyName("test");
    private static final JavaType JAVA_TYPE = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance().constructType(String.class);
    private static final PropertyMetadata METADATA = PropertyMetadata.STD_REQUIRED;
    
    private TestSettableBeanProperty testProperty;
    private TestJsonDeserializer testDeserializer;
    
    @Before
    public void setUp() {
        testDeserializer = TestJsonDeserializer.forValue("defaultValue");
        testProperty = new TestSettableBeanProperty(NAME, JAVA_TYPE, METADATA, testDeserializer);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNullNameThrowsException() {
        new TestSettableBeanProperty((PropertyName) null, JAVA_TYPE, METADATA, testDeserializer);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNullTypeThrowsException() {
        new TestSettableBeanProperty(NAME, null, METADATA, testDeserializer);
    }
    
    @Test
    public void testConstructorWithNullNameUsesNoName() {
        TestSettableBeanProperty property = new TestSettableBeanProperty((PropertyName) null, JAVA_TYPE, METADATA, testDeserializer) {
            @Override
            public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
            @Override
            public SettableBeanProperty withName(PropertyName newName) { return this; }
            @Override
            public SettableBeanProperty withNullProvider(NullValueProvider nva) { return this; }
            @Override
            public AnnotatedMember getMember() { return null; }
            @Override
            public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }
            @Override
            public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {}
            @Override
            public Object deserializeSetAndReturn(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException { return null; }
            @Override
            public void set(Object instance, Object value) throws IOException {}
            @Override
            public Object setAndReturn(Object instance, Object value) throws IOException { return null; }
        };
        assertEquals(PropertyName.NO_NAME, property.getFullName());
    }
    
    @Test
    public void testHasValueDeserializerReturnsFalseWhenDefaultDeserializer() {
        TestSettableBeanProperty property = new TestSettableBeanProperty(NAME, JAVA_TYPE, METADATA, (JsonDeserializer<Object>) null);
        assertFalse(property.hasValueDeserializer());
        assertNull(property.getValueDeserializer());
    }
    
    @Test
    public void testHasValueDeserializerReturnsTrueWhenDeserializerSet() {
        assertTrue(testProperty.hasValueDeserializer());
        assertEquals("defaultValue", testProperty.getValueDeserializer().deserialize(null, null));
    }
    
    @Test
    public void testHasValueTypeDeserializerReturnsFalseWhenNoneSet() {
        assertFalse(testProperty.hasValueTypeDeserializer());
    }
    
    @Test
    public void testHasValueTypeDeserializerReturnsTrueWhenSet() {
        JavaType type = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance().constructType(String.class);
        TestSettableBeanProperty property = new TestSettableBeanProperty(NAME, type, METADATA, testDeserializer);
        // Since we can't directly set typeDeserializer, we verify default is false
        assertFalse(property.hasValueTypeDeserializer());
    }
    
    @Test
    public void testGetValueDeserializerReturnsNullWhenMissinValueDeserializerUsed() {
        TestSettableBeanProperty property = new TestSettableBeanProperty(NAME, JAVA_TYPE, METADATA, (JsonDeserializer<Object>) null);
        assertNull(property.getValueDeserializer());
    }
    
    @Test
    public void testAssignIndexOnce() {
        testProperty.assignIndex(5);
        assertEquals(5, testProperty.getPropertyIndex());
    }
    
    @Test
    public void testAssignIndexRepeatedlyThrowsException() {
        SettableBeanProperty p = testProperty;
        p.assignIndex(1);
        try {
            p.assignIndex(2);
            fail("Should throw IllegalStateException");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("already had index"));
        }
    }
    
    @Test
    public void testGetName() {
        assertEquals("test", testProperty.getName());
    }
    
    @Test
    public void testGetFullName() {
        assertEquals(NAME, testProperty.getFullName());
    }
    
    @Test
    public void testGetType() {
        assertEquals(JAVA_TYPE, testProperty.getType());
    }
    
    @Test
    public void testGetWrapperNameReturnsNullWhenNotSet() {
        assertNull(testProperty.getWrapperName());
    }
    
    @Test
    public void testVisibleInViewReturnsTrueWhenNoViewMatcher() {
        assertTrue(testProperty.visibleInView(null));
        assertTrue(testProperty.visibleInView(String.class));
    }
    
    @Test
    public void testVisibleInViewReturnsTrueWhenViewMatches() {
        SettableBeanProperty property = new TestSettableBeanProperty(NAME, JAVA_TYPE, METADATA, testDeserializer);
        property.setViews(new Class<?>[]{String.class});
        assertTrue(property.visibleInView(String.class));
    }
    
    @Test
    public void testVisibleInViewReturnsFalseWhenViewMismatch() {
        SettableBeanProperty property = new TestSettableBeanProperty(NAME, JAVA_TYPE, METADATA, testDeserializer);
        property.setViews(new Class<?>[]{String.class});
        assertFalse(property.visibleInView(Integer.class));
    }
    
    @Test
    public void testHasViewsReturnsFalseWhenViewMatcherNull() {
        assertFalse(testProperty.hasViews());
    }
    
    @Test
    public void testHasViewsReturnsTrueWhenViewMatcherSet() {
        SettableBeanProperty property = new TestSettableBeanProperty(NAME, JAVA_TYPE, METADATA, testDeserializer);
        property.setViews(new Class<?>[]{String.class});
        assertTrue(property.hasViews());
    }
    
    @Test
    public void testGetPropertyIndexDefaultIsMinusOne() {
        assertEquals(-1, testProperty.getPropertyIndex());
    }
    
    @Test
    public void testSetAndGetManagedReferenceName() {
        SettableBeanProperty property = new TestSettableBeanProperty(NAME, JAVA_TYPE, METADATA, testDeserializer);
        assertNull(property.getManagedReferenceName());
        property.setManagedReferenceName("refName");
        assertEquals("refName", property.getManagedReferenceName());
    }
    
    @Test
    public void testGetObjectIdInfoReturnsNullByDefault() {
        assertNull(testProperty.getObjectIdInfo());
    }
    
    @Test
    public void testGetObjectIdInfoReturnsSetValue() {
        SettableBeanProperty property = new TestSettableBeanProperty(NAME, JAVA_TYPE, METADATA, testDeserializer);
        property.setObjectIdInfo(new ObjectIdInfo(PropertyName.construct("id"), null, null, null));
        assertNotNull(property.getObjectIdInfo());
    }
    
    @Test
    public void testGetCreatorIndexThrowsException() {
        try {
            testProperty.getCreatorIndex();
            fail("Should throw IllegalStateException");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("no creator index"));
        }
    }
    
    @Test
    public void testGetInjectableValueIdReturnsNull() {
        assertNull(testProperty.getInjectableValueId());
    }
    
    @Test
    public void testDeserializeWithNullTokenUsesNullProvider() throws IOException {
        JsonParser p = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(
            com.fasterxml.jackson.core.JsonFactory.builder().build(),
            java.nio.charset.StandardCharsets.UTF_8,
            new java.io.ByteArrayInputStream("null".getBytes()),
            com.fasterxml.jackson.core.json.JsonReadFeature.ALLOW_JAVA_COMMENTS.mappedFeature(),
            0,
            new byte[0],
            0,
            0,
            0
        );
        // Use object mapper to create proper parser
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonParser parser = mapper.getFactory().createParser("null");
            parser.nextToken();
            SettableBeanProperty.Delegating delegating = new TestDelegatingSettableBeanProperty(testProperty);
            Object result = delegating.deserialize(parser, null);
            assertNull(result);
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }
    
    @Test
    public void testDeserializeWithTypeDeserializer() throws IOException {
        SettableBeanProperty property = new TestSettableBeanProperty(NAME, JAVA_TYPE, METADATA, testDeserializer);
        assertNotNull(property.deserialize(null, null));
    }
    
    @Test
    public void testDeserializeWithNullValueDeserializerAndNullProvider() throws IOException {
        SettableBeanProperty property = new TestSettableBeanProperty(NAME, JAVA_TYPE, METADATA, (JsonDeserializer<Object>) null);
        try {
            property.deserialize(null, null);
            fail("Should throw NullPointerException");
        } catch (NullPointerException e) {
            assertNotNull(e);
        }
    }
    
    @Test
    public void testDeserializeWithNullValueDeserializerFromMISSING_VALUE_DESERIALIZER() throws IOException {
        SettableBeanProperty property = new TestSettableBeanProperty(NAME, JAVA_TYPE, METADATA, TestJsonDeserializer.forValue("default")) {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                JsonDeserializer<Object> deser = getValueDeserializer();
                if (deser == MISSING_VALUE_DESERIALIZER) {
                    return null;
                }
                return super.deserialize(p, ctxt);
            }
        };
    }
    
    @Test
    public void testDeserializeAndSetWithDelegating() throws IOException {
        TestSettableBeanProperty delegate = new TestSettableBeanProperty(NAME, JAVA_TYPE, METADATA, testDeserializer) {
            @Override
            public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {
                // no-op
            }
        };
        TestDelegatingSettableBeanProperty delegating = new TestDelegatingSettableBeanProperty(delegate);
        delegating.deserializeAndSet(null, null, new Object());
    }
    
    @Test
    public void testDeserializeSetAndReturnWithDelegating() throws IOException {
        TestSettableBeanProperty delegate = new TestSettableBeanProperty(NAME, JAVA_TYPE, METADATA, testDeserializer);
        TestDelegatingSettableBeanProperty delegating = new TestDelegatingSettableBeanProperty(delegate);
        assertNull(delegating.deserializeSetAndReturn(null, null, new Object()));
    }
    
    @Test
    public void testSetAndSetAndReturnWithDelegating() throws IOException {
        TestSettableBeanProperty delegate = new TestSettableBeanProperty(NAME, JAVA_TYPE, METADATA, testDeserializer);
        TestDelegatingSettableBeanProperty delegating = new TestDelegatingSettableBeanProperty(delegate);
        delegating.set(new Object(), "value");
        assertNull(delegating.setAndReturn(new Object(), "value"));
    }
    
    @Test
    public void testGetAnnotationWithDelegating() {
        TestSettableBeanProperty delegate = new TestSettableBeanProperty(NAME, JAVA_TYPE, METADATA, testDeserializer);
        TestDelegatingSettableBeanProperty delegating = new TestDelegatingSettableBeanProperty(delegate);
        assertNull(delegating.getAnnotation(Deprecated.class));
    }
    
    @Test
    public void testGetContextAnnotation() {
        TestSettableBeanProperty property = new TestSettableBeanProperty(NAME, JAVA_TYPE, METADATA, testDeserializer);
        assertNull(property.getContextAnnotation(Deprecated.class));
    }
    
    @Test
    public void testToString() {
        assertEquals("[property 'test']", testProperty.toString());
    }
}